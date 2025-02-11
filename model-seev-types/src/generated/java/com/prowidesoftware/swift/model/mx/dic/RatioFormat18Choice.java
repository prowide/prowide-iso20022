
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of format to express a ratio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat18Choice", propOrder = {
    "qtyToQty",
    "notSpcfdRate",
    "amtToAmt",
    "amtToQty",
    "qtyToAmt"
})
public class RatioFormat18Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio1 qtyToQty;
    @XmlElement(name = "NotSpcfdRate")
    @XmlSchemaType(name = "string")
    protected RateValueType7Code notSpcfdRate;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio2 amtToAmt;
    @XmlElement(name = "AmtToQty")
    protected AmountAndQuantityRatio4 amtToQty;
    @XmlElement(name = "QtyToAmt")
    protected AmountAndQuantityRatio4 qtyToAmt;

    /**
     * Gets the value of the qtyToQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getQtyToQty() {
        return qtyToQty;
    }

    /**
     * Sets the value of the qtyToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public RatioFormat18Choice setQtyToQty(QuantityToQuantityRatio1 value) {
        this.qtyToQty = value;
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
    public RatioFormat18Choice setNotSpcfdRate(RateValueType7Code value) {
        this.notSpcfdRate = value;
        return this;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio2 }
     *     
     */
    public AmountToAmountRatio2 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio2 }
     *     
     */
    public RatioFormat18Choice setAmtToAmt(AmountToAmountRatio2 value) {
        this.amtToAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtToQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio4 }
     *     
     */
    public AmountAndQuantityRatio4 getAmtToQty() {
        return amtToQty;
    }

    /**
     * Sets the value of the amtToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio4 }
     *     
     */
    public RatioFormat18Choice setAmtToQty(AmountAndQuantityRatio4 value) {
        this.amtToQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio4 }
     *     
     */
    public AmountAndQuantityRatio4 getQtyToAmt() {
        return qtyToAmt;
    }

    /**
     * Sets the value of the qtyToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio4 }
     *     
     */
    public RatioFormat18Choice setQtyToAmt(AmountAndQuantityRatio4 value) {
        this.qtyToAmt = value;
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
