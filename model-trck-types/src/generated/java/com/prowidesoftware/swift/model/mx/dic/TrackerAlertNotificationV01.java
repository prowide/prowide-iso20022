
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
 * The TrackerAlertNotification message is sent by a tracking facility to a party involved in the business transaction that tried to update the status of this transaction to alert that party on an issue with the update.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerAlertNotificationV01", propOrder = {
    "grpHdr",
    "trckrStsAndTx"
})
public class TrackerAlertNotificationV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected TrackerHeader4 grpHdr;
    @XmlElement(name = "TrckrStsAndTx", required = true)
    protected TrackerStatusAndTransaction4 trckrStsAndTx;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerHeader4 }
     *     
     */
    public TrackerHeader4 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerHeader4 }
     *     
     */
    public TrackerAlertNotificationV01 setGrpHdr(TrackerHeader4 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the trckrStsAndTx property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerStatusAndTransaction4 }
     *     
     */
    public TrackerStatusAndTransaction4 getTrckrStsAndTx() {
        return trckrStsAndTx;
    }

    /**
     * Sets the value of the trckrStsAndTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerStatusAndTransaction4 }
     *     
     */
    public TrackerAlertNotificationV01 setTrckrStsAndTx(TrackerStatusAndTransaction4 value) {
        this.trckrStsAndTx = value;
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
