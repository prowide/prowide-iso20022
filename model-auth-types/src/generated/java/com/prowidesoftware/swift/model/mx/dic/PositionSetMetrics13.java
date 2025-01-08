
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
@XmlType(name = "PositionSetMetrics13", propOrder = {
    "volMtrcs",
    "pricMtrcs"
})
public class PositionSetMetrics13 {

    @XmlElement(name = "VolMtrcs", required = true)
    protected VolumeMetrics5 volMtrcs;
    @XmlElement(name = "PricMtrcs")
    protected PriceMetrics3 pricMtrcs;

    /**
     * Gets the value of the volMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMetrics5 }
     *     
     */
    public VolumeMetrics5 getVolMtrcs() {
        return volMtrcs;
    }

    /**
     * Sets the value of the volMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMetrics5 }
     *     
     */
    public PositionSetMetrics13 setVolMtrcs(VolumeMetrics5 value) {
        this.volMtrcs = value;
        return this;
    }

    /**
     * Gets the value of the pricMtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMetrics3 }
     *     
     */
    public PriceMetrics3 getPricMtrcs() {
        return pricMtrcs;
    }

    /**
     * Sets the value of the pricMtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMetrics3 }
     *     
     */
    public PositionSetMetrics13 setPricMtrcs(PriceMetrics3 value) {
        this.pricMtrcs = value;
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
