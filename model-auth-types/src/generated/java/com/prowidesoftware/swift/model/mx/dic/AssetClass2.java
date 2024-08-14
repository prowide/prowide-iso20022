
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
 * Structure for defining asset class specific details of a derivative to be declared.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClass2", propOrder = {
    "cmmdty",
    "intrst",
    "fx"
})
public class AssetClass2 {

    @XmlElement(name = "Cmmdty")
    protected DerivativeCommodity2 cmmdty;
    @XmlElement(name = "Intrst")
    protected DerivativeInterest3 intrst;
    @XmlElement(name = "FX")
    protected DerivativeForeignExchange3 fx;

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeCommodity2 }
     *     
     */
    public DerivativeCommodity2 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeCommodity2 }
     *     
     */
    public AssetClass2 setCmmdty(DerivativeCommodity2 value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInterest3 }
     *     
     */
    public DerivativeInterest3 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInterest3 }
     *     
     */
    public AssetClass2 setIntrst(DerivativeInterest3 value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeForeignExchange3 }
     *     
     */
    public DerivativeForeignExchange3 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeForeignExchange3 }
     *     
     */
    public AssetClass2 setFX(DerivativeForeignExchange3 value) {
        this.fx = value;
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
