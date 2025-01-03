
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides amounts taken in to account to calculate the collateral position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryAmounts1", propOrder = {
    "thrshldAmt",
    "thrshldTp",
    "preHrcutCollVal",
    "adjstdXpsr",
    "collReqrd",
    "minTrfAmt",
    "rndgAmt",
    "prvsXpsrVal",
    "prvsCollVal",
    "ttlPdgIncmgColl",
    "ttlPdgOutgngColl",
    "ttlAcrdIntrstAmt",
    "ttlFees"
})
public class SummaryAmounts1 {

    @XmlElement(name = "ThrshldAmt")
    protected ActiveCurrencyAndAmount thrshldAmt;
    @XmlElement(name = "ThrshldTp")
    @XmlSchemaType(name = "string")
    protected ThresholdType1Code thrshldTp;
    @XmlElement(name = "PreHrcutCollVal")
    protected ActiveCurrencyAndAmount preHrcutCollVal;
    @XmlElement(name = "AdjstdXpsr")
    protected ActiveCurrencyAndAmount adjstdXpsr;
    @XmlElement(name = "CollReqrd")
    protected ActiveCurrencyAndAmount collReqrd;
    @XmlElement(name = "MinTrfAmt")
    protected ActiveCurrencyAndAmount minTrfAmt;
    @XmlElement(name = "RndgAmt")
    protected ActiveCurrencyAndAmount rndgAmt;
    @XmlElement(name = "PrvsXpsrVal")
    protected ActiveCurrencyAndAmount prvsXpsrVal;
    @XmlElement(name = "PrvsCollVal")
    protected ActiveCurrencyAndAmount prvsCollVal;
    @XmlElement(name = "TtlPdgIncmgColl")
    protected ActiveCurrencyAndAmount ttlPdgIncmgColl;
    @XmlElement(name = "TtlPdgOutgngColl")
    protected ActiveCurrencyAndAmount ttlPdgOutgngColl;
    @XmlElement(name = "TtlAcrdIntrstAmt")
    protected ActiveCurrencyAndAmount ttlAcrdIntrstAmt;
    @XmlElement(name = "TtlFees")
    protected ActiveCurrencyAndAmount ttlFees;

    /**
     * Gets the value of the thrshldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getThrshldAmt() {
        return thrshldAmt;
    }

    /**
     * Sets the value of the thrshldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setThrshldAmt(ActiveCurrencyAndAmount value) {
        this.thrshldAmt = value;
        return this;
    }

    /**
     * Gets the value of the thrshldTp property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdType1Code }
     *     
     */
    public ThresholdType1Code getThrshldTp() {
        return thrshldTp;
    }

    /**
     * Sets the value of the thrshldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdType1Code }
     *     
     */
    public SummaryAmounts1 setThrshldTp(ThresholdType1Code value) {
        this.thrshldTp = value;
        return this;
    }

    /**
     * Gets the value of the preHrcutCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPreHrcutCollVal() {
        return preHrcutCollVal;
    }

    /**
     * Sets the value of the preHrcutCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setPreHrcutCollVal(ActiveCurrencyAndAmount value) {
        this.preHrcutCollVal = value;
        return this;
    }

    /**
     * Gets the value of the adjstdXpsr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAdjstdXpsr() {
        return adjstdXpsr;
    }

    /**
     * Sets the value of the adjstdXpsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setAdjstdXpsr(ActiveCurrencyAndAmount value) {
        this.adjstdXpsr = value;
        return this;
    }

    /**
     * Gets the value of the collReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollReqrd() {
        return collReqrd;
    }

    /**
     * Sets the value of the collReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setCollReqrd(ActiveCurrencyAndAmount value) {
        this.collReqrd = value;
        return this;
    }

    /**
     * Gets the value of the minTrfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinTrfAmt() {
        return minTrfAmt;
    }

    /**
     * Sets the value of the minTrfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setMinTrfAmt(ActiveCurrencyAndAmount value) {
        this.minTrfAmt = value;
        return this;
    }

    /**
     * Gets the value of the rndgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRndgAmt() {
        return rndgAmt;
    }

    /**
     * Sets the value of the rndgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setRndgAmt(ActiveCurrencyAndAmount value) {
        this.rndgAmt = value;
        return this;
    }

    /**
     * Gets the value of the prvsXpsrVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsXpsrVal() {
        return prvsXpsrVal;
    }

    /**
     * Sets the value of the prvsXpsrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setPrvsXpsrVal(ActiveCurrencyAndAmount value) {
        this.prvsXpsrVal = value;
        return this;
    }

    /**
     * Gets the value of the prvsCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsCollVal() {
        return prvsCollVal;
    }

    /**
     * Sets the value of the prvsCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setPrvsCollVal(ActiveCurrencyAndAmount value) {
        this.prvsCollVal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgIncmgColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPdgIncmgColl() {
        return ttlPdgIncmgColl;
    }

    /**
     * Sets the value of the ttlPdgIncmgColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setTtlPdgIncmgColl(ActiveCurrencyAndAmount value) {
        this.ttlPdgIncmgColl = value;
        return this;
    }

    /**
     * Gets the value of the ttlPdgOutgngColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPdgOutgngColl() {
        return ttlPdgOutgngColl;
    }

    /**
     * Sets the value of the ttlPdgOutgngColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setTtlPdgOutgngColl(ActiveCurrencyAndAmount value) {
        this.ttlPdgOutgngColl = value;
        return this;
    }

    /**
     * Gets the value of the ttlAcrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAcrdIntrstAmt() {
        return ttlAcrdIntrstAmt;
    }

    /**
     * Sets the value of the ttlAcrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setTtlAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.ttlAcrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the ttlFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFees() {
        return ttlFees;
    }

    /**
     * Sets the value of the ttlFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SummaryAmounts1 setTtlFees(ActiveCurrencyAndAmount value) {
        this.ttlFees = value;
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
