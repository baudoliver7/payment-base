package io.surati.gap.payment.db;

import javax.sql.DataSource;

public final class DbBillOfExchange extends DbAbstractBankNote {

	public DbBillOfExchange(DataSource source, Long id) {
		super(source, id);
	}

}
