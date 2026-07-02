
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
@XmlType(name = "OtherAmounts3", propOrder = {
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
public class OtherAmounts3 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection9 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection9 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection9 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection9 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection9 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection9 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection9 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection9 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection9 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection9 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection9 othr;
    @XmlElement(name = "PstgAmt")
    protected AmountAndDirection9 pstgAmt;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection9 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection9 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection9 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection9 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection9 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection9 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection9 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection9 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection9 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection9 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection9 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection9 acrdCptlstnAmt;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setAcrdIntrstAmt(AmountAndDirection9 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setChrgsFees(AmountAndDirection9 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setCtryNtlFdrlTax(AmountAndDirection9 value) {
        this.ctryNtlFdrlTax = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setTradAmt(AmountAndDirection9 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setExctgBrkrAmt(AmountAndDirection9 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setIsseDscntAllwnc(AmountAndDirection9 value) {
        this.isseDscntAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setPmtLevyTax(AmountAndDirection9 value) {
        this.pmtLevyTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setLclTax(AmountAndDirection9 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setLclBrkrComssn(AmountAndDirection9 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setMrgn(AmountAndDirection9 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setOthr(AmountAndDirection9 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the pstgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getPstgAmt() {
        return pstgAmt;
    }

    /**
     * Sets the value of the pstgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setPstgAmt(AmountAndDirection9 value) {
        this.pstgAmt = value;
        return this;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setRgltryAmt(AmountAndDirection9 value) {
        this.rgltryAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setShppgAmt(AmountAndDirection9 value) {
        this.shppgAmt = value;
        return this;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setSpclCncssn(AmountAndDirection9 value) {
        this.spclCncssn = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setStmpDty(AmountAndDirection9 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setStockXchgTax(AmountAndDirection9 value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setTrfTax(AmountAndDirection9 value) {
        this.trfTax = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setTxTax(AmountAndDirection9 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setValAddedTax(AmountAndDirection9 value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setWhldgTax(AmountAndDirection9 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setNetGnLoss(AmountAndDirection9 value) {
        this.netGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setCsmptnTax(AmountAndDirection9 value) {
        this.csmptnTax = value;
        return this;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public AmountAndDirection9 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection9 }
     *     
     */
    public OtherAmounts3 setAcrdCptlstnAmt(AmountAndDirection9 value) {
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
