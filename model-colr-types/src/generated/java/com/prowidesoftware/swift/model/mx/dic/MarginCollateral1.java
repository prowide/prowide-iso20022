
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
 * Provides details about the collateral held, in transit or that still needs to be agreed by both parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCollateral1", propOrder = {
    "heldByPtyA",
    "heldByPtyB",
    "prrAgrdToPtyA",
    "prrAgrdToPtyB",
    "inTrnstToPtyA",
    "inTrnstToPtyB"
})
public class MarginCollateral1 {

    @XmlElement(name = "HeldByPtyA")
    protected ActiveCurrencyAndAmount heldByPtyA;
    @XmlElement(name = "HeldByPtyB")
    protected ActiveCurrencyAndAmount heldByPtyB;
    @XmlElement(name = "PrrAgrdToPtyA")
    protected ActiveCurrencyAndAmount prrAgrdToPtyA;
    @XmlElement(name = "PrrAgrdToPtyB")
    protected ActiveCurrencyAndAmount prrAgrdToPtyB;
    @XmlElement(name = "InTrnstToPtyA")
    protected ActiveCurrencyAndAmount inTrnstToPtyA;
    @XmlElement(name = "InTrnstToPtyB")
    protected ActiveCurrencyAndAmount inTrnstToPtyB;

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
    public MarginCollateral1 setHeldByPtyA(ActiveCurrencyAndAmount value) {
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
    public MarginCollateral1 setHeldByPtyB(ActiveCurrencyAndAmount value) {
        this.heldByPtyB = value;
        return this;
    }

    /**
     * Gets the value of the prrAgrdToPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrrAgrdToPtyA() {
        return prrAgrdToPtyA;
    }

    /**
     * Sets the value of the prrAgrdToPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCollateral1 setPrrAgrdToPtyA(ActiveCurrencyAndAmount value) {
        this.prrAgrdToPtyA = value;
        return this;
    }

    /**
     * Gets the value of the prrAgrdToPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrrAgrdToPtyB() {
        return prrAgrdToPtyB;
    }

    /**
     * Sets the value of the prrAgrdToPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCollateral1 setPrrAgrdToPtyB(ActiveCurrencyAndAmount value) {
        this.prrAgrdToPtyB = value;
        return this;
    }

    /**
     * Gets the value of the inTrnstToPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInTrnstToPtyA() {
        return inTrnstToPtyA;
    }

    /**
     * Sets the value of the inTrnstToPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCollateral1 setInTrnstToPtyA(ActiveCurrencyAndAmount value) {
        this.inTrnstToPtyA = value;
        return this;
    }

    /**
     * Gets the value of the inTrnstToPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInTrnstToPtyB() {
        return inTrnstToPtyB;
    }

    /**
     * Sets the value of the inTrnstToPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCollateral1 setInTrnstToPtyB(ActiveCurrencyAndAmount value) {
        this.inTrnstToPtyB = value;
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
