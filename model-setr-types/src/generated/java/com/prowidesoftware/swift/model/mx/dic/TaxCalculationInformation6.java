
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "TaxCalculationInformation6", propOrder = {
    "bsis",
    "xtndedBsis",
    "taxblAmt"
})
public class TaxCalculationInformation6 {

    @XmlElement(name = "Bsis")
    @XmlSchemaType(name = "string")
    protected TaxationBasis2Code bsis;
    @XmlElement(name = "XtndedBsis")
    protected String xtndedBsis;
    @XmlElement(name = "TaxblAmt")
    protected ActiveCurrencyAnd13DecimalAmount taxblAmt;

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis2Code }
     *     
     */
    public TaxationBasis2Code getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis2Code }
     *     
     */
    public TaxCalculationInformation6 setBsis(TaxationBasis2Code value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the xtndedBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedBsis() {
        return xtndedBsis;
    }

    /**
     * Sets the value of the xtndedBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxCalculationInformation6 setXtndedBsis(String value) {
        this.xtndedBsis = value;
        return this;
    }

    /**
     * Gets the value of the taxblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTaxblAmt() {
        return taxblAmt;
    }

    /**
     * Sets the value of the taxblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxCalculationInformation6 setTaxblAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.taxblAmt = value;
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
