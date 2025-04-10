
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
@XmlType(name = "TaxCalculationInformation2", propOrder = {
    "euCptlGn",
    "pctgOfDebtClm",
    "pctgGrdfthdDebt"
})
public class TaxCalculationInformation2 {

    @XmlElement(name = "EUCptlGn")
    protected EUCapitalGain1 euCptlGn;
    @XmlElement(name = "PctgOfDebtClm")
    protected BigDecimal pctgOfDebtClm;
    @XmlElement(name = "PctgGrdfthdDebt")
    protected BigDecimal pctgGrdfthdDebt;

    /**
     * Gets the value of the euCptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link EUCapitalGain1 }
     *     
     */
    public EUCapitalGain1 getEUCptlGn() {
        return euCptlGn;
    }

    /**
     * Sets the value of the euCptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUCapitalGain1 }
     *     
     */
    public TaxCalculationInformation2 setEUCptlGn(EUCapitalGain1 value) {
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
    public TaxCalculationInformation2 setPctgOfDebtClm(BigDecimal value) {
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
    public TaxCalculationInformation2 setPctgGrdfthdDebt(BigDecimal value) {
        this.pctgGrdfthdDebt = value;
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
