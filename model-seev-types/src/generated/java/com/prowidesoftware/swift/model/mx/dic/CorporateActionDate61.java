
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
@XmlType(name = "CorporateActionDate61", propOrder = {
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
public class CorporateActionDate61 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat43Choice anncmntDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat43Choice certfctnDdln;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat43Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat43Choice earlyClsgDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat43Choice fctvDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat43Choice equlstnDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat43Choice frthrDtldAnncmntDt;
    @XmlElement(name = "FxgDt")
    protected DateFormat43Choice fxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat43Choice ltryDt;
    @XmlElement(name = "NewMtrtyDt")
    protected DateFormat43Choice newMtrtyDt;
    @XmlElement(name = "MtgDt")
    protected DateFormat43Choice mtgDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat43Choice mrgnFxgDt;
    @XmlElement(name = "PrratnDt")
    protected DateFormat43Choice prratnDt;
    @XmlElement(name = "RcrdDt")
    protected DateFormat43Choice rcrdDt;
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
    protected DateFormat43Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat43Choice whlyUcondlDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat43Choice exDvddDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat43Choice offclAnncmntPblctnDt;
    @XmlElement(name = "SpclExDt")
    protected DateFormat43Choice spclExDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat43Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyMktDdln")
    protected DateFormat43Choice elctnToCtrPtyMktDdln;
    @XmlElement(name = "ElctnToCtrPtyRspnDdln")
    protected DateFormat43Choice elctnToCtrPtyRspnDdln;
    @XmlElement(name = "LpsdDt")
    protected DateFormat43Choice lpsdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat43Choice pmtDt;
    @XmlElement(name = "ThrdPtyDdln")
    protected DateFormat43Choice thrdPtyDdln;
    @XmlElement(name = "EarlyThrdPtyDdln")
    protected DateFormat43Choice earlyThrdPtyDdln;
    @XmlElement(name = "MktClmTrckgEndDt")
    protected DateFormat43Choice mktClmTrckgEndDt;
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
    public CorporateActionDate61 setAnncmntDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setCertfctnDdln(DateFormat43Choice value) {
        this.certfctnDdln = value;
        return this;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setCrtApprvlDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setEarlyClsgDt(DateFormat43Choice value) {
        this.earlyClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setFctvDt(DateFormat43Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setEqulstnDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setFrthrDtldAnncmntDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setFxgDt(DateFormat43Choice value) {
        this.fxgDt = value;
        return this;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setLtryDt(DateFormat43Choice value) {
        this.ltryDt = value;
        return this;
    }

    /**
     * Gets the value of the newMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getNewMtrtyDt() {
        return newMtrtyDt;
    }

    /**
     * Sets the value of the newMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setNewMtrtyDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setMtgDt(DateFormat43Choice value) {
        this.mtgDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setMrgnFxgDt(DateFormat43Choice value) {
        this.mrgnFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setPrratnDt(DateFormat43Choice value) {
        this.prratnDt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setRcrdDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setRegnDdln(DateFormat43Choice value) {
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
    public CorporateActionDate61 setRsltsPblctnDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setDdlnToSplt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setDdlnForTaxBrkdwnInstr(DateFormat43Choice value) {
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
    public CorporateActionDate61 setTradgSspdDt(DateFormat43Choice value) {
        this.tradgSspdDt = value;
        return this;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setUcondlDt(DateFormat43Choice value) {
        this.ucondlDt = value;
        return this;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setWhlyUcondlDt(DateFormat43Choice value) {
        this.whlyUcondlDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setExDvddDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setOffclAnncmntPblctnDt(DateFormat43Choice value) {
        this.offclAnncmntPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setSpclExDt(DateFormat43Choice value) {
        this.spclExDt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setGrntedPrtcptnDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setElctnToCtrPtyMktDdln(DateFormat43Choice value) {
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
    public CorporateActionDate61 setElctnToCtrPtyRspnDdln(DateFormat43Choice value) {
        this.elctnToCtrPtyRspnDdln = value;
        return this;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setLpsdDt(DateFormat43Choice value) {
        this.lpsdDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setPmtDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setThrdPtyDdln(DateFormat43Choice value) {
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
    public CorporateActionDate61 setEarlyThrdPtyDdln(DateFormat43Choice value) {
        this.earlyThrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktClmTrckgEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMktClmTrckgEndDt() {
        return mktClmTrckgEndDt;
    }

    /**
     * Sets the value of the mktClmTrckgEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public CorporateActionDate61 setMktClmTrckgEndDt(DateFormat43Choice value) {
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
    public CorporateActionDate61 setLeadPlntffDdln(DateFormat43Choice value) {
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
    public CorporateActionDate61 setFilgDt(DateFormat30Choice value) {
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
    public CorporateActionDate61 setHrgDt(DateFormat30Choice value) {
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
