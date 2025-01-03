
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
 * Event notification type and status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationGeneralInformation1", propOrder = {
    "ntfctnTp",
    "ntfctnSts"
})
public class NotificationGeneralInformation1 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType3Code ntfctnTp;
    @XmlElement(name = "NtfctnSts", required = true)
    protected EventStatus1 ntfctnSts;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType3Code }
     *     
     */
    public NotificationType3Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType3Code }
     *     
     */
    public NotificationGeneralInformation1 setNtfctnTp(NotificationType3Code value) {
        this.ntfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus1 }
     *     
     */
    public EventStatus1 getNtfctnSts() {
        return ntfctnSts;
    }

    /**
     * Sets the value of the ntfctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus1 }
     *     
     */
    public NotificationGeneralInformation1 setNtfctnSts(EventStatus1 value) {
        this.ntfctnSts = value;
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
