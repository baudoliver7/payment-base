/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables.records;


import io.surati.gap.payment.jooq.generated.tables.PayThirdParty;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayThirdPartyRecord extends UpdatableRecordImpl<PayThirdPartyRecord> implements Record5<Long, String, String, Long, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.pay_third_party.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pay_third_party.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.pay_third_party.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pay_third_party.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.pay_third_party.abbreviated</code>.
     */
    public void setAbbreviated(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pay_third_party.abbreviated</code>.
     */
    public String getAbbreviated() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.pay_third_party.family_id</code>.
     */
    public void setFamilyId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.pay_third_party.family_id</code>.
     */
    public Long getFamilyId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.pay_third_party.payment_deadline</code>.
     */
    public void setPaymentDeadline(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.pay_third_party.payment_deadline</code>.
     */
    public Short getPaymentDeadline() {
        return (Short) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, Long, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, String, Long, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PayThirdParty.PAY_THIRD_PARTY.ID;
    }

    @Override
    public Field<String> field2() {
        return PayThirdParty.PAY_THIRD_PARTY.CODE;
    }

    @Override
    public Field<String> field3() {
        return PayThirdParty.PAY_THIRD_PARTY.ABBREVIATED;
    }

    @Override
    public Field<Long> field4() {
        return PayThirdParty.PAY_THIRD_PARTY.FAMILY_ID;
    }

    @Override
    public Field<Short> field5() {
        return PayThirdParty.PAY_THIRD_PARTY.PAYMENT_DEADLINE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getAbbreviated();
    }

    @Override
    public Long component4() {
        return getFamilyId();
    }

    @Override
    public Short component5() {
        return getPaymentDeadline();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getAbbreviated();
    }

    @Override
    public Long value4() {
        return getFamilyId();
    }

    @Override
    public Short value5() {
        return getPaymentDeadline();
    }

    @Override
    public PayThirdPartyRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PayThirdPartyRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public PayThirdPartyRecord value3(String value) {
        setAbbreviated(value);
        return this;
    }

    @Override
    public PayThirdPartyRecord value4(Long value) {
        setFamilyId(value);
        return this;
    }

    @Override
    public PayThirdPartyRecord value5(Short value) {
        setPaymentDeadline(value);
        return this;
    }

    @Override
    public PayThirdPartyRecord values(Long value1, String value2, String value3, Long value4, Short value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayThirdPartyRecord
     */
    public PayThirdPartyRecord() {
        super(PayThirdParty.PAY_THIRD_PARTY);
    }

    /**
     * Create a detached, initialised PayThirdPartyRecord
     */
    public PayThirdPartyRecord(Long id, String code, String abbreviated, Long familyId, Short paymentDeadline) {
        super(PayThirdParty.PAY_THIRD_PARTY);

        setId(id);
        setCode(code);
        setAbbreviated(abbreviated);
        setFamilyId(familyId);
        setPaymentDeadline(paymentDeadline);
    }
}