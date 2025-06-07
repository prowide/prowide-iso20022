
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
 * Specifies the price of the securities transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice19Choice", propOrder = {
    "mntryVal",
    "unit",
    "pctg",
    "yld",
    "dcml",
    "pdgPric",
    "othr"
})
public class SecuritiesTransactionPrice19Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection107 mntryVal;
    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "Dcml")
    protected BigDecimal dcml;
    @XmlElement(name = "PdgPric")
    @XmlSchemaType(name = "string")
    protected PriceStatus1Code pdgPric;
    @XmlElement(name = "Othr")
    protected SecuritiesTransactionPrice5 othr;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection107 }
     *     
     */
    public AmountAndDirection107 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection107 }
     *     
     */
    public SecuritiesTransactionPrice19Choice setMntryVal(AmountAndDirection107 value) {
        this.mntryVal = value;
        return this;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice19Choice setUnit(BigDecimal value) {
        this.unit = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice19Choice setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice19Choice setYld(BigDecimal value) {
        this.yld = value;
        return this;
    }

    /**
     * Gets the value of the dcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcml() {
        return dcml;
    }

    /**
     * Sets the value of the dcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesTransactionPrice19Choice setDcml(BigDecimal value) {
        this.dcml = value;
        return this;
    }

    /**
     * Gets the value of the pdgPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceStatus1Code }
     *     
     */
    public PriceStatus1Code getPdgPric() {
        return pdgPric;
    }

    /**
     * Sets the value of the pdgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStatus1Code }
     *     
     */
    public SecuritiesTransactionPrice19Choice setPdgPric(PriceStatus1Code value) {
        this.pdgPric = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice5 }
     *     
     */
    public SecuritiesTransactionPrice5 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice5 }
     *     
     */
    public SecuritiesTransactionPrice19Choice setOthr(SecuritiesTransactionPrice5 value) {
        this.othr = value;
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
