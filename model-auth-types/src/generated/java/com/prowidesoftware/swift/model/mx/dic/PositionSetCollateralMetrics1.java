
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
 * Variables used to quantify the different calculations for collateral position sets and currency collateral position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetCollateralMetrics1", propOrder = {
    "ttl",
    "clean"
})
public class PositionSetCollateralMetrics1 {

    @XmlElement(name = "Ttl")
    protected PositionSetCollateralTotal1 ttl;
    @XmlElement(name = "Clean")
    protected PositionSetCollateralTotal1 clean;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetCollateralTotal1 }
     *     
     */
    public PositionSetCollateralTotal1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetCollateralTotal1 }
     *     
     */
    public PositionSetCollateralMetrics1 setTtl(PositionSetCollateralTotal1 value) {
        this.ttl = value;
        return this;
    }

    /**
     * Gets the value of the clean property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetCollateralTotal1 }
     *     
     */
    public PositionSetCollateralTotal1 getClean() {
        return clean;
    }

    /**
     * Sets the value of the clean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetCollateralTotal1 }
     *     
     */
    public PositionSetCollateralMetrics1 setClean(PositionSetCollateralTotal1 value) {
        this.clean = value;
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
