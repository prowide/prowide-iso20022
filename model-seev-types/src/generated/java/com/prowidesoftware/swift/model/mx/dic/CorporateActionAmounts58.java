
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
@XmlType(name = "CorporateActionAmounts58", propOrder = {
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
    "entitldAmt",
    "orgnlAmt",
    "acrdIntrstAmt",
    "incmPrtn",
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
    "dmdRyltsAmt"
})
public class CorporateActionAmounts58 {

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
    protected ActiveCurrencyAndAmount scndLvlTaxAmt;
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
    @XmlElement(name = "EntitldAmt")
    protected RestrictedFINActiveCurrencyAndAmount entitldAmt;
    @XmlElement(name = "OrgnlAmt")
    protected RestrictedFINActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected RestrictedFINActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "IncmPrtn")
    protected RestrictedFINActiveCurrencyAndAmount incmPrtn;
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
    public CorporateActionAmounts58 setGrssCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setNetCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setSlctnFees(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setCshInLieuOfShr(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setCptlGn(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setMktClmAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setIndmntyAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setManfctrdDvddPmtAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setRinvstmtAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setFullyFrnkdAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setUfrnkdAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setSndryOrOthrAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setTaxFreeAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setTaxDfrrdAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setValAddedTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setStmpDtyAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setTaxRclmAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setTaxCdtAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setAddtlTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setWhldgTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the scndLvlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getScndLvlTaxAmt() {
        return scndLvlTaxAmt;
    }

    /**
     * Sets the value of the scndLvlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts58 setScndLvlTaxAmt(ActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setFsclStmpAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setExctgBrkrAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setPngAgtComssnAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setLclBrkrComssnAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setRgltryFeesAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setShppgFeesAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setChrgsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the entitldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getEntitldAmt() {
        return entitldAmt;
    }

    /**
     * Sets the value of the entitldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts58 setEntitldAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.entitldAmt = value;
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
    public CorporateActionAmounts58 setOrgnlAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
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
    public CorporateActionAmounts58 setAcrdIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
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
    public CorporateActionAmounts58 setIncmPrtn(RestrictedFINActiveCurrencyAndAmount value) {
        this.incmPrtn = value;
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
    public CorporateActionAmounts58 setEqulstnAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setFATCATaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setNRATaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setBckUpWhldgTaxAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setTaxOnIncmAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setTxTax(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setDmdAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setFrgnIncmAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setDmdDvddAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setDmdFndAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setDmdIntrstAmt(RestrictedFINActiveCurrencyAndAmount value) {
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
    public CorporateActionAmounts58 setDmdRyltsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.dmdRyltsAmt = value;
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
