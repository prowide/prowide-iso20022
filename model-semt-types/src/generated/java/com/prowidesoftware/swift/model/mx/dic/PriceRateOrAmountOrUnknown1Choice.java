
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
 * Choice of formats for the price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRateOrAmountOrUnknown1Choice", propOrder = {
    "rate",
    "amt",
    "uknwnInd"
})
public class PriceRateOrAmountOrUnknown1Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Amt")
    protected RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "UknwnInd")
    protected Boolean uknwnInd;

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
    public PriceRateOrAmountOrUnknown1Choice setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public PriceRateOrAmountOrUnknown1Choice setAmt(RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the uknwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUknwnInd() {
        return uknwnInd;
    }

    /**
     * Sets the value of the uknwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PriceRateOrAmountOrUnknown1Choice setUknwnInd(Boolean value) {
        this.uknwnInd = value;
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
