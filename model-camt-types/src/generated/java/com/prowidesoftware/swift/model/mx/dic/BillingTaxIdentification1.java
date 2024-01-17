
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
 * Specifies the tax identification related to a service to be billed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTaxIdentification1", propOrder = {
    "vatRegnNb",
    "taxRegnNb",
    "taxCtct"
})
public class BillingTaxIdentification1 {

    @XmlElement(name = "VATRegnNb")
    protected String vatRegnNb;
    @XmlElement(name = "TaxRegnNb")
    protected String taxRegnNb;
    @XmlElement(name = "TaxCtct")
    protected ContactDetails3 taxCtct;

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
    public BillingTaxIdentification1 setVATRegnNb(String value) {
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
    public BillingTaxIdentification1 setTaxRegnNb(String value) {
        this.taxRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the taxCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails3 }
     *     
     */
    public ContactDetails3 getTaxCtct() {
        return taxCtct;
    }

    /**
     * Sets the value of the taxCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails3 }
     *     
     */
    public BillingTaxIdentification1 setTaxCtct(ContactDetails3 value) {
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
