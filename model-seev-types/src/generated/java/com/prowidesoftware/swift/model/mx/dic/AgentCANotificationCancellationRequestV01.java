
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
 * This message is sent by an issuer (or its agent) to a CSD to request the cancellation of a notification advice message.
 * Usage
 * When this message is used to request the cancellation of a notification advice message, the function of the message must be cancellation.
 * When this message is used to request the withdrawal of a Corporate Action event or option, then the function of the message must be withdrawal.
 * In both cases, the building block notification advice identification must be present to link this cancellation request to the notification advice that was previously sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCANotificationCancellationRequestV01", propOrder = {
    "id",
    "ntfctnCxlTpAndLkg",
    "corpActnGnlInf",
    "corpActnNtfctnDtls"
})
public class AgentCANotificationCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "NtfctnCxlTpAndLkg", required = true)
    protected NotificationCancellation1 ntfctnCxlTpAndLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation2 corpActnGnlInf;
    @XmlElement(name = "CorpActnNtfctnDtls")
    protected CorporateActionNotificationAdvice1 corpActnNtfctnDtls;

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
    public AgentCANotificationCancellationRequestV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnCxlTpAndLkg property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellation1 }
     *     
     */
    public NotificationCancellation1 getNtfctnCxlTpAndLkg() {
        return ntfctnCxlTpAndLkg;
    }

    /**
     * Sets the value of the ntfctnCxlTpAndLkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellation1 }
     *     
     */
    public AgentCANotificationCancellationRequestV01 setNtfctnCxlTpAndLkg(NotificationCancellation1 value) {
        this.ntfctnCxlTpAndLkg = value;
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
    public AgentCANotificationCancellationRequestV01 setCorpActnGnlInf(CorporateActionInformation2 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationAdvice1 }
     *     
     */
    public CorporateActionNotificationAdvice1 getCorpActnNtfctnDtls() {
        return corpActnNtfctnDtls;
    }

    /**
     * Sets the value of the corpActnNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationAdvice1 }
     *     
     */
    public AgentCANotificationCancellationRequestV01 setCorpActnNtfctnDtls(CorporateActionNotificationAdvice1 value) {
        this.corpActnNtfctnDtls = value;
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
