
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
 * Defines the criteria used to report on a payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReturnCriteria3", propOrder = {
    "pmtToRtrCrit",
    "pmtFrRtrCrit",
    "acctCshNtryRtrCrit",
    "pmtRtrCrit"
})
public class TransactionReturnCriteria3 {

    @XmlElement(name = "PmtToRtrCrit")
    protected SystemReturnCriteria2 pmtToRtrCrit;
    @XmlElement(name = "PmtFrRtrCrit")
    protected SystemReturnCriteria2 pmtFrRtrCrit;
    @XmlElement(name = "AcctCshNtryRtrCrit")
    protected AccountCashEntryReturnCriteria2 acctCshNtryRtrCrit;
    @XmlElement(name = "PmtRtrCrit")
    protected PaymentReturnCriteria3 pmtRtrCrit;

    /**
     * Gets the value of the pmtToRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public SystemReturnCriteria2 getPmtToRtrCrit() {
        return pmtToRtrCrit;
    }

    /**
     * Sets the value of the pmtToRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public TransactionReturnCriteria3 setPmtToRtrCrit(SystemReturnCriteria2 value) {
        this.pmtToRtrCrit = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public SystemReturnCriteria2 getPmtFrRtrCrit() {
        return pmtFrRtrCrit;
    }

    /**
     * Sets the value of the pmtFrRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemReturnCriteria2 }
     *     
     */
    public TransactionReturnCriteria3 setPmtFrRtrCrit(SystemReturnCriteria2 value) {
        this.pmtFrRtrCrit = value;
        return this;
    }

    /**
     * Gets the value of the acctCshNtryRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCashEntryReturnCriteria2 }
     *     
     */
    public AccountCashEntryReturnCriteria2 getAcctCshNtryRtrCrit() {
        return acctCshNtryRtrCrit;
    }

    /**
     * Sets the value of the acctCshNtryRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCashEntryReturnCriteria2 }
     *     
     */
    public TransactionReturnCriteria3 setAcctCshNtryRtrCrit(AccountCashEntryReturnCriteria2 value) {
        this.acctCshNtryRtrCrit = value;
        return this;
    }

    /**
     * Gets the value of the pmtRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnCriteria3 }
     *     
     */
    public PaymentReturnCriteria3 getPmtRtrCrit() {
        return pmtRtrCrit;
    }

    /**
     * Sets the value of the pmtRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnCriteria3 }
     *     
     */
    public TransactionReturnCriteria3 setPmtRtrCrit(PaymentReturnCriteria3 value) {
        this.pmtRtrCrit = value;
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
