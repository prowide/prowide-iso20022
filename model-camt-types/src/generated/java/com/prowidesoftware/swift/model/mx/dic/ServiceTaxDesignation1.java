
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Designates the tax calculation to be applied on a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTaxDesignation1", propOrder = {
    "cd",
    "rgn",
    "taxRsn"
})
public class ServiceTaxDesignation1 {

    @XmlElement(name = "Cd", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceTaxDesignation1Code cd;
    @XmlElement(name = "Rgn")
    protected String rgn;
    @XmlElement(name = "TaxRsn")
    protected List<TaxReason1> taxRsn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTaxDesignation1Code }
     *     
     */
    public ServiceTaxDesignation1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTaxDesignation1Code }
     *     
     */
    public ServiceTaxDesignation1 setCd(ServiceTaxDesignation1Code value) {
        this.cd = value;
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
    public ServiceTaxDesignation1 setRgn(String value) {
        this.rgn = value;
        return this;
    }

    /**
     * Gets the value of the taxRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReason1 }
     * 
     * 
     * @return
     *     The value of the taxRsn property.
     */
    public List<TaxReason1> getTaxRsn() {
        if (taxRsn == null) {
            taxRsn = new ArrayList<>();
        }
        return this.taxRsn;
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

    /**
     * Adds a new item to the taxRsn list.
     * @see #getTaxRsn()
     * 
     */
    public ServiceTaxDesignation1 addTaxRsn(TaxReason1 taxRsn) {
        getTaxRsn().add(taxRsn);
        return this;
    }

}
