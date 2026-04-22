
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
 * Specifies tax vouchers in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxVoucher6", propOrder = {
    "taxVchrRef",
    "taxRclmDcmnttnRef",
    "bnfclOwnrRef"
})
public class TaxVoucher6 {

    @XmlElement(name = "TaxVchrRef")
    protected String taxVchrRef;
    @XmlElement(name = "TaxRclmDcmnttnRef")
    protected String taxRclmDcmnttnRef;
    @XmlElement(name = "BnfclOwnrRef")
    protected String bnfclOwnrRef;

    /**
     * Gets the value of the taxVchrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxVchrRef() {
        return taxVchrRef;
    }

    /**
     * Sets the value of the taxVchrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxVoucher6 setTaxVchrRef(String value) {
        this.taxVchrRef = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmDcmnttnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRclmDcmnttnRef() {
        return taxRclmDcmnttnRef;
    }

    /**
     * Sets the value of the taxRclmDcmnttnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxVoucher6 setTaxRclmDcmnttnRef(String value) {
        this.taxRclmDcmnttnRef = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfclOwnrRef() {
        return bnfclOwnrRef;
    }

    /**
     * Sets the value of the bnfclOwnrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxVoucher6 setBnfclOwnrRef(String value) {
        this.bnfclOwnrRef = value;
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
