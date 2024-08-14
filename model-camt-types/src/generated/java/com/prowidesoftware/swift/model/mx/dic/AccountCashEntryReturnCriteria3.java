
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
 * Defines the criteria used to report on the cash entry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCashEntryReturnCriteria3", propOrder = {
    "ntryRefInd",
    "acctTpInd",
    "ntryAmtInd",
    "acctCcyInd",
    "ntryStsInd",
    "ntryDtInd",
    "acctSvcrInd",
    "acctOwnrInd"
})
public class AccountCashEntryReturnCriteria3 {

    @XmlElement(name = "NtryRefInd")
    protected Boolean ntryRefInd;
    @XmlElement(name = "AcctTpInd")
    protected Boolean acctTpInd;
    @XmlElement(name = "NtryAmtInd")
    protected Boolean ntryAmtInd;
    @XmlElement(name = "AcctCcyInd")
    protected Boolean acctCcyInd;
    @XmlElement(name = "NtryStsInd")
    protected Boolean ntryStsInd;
    @XmlElement(name = "NtryDtInd")
    protected Boolean ntryDtInd;
    @XmlElement(name = "AcctSvcrInd")
    protected Boolean acctSvcrInd;
    @XmlElement(name = "AcctOwnrInd")
    protected Boolean acctOwnrInd;

    /**
     * Gets the value of the ntryRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryRefInd() {
        return ntryRefInd;
    }

    /**
     * Sets the value of the ntryRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setNtryRefInd(Boolean value) {
        this.ntryRefInd = value;
        return this;
    }

    /**
     * Gets the value of the acctTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctTpInd() {
        return acctTpInd;
    }

    /**
     * Sets the value of the acctTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setAcctTpInd(Boolean value) {
        this.acctTpInd = value;
        return this;
    }

    /**
     * Gets the value of the ntryAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryAmtInd() {
        return ntryAmtInd;
    }

    /**
     * Sets the value of the ntryAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setNtryAmtInd(Boolean value) {
        this.ntryAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the acctCcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctCcyInd() {
        return acctCcyInd;
    }

    /**
     * Sets the value of the acctCcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setAcctCcyInd(Boolean value) {
        this.acctCcyInd = value;
        return this;
    }

    /**
     * Gets the value of the ntryStsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryStsInd() {
        return ntryStsInd;
    }

    /**
     * Sets the value of the ntryStsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setNtryStsInd(Boolean value) {
        this.ntryStsInd = value;
        return this;
    }

    /**
     * Gets the value of the ntryDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtryDtInd() {
        return ntryDtInd;
    }

    /**
     * Sets the value of the ntryDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setNtryDtInd(Boolean value) {
        this.ntryDtInd = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctSvcrInd() {
        return acctSvcrInd;
    }

    /**
     * Sets the value of the acctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setAcctSvcrInd(Boolean value) {
        this.acctSvcrInd = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctOwnrInd() {
        return acctOwnrInd;
    }

    /**
     * Sets the value of the acctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountCashEntryReturnCriteria3 setAcctOwnrInd(Boolean value) {
        this.acctOwnrInd = value;
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
