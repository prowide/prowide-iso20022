
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
 * Asset class specific details of a derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassAttributes1Choice", propOrder = {
    "intrst",
    "fx",
    "both"
})
public class AssetClassAttributes1Choice {

    @XmlElement(name = "Intrst")
    protected DerivativeInterest2 intrst;
    @XmlElement(name = "FX")
    protected DerivativeForeignExchange2 fx;
    @XmlElement(name = "Both")
    protected AssetClassAttributes1 both;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInterest2 }
     *     
     */
    public DerivativeInterest2 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInterest2 }
     *     
     */
    public AssetClassAttributes1Choice setIntrst(DerivativeInterest2 value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeForeignExchange2 }
     *     
     */
    public DerivativeForeignExchange2 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeForeignExchange2 }
     *     
     */
    public AssetClassAttributes1Choice setFX(DerivativeForeignExchange2 value) {
        this.fx = value;
        return this;
    }

    /**
     * Gets the value of the both property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassAttributes1 }
     *     
     */
    public AssetClassAttributes1 getBoth() {
        return both;
    }

    /**
     * Sets the value of the both property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassAttributes1 }
     *     
     */
    public AssetClassAttributes1Choice setBoth(AssetClassAttributes1 value) {
        this.both = value;
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
