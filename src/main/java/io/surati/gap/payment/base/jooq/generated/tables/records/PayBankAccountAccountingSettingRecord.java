/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.payment.base.jooq.generated.tables.records;


import io.surati.gap.payment.base.jooq.generated.tables.PayBankAccountAccountingSetting;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayBankAccountAccountingSettingRecord extends TableRecordImpl<PayBankAccountAccountingSettingRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.pay_bank_account_accounting_setting.account_id</code>.
     */
    public void setAccountId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_accounting_setting.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.pay_bank_account_accounting_setting.mean_type_id</code>.
     */
    public void setMeanTypeId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_accounting_setting.mean_type_id</code>.
     */
    public String getMeanTypeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.pay_bank_account_accounting_setting.journal_code</code>.
     */
    public void setJournalCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.pay_bank_account_accounting_setting.journal_code</code>.
     */
    public String getJournalCode() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PayBankAccountAccountingSetting.PAY_BANK_ACCOUNT_ACCOUNTING_SETTING.ACCOUNT_ID;
    }

    @Override
    public Field<String> field2() {
        return PayBankAccountAccountingSetting.PAY_BANK_ACCOUNT_ACCOUNTING_SETTING.MEAN_TYPE_ID;
    }

    @Override
    public Field<String> field3() {
        return PayBankAccountAccountingSetting.PAY_BANK_ACCOUNT_ACCOUNTING_SETTING.JOURNAL_CODE;
    }

    @Override
    public Long component1() {
        return getAccountId();
    }

    @Override
    public String component2() {
        return getMeanTypeId();
    }

    @Override
    public String component3() {
        return getJournalCode();
    }

    @Override
    public Long value1() {
        return getAccountId();
    }

    @Override
    public String value2() {
        return getMeanTypeId();
    }

    @Override
    public String value3() {
        return getJournalCode();
    }

    @Override
    public PayBankAccountAccountingSettingRecord value1(Long value) {
        setAccountId(value);
        return this;
    }

    @Override
    public PayBankAccountAccountingSettingRecord value2(String value) {
        setMeanTypeId(value);
        return this;
    }

    @Override
    public PayBankAccountAccountingSettingRecord value3(String value) {
        setJournalCode(value);
        return this;
    }

    @Override
    public PayBankAccountAccountingSettingRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayBankAccountAccountingSettingRecord
     */
    public PayBankAccountAccountingSettingRecord() {
        super(PayBankAccountAccountingSetting.PAY_BANK_ACCOUNT_ACCOUNTING_SETTING);
    }

    /**
     * Create a detached, initialised PayBankAccountAccountingSettingRecord
     */
    public PayBankAccountAccountingSettingRecord(Long accountId, String meanTypeId, String journalCode) {
        super(PayBankAccountAccountingSetting.PAY_BANK_ACCOUNT_ACCOUNTING_SETTING);

        setAccountId(accountId);
        setMeanTypeId(meanTypeId);
        setJournalCode(journalCode);
    }
}