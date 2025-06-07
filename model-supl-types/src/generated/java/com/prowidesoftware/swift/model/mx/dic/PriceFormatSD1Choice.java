
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
 * Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormatSD1Choice", propOrder = {
    "amtPric",
    "notSpcfdPric",
    "amtPricPerFinInstrmQty"
})
public class PriceFormatSD1Choice {

    @XmlElement(name = "AmtPric")
    protected AmountPrice5 amtPric;
    @XmlElement(name = "NotSpcfdPric")
    @XmlSchemaType(name = "string")
    protected PriceValueType10Code notSpcfdPric;
    @XmlElement(name = "AmtPricPerFinInstrmQty")
    protected AmountPricePerFinancialInstrumentQuantity4 amtPricPerFinInstrmQty;

    /**
     * Gets the value of the amtPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice5 }
     *     
     */
    public AmountPrice5 getAmtPric() {
        return amtPric;
    }

    /**
     * Sets the value of the amtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice5 }
     *     
     */
    public PriceFormatSD1Choice setAmtPric(AmountPrice5 value) {
        this.amtPric = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType10Code }
     *     
     */
    public PriceValueType10Code getNotSpcfdPric() {
        return notSpcfdPric;
    }

    /**
     * Sets the value of the notSpcfdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType10Code }
     *     
     */
    public PriceFormatSD1Choice setNotSpcfdPric(PriceValueType10Code value) {
        this.notSpcfdPric = value;
        return this;
    }

    /**
     * Gets the value of the amtPricPerFinInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity4 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity4 getAmtPricPerFinInstrmQty() {
        return amtPricPerFinInstrmQty;
    }

    /**
     * Sets the value of the amtPricPerFinInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity4 }
     *     
     */
    public PriceFormatSD1Choice setAmtPricPerFinInstrmQty(AmountPricePerFinancialInstrumentQuantity4 value) {
        this.amtPricPerFinInstrmQty = value;
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
