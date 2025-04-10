
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
 * Elements used to calculate the collateral margin call for the segregated independent amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegregatedIndependentAmountMargin1", propOrder = {
    "minTrfAmt",
    "rndgAmt",
    "rndgMtd"
})
public class SegregatedIndependentAmountMargin1 {

    @XmlElement(name = "MinTrfAmt", required = true)
    protected ActiveCurrencyAndAmount minTrfAmt;
    @XmlElement(name = "RndgAmt")
    protected ActiveCurrencyAndAmount rndgAmt;
    @XmlElement(name = "RndgMtd")
    @XmlSchemaType(name = "string")
    protected RoundingMethod1Code rndgMtd;

    /**
     * Gets the value of the minTrfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinTrfAmt() {
        return minTrfAmt;
    }

    /**
     * Sets the value of the minTrfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SegregatedIndependentAmountMargin1 setMinTrfAmt(ActiveCurrencyAndAmount value) {
        this.minTrfAmt = value;
        return this;
    }

    /**
     * Gets the value of the rndgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRndgAmt() {
        return rndgAmt;
    }

    /**
     * Sets the value of the rndgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SegregatedIndependentAmountMargin1 setRndgAmt(ActiveCurrencyAndAmount value) {
        this.rndgAmt = value;
        return this;
    }

    /**
     * Gets the value of the rndgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingMethod1Code }
     *     
     */
    public RoundingMethod1Code getRndgMtd() {
        return rndgMtd;
    }

    /**
     * Sets the value of the rndgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingMethod1Code }
     *     
     */
    public SegregatedIndependentAmountMargin1 setRndgMtd(RoundingMethod1Code value) {
        this.rndgMtd = value;
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
