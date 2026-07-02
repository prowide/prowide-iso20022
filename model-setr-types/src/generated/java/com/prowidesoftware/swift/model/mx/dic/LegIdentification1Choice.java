
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
 * Choice of leg.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegIdentification1Choice", propOrder = {
    "redLegId",
    "sbcptLegId"
})
public class LegIdentification1Choice {

    @XmlElement(name = "RedLegId")
    protected String redLegId;
    @XmlElement(name = "SbcptLegId")
    protected String sbcptLegId;

    /**
     * Gets the value of the redLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedLegId() {
        return redLegId;
    }

    /**
     * Sets the value of the redLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LegIdentification1Choice setRedLegId(String value) {
        this.redLegId = value;
        return this;
    }

    /**
     * Gets the value of the sbcptLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbcptLegId() {
        return sbcptLegId;
    }

    /**
     * Sets the value of the sbcptLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LegIdentification1Choice setSbcptLegId(String value) {
        this.sbcptLegId = value;
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
