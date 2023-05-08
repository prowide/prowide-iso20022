
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Limit of amounts for the customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts2", propOrder = {
    "ccy",
    "maxAuthsbAmt",
    "minAllwdAmt",
    "maxAllwdAmt",
    "dalyBal",
    "wklyBal",
    "mnthlyBal"
})
public class ATMTransactionAmounts2 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MaxAuthsbAmt")
    protected BigDecimal maxAuthsbAmt;
    @XmlElement(name = "MinAllwdAmt")
    protected BigDecimal minAllwdAmt;
    @XmlElement(name = "MaxAllwdAmt")
    protected BigDecimal maxAllwdAmt;
    @XmlElement(name = "DalyBal")
    protected DetailedAmount4 dalyBal;
    @XmlElement(name = "WklyBal")
    protected DetailedAmount4 wklyBal;
    @XmlElement(name = "MnthlyBal")
    protected DetailedAmount4 mnthlyBal;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransactionAmounts2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the maxAuthsbAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAuthsbAmt() {
        return maxAuthsbAmt;
    }

    /**
     * Sets the value of the maxAuthsbAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts2 setMaxAuthsbAmt(BigDecimal value) {
        this.maxAuthsbAmt = value;
        return this;
    }

    /**
     * Gets the value of the minAllwdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAllwdAmt() {
        return minAllwdAmt;
    }

    /**
     * Sets the value of the minAllwdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts2 setMinAllwdAmt(BigDecimal value) {
        this.minAllwdAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxAllwdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAllwdAmt() {
        return maxAllwdAmt;
    }

    /**
     * Sets the value of the maxAllwdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMTransactionAmounts2 setMaxAllwdAmt(BigDecimal value) {
        this.maxAllwdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dalyBal property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount4 }
     *     
     */
    public DetailedAmount4 getDalyBal() {
        return dalyBal;
    }

    /**
     * Sets the value of the dalyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount4 }
     *     
     */
    public ATMTransactionAmounts2 setDalyBal(DetailedAmount4 value) {
        this.dalyBal = value;
        return this;
    }

    /**
     * Gets the value of the wklyBal property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount4 }
     *     
     */
    public DetailedAmount4 getWklyBal() {
        return wklyBal;
    }

    /**
     * Sets the value of the wklyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount4 }
     *     
     */
    public ATMTransactionAmounts2 setWklyBal(DetailedAmount4 value) {
        this.wklyBal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyBal property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount4 }
     *     
     */
    public DetailedAmount4 getMnthlyBal() {
        return mnthlyBal;
    }

    /**
     * Sets the value of the mnthlyBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount4 }
     *     
     */
    public ATMTransactionAmounts2 setMnthlyBal(DetailedAmount4 value) {
        this.mnthlyBal = value;
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
