
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
@XmlType(name = "PositionSet4", propOrder = {
    "dmnsns",
    "mtrcs"
})
public class PositionSet4 {

    @XmlElement(name = "Dmnsns", required = true)
    protected PositionSetCollateralDimensions2 dmnsns;
    @XmlElement(name = "Mtrcs", required = true)
    protected PositionSetCollateralMetrics1 mtrcs;

    /**
     * Gets the value of the dmnsns property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetCollateralDimensions2 }
     *     
     */
    public PositionSetCollateralDimensions2 getDmnsns() {
        return dmnsns;
    }

    /**
     * Sets the value of the dmnsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetCollateralDimensions2 }
     *     
     */
    public PositionSet4 setDmnsns(PositionSetCollateralDimensions2 value) {
        this.dmnsns = value;
        return this;
    }

    /**
     * Gets the value of the mtrcs property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetCollateralMetrics1 }
     *     
     */
    public PositionSetCollateralMetrics1 getMtrcs() {
        return mtrcs;
    }

    /**
     * Sets the value of the mtrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetCollateralMetrics1 }
     *     
     */
    public PositionSet4 setMtrcs(PositionSetCollateralMetrics1 value) {
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
