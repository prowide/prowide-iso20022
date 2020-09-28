
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
@XmlType(name = "OtherAmounts7", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "ctryNtlFdrlTax",
    "tradAmt",
    "exctgBrkrAmt",
    "isseDscntAllwnc",
    "pmtLevyTax",
    "lclTax",
    "lclBrkrComssn",
    "mrgn",
    "othr",
    "pstgAmt",
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
    "acrdCptlstnAmt"
})
public class OtherAmounts7 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection17 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection17 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection17 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection17 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection17 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection17 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection17 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection17 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection17 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection17 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection17 othr;
    @XmlElement(name = "PstgAmt")
    protected AmountAndDirection17 pstgAmt;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection17 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection17 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection17 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection17 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection17 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection17 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection17 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection17 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection17 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection17 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection17 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection17 acrdCptlstnAmt;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setAcrdIntrstAmt(AmountAndDirection17 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setChrgsFees(AmountAndDirection17 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setCtryNtlFdrlTax(AmountAndDirection17 value) {
        this.ctryNtlFdrlTax = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setTradAmt(AmountAndDirection17 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setExctgBrkrAmt(AmountAndDirection17 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setIsseDscntAllwnc(AmountAndDirection17 value) {
        this.isseDscntAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setPmtLevyTax(AmountAndDirection17 value) {
        this.pmtLevyTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setLclTax(AmountAndDirection17 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setLclBrkrComssn(AmountAndDirection17 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setMrgn(AmountAndDirection17 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setOthr(AmountAndDirection17 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the pstgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getPstgAmt() {
        return pstgAmt;
    }

    /**
     * Sets the value of the pstgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setPstgAmt(AmountAndDirection17 value) {
        this.pstgAmt = value;
        return this;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setRgltryAmt(AmountAndDirection17 value) {
        this.rgltryAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setShppgAmt(AmountAndDirection17 value) {
        this.shppgAmt = value;
        return this;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setSpclCncssn(AmountAndDirection17 value) {
        this.spclCncssn = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setStmpDty(AmountAndDirection17 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setStockXchgTax(AmountAndDirection17 value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setTrfTax(AmountAndDirection17 value) {
        this.trfTax = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setTxTax(AmountAndDirection17 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setValAddedTax(AmountAndDirection17 value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setWhldgTax(AmountAndDirection17 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setNetGnLoss(AmountAndDirection17 value) {
        this.netGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setCsmptnTax(AmountAndDirection17 value) {
        this.csmptnTax = value;
        return this;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public AmountAndDirection17 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection17 }
     *     
     */
    public OtherAmounts7 setAcrdCptlstnAmt(AmountAndDirection17 value) {
        this.acrdCptlstnAmt = value;
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
