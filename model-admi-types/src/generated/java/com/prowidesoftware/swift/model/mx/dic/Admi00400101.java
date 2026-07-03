
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
 * Scope
 * The SystemEventNotification message is sent by a central system to notify the occurrence of an event in a central system.
 * Usage
 * The message can be used by a central settlement system to inform its participants of an event that is going to occur in the system, for instance that the system will be down at a certain time, etc.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admi.004.001.01", propOrder = {
    "evtInf"
})
public class Admi00400101 {

    @XmlElement(name = "EvtInf", required = true)
    protected Event1 evtInf;

    /**
     * Gets the value of the evtInf property.
     * 
     * @return
     *     possible object is
     *     {@link Event1 }
     *     
     */
    public Event1 getEvtInf() {
        return evtInf;
    }

    /**
     * Sets the value of the evtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event1 }
     *     
     */
    public Admi00400101 setEvtInf(Event1 value) {
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
