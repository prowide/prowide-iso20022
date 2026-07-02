
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
 * Provides details about the collateral held by party A and/or B.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralBalance1", propOrder = {
    "heldByPtyA",
    "heldByPtyB"
})
public class CollateralBalance1 {

    @XmlElement(name = "HeldByPtyA", required = true)
    protected ActiveCurrencyAndAmount heldByPtyA;
    @XmlElement(name = "HeldByPtyB", required = true)
    protected ActiveCurrencyAndAmount heldByPtyB;

    /**
     * Gets the value of the heldByPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getHeldByPtyA() {
        return heldByPtyA;
    }

    /**
     * Sets the value of the heldByPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralBalance1 setHeldByPtyA(ActiveCurrencyAndAmount value) {
        this.heldByPtyA = value;
        return this;
    }

    /**
     * Gets the value of the heldByPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getHeldByPtyB() {
        return heldByPtyB;
    }

    /**
     * Sets the value of the heldByPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralBalance1 setHeldByPtyB(ActiveCurrencyAndAmount value) {
        this.heldByPtyB = value;
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
