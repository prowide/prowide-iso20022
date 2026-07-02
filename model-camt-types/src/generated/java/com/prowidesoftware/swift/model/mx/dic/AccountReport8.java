
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports either on the account information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReport8", propOrder = {
    "acctId",
    "acct",
    "bizErr"
})
public class AccountReport8 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification1Choice acctId;
    @XmlElement(name = "Acct")
    protected CashAccountDetails3 acct;
    @XmlElement(name = "BizErr")
    protected ErrorHandling2 bizErr;

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
    public AccountReport8 setAcctId(AccountIdentification1Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountDetails3 }
     *     
     */
    public CashAccountDetails3 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountDetails3 }
     *     
     */
    public AccountReport8 setAcct(CashAccountDetails3 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public AccountReport8 setBizErr(ErrorHandling2 value) {
        this.bizErr = value;
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
