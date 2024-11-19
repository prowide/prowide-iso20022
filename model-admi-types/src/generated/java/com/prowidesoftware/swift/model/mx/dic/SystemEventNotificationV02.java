
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
 * Scope
 * The SystemEventNotification message is sent by a central system to notify the occurrence of an event in a central system.
 * Usage
 * The message can be used by a central settlement system to inform its participants of an event that is going to occur in the system, for instance that the system will be down at a certain time, etc.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventNotificationV02", propOrder = {
    "evtInf"
})
public class SystemEventNotificationV02 {

    @XmlElement(name = "EvtInf", required = true)
    protected Event2 evtInf;

    /**
     * Gets the value of the evtInf property.
     * 
     * @return
     *     possible object is
     *     {@link Event2 }
     *     
     */
    public Event2 getEvtInf() {
        return evtInf;
    }

    /**
     * Sets the value of the evtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event2 }
     *     
     */
    public SystemEventNotificationV02 setEvtInf(Event2 value) {
        this.evtInf = value;
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
