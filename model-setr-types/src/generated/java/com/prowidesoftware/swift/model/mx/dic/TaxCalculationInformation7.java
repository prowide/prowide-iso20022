
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
 * Information used to calculate the tax.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculationInformation7", propOrder = {
    "taxClctnBsis",
    "taxblAmt"
})
public class TaxCalculationInformation7 {

    @XmlElement(name = "TaxClctnBsis")
    protected TaxCalculationBasisType1Choice taxClctnBsis;
    @XmlElement(name = "TaxblAmt")
    protected ActiveCurrencyAnd13DecimalAmount taxblAmt;

    /**
     * Gets the value of the taxClctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculationBasisType1Choice }
     *     
     */
    public TaxCalculationBasisType1Choice getTaxClctnBsis() {
        return taxClctnBsis;
    }

    /**
     * Sets the value of the taxClctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculationBasisType1Choice }
     *     
     */
    public TaxCalculationInformation7 setTaxClctnBsis(TaxCalculationBasisType1Choice value) {
        this.taxClctnBsis = value;
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
    public TaxCalculationInformation7 setTaxblAmt(ActiveCurrencyAnd13DecimalAmount value) {
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
