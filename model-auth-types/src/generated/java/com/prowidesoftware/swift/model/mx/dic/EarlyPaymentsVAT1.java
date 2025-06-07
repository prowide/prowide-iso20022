
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the payment terms of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPaymentsVAT1", propOrder = {
    "taxRate",
    "dscntTaxTp",
    "dscntTaxAmt"
})
public class EarlyPaymentsVAT1 {

    @XmlElement(name = "TaxRate", required = true)
    protected BigDecimal taxRate;
    @XmlElement(name = "DscntTaxTp", required = true)
    protected String dscntTaxTp;
    @XmlElement(name = "DscntTaxAmt", required = true)
    protected CurrencyAndAmount dscntTaxAmt;

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public EarlyPaymentsVAT1 setTaxRate(BigDecimal value) {
        this.taxRate = value;
        return this;
    }

    /**
     * Gets the value of the dscntTaxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscntTaxTp() {
        return dscntTaxTp;
    }

    /**
     * Sets the value of the dscntTaxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EarlyPaymentsVAT1 setDscntTaxTp(String value) {
        this.dscntTaxTp = value;
        return this;
    }

    /**
     * Gets the value of the dscntTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntTaxAmt() {
        return dscntTaxAmt;
    }

    /**
     * Sets the value of the dscntTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public EarlyPaymentsVAT1 setDscntTaxAmt(CurrencyAndAmount value) {
        this.dscntTaxAmt = value;
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
