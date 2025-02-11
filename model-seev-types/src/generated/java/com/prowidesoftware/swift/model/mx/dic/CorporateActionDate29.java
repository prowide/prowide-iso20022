
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate29", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDt",
    "prtctDt",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt",
    "stockLndgDdln"
})
public class CorporateActionDate29 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat19Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat19Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat19Choice prtctDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat19Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat20Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat19Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat19Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat19Choice dpstryCoverXprtnDt;
    @XmlElement(name = "StockLndgDdln")
    protected DateFormat19Choice stockLndgDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setEarlyRspnDdln(DateFormat19Choice value) {
        this.earlyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setCoverXprtnDt(DateFormat19Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setPrtctDt(DateFormat19Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setMktDdln(DateFormat19Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat20Choice }
     *     
     */
    public DateFormat20Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat20Choice }
     *     
     */
    public CorporateActionDate29 setRspnDdln(DateFormat20Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setXpryDt(DateFormat19Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setSbcptCostDbtDt(DateFormat19Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setDpstryCoverXprtnDt(DateFormat19Choice value) {
        this.dpstryCoverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat19Choice }
     *     
     */
    public DateFormat19Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat19Choice }
     *     
     */
    public CorporateActionDate29 setStockLndgDdln(DateFormat19Choice value) {
        this.stockLndgDdln = value;
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
