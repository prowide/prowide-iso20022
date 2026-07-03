
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
@XmlType(name = "CorporateActionDate83", propOrder = {
    "anncmntDt",
    "certfctnDdln",
    "crtApprvlDt",
    "earlyClsgDt",
    "fctvDt",
    "equlstnDt",
    "frthrDtldAnncmntDt",
    "fxgDt",
    "ltryDt",
    "newMtrtyDt",
    "mtgDt",
    "mrgnFxgDt",
    "prratnDt",
    "rcrdDt",
    "regnDdln",
    "rsltsPblctnDt",
    "ddlnToSplt",
    "ddlnForTaxBrkdwnInstr",
    "tradgSspdDt",
    "ucondlDt",
    "whlyUcondlDt",
    "exDvddDt",
    "offclAnncmntPblctnDt",
    "spclExDt",
    "grntedPrtcptnDt",
    "elctnToCtrPtyMktDdln",
    "elctnToCtrPtyRspnDdln",
    "lpsdDt",
    "pmtDt",
    "thrdPtyDdln",
    "earlyThrdPtyDdln",
    "mktClmTrckgEndDt",
    "leadPlntffDdln",
    "filgDt",
    "hrgDt"
})
public class CorporateActionDate83 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat43Choice anncmntDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat43Choice certfctnDdln;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat30Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat43Choice earlyClsgDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat30Choice fctvDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat30Choice equlstnDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat43Choice frthrDtldAnncmntDt;
    @XmlElement(name = "FxgDt")
    protected DateFormat43Choice fxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat30Choice ltryDt;
    @XmlElement(name = "NewMtrtyDt")
    protected DateFormat30Choice newMtrtyDt;
    @XmlElement(name = "MtgDt")
    protected DateFormat43Choice mtgDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat30Choice mrgnFxgDt;
    @XmlElement(name = "PrratnDt")
    protected DateFormat30Choice prratnDt;
    @XmlElement(name = "RcrdDt")
    protected DateFormat30Choice rcrdDt;
    @XmlElement(name = "RegnDdln")
    protected DateFormat43Choice regnDdln;
    @XmlElement(name = "RsltsPblctnDt")
    protected DateFormat43Choice rsltsPblctnDt;
    @XmlElement(name = "DdlnToSplt")
    protected DateFormat43Choice ddlnToSplt;
    @XmlElement(name = "DdlnForTaxBrkdwnInstr")
    protected DateFormat43Choice ddlnForTaxBrkdwnInstr;
    @XmlElement(name = "TradgSspdDt")
    protected DateFormat43Choice tradgSspdDt;
    @XmlElement(name = "UcondlDt")
    protected DateFormat30Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat30Choice whlyUcondlDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat30Choice exDvddDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat43Choice offclAnncmntPblctnDt;
    @XmlElement(name = "SpclExDt")
    protected DateFormat30Choice spclExDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat30Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyMktDdln")
    protected DateFormat43Choice elctnToCtrPtyMktDdln;
    @XmlElement(name = "ElctnToCtrPtyRspnDdln")
    protected DateFormat43Choice elctnToCtrPtyRspnDdln;
    @XmlElement(name = "LpsdDt")
    protected DateFormat30Choice lpsdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat30Choice pmtDt;
    @XmlElement(name = "ThrdPtyDdln")
    protected DateFormat43Choice thrdPtyDdln;
    @XmlElement(name = "EarlyThrdPtyDdln")
    protected DateFormat43Choice earlyThrdPtyDdln;
    @XmlElement(name = "MktClmTrckgEndDt")
    protected DateFormat30Choice mktClmTrckgEndDt;
    @XmlElement(name = "LeadPlntffDdln")
    protected DateFormat43Choice leadPlntffDdln;
    @XmlElement(name = "FilgDt")
    protected DateFormat30Choice filgDt;
    @XmlElement(name = "HrgDt")
    protected DateFormat30Choice hrgDt;

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setAnncmntDt(DateFormat43Choice value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the certfctnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCertfctnDdln() {
        return certfctnDdln;
    }

    /**
     * Sets the value of the certfctnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setCertfctnDdln(DateFormat43Choice value) {
        this.certfctnDdln = value;
        return this;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setCrtApprvlDt(DateFormat30Choice value) {
        this.crtApprvlDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyClsgDt() {
        return earlyClsgDt;
    }

    /**
     * Sets the value of the earlyClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setEarlyClsgDt(DateFormat43Choice value) {
        this.earlyClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setFctvDt(DateFormat30Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setEqulstnDt(DateFormat30Choice value) {
        this.equlstnDt = value;
        return this;
    }

    /**
     * Gets the value of the frthrDtldAnncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getFrthrDtldAnncmntDt() {
        return frthrDtldAnncmntDt;
    }

    /**
     * Sets the value of the frthrDtldAnncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setFrthrDtldAnncmntDt(DateFormat43Choice value) {
        this.frthrDtldAnncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the fxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getFxgDt() {
        return fxgDt;
    }

    /**
     * Sets the value of the fxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setFxgDt(DateFormat43Choice value) {
        this.fxgDt = value;
        return this;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setLtryDt(DateFormat30Choice value) {
        this.ltryDt = value;
        return this;
    }

    /**
     * Gets the value of the newMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getNewMtrtyDt() {
        return newMtrtyDt;
    }

    /**
     * Sets the value of the newMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setNewMtrtyDt(DateFormat30Choice value) {
        this.newMtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the mtgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMtgDt() {
        return mtgDt;
    }

    /**
     * Sets the value of the mtgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setMtgDt(DateFormat43Choice value) {
        this.mtgDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setMrgnFxgDt(DateFormat30Choice value) {
        this.mrgnFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setPrratnDt(DateFormat30Choice value) {
        this.prratnDt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setRcrdDt(DateFormat30Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the regnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRegnDdln() {
        return regnDdln;
    }

    /**
     * Sets the value of the regnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setRegnDdln(DateFormat43Choice value) {
        this.regnDdln = value;
        return this;
    }

    /**
     * Gets the value of the rsltsPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRsltsPblctnDt() {
        return rsltsPblctnDt;
    }

    /**
     * Sets the value of the rsltsPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setRsltsPblctnDt(DateFormat43Choice value) {
        this.rsltsPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnToSplt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDdlnToSplt() {
        return ddlnToSplt;
    }

    /**
     * Sets the value of the ddlnToSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setDdlnToSplt(DateFormat43Choice value) {
        this.ddlnToSplt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getDdlnForTaxBrkdwnInstr() {
        return ddlnForTaxBrkdwnInstr;
    }

    /**
     * Sets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setDdlnForTaxBrkdwnInstr(DateFormat43Choice value) {
        this.ddlnForTaxBrkdwnInstr = value;
        return this;
    }

    /**
     * Gets the value of the tradgSspdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getTradgSspdDt() {
        return tradgSspdDt;
    }

    /**
     * Sets the value of the tradgSspdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setTradgSspdDt(DateFormat43Choice value) {
        this.tradgSspdDt = value;
        return this;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setUcondlDt(DateFormat30Choice value) {
        this.ucondlDt = value;
        return this;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setWhlyUcondlDt(DateFormat30Choice value) {
        this.whlyUcondlDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setExDvddDt(DateFormat30Choice value) {
        this.exDvddDt = value;
        return this;
    }

    /**
     * Gets the value of the offclAnncmntPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getOffclAnncmntPblctnDt() {
        return offclAnncmntPblctnDt;
    }

    /**
     * Sets the value of the offclAnncmntPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setOffclAnncmntPblctnDt(DateFormat43Choice value) {
        this.offclAnncmntPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setSpclExDt(DateFormat30Choice value) {
        this.spclExDt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setGrntedPrtcptnDt(DateFormat30Choice value) {
        this.grntedPrtcptnDt = value;
        return this;
    }

    /**
     * Gets the value of the elctnToCtrPtyMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getElctnToCtrPtyMktDdln() {
        return elctnToCtrPtyMktDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setElctnToCtrPtyMktDdln(DateFormat43Choice value) {
        this.elctnToCtrPtyMktDdln = value;
        return this;
    }

    /**
     * Gets the value of the elctnToCtrPtyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getElctnToCtrPtyRspnDdln() {
        return elctnToCtrPtyRspnDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setElctnToCtrPtyRspnDdln(DateFormat43Choice value) {
        this.elctnToCtrPtyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setLpsdDt(DateFormat30Choice value) {
        this.lpsdDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setPmtDt(DateFormat30Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getThrdPtyDdln() {
        return thrdPtyDdln;
    }

    /**
     * Sets the value of the thrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setThrdPtyDdln(DateFormat43Choice value) {
        this.thrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the earlyThrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyThrdPtyDdln() {
        return earlyThrdPtyDdln;
    }

    /**
     * Sets the value of the earlyThrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setEarlyThrdPtyDdln(DateFormat43Choice value) {
        this.earlyThrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktClmTrckgEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getMktClmTrckgEndDt() {
        return mktClmTrckgEndDt;
    }

    /**
     * Sets the value of the mktClmTrckgEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setMktClmTrckgEndDt(DateFormat30Choice value) {
        this.mktClmTrckgEndDt = value;
        return this;
    }

    /**
     * Gets the value of the leadPlntffDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getLeadPlntffDdln() {
        return leadPlntffDdln;
    }

    /**
     * Sets the value of the leadPlntffDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate83 setLeadPlntffDdln(DateFormat43Choice value) {
        this.leadPlntffDdln = value;
        return this;
    }

    /**
     * Gets the value of the filgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getFilgDt() {
        return filgDt;
    }

    /**
     * Sets the value of the filgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setFilgDt(DateFormat30Choice value) {
        this.filgDt = value;
        return this;
    }

    /**
     * Gets the value of the hrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getHrgDt() {
        return hrgDt;
    }

    /**
     * Sets the value of the hrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public CorporateActionDate83 setHrgDt(DateFormat30Choice value) {
        this.hrgDt = value;
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
