
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Valuation details for the securities position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationsDetails1", propOrder = {
    "mktPric",
    "srcOfPric",
    "sttlmDt",
    "valtnDtlsAmt",
    "acrdIntrst",
    "cleanPric",
    "valtnFctrBrkdwn",
    "nbOfDaysAcrd",
    "qtnAge"
})
public class ValuationsDetails1 {

    @XmlElement(name = "MktPric")
    protected Price7 mktPric;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification89 srcOfPric;
    @XmlElement(name = "SttlmDt")
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "ValtnDtlsAmt", required = true)
    protected CollateralAmount4 valtnDtlsAmt;
    @XmlElement(name = "AcrdIntrst")
    protected ActiveOrHistoricCurrencyAndAmount acrdIntrst;
    @XmlElement(name = "CleanPric")
    protected ActiveOrHistoricCurrencyAndAmount cleanPric;
    @XmlElement(name = "ValtnFctrBrkdwn", required = true)
    protected ValuationFactorBreakdown1 valtnFctrBrkdwn;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "QtnAge")
    protected BigDecimal qtnAge;

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public ValuationsDetails1 setMktPric(Price7 value) {
        this.mktPric = value;
        return this;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification89 }
     *     
     */
    public MarketIdentification89 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification89 }
     *     
     */
    public ValuationsDetails1 setSrcOfPric(MarketIdentification89 value) {
        this.srcOfPric = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public ValuationsDetails1 setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the valtnDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount4 }
     *     
     */
    public CollateralAmount4 getValtnDtlsAmt() {
        return valtnDtlsAmt;
    }

    /**
     * Sets the value of the valtnDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount4 }
     *     
     */
    public ValuationsDetails1 setValtnDtlsAmt(CollateralAmount4 value) {
        this.valtnDtlsAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAcrdIntrst() {
        return acrdIntrst;
    }

    /**
     * Sets the value of the acrdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ValuationsDetails1 setAcrdIntrst(ActiveOrHistoricCurrencyAndAmount value) {
        this.acrdIntrst = value;
        return this;
    }

    /**
     * Gets the value of the cleanPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCleanPric() {
        return cleanPric;
    }

    /**
     * Sets the value of the cleanPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ValuationsDetails1 setCleanPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.cleanPric = value;
        return this;
    }

    /**
     * Gets the value of the valtnFctrBrkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationFactorBreakdown1 }
     *     
     */
    public ValuationFactorBreakdown1 getValtnFctrBrkdwn() {
        return valtnFctrBrkdwn;
    }

    /**
     * Sets the value of the valtnFctrBrkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationFactorBreakdown1 }
     *     
     */
    public ValuationsDetails1 setValtnFctrBrkdwn(ValuationFactorBreakdown1 value) {
        this.valtnFctrBrkdwn = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationsDetails1 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the qtnAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtnAge() {
        return qtnAge;
    }

    /**
     * Sets the value of the qtnAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationsDetails1 setQtnAge(BigDecimal value) {
        this.qtnAge = value;
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
