
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
 * Describes account taxing parameters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTax1", propOrder = {
    "clctnMtd",
    "rgn",
    "nonResCtry"
})
public class AccountTax1 {

    @XmlElement(name = "ClctnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected BillingTaxCalculationMethod1Code clctnMtd;
    @XmlElement(name = "Rgn")
    protected String rgn;
    @XmlElement(name = "NonResCtry")
    protected ResidenceLocation1Choice nonResCtry;

    /**
     * Gets the value of the clctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTaxCalculationMethod1Code }
     *     
     */
    public BillingTaxCalculationMethod1Code getClctnMtd() {
        return clctnMtd;
    }

    /**
     * Sets the value of the clctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTaxCalculationMethod1Code }
     *     
     */
    public AccountTax1 setClctnMtd(BillingTaxCalculationMethod1Code value) {
        this.clctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the rgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgn() {
        return rgn;
    }

    /**
     * Sets the value of the rgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountTax1 setRgn(String value) {
        this.rgn = value;
        return this;
    }

    /**
     * Gets the value of the nonResCtry property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceLocation1Choice }
     *     
     */
    public ResidenceLocation1Choice getNonResCtry() {
        return nonResCtry;
    }

    /**
     * Sets the value of the nonResCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceLocation1Choice }
     *     
     */
    public AccountTax1 setNonResCtry(ResidenceLocation1Choice value) {
        this.nonResCtry = value;
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
