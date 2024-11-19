
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
 * Financial instrument stressed under a stress test scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressedProduct1", propOrder = {
    "id",
    "maxStrssSz",
    "minStrssSz"
})
public class StressedProduct1 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification168 id;
    @XmlElement(name = "MaxStrssSz", required = true)
    protected StressSize1Choice maxStrssSz;
    @XmlElement(name = "MinStrssSz", required = true)
    protected StressSize1Choice minStrssSz;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public StressedProduct1 setId(GenericIdentification168 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the maxStrssSz property.
     * 
     * @return
     *     possible object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressSize1Choice getMaxStrssSz() {
        return maxStrssSz;
    }

    /**
     * Sets the value of the maxStrssSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressedProduct1 setMaxStrssSz(StressSize1Choice value) {
        this.maxStrssSz = value;
        return this;
    }

    /**
     * Gets the value of the minStrssSz property.
     * 
     * @return
     *     possible object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressSize1Choice getMinStrssSz() {
        return minStrssSz;
    }

    /**
     * Sets the value of the minStrssSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressSize1Choice }
     *     
     */
    public StressedProduct1 setMinStrssSz(StressSize1Choice value) {
        this.minStrssSz = value;
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
