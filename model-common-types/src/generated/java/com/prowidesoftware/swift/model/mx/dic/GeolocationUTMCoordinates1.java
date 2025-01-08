
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
 * Location on the Earth specified by the Universal Transverse Mercator coordinate system.
 * Identifies the geographic location using the WGS84 ellipsoid spatial reference system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeolocationUTMCoordinates1", propOrder = {
    "utmZone",
    "utmEstwrd",
    "utmNrthwrd"
})
public class GeolocationUTMCoordinates1 {

    @XmlElement(name = "UTMZone", required = true)
    protected String utmZone;
    @XmlElement(name = "UTMEstwrd", required = true)
    protected String utmEstwrd;
    @XmlElement(name = "UTMNrthwrd", required = true)
    protected String utmNrthwrd;

    /**
     * Gets the value of the utmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMZone() {
        return utmZone;
    }

    /**
     * Sets the value of the utmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeolocationUTMCoordinates1 setUTMZone(String value) {
        this.utmZone = value;
        return this;
    }

    /**
     * Gets the value of the utmEstwrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMEstwrd() {
        return utmEstwrd;
    }

    /**
     * Sets the value of the utmEstwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeolocationUTMCoordinates1 setUTMEstwrd(String value) {
        this.utmEstwrd = value;
        return this;
    }

    /**
     * Gets the value of the utmNrthwrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMNrthwrd() {
        return utmNrthwrd;
    }

    /**
     * Sets the value of the utmNrthwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeolocationUTMCoordinates1 setUTMNrthwrd(String value) {
        this.utmNrthwrd = value;
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
