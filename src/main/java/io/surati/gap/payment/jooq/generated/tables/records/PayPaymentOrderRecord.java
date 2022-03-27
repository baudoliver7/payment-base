/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables.records;


import io.surati.gap.payment.jooq.generated.tables.PayPaymentOrder;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayPaymentOrderRecord extends UpdatableRecordImpl<PayPaymentOrderRecord> implements Record12<Long, LocalDate, String, Long, Double, Long, Long, String, Long, Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.pay_payment_order.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.pay_payment_order.date</code>.
     */
    public void setDate(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>public.pay_payment_order.reference</code>.
     */
    public void setReference(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.reference</code>.
     */
    public String getReference() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.pay_payment_order.beneficiary_id</code>.
     */
    public void setBeneficiaryId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.beneficiary_id</code>.
     */
    public Long getBeneficiaryId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.pay_payment_order.amount_to_pay</code>.
     */
    public void setAmountToPay(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.amount_to_pay</code>.
     */
    public Double getAmountToPay() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.pay_payment_order.reference_document_id</code>.
     */
    public void setReferenceDocumentId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.reference_document_id</code>.
     */
    public Long getReferenceDocumentId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.pay_payment_order.authorizing_officer_id</code>.
     */
    public void setAuthorizingOfficerId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.authorizing_officer_id</code>.
     */
    public Long getAuthorizingOfficerId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>public.pay_payment_order.status_id</code>.
     */
    public void setStatusId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.status_id</code>.
     */
    public String getStatusId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.pay_payment_order.author_id</code>.
     */
    public void setAuthorId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.author_id</code>.
     */
    public Long getAuthorId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.pay_payment_order.group_id</code>.
     */
    public void setGroupId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.group_id</code>.
     */
    public Long getGroupId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.pay_payment_order.reason</code>.
     */
    public void setReason(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.reason</code>.
     */
    public String getReason() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.pay_payment_order.description</code>.
     */
    public void setDescription(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.pay_payment_order.description</code>.
     */
    public String getDescription() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, LocalDate, String, Long, Double, Long, Long, String, Long, Long, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, LocalDate, String, Long, Double, Long, Long, String, Long, Long, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.ID;
    }

    @Override
    public Field<LocalDate> field2() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.DATE;
    }

    @Override
    public Field<String> field3() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.REFERENCE;
    }

    @Override
    public Field<Long> field4() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.BENEFICIARY_ID;
    }

    @Override
    public Field<Double> field5() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.AMOUNT_TO_PAY;
    }

    @Override
    public Field<Long> field6() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.REFERENCE_DOCUMENT_ID;
    }

    @Override
    public Field<Long> field7() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.AUTHORIZING_OFFICER_ID;
    }

    @Override
    public Field<String> field8() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.STATUS_ID;
    }

    @Override
    public Field<Long> field9() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.AUTHOR_ID;
    }

    @Override
    public Field<Long> field10() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.GROUP_ID;
    }

    @Override
    public Field<String> field11() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.REASON;
    }

    @Override
    public Field<String> field12() {
        return PayPaymentOrder.PAY_PAYMENT_ORDER.DESCRIPTION;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDate component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getReference();
    }

    @Override
    public Long component4() {
        return getBeneficiaryId();
    }

    @Override
    public Double component5() {
        return getAmountToPay();
    }

    @Override
    public Long component6() {
        return getReferenceDocumentId();
    }

    @Override
    public Long component7() {
        return getAuthorizingOfficerId();
    }

    @Override
    public String component8() {
        return getStatusId();
    }

    @Override
    public Long component9() {
        return getAuthorId();
    }

    @Override
    public Long component10() {
        return getGroupId();
    }

    @Override
    public String component11() {
        return getReason();
    }

    @Override
    public String component12() {
        return getDescription();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDate value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getReference();
    }

    @Override
    public Long value4() {
        return getBeneficiaryId();
    }

    @Override
    public Double value5() {
        return getAmountToPay();
    }

    @Override
    public Long value6() {
        return getReferenceDocumentId();
    }

    @Override
    public Long value7() {
        return getAuthorizingOfficerId();
    }

    @Override
    public String value8() {
        return getStatusId();
    }

    @Override
    public Long value9() {
        return getAuthorId();
    }

    @Override
    public Long value10() {
        return getGroupId();
    }

    @Override
    public String value11() {
        return getReason();
    }

    @Override
    public String value12() {
        return getDescription();
    }

    @Override
    public PayPaymentOrderRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value2(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value3(String value) {
        setReference(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value4(Long value) {
        setBeneficiaryId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value5(Double value) {
        setAmountToPay(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value6(Long value) {
        setReferenceDocumentId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value7(Long value) {
        setAuthorizingOfficerId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value8(String value) {
        setStatusId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value9(Long value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value10(Long value) {
        setGroupId(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value11(String value) {
        setReason(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord value12(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public PayPaymentOrderRecord values(Long value1, LocalDate value2, String value3, Long value4, Double value5, Long value6, Long value7, String value8, Long value9, Long value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayPaymentOrderRecord
     */
    public PayPaymentOrderRecord() {
        super(PayPaymentOrder.PAY_PAYMENT_ORDER);
    }

    /**
     * Create a detached, initialised PayPaymentOrderRecord
     */
    public PayPaymentOrderRecord(Long id, LocalDate date, String reference, Long beneficiaryId, Double amountToPay, Long referenceDocumentId, Long authorizingOfficerId, String statusId, Long authorId, Long groupId, String reason, String description) {
        super(PayPaymentOrder.PAY_PAYMENT_ORDER);

        setId(id);
        setDate(date);
        setReference(reference);
        setBeneficiaryId(beneficiaryId);
        setAmountToPay(amountToPay);
        setReferenceDocumentId(referenceDocumentId);
        setAuthorizingOfficerId(authorizingOfficerId);
        setStatusId(statusId);
        setAuthorId(authorId);
        setGroupId(groupId);
        setReason(reason);
        setDescription(description);
    }
}