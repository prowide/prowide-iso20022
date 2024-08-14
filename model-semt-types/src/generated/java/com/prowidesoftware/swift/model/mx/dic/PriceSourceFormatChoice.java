
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
 * Choice of the source (place) of the price quotation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSourceFormatChoice", propOrder = {
    "lclMktPlc",
    "nonLclMktPlc",
    "plcAsDSS"
})
public class PriceSourceFormatChoice {

    @XmlElement(name = "LclMktPlc")
    protected String lclMktPlc;
    @XmlElement(name = "NonLclMktPlc")
    protected PriceSource nonLclMktPlc;
    @XmlElement(name = "PlcAsDSS")
    protected GenericIdentification5 plcAsDSS;

    /**
     * Gets the value of the lclMktPlc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclMktPlc() {
        return lclMktPlc;
    }

    /**
     * Sets the value of the lclMktPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PriceSourceFormatChoice setLclMktPlc(String value) {
        this.lclMktPlc = value;
        return this;
    }

    /**
     * Gets the value of the nonLclMktPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSource }
     *     
     */
    public PriceSource getNonLclMktPlc() {
        return nonLclMktPlc;
    }

    /**
     * Sets the value of the nonLclMktPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSource }
     *     
     */
    public PriceSourceFormatChoice setNonLclMktPlc(PriceSource value) {
        this.nonLclMktPlc = value;
        return this;
    }

    /**
     * Gets the value of the plcAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification5 }
     *     
     */
    public GenericIdentification5 getPlcAsDSS() {
        return plcAsDSS;
    }

    /**
     * Sets the value of the plcAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification5 }
     *     
     */
    public PriceSourceFormatChoice setPlcAsDSS(GenericIdentification5 value) {
        this.plcAsDSS = value;
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
