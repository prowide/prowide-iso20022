
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SubscribeFileEventRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeFileEventRequest", propOrder = {
    "eventEP",
    "allFileEvents",
    "fullFileStatus"
})
public class SwSubscribeFileEventRequest {

    @XmlElement(name = "EventEP", required = true)
    protected String eventEP;
    @XmlElement(name = "AllFileEvents")
    protected String allFileEvents;
    @XmlElement(name = "FullFileStatus")
    protected String fullFileStatus;

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
    public SwSubscribeFileEventRequest setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the allFileEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllFileEvents() {
        return allFileEvents;
    }

    /**
     * Sets the value of the allFileEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubscribeFileEventRequest setAllFileEvents(String value) {
        this.allFileEvents = value;
        return this;
    }

    /**
     * Gets the value of the fullFileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullFileStatus() {
        return fullFileStatus;
    }

    /**
     * Sets the value of the fullFileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubscribeFileEventRequest setFullFileStatus(String value) {
        this.fullFileStatus = value;
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
