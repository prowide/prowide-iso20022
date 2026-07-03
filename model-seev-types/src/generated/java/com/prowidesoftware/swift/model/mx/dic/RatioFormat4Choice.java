
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
 * Choice of format to expressed a ratio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat4Choice", propOrder = {
    "qtyToQty",
    "amtToAmt",
    "amtToQty",
    "qtyToAmt"
})
public class RatioFormat4Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio1 qtyToQty;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio2 amtToAmt;
    @XmlElement(name = "AmtToQty")
    protected AmountAndQuantityRatio2 amtToQty;
    @XmlElement(name = "QtyToAmt")
    protected AmountAndQuantityRatio2 qtyToAmt;

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
    public RatioFormat4Choice setQtyToQty(QuantityToQuantityRatio1 value) {
        this.qtyToQty = value;
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
    public RatioFormat4Choice setAmtToAmt(AmountToAmountRatio2 value) {
        this.amtToAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtToQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio2 }
     *     
     */
    public AmountAndQuantityRatio2 getAmtToQty() {
        return amtToQty;
    }

    /**
     * Sets the value of the amtToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio2 }
     *     
     */
    public RatioFormat4Choice setAmtToQty(AmountAndQuantityRatio2 value) {
        this.amtToQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio2 }
     *     
     */
    public AmountAndQuantityRatio2 getQtyToAmt() {
        return qtyToAmt;
    }

    /**
     * Sets the value of the qtyToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio2 }
     *     
     */
    public RatioFormat4Choice setQtyToAmt(AmountAndQuantityRatio2 value) {
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
