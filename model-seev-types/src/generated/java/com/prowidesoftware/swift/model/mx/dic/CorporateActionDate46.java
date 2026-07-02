
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
@XmlType(name = "CorporateActionDate46", propOrder = {
    "rspnDdln",
    "sbcptCostDbtDt",
    "mktDdln",
    "xpryDt",
    "coverXprtnDt",
    "prtctDt",
    "tradgDt"
})
public class CorporateActionDate46 {

    @XmlElement(name = "RspnDdln")
    protected DateFormat31Choice rspnDdln;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat31Choice sbcptCostDbtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat31Choice mktDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat31Choice xpryDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat31Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat31Choice prtctDt;
    @XmlElement(name = "TradgDt")
    protected DateFormat31Choice tradgDt;

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setRspnDdln(DateFormat31Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setSbcptCostDbtDt(DateFormat31Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setMktDdln(DateFormat31Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setXpryDt(DateFormat31Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setCoverXprtnDt(DateFormat31Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setPrtctDt(DateFormat31Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat31Choice }
     *     
     */
    public DateFormat31Choice getTradgDt() {
        return tradgDt;
    }

    /**
     * Sets the value of the tradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat31Choice }
     *     
     */
    public CorporateActionDate46 setTradgDt(DateFormat31Choice value) {
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
