/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables;


import io.surati.gap.payment.jooq.generated.Keys;
import io.surati.gap.payment.jooq.generated.Public;
import io.surati.gap.payment.jooq.generated.tables.records.PayPaymentOrderGroupRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class PayPaymentOrderGroup extends TableImpl<PayPaymentOrderGroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.pay_payment_order_group</code>
     */
    public static final PayPaymentOrderGroup PAY_PAYMENT_ORDER_GROUP = new PayPaymentOrderGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayPaymentOrderGroupRecord> getRecordType() {
        return PayPaymentOrderGroupRecord.class;
    }

    /**
     * The column <code>public.pay_payment_order_group.id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.pay_payment_order_group.third_party_id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, Long> THIRD_PARTY_ID = createField(DSL.name("third_party_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.pay_payment_order_group.account_id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, Long> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.pay_payment_order_group.status_id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, String> STATUS_ID = createField(DSL.name("status_id"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.pay_payment_order_group.mean_type_id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, String> MEAN_TYPE_ID = createField(DSL.name("mean_type_id"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.pay_payment_order_group.due_date</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, LocalDate> DUE_DATE = createField(DSL.name("due_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.pay_payment_order_group.author_id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, Long> AUTHOR_ID = createField(DSL.name("author_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.pay_payment_order_group.worker_id</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, Long> WORKER_ID = createField(DSL.name("worker_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.pay_payment_order_group.is_hetero</code>.
     */
    public final TableField<PayPaymentOrderGroupRecord, Boolean> IS_HETERO = createField(DSL.name("is_hetero"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field("FALSE", SQLDataType.BOOLEAN)), this, "");

    private PayPaymentOrderGroup(Name alias, Table<PayPaymentOrderGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayPaymentOrderGroup(Name alias, Table<PayPaymentOrderGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.pay_payment_order_group</code> table reference
     */
    public PayPaymentOrderGroup(String alias) {
        this(DSL.name(alias), PAY_PAYMENT_ORDER_GROUP);
    }

    /**
     * Create an aliased <code>public.pay_payment_order_group</code> table reference
     */
    public PayPaymentOrderGroup(Name alias) {
        this(alias, PAY_PAYMENT_ORDER_GROUP);
    }

    /**
     * Create a <code>public.pay_payment_order_group</code> table reference
     */
    public PayPaymentOrderGroup() {
        this(DSL.name("pay_payment_order_group"), null);
    }

    public <O extends Record> PayPaymentOrderGroup(Table<O> child, ForeignKey<O, PayPaymentOrderGroupRecord> key) {
        super(child, key, PAY_PAYMENT_ORDER_GROUP);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<PayPaymentOrderGroupRecord, Long> getIdentity() {
        return (Identity<PayPaymentOrderGroupRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PayPaymentOrderGroupRecord> getPrimaryKey() {
        return Keys.PAY_PAYMENT_ORDER_GROUP_PKEY;
    }

    @Override
    public List<UniqueKey<PayPaymentOrderGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<PayPaymentOrderGroupRecord>>asList(Keys.PAY_PAYMENT_ORDER_GROUP_PKEY);
    }

    @Override
    public List<ForeignKey<PayPaymentOrderGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PayPaymentOrderGroupRecord, ?>>asList(Keys.PAY_PAYMENT_ORDER_GROUP_THIRD_PARTY_ID_FKEY, Keys.PAY_PAYMENT_ORDER_GROUP_ACCOUNT_ID_FKEY);
    }

    private transient PayThirdParty _payThirdParty;
    private transient PayBankAccount _payBankAccount;

    public PayThirdParty payThirdParty() {
        if (_payThirdParty == null)
            _payThirdParty = new PayThirdParty(this, Keys.PAY_PAYMENT_ORDER_GROUP_THIRD_PARTY_ID_FKEY);

        return _payThirdParty;
    }

    public PayBankAccount payBankAccount() {
        if (_payBankAccount == null)
            _payBankAccount = new PayBankAccount(this, Keys.PAY_PAYMENT_ORDER_GROUP_ACCOUNT_ID_FKEY);

        return _payBankAccount;
    }

    @Override
    public PayPaymentOrderGroup as(String alias) {
        return new PayPaymentOrderGroup(DSL.name(alias), this);
    }

    @Override
    public PayPaymentOrderGroup as(Name alias) {
        return new PayPaymentOrderGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayPaymentOrderGroup rename(String name) {
        return new PayPaymentOrderGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PayPaymentOrderGroup rename(Name name) {
        return new PayPaymentOrderGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, String, String, LocalDate, Long, Long, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}