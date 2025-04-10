
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
 * Ability of a financial instrument to be easily traded and converted to cash, at conditions that do not affect its price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liquidity1", propOrder = {
    "val",
    "nbOfScties",
    "upper",
    "lwr"
})
public class Liquidity1 {

    @XmlElement(name = "Val")
    protected ActiveCurrencyAndAmount val;
    @XmlElement(name = "NbOfScties")
    protected BigDecimal nbOfScties;
    @XmlElement(name = "Upper")
    protected BigDecimal upper;
    @XmlElement(name = "Lwr")
    protected BigDecimal lwr;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Liquidity1 setVal(ActiveCurrencyAndAmount value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the nbOfScties property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfScties() {
        return nbOfScties;
    }

    /**
     * Sets the value of the nbOfScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Liquidity1 setNbOfScties(BigDecimal value) {
        this.nbOfScties = value;
        return this;
    }

    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Liquidity1 setUpper(BigDecimal value) {
        this.upper = value;
        return this;
    }

    /**
     * Gets the value of the lwr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLwr() {
        return lwr;
    }

    /**
     * Sets the value of the lwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Liquidity1 setLwr(BigDecimal value) {
        this.lwr = value;
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
