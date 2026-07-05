
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
@XmlType(name = "OtherAmounts44", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "ctryNtlFdrlTax",
    "tradAmt",
    "exctgBrkrAmt",
    "isseDscntAllwnc",
    "pmtLevyTax",
    "lclTax",
    "lclTaxCtrySpcfc",
    "lclBrkrComssn",
    "mrgn",
    "othr",
    "rgltryAmt",
    "shppgAmt",
    "spclCncssn",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "netGnLoss",
    "csmptnTax",
    "acrdCptlstnAmt",
    "bookVal",
    "collMntrAmt",
    "rsrchFee"
})
public class OtherAmounts44 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection58 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection58 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection58 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection58 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection58 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection58 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection58 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection58 lclTax;
    @XmlElement(name = "LclTaxCtrySpcfc")
    protected AmountAndDirection58 lclTaxCtrySpcfc;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection58 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection58 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection58 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection58 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection58 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection58 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection58 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection58 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection58 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection58 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection58 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection58 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection58 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection58 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection58 acrdCptlstnAmt;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection58 bookVal;
    @XmlElement(name = "CollMntrAmt")
    protected AmountAndDirection58 collMntrAmt;
    @XmlElement(name = "RsrchFee")
    protected AmountAndDirection44 rsrchFee;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setAcrdIntrstAmt(AmountAndDirection58 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setChrgsFees(AmountAndDirection58 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setCtryNtlFdrlTax(AmountAndDirection58 value) {
        this.ctryNtlFdrlTax = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setTradAmt(AmountAndDirection58 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setExctgBrkrAmt(AmountAndDirection58 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setIsseDscntAllwnc(AmountAndDirection58 value) {
        this.isseDscntAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setPmtLevyTax(AmountAndDirection58 value) {
        this.pmtLevyTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setLclTax(AmountAndDirection58 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getLclTaxCtrySpcfc() {
        return lclTaxCtrySpcfc;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setLclTaxCtrySpcfc(AmountAndDirection58 value) {
        this.lclTaxCtrySpcfc = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setLclBrkrComssn(AmountAndDirection58 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setMrgn(AmountAndDirection58 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setOthr(AmountAndDirection58 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setRgltryAmt(AmountAndDirection58 value) {
        this.rgltryAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setShppgAmt(AmountAndDirection58 value) {
        this.shppgAmt = value;
        return this;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setSpclCncssn(AmountAndDirection58 value) {
        this.spclCncssn = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setStmpDty(AmountAndDirection58 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setStockXchgTax(AmountAndDirection58 value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setTrfTax(AmountAndDirection58 value) {
        this.trfTax = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setTxTax(AmountAndDirection58 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setValAddedTax(AmountAndDirection58 value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setWhldgTax(AmountAndDirection58 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setNetGnLoss(AmountAndDirection58 value) {
        this.netGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setCsmptnTax(AmountAndDirection58 value) {
        this.csmptnTax = value;
        return this;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setAcrdCptlstnAmt(AmountAndDirection58 value) {
        this.acrdCptlstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setBookVal(AmountAndDirection58 value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the collMntrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public AmountAndDirection58 getCollMntrAmt() {
        return collMntrAmt;
    }

    /**
     * Sets the value of the collMntrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection58 }
     *     
     */
    public OtherAmounts44 setCollMntrAmt(AmountAndDirection58 value) {
        this.collMntrAmt = value;
        return this;
    }

    /**
     * Gets the value of the rsrchFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRsrchFee() {
        return rsrchFee;
    }

    /**
     * Sets the value of the rsrchFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts44 setRsrchFee(AmountAndDirection44 value) {
        this.rsrchFee = value;
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
