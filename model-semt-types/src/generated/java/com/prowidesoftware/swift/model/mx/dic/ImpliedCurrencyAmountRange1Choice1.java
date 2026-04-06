
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ImpliedCurrencyAmountRange1Choice__1", propOrder = {
    "frAmt",
    "toAmt",
    "frToAmt",
    "eqAmt"
})
public class ImpliedCurrencyAmountRange1Choice1 {

    @XmlElement(name = "FrAmt")
    protected AmountRangeBoundary11 frAmt;
    @XmlElement(name = "ToAmt")
    protected AmountRangeBoundary11 toAmt;
    @XmlElement(name = "FrToAmt")
    protected FromToAmountRange11 frToAmt;
    @XmlElement(name = "EQAmt")
    protected BigDecimal eqAmt;

    /**
     * Gets the value of the frAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary11 }
     *     
     */
    public AmountRangeBoundary11 getFrAmt() {
        return frAmt;
    }

    /**
     * Sets the value of the frAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary11 }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice1 setFrAmt(AmountRangeBoundary11 value) {
        this.frAmt = value;
        return this;
    }

    /**
     * Gets the value of the toAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary11 }
     *     
     */
    public AmountRangeBoundary11 getToAmt() {
        return toAmt;
    }

    /**
     * Sets the value of the toAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary11 }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice1 setToAmt(AmountRangeBoundary11 value) {
        this.toAmt = value;
        return this;
    }

    /**
     * Gets the value of the frToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FromToAmountRange11 }
     *     
     */
    public FromToAmountRange11 getFrToAmt() {
        return frToAmt;
    }

    /**
     * Sets the value of the frToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToAmountRange11 }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice1 setFrToAmt(FromToAmountRange11 value) {
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
    public ImpliedCurrencyAmountRange1Choice1 setEQAmt(BigDecimal value) {
        this.eqAmt = value;
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
