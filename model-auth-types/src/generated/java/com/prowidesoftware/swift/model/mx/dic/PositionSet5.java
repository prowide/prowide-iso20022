
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
 * Specifies the values used to calculate positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSet5", propOrder = {
    "dmnsns",
    "mtrcs"
})
public class PositionSet5 {

    @XmlElement(name = "Dmnsns", required = true)
    protected PositionSetDimensions3 dmnsns;
    @XmlElement(name = "Mtrcs", required = true)
    protected PositionSetMetrics1 mtrcs;

    /**
     * Gets the value of the dmnsns property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetDimensions3 }
     *     
     */
    public PositionSetDimensions3 getDmnsns() {
        return dmnsns;
    }

    /**
     * Sets the value of the dmnsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetDimensions3 }
     *     
     */
    public PositionSet5 setDmnsns(PositionSetDimensions3 value) {
        this.dmnsns = value;
        return this;
    }

    /**
     * Gets the value of the mtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetMetrics1 }
     *     
     */
    public PositionSetMetrics1 getMtrcs() {
        return mtrcs;
    }

    /**
     * Sets the value of the mtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetMetrics1 }
     *     
     */
    public PositionSet5 setMtrcs(PositionSetMetrics1 value) {
        this.mtrcs = value;
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
