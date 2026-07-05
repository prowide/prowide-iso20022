
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
 * Choice of format to express a net dividend.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDividendRate1Choice", propOrder = {
    "notSpcfdRate",
    "amt",
    "rateTpAmt"
})
public class NetDividendRate1Choice {

    @XmlElement(name = "NotSpcfdRate")
    protected RateValueType6FormatChoice notSpcfdRate;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "RateTpAmt")
    protected NetDividendRate2 rateTpAmt;

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateValueType6FormatChoice }
     *     
     */
    public RateValueType6FormatChoice getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueType6FormatChoice }
     *     
     */
    public NetDividendRate1Choice setNotSpcfdRate(RateValueType6FormatChoice value) {
        this.notSpcfdRate = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public NetDividendRate1Choice setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetDividendRate2 }
     *     
     */
    public NetDividendRate2 getRateTpAmt() {
        return rateTpAmt;
    }

    /**
     * Sets the value of the rateTpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetDividendRate2 }
     *     
     */
    public NetDividendRate1Choice setRateTpAmt(NetDividendRate2 value) {
        this.rateTpAmt = value;
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
