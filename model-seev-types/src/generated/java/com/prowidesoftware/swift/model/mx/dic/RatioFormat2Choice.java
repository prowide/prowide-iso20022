
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
@XmlType(name = "RatioFormat2Choice", propOrder = {
    "qtyToQty",
    "amtToAmt",
    "amtToQty",
    "qtyToAmt",
    "notSpcfdRate"
})
public class RatioFormat2Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio1 qtyToQty;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio1 amtToAmt;
    @XmlElement(name = "AmtToQty")
    protected AmountAndQuantityRatio1 amtToQty;
    @XmlElement(name = "QtyToAmt")
    protected AmountAndQuantityRatio1 qtyToAmt;
    @XmlElement(name = "NotSpcfdRate")
    protected RateType12FormatChoice notSpcfdRate;

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
    public RatioFormat2Choice setQtyToQty(QuantityToQuantityRatio1 value) {
        this.qtyToQty = value;
        return this;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio1 }
     *     
     */
    public AmountToAmountRatio1 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio1 }
     *     
     */
    public RatioFormat2Choice setAmtToAmt(AmountToAmountRatio1 value) {
        this.amtToAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtToQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public AmountAndQuantityRatio1 getAmtToQty() {
        return amtToQty;
    }

    /**
     * Sets the value of the amtToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public RatioFormat2Choice setAmtToQty(AmountAndQuantityRatio1 value) {
        this.amtToQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public AmountAndQuantityRatio1 getQtyToAmt() {
        return qtyToAmt;
    }

    /**
     * Sets the value of the qtyToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public RatioFormat2Choice setQtyToAmt(AmountAndQuantityRatio1 value) {
        this.qtyToAmt = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType12FormatChoice }
     *     
     */
    public RateType12FormatChoice getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType12FormatChoice }
     *     
     */
    public RatioFormat2Choice setNotSpcfdRate(RateType12FormatChoice value) {
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
