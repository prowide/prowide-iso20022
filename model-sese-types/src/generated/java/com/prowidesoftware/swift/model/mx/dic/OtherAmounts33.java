
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
@XmlType(name = "OtherAmounts33", propOrder = {
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
public class OtherAmounts33 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection58 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection58 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection58 ctryNtlFdrlTax;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection58 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection58 lclTax;
    @XmlElement(name = "Othr")
    protected AmountAndDirection58 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection58 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection58 shppgAmt;
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
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection58 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection58 acrdCptlstnAmt;

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
    public OtherAmounts33 setAcrdIntrstAmt(AmountAndDirection58 value) {
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
    public OtherAmounts33 setChrgsFees(AmountAndDirection58 value) {
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
    public OtherAmounts33 setCtryNtlFdrlTax(AmountAndDirection58 value) {
        this.ctryNtlFdrlTax = value;
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
    public OtherAmounts33 setPmtLevyTax(AmountAndDirection58 value) {
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
    public OtherAmounts33 setLclTax(AmountAndDirection58 value) {
        this.lclTax = value;
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
    public OtherAmounts33 setOthr(AmountAndDirection58 value) {
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
    public OtherAmounts33 setRgltryAmt(AmountAndDirection58 value) {
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
    public OtherAmounts33 setShppgAmt(AmountAndDirection58 value) {
        this.shppgAmt = value;
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
    public OtherAmounts33 setStmpDty(AmountAndDirection58 value) {
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
    public OtherAmounts33 setStockXchgTax(AmountAndDirection58 value) {
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
    public OtherAmounts33 setTrfTax(AmountAndDirection58 value) {
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
    public OtherAmounts33 setTxTax(AmountAndDirection58 value) {
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
    public OtherAmounts33 setValAddedTax(AmountAndDirection58 value) {
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
    public OtherAmounts33 setWhldgTax(AmountAndDirection58 value) {
        this.whldgTax = value;
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
    public OtherAmounts33 setCsmptnTax(AmountAndDirection58 value) {
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
    public OtherAmounts33 setAcrdCptlstnAmt(AmountAndDirection58 value) {
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
