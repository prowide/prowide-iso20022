
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
 * Choice of format between a rate or a deemed rate type and rate or an amount or a unspecified rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAndAmountFormat54Choice", propOrder = {
    "rate",
    "amt",
    "rateTpAndAmtAndRateSts",
    "rateTpAndRate"
})
public class RateAndAmountFormat54Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Amt")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount amt;
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
    public RateAndAmountFormat54Choice setRate(BigDecimal value) {
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
    public RateAndAmountFormat54Choice setAmt(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
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
    public RateAndAmountFormat54Choice setRateTpAndAmtAndRateSts(RateTypeAndAmountAndStatus54 value) {
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
    public RateAndAmountFormat54Choice setRateTpAndRate(RateTypeAndPercentageRate11 value) {
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
