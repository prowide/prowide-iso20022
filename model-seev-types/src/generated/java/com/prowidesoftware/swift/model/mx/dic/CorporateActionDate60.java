
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
@XmlType(name = "CorporateActionDate60", propOrder = {
    "rspnDdln",
    "sbcptCostDbtDt",
    "mktDdln",
    "xpryDt",
    "coverXprtnDt",
    "prtctDt",
    "tradgDt"
})
public class CorporateActionDate60 {

    @XmlElement(name = "RspnDdln")
    protected DateFormat43Choice rspnDdln;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat43Choice sbcptCostDbtDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat43Choice mktDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat43Choice xpryDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat43Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat43Choice prtctDt;
    @XmlElement(name = "TradgDt")
    protected DateFormat43Choice tradgDt;

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setRspnDdln(DateFormat43Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setSbcptCostDbtDt(DateFormat43Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setMktDdln(DateFormat43Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setXpryDt(DateFormat43Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setCoverXprtnDt(DateFormat43Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setPrtctDt(DateFormat43Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getTradgDt() {
        return tradgDt;
    }

    /**
     * Sets the value of the tradgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate60 setTradgDt(DateFormat43Choice value) {
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
