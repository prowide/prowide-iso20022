
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
 * Specifies the applicable Incoterm and associated location.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incoterms1", propOrder = {
    "cd",
    "othr",
    "lctn"
})
public class Incoterms1 {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected Incoterms1Code cd;
    @XmlElement(name = "Othr")
    protected String othr;
    @XmlElement(name = "Lctn")
    protected String lctn;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms1Code }
     *     
     */
    public Incoterms1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms1Code }
     *     
     */
    public Incoterms1 setCd(Incoterms1Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Incoterms1 setOthr(String value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Incoterms1 setLctn(String value) {
        this.lctn = value;
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
