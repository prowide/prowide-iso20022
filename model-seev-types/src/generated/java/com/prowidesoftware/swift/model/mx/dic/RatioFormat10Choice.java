
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
 * Choice of format to expressed a ratio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat10Choice", propOrder = {
    "qtyToQty",
    "notSpcfdRate",
    "amtToAmt",
    "amtToQty",
    "qtyToAmt"
})
public class RatioFormat10Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio2 qtyToQty;
    @XmlElement(name = "NotSpcfdRate")
    @XmlSchemaType(name = "string")
    protected RateValueType6Code notSpcfdRate;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio3 amtToAmt;
    @XmlElement(name = "AmtToQty")
    protected AmountAndQuantityRatio3 amtToQty;
    @XmlElement(name = "QtyToAmt")
    protected AmountAndQuantityRatio3 qtyToAmt;

    /**
     * Gets the value of the qtyToQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public QuantityToQuantityRatio2 getQtyToQty() {
        return qtyToQty;
    }

    /**
     * Sets the value of the qtyToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public RatioFormat10Choice setQtyToQty(QuantityToQuantityRatio2 value) {
        this.qtyToQty = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateValueType6Code }
     *     
     */
    public RateValueType6Code getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateValueType6Code }
     *     
     */
    public RatioFormat10Choice setNotSpcfdRate(RateValueType6Code value) {
        this.notSpcfdRate = value;
        return this;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio3 }
     *     
     */
    public AmountToAmountRatio3 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio3 }
     *     
     */
    public RatioFormat10Choice setAmtToAmt(AmountToAmountRatio3 value) {
        this.amtToAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtToQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio3 }
     *     
     */
    public AmountAndQuantityRatio3 getAmtToQty() {
        return amtToQty;
    }

    /**
     * Sets the value of the amtToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio3 }
     *     
     */
    public RatioFormat10Choice setAmtToQty(AmountAndQuantityRatio3 value) {
        this.amtToQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio3 }
     *     
     */
    public AmountAndQuantityRatio3 getQtyToAmt() {
        return qtyToAmt;
    }

    /**
     * Sets the value of the qtyToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio3 }
     *     
     */
    public RatioFormat10Choice setQtyToAmt(AmountAndQuantityRatio3 value) {
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
