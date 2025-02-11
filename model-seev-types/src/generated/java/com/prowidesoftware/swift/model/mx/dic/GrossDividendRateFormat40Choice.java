
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
 * Choice of format to express a gross dividend.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossDividendRateFormat40Choice", propOrder = {
    "amt",
    "amtAndRateSts",
    "rateTpAndAmtAndRateSts"
})
public class GrossDividendRateFormat40Choice {

    @XmlElement(name = "Amt")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "AmtAndRateSts")
    protected AmountAndRateStatus2 amtAndRateSts;
    @XmlElement(name = "RateTpAndAmtAndRateSts")
    protected RateTypeAndAmountAndStatus61 rateTpAndAmtAndRateSts;

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
    public GrossDividendRateFormat40Choice setAmt(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the amtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateStatus2 }
     *     
     */
    public AmountAndRateStatus2 getAmtAndRateSts() {
        return amtAndRateSts;
    }

    /**
     * Sets the value of the amtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateStatus2 }
     *     
     */
    public GrossDividendRateFormat40Choice setAmtAndRateSts(AmountAndRateStatus2 value) {
        this.amtAndRateSts = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndAmountAndStatus61 }
     *     
     */
    public RateTypeAndAmountAndStatus61 getRateTpAndAmtAndRateSts() {
        return rateTpAndAmtAndRateSts;
    }

    /**
     * Sets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndAmountAndStatus61 }
     *     
     */
    public GrossDividendRateFormat40Choice setRateTpAndAmtAndRateSts(RateTypeAndAmountAndStatus61 value) {
        this.rateTpAndAmtAndRateSts = value;
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
