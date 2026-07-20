
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
 * Information used to calculate the tax.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculationInformation12", propOrder = {
    "euCptlGn",
    "pctgOfDebtClm",
    "pctgGrdfthdDebt",
    "taxblIncmPerDvdd",
    "euDvddSts"
})
public class TaxCalculationInformation12 {

    @XmlElement(name = "EUCptlGn")
    protected EUCapitalGainType4Choice euCptlGn;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "PctgGrdfthdDebt")
    protected BigDecimal pctgGrdfthdDebt;
    @XmlElement(name = "TaxblIncmPerDvdd")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount taxblIncmPerDvdd;
    @XmlElement(name = "EUDvddSts")
    protected EUDividendStatusType3Choice euDvddSts;

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGainType4Choice }
     *     
     */
    public EUCapitalGainType4Choice getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGainType4Choice }
     *     
     */
    public TaxCalculationInformation12 setEUCptlGn(EUCapitalGainType4Choice value) {
        this.euCptlGn = value;
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
    public TaxCalculationInformation12 setPctgOfDebtClm(BigDecimal value) {
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
    public TaxCalculationInformation12 setPctgGrdfthdDebt(BigDecimal value) {
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
    public TaxCalculationInformation12 setTaxblIncmPerDvdd(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.taxblIncmPerDvdd = value;
        return this;
    }

    /**
     * Gets the value of the euDvddSts property.
     * 
     * @return
     *     possible object is
     *     {@link EUDividendStatusType3Choice }
     *     
     */
    public EUDividendStatusType3Choice getEUDvddSts() {
        return euDvddSts;
    }

    /**
     * Sets the value of the euDvddSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUDividendStatusType3Choice }
     *     
     */
    public TaxCalculationInformation12 setEUDvddSts(EUDividendStatusType3Choice value) {
        this.euDvddSts = value;
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
