
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
 * Values either taken directly from the reporting fields as defined in the local regulation or derived from those fields that will be used by trade repositories to calculate positions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSet22", propOrder = {
    "dmnsns",
    "mtrcs"
})
public class PositionSet22 {

    @XmlElement(name = "Dmnsns", required = true)
    protected PositionSetCollateralDimensions3 dmnsns;
    @XmlElement(name = "Mtrcs", required = true)
    protected PositionSetCollateralMetrics2 mtrcs;

    /**
     * Gets the value of the dmnsns property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetCollateralDimensions3 }
     *     
     */
    public PositionSetCollateralDimensions3 getDmnsns() {
        return dmnsns;
    }

    /**
     * Sets the value of the dmnsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetCollateralDimensions3 }
     *     
     */
    public PositionSet22 setDmnsns(PositionSetCollateralDimensions3 value) {
        this.dmnsns = value;
        return this;
    }

    /**
     * Gets the value of the mtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetCollateralMetrics2 }
     *     
     */
    public PositionSetCollateralMetrics2 getMtrcs() {
        return mtrcs;
    }

    /**
     * Sets the value of the mtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetCollateralMetrics2 }
     *     
     */
    public PositionSet22 setMtrcs(PositionSetCollateralMetrics2 value) {
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
