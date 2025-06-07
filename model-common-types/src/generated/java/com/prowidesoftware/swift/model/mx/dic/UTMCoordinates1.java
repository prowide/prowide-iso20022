
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Location on the Earth specified by the Universal Transverse Mercator coordinate system, using the WGS84 geodesic system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UTMCoordinates1", propOrder = {
    "utmZone",
    "utmEstwrd",
    "utmNrthwrd"
})
public class UTMCoordinates1 {

    @XmlElement(name = "UTMZone", required = true)
    protected String utmZone;
    @XmlElement(name = "UTMEstwrd", required = true)
    protected BigDecimal utmEstwrd;
    @XmlElement(name = "UTMNrthwrd", required = true)
    protected BigDecimal utmNrthwrd;

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
    public UTMCoordinates1 setUTMZone(String value) {
        this.utmZone = value;
        return this;
    }

    /**
     * Gets the value of the utmEstwrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUTMEstwrd() {
        return utmEstwrd;
    }

    /**
     * Sets the value of the utmEstwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UTMCoordinates1 setUTMEstwrd(BigDecimal value) {
        this.utmEstwrd = value;
        return this;
    }

    /**
     * Gets the value of the utmNrthwrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUTMNrthwrd() {
        return utmNrthwrd;
    }

    /**
     * Sets the value of the utmNrthwrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public UTMCoordinates1 setUTMNrthwrd(BigDecimal value) {
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
