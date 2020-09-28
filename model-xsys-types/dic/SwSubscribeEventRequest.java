
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
 * Java class for SubscribeEventRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeEventRequest", propOrder = {
    "eventEP",
    "includeUnsolicitedEvents",
    "eventStartDateTime"
})
public class SwSubscribeEventRequest {

    @XmlElement(name = "EventEP", required = true)
    protected String eventEP;
    @XmlElement(name = "IncludeUnsolicitedEvents")
    protected String includeUnsolicitedEvents;
    @XmlElement(name = "EventStartDateTime")
    protected String eventStartDateTime;

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
    public SwSubscribeEventRequest setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the includeUnsolicitedEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeUnsolicitedEvents() {
        return includeUnsolicitedEvents;
    }

    /**
     * Sets the value of the includeUnsolicitedEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubscribeEventRequest setIncludeUnsolicitedEvents(String value) {
        this.includeUnsolicitedEvents = value;
        return this;
    }

    /**
     * Gets the value of the eventStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStartDateTime() {
        return eventStartDateTime;
    }

    /**
     * Sets the value of the eventStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSubscribeEventRequest setEventStartDateTime(String value) {
        this.eventStartDateTime = value;
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
