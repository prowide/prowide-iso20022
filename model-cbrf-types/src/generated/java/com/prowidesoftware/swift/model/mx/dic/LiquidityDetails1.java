
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information regarding liquidity valuation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityDetails1", propOrder = {
    "bal",
    "netAvlblLqdty",
    "nonCshRsvdAmt",
    "cshRsvdAmt"
})
public class LiquidityDetails1 {

    @XmlElement(name = "Bal", required = true)
    protected CashBalance6 bal;
    @XmlElement(name = "NetAvlblLqdty", required = true)
    protected ActiveCurrencyAndAmount netAvlblLqdty;
    @XmlElement(name = "NonCshRsvdAmt", required = true)
    protected ActiveCurrencyAndAmount nonCshRsvdAmt;
    @XmlElement(name = "CshRsvdAmt", required = true)
    protected ActiveCurrencyAndAmount cshRsvdAmt;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link CashBalance6 }
     *     
     */
    public CashBalance6 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBalance6 }
     *     
     */
    public LiquidityDetails1 setBal(CashBalance6 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the netAvlblLqdty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAvlblLqdty() {
        return netAvlblLqdty;
    }

    /**
     * Sets the value of the netAvlblLqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LiquidityDetails1 setNetAvlblLqdty(ActiveCurrencyAndAmount value) {
        this.netAvlblLqdty = value;
        return this;
    }

    /**
     * Gets the value of the nonCshRsvdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonCshRsvdAmt() {
        return nonCshRsvdAmt;
    }

    /**
     * Sets the value of the nonCshRsvdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LiquidityDetails1 setNonCshRsvdAmt(ActiveCurrencyAndAmount value) {
        this.nonCshRsvdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshRsvdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshRsvdAmt() {
        return cshRsvdAmt;
    }

    /**
     * Sets the value of the cshRsvdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public LiquidityDetails1 setCshRsvdAmt(ActiveCurrencyAndAmount value) {
        this.cshRsvdAmt = value;
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
