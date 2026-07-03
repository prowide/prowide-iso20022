
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
 * Ratio expressed as a quotient of amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountToAmountRatio2", propOrder = {
    "amt1",
    "amt2"
})
public class AmountToAmountRatio2 {

    @XmlElement(name = "Amt1", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt1;
    @XmlElement(name = "Amt2", required = true)
    protected ActiveCurrencyAnd13DecimalAmount amt2;

    /**
     * Gets the value of the amt1 property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt1() {
        return amt1;
    }

    /**
     * Sets the value of the amt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public AmountToAmountRatio2 setAmt1(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt1 = value;
        return this;
    }

    /**
     * Gets the value of the amt2 property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt2() {
        return amt2;
    }

    /**
     * Sets the value of the amt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public AmountToAmountRatio2 setAmt2(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt2 = value;
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
