
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
@XmlType(name = "CorporateActionDate2", propOrder = {
    "rcrdDt",
    "fctvDt",
    "coverXprtnDt",
    "equlstnDt",
    "mrgnFxgDt",
    "ltryDt",
    "prtctDt",
    "ucondlDt",
    "whlyUcondlDt",
    "rsltsPblctnDt",
    "crtApprvlDt",
    "earlyClsgDt",
    "exDvddDt",
    "indxFxgDt",
    "mtrtyDt",
    "tradgSspdDt",
    "certfctnDdln",
    "redDt",
    "regnDdln",
    "prratnDt",
    "ddlnForTaxBrkdwnInstr",
    "lpsdDt",
    "grntedPrtcptnDt",
    "elctnToCtrPtyDdln",
    "spclExDt"
})
public class CorporateActionDate2 {

    @XmlElement(name = "RcrdDt")
    protected DateFormat4Choice rcrdDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat4Choice fctvDt;
    @XmlElement(name = "CoverXprtnDt")
    protected DateFormat4Choice coverXprtnDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat4Choice equlstnDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat4Choice mrgnFxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat4Choice ltryDt;
    @XmlElement(name = "PrtctDt")
    protected DateFormat4Choice prtctDt;
    @XmlElement(name = "UcondlDt")
    protected DateFormat4Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat4Choice whlyUcondlDt;
    @XmlElement(name = "RsltsPblctnDt")
    protected DateFormat4Choice rsltsPblctnDt;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat4Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat4Choice earlyClsgDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat4Choice exDvddDt;
    @XmlElement(name = "IndxFxgDt")
    protected DateFormat4Choice indxFxgDt;
    @XmlElement(name = "MtrtyDt")
    protected DateFormat4Choice mtrtyDt;
    @XmlElement(name = "TradgSspdDt")
    protected DateFormat4Choice tradgSspdDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat4Choice certfctnDdln;
    @XmlElement(name = "RedDt")
    protected DateFormat4Choice redDt;
    @XmlElement(name = "RegnDdln")
    protected DateFormat4Choice regnDdln;
    @XmlElement(name = "PrratnDt")
    protected DateFormat4Choice prratnDt;
    @XmlElement(name = "DdlnForTaxBrkdwnInstr")
    protected DateFormat4Choice ddlnForTaxBrkdwnInstr;
    @XmlElement(name = "LpsdDt")
    protected DateFormat4Choice lpsdDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat4Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyDdln")
    protected DateFormat4Choice elctnToCtrPtyDdln;
    @XmlElement(name = "SpclExDt")
    protected DateFormat4Choice spclExDt;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setRcrdDt(DateFormat4Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setFctvDt(DateFormat4Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the coverXprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCoverXprtnDt() {
        return coverXprtnDt;
    }

    /**
     * Sets the value of the coverXprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setCoverXprtnDt(DateFormat4Choice value) {
        this.coverXprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setEqulstnDt(DateFormat4Choice value) {
        this.equlstnDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setMrgnFxgDt(DateFormat4Choice value) {
        this.mrgnFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setLtryDt(DateFormat4Choice value) {
        this.ltryDt = value;
        return this;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setPrtctDt(DateFormat4Choice value) {
        this.prtctDt = value;
        return this;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setUcondlDt(DateFormat4Choice value) {
        this.ucondlDt = value;
        return this;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setWhlyUcondlDt(DateFormat4Choice value) {
        this.whlyUcondlDt = value;
        return this;
    }

    /**
     * Gets the value of the rsltsPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRsltsPblctnDt() {
        return rsltsPblctnDt;
    }

    /**
     * Sets the value of the rsltsPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setRsltsPblctnDt(DateFormat4Choice value) {
        this.rsltsPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setCrtApprvlDt(DateFormat4Choice value) {
        this.crtApprvlDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getEarlyClsgDt() {
        return earlyClsgDt;
    }

    /**
     * Sets the value of the earlyClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setEarlyClsgDt(DateFormat4Choice value) {
        this.earlyClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setExDvddDt(DateFormat4Choice value) {
        this.exDvddDt = value;
        return this;
    }

    /**
     * Gets the value of the indxFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getIndxFxgDt() {
        return indxFxgDt;
    }

    /**
     * Sets the value of the indxFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setIndxFxgDt(DateFormat4Choice value) {
        this.indxFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setMtrtyDt(DateFormat4Choice value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgSspdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getTradgSspdDt() {
        return tradgSspdDt;
    }

    /**
     * Sets the value of the tradgSspdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setTradgSspdDt(DateFormat4Choice value) {
        this.tradgSspdDt = value;
        return this;
    }

    /**
     * Gets the value of the certfctnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getCertfctnDdln() {
        return certfctnDdln;
    }

    /**
     * Sets the value of the certfctnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setCertfctnDdln(DateFormat4Choice value) {
        this.certfctnDdln = value;
        return this;
    }

    /**
     * Gets the value of the redDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRedDt() {
        return redDt;
    }

    /**
     * Sets the value of the redDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setRedDt(DateFormat4Choice value) {
        this.redDt = value;
        return this;
    }

    /**
     * Gets the value of the regnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getRegnDdln() {
        return regnDdln;
    }

    /**
     * Sets the value of the regnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setRegnDdln(DateFormat4Choice value) {
        this.regnDdln = value;
        return this;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setPrratnDt(DateFormat4Choice value) {
        this.prratnDt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getDdlnForTaxBrkdwnInstr() {
        return ddlnForTaxBrkdwnInstr;
    }

    /**
     * Sets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setDdlnForTaxBrkdwnInstr(DateFormat4Choice value) {
        this.ddlnForTaxBrkdwnInstr = value;
        return this;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setLpsdDt(DateFormat4Choice value) {
        this.lpsdDt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setGrntedPrtcptnDt(DateFormat4Choice value) {
        this.grntedPrtcptnDt = value;
        return this;
    }

    /**
     * Gets the value of the elctnToCtrPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getElctnToCtrPtyDdln() {
        return elctnToCtrPtyDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setElctnToCtrPtyDdln(DateFormat4Choice value) {
        this.elctnToCtrPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat4Choice }
     *     
     */
    public DateFormat4Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat4Choice }
     *     
     */
    public CorporateActionDate2 setSpclExDt(DateFormat4Choice value) {
        this.spclExDt = value;
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
