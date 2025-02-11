
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
 * Choice number format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number4Choice", propOrder = {
    "shrt",
    "lng"
})
public class Number4Choice {

    @XmlElement(name = "Shrt")
    protected String shrt;
    @XmlElement(name = "Lng")
    protected GenericIdentification18 lng;

    /**
     * Gets the value of the shrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrt() {
        return shrt;
    }

    /**
     * Sets the value of the shrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Number4Choice setShrt(String value) {
        this.shrt = value;
        return this;
    }

    /**
     * Gets the value of the lng property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification18 }
     *     
     */
    public GenericIdentification18 getLng() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification18 }
     *     
     */
    public Number4Choice setLng(GenericIdentification18 value) {
        this.lng = value;
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
