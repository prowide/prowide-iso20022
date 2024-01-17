
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
@XmlType(name = "CorporateActionDate1", propOrder = {
    "anncmntDt",
    "certfctnDdln",
    "crtApprvlDt",
    "earlyClsgDt",
    "fctvDt",
    "equlstnDt",
    "frthrDtldAnncmntDt",
    "indxFxgDt",
    "ltryDt",
    "mtrtyDt",
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
    "elctnToCtrPtyDdln",
    "lpsdDt",
    "pmtDt",
    "thrdPtyDdln",
    "earlyThrdPtyDdln",
    "mktClmTrckgEndDt"
})
public class CorporateActionDate1 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat6Choice anncmntDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat6Choice certfctnDdln;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat6Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat6Choice earlyClsgDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat6Choice fctvDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat6Choice equlstnDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat6Choice frthrDtldAnncmntDt;
    @XmlElement(name = "IndxFxgDt")
    protected DateFormat6Choice indxFxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat6Choice ltryDt;
    @XmlElement(name = "MtrtyDt")
    protected DateFormat6Choice mtrtyDt;
    @XmlElement(name = "MtgDt")
    protected DateFormat6Choice mtgDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat6Choice mrgnFxgDt;
    @XmlElement(name = "PrratnDt")
    protected DateFormat6Choice prratnDt;
    @XmlElement(name = "RcrdDt")
    protected DateFormat6Choice rcrdDt;
    @XmlElement(name = "RegnDdln")
    protected DateFormat6Choice regnDdln;
    @XmlElement(name = "RsltsPblctnDt")
    protected DateFormat6Choice rsltsPblctnDt;
    @XmlElement(name = "DdlnToSplt")
    protected DateFormat6Choice ddlnToSplt;
    @XmlElement(name = "DdlnForTaxBrkdwnInstr")
    protected DateFormat6Choice ddlnForTaxBrkdwnInstr;
    @XmlElement(name = "TradgSspdDt")
    protected DateFormat6Choice tradgSspdDt;
    @XmlElement(name = "UcondlDt")
    protected DateFormat6Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat6Choice whlyUcondlDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat6Choice exDvddDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat6Choice offclAnncmntPblctnDt;
    @XmlElement(name = "SpclExDt")
    protected DateFormat6Choice spclExDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat6Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyDdln")
    protected DateFormat6Choice elctnToCtrPtyDdln;
    @XmlElement(name = "LpsdDt")
    protected DateFormat6Choice lpsdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat6Choice pmtDt;
    @XmlElement(name = "ThrdPtyDdln")
    protected DateFormat6Choice thrdPtyDdln;
    @XmlElement(name = "EarlyThrdPtyDdln")
    protected DateFormat6Choice earlyThrdPtyDdln;
    @XmlElement(name = "MktClmTrckgEndDt")
    protected DateFormat6Choice mktClmTrckgEndDt;

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setAnncmntDt(DateFormat6Choice value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the certfctnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getCertfctnDdln() {
        return certfctnDdln;
    }

    /**
     * Sets the value of the certfctnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setCertfctnDdln(DateFormat6Choice value) {
        this.certfctnDdln = value;
        return this;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setCrtApprvlDt(DateFormat6Choice value) {
        this.crtApprvlDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getEarlyClsgDt() {
        return earlyClsgDt;
    }

    /**
     * Sets the value of the earlyClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setEarlyClsgDt(DateFormat6Choice value) {
        this.earlyClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setFctvDt(DateFormat6Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setEqulstnDt(DateFormat6Choice value) {
        this.equlstnDt = value;
        return this;
    }

    /**
     * Gets the value of the frthrDtldAnncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getFrthrDtldAnncmntDt() {
        return frthrDtldAnncmntDt;
    }

    /**
     * Sets the value of the frthrDtldAnncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setFrthrDtldAnncmntDt(DateFormat6Choice value) {
        this.frthrDtldAnncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the indxFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getIndxFxgDt() {
        return indxFxgDt;
    }

    /**
     * Sets the value of the indxFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setIndxFxgDt(DateFormat6Choice value) {
        this.indxFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setLtryDt(DateFormat6Choice value) {
        this.ltryDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setMtrtyDt(DateFormat6Choice value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the mtgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getMtgDt() {
        return mtgDt;
    }

    /**
     * Sets the value of the mtgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setMtgDt(DateFormat6Choice value) {
        this.mtgDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setMrgnFxgDt(DateFormat6Choice value) {
        this.mrgnFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setPrratnDt(DateFormat6Choice value) {
        this.prratnDt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setRcrdDt(DateFormat6Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the regnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getRegnDdln() {
        return regnDdln;
    }

    /**
     * Sets the value of the regnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setRegnDdln(DateFormat6Choice value) {
        this.regnDdln = value;
        return this;
    }

    /**
     * Gets the value of the rsltsPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getRsltsPblctnDt() {
        return rsltsPblctnDt;
    }

    /**
     * Sets the value of the rsltsPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setRsltsPblctnDt(DateFormat6Choice value) {
        this.rsltsPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnToSplt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getDdlnToSplt() {
        return ddlnToSplt;
    }

    /**
     * Sets the value of the ddlnToSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setDdlnToSplt(DateFormat6Choice value) {
        this.ddlnToSplt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getDdlnForTaxBrkdwnInstr() {
        return ddlnForTaxBrkdwnInstr;
    }

    /**
     * Sets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setDdlnForTaxBrkdwnInstr(DateFormat6Choice value) {
        this.ddlnForTaxBrkdwnInstr = value;
        return this;
    }

    /**
     * Gets the value of the tradgSspdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getTradgSspdDt() {
        return tradgSspdDt;
    }

    /**
     * Sets the value of the tradgSspdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setTradgSspdDt(DateFormat6Choice value) {
        this.tradgSspdDt = value;
        return this;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setUcondlDt(DateFormat6Choice value) {
        this.ucondlDt = value;
        return this;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setWhlyUcondlDt(DateFormat6Choice value) {
        this.whlyUcondlDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setExDvddDt(DateFormat6Choice value) {
        this.exDvddDt = value;
        return this;
    }

    /**
     * Gets the value of the offclAnncmntPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getOffclAnncmntPblctnDt() {
        return offclAnncmntPblctnDt;
    }

    /**
     * Sets the value of the offclAnncmntPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setOffclAnncmntPblctnDt(DateFormat6Choice value) {
        this.offclAnncmntPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setSpclExDt(DateFormat6Choice value) {
        this.spclExDt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setGrntedPrtcptnDt(DateFormat6Choice value) {
        this.grntedPrtcptnDt = value;
        return this;
    }

    /**
     * Gets the value of the elctnToCtrPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getElctnToCtrPtyDdln() {
        return elctnToCtrPtyDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setElctnToCtrPtyDdln(DateFormat6Choice value) {
        this.elctnToCtrPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setLpsdDt(DateFormat6Choice value) {
        this.lpsdDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setPmtDt(DateFormat6Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getThrdPtyDdln() {
        return thrdPtyDdln;
    }

    /**
     * Sets the value of the thrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setThrdPtyDdln(DateFormat6Choice value) {
        this.thrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the earlyThrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getEarlyThrdPtyDdln() {
        return earlyThrdPtyDdln;
    }

    /**
     * Sets the value of the earlyThrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setEarlyThrdPtyDdln(DateFormat6Choice value) {
        this.earlyThrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktClmTrckgEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat6Choice }
     *     
     */
    public DateFormat6Choice getMktClmTrckgEndDt() {
        return mktClmTrckgEndDt;
    }

    /**
     * Sets the value of the mktClmTrckgEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat6Choice }
     *     
     */
    public CorporateActionDate1 setMktClmTrckgEndDt(DateFormat6Choice value) {
        this.mktClmTrckgEndDt = value;
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
