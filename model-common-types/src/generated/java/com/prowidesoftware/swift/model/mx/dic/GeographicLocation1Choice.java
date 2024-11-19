
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
 * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocation1Choice", propOrder = {
    "geogcCordints",
    "utmCordints"
})
public class GeographicLocation1Choice {

    @XmlElement(name = "GeogcCordints")
    protected GeographicCoordinates1 geogcCordints;
    @XmlElement(name = "UTMCordints")
    protected UTMCoordinates1 utmCordints;

    /**
     * Gets the value of the geogcCordints property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public GeographicCoordinates1 getGeogcCordints() {
        return geogcCordints;
    }

    /**
     * Sets the value of the geogcCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public GeographicLocation1Choice setGeogcCordints(GeographicCoordinates1 value) {
        this.geogcCordints = value;
        return this;
    }

    /**
     * Gets the value of the utmCordints property.
     * 
     * @return
     *     possible object is
     *     {@link UTMCoordinates1 }
     *     
     */
    public UTMCoordinates1 getUTMCordints() {
        return utmCordints;
    }

    /**
     * Sets the value of the utmCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTMCoordinates1 }
     *     
     */
    public GeographicLocation1Choice setUTMCordints(UTMCoordinates1 value) {
        this.utmCordints = value;
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
