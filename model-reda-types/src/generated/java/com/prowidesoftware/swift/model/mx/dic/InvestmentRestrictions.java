
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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentRestrictions", propOrder = {
    "minInitlSbcptAmt",
    "minInitlSbcptUnits",
    "minSbsqntSbcptAmt",
    "minSbsqntSbcptUnits",
    "maxRedAmt",
    "maxRedUnits",
    "othrRedRstrctns",
    "minHldgAmt",
    "minHldgUnits",
    "minHldgPrd",
    "hldgTrfblInd"
})
public class InvestmentRestrictions {

    @XmlElement(name = "MinInitlSbcptAmt")
    protected ActiveCurrencyAndAmount minInitlSbcptAmt;
    @XmlElement(name = "MinInitlSbcptUnits")
    protected BigDecimal minInitlSbcptUnits;
    @XmlElement(name = "MinSbsqntSbcptAmt")
    protected ActiveCurrencyAndAmount minSbsqntSbcptAmt;
    @XmlElement(name = "MinSbsqntSbcptUnits")
    protected BigDecimal minSbsqntSbcptUnits;
    @XmlElement(name = "MaxRedAmt")
    protected ActiveCurrencyAndAmount maxRedAmt;
    @XmlElement(name = "MaxRedUnits")
    protected BigDecimal maxRedUnits;
    @XmlElement(name = "OthrRedRstrctns")
    protected String othrRedRstrctns;
    @XmlElement(name = "MinHldgAmt")
    protected ActiveCurrencyAndAmount minHldgAmt;
    @XmlElement(name = "MinHldgUnits")
    protected BigDecimal minHldgUnits;
    @XmlElement(name = "MinHldgPrd")
    protected String minHldgPrd;
    @XmlElement(name = "HldgTrfblInd")
    protected boolean hldgTrfblInd;

    /**
     * Gets the value of the minInitlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinInitlSbcptAmt() {
        return minInitlSbcptAmt;
    }

    /**
     * Sets the value of the minInitlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions setMinInitlSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minInitlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the minInitlSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinInitlSbcptUnits() {
        return minInitlSbcptUnits;
    }

    /**
     * Sets the value of the minInitlSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions setMinInitlSbcptUnits(BigDecimal value) {
        this.minInitlSbcptUnits = value;
        return this;
    }

    /**
     * Gets the value of the minSbsqntSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSbsqntSbcptAmt() {
        return minSbsqntSbcptAmt;
    }

    /**
     * Sets the value of the minSbsqntSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions setMinSbsqntSbcptAmt(ActiveCurrencyAndAmount value) {
        this.minSbsqntSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the minSbsqntSbcptUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSbsqntSbcptUnits() {
        return minSbsqntSbcptUnits;
    }

    /**
     * Sets the value of the minSbsqntSbcptUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions setMinSbsqntSbcptUnits(BigDecimal value) {
        this.minSbsqntSbcptUnits = value;
        return this;
    }

    /**
     * Gets the value of the maxRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxRedAmt() {
        return maxRedAmt;
    }

    /**
     * Sets the value of the maxRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions setMaxRedAmt(ActiveCurrencyAndAmount value) {
        this.maxRedAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxRedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxRedUnits() {
        return maxRedUnits;
    }

    /**
     * Sets the value of the maxRedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions setMaxRedUnits(BigDecimal value) {
        this.maxRedUnits = value;
        return this;
    }

    /**
     * Gets the value of the othrRedRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRedRstrctns() {
        return othrRedRstrctns;
    }

    /**
     * Sets the value of the othrRedRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentRestrictions setOthrRedRstrctns(String value) {
        this.othrRedRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the minHldgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinHldgAmt() {
        return minHldgAmt;
    }

    /**
     * Sets the value of the minHldgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentRestrictions setMinHldgAmt(ActiveCurrencyAndAmount value) {
        this.minHldgAmt = value;
        return this;
    }

    /**
     * Gets the value of the minHldgUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinHldgUnits() {
        return minHldgUnits;
    }

    /**
     * Sets the value of the minHldgUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentRestrictions setMinHldgUnits(BigDecimal value) {
        this.minHldgUnits = value;
        return this;
    }

    /**
     * Gets the value of the minHldgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHldgPrd() {
        return minHldgPrd;
    }

    /**
     * Sets the value of the minHldgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentRestrictions setMinHldgPrd(String value) {
        this.minHldgPrd = value;
        return this;
    }

    /**
     * Gets the value of the hldgTrfblInd property.
     * 
     */
    public boolean isHldgTrfblInd() {
        return hldgTrfblInd;
    }

    /**
     * Sets the value of the hldgTrfblInd property.
     * 
     */
    public InvestmentRestrictions setHldgTrfblInd(boolean value) {
        this.hldgTrfblInd = value;
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
