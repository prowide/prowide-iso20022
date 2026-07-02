
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
@XmlType(name = "OtherAmounts30", propOrder = {
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
    "collMntrAmt"
})
public class OtherAmounts30 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection44 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection44 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection44 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection44 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection44 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection44 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection44 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection44 lclTax;
    @XmlElement(name = "LclTaxCtrySpcfc")
    protected AmountAndDirection44 lclTaxCtrySpcfc;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection44 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection44 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection44 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection44 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection44 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection44 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection44 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection44 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection44 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection44 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection44 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection44 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection44 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection44 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection44 acrdCptlstnAmt;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection44 bookVal;
    @XmlElement(name = "CollMntrAmt")
    protected AmountAndDirection44 collMntrAmt;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setAcrdIntrstAmt(AmountAndDirection44 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setChrgsFees(AmountAndDirection44 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setCtryNtlFdrlTax(AmountAndDirection44 value) {
        this.ctryNtlFdrlTax = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setTradAmt(AmountAndDirection44 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setExctgBrkrAmt(AmountAndDirection44 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setIsseDscntAllwnc(AmountAndDirection44 value) {
        this.isseDscntAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setPmtLevyTax(AmountAndDirection44 value) {
        this.pmtLevyTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setLclTax(AmountAndDirection44 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTaxCtrySpcfc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTaxCtrySpcfc() {
        return lclTaxCtrySpcfc;
    }

    /**
     * Sets the value of the lclTaxCtrySpcfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setLclTaxCtrySpcfc(AmountAndDirection44 value) {
        this.lclTaxCtrySpcfc = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setLclBrkrComssn(AmountAndDirection44 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setMrgn(AmountAndDirection44 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setOthr(AmountAndDirection44 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setRgltryAmt(AmountAndDirection44 value) {
        this.rgltryAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setShppgAmt(AmountAndDirection44 value) {
        this.shppgAmt = value;
        return this;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setSpclCncssn(AmountAndDirection44 value) {
        this.spclCncssn = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setStmpDty(AmountAndDirection44 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setStockXchgTax(AmountAndDirection44 value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setTrfTax(AmountAndDirection44 value) {
        this.trfTax = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setTxTax(AmountAndDirection44 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setValAddedTax(AmountAndDirection44 value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setWhldgTax(AmountAndDirection44 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setNetGnLoss(AmountAndDirection44 value) {
        this.netGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setCsmptnTax(AmountAndDirection44 value) {
        this.csmptnTax = value;
        return this;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setAcrdCptlstnAmt(AmountAndDirection44 value) {
        this.acrdCptlstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setBookVal(AmountAndDirection44 value) {
        this.bookVal = value;
        return this;
    }

    /**
     * Gets the value of the collMntrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCollMntrAmt() {
        return collMntrAmt;
    }

    /**
     * Sets the value of the collMntrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public OtherAmounts30 setCollMntrAmt(AmountAndDirection44 value) {
        this.collMntrAmt = value;
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
