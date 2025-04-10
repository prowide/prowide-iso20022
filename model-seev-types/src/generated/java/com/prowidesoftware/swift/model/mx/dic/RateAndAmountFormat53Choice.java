
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Choice of format between a rate or a deemed rate type and rate or an amount or a unspecified rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAndAmountFormat53Choice", propOrder = {
    "rate",
    "amt",
    "notSpcfdRate",
    "rateTpAndAmtAndRateSts",
    "rateTpAndRate"
})
public class RateAndAmountFormat53Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Amt")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "NotSpcfdRate")
    @XmlSchemaType(name = "string")
    protected RateValueType7Code notSpcfdRate;
    @XmlElement(name = "RateTpAndAmtAndRateSts")
    protected RateTypeAndAmountAndStatus54 rateTpAndAmtAndRateSts;
    @XmlElement(name = "RateTpAndRate")
    protected RateTypeAndPercentageRate11 rateTpAndRate;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateAndAmountFormat53Choice setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RateAndAmountFormat53Choice setAmt(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateValueType7Code }
     *     
     */
    public RateValueType7Code getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueType7Code }
     *     
     */
    public RateAndAmountFormat53Choice setNotSpcfdRate(RateValueType7Code value) {
        this.notSpcfdRate = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndAmountAndStatus54 }
     *     
     */
    public RateTypeAndAmountAndStatus54 getRateTpAndAmtAndRateSts() {
        return rateTpAndAmtAndRateSts;
    }

    /**
     * Sets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndAmountAndStatus54 }
     *     
     */
    public RateAndAmountFormat53Choice setRateTpAndAmtAndRateSts(RateTypeAndAmountAndStatus54 value) {
        this.rateTpAndAmtAndRateSts = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAndRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndPercentageRate11 }
     *     
     */
    public RateTypeAndPercentageRate11 getRateTpAndRate() {
        return rateTpAndRate;
    }

    /**
     * Sets the value of the rateTpAndRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndPercentageRate11 }
     *     
     */
    public RateAndAmountFormat53Choice setRateTpAndRate(RateTypeAndPercentageRate11 value) {
        this.rateTpAndRate = value;
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
