
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
 * This message is sent by a CSD to an issuer (or its agent) to report the status, or change in status, of a notification advice or notification cancellation request.
 * Usage
 * When this message is used to report the status of a notification advice then the building block Agent Corporate Action Notification Advice Identification must be present.
 * When this message is used to provide the status of a notification cancellation request then the building block Notification Cancellation Request Identification must be present.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCANotificationStatusAdviceV01", propOrder = {
    "id",
    "agtCANtfctnAdvcId",
    "agtCANtfctnCxlReqId",
    "corpActnGnlInf",
    "ntfctnCxlReqSts",
    "ntfctnAdvcSts"
})
public class AgentCANotificationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCANtfctnAdvcId")
    protected DocumentIdentification8 agtCANtfctnAdvcId;
    @XmlElement(name = "AgtCANtfctnCxlReqId")
    protected DocumentIdentification8 agtCANtfctnCxlReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation2 corpActnGnlInf;
    @XmlElement(name = "NtfctnCxlReqSts")
    protected NotificationCancellationRequestStatus1Choice ntfctnCxlReqSts;
    @XmlElement(name = "NtfctnAdvcSts")
    protected NotificationAdviceStatus1Choice ntfctnAdvcSts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCANotificationStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCANtfctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCANtfctnAdvcId() {
        return agtCANtfctnAdvcId;
    }

    /**
     * Sets the value of the agtCANtfctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCANotificationStatusAdviceV01 setAgtCANtfctnAdvcId(DocumentIdentification8 value) {
        this.agtCANtfctnAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCANtfctnCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCANtfctnCxlReqId() {
        return agtCANtfctnCxlReqId;
    }

    /**
     * Sets the value of the agtCANtfctnCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCANotificationStatusAdviceV01 setAgtCANtfctnCxlReqId(DocumentIdentification8 value) {
        this.agtCANtfctnCxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public CorporateActionInformation2 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public AgentCANotificationStatusAdviceV01 setCorpActnGnlInf(CorporateActionInformation2 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellationRequestStatus1Choice }
     *     
     */
    public NotificationCancellationRequestStatus1Choice getNtfctnCxlReqSts() {
        return ntfctnCxlReqSts;
    }

    /**
     * Sets the value of the ntfctnCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellationRequestStatus1Choice }
     *     
     */
    public AgentCANotificationStatusAdviceV01 setNtfctnCxlReqSts(NotificationCancellationRequestStatus1Choice value) {
        this.ntfctnCxlReqSts = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnAdvcSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationAdviceStatus1Choice }
     *     
     */
    public NotificationAdviceStatus1Choice getNtfctnAdvcSts() {
        return ntfctnAdvcSts;
    }

    /**
     * Sets the value of the ntfctnAdvcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationAdviceStatus1Choice }
     *     
     */
    public AgentCANotificationStatusAdviceV01 setNtfctnAdvcSts(NotificationAdviceStatus1Choice value) {
        this.ntfctnAdvcSts = value;
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
