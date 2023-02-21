
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
 * Choice between different formats to express a net dividend.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDividendRateFormat40Choice", propOrder = {
    "amt",
    "amtAndRateSts",
    "rateTpAndAmtAndRateSts"
})
public class NetDividendRateFormat40Choice {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "AmtAndRateSts")
    protected AmountAndRateStatus1 amtAndRateSts;
    @XmlElement(name = "RateTpAndAmtAndRateSts")
    protected RateTypeAndAmountAndStatus58 rateTpAndAmtAndRateSts;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public NetDividendRateFormat40Choice setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the amtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateStatus1 }
     *     
     */
    public AmountAndRateStatus1 getAmtAndRateSts() {
        return amtAndRateSts;
    }

    /**
     * Sets the value of the amtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateStatus1 }
     *     
     */
    public NetDividendRateFormat40Choice setAmtAndRateSts(AmountAndRateStatus1 value) {
        this.amtAndRateSts = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndAmountAndStatus58 }
     *     
     */
    public RateTypeAndAmountAndStatus58 getRateTpAndAmtAndRateSts() {
        return rateTpAndAmtAndRateSts;
    }

    /**
     * Sets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndAmountAndStatus58 }
     *     
     */
    public NetDividendRateFormat40Choice setRateTpAndAmtAndRateSts(RateTypeAndAmountAndStatus58 value) {
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
