
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
 * Choice between an amount or an unspecified rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDividendRateFormat21Choice", propOrder = {
    "amt",
    "amtAndRateSts",
    "rateTpAndAmtAndRateSts",
    "notSpcfdRate"
})
public class NetDividendRateFormat21Choice {

    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "AmtAndRateSts")
    protected AmountAndRateStatus1 amtAndRateSts;
    @XmlElement(name = "RateTpAndAmtAndRateSts")
    protected RateTypeAndAmountAndStatus25 rateTpAndAmtAndRateSts;
    @XmlElement(name = "NotSpcfdRate")
    @XmlSchemaType(name = "string")
    protected RateValueType7Code notSpcfdRate;

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
    public NetDividendRateFormat21Choice setAmt(ActiveCurrencyAnd13DecimalAmount value) {
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
    public NetDividendRateFormat21Choice setAmtAndRateSts(AmountAndRateStatus1 value) {
        this.amtAndRateSts = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndAmountAndStatus25 }
     *     
     */
    public RateTypeAndAmountAndStatus25 getRateTpAndAmtAndRateSts() {
        return rateTpAndAmtAndRateSts;
    }

    /**
     * Sets the value of the rateTpAndAmtAndRateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndAmountAndStatus25 }
     *     
     */
    public NetDividendRateFormat21Choice setRateTpAndAmtAndRateSts(RateTypeAndAmountAndStatus25 value) {
        this.rateTpAndAmtAndRateSts = value;
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
    public NetDividendRateFormat21Choice setNotSpcfdRate(RateValueType7Code value) {
        this.notSpcfdRate = value;
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
