
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
 * Specifies corporate action date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate6", propOrder = {
    "rspnDdln",
    "sbcptCostDbtDt",
    "mktDdln",
    "xpryDt",
    "coverXprtnDt",
    "prtctDt",
    "tradgDt"
})
public class CorporateActionDate6 {

    @XmlElement(name = "RspnDdln")
    protected DateFormat6Choice rspnDdln;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat6Choice sbcptCostDbtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat6Choice mktDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat6Choice xpryDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat6Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat6Choice prtctDt;
    @XmlElement(name = "TradgDt")
    protected DateFormat6Choice tradgDt;

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setRspnDdln(DateFormat6Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setSbcptCostDbtDt(DateFormat6Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setMktDdln(DateFormat6Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setXpryDt(DateFormat6Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setCoverXprtnDt(DateFormat6Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setPrtctDt(DateFormat6Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getTradgDt() {
        return tradgDt;
    }

    /**
     * Sets the value of the tradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate6 setTradgDt(DateFormat6Choice value) {
        this.tradgDt = value;
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
