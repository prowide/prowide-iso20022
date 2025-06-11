
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
@XmlType(name = "AgentCANotificationStatusAdviceV03", propOrder = {
    "agtDocIdAndSts",
    "corpActnGnlInf"
})
public class AgentCANotificationStatusAdviceV03 {

    @XmlElement(name = "AgtDocIdAndSts", required = true)
    protected AgentDocumentIdentificationAndStatus1Choice agtDocIdAndSts;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation175 corpActnGnlInf;

    /**
     * Gets the value of the agtDocIdAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link AgentDocumentIdentificationAndStatus1Choice }
     *     
     */
    public AgentDocumentIdentificationAndStatus1Choice getAgtDocIdAndSts() {
        return agtDocIdAndSts;
    }

    /**
     * Sets the value of the agtDocIdAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentDocumentIdentificationAndStatus1Choice }
     *     
     */
    public AgentCANotificationStatusAdviceV03 setAgtDocIdAndSts(AgentDocumentIdentificationAndStatus1Choice value) {
        this.agtDocIdAndSts = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation175 }
     *     
     */
    public CorporateActionGeneralInformation175 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation175 }
     *     
     */
    public AgentCANotificationStatusAdviceV03 setCorpActnGnlInf(CorporateActionGeneralInformation175 value) {
        this.corpActnGnlInf = value;
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
