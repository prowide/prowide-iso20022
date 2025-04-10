
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormat49Choice", propOrder = {
    "pctgPric",
    "amtPric",
    "notSpcfdPric",
    "amtPricPerFinInstrmQty",
    "amtPricPerAmt",
    "indxPts"
})
public class PriceFormat49Choice {

    @XmlElement(name = "PctgPric")
    protected PercentagePrice1 pctgPric;
    @XmlElement(name = "AmtPric")
    protected AmountPrice3 amtPric;
    @XmlElement(name = "NotSpcfdPric")
    @XmlSchemaType(name = "string")
    protected PriceValueType9Code notSpcfdPric;
    @XmlElement(name = "AmtPricPerFinInstrmQty")
    protected AmountPricePerFinancialInstrumentQuantity6 amtPricPerFinInstrmQty;
    @XmlElement(name = "AmtPricPerAmt")
    protected AmountPricePerAmount2 amtPricPerAmt;
    @XmlElement(name = "IndxPts")
    protected BigDecimal indxPts;

    /**
     * Gets the value of the pctgPric property.
     * 
     * @return
     *     possible object is
     *     {@link PercentagePrice1 }
     *     
     */
    public PercentagePrice1 getPctgPric() {
        return pctgPric;
    }

    /**
     * Sets the value of the pctgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentagePrice1 }
     *     
     */
    public PriceFormat49Choice setPctgPric(PercentagePrice1 value) {
        this.pctgPric = value;
        return this;
    }

    /**
     * Gets the value of the amtPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice3 }
     *     
     */
    public AmountPrice3 getAmtPric() {
        return amtPric;
    }

    /**
     * Sets the value of the amtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice3 }
     *     
     */
    public PriceFormat49Choice setAmtPric(AmountPrice3 value) {
        this.amtPric = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType9Code }
     *     
     */
    public PriceValueType9Code getNotSpcfdPric() {
        return notSpcfdPric;
    }

    /**
     * Sets the value of the notSpcfdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType9Code }
     *     
     */
    public PriceFormat49Choice setNotSpcfdPric(PriceValueType9Code value) {
        this.notSpcfdPric = value;
        return this;
    }

    /**
     * Gets the value of the amtPricPerFinInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity6 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity6 getAmtPricPerFinInstrmQty() {
        return amtPricPerFinInstrmQty;
    }

    /**
     * Sets the value of the amtPricPerFinInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity6 }
     *     
     */
    public PriceFormat49Choice setAmtPricPerFinInstrmQty(AmountPricePerFinancialInstrumentQuantity6 value) {
        this.amtPricPerFinInstrmQty = value;
        return this;
    }

    /**
     * Gets the value of the amtPricPerAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerAmount2 }
     *     
     */
    public AmountPricePerAmount2 getAmtPricPerAmt() {
        return amtPricPerAmt;
    }

    /**
     * Sets the value of the amtPricPerAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerAmount2 }
     *     
     */
    public PriceFormat49Choice setAmtPricPerAmt(AmountPricePerAmount2 value) {
        this.amtPricPerAmt = value;
        return this;
    }

    /**
     * Gets the value of the indxPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxPts() {
        return indxPts;
    }

    /**
     * Sets the value of the indxPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PriceFormat49Choice setIndxPts(BigDecimal value) {
        this.indxPts = value;
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
