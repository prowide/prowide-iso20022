
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Magnetic track or equivalent payment card data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackData2", propOrder = {
    "trckNb",
    "trckFrmt",
    "trckVal"
})
public class TrackData2 {

    @XmlElement(name = "TrckNb")
    protected BigDecimal trckNb;
    @XmlElement(name = "TrckFrmt")
    @XmlSchemaType(name = "string")
    protected TrackFormat1Code trckFrmt;
    @XmlElement(name = "TrckVal", required = true)
    protected String trckVal;

    /**
     * Gets the value of the trckNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrckNb() {
        return trckNb;
    }

    /**
     * Sets the value of the trckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TrackData2 setTrckNb(BigDecimal value) {
        this.trckNb = value;
        return this;
    }

    /**
     * Gets the value of the trckFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackFormat1Code }
     *     
     */
    public TrackFormat1Code getTrckFrmt() {
        return trckFrmt;
    }

    /**
     * Sets the value of the trckFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackFormat1Code }
     *     
     */
    public TrackData2 setTrckFrmt(TrackFormat1Code value) {
        this.trckFrmt = value;
        return this;
    }

    /**
     * Gets the value of the trckVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckVal() {
        return trckVal;
    }

    /**
     * Sets the value of the trckVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackData2 setTrckVal(String value) {
        this.trckVal = value;
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
