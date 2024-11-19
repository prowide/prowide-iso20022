
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
 * Identifies an airport by its location and by its name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportDescription1", propOrder = {
    "twn",
    "airprtNm"
})
public class AirportDescription1 {

    @XmlElement(name = "Twn", required = true)
    protected String twn;
    @XmlElement(name = "AirprtNm")
    protected String airprtNm;

    /**
     * Gets the value of the twn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwn() {
        return twn;
    }

    /**
     * Sets the value of the twn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AirportDescription1 setTwn(String value) {
        this.twn = value;
        return this;
    }

    /**
     * Gets the value of the airprtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirprtNm() {
        return airprtNm;
    }

    /**
     * Sets the value of the airprtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AirportDescription1 setAirprtNm(String value) {
        this.airprtNm = value;
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
