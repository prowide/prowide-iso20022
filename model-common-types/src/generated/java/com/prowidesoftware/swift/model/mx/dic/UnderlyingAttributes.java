
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional details on the underlying. In securities financing deals, it is used to identify and provide information on the collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingAttributes", propOrder = {
    "allcnPct",
    "qty",
    "sttlmTp",
    "cshAmt",
    "cshTp",
    "pric",
    "drtyPric",
    "endPric",
    "startVal",
    "curVal",
    "endVal",
    "adjstdQty",
    "xchgRate",
    "capVal"
})
public class UnderlyingAttributes {

    @XmlElement(name = "AllcnPct")
    protected BigDecimal allcnPct;
    @XmlElement(name = "Qty")
    protected UnitOrFaceAmountChoice qty;
    @XmlElement(name = "SttlmTp")
    @XmlSchemaType(name = "string")
    protected SettlementType1Code sttlmTp;
    @XmlElement(name = "CshAmt")
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "CshTp")
    protected String cshTp;
    @XmlElement(name = "Pric")
    protected Price1 pric;
    @XmlElement(name = "DrtyPric")
    protected Price1 drtyPric;
    @XmlElement(name = "EndPric")
    protected Price1 endPric;
    @XmlElement(name = "StartVal")
    protected ActiveCurrencyAndAmount startVal;
    @XmlElement(name = "CurVal")
    protected ActiveCurrencyAndAmount curVal;
    @XmlElement(name = "EndVal")
    protected ActiveCurrencyAndAmount endVal;
    @XmlElement(name = "AdjstdQty")
    protected UnitOrFaceAmountChoice adjstdQty;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CapVal")
    protected ActiveCurrencyAndAmount capVal;

    /**
     * Gets the value of the allcnPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllcnPct() {
        return allcnPct;
    }

    /**
     * Sets the value of the allcnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UnderlyingAttributes setAllcnPct(BigDecimal value) {
        this.allcnPct = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnitOrFaceAmountChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnderlyingAttributes setQty(UnitOrFaceAmountChoice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType1Code }
     *     
     */
    public SettlementType1Code getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType1Code }
     *     
     */
    public UnderlyingAttributes setSttlmTp(SettlementType1Code value) {
        this.sttlmTp = value;
        return this;
    }

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnderlyingAttributes setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshTp() {
        return cshTp;
    }

    /**
     * Sets the value of the cshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingAttributes setCshTp(String value) {
        this.cshTp = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public UnderlyingAttributes setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the drtyPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getDrtyPric() {
        return drtyPric;
    }

    /**
     * Sets the value of the drtyPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public UnderlyingAttributes setDrtyPric(Price1 value) {
        this.drtyPric = value;
        return this;
    }

    /**
     * Gets the value of the endPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getEndPric() {
        return endPric;
    }

    /**
     * Sets the value of the endPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public UnderlyingAttributes setEndPric(Price1 value) {
        this.endPric = value;
        return this;
    }

    /**
     * Gets the value of the startVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStartVal() {
        return startVal;
    }

    /**
     * Sets the value of the startVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnderlyingAttributes setStartVal(ActiveCurrencyAndAmount value) {
        this.startVal = value;
        return this;
    }

    /**
     * Gets the value of the curVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCurVal() {
        return curVal;
    }

    /**
     * Sets the value of the curVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnderlyingAttributes setCurVal(ActiveCurrencyAndAmount value) {
        this.curVal = value;
        return this;
    }

    /**
     * Gets the value of the endVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEndVal() {
        return endVal;
    }

    /**
     * Sets the value of the endVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnderlyingAttributes setEndVal(ActiveCurrencyAndAmount value) {
        this.endVal = value;
        return this;
    }

    /**
     * Gets the value of the adjstdQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnitOrFaceAmountChoice getAdjstdQty() {
        return adjstdQty;
    }

    /**
     * Sets the value of the adjstdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnderlyingAttributes setAdjstdQty(UnitOrFaceAmountChoice value) {
        this.adjstdQty = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UnderlyingAttributes setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the capVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCapVal() {
        return capVal;
    }

    /**
     * Sets the value of the capVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UnderlyingAttributes setCapVal(ActiveCurrencyAndAmount value) {
        this.capVal = value;
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
