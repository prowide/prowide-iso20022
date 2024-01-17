
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details about successor account for automated default funds transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultAccountDetails1", propOrder = {
    "acctOwnr",
    "acct",
    "dalyFndTrf"
})
public class DefaultAccountDetails1 {

    @XmlElement(name = "AcctOwnr", required = true)
    protected FinancialInstitutionIdentification9 acctOwnr;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount24 acct;
    @XmlElement(name = "DalyFndTrf")
    protected DailyFundTransfer1Choice dalyFndTrf;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public FinancialInstitutionIdentification9 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification9 }
     *     
     */
    public DefaultAccountDetails1 setAcctOwnr(FinancialInstitutionIdentification9 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public DefaultAccountDetails1 setAcct(CashAccount24 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the dalyFndTrf property.
     * 
     * @return
     *     possible object is
     *     {@link DailyFundTransfer1Choice }
     *     
     */
    public DailyFundTransfer1Choice getDalyFndTrf() {
        return dalyFndTrf;
    }

    /**
     * Sets the value of the dalyFndTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyFundTransfer1Choice }
     *     
     */
    public DefaultAccountDetails1 setDalyFndTrf(DailyFundTransfer1Choice value) {
        this.dalyFndTrf = value;
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
