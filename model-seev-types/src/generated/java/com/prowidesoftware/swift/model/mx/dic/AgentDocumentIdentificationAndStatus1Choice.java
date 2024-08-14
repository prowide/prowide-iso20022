
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
 * Choice between the Identification and status of the corporate action notification advice or the notification cancellation request sent by the agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentDocumentIdentificationAndStatus1Choice", propOrder = {
    "agtCANtfctnAdvcIdAndSts",
    "agtCANtfctnCxlReqIdAndSts"
})
public class AgentDocumentIdentificationAndStatus1Choice {

    @XmlElement(name = "AgtCANtfctnAdvcIdAndSts")
    protected AgentNotificationIdentificationAndStatus1 agtCANtfctnAdvcIdAndSts;
    @XmlElement(name = "AgtCANtfctnCxlReqIdAndSts")
    protected AgentNotificationCancellationIdentificationAndStatus1 agtCANtfctnCxlReqIdAndSts;

    /**
     * Gets the value of the agtCANtfctnAdvcIdAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link AgentNotificationIdentificationAndStatus1 }
     *     
     */
    public AgentNotificationIdentificationAndStatus1 getAgtCANtfctnAdvcIdAndSts() {
        return agtCANtfctnAdvcIdAndSts;
    }

    /**
     * Sets the value of the agtCANtfctnAdvcIdAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentNotificationIdentificationAndStatus1 }
     *     
     */
    public AgentDocumentIdentificationAndStatus1Choice setAgtCANtfctnAdvcIdAndSts(AgentNotificationIdentificationAndStatus1 value) {
        this.agtCANtfctnAdvcIdAndSts = value;
        return this;
    }

    /**
     * Gets the value of the agtCANtfctnCxlReqIdAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link AgentNotificationCancellationIdentificationAndStatus1 }
     *     
     */
    public AgentNotificationCancellationIdentificationAndStatus1 getAgtCANtfctnCxlReqIdAndSts() {
        return agtCANtfctnCxlReqIdAndSts;
    }

    /**
     * Sets the value of the agtCANtfctnCxlReqIdAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentNotificationCancellationIdentificationAndStatus1 }
     *     
     */
    public AgentDocumentIdentificationAndStatus1Choice setAgtCANtfctnCxlReqIdAndSts(AgentNotificationCancellationIdentificationAndStatus1 value) {
        this.agtCANtfctnCxlReqIdAndSts = value;
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
