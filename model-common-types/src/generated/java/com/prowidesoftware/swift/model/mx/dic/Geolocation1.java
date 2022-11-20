
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
 * Geographic location specified by geographic or UTM coordinates.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geolocation1", propOrder = {
    "geogcCordints",
    "utmCordints"
})
public class Geolocation1 {

    @XmlElement(name = "GeogcCordints")
    protected GeolocationGeographicCoordinates1 geogcCordints;
    @XmlElement(name = "UTMCordints")
    protected GeolocationUTMCoordinates1 utmCordints;

    /**
     * Gets the value of the geogcCordints property.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationGeographicCoordinates1 }
     *     
     */
    public GeolocationGeographicCoordinates1 getGeogcCordints() {
        return geogcCordints;
    }

    /**
     * Sets the value of the geogcCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationGeographicCoordinates1 }
     *     
     */
    public Geolocation1 setGeogcCordints(GeolocationGeographicCoordinates1 value) {
        this.geogcCordints = value;
        return this;
    }

    /**
     * Gets the value of the utmCordints property.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationUTMCoordinates1 }
     *     
     */
    public GeolocationUTMCoordinates1 getUTMCordints() {
        return utmCordints;
    }

    /**
     * Sets the value of the utmCordints property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationUTMCoordinates1 }
     *     
     */
    public Geolocation1 setUTMCordints(GeolocationUTMCoordinates1 value) {
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
