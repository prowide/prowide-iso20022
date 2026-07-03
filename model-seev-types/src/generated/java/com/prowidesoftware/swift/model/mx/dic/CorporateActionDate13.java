
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
@XmlType(name = "CorporateActionDate13", propOrder = {
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
public class CorporateActionDate13 {

    @XmlElement(name = "AnncmntDt")
    protected DateFormat9Choice anncmntDt;
    @XmlElement(name = "CertfctnDdln")
    protected DateFormat9Choice certfctnDdln;
    @XmlElement(name = "CrtApprvlDt")
    protected DateFormat9Choice crtApprvlDt;
    @XmlElement(name = "EarlyClsgDt")
    protected DateFormat9Choice earlyClsgDt;
    @XmlElement(name = "FctvDt")
    protected DateFormat9Choice fctvDt;
    @XmlElement(name = "EqulstnDt")
    protected DateFormat9Choice equlstnDt;
    @XmlElement(name = "FrthrDtldAnncmntDt")
    protected DateFormat9Choice frthrDtldAnncmntDt;
    @XmlElement(name = "IndxFxgDt")
    protected DateFormat9Choice indxFxgDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat9Choice ltryDt;
    @XmlElement(name = "MtrtyDt")
    protected DateFormat9Choice mtrtyDt;
    @XmlElement(name = "MtgDt")
    protected DateFormat9Choice mtgDt;
    @XmlElement(name = "MrgnFxgDt")
    protected DateFormat9Choice mrgnFxgDt;
    @XmlElement(name = "PrratnDt")
    protected DateFormat9Choice prratnDt;
    @XmlElement(name = "RcrdDt")
    protected DateFormat9Choice rcrdDt;
    @XmlElement(name = "RegnDdln")
    protected DateFormat9Choice regnDdln;
    @XmlElement(name = "RsltsPblctnDt")
    protected DateFormat9Choice rsltsPblctnDt;
    @XmlElement(name = "DdlnToSplt")
    protected DateFormat9Choice ddlnToSplt;
    @XmlElement(name = "DdlnForTaxBrkdwnInstr")
    protected DateFormat9Choice ddlnForTaxBrkdwnInstr;
    @XmlElement(name = "TradgSspdDt")
    protected DateFormat9Choice tradgSspdDt;
    @XmlElement(name = "UcondlDt")
    protected DateFormat9Choice ucondlDt;
    @XmlElement(name = "WhlyUcondlDt")
    protected DateFormat9Choice whlyUcondlDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat9Choice exDvddDt;
    @XmlElement(name = "OffclAnncmntPblctnDt")
    protected DateFormat9Choice offclAnncmntPblctnDt;
    @XmlElement(name = "SpclExDt")
    protected DateFormat9Choice spclExDt;
    @XmlElement(name = "GrntedPrtcptnDt")
    protected DateFormat9Choice grntedPrtcptnDt;
    @XmlElement(name = "ElctnToCtrPtyDdln")
    protected DateFormat9Choice elctnToCtrPtyDdln;
    @XmlElement(name = "LpsdDt")
    protected DateFormat9Choice lpsdDt;
    @XmlElement(name = "PmtDt")
    protected DateFormat9Choice pmtDt;
    @XmlElement(name = "ThrdPtyDdln")
    protected DateFormat9Choice thrdPtyDdln;
    @XmlElement(name = "EarlyThrdPtyDdln")
    protected DateFormat9Choice earlyThrdPtyDdln;
    @XmlElement(name = "MktClmTrckgEndDt")
    protected DateFormat9Choice mktClmTrckgEndDt;

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setAnncmntDt(DateFormat9Choice value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the certfctnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getCertfctnDdln() {
        return certfctnDdln;
    }

    /**
     * Sets the value of the certfctnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setCertfctnDdln(DateFormat9Choice value) {
        this.certfctnDdln = value;
        return this;
    }

    /**
     * Gets the value of the crtApprvlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getCrtApprvlDt() {
        return crtApprvlDt;
    }

    /**
     * Sets the value of the crtApprvlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setCrtApprvlDt(DateFormat9Choice value) {
        this.crtApprvlDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getEarlyClsgDt() {
        return earlyClsgDt;
    }

    /**
     * Sets the value of the earlyClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setEarlyClsgDt(DateFormat9Choice value) {
        this.earlyClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setFctvDt(DateFormat9Choice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the equlstnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getEqulstnDt() {
        return equlstnDt;
    }

    /**
     * Sets the value of the equlstnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setEqulstnDt(DateFormat9Choice value) {
        this.equlstnDt = value;
        return this;
    }

    /**
     * Gets the value of the frthrDtldAnncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getFrthrDtldAnncmntDt() {
        return frthrDtldAnncmntDt;
    }

    /**
     * Sets the value of the frthrDtldAnncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setFrthrDtldAnncmntDt(DateFormat9Choice value) {
        this.frthrDtldAnncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the indxFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getIndxFxgDt() {
        return indxFxgDt;
    }

    /**
     * Sets the value of the indxFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setIndxFxgDt(DateFormat9Choice value) {
        this.indxFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setLtryDt(DateFormat9Choice value) {
        this.ltryDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setMtrtyDt(DateFormat9Choice value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the mtgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getMtgDt() {
        return mtgDt;
    }

    /**
     * Sets the value of the mtgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setMtgDt(DateFormat9Choice value) {
        this.mtgDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getMrgnFxgDt() {
        return mrgnFxgDt;
    }

    /**
     * Sets the value of the mrgnFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setMrgnFxgDt(DateFormat9Choice value) {
        this.mrgnFxgDt = value;
        return this;
    }

    /**
     * Gets the value of the prratnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getPrratnDt() {
        return prratnDt;
    }

    /**
     * Sets the value of the prratnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setPrratnDt(DateFormat9Choice value) {
        this.prratnDt = value;
        return this;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setRcrdDt(DateFormat9Choice value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the regnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getRegnDdln() {
        return regnDdln;
    }

    /**
     * Sets the value of the regnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setRegnDdln(DateFormat9Choice value) {
        this.regnDdln = value;
        return this;
    }

    /**
     * Gets the value of the rsltsPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getRsltsPblctnDt() {
        return rsltsPblctnDt;
    }

    /**
     * Sets the value of the rsltsPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setRsltsPblctnDt(DateFormat9Choice value) {
        this.rsltsPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnToSplt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getDdlnToSplt() {
        return ddlnToSplt;
    }

    /**
     * Sets the value of the ddlnToSplt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setDdlnToSplt(DateFormat9Choice value) {
        this.ddlnToSplt = value;
        return this;
    }

    /**
     * Gets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getDdlnForTaxBrkdwnInstr() {
        return ddlnForTaxBrkdwnInstr;
    }

    /**
     * Sets the value of the ddlnForTaxBrkdwnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setDdlnForTaxBrkdwnInstr(DateFormat9Choice value) {
        this.ddlnForTaxBrkdwnInstr = value;
        return this;
    }

    /**
     * Gets the value of the tradgSspdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getTradgSspdDt() {
        return tradgSspdDt;
    }

    /**
     * Sets the value of the tradgSspdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setTradgSspdDt(DateFormat9Choice value) {
        this.tradgSspdDt = value;
        return this;
    }

    /**
     * Gets the value of the ucondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getUcondlDt() {
        return ucondlDt;
    }

    /**
     * Sets the value of the ucondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setUcondlDt(DateFormat9Choice value) {
        this.ucondlDt = value;
        return this;
    }

    /**
     * Gets the value of the whlyUcondlDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getWhlyUcondlDt() {
        return whlyUcondlDt;
    }

    /**
     * Sets the value of the whlyUcondlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setWhlyUcondlDt(DateFormat9Choice value) {
        this.whlyUcondlDt = value;
        return this;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setExDvddDt(DateFormat9Choice value) {
        this.exDvddDt = value;
        return this;
    }

    /**
     * Gets the value of the offclAnncmntPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getOffclAnncmntPblctnDt() {
        return offclAnncmntPblctnDt;
    }

    /**
     * Sets the value of the offclAnncmntPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setOffclAnncmntPblctnDt(DateFormat9Choice value) {
        this.offclAnncmntPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the spclExDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getSpclExDt() {
        return spclExDt;
    }

    /**
     * Sets the value of the spclExDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setSpclExDt(DateFormat9Choice value) {
        this.spclExDt = value;
        return this;
    }

    /**
     * Gets the value of the grntedPrtcptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getGrntedPrtcptnDt() {
        return grntedPrtcptnDt;
    }

    /**
     * Sets the value of the grntedPrtcptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setGrntedPrtcptnDt(DateFormat9Choice value) {
        this.grntedPrtcptnDt = value;
        return this;
    }

    /**
     * Gets the value of the elctnToCtrPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getElctnToCtrPtyDdln() {
        return elctnToCtrPtyDdln;
    }

    /**
     * Sets the value of the elctnToCtrPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setElctnToCtrPtyDdln(DateFormat9Choice value) {
        this.elctnToCtrPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the lpsdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getLpsdDt() {
        return lpsdDt;
    }

    /**
     * Sets the value of the lpsdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setLpsdDt(DateFormat9Choice value) {
        this.lpsdDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setPmtDt(DateFormat9Choice value) {
        this.pmtDt = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getThrdPtyDdln() {
        return thrdPtyDdln;
    }

    /**
     * Sets the value of the thrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setThrdPtyDdln(DateFormat9Choice value) {
        this.thrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the earlyThrdPtyDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getEarlyThrdPtyDdln() {
        return earlyThrdPtyDdln;
    }

    /**
     * Sets the value of the earlyThrdPtyDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setEarlyThrdPtyDdln(DateFormat9Choice value) {
        this.earlyThrdPtyDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktClmTrckgEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat9Choice }
     *     
     */
    public DateFormat9Choice getMktClmTrckgEndDt() {
        return mktClmTrckgEndDt;
    }

    /**
     * Sets the value of the mktClmTrckgEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat9Choice }
     *     
     */
    public CorporateActionDate13 setMktClmTrckgEndDt(DateFormat9Choice value) {
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
