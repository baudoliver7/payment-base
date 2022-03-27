/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.jooq.generated.tables.records;


import io.surati.gap.payment.jooq.generated.tables.PayBankAccountView;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayBankAccountViewRecord extends TableRecordImpl<PayBankAccountViewRecord> implements Record7<Long, String, String, String, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.pay_bank_account_view.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.pay_bank_account_view.branch_code</code>.
     */
    public void setBranchCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.branch_code</code>.
     */
    public String getBranchCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.pay_bank_account_view.number</code>.
     */
    public void setNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.number</code>.
     */
    public String getNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.pay_bank_account_view.key</code>.
     */
    public void setKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.key</code>.
     */
    public String getKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.pay_bank_account_view.bank_id</code>.
     */
    public void setBankId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.bank_id</code>.
     */
    public Long getBankId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.pay_bank_account_view.holder_id</code>.
     */
    public void setHolderId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.holder_id</code>.
     */
    public Long getHolderId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.pay_bank_account_view.full_number</code>.
     */
    public void setFullNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_view.full_number</code>.
     */
    public String getFullNumber() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, Long, Long, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, String, Long, Long, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.ID;
    }

    @Override
    public Field<String> field2() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.BRANCH_CODE;
    }

    @Override
    public Field<String> field3() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.NUMBER;
    }

    @Override
    public Field<String> field4() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.KEY;
    }

    @Override
    public Field<Long> field5() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.BANK_ID;
    }

    @Override
    public Field<Long> field6() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.HOLDER_ID;
    }

    @Override
    public Field<String> field7() {
        return PayBankAccountView.PAY_BANK_ACCOUNT_VIEW.FULL_NUMBER;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getBranchCode();
    }

    @Override
    public String component3() {
        return getNumber();
    }

    @Override
    public String component4() {
        return getKey();
    }

    @Override
    public Long component5() {
        return getBankId();
    }

    @Override
    public Long component6() {
        return getHolderId();
    }

    @Override
    public String component7() {
        return getFullNumber();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getBranchCode();
    }

    @Override
    public String value3() {
        return getNumber();
    }

    @Override
    public String value4() {
        return getKey();
    }

    @Override
    public Long value5() {
        return getBankId();
    }

    @Override
    public Long value6() {
        return getHolderId();
    }

    @Override
    public String value7() {
        return getFullNumber();
    }

    @Override
    public PayBankAccountViewRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord value2(String value) {
        setBranchCode(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord value3(String value) {
        setNumber(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord value4(String value) {
        setKey(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord value5(Long value) {
        setBankId(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord value6(Long value) {
        setHolderId(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord value7(String value) {
        setFullNumber(value);
        return this;
    }

    @Override
    public PayBankAccountViewRecord values(Long value1, String value2, String value3, String value4, Long value5, Long value6, String value7) {
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
     * Create a detached PayBankAccountViewRecord
     */
    public PayBankAccountViewRecord() {
        super(PayBankAccountView.PAY_BANK_ACCOUNT_VIEW);
    }

    /**
     * Create a detached, initialised PayBankAccountViewRecord
     */
    public PayBankAccountViewRecord(Long id, String branchCode, String number, String key, Long bankId, Long holderId, String fullNumber) {
        super(PayBankAccountView.PAY_BANK_ACCOUNT_VIEW);

        setId(id);
        setBranchCode(branchCode);
        setNumber(number);
        setKey(key);
        setBankId(bankId);
        setHolderId(holderId);
        setFullNumber(fullNumber);
    }
}