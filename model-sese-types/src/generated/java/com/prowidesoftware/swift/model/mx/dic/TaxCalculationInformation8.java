
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
@XmlType(name = "TaxCalculationInformation8", propOrder = {
    "bsis",
    "taxblAmt"
})
public class TaxCalculationInformation8 {

    @XmlElement(name = "Bsis")
    protected TaxBasis1Choice bsis;
    @XmlElement(name = "TaxblAmt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount taxblAmt;

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxBasis1Choice }
     *     
     */
    public TaxBasis1Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxBasis1Choice }
     *     
     */
    public TaxCalculationInformation8 setBsis(TaxBasis1Choice value) {
        this.bsis = value;
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
    public TaxCalculationInformation8 setTaxblAmt(ActiveCurrencyAnd13DecimalAmount value) {
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
