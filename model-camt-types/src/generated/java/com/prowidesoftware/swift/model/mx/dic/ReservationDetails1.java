
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Liquidity set aside by the account owner for specific purposes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationDetails1", propOrder = {
    "amt",
    "sts",
    "startDtTm"
})
public class ReservationDetails1 {

    @XmlElement(name = "Amt", required = true)
    protected AmountChoice amt;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected LimitStatus1Code sts;
    @XmlElement(name = "StartDtTm")
    protected DateAndDateTimeChoice startDtTm;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountChoice }
     *     
     */
    public AmountChoice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountChoice }
     *     
     */
    public ReservationDetails1 setAmt(AmountChoice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link LimitStatus1Code }
     *     
     */
    public LimitStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitStatus1Code }
     *     
     */
    public ReservationDetails1 setSts(LimitStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the startDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStartDtTm() {
        return startDtTm;
    }

    /**
     * Sets the value of the startDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ReservationDetails1 setStartDtTm(DateAndDateTimeChoice value) {
        this.startDtTm = value;
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
