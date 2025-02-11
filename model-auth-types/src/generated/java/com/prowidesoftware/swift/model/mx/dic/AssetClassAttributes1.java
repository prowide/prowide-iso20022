
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
 * Asset class specific details of a derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassAttributes1", propOrder = {
    "intrst",
    "fx"
})
public class AssetClassAttributes1 {

    @XmlElement(name = "Intrst", required = true)
    protected DerivativeInterest2 intrst;
    @XmlElement(name = "FX", required = true)
    protected DerivativeForeignExchange2 fx;

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
    public AssetClassAttributes1 setIntrst(DerivativeInterest2 value) {
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
    public AssetClassAttributes1 setFX(DerivativeForeignExchange2 value) {
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
