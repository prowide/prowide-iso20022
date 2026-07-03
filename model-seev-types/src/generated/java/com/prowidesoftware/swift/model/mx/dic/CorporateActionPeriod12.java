
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
 * Specifies periods related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod12", propOrder = {
    "pricClctnPrd",
    "parllTradgPrd",
    "actnPrd",
    "rvcbltyPrd",
    "prvlgSspnsnPrd",
    "acctSvcrRvcbltyPrd",
    "dpstrySspnsnPrdForWdrwl"
})
public class CorporateActionPeriod12 {

    @XmlElement(name = "PricClctnPrd")
    protected Period6Choice pricClctnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period6Choice parllTradgPrd;
    @XmlElement(name = "ActnPrd")
    protected Period6Choice actnPrd;
    @XmlElement(name = "RvcbltyPrd")
    protected Period6Choice rvcbltyPrd;
    @XmlElement(name = "PrvlgSspnsnPrd")
    protected Period6Choice prvlgSspnsnPrd;
    @XmlElement(name = "AcctSvcrRvcbltyPrd")
    protected Period6Choice acctSvcrRvcbltyPrd;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwl")
    protected Period6Choice dpstrySspnsnPrdForWdrwl;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod12 setPricClctnPrd(Period6Choice value) {
        this.pricClctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod12 setParllTradgPrd(Period6Choice value) {
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
    public CorporateActionPeriod12 setActnPrd(Period6Choice value) {
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
    public CorporateActionPeriod12 setRvcbltyPrd(Period6Choice value) {
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
    public CorporateActionPeriod12 setPrvlgSspnsnPrd(Period6Choice value) {
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
    public CorporateActionPeriod12 setAcctSvcrRvcbltyPrd(Period6Choice value) {
        this.acctSvcrRvcbltyPrd = value;
        return this;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwl property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwl() {
        return dpstrySspnsnPrdForWdrwl;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public CorporateActionPeriod12 setDpstrySspnsnPrdForWdrwl(Period6Choice value) {
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
