
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityAndStatistics1", propOrder = {
    "grssInd",
    "indTp",
    "wghtdAvrgLqdty",
    "outMainCtryIndx",
    "crossPct",
    "sdVal1",
    "sdVal2"
})
public class LiquidityAndStatistics1 {

    @XmlElement(name = "GrssInd")
    protected boolean grssInd;
    @XmlElement(name = "IndTp", required = true)
    @XmlSchemaType(name = "string")
    protected LiquidityIndicatorType1Code indTp;
    @XmlElement(name = "WghtdAvrgLqdty", required = true)
    protected BigDecimal wghtdAvrgLqdty;
    @XmlElement(name = "OutMainCtryIndx", required = true)
    protected ActiveCurrencyAndAmount outMainCtryIndx;
    @XmlElement(name = "CrossPct")
    protected BigDecimal crossPct;
    @XmlElement(name = "SdVal1")
    protected ActiveCurrencyAndAmount sdVal1;
    @XmlElement(name = "SdVal2")
    protected ActiveCurrencyAndAmount sdVal2;

    /**
     * Gets the value of the grssInd property.
     * 
     */
    public boolean isGrssInd() {
        return grssInd;
    }

    /**
     * Sets the value of the grssInd property.
     * 
     */
    public LiquidityAndStatistics1 setGrssInd(boolean value) {
        this.grssInd = value;
        return this;
    }

    /**
     * Gets the value of the indTp property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityIndicatorType1Code }
     *     
     */
    public LiquidityIndicatorType1Code getIndTp() {
        return indTp;
    }

    /**
     * Sets the value of the indTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityIndicatorType1Code }
     *     
     */
    public LiquidityAndStatistics1 setIndTp(LiquidityIndicatorType1Code value) {
        this.indTp = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgLqdty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgLqdty() {
        return wghtdAvrgLqdty;
    }

    /**
     * Sets the value of the wghtdAvrgLqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LiquidityAndStatistics1 setWghtdAvrgLqdty(BigDecimal value) {
        this.wghtdAvrgLqdty = value;
        return this;
    }

    /**
     * Gets the value of the outMainCtryIndx property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOutMainCtryIndx() {
        return outMainCtryIndx;
    }

    /**
     * Sets the value of the outMainCtryIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LiquidityAndStatistics1 setOutMainCtryIndx(ActiveCurrencyAndAmount value) {
        this.outMainCtryIndx = value;
        return this;
    }

    /**
     * Gets the value of the crossPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrossPct() {
        return crossPct;
    }

    /**
     * Sets the value of the crossPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LiquidityAndStatistics1 setCrossPct(BigDecimal value) {
        this.crossPct = value;
        return this;
    }

    /**
     * Gets the value of the sdVal1 property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSdVal1() {
        return sdVal1;
    }

    /**
     * Sets the value of the sdVal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LiquidityAndStatistics1 setSdVal1(ActiveCurrencyAndAmount value) {
        this.sdVal1 = value;
        return this;
    }

    /**
     * Gets the value of the sdVal2 property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSdVal2() {
        return sdVal2;
    }

    /**
     * Sets the value of the sdVal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LiquidityAndStatistics1 setSdVal2(ActiveCurrencyAndAmount value) {
        this.sdVal2 = value;
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
