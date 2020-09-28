
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
 * Java class for HandleFileEventRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleFileEventRequest", propOrder = {
    "eventEP",
    "fileStatus"
})
public class SwHandleFileEventRequest {

    @XmlElement(name = "EventEP", required = true)
    protected String eventEP;
    @XmlElement(name = "FileStatus", required = true)
    protected SwFileStatus fileStatus;

    /**
     * Gets the value of the eventEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventEP() {
        return eventEP;
    }

    /**
     * Sets the value of the eventEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleFileEventRequest setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the fileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileStatus }
     *     
     */
    public SwFileStatus getFileStatus() {
        return fileStatus;
    }

    /**
     * Sets the value of the fileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileStatus }
     *     
     */
    public SwHandleFileEventRequest setFileStatus(SwFileStatus value) {
        this.fileStatus = value;
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
