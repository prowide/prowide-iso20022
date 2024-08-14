
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
@XmlType(name = "CorporateActionDate16", propOrder = {
    "earlyRspnDdln",
    "coverXprtnDt",
    "prtctDt",
    "mktDdln",
    "rspnDdln",
    "xpryDt",
    "sbcptCostDbtDt",
    "dpstryCoverXprtnDt"
})
public class CorporateActionDate16 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat22Choice earlyRspnDdln;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat22Choice coverXprtnDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat22Choice prtctDt;
    @XmlElement(name = "MktDdln")
    protected DateFormat22Choice mktDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat23Choice rspnDdln;
    @XmlElement(name = "XpryDt")
    protected DateFormat22Choice xpryDt;
    @XmlElement(name = "SbcptCostDbtDt")
    protected DateFormat22Choice sbcptCostDbtDt;
    @XmlElement(name = "DpstryCoverXprtnDt")
    protected DateFormat22Choice dpstryCoverXprtnDt;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate16 setEarlyRspnDdln(DateFormat22Choice value) {
        this.earlyRspnDdln = value;
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
    public CorporateActionDate16 setCoverXprtnDt(DateFormat22Choice value) {
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
    public CorporateActionDate16 setPrtctDt(DateFormat22Choice value) {
        this.prtctDt = value;
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
    public CorporateActionDate16 setMktDdln(DateFormat22Choice value) {
        this.mktDdln = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat23Choice }
     *     
     */
    public DateFormat23Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat23Choice }
     *     
     */
    public CorporateActionDate16 setRspnDdln(DateFormat23Choice value) {
        this.rspnDdln = value;
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
    public CorporateActionDate16 setXpryDt(DateFormat22Choice value) {
        this.xpryDt = value;
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
    public CorporateActionDate16 setSbcptCostDbtDt(DateFormat22Choice value) {
        this.sbcptCostDbtDt = value;
        return this;
    }

    /**
     * Gets the value of the dpstryCoverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat22Choice }
     *     
     */
    public DateFormat22Choice getDpstryCoverXprtnDt() {
        return dpstryCoverXprtnDt;
    }

    /**
     * Sets the value of the dpstryCoverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat22Choice }
     *     
     */
    public CorporateActionDate16 setDpstryCoverXprtnDt(DateFormat22Choice value) {
        this.dpstryCoverXprtnDt = value;
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
