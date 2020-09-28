
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
 * Choice of formats to express a price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormat2Choice", propOrder = {
    "amt",
    "rate",
    "notSpcfd"
})
public class PriceFormat2Choice {

    @XmlElement(name = "Amt")
    protected AmountPrice1 amt;
    @XmlElement(name = "Rate")
    protected PriceRate1 rate;
    @XmlElement(name = "NotSpcfd")
    protected PriceValueType5FormatChoice notSpcfd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice1 }
     *     
     */
    public AmountPrice1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice1 }
     *     
     */
    public PriceFormat2Choice setAmt(AmountPrice1 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRate1 }
     *     
     */
    public PriceRate1 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRate1 }
     *     
     */
    public PriceFormat2Choice setRate(PriceRate1 value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType5FormatChoice }
     *     
     */
    public PriceValueType5FormatChoice getNotSpcfd() {
        return notSpcfd;
    }

    /**
     * Sets the value of the notSpcfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType5FormatChoice }
     *     
     */
    public PriceFormat2Choice setNotSpcfd(PriceValueType5FormatChoice value) {
        this.notSpcfd = value;
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
