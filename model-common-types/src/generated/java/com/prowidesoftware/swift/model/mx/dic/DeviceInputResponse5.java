
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
 * Content of the input response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputResponse5", propOrder = {
    "outptRslt",
    "inptRslt"
})
public class DeviceInputResponse5 {

    @XmlElement(name = "OutptRslt")
    protected OutputResult2 outptRslt;
    @XmlElement(name = "InptRslt", required = true)
    protected InputResult5 inptRslt;

    /**
     * Gets the value of the outptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputResult2 }
     *     
     */
    public OutputResult2 getOutptRslt() {
        return outptRslt;
    }

    /**
     * Sets the value of the outptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputResult2 }
     *     
     */
    public DeviceInputResponse5 setOutptRslt(OutputResult2 value) {
        this.outptRslt = value;
        return this;
    }

    /**
     * Gets the value of the inptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link InputResult5 }
     *     
     */
    public InputResult5 getInptRslt() {
        return inptRslt;
    }

    /**
     * Sets the value of the inptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResult5 }
     *     
     */
    public DeviceInputResponse5 setInptRslt(InputResult5 value) {
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
