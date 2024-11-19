
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
 * Source of a price quotation when it is not the local market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSource", propOrder = {
    "pricSrc",
    "nrrtv"
})
public class PriceSource {

    @XmlElement(name = "PricSrc", required = true)
    @XmlSchemaType(name = "string")
    protected PriceSource1Code pricSrc;
    @XmlElement(name = "Nrrtv")
    protected String nrrtv;

    /**
     * Gets the value of the pricSrc property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSource1Code }
     *     
     */
    public PriceSource1Code getPricSrc() {
        return pricSrc;
    }

    /**
     * Sets the value of the pricSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSource1Code }
     *     
     */
    public PriceSource setPricSrc(PriceSource1Code value) {
        this.pricSrc = value;
        return this;
    }

    /**
     * Gets the value of the nrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrrtv() {
        return nrrtv;
    }

    /**
     * Sets the value of the nrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriceSource setNrrtv(String value) {
        this.nrrtv = value;
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
