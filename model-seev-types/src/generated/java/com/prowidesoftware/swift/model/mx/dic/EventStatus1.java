
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Notification status of an event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStatus1", propOrder = {
    "evtCmpltnsSts",
    "evtConfSts"
})
public class EventStatus1 {

    @XmlElement(name = "EvtCmpltnsSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventCompletenessStatus1Code evtCmpltnsSts;
    @XmlElement(name = "EvtConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventConfirmationStatus1Code evtConfSts;

    /**
     * Gets the value of the evtCmpltnsSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public EventCompletenessStatus1Code getEvtCmpltnsSts() {
        return evtCmpltnsSts;
    }

    /**
     * Sets the value of the evtCmpltnsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public EventStatus1 setEvtCmpltnsSts(EventCompletenessStatus1Code value) {
        this.evtCmpltnsSts = value;
        return this;
    }

    /**
     * Gets the value of the evtConfSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public EventConfirmationStatus1Code getEvtConfSts() {
        return evtConfSts;
    }

    /**
     * Sets the value of the evtConfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public EventStatus1 setEvtConfSts(EventConfirmationStatus1Code value) {
        this.evtConfSts = value;
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
