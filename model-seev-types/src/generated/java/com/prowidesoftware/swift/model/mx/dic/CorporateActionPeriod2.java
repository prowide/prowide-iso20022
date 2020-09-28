
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
 * Specifies periods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod2", propOrder = {
    "assntdLinePrd",
    "actnPrd",
    "prvlgSspnsnPrd",
    "parllTradgPrd",
    "sellThruIssrPrd",
    "rvcbltyPrd",
    "pricClctnPrd"
})
public class CorporateActionPeriod2 {

    @XmlElement(name = "AssntdLinePrd")
    protected Period1 assntdLinePrd;
    @XmlElement(name = "ActnPrd")
    protected Period1 actnPrd;
    @XmlElement(name = "PrvlgSspnsnPrd")
    protected Period1 prvlgSspnsnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period1 parllTradgPrd;
    @XmlElement(name = "SellThruIssrPrd")
    protected Period1 sellThruIssrPrd;
    @XmlElement(name = "RvcbltyPrd")
    protected Period1 rvcbltyPrd;
    @XmlElement(name = "PricClctnPrd")
    protected Period1 pricClctnPrd;

    /**
     * Gets the value of the assntdLinePrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getAssntdLinePrd() {
        return assntdLinePrd;
    }

    /**
     * Sets the value of the assntdLinePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod2 setAssntdLinePrd(Period1 value) {
        this.assntdLinePrd = value;
        return this;
    }

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
    public CorporateActionPeriod2 setActnPrd(Period1 value) {
        this.actnPrd = value;
        return this;
    }

    /**
     * Gets the value of the prvlgSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getPrvlgSspnsnPrd() {
        return prvlgSspnsnPrd;
    }

    /**
     * Sets the value of the prvlgSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod2 setPrvlgSspnsnPrd(Period1 value) {
        this.prvlgSspnsnPrd = value;
        return this;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod2 setParllTradgPrd(Period1 value) {
        this.parllTradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the sellThruIssrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getSellThruIssrPrd() {
        return sellThruIssrPrd;
    }

    /**
     * Sets the value of the sellThruIssrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod2 setSellThruIssrPrd(Period1 value) {
        this.sellThruIssrPrd = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getRvcbltyPrd() {
        return rvcbltyPrd;
    }

    /**
     * Sets the value of the rvcbltyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public CorporateActionPeriod2 setRvcbltyPrd(Period1 value) {
        this.rvcbltyPrd = value;
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
    public CorporateActionPeriod2 setPricClctnPrd(Period1 value) {
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
