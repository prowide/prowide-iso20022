
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
 * Information used to calculate the tax.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculationInformation4", propOrder = {
    "euCptlGn",
    "xtndedEUCptlGn",
    "pctgOfDebtClm",
    "pctgGrdfthdDebt",
    "taxblIncmPerDvdd",
    "euDvddSts",
    "xtndedEUDvddSts"
})
public class TaxCalculationInformation4 {

    @XmlElement(name = "EUCptlGn")
    @XmlSchemaType(name = "string")
    protected EUCapitalGain2Code euCptlGn;
    @XmlElement(name = "XtndedEUCptlGn")
    protected String xtndedEUCptlGn;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "PctgGrdfthdDebt")
    protected BigDecimal pctgGrdfthdDebt;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUDvddSts")
    @XmlSchemaType(name = "string")
    protected EUDividendStatus1Code euDvddSts;
    @XmlElement(name = "XtndedEUDvddSts")
    protected String xtndedEUDvddSts;

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public EUCapitalGain2Code getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain2Code }
     *     
     */
    public TaxCalculationInformation4 setEUCptlGn(EUCapitalGain2Code value) {
        this.euCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedEUCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedEUCptlGn() {
        return xtndedEUCptlGn;
    }

    /**
     * Sets the value of the xtndedEUCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxCalculationInformation4 setXtndedEUCptlGn(String value) {
        this.xtndedEUCptlGn = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfDebtClm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfDebtClm() {
        return pctgOfDebtClm;
    }

    /**
     * Sets the value of the pctgOfDebtClm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxCalculationInformation4 setPctgOfDebtClm(BigDecimal value) {
        this.pctgOfDebtClm = value;
        return this;
    }

    /**
     * Gets the value of the pctgGrdfthdDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgGrdfthdDebt() {
        return pctgGrdfthdDebt;
    }

    /**
     * Sets the value of the pctgGrdfthdDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TaxCalculationInformation4 setPctgGrdfthdDebt(BigDecimal value) {
        this.pctgGrdfthdDebt = value;
        return this;
    }

    /**
     * Gets the value of the taxblIncmPerDvdd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getTaxblIncmPerDvdd() {
        return taxblIncmPerDvdd;
    }

    /**
     * Sets the value of the taxblIncmPerDvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxCalculationInformation4 setTaxblIncmPerDvdd(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerDvdd = value;
        return this;
    }

    /**
     * Gets the value of the euDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatus1Code }
     *     
     */
    public EUDividendStatus1Code getEUDvddSts() {
        return euDvddSts;
    }

    /**
     * Sets the value of the euDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatus1Code }
     *     
     */
    public TaxCalculationInformation4 setEUDvddSts(EUDividendStatus1Code value) {
        this.euDvddSts = value;
        return this;
    }

    /**
     * Gets the value of the xtndedEUDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedEUDvddSts() {
        return xtndedEUDvddSts;
    }

    /**
     * Sets the value of the xtndedEUDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxCalculationInformation4 setXtndedEUDvddSts(String value) {
        this.xtndedEUDvddSts = value;
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
