
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
 * Choice between various statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationCancellationRequestStatus2Choice", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class NotificationCancellationRequestStatus2Choice {

    @XmlElement(name = "PrcdSts")
    protected NotificationCancellationProcessingStatus2 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected NotificationCancellationRejectionReason2 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellationProcessingStatus2 }
     *     
     */
    public NotificationCancellationProcessingStatus2 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellationProcessingStatus2 }
     *     
     */
    public NotificationCancellationRequestStatus2Choice setPrcdSts(NotificationCancellationProcessingStatus2 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellationRejectionReason2 }
     *     
     */
    public NotificationCancellationRejectionReason2 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellationRejectionReason2 }
     *     
     */
    public NotificationCancellationRequestStatus2Choice setRjctdSts(NotificationCancellationRejectionReason2 value) {
        this.rjctdSts = value;
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
