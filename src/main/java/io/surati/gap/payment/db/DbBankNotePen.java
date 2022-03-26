package io.surati.gap.payment.db;

import com.baudoliver7.fr.FrIntegerInLetters;
import com.jcabi.jdbc.JdbcSession;
import com.jcabi.jdbc.Outcome;
import com.jcabi.jdbc.SingleOutcome;
import io.surati.gap.admin.api.Company;
import io.surati.gap.admin.api.User;
import io.surati.gap.admin.prop.PropCompany;
import io.surati.gap.database.utils.exceptions.DatabaseException;
import io.surati.gap.payment.api.BankNote;
import io.surati.gap.payment.api.BankNoteBook;
import io.surati.gap.payment.api.BankNotePen;
import io.surati.gap.payment.api.PaymentOrderGroup;
import io.surati.gap.payment.api.PaymentStatus;
import io.surati.gap.payment.api.ThirdParty;
import org.apache.commons.lang.StringUtils;
import org.cactoos.text.Joined;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.time.LocalDate;

public final class DbBankNotePen implements BankNotePen {

	private final DataSource source;
	
	private final BankNoteBook book;
	
	private final PaymentOrderGroup orders;
	
	private final ThirdParty beneficiary;
	
	private final LocalDate date;
	
	private final LocalDate duedate;
	
	private final String mention1;
	
	private final String mention2;
	
	private final User author;

	public DbBankNotePen(
		final DataSource source,
		final BankNoteBook book,
		final PaymentOrderGroup orders,
		final LocalDate date,
		final String mention1,
		final String mention2,
		final LocalDate duedate,
		final User author
	) {
		this.source = source;
		this.book = book;
		this.orders = orders;
		this.beneficiary = orders.beneficiary();
		this.date = date;
		this.mention1 = mention1;
		this.mention2 = mention2;
		this.duedate = duedate;
		this.author = author;
	}

	@Override
	public BankNote write() {
		final Double amount = this.orders.totalAmount();
		if(this.orders.totalAmount() <= 0) {
			throw new IllegalArgumentException(String.format("Le cumul des montants à payer doit être supérieur à 0 ! Il est actuellement de %s.", new FrIntegerInLetters(amount.longValue())));
		}
		final String number = this.book.takeCurrentNumber();
		try {
			final Long payid = new JdbcSession(this.source)
				.sql(
					new Joined(
						" ",
						"INSERT INTO payment",
						"(internal_reference, issuer_reference, beneficiary_id, amount, date, edition_place, mention_1, mention_2, status_id, author_id, group_id, issuer_id, mean_type_id)",
						"VALUES",
						"(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
					).toString()
				)
				.set(this.generateReference())
				.set(number)
				.set(this.beneficiary.id())
				.set(this.orders.totalAmount())
				.set(java.sql.Date.valueOf(this.date))
				.set(new PropCompany().city())
				.set(this.mention1)
				.set(this.mention2)
				.set(PaymentStatus.TO_PRINT.name())
				.set(this.author.id())
				.set(this.orders.id())
				.set(this.book.account().bank().id())
				.set(this.book.meanType().name())
				.insert(new SingleOutcome<>(Long.class));
			new JdbcSession(this.source)
				.sql(
					new Joined(
						" ",
						"INSERT INTO bank_note",
						"(id, book_id, due_date)",
						"VALUES",
						"(?, ?, ?)"
					).toString()
				)
				.set(payid)
				.set(this.book.id())
				.set(this.duedate == null ? null : java.sql.Date.valueOf(this.duedate))
				.insert(Outcome.VOID);
	        final BankNote note = new DbBankNote(this.source, payid);
	        this.orders.execute();
	        if(!this.book.hasNextNote()) {
		    	this.book.terminate();
		    }
	        return note;
	    } catch (SQLException ex) {
	        throw new DatabaseException(ex);
	    }
	}

	private BankNote lastNote() {
		try {
			final boolean hasany = new JdbcSession(this.source)
				.sql("SELECT COUNT(*) FROM bank_note")
				.select(new SingleOutcome<>(Long.class)) > 0;
			if(hasany) {
				return new DbBankNote(
					this.source,
					new JdbcSession(this.source)
						.sql("SELECT id FROM bank_note order by id DESC limit 1")
						.select(new SingleOutcome<>(Long.class))
				);
			} else {
				return BankNote.EMPTY;
			}
		} catch(SQLException ex) {
			throw new DatabaseException(ex);
		}
	}
	
	private String generateReference() {
		final Company company = new PropCompany();
		final BankNote last = this.lastNote();
		final LocalDate today = LocalDate.now();
		final LocalDate date;
		final Long nextnumber;
		if(last == BankNote.EMPTY) {
			date = today;
			nextnumber = 1L;
		} else {
			final LocalDate lastdate = last.date();
			if(lastdate.getYear() != today.getYear()) {
				date = today;
				nextnumber = 1L;
			} else {
				date = lastdate;
				nextnumber = Long.parseLong(company.parameter("paymentcurrnum")) + 1;
			}
		}
		company.parameter("paymentcurrnum", nextnumber.toString());
		return String.format(
			"PAY/%s/%s",
			date.getYear(),
			StringUtils.leftPad(Long.toString(nextnumber), 4, "0")
		);
	}
}
