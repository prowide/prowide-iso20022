
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
 * Content of the Transmit Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceTransmitMessageResponse1", propOrder = {
    "rcvdMsg"
})
public class DeviceTransmitMessageResponse1 {

    @XmlElement(name = "RcvdMsg")
    protected byte[] rcvdMsg;

    /**
     * Gets the value of the rcvdMsg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcvdMsg() {
        return rcvdMsg;
    }

    /**
     * Sets the value of the rcvdMsg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceTransmitMessageResponse1 setRcvdMsg(byte[] value) {
        this.rcvdMsg = value;
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
