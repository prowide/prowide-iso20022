
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
 * Choice of 3 and 5 exact numeric number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number3Choice", propOrder = {
    "shrt",
    "lng"
})
public class Number3Choice {

    @XmlElement(name = "Shrt")
    protected String shrt;
    @XmlElement(name = "Lng")
    protected String lng;

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
    public Number3Choice setShrt(String value) {
        this.shrt = value;
        return this;
    }

    /**
     * Gets the value of the lng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLng() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Number3Choice setLng(String value) {
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
