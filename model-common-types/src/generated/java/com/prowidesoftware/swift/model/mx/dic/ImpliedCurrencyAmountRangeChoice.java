
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
 * Choice between ranges of values in which an amount is considered valid or a specified amount value which has to be matched or unmatched to be valid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpliedCurrencyAmountRangeChoice", propOrder = {
    "frAmt",
    "toAmt",
    "frToAmt",
    "eqAmt",
    "neqAmt"
})
public class ImpliedCurrencyAmountRangeChoice {

    @XmlElement(name = "FrAmt")
    protected AmountRangeBoundary1 frAmt;
    @XmlElement(name = "ToAmt")
    protected AmountRangeBoundary1 toAmt;
    @XmlElement(name = "FrToAmt")
    protected FromToAmountRange frToAmt;
    @XmlElement(name = "EQAmt")
    protected BigDecimal eqAmt;
    @XmlElement(name = "NEQAmt")
    protected BigDecimal neqAmt;

    /**
     * Gets the value of the frAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getFrAmt() {
        return frAmt;
    }

    /**
     * Sets the value of the frAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public ImpliedCurrencyAmountRangeChoice setFrAmt(AmountRangeBoundary1 value) {
        this.frAmt = value;
        return this;
    }

    /**
     * Gets the value of the toAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getToAmt() {
        return toAmt;
    }

    /**
     * Sets the value of the toAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public ImpliedCurrencyAmountRangeChoice setToAmt(AmountRangeBoundary1 value) {
        this.toAmt = value;
        return this;
    }

    /**
     * Gets the value of the frToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FromToAmountRange }
     *     
     */
    public FromToAmountRange getFrToAmt() {
        return frToAmt;
    }

    /**
     * Sets the value of the frToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToAmountRange }
     *     
     */
    public ImpliedCurrencyAmountRangeChoice setFrToAmt(FromToAmountRange value) {
        this.frToAmt = value;
        return this;
    }

    /**
     * Gets the value of the eqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQAmt() {
        return eqAmt;
    }

    /**
     * Sets the value of the eqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ImpliedCurrencyAmountRangeChoice setEQAmt(BigDecimal value) {
        this.eqAmt = value;
        return this;
    }

    /**
     * Gets the value of the neqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQAmt() {
        return neqAmt;
    }

    /**
     * Sets the value of the neqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ImpliedCurrencyAmountRangeChoice setNEQAmt(BigDecimal value) {
        this.neqAmt = value;
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
