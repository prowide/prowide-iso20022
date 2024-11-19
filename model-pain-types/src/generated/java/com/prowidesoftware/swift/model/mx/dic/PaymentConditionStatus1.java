
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
 * Specifies the details on the status of the payment conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentConditionStatus1", propOrder = {
    "accptdAmt",
    "grntedPmt",
    "earlyPmt"
})
public class PaymentConditionStatus1 {

    @XmlElement(name = "AccptdAmt")
    protected ActiveCurrencyAndAmount accptdAmt;
    @XmlElement(name = "GrntedPmt")
    protected boolean grntedPmt;
    @XmlElement(name = "EarlyPmt")
    protected boolean earlyPmt;

    /**
     * Gets the value of the accptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAccptdAmt() {
        return accptdAmt;
    }

    /**
     * Sets the value of the accptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public PaymentConditionStatus1 setAccptdAmt(ActiveCurrencyAndAmount value) {
        this.accptdAmt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPmt property.
     * 
     */
    public boolean isGrntedPmt() {
        return grntedPmt;
    }

    /**
     * Sets the value of the grntedPmt property.
     * 
     */
    public PaymentConditionStatus1 setGrntedPmt(boolean value) {
        this.grntedPmt = value;
        return this;
    }

    /**
     * Gets the value of the earlyPmt property.
     * 
     */
    public boolean isEarlyPmt() {
        return earlyPmt;
    }

    /**
     * Sets the value of the earlyPmt property.
     * 
     */
    public PaymentConditionStatus1 setEarlyPmt(boolean value) {
        this.earlyPmt = value;
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
