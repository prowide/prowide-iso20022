
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
 * Content of the Input Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputResponse1", propOrder = {
    "outptRslt",
    "inptRslt"
})
public class DeviceInputResponse1 {

    @XmlElement(name = "OutptRslt")
    protected OutputResult1 outptRslt;
    @XmlElement(name = "InptRslt", required = true)
    protected InputResult1 inptRslt;

    /**
     * Gets the value of the outptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputResult1 }
     *     
     */
    public OutputResult1 getOutptRslt() {
        return outptRslt;
    }

    /**
     * Sets the value of the outptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputResult1 }
     *     
     */
    public DeviceInputResponse1 setOutptRslt(OutputResult1 value) {
        this.outptRslt = value;
        return this;
    }

    /**
     * Gets the value of the inptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link InputResult1 }
     *     
     */
    public InputResult1 getInptRslt() {
        return inptRslt;
    }

    /**
     * Sets the value of the inptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResult1 }
     *     
     */
    public DeviceInputResponse1 setInptRslt(InputResult1 value) {
        this.inptRslt = value;
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
