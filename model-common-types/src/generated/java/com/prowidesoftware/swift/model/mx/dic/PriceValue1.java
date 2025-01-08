
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
 * Value given to a price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceValue1", propOrder = {
    "amt"
})
public class PriceValue1 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt;

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
    public PriceValue1 setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
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
