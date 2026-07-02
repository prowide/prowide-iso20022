
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
@XmlType(name = "CorporateActionDate19", propOrder = {
    "rspnDdln",
    "sbcptCostDbtDt",
    "mktDdln",
    "xpryDt",
    "coverXprtnDt",
    "prtctDt",
    "tradgDt"
})
public class CorporateActionDate19 {

    @XmlElement(name = "RspnDdln")
    protected DateFormat22Choice rspnDdln;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat22Choice sbcptCostDbtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat22Choice mktDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat22Choice xpryDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat22Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat22Choice prtctDt;
    @XmlElement(name = "TradgDt")
    protected DateFormat22Choice tradgDt;

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setRspnDdln(DateFormat22Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setSbcptCostDbtDt(DateFormat22Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setMktDdln(DateFormat22Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setXpryDt(DateFormat22Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setCoverXprtnDt(DateFormat22Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setPrtctDt(DateFormat22Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getTradgDt() {
        return tradgDt;
    }

    /**
     * Sets the value of the tradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate19 setTradgDt(DateFormat22Choice value) {
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
