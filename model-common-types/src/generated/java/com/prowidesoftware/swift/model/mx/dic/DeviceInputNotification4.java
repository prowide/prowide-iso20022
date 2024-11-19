
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
 * Content of the Input notification message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputNotification4", propOrder = {
    "xchgId",
    "outptCntt"
})
public class DeviceInputNotification4 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "OutptCntt", required = true)
    protected ActionMessage9 outptCntt;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeviceInputNotification4 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the outptCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage9 }
     *     
     */
    public ActionMessage9 getOutptCntt() {
        return outptCntt;
    }

    /**
     * Sets the value of the outptCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage9 }
     *     
     */
    public DeviceInputNotification4 setOutptCntt(ActionMessage9 value) {
        this.outptCntt = value;
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
