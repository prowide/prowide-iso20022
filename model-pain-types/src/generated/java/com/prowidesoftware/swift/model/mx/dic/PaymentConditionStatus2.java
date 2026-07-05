
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
 * Specifies the details on the status of the payment conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentConditionStatus2", propOrder = {
    "accptdAmt",
    "grntedPmt",
    "earlyPmt"
})
public class PaymentConditionStatus2 {

    @XmlElement(name = "AccptdAmt")
    protected ActiveCurrencyAndAmount accptdAmt;
    @XmlElement(name = "GrntedPmt")
    protected Boolean grntedPmt;
    @XmlElement(name = "EarlyPmt")
    protected Boolean earlyPmt;

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
    public PaymentConditionStatus2 setAccptdAmt(ActiveCurrencyAndAmount value) {
        this.accptdAmt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrntedPmt() {
        return grntedPmt;
    }

    /**
     * Sets the value of the grntedPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentConditionStatus2 setGrntedPmt(Boolean value) {
        this.grntedPmt = value;
        return this;
    }

    /**
     * Gets the value of the earlyPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEarlyPmt() {
        return earlyPmt;
    }

    /**
     * Sets the value of the earlyPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentConditionStatus2 setEarlyPmt(Boolean value) {
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
