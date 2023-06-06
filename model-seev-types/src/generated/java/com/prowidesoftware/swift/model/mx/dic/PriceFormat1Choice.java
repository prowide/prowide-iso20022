
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "PriceFormat1Choice", propOrder = {
    "amt",
    "rate",
    "amtPricPerFinInstrmQty",
    "amtPricPerAmt",
    "notSpcfd"
})
public class PriceFormat1Choice {

    @XmlElement(name = "Amt")
    protected AmountPrice1 amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "AmtPricPerFinInstrmQty")
    protected AmountPricePerFinancialInstrumentQuantity1 amtPricPerFinInstrmQty;
    @XmlElement(name = "AmtPricPerAmt")
    protected AmountPricePerAmount1 amtPricPerAmt;
    @XmlElement(name = "NotSpcfd")
    protected PriceValueType6FormatChoice notSpcfd;

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
    public PriceFormat1Choice setAmt(AmountPrice1 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PriceFormat1Choice setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the amtPricPerFinInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity1 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity1 getAmtPricPerFinInstrmQty() {
        return amtPricPerFinInstrmQty;
    }

    /**
     * Sets the value of the amtPricPerFinInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity1 }
     *     
     */
    public PriceFormat1Choice setAmtPricPerFinInstrmQty(AmountPricePerFinancialInstrumentQuantity1 value) {
        this.amtPricPerFinInstrmQty = value;
        return this;
    }

    /**
     * Gets the value of the amtPricPerAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerAmount1 }
     *     
     */
    public AmountPricePerAmount1 getAmtPricPerAmt() {
        return amtPricPerAmt;
    }

    /**
     * Sets the value of the amtPricPerAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerAmount1 }
     *     
     */
    public PriceFormat1Choice setAmtPricPerAmt(AmountPricePerAmount1 value) {
        this.amtPricPerAmt = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType6FormatChoice }
     *     
     */
    public PriceValueType6FormatChoice getNotSpcfd() {
        return notSpcfd;
    }

    /**
     * Sets the value of the notSpcfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType6FormatChoice }
     *     
     */
    public PriceFormat1Choice setNotSpcfd(PriceValueType6FormatChoice value) {
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
