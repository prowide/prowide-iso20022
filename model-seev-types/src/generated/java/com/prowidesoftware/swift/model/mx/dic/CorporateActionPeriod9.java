
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
 * Specifies periods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod9", propOrder = {
    "pricClctnPrd",
    "actnPrd",
    "parllTradgPrd"
})
public class CorporateActionPeriod9 {

    @XmlElement(name = "PricClctnPrd")
    protected Period5 pricClctnPrd;
    @XmlElement(name = "ActnPrd")
    protected Period5 actnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period5 parllTradgPrd;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period5 }
     *     
     */
    public Period5 getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period5 }
     *     
     */
    public CorporateActionPeriod9 setPricClctnPrd(Period5 value) {
        this.pricClctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period5 }
     *     
     */
    public Period5 getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period5 }
     *     
     */
    public CorporateActionPeriod9 setActnPrd(Period5 value) {
        this.actnPrd = value;
        return this;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period5 }
     *     
     */
    public Period5 getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period5 }
     *     
     */
    public CorporateActionPeriod9 setParllTradgPrd(Period5 value) {
        this.parllTradgPrd = value;
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
