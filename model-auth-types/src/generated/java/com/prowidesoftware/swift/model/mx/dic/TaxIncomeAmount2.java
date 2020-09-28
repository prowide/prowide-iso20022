
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the tax income amount details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeAmount2", propOrder = {
    "csh",
    "tax",
    "taxbl"
})
public class TaxIncomeAmount2 {

    @XmlElement(name = "Csh")
    protected ActiveCurrencyAndAmount csh;
    @XmlElement(name = "Tax")
    protected ActiveCurrencyAndAmount tax;
    @XmlElement(name = "Taxbl")
    protected ActiveCurrencyAndAmount taxbl;

    /**
     * Gets the value of the csh property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCsh() {
        return csh;
    }

    /**
     * Sets the value of the csh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeAmount2 setCsh(ActiveCurrencyAndAmount value) {
        this.csh = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeAmount2 setTax(ActiveCurrencyAndAmount value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the taxbl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxbl() {
        return taxbl;
    }

    /**
     * Sets the value of the taxbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxIncomeAmount2 setTaxbl(ActiveCurrencyAndAmount value) {
        this.taxbl = value;
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
