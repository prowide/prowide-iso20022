
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
 * Specifies corporate action date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate68", propOrder = {
    "rspnDdln",
    "sbcptCostDbtDt",
    "mktDdln",
    "xpryDt",
    "coverXprtnDt",
    "prtctDt",
    "tradgDt"
})
public class CorporateActionDate68 {

    @XmlElement(name = "RspnDdln")
    protected DateFormat49Choice rspnDdln;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat49Choice sbcptCostDbtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat49Choice mktDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat49Choice xpryDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat49Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat49Choice prtctDt;
    @XmlElement(name = "TradgDt")
    protected DateFormat49Choice tradgDt;

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setRspnDdln(DateFormat49Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setSbcptCostDbtDt(DateFormat49Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setMktDdln(DateFormat49Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setXpryDt(DateFormat49Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setCoverXprtnDt(DateFormat49Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setPrtctDt(DateFormat49Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getTradgDt() {
        return tradgDt;
    }

    /**
     * Sets the value of the tradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public CorporateActionDate68 setTradgDt(DateFormat49Choice value) {
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
