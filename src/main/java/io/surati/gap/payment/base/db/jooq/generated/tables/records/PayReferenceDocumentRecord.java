/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.base.db.jooq.generated.tables.records;


import io.surati.gap.payment.base.db.jooq.generated.tables.PayReferenceDocument;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayReferenceDocumentRecord extends UpdatableRecordImpl<PayReferenceDocumentRecord> implements Record14<Long, String, LocalDate, String, String, String, String, Double, LocalDate, LocalDate, Long, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.pay_reference_document.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.pay_reference_document.type_id</code>.
     */
    public void setTypeId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.type_id</code>.
     */
    public String getTypeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.pay_reference_document.date</code>.
     */
    public void setDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>public.pay_reference_document.reference</code>.
     */
    public void setReference(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.reference</code>.
     */
    public String getReference() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.pay_reference_document.internal_reference</code>.
     */
    public void setInternalReference(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.internal_reference</code>.
     */
    public String getInternalReference() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.pay_reference_document.object</code>.
     */
    public void setObject(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.object</code>.
     */
    public String getObject() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.pay_reference_document.place</code>.
     */
    public void setPlace(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.place</code>.
     */
    public String getPlace() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.pay_reference_document.amount</code>.
     */
    public void setAmount(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.amount</code>.
     */
    public Double getAmount() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>public.pay_reference_document.deposit_date</code>.
     */
    public void setDepositDate(LocalDate value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.deposit_date</code>.
     */
    public LocalDate getDepositDate() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>public.pay_reference_document.entry_date</code>.
     */
    public void setEntryDate(LocalDate value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.entry_date</code>.
     */
    public LocalDate getEntryDate() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for <code>public.pay_reference_document.beneficiary_id</code>.
     */
    public void setBeneficiaryId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.beneficiary_id</code>.
     */
    public Long getBeneficiaryId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>public.pay_reference_document.step_id</code>.
     */
    public void setStepId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.step_id</code>.
     */
    public String getStepId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.pay_reference_document.author_id</code>.
     */
    public void setAuthorId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.author_id</code>.
     */
    public Long getAuthorId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>public.pay_reference_document.worker_id</code>.
     */
    public void setWorkerId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.pay_reference_document.worker_id</code>.
     */
    public Long getWorkerId() {
        return (Long) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, String, LocalDate, String, String, String, String, Double, LocalDate, LocalDate, Long, String, Long, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, String, LocalDate, String, String, String, String, Double, LocalDate, LocalDate, Long, String, Long, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.ID;
    }

    @Override
    public Field<String> field2() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.TYPE_ID;
    }

    @Override
    public Field<LocalDate> field3() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.DATE;
    }

    @Override
    public Field<String> field4() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.REFERENCE;
    }

    @Override
    public Field<String> field5() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.INTERNAL_REFERENCE;
    }

    @Override
    public Field<String> field6() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.OBJECT;
    }

    @Override
    public Field<String> field7() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.PLACE;
    }

    @Override
    public Field<Double> field8() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.AMOUNT;
    }

    @Override
    public Field<LocalDate> field9() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.DEPOSIT_DATE;
    }

    @Override
    public Field<LocalDate> field10() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.ENTRY_DATE;
    }

    @Override
    public Field<Long> field11() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.BENEFICIARY_ID;
    }

    @Override
    public Field<String> field12() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.STEP_ID;
    }

    @Override
    public Field<Long> field13() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.AUTHOR_ID;
    }

    @Override
    public Field<Long> field14() {
        return PayReferenceDocument.PAY_REFERENCE_DOCUMENT.WORKER_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTypeId();
    }

    @Override
    public LocalDate component3() {
        return getDate();
    }

    @Override
    public String component4() {
        return getReference();
    }

    @Override
    public String component5() {
        return getInternalReference();
    }

    @Override
    public String component6() {
        return getObject();
    }

    @Override
    public String component7() {
        return getPlace();
    }

    @Override
    public Double component8() {
        return getAmount();
    }

    @Override
    public LocalDate component9() {
        return getDepositDate();
    }

    @Override
    public LocalDate component10() {
        return getEntryDate();
    }

    @Override
    public Long component11() {
        return getBeneficiaryId();
    }

    @Override
    public String component12() {
        return getStepId();
    }

    @Override
    public Long component13() {
        return getAuthorId();
    }

    @Override
    public Long component14() {
        return getWorkerId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTypeId();
    }

    @Override
    public LocalDate value3() {
        return getDate();
    }

    @Override
    public String value4() {
        return getReference();
    }

    @Override
    public String value5() {
        return getInternalReference();
    }

    @Override
    public String value6() {
        return getObject();
    }

    @Override
    public String value7() {
        return getPlace();
    }

    @Override
    public Double value8() {
        return getAmount();
    }

    @Override
    public LocalDate value9() {
        return getDepositDate();
    }

    @Override
    public LocalDate value10() {
        return getEntryDate();
    }

    @Override
    public Long value11() {
        return getBeneficiaryId();
    }

    @Override
    public String value12() {
        return getStepId();
    }

    @Override
    public Long value13() {
        return getAuthorId();
    }

    @Override
    public Long value14() {
        return getWorkerId();
    }

    @Override
    public PayReferenceDocumentRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value2(String value) {
        setTypeId(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value3(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value4(String value) {
        setReference(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value5(String value) {
        setInternalReference(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value6(String value) {
        setObject(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value7(String value) {
        setPlace(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value8(Double value) {
        setAmount(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value9(LocalDate value) {
        setDepositDate(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value10(LocalDate value) {
        setEntryDate(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value11(Long value) {
        setBeneficiaryId(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value12(String value) {
        setStepId(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value13(Long value) {
        setAuthorId(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord value14(Long value) {
        setWorkerId(value);
        return this;
    }

    @Override
    public PayReferenceDocumentRecord values(Long value1, String value2, LocalDate value3, String value4, String value5, String value6, String value7, Double value8, LocalDate value9, LocalDate value10, Long value11, String value12, Long value13, Long value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayReferenceDocumentRecord
     */
    public PayReferenceDocumentRecord() {
        super(PayReferenceDocument.PAY_REFERENCE_DOCUMENT);
    }

    /**
     * Create a detached, initialised PayReferenceDocumentRecord
     */
    public PayReferenceDocumentRecord(Long id, String typeId, LocalDate date, String reference, String internalReference, String object, String place, Double amount, LocalDate depositDate, LocalDate entryDate, Long beneficiaryId, String stepId, Long authorId, Long workerId) {
        super(PayReferenceDocument.PAY_REFERENCE_DOCUMENT);

        setId(id);
        setTypeId(typeId);
        setDate(date);
        setReference(reference);
        setInternalReference(internalReference);
        setObject(object);
        setPlace(place);
        setAmount(amount);
        setDepositDate(depositDate);
        setEntryDate(entryDate);
        setBeneficiaryId(beneficiaryId);
        setStepId(stepId);
        setAuthorId(authorId);
        setWorkerId(workerId);
    }
}
