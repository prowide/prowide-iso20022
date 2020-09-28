
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
 * Information used to calculate the tax.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCalculationInformation3", propOrder = {
    "bsis",
    "euCptlGn",
    "taxblAmt"
})
public class TaxCalculationInformation3 {

    @XmlElement(name = "Bsis")
    protected TaxationBasis1 bsis;
    @XmlElement(name = "EUCptlGn")
    protected EUCapitalGain1 euCptlGn;
    @XmlElement(name = "TaxblAmt")
    protected ActiveCurrencyAnd13DecimalAmount taxblAmt;

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link TaxationBasis1 }
     *     
     */
    public TaxationBasis1 getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxationBasis1 }
     *     
     */
    public TaxCalculationInformation3 setBsis(TaxationBasis1 value) {
        this.bsis = value;
        return this;
    }

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
    public TaxCalculationInformation3 setEUCptlGn(EUCapitalGain1 value) {
        this.euCptlGn = value;
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
    public TaxCalculationInformation3 setTaxblAmt(ActiveCurrencyAnd13DecimalAmount value) {
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
