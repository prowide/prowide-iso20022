
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
 * Statistics for a financial instrument generated as part of transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsTransparency3", propOrder = {
    "avrgDalyTrnvr",
    "avrgTxVal",
    "lrgInScale",
    "stdMktSz",
    "avrgDalyNbOfTxs",
    "ttlNbOfTxsExctd",
    "ttlVolOfTxsExctd",
    "ttlNbOfTradgDays"
})
public class StatisticsTransparency3 {

    @XmlElement(name = "AvrgDalyTrnvr")
    protected ActiveCurrencyAndAmount avrgDalyTrnvr;
    @XmlElement(name = "AvrgTxVal")
    protected ActiveCurrencyAndAmount avrgTxVal;
    @XmlElement(name = "LrgInScale")
    protected BigDecimal lrgInScale;
    @XmlElement(name = "StdMktSz")
    protected BigDecimal stdMktSz;
    @XmlElement(name = "AvrgDalyNbOfTxs")
    protected BigDecimal avrgDalyNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsExctd")
    protected BigDecimal ttlNbOfTxsExctd;
    @XmlElement(name = "TtlVolOfTxsExctd")
    protected BigDecimal ttlVolOfTxsExctd;
    @XmlElement(name = "TtlNbOfTradgDays")
    protected BigDecimal ttlNbOfTradgDays;

    /**
     * Gets the value of the avrgDalyTrnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgDalyTrnvr() {
        return avrgDalyTrnvr;
    }

    /**
     * Sets the value of the avrgDalyTrnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public StatisticsTransparency3 setAvrgDalyTrnvr(ActiveCurrencyAndAmount value) {
        this.avrgDalyTrnvr = value;
        return this;
    }

    /**
     * Gets the value of the avrgTxVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgTxVal() {
        return avrgTxVal;
    }

    /**
     * Sets the value of the avrgTxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public StatisticsTransparency3 setAvrgTxVal(ActiveCurrencyAndAmount value) {
        this.avrgTxVal = value;
        return this;
    }

    /**
     * Gets the value of the lrgInScale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLrgInScale() {
        return lrgInScale;
    }

    /**
     * Sets the value of the lrgInScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency3 setLrgInScale(BigDecimal value) {
        this.lrgInScale = value;
        return this;
    }

    /**
     * Gets the value of the stdMktSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdMktSz() {
        return stdMktSz;
    }

    /**
     * Sets the value of the stdMktSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency3 setStdMktSz(BigDecimal value) {
        this.stdMktSz = value;
        return this;
    }

    /**
     * Gets the value of the avrgDalyNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrgDalyNbOfTxs() {
        return avrgDalyNbOfTxs;
    }

    /**
     * Sets the value of the avrgDalyNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency3 setAvrgDalyNbOfTxs(BigDecimal value) {
        this.avrgDalyNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxsExctd() {
        return ttlNbOfTxsExctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency3 setTtlNbOfTxsExctd(BigDecimal value) {
        this.ttlNbOfTxsExctd = value;
        return this;
    }

    /**
     * Gets the value of the ttlVolOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlVolOfTxsExctd() {
        return ttlVolOfTxsExctd;
    }

    /**
     * Sets the value of the ttlVolOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency3 setTtlVolOfTxsExctd(BigDecimal value) {
        this.ttlVolOfTxsExctd = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfTradgDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTradgDays() {
        return ttlNbOfTradgDays;
    }

    /**
     * Sets the value of the ttlNbOfTradgDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsTransparency3 setTtlNbOfTradgDays(BigDecimal value) {
        this.ttlNbOfTradgDays = value;
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
