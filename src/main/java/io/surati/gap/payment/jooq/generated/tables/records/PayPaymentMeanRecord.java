/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables.records;


import io.surati.gap.payment.jooq.generated.tables.PayPaymentMean;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayPaymentMeanRecord extends UpdatableRecordImpl<PayPaymentMeanRecord> implements Record7<Long, String, Long, String, Double, Double, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.pay_payment_mean.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.pay_payment_mean.type_id</code>.
     */
    public void setTypeId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.type_id</code>.
     */
    public String getTypeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.pay_payment_mean.bank_id</code>.
     */
    public void setBankId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.bank_id</code>.
     */
    public Long getBankId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.pay_payment_mean.image_file_name</code>.
     */
    public void setImageFileName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.image_file_name</code>.
     */
    public String getImageFileName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.pay_payment_mean.width</code>.
     */
    public void setWidth(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.width</code>.
     */
    public Double getWidth() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.pay_payment_mean.height</code>.
     */
    public void setHeight(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.height</code>.
     */
    public Double getHeight() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.pay_payment_mean.dpi</code>.
     */
    public void setDpi(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.pay_payment_mean.dpi</code>.
     */
    public Short getDpi() {
        return (Short) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Long, String, Double, Double, Short> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, Long, String, Double, Double, Short> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.ID;
    }

    @Override
    public Field<String> field2() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.TYPE_ID;
    }

    @Override
    public Field<Long> field3() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.BANK_ID;
    }

    @Override
    public Field<String> field4() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.IMAGE_FILE_NAME;
    }

    @Override
    public Field<Double> field5() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.WIDTH;
    }

    @Override
    public Field<Double> field6() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.HEIGHT;
    }

    @Override
    public Field<Short> field7() {
        return PayPaymentMean.PAY_PAYMENT_MEAN.DPI;
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
    public Long component3() {
        return getBankId();
    }

    @Override
    public String component4() {
        return getImageFileName();
    }

    @Override
    public Double component5() {
        return getWidth();
    }

    @Override
    public Double component6() {
        return getHeight();
    }

    @Override
    public Short component7() {
        return getDpi();
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
    public Long value3() {
        return getBankId();
    }

    @Override
    public String value4() {
        return getImageFileName();
    }

    @Override
    public Double value5() {
        return getWidth();
    }

    @Override
    public Double value6() {
        return getHeight();
    }

    @Override
    public Short value7() {
        return getDpi();
    }

    @Override
    public PayPaymentMeanRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord value2(String value) {
        setTypeId(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord value3(Long value) {
        setBankId(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord value4(String value) {
        setImageFileName(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord value5(Double value) {
        setWidth(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord value6(Double value) {
        setHeight(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord value7(Short value) {
        setDpi(value);
        return this;
    }

    @Override
    public PayPaymentMeanRecord values(Long value1, String value2, Long value3, String value4, Double value5, Double value6, Short value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayPaymentMeanRecord
     */
    public PayPaymentMeanRecord() {
        super(PayPaymentMean.PAY_PAYMENT_MEAN);
    }

    /**
     * Create a detached, initialised PayPaymentMeanRecord
     */
    public PayPaymentMeanRecord(Long id, String typeId, Long bankId, String imageFileName, Double width, Double height, Short dpi) {
        super(PayPaymentMean.PAY_PAYMENT_MEAN);

        setId(id);
        setTypeId(typeId);
        setBankId(bankId);
        setImageFileName(imageFileName);
        setWidth(width);
        setHeight(height);
        setDpi(dpi);
    }
}
