
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
 * Bank account used by a central counterparty to concentrate cash funds before or after investment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcentrationAccount1", propOrder = {
    "inFlow",
    "outFlow",
    "endOfDay",
    "peakCdt",
    "peakDbt",
    "latePmtConf"
})
public class ConcentrationAccount1 {

    @XmlElement(name = "InFlow", required = true)
    protected Flows1 inFlow;
    @XmlElement(name = "OutFlow", required = true)
    protected Flows1 outFlow;
    @XmlElement(name = "EndOfDay", required = true)
    protected AmountAndDirection102 endOfDay;
    @XmlElement(name = "PeakCdt", required = true)
    protected ActiveCurrencyAndAmount peakCdt;
    @XmlElement(name = "PeakDbt", required = true)
    protected ActiveCurrencyAndAmount peakDbt;
    @XmlElement(name = "LatePmtConf", required = true)
    protected String latePmtConf;

    /**
     * Gets the value of the inFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Flows1 }
     *     
     */
    public Flows1 getInFlow() {
        return inFlow;
    }

    /**
     * Sets the value of the inFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flows1 }
     *     
     */
    public ConcentrationAccount1 setInFlow(Flows1 value) {
        this.inFlow = value;
        return this;
    }

    /**
     * Gets the value of the outFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Flows1 }
     *     
     */
    public Flows1 getOutFlow() {
        return outFlow;
    }

    /**
     * Sets the value of the outFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flows1 }
     *     
     */
    public ConcentrationAccount1 setOutFlow(Flows1 value) {
        this.outFlow = value;
        return this;
    }

    /**
     * Gets the value of the endOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getEndOfDay() {
        return endOfDay;
    }

    /**
     * Sets the value of the endOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public ConcentrationAccount1 setEndOfDay(AmountAndDirection102 value) {
        this.endOfDay = value;
        return this;
    }

    /**
     * Gets the value of the peakCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakCdt() {
        return peakCdt;
    }

    /**
     * Sets the value of the peakCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ConcentrationAccount1 setPeakCdt(ActiveCurrencyAndAmount value) {
        this.peakCdt = value;
        return this;
    }

    /**
     * Gets the value of the peakDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakDbt() {
        return peakDbt;
    }

    /**
     * Sets the value of the peakDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ConcentrationAccount1 setPeakDbt(ActiveCurrencyAndAmount value) {
        this.peakDbt = value;
        return this;
    }

    /**
     * Gets the value of the latePmtConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatePmtConf() {
        return latePmtConf;
    }

    /**
     * Sets the value of the latePmtConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ConcentrationAccount1 setLatePmtConf(String value) {
        this.latePmtConf = value;
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
