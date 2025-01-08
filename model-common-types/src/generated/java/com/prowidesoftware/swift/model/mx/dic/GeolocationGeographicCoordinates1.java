
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
 * Location on the Earth specified by two numbers representing vertical and horizontal position.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeolocationGeographicCoordinates1", propOrder = {
    "lat",
    "_long"
})
public class GeolocationGeographicCoordinates1 {

    @XmlElement(name = "Lat", required = true)
    protected String lat;
    @XmlElement(name = "Long", required = true)
    protected String _long;

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeolocationGeographicCoordinates1 setLat(String value) {
        this.lat = value;
        return this;
    }

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeolocationGeographicCoordinates1 setLong(String value) {
        this._long = value;
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
