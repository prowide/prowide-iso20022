
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for NotifySnFResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifySnFResponse", propOrder = {
    "ackMessage"
})
public class SwNotifySnFResponse {

    @XmlElement(name = "AckMessage")
    protected SwAckMessage ackMessage;

    /**
     * Gets the value of the ackMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckMessage }
     *     
     */
    public SwAckMessage getAckMessage() {
        return ackMessage;
    }

    /**
     * Sets the value of the ackMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckMessage }
     *     
     */
    public SwNotifySnFResponse setAckMessage(SwAckMessage value) {
        this.ackMessage = value;
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
