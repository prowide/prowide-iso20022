
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
 * Specifies the tax income non assessable details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeNonAssessable1", propOrder = {
    "grssCsh",
    "taxDfrrdAmt",
    "taxXmptAmt"
})
public class TaxIncomeNonAssessable1 {

    @XmlElement(name = "GrssCsh")
    protected ActiveCurrencyAndAmount grssCsh;
    @XmlElement(name = "TaxDfrrdAmt")
    protected ActiveCurrencyAndAmount taxDfrrdAmt;
    @XmlElement(name = "TaxXmptAmt")
    protected ActiveCurrencyAndAmount taxXmptAmt;

    /**
     * Gets the value of the grssCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssCsh() {
        return grssCsh;
    }

    /**
     * Sets the value of the grssCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeNonAssessable1 setGrssCsh(ActiveCurrencyAndAmount value) {
        this.grssCsh = value;
        return this;
    }

    /**
     * Gets the value of the taxDfrrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxDfrrdAmt() {
        return taxDfrrdAmt;
    }

    /**
     * Sets the value of the taxDfrrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeNonAssessable1 setTaxDfrrdAmt(ActiveCurrencyAndAmount value) {
        this.taxDfrrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxXmptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxXmptAmt() {
        return taxXmptAmt;
    }

    /**
     * Sets the value of the taxXmptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeNonAssessable1 setTaxXmptAmt(ActiveCurrencyAndAmount value) {
        this.taxXmptAmt = value;
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
