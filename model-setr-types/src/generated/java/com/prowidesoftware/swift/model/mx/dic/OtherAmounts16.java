
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
 * Identifies other amounts pertaining to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts16", propOrder = {
    "chrgsFees",
    "ctryNtlFdrlTax",
    "exctgBrkrAmt",
    "isseDscntAllwnc",
    "pmtLevyTax",
    "lclTax",
    "lclBrkrComssn",
    "mrgn",
    "othr",
    "rgltryAmt",
    "spclCncssn",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "netGnLoss",
    "csmptnTax",
    "mtchgConfFee",
    "convtdAmt",
    "orgnlCcyAmt",
    "bookVal",
    "acrdCptlstnAmt",
    "lclTaxCtrySpcfc1",
    "lclTaxCtrySpcfc2",
    "lclTaxCtrySpcfc3",
    "lclTaxCtrySpcfc4",
    "shrdBrkrgAmt",
    "mktMmbFeeAmt",
    "rmnrtnAmtReq",
    "rmnrtnAmt",
    "brrwgIntrstAmt",
    "brrwgFee",
    "netMktVal",
    "rmngFaceVal",
    "rmngBookVal",
    "clrBrkrComssn",
    "diffInPric",
    "oddLotFee"
})
public class OtherAmounts16 {

    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection29 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection29 ctryNtlFdrlTax;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection29 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection29 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection29 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection29 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection29 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection29 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection29 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection29 rgltryAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection29 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection29 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection29 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection29 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection29 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection29 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection29 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection29 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection29 csmptnTax;
    @XmlElement(name = "MtchgConfFee")
    protected AmountAndDirection29 mtchgConfFee;
    @XmlElement(name = "ConvtdAmt")
    protected AmountAndDirection29 convtdAmt;
    @XmlElement(name = "OrgnlCcyAmt")
    protected AmountAndDirection29 orgnlCcyAmt;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection29 bookVal;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection29 acrdCptlstnAmt;
    @XmlElement(name = "LclTaxCtrySpcfc1")
    protected AmountAndDirection29 lclTaxCtrySpcfc1;
    @XmlElement(name = "LclTaxCtrySpcfc2")
    protected AmountAndDirection29 lclTaxCtrySpcfc2;
    @XmlElement(name = "LclTaxCtrySpcfc3")
    protected AmountAndDirection29 lclTaxCtrySpcfc3;
    @XmlElement(name = "LclTaxCtrySpcfc4")
    protected AmountAndDirection29 lclTaxCtrySpcfc4;
    @XmlElement(name = "ShrdBrkrgAmt")
    protected AmountAndDirection29 shrdBrkrgAmt;
    @XmlElement(name = "MktMmbFeeAmt")
    protected AmountAndDirection29 mktMmbFeeAmt;
    @XmlElement(name = "RmnrtnAmtReq")
    protected Boolean rmnrtnAmtReq;
    @XmlElement(name = "RmnrtnAmt")
    protected AmountAndDirection29 rmnrtnAmt;
    @XmlElement(name = "BrrwgIntrstAmt")
    protected AmountAndDirection29 brrwgIntrstAmt;
    @XmlElement(name = "BrrwgFee")
    protected AmountAndDirection29 brrwgFee;
    @XmlElement(name = "NetMktVal")
    protected AmountAndDirection29 netMktVal;
    @XmlElement(name = "RmngFaceVal")
    protected AmountAndDirection29 rmngFaceVal;
    @XmlElement(name = "RmngBookVal")
    protected AmountAndDirection29 rmngBookVal;
    @XmlElement(name = "ClrBrkrComssn")
    protected AmountAndDirection29 clrBrkrComssn;
    @XmlElement(name = "DiffInPric")
    protected AmountAndDirection29 diffInPric;
    @XmlElement(name = "OddLotFee")
    protected Boolean oddLotFee;

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setChrgsFees(AmountAndDirection29 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setCtryNtlFdrlTax(AmountAndDirection29 value) {
        this.ctryNtlFdrlTax = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setExctgBrkrAmt(AmountAndDirection29 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setIsseDscntAllwnc(AmountAndDirection29 value) {
        this.isseDscntAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setPmtLevyTax(AmountAndDirection29 value) {
        this.pmtLevyTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setLclTax(AmountAndDirection29 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setLclBrkrComssn(AmountAndDirection29 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setMrgn(AmountAndDirection29 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setOthr(AmountAndDirection29 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setRgltryAmt(AmountAndDirection29 value) {
        this.rgltryAmt = value;
        return this;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setSpclCncssn(AmountAndDirection29 value) {
        this.spclCncssn = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setStmpDty(AmountAndDirection29 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setStockXchgTax(AmountAndDirection29 value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setTrfTax(AmountAndDirection29 value) {
        this.trfTax = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setTxTax(AmountAndDirection29 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setValAddedTax(AmountAndDirection29 value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setWhldgTax(AmountAndDirection29 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setNetGnLoss(AmountAndDirection29 value) {
        this.netGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setCsmptnTax(AmountAndDirection29 value) {
        this.csmptnTax = value;
        return this;
    }

    /**
     * Gets the value of the mtchgConfFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getMtchgConfFee() {
        return mtchgConfFee;
    }

    /**
     * Sets the value of the mtchgConfFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setMtchgConfFee(AmountAndDirection29 value) {
        this.mtchgConfFee = value;
        return this;
    }

    /**
     * Gets the value of the convtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getConvtdAmt() {
        return convtdAmt;
    }

    /**
     * Sets the value of the convtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setConvtdAmt(AmountAndDirection29 value) {
        this.convtdAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getOrgnlCcyAmt() {
        return orgnlCcyAmt;
    }

    /**
     * Sets the value of the orgnlCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setOrgnlCcyAmt(AmountAndDirection29 value) {
        this.orgnlCcyAmt = value;
        return this;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setBookVal(AmountAndDirection29 value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setAcrdCptlstnAmt(AmountAndDirection29 value) {
        this.acrdCptlstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc1 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc1() {
        return lclTaxCtrySpcfc1;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setLclTaxCtrySpcfc1(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc1 = value;
        return this;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc2 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc2() {
        return lclTaxCtrySpcfc2;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setLclTaxCtrySpcfc2(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc2 = value;
        return this;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc3 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc3() {
        return lclTaxCtrySpcfc3;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setLclTaxCtrySpcfc3(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc3 = value;
        return this;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc4 property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getLclTaxCtrySpcfc4() {
        return lclTaxCtrySpcfc4;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setLclTaxCtrySpcfc4(AmountAndDirection29 value) {
        this.lclTaxCtrySpcfc4 = value;
        return this;
    }

    /**
     * Gets the value of the shrdBrkrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getShrdBrkrgAmt() {
        return shrdBrkrgAmt;
    }

    /**
     * Sets the value of the shrdBrkrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setShrdBrkrgAmt(AmountAndDirection29 value) {
        this.shrdBrkrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the mktMmbFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getMktMmbFeeAmt() {
        return mktMmbFeeAmt;
    }

    /**
     * Sets the value of the mktMmbFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setMktMmbFeeAmt(AmountAndDirection29 value) {
        this.mktMmbFeeAmt = value;
        return this;
    }

    /**
     * Gets the value of the rmnrtnAmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmnrtnAmtReq() {
        return rmnrtnAmtReq;
    }

    /**
     * Sets the value of the rmnrtnAmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OtherAmounts16 setRmnrtnAmtReq(Boolean value) {
        this.rmnrtnAmtReq = value;
        return this;
    }

    /**
     * Gets the value of the rmnrtnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRmnrtnAmt() {
        return rmnrtnAmt;
    }

    /**
     * Sets the value of the rmnrtnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setRmnrtnAmt(AmountAndDirection29 value) {
        this.rmnrtnAmt = value;
        return this;
    }

    /**
     * Gets the value of the brrwgIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getBrrwgIntrstAmt() {
        return brrwgIntrstAmt;
    }

    /**
     * Sets the value of the brrwgIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setBrrwgIntrstAmt(AmountAndDirection29 value) {
        this.brrwgIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the brrwgFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getBrrwgFee() {
        return brrwgFee;
    }

    /**
     * Sets the value of the brrwgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setBrrwgFee(AmountAndDirection29 value) {
        this.brrwgFee = value;
        return this;
    }

    /**
     * Gets the value of the netMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getNetMktVal() {
        return netMktVal;
    }

    /**
     * Sets the value of the netMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setNetMktVal(AmountAndDirection29 value) {
        this.netMktVal = value;
        return this;
    }

    /**
     * Gets the value of the rmngFaceVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRmngFaceVal() {
        return rmngFaceVal;
    }

    /**
     * Sets the value of the rmngFaceVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setRmngFaceVal(AmountAndDirection29 value) {
        this.rmngFaceVal = value;
        return this;
    }

    /**
     * Gets the value of the rmngBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getRmngBookVal() {
        return rmngBookVal;
    }

    /**
     * Sets the value of the rmngBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setRmngBookVal(AmountAndDirection29 value) {
        this.rmngBookVal = value;
        return this;
    }

    /**
     * Gets the value of the clrBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getClrBrkrComssn() {
        return clrBrkrComssn;
    }

    /**
     * Sets the value of the clrBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setClrBrkrComssn(AmountAndDirection29 value) {
        this.clrBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the diffInPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getDiffInPric() {
        return diffInPric;
    }

    /**
     * Sets the value of the diffInPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public OtherAmounts16 setDiffInPric(AmountAndDirection29 value) {
        this.diffInPric = value;
        return this;
    }

    /**
     * Gets the value of the oddLotFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOddLotFee() {
        return oddLotFee;
    }

    /**
     * Sets the value of the oddLotFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OtherAmounts16 setOddLotFee(Boolean value) {
        this.oddLotFee = value;
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
