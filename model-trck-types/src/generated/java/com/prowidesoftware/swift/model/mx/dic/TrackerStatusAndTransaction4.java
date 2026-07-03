
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
 * Provides detailed information on the transaction and it's status as updated in the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatusAndTransaction4", propOrder = {
    "alrtSts",
    "tx"
})
public class TrackerStatusAndTransaction4 {

    @XmlElement(name = "AlrtSts", required = true)
    protected TrackerAlertNotificationStatus2 alrtSts;
    @XmlElement(name = "Tx", required = true)
    protected TrackerPaymentTransaction4 tx;

    /**
     * Gets the value of the alrtSts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerAlertNotificationStatus2 }
     *     
     */
    public TrackerAlertNotificationStatus2 getAlrtSts() {
        return alrtSts;
    }

    /**
     * Sets the value of the alrtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerAlertNotificationStatus2 }
     *     
     */
    public TrackerStatusAndTransaction4 setAlrtSts(TrackerAlertNotificationStatus2 value) {
        this.alrtSts = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPaymentTransaction4 }
     *     
     */
    public TrackerPaymentTransaction4 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPaymentTransaction4 }
     *     
     */
    public TrackerStatusAndTransaction4 setTx(TrackerPaymentTransaction4 value) {
        this.tx = value;
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
