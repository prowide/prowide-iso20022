
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
 * Numeric variables calculated on the number of transactions or on market exposures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeMetrics6", propOrder = {
    "postv",
    "neg"
})
public class VolumeMetrics6 {

    @XmlElement(name = "Postv")
    protected ExposureMetrics5 postv;
    @XmlElement(name = "Neg")
    protected ExposureMetrics5 neg;

    /**
     * Gets the value of the postv property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureMetrics5 }
     *     
     */
    public ExposureMetrics5 getPostv() {
        return postv;
    }

    /**
     * Sets the value of the postv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMetrics5 }
     *     
     */
    public VolumeMetrics6 setPostv(ExposureMetrics5 value) {
        this.postv = value;
        return this;
    }

    /**
     * Gets the value of the neg property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureMetrics5 }
     *     
     */
    public ExposureMetrics5 getNeg() {
        return neg;
    }

    /**
     * Sets the value of the neg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMetrics5 }
     *     
     */
    public VolumeMetrics6 setNeg(ExposureMetrics5 value) {
        this.neg = value;
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
