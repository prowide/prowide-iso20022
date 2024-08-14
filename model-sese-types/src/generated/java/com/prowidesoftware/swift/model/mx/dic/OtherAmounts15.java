
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
 * Identifies other amounts pertaining to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts15", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "ctryNtlFdrlTax",
    "pmtLevyTax",
    "lclTax",
    "othr",
    "rgltryAmt",
    "shppgAmt",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "csmptnTax",
    "acrdCptlstnAmt"
})
public class OtherAmounts15 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection9 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection9 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection9 ctryNtlFdrlTax;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection9 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection9 lclTax;
    @XmlElement(name = "Othr")
    protected AmountAndDirection9 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection9 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection9 shppgAmt;
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
    public OtherAmounts15 setAcrdIntrstAmt(AmountAndDirection9 value) {
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
    public OtherAmounts15 setChrgsFees(AmountAndDirection9 value) {
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
    public OtherAmounts15 setCtryNtlFdrlTax(AmountAndDirection9 value) {
        this.ctryNtlFdrlTax = value;
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
    public OtherAmounts15 setPmtLevyTax(AmountAndDirection9 value) {
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
    public OtherAmounts15 setLclTax(AmountAndDirection9 value) {
        this.lclTax = value;
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
    public OtherAmounts15 setOthr(AmountAndDirection9 value) {
        this.othr = value;
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
    public OtherAmounts15 setRgltryAmt(AmountAndDirection9 value) {
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
    public OtherAmounts15 setShppgAmt(AmountAndDirection9 value) {
        this.shppgAmt = value;
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
    public OtherAmounts15 setStmpDty(AmountAndDirection9 value) {
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
    public OtherAmounts15 setStockXchgTax(AmountAndDirection9 value) {
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
    public OtherAmounts15 setTrfTax(AmountAndDirection9 value) {
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
    public OtherAmounts15 setTxTax(AmountAndDirection9 value) {
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
    public OtherAmounts15 setValAddedTax(AmountAndDirection9 value) {
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
    public OtherAmounts15 setWhldgTax(AmountAndDirection9 value) {
        this.whldgTax = value;
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
    public OtherAmounts15 setCsmptnTax(AmountAndDirection9 value) {
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
    public OtherAmounts15 setAcrdCptlstnAmt(AmountAndDirection9 value) {
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
