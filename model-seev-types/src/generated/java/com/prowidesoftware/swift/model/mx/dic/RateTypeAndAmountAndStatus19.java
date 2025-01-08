
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
 * Specifies the value expressed as a rate and an amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndAmountAndStatus19", propOrder = {
    "rateTp",
    "amt",
    "rateSts"
})
public class RateTypeAndAmountAndStatus19 {

    @XmlElement(name = "RateTp", required = true)
    protected RateType18Choice rateTp;
    @XmlElement(name = "Amt", required = true)
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RateSts")
    protected RateStatus2Choice rateSts;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType18Choice }
     *     
     */
    public RateType18Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType18Choice }
     *     
     */
    public RateTypeAndAmountAndStatus19 setRateTp(RateType18Choice value) {
        this.rateTp = value;
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
    public RateTypeAndAmountAndStatus19 setAmt(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateStatus2Choice }
     *     
     */
    public RateStatus2Choice getRateSts() {
        return rateSts;
    }

    /**
     * Sets the value of the rateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateStatus2Choice }
     *     
     */
    public RateTypeAndAmountAndStatus19 setRateSts(RateStatus2Choice value) {
        this.rateSts = value;
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
