
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCashEntryDetails3", propOrder = {
    "acctId",
    "acctCcy",
    "acctTp",
    "ntryRef",
    "ntryAmt",
    "ntryDt",
    "ntrySts",
    "acctOwnr",
    "acctSvcr"
})
public class AccountCashEntryDetails3 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification1Choice acctId;
    @XmlElement(name = "AcctCcy")
    protected String acctCcy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CashAccountType2Code acctTp;
    @XmlElement(name = "NtryRef")
    protected String ntryRef;
    @XmlElement(name = "NtryAmt")
    protected CurrencyAndAmount ntryAmt;
    @XmlElement(name = "NtryDt")
    protected DateAndDateTimeChoice ntryDt;
    @XmlElement(name = "NtrySts")
    @XmlSchemaType(name = "string")
    protected EntryStatus1Code ntrySts;
    @XmlElement(name = "AcctOwnr")
    protected String acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected String acctSvcr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountCashEntryDetails3 setAcctId(AccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCcy() {
        return acctCcy;
    }

    /**
     * Sets the value of the acctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountCashEntryDetails3 setAcctCcy(String value) {
        this.acctCcy = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Code }
     *     
     */
    public CashAccountType2Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Code }
     *     
     */
    public AccountCashEntryDetails3 setAcctTp(CashAccountType2Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the ntryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryRef() {
        return ntryRef;
    }

    /**
     * Sets the value of the ntryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountCashEntryDetails3 setNtryRef(String value) {
        this.ntryRef = value;
        return this;
    }

    /**
     * Gets the value of the ntryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getNtryAmt() {
        return ntryAmt;
    }

    /**
     * Sets the value of the ntryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public AccountCashEntryDetails3 setNtryAmt(CurrencyAndAmount value) {
        this.ntryAmt = value;
        return this;
    }

    /**
     * Gets the value of the ntryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNtryDt() {
        return ntryDt;
    }

    /**
     * Sets the value of the ntryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AccountCashEntryDetails3 setNtryDt(DateAndDateTimeChoice value) {
        this.ntryDt = value;
        return this;
    }

    /**
     * Gets the value of the ntrySts property.
     * 
     * @return
     *     possible object is
     *     {@link EntryStatus1Code }
     *     
     */
    public EntryStatus1Code getNtrySts() {
        return ntrySts;
    }

    /**
     * Sets the value of the ntrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryStatus1Code }
     *     
     */
    public AccountCashEntryDetails3 setNtrySts(EntryStatus1Code value) {
        this.ntrySts = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountCashEntryDetails3 setAcctOwnr(String value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountCashEntryDetails3 setAcctSvcr(String value) {
        this.acctSvcr = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
