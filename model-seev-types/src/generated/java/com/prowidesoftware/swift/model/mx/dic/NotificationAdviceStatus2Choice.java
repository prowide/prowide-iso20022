
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
 * Provides the status of a notification advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationAdviceStatus2Choice", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class NotificationAdviceStatus2Choice {

    @XmlElement(name = "PrcdSts")
    protected NotificationProcessingStatus2 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected NotificationRejectionReason2 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationProcessingStatus2 }
     *     
     */
    public NotificationProcessingStatus2 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationProcessingStatus2 }
     *     
     */
    public NotificationAdviceStatus2Choice setPrcdSts(NotificationProcessingStatus2 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationRejectionReason2 }
     *     
     */
    public NotificationRejectionReason2 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationRejectionReason2 }
     *     
     */
    public NotificationAdviceStatus2Choice setRjctdSts(NotificationRejectionReason2 value) {
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
