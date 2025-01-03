
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
 * Identifies an airport by its code or by its name and the town where it is located.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportName1Choice", propOrder = {
    "airprtCd",
    "othrAirprtDesc"
})
public class AirportName1Choice {

    @XmlElement(name = "AirprtCd")
    protected String airprtCd;
    @XmlElement(name = "OthrAirprtDesc")
    protected AirportDescription1 othrAirprtDesc;

    /**
     * Gets the value of the airprtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirprtCd() {
        return airprtCd;
    }

    /**
     * Sets the value of the airprtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AirportName1Choice setAirprtCd(String value) {
        this.airprtCd = value;
        return this;
    }

    /**
     * Gets the value of the othrAirprtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AirportDescription1 }
     *     
     */
    public AirportDescription1 getOthrAirprtDesc() {
        return othrAirprtDesc;
    }

    /**
     * Sets the value of the othrAirprtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportDescription1 }
     *     
     */
    public AirportName1Choice setOthrAirprtDesc(AirportDescription1 value) {
        this.othrAirprtDesc = value;
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
