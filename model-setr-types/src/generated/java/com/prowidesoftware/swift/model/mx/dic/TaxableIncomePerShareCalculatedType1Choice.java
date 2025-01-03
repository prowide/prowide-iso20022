
package com.prowidesoftware.swift.model.mx.dic;

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
 * Choice of a taxable income per share calcualted type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxableIncomePerShareCalculatedType1Choice", propOrder = {
    "taxblIncmPerShrClctd",
    "prtry"
})
public class TaxableIncomePerShareCalculatedType1Choice {

    @XmlElement(name = "TaxblIncmPerShrClctd")
    @XmlSchemaType(name = "string")
    protected TaxableIncomePerShareCalculated2Code taxblIncmPerShrClctd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification13 prtry;

    /**
     * Gets the value of the taxblIncmPerShrClctd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public TaxableIncomePerShareCalculated2Code getTaxblIncmPerShrClctd() {
        return taxblIncmPerShrClctd;
    }

    /**
     * Sets the value of the taxblIncmPerShrClctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableIncomePerShareCalculated2Code }
     *     
     */
    public TaxableIncomePerShareCalculatedType1Choice setTaxblIncmPerShrClctd(TaxableIncomePerShareCalculated2Code value) {
        this.taxblIncmPerShrClctd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification13 }
     *     
     */
    public GenericIdentification13 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification13 }
     *     
     */
    public TaxableIncomePerShareCalculatedType1Choice setPrtry(GenericIdentification13 value) {
        this.prtry = value;
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
