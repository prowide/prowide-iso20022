
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Choice to define the price of the securities transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice10Choice", propOrder = {
    "mntryVal",
    "unit",
    "pctg",
    "yld",
    "pdgPric",
    "othr"
})
public class SecuritiesTransactionPrice10Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection54 mntryVal;
    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "PdgPric")
    @XmlSchemaType(name = "string")
    protected PriceStatus1Code pdgPric;
    @XmlElement(name = "Othr")
    protected SecuritiesTransactionPrice4 othr;

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection54 }
     *     
     */
    public AmountAndDirection54 getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection54 }
     *     
     */
    public SecuritiesTransactionPrice10Choice setMntryVal(AmountAndDirection54 value) {
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
    public SecuritiesTransactionPrice10Choice setUnit(BigDecimal value) {
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
    public SecuritiesTransactionPrice10Choice setPctg(BigDecimal value) {
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
    public SecuritiesTransactionPrice10Choice setYld(BigDecimal value) {
        this.yld = value;
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
    public SecuritiesTransactionPrice10Choice setPdgPric(PriceStatus1Code value) {
        this.pdgPric = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4 }
     *     
     */
    public SecuritiesTransactionPrice4 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4 }
     *     
     */
    public SecuritiesTransactionPrice10Choice setOthr(SecuritiesTransactionPrice4 value) {
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
