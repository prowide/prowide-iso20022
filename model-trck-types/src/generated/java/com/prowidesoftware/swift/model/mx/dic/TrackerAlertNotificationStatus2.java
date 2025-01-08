
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
 * Provides detailed information on an alert notification issued by the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerAlertNotificationStatus2", propOrder = {
    "alrtSts",
    "stsRsn"
})
public class TrackerAlertNotificationStatus2 {

    @XmlElement(name = "AlrtSts", required = true)
    protected TrackerAlertStatus1 alrtSts;
    @XmlElement(name = "StsRsn", required = true)
    protected TrackerAlertStatusReason1 stsRsn;

    /**
     * Gets the value of the alrtSts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerAlertStatus1 }
     *     
     */
    public TrackerAlertStatus1 getAlrtSts() {
        return alrtSts;
    }

    /**
     * Sets the value of the alrtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerAlertStatus1 }
     *     
     */
    public TrackerAlertNotificationStatus2 setAlrtSts(TrackerAlertStatus1 value) {
        this.alrtSts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerAlertStatusReason1 }
     *     
     */
    public TrackerAlertStatusReason1 getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerAlertStatusReason1 }
     *     
     */
    public TrackerAlertNotificationStatus2 setStsRsn(TrackerAlertStatusReason1 value) {
        this.stsRsn = value;
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
