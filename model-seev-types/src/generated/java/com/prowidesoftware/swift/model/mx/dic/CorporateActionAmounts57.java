
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
 * Specifies amounts in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts57", propOrder = {
    "pstngAmt",
    "grssCshAmt",
    "netCshAmt",
    "slctnFees",
    "cshInLieuOfShr",
    "cptlGn",
    "intrstAmt",
    "mktClmAmt",
    "indmntyAmt",
    "manfctrdDvddPmtAmt",
    "rinvstmtAmt",
    "fullyFrnkdAmt",
    "ufrnkdAmt",
    "sndryOrOthrAmt",
    "taxFreeAmt",
    "taxDfrrdAmt",
    "valAddedTaxAmt",
    "stmpDtyAmt",
    "taxRclmAmt",
    "taxCdtAmt",
    "addtlTaxAmt",
    "whldgTaxAmt",
    "scndLvlTaxAmt",
    "fsclStmpAmt",
    "exctgBrkrAmt",
    "pngAgtComssnAmt",
    "lclBrkrComssnAmt",
    "rgltryFeesAmt",
    "shppgFeesAmt",
    "chrgsAmt",
    "cshAmtBrghtFwd",
    "cshAmtCrrdFwd",
    "ntnlDvddPyblAmt",
    "ntnlTaxAmt",
    "taxArrearsAmt",
    "orgnlAmt",
    "prncplOrCrps",
    "redPrmAmt",
    "incmPrtn",
    "stockXchgTax",
    "euTaxRtntnAmt",
    "acrdIntrstAmt",
    "equlstnAmt",
    "fatcaTaxAmt",
    "nraTaxAmt",
    "bckUpWhldgTaxAmt",
    "taxOnIncmAmt",
    "txTax",
    "dmdAmt",
    "frgnIncmAmt",
    "dmdDvddAmt",
    "dmdFndAmt",
    "dmdIntrstAmt",
    "dmdRyltsAmt",
    "adjstdSbcptAmt",
    "rfnddSbcptAmt"
})
public class CorporateActionAmounts57 {

    @XmlElement(name = "PstngAmt", required = true)
    protected RestrictedFINActiveCurrencyAndAmount pstngAmt;
    @XmlElement(name = "GrssCshAmt")
    protected RestrictedFINActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected RestrictedFINActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "SlctnFees")
    protected RestrictedFINActiveCurrencyAndAmount slctnFees;
    @XmlElement(name = "CshInLieuOfShr")
    protected RestrictedFINActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "CptlGn")
    protected RestrictedFINActiveCurrencyAndAmount cptlGn;
    @XmlElement(name = "IntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount intrstAmt;
    @XmlElement(name = "MktClmAmt")
    protected RestrictedFINActiveCurrencyAndAmount mktClmAmt;
    @XmlElement(name = "IndmntyAmt")
    protected RestrictedFINActiveCurrencyAndAmount indmntyAmt;
    @XmlElement(name = "ManfctrdDvddPmtAmt")
    protected RestrictedFINActiveCurrencyAndAmount manfctrdDvddPmtAmt;
    @XmlElement(name = "RinvstmtAmt")
    protected RestrictedFINActiveCurrencyAndAmount rinvstmtAmt;
    @XmlElement(name = "FullyFrnkdAmt")
    protected RestrictedFINActiveCurrencyAndAmount fullyFrnkdAmt;
    @XmlElement(name = "UfrnkdAmt")
    protected RestrictedFINActiveCurrencyAndAmount ufrnkdAmt;
    @XmlElement(name = "SndryOrOthrAmt")
    protected RestrictedFINActiveCurrencyAndAmount sndryOrOthrAmt;
    @XmlElement(name = "TaxFreeAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxFreeAmt;
    @XmlElement(name = "TaxDfrrdAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxDfrrdAmt;
    @XmlElement(name = "ValAddedTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount valAddedTaxAmt;
    @XmlElement(name = "StmpDtyAmt")
    protected RestrictedFINActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "TaxRclmAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxRclmAmt;
    @XmlElement(name = "TaxCdtAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxCdtAmt;
    @XmlElement(name = "AddtlTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount addtlTaxAmt;
    @XmlElement(name = "WhldgTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "ScndLvlTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount scndLvlTaxAmt;
    @XmlElement(name = "FsclStmpAmt")
    protected RestrictedFINActiveCurrencyAndAmount fsclStmpAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected RestrictedFINActiveCurrencyAndAmount exctgBrkrAmt;
    @XmlElement(name = "PngAgtComssnAmt")
    protected RestrictedFINActiveCurrencyAndAmount pngAgtComssnAmt;
    @XmlElement(name = "LclBrkrComssnAmt")
    protected RestrictedFINActiveCurrencyAndAmount lclBrkrComssnAmt;
    @XmlElement(name = "RgltryFeesAmt")
    protected RestrictedFINActiveCurrencyAndAmount rgltryFeesAmt;
    @XmlElement(name = "ShppgFeesAmt")
    protected RestrictedFINActiveCurrencyAndAmount shppgFeesAmt;
    @XmlElement(name = "ChrgsAmt")
    protected RestrictedFINActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "CshAmtBrghtFwd")
    protected RestrictedFINActiveCurrencyAndAmount cshAmtBrghtFwd;
    @XmlElement(name = "CshAmtCrrdFwd")
    protected RestrictedFINActiveCurrencyAndAmount cshAmtCrrdFwd;
    @XmlElement(name = "NtnlDvddPyblAmt")
    protected RestrictedFINActiveCurrencyAndAmount ntnlDvddPyblAmt;
    @XmlElement(name = "NtnlTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount ntnlTaxAmt;
    @XmlElement(name = "TaxArrearsAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxArrearsAmt;
    @XmlElement(name = "OrgnlAmt")
    protected RestrictedFINActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "PrncplOrCrps")
    protected RestrictedFINActiveCurrencyAndAmount prncplOrCrps;
    @XmlElement(name = "RedPrmAmt")
    protected RestrictedFINActiveCurrencyAndAmount redPrmAmt;
    @XmlElement(name = "IncmPrtn")
    protected RestrictedFINActiveCurrencyAndAmount incmPrtn;
    @XmlElement(name = "StockXchgTax")
    protected RestrictedFINActiveCurrencyAndAmount stockXchgTax;
    @XmlElement(name = "EUTaxRtntnAmt")
    protected RestrictedFINActiveCurrencyAndAmount euTaxRtntnAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "EqulstnAmt")
    protected RestrictedFINActiveCurrencyAndAmount equlstnAmt;
    @XmlElement(name = "FATCATaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount fatcaTaxAmt;
    @XmlElement(name = "NRATaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount nraTaxAmt;
    @XmlElement(name = "BckUpWhldgTaxAmt")
    protected RestrictedFINActiveCurrencyAndAmount bckUpWhldgTaxAmt;
    @XmlElement(name = "TaxOnIncmAmt")
    protected RestrictedFINActiveCurrencyAndAmount taxOnIncmAmt;
    @XmlElement(name = "TxTax")
    protected RestrictedFINActiveCurrencyAndAmount txTax;
    @XmlElement(name = "DmdAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdAmt;
    @XmlElement(name = "FrgnIncmAmt")
    protected RestrictedFINActiveCurrencyAndAmount frgnIncmAmt;
    @XmlElement(name = "DmdDvddAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdDvddAmt;
    @XmlElement(name = "DmdFndAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdFndAmt;
    @XmlElement(name = "DmdIntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdIntrstAmt;
    @XmlElement(name = "DmdRyltsAmt")
    protected RestrictedFINActiveCurrencyAndAmount dmdRyltsAmt;
    @XmlElement(name = "AdjstdSbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount adjstdSbcptAmt;
    @XmlElement(name = "RfnddSbcptAmt")
    protected RestrictedFINActiveCurrencyAndAmount rfnddSbcptAmt;

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setPstngAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.pstngAmt = value;
        return this;
    }

    /**
     * Gets the value of the grssCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getGrssCshAmt() {
        return grssCshAmt;
    }

    /**
     * Sets the value of the grssCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setGrssCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.grssCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the netCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Sets the value of the netCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setNetCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.netCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the slctnFees property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getSlctnFees() {
        return slctnFees;
    }

    /**
     * Sets the value of the slctnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setSlctnFees(RestrictedFINActiveCurrencyAndAmount value) {
        this.slctnFees = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShr property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshInLieuOfShr() {
        return cshInLieuOfShr;
    }

    /**
     * Sets the value of the cshInLieuOfShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setCshInLieuOfShr(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshInLieuOfShr = value;
        return this;
    }

    /**
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setCptlGn(RestrictedFINActiveCurrencyAndAmount value) {
        this.cptlGn = value;
        return this;
    }

    /**
     * Gets the value of the intrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIntrstAmt() {
        return intrstAmt;
    }

    /**
     * Sets the value of the intrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.intrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the mktClmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getMktClmAmt() {
        return mktClmAmt;
    }

    /**
     * Sets the value of the mktClmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setMktClmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.mktClmAmt = value;
        return this;
    }

    /**
     * Gets the value of the indmntyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIndmntyAmt() {
        return indmntyAmt;
    }

    /**
     * Sets the value of the indmntyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setIndmntyAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.indmntyAmt = value;
        return this;
    }

    /**
     * Gets the value of the manfctrdDvddPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getManfctrdDvddPmtAmt() {
        return manfctrdDvddPmtAmt;
    }

    /**
     * Sets the value of the manfctrdDvddPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setManfctrdDvddPmtAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.manfctrdDvddPmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRinvstmtAmt() {
        return rinvstmtAmt;
    }

    /**
     * Sets the value of the rinvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setRinvstmtAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rinvstmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFullyFrnkdAmt() {
        return fullyFrnkdAmt;
    }

    /**
     * Sets the value of the fullyFrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setFullyFrnkdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fullyFrnkdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ufrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getUfrnkdAmt() {
        return ufrnkdAmt;
    }

    /**
     * Sets the value of the ufrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setUfrnkdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ufrnkdAmt = value;
        return this;
    }

    /**
     * Gets the value of the sndryOrOthrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getSndryOrOthrAmt() {
        return sndryOrOthrAmt;
    }

    /**
     * Sets the value of the sndryOrOthrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setSndryOrOthrAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.sndryOrOthrAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxFreeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxFreeAmt() {
        return taxFreeAmt;
    }

    /**
     * Sets the value of the taxFreeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTaxFreeAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxFreeAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxDfrrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxDfrrdAmt() {
        return taxDfrrdAmt;
    }

    /**
     * Sets the value of the taxDfrrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTaxDfrrdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxDfrrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getValAddedTaxAmt() {
        return valAddedTaxAmt;
    }

    /**
     * Sets the value of the valAddedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setValAddedTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.valAddedTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getStmpDtyAmt() {
        return stmpDtyAmt;
    }

    /**
     * Sets the value of the stmpDtyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setStmpDtyAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.stmpDtyAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxRclmAmt() {
        return taxRclmAmt;
    }

    /**
     * Sets the value of the taxRclmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTaxRclmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxRclmAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxCdtAmt() {
        return taxCdtAmt;
    }

    /**
     * Sets the value of the taxCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTaxCdtAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxCdtAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAddtlTaxAmt() {
        return addtlTaxAmt;
    }

    /**
     * Sets the value of the addtlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setAddtlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.addtlTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setWhldgTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the scndLvlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getScndLvlTaxAmt() {
        return scndLvlTaxAmt;
    }

    /**
     * Sets the value of the scndLvlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setScndLvlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.scndLvlTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFsclStmpAmt() {
        return fsclStmpAmt;
    }

    /**
     * Sets the value of the fsclStmpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setFsclStmpAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fsclStmpAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setExctgBrkrAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the pngAgtComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getPngAgtComssnAmt() {
        return pngAgtComssnAmt;
    }

    /**
     * Sets the value of the pngAgtComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setPngAgtComssnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.pngAgtComssnAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getLclBrkrComssnAmt() {
        return lclBrkrComssnAmt;
    }

    /**
     * Sets the value of the lclBrkrComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setLclBrkrComssnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.lclBrkrComssnAmt = value;
        return this;
    }

    /**
     * Gets the value of the rgltryFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRgltryFeesAmt() {
        return rgltryFeesAmt;
    }

    /**
     * Sets the value of the rgltryFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setRgltryFeesAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rgltryFeesAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getShppgFeesAmt() {
        return shppgFeesAmt;
    }

    /**
     * Sets the value of the shppgFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setShppgFeesAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.shppgFeesAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setChrgsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshAmtBrghtFwd property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshAmtBrghtFwd() {
        return cshAmtBrghtFwd;
    }

    /**
     * Sets the value of the cshAmtBrghtFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setCshAmtBrghtFwd(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshAmtBrghtFwd = value;
        return this;
    }

    /**
     * Gets the value of the cshAmtCrrdFwd property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCshAmtCrrdFwd() {
        return cshAmtCrrdFwd;
    }

    /**
     * Sets the value of the cshAmtCrrdFwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setCshAmtCrrdFwd(RestrictedFINActiveCurrencyAndAmount value) {
        this.cshAmtCrrdFwd = value;
        return this;
    }

    /**
     * Gets the value of the ntnlDvddPyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNtnlDvddPyblAmt() {
        return ntnlDvddPyblAmt;
    }

    /**
     * Sets the value of the ntnlDvddPyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setNtnlDvddPyblAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ntnlDvddPyblAmt = value;
        return this;
    }

    /**
     * Gets the value of the ntnlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNtnlTaxAmt() {
        return ntnlTaxAmt;
    }

    /**
     * Sets the value of the ntnlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setNtnlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.ntnlTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxArrearsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxArrearsAmt() {
        return taxArrearsAmt;
    }

    /**
     * Sets the value of the taxArrearsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTaxArrearsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxArrearsAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setOrgnlAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplOrCrps property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getPrncplOrCrps() {
        return prncplOrCrps;
    }

    /**
     * Sets the value of the prncplOrCrps property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setPrncplOrCrps(RestrictedFINActiveCurrencyAndAmount value) {
        this.prncplOrCrps = value;
        return this;
    }

    /**
     * Gets the value of the redPrmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRedPrmAmt() {
        return redPrmAmt;
    }

    /**
     * Sets the value of the redPrmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setRedPrmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.redPrmAmt = value;
        return this;
    }

    /**
     * Gets the value of the incmPrtn property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getIncmPrtn() {
        return incmPrtn;
    }

    /**
     * Sets the value of the incmPrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setIncmPrtn(RestrictedFINActiveCurrencyAndAmount value) {
        this.incmPrtn = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setStockXchgTax(RestrictedFINActiveCurrencyAndAmount value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the euTaxRtntnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getEUTaxRtntnAmt() {
        return euTaxRtntnAmt;
    }

    /**
     * Sets the value of the euTaxRtntnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setEUTaxRtntnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.euTaxRtntnAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setAcrdIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the equlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getEqulstnAmt() {
        return equlstnAmt;
    }

    /**
     * Sets the value of the equlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setEqulstnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.equlstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the fatcaTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFATCATaxAmt() {
        return fatcaTaxAmt;
    }

    /**
     * Sets the value of the fatcaTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setFATCATaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.fatcaTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the nraTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getNRATaxAmt() {
        return nraTaxAmt;
    }

    /**
     * Sets the value of the nraTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setNRATaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.nraTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the bckUpWhldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getBckUpWhldgTaxAmt() {
        return bckUpWhldgTaxAmt;
    }

    /**
     * Sets the value of the bckUpWhldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setBckUpWhldgTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.bckUpWhldgTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxOnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTaxOnIncmAmt() {
        return taxOnIncmAmt;
    }

    /**
     * Sets the value of the taxOnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTaxOnIncmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.taxOnIncmAmt = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setTxTax(RestrictedFINActiveCurrencyAndAmount value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the dmdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdAmt() {
        return dmdAmt;
    }

    /**
     * Sets the value of the dmdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setDmdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdAmt = value;
        return this;
    }

    /**
     * Gets the value of the frgnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getFrgnIncmAmt() {
        return frgnIncmAmt;
    }

    /**
     * Sets the value of the frgnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setFrgnIncmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.frgnIncmAmt = value;
        return this;
    }

    /**
     * Gets the value of the dmdDvddAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdDvddAmt() {
        return dmdDvddAmt;
    }

    /**
     * Sets the value of the dmdDvddAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setDmdDvddAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdDvddAmt = value;
        return this;
    }

    /**
     * Gets the value of the dmdFndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdFndAmt() {
        return dmdFndAmt;
    }

    /**
     * Sets the value of the dmdFndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setDmdFndAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdFndAmt = value;
        return this;
    }

    /**
     * Gets the value of the dmdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdIntrstAmt() {
        return dmdIntrstAmt;
    }

    /**
     * Sets the value of the dmdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setDmdIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the dmdRyltsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getDmdRyltsAmt() {
        return dmdRyltsAmt;
    }

    /**
     * Sets the value of the dmdRyltsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setDmdRyltsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdRyltsAmt = value;
        return this;
    }

    /**
     * Gets the value of the adjstdSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAdjstdSbcptAmt() {
        return adjstdSbcptAmt;
    }

    /**
     * Sets the value of the adjstdSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setAdjstdSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.adjstdSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the rfnddSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRfnddSbcptAmt() {
        return rfnddSbcptAmt;
    }

    /**
     * Sets the value of the rfnddSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts57 setRfnddSbcptAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rfnddSbcptAmt = value;
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
