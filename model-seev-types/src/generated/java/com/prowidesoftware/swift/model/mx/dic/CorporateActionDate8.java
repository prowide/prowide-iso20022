
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
 * Specifies corporate action dates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate8", propOrder = {
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
public class CorporateActionDate8 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat6Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat6Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat6Choice prtctDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat6Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat7Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat6Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat6Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat6Choice dpstryCoverXprtnDt;
    @XmlElement(name = "LeadPlntffDdln")
    protected DateFormat6Choice leadPlntffDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate8 setEarlyRspnDdln(DateFormat6Choice value) {
        this.earlyRspnDdln = value;
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
    public CorporateActionDate8 setCoverXprtnDt(DateFormat6Choice value) {
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
    public CorporateActionDate8 setPrtctDt(DateFormat6Choice value) {
        this.prtctDt = value;
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
    public CorporateActionDate8 setMktDdln(DateFormat6Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat7Choice }
     *     
     */
    public DateFormat7Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat7Choice }
     *     
     */
    public CorporateActionDate8 setRspnDdln(DateFormat7Choice value) {
        this.rspnDdln = value;
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
    public CorporateActionDate8 setXpryDt(DateFormat6Choice value) {
        this.xpryDt = value;
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
    public CorporateActionDate8 setSbcptCostDbtDt(DateFormat6Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate8 setDpstryCoverXprtnDt(DateFormat6Choice value) {
        this.dpstryCoverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the leadPlntffDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getLeadPlntffDdln() {
        return leadPlntffDdln;
    }

    /**
     * Sets the value of the leadPlntffDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate8 setLeadPlntffDdln(DateFormat6Choice value) {
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
