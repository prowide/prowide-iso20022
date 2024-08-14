
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
 * Variables used to quantify the different calculations for position sets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics10", propOrder = {
    "volMtrcs"
})
public class PositionSetMetrics10 {

    @XmlElement(name = "VolMtrcs")
    protected ExposureMetrics6 volMtrcs;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureMetrics6 }
     *     
     */
    public ExposureMetrics6 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMetrics6 }
     *     
     */
    public PositionSetMetrics10 setVolMtrcs(ExposureMetrics6 value) {
        this.volMtrcs = value;
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
