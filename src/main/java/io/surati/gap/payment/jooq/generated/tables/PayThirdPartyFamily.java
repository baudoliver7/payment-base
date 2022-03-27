/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables;


import io.surati.gap.payment.jooq.generated.Keys;
import io.surati.gap.payment.jooq.generated.Public;
import io.surati.gap.payment.jooq.generated.tables.records.PayThirdPartyFamilyRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class PayThirdPartyFamily extends TableImpl<PayThirdPartyFamilyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.pay_third_party_family</code>
     */
    public static final PayThirdPartyFamily PAY_THIRD_PARTY_FAMILY = new PayThirdPartyFamily();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayThirdPartyFamilyRecord> getRecordType() {
        return PayThirdPartyFamilyRecord.class;
    }

    /**
     * The column <code>public.pay_third_party_family.id</code>.
     */
    public final TableField<PayThirdPartyFamilyRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.pay_third_party_family.code</code>.
     */
    public final TableField<PayThirdPartyFamilyRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.pay_third_party_family.name</code>.
     */
    public final TableField<PayThirdPartyFamilyRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    private PayThirdPartyFamily(Name alias, Table<PayThirdPartyFamilyRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayThirdPartyFamily(Name alias, Table<PayThirdPartyFamilyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.pay_third_party_family</code> table reference
     */
    public PayThirdPartyFamily(String alias) {
        this(DSL.name(alias), PAY_THIRD_PARTY_FAMILY);
    }

    /**
     * Create an aliased <code>public.pay_third_party_family</code> table reference
     */
    public PayThirdPartyFamily(Name alias) {
        this(alias, PAY_THIRD_PARTY_FAMILY);
    }

    /**
     * Create a <code>public.pay_third_party_family</code> table reference
     */
    public PayThirdPartyFamily() {
        this(DSL.name("pay_third_party_family"), null);
    }

    public <O extends Record> PayThirdPartyFamily(Table<O> child, ForeignKey<O, PayThirdPartyFamilyRecord> key) {
        super(child, key, PAY_THIRD_PARTY_FAMILY);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<PayThirdPartyFamilyRecord, Long> getIdentity() {
        return (Identity<PayThirdPartyFamilyRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PayThirdPartyFamilyRecord> getPrimaryKey() {
        return Keys.PAY_THIRD_PARTY_FAMILY_PKEY;
    }

    @Override
    public List<UniqueKey<PayThirdPartyFamilyRecord>> getKeys() {
        return Arrays.<UniqueKey<PayThirdPartyFamilyRecord>>asList(Keys.PAY_THIRD_PARTY_FAMILY_PKEY, Keys.PAY_THIRD_PARTY_FAMILY_CODE_KEY);
    }

    @Override
    public PayThirdPartyFamily as(String alias) {
        return new PayThirdPartyFamily(DSL.name(alias), this);
    }

    @Override
    public PayThirdPartyFamily as(Name alias) {
        return new PayThirdPartyFamily(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayThirdPartyFamily rename(String name) {
        return new PayThirdPartyFamily(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PayThirdPartyFamily rename(Name name) {
        return new PayThirdPartyFamily(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}