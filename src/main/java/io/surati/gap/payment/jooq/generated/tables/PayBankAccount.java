/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables;


import io.surati.gap.payment.jooq.generated.Keys;
import io.surati.gap.payment.jooq.generated.Public;
import io.surati.gap.payment.jooq.generated.tables.records.PayBankAccountRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayBankAccount extends TableImpl<PayBankAccountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.pay_bank_account</code>
     */
    public static final PayBankAccount PAY_BANK_ACCOUNT = new PayBankAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayBankAccountRecord> getRecordType() {
        return PayBankAccountRecord.class;
    }

    /**
     * The column <code>public.pay_bank_account.id</code>.
     */
    public final TableField<PayBankAccountRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.pay_bank_account.branch_code</code>.
     */
    public final TableField<PayBankAccountRecord, String> BRANCH_CODE = createField(DSL.name("branch_code"), SQLDataType.VARCHAR(5).nullable(false), this, "");

    /**
     * The column <code>public.pay_bank_account.number</code>.
     */
    public final TableField<PayBankAccountRecord, String> NUMBER = createField(DSL.name("number"), SQLDataType.VARCHAR(12).nullable(false), this, "");

    /**
     * The column <code>public.pay_bank_account.key</code>.
     */
    public final TableField<PayBankAccountRecord, String> KEY = createField(DSL.name("key"), SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>public.pay_bank_account.bank_id</code>.
     */
    public final TableField<PayBankAccountRecord, Long> BANK_ID = createField(DSL.name("bank_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.pay_bank_account.holder_id</code>.
     */
    public final TableField<PayBankAccountRecord, Long> HOLDER_ID = createField(DSL.name("holder_id"), SQLDataType.BIGINT, this, "");

    private PayBankAccount(Name alias, Table<PayBankAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayBankAccount(Name alias, Table<PayBankAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.pay_bank_account</code> table reference
     */
    public PayBankAccount(String alias) {
        this(DSL.name(alias), PAY_BANK_ACCOUNT);
    }

    /**
     * Create an aliased <code>public.pay_bank_account</code> table reference
     */
    public PayBankAccount(Name alias) {
        this(alias, PAY_BANK_ACCOUNT);
    }

    /**
     * Create a <code>public.pay_bank_account</code> table reference
     */
    public PayBankAccount() {
        this(DSL.name("pay_bank_account"), null);
    }

    public <O extends Record> PayBankAccount(Table<O> child, ForeignKey<O, PayBankAccountRecord> key) {
        super(child, key, PAY_BANK_ACCOUNT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<PayBankAccountRecord, Long> getIdentity() {
        return (Identity<PayBankAccountRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PayBankAccountRecord> getPrimaryKey() {
        return Keys.PAY_BANK_ACCOUNT_PKEY;
    }

    @Override
    public List<UniqueKey<PayBankAccountRecord>> getKeys() {
        return Arrays.<UniqueKey<PayBankAccountRecord>>asList(Keys.PAY_BANK_ACCOUNT_PKEY);
    }

    @Override
    public List<ForeignKey<PayBankAccountRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PayBankAccountRecord, ?>>asList(Keys.PAY_BANK_ACCOUNT_BANK_ID_FKEY, Keys.PAY_BANK_ACCOUNT_HOLDER_ID_FKEY);
    }

    private transient PayBank _payBank;
    private transient PayThirdParty _payThirdParty;

    public PayBank payBank() {
        if (_payBank == null)
            _payBank = new PayBank(this, Keys.PAY_BANK_ACCOUNT_BANK_ID_FKEY);

        return _payBank;
    }

    public PayThirdParty payThirdParty() {
        if (_payThirdParty == null)
            _payThirdParty = new PayThirdParty(this, Keys.PAY_BANK_ACCOUNT_HOLDER_ID_FKEY);

        return _payThirdParty;
    }

    @Override
    public PayBankAccount as(String alias) {
        return new PayBankAccount(DSL.name(alias), this);
    }

    @Override
    public PayBankAccount as(Name alias) {
        return new PayBankAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayBankAccount rename(String name) {
        return new PayBankAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PayBankAccount rename(Name name) {
        return new PayBankAccount(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}