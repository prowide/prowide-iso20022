
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
 * Specifies a threshold level and a threshold basis for passing resolutions at general meetings.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VotingRightsThreshold1", propOrder = {
    "thrshld",
    "thrshldBsis"
})
public class VotingRightsThreshold1 {

    @XmlElement(name = "Thrshld", required = true)
    protected NumberOrPercentage1Choice thrshld;
    @XmlElement(name = "ThrshldBsis")
    protected ThresholdBasis1Choice thrshldBsis;

    /**
     * Gets the value of the thrshld property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOrPercentage1Choice }
     *     
     */
    public NumberOrPercentage1Choice getThrshld() {
        return thrshld;
    }

    /**
     * Sets the value of the thrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOrPercentage1Choice }
     *     
     */
    public VotingRightsThreshold1 setThrshld(NumberOrPercentage1Choice value) {
        this.thrshld = value;
        return this;
    }

    /**
     * Gets the value of the thrshldBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdBasis1Choice }
     *     
     */
    public ThresholdBasis1Choice getThrshldBsis() {
        return thrshldBsis;
    }

    /**
     * Sets the value of the thrshldBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdBasis1Choice }
     *     
     */
    public VotingRightsThreshold1 setThrshldBsis(ThresholdBasis1Choice value) {
        this.thrshldBsis = value;
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
