
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
 * Provides the status of a notification advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationAdviceStatus4Choice", propOrder = {
    "prcdSts",
    "rjctdSts",
    "pdgSts",
    "accptdWthWrngSts"
})
public class NotificationAdviceStatus4Choice {

    @XmlElement(name = "PrcdSts")
    protected NotificationProcessingStatus2 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected NotificationRejectionReason3 rjctdSts;
    @XmlElement(name = "PdgSts")
    protected NotificationPendingStatus1 pdgSts;
    @XmlElement(name = "AccptdWthWrngSts")
    protected NotificationAcceptedWithWarningStatus1 accptdWthWrngSts;

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
    public NotificationAdviceStatus4Choice setPrcdSts(NotificationProcessingStatus2 value) {
        this.prcdSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationRejectionReason3 }
     *     
     */
    public NotificationRejectionReason3 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationRejectionReason3 }
     *     
     */
    public NotificationAdviceStatus4Choice setRjctdSts(NotificationRejectionReason3 value) {
        this.rjctdSts = value;
        return this;
    }

    /**
     * Gets the value of the pdgSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPendingStatus1 }
     *     
     */
    public NotificationPendingStatus1 getPdgSts() {
        return pdgSts;
    }

    /**
     * Sets the value of the pdgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPendingStatus1 }
     *     
     */
    public NotificationAdviceStatus4Choice setPdgSts(NotificationPendingStatus1 value) {
        this.pdgSts = value;
        return this;
    }

    /**
     * Gets the value of the accptdWthWrngSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationAcceptedWithWarningStatus1 }
     *     
     */
    public NotificationAcceptedWithWarningStatus1 getAccptdWthWrngSts() {
        return accptdWthWrngSts;
    }

    /**
     * Sets the value of the accptdWthWrngSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationAcceptedWithWarningStatus1 }
     *     
     */
    public NotificationAdviceStatus4Choice setAccptdWthWrngSts(NotificationAcceptedWithWarningStatus1 value) {
        this.accptdWthWrngSts = value;
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
