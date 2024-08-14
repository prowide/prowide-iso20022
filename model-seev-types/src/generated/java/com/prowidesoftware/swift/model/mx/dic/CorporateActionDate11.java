
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
@XmlType(name = "CorporateActionDate11", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDt",
    "prtctDt",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt",
    "leadPlntffDdln"
})
public class CorporateActionDate11 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat9Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat9Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat9Choice prtctDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat9Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat10Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat9Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat9Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat9Choice dpstryCoverXprtnDt;
    @XmlElement(name = "LeadPlntffDdln")
    protected DateFormat9Choice leadPlntffDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setEarlyRspnDdln(DateFormat9Choice value) {
        this.earlyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setCoverXprtnDt(DateFormat9Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setPrtctDt(DateFormat9Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setMktDdln(DateFormat9Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat10Choice }
     *     
     */
    public DateFormat10Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat10Choice }
     *     
     */
    public CorporateActionDate11 setRspnDdln(DateFormat10Choice value) {
        this.rspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setXpryDt(DateFormat9Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the sbcptCostDbtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getSbcptCostDbtDt() {
        return sbcptCostDbtDt;
    }

    /**
     * Sets the value of the sbcptCostDbtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setSbcptCostDbtDt(DateFormat9Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setDpstryCoverXprtnDt(DateFormat9Choice value) {
        this.dpstryCoverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the leadPlntffDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getLeadPlntffDdln() {
        return leadPlntffDdln;
    }

    /**
     * Sets the value of the leadPlntffDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate11 setLeadPlntffDdln(DateFormat9Choice value) {
        this.leadPlntffDdln = value;
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
