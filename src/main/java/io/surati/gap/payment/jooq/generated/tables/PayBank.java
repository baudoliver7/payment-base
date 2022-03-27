/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables;


import io.surati.gap.payment.jooq.generated.Keys;
import io.surati.gap.payment.jooq.generated.Public;
import io.surati.gap.payment.jooq.generated.tables.records.PayBankRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class PayBank extends TableImpl<PayBankRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.pay_bank</code>
     */
    public static final PayBank PAY_BANK = new PayBank();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayBankRecord> getRecordType() {
        return PayBankRecord.class;
    }

    /**
     * The column <code>public.pay_bank.id</code>.
     */
    public final TableField<PayBankRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.pay_bank.representative</code>.
     */
    public final TableField<PayBankRecord, String> REPRESENTATIVE = createField(DSL.name("representative"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.pay_bank.representative_position</code>.
     */
    public final TableField<PayBankRecord, String> REPRESENTATIVE_POSITION = createField(DSL.name("representative_position"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.pay_bank.representative_civility</code>.
     */
    public final TableField<PayBankRecord, String> REPRESENTATIVE_CIVILITY = createField(DSL.name("representative_civility"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>public.pay_bank.headquarters</code>.
     */
    public final TableField<PayBankRecord, String> HEADQUARTERS = createField(DSL.name("headquarters"), SQLDataType.VARCHAR(50), this, "");

    private PayBank(Name alias, Table<PayBankRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayBank(Name alias, Table<PayBankRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.pay_bank</code> table reference
     */
    public PayBank(String alias) {
        this(DSL.name(alias), PAY_BANK);
    }

    /**
     * Create an aliased <code>public.pay_bank</code> table reference
     */
    public PayBank(Name alias) {
        this(alias, PAY_BANK);
    }

    /**
     * Create a <code>public.pay_bank</code> table reference
     */
    public PayBank() {
        this(DSL.name("pay_bank"), null);
    }

    public <O extends Record> PayBank(Table<O> child, ForeignKey<O, PayBankRecord> key) {
        super(child, key, PAY_BANK);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<PayBankRecord> getPrimaryKey() {
        return Keys.PAY_BANK_PKEY;
    }

    @Override
    public List<UniqueKey<PayBankRecord>> getKeys() {
        return Arrays.<UniqueKey<PayBankRecord>>asList(Keys.PAY_BANK_PKEY);
    }

    @Override
    public List<ForeignKey<PayBankRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PayBankRecord, ?>>asList(Keys.PAY_BANK_ID_FKEY);
    }

    private transient PayThirdParty _payThirdParty;

    public PayThirdParty payThirdParty() {
        if (_payThirdParty == null)
            _payThirdParty = new PayThirdParty(this, Keys.PAY_BANK_ID_FKEY);

        return _payThirdParty;
    }

    @Override
    public PayBank as(String alias) {
        return new PayBank(DSL.name(alias), this);
    }

    @Override
    public PayBank as(Name alias) {
        return new PayBank(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayBank rename(String name) {
        return new PayBank(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PayBank rename(Name name) {
        return new PayBank(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}