
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
 * Specifies periods related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod18", propOrder = {
    "pricClctnPrd",
    "parllTradgPrd",
    "actnPrd",
    "rvcbltyPrd",
    "prvlgSspnsnPrd",
    "acctSvcrRvcbltyPrd",
    "dpstrySspnsnPrdForWdrwl"
})
public class CorporateActionPeriod18 {

    @XmlElement(name = "PricClctnPrd")
    protected Period12Choice pricClctnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period12Choice parllTradgPrd;
    @XmlElement(name = "ActnPrd")
    protected Period6Choice actnPrd;
    @XmlElement(name = "RvcbltyPrd")
    protected Period6Choice rvcbltyPrd;
    @XmlElement(name = "PrvlgSspnsnPrd")
    protected Period6Choice prvlgSspnsnPrd;
    @XmlElement(name = "AcctSvcrRvcbltyPrd")
    protected Period6Choice acctSvcrRvcbltyPrd;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwl")
    protected Period12Choice dpstrySspnsnPrdForWdrwl;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod18 setPricClctnPrd(Period12Choice value) {
        this.pricClctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod18 setParllTradgPrd(Period12Choice value) {
        this.parllTradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod18 setActnPrd(Period6Choice value) {
        this.actnPrd = value;
        return this;
    }

    /**
     * Gets the value of the rvcbltyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getRvcbltyPrd() {
        return rvcbltyPrd;
    }

    /**
     * Sets the value of the rvcbltyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod18 setRvcbltyPrd(Period6Choice value) {
        this.rvcbltyPrd = value;
        return this;
    }

    /**
     * Gets the value of the prvlgSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getPrvlgSspnsnPrd() {
        return prvlgSspnsnPrd;
    }

    /**
     * Sets the value of the prvlgSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod18 setPrvlgSspnsnPrd(Period6Choice value) {
        this.prvlgSspnsnPrd = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrRvcbltyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getAcctSvcrRvcbltyPrd() {
        return acctSvcrRvcbltyPrd;
    }

    /**
     * Sets the value of the acctSvcrRvcbltyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod18 setAcctSvcrRvcbltyPrd(Period6Choice value) {
        this.acctSvcrRvcbltyPrd = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwl property.
     * 
     * @return
     *     possible object is
     *     {@link Period12Choice }
     *     
     */
    public Period12Choice getDpstrySspnsnPrdForWdrwl() {
        return dpstrySspnsnPrdForWdrwl;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period12Choice }
     *     
     */
    public CorporateActionPeriod18 setDpstrySspnsnPrdForWdrwl(Period12Choice value) {
        this.dpstrySspnsnPrdForWdrwl = value;
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
