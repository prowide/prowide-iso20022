
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
@XmlType(name = "CorporateActionPeriod1", propOrder = {
    "actnPrd",
    "cmplsryPurchsPrd",
    "intrstPrd",
    "blckgPrd",
    "pricClctnPrd"
})
public class CorporateActionPeriod1 {

    @XmlElement(name = "ActnPrd")
    protected Period1 actnPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period1 cmplsryPurchsPrd;
    @XmlElement(name = "IntrstPrd")
    protected Period1 intrstPrd;
    @XmlElement(name = "BlckgPrd")
    protected Period1 blckgPrd;
    @XmlElement(name = "PricClctnPrd")
    protected Period1 pricClctnPrd;

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod1 setActnPrd(Period1 value) {
        this.actnPrd = value;
        return this;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod1 setCmplsryPurchsPrd(Period1 value) {
        this.cmplsryPurchsPrd = value;
        return this;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod1 setIntrstPrd(Period1 value) {
        this.intrstPrd = value;
        return this;
    }

    /**
     * Gets the value of the blckgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getBlckgPrd() {
        return blckgPrd;
    }

    /**
     * Sets the value of the blckgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod1 setBlckgPrd(Period1 value) {
        this.blckgPrd = value;
        return this;
    }

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod1 setPricClctnPrd(Period1 value) {
        this.pricClctnPrd = value;
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
