
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
 * Content of the Input notification message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputNotification2", propOrder = {
    "xchgId",
    "outptCntt"
})
public class DeviceInputNotification2 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "OutptCntt", required = true)
    protected ActionMessage7 outptCntt;

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
    public DeviceInputNotification2 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the outptCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage7 }
     *     
     */
    public ActionMessage7 getOutptCntt() {
        return outptCntt;
    }

    /**
     * Sets the value of the outptCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage7 }
     *     
     */
    public DeviceInputNotification2 setOutptCntt(ActionMessage7 value) {
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
