
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
 * Specifies the tax identification related to a service to be billed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTaxIdentification3", propOrder = {
    "vatRegnNb",
    "taxRegnNb",
    "taxCtct"
})
public class BillingTaxIdentification3 {

    @XmlElement(name = "VATRegnNb")
    protected String vatRegnNb;
    @XmlElement(name = "TaxRegnNb")
    protected String taxRegnNb;
    @XmlElement(name = "TaxCtct")
    protected Contact13 taxCtct;

    /**
     * Gets the value of the vatRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRegnNb() {
        return vatRegnNb;
    }

    /**
     * Sets the value of the vatRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxIdentification3 setVATRegnNb(String value) {
        this.vatRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the taxRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegnNb() {
        return taxRegnNb;
    }

    /**
     * Sets the value of the taxRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingTaxIdentification3 setTaxRegnNb(String value) {
        this.taxRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the taxCtct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact13 }
     *     
     */
    public Contact13 getTaxCtct() {
        return taxCtct;
    }

    /**
     * Sets the value of the taxCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact13 }
     *     
     */
    public BillingTaxIdentification3 setTaxCtct(Contact13 value) {
        this.taxCtct = value;
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
