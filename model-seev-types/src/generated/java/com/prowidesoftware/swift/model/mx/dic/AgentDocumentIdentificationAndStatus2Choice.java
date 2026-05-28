
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
 * Choice between the Identification and status of the corporate action notification advice or the notification cancellation request sent by the agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentDocumentIdentificationAndStatus2Choice", propOrder = {
    "agtCANtfctnAdvcIdAndSts",
    "agtCANtfctnCxlReqIdAndSts"
})
public class AgentDocumentIdentificationAndStatus2Choice {

    @XmlElement(name = "AgtCANtfctnAdvcIdAndSts")
    protected AgentNotificationIdentificationAndStatus2 agtCANtfctnAdvcIdAndSts;
    @XmlElement(name = "AgtCANtfctnCxlReqIdAndSts")
    protected AgentNotificationCancellationIdentificationAndStatus2 agtCANtfctnCxlReqIdAndSts;

    /**
     * Gets the value of the agtCANtfctnAdvcIdAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link AgentNotificationIdentificationAndStatus2 }
     *     
     */
    public AgentNotificationIdentificationAndStatus2 getAgtCANtfctnAdvcIdAndSts() {
        return agtCANtfctnAdvcIdAndSts;
    }

    /**
     * Sets the value of the agtCANtfctnAdvcIdAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentNotificationIdentificationAndStatus2 }
     *     
     */
    public AgentDocumentIdentificationAndStatus2Choice setAgtCANtfctnAdvcIdAndSts(AgentNotificationIdentificationAndStatus2 value) {
        this.agtCANtfctnAdvcIdAndSts = value;
        return this;
    }

    /**
     * Gets the value of the agtCANtfctnCxlReqIdAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link AgentNotificationCancellationIdentificationAndStatus2 }
     *     
     */
    public AgentNotificationCancellationIdentificationAndStatus2 getAgtCANtfctnCxlReqIdAndSts() {
        return agtCANtfctnCxlReqIdAndSts;
    }

    /**
     * Sets the value of the agtCANtfctnCxlReqIdAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentNotificationCancellationIdentificationAndStatus2 }
     *     
     */
    public AgentDocumentIdentificationAndStatus2Choice setAgtCANtfctnCxlReqIdAndSts(AgentNotificationCancellationIdentificationAndStatus2 value) {
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
