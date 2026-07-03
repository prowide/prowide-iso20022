
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
 * Amount of money debited and credited on the books of an account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts1", propOrder = {
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
public class OtherAmounts1 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection1 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection1 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection1 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection1 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection1 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection1 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection1 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection1 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection1 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection1 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection1 othr;
    @XmlElement(name = "PstgAmt")
    protected AmountAndDirection1 pstgAmt;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection1 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection1 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection1 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection1 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection1 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection1 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection1 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection1 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection1 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection1 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection1 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection1 acrdCptlstnAmt;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setAcrdIntrstAmt(AmountAndDirection1 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setChrgsFees(AmountAndDirection1 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the ctryNtlFdrlTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Sets the value of the ctryNtlFdrlTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setCtryNtlFdrlTax(AmountAndDirection1 value) {
        this.ctryNtlFdrlTax = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setTradAmt(AmountAndDirection1 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setExctgBrkrAmt(AmountAndDirection1 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the isseDscntAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Sets the value of the isseDscntAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setIsseDscntAllwnc(AmountAndDirection1 value) {
        this.isseDscntAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the pmtLevyTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Sets the value of the pmtLevyTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setPmtLevyTax(AmountAndDirection1 value) {
        this.pmtLevyTax = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setLclTax(AmountAndDirection1 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setLclBrkrComssn(AmountAndDirection1 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setMrgn(AmountAndDirection1 value) {
        this.mrgn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setOthr(AmountAndDirection1 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the pstgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getPstgAmt() {
        return pstgAmt;
    }

    /**
     * Sets the value of the pstgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setPstgAmt(AmountAndDirection1 value) {
        this.pstgAmt = value;
        return this;
    }

    /**
     * Gets the value of the rgltryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Sets the value of the rgltryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setRgltryAmt(AmountAndDirection1 value) {
        this.rgltryAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Sets the value of the shppgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setShppgAmt(AmountAndDirection1 value) {
        this.shppgAmt = value;
        return this;
    }

    /**
     * Gets the value of the spclCncssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Sets the value of the spclCncssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setSpclCncssn(AmountAndDirection1 value) {
        this.spclCncssn = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setStmpDty(AmountAndDirection1 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the stockXchgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Sets the value of the stockXchgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setStockXchgTax(AmountAndDirection1 value) {
        this.stockXchgTax = value;
        return this;
    }

    /**
     * Gets the value of the trfTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getTrfTax() {
        return trfTax;
    }

    /**
     * Sets the value of the trfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setTrfTax(AmountAndDirection1 value) {
        this.trfTax = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setTxTax(AmountAndDirection1 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setValAddedTax(AmountAndDirection1 value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setWhldgTax(AmountAndDirection1 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the netGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Sets the value of the netGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setNetGnLoss(AmountAndDirection1 value) {
        this.netGnLoss = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setCsmptnTax(AmountAndDirection1 value) {
        this.csmptnTax = value;
        return this;
    }

    /**
     * Gets the value of the acrdCptlstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public AmountAndDirection1 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Sets the value of the acrdCptlstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection1 }
     *     
     */
    public OtherAmounts1 setAcrdCptlstnAmt(AmountAndDirection1 value) {
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
