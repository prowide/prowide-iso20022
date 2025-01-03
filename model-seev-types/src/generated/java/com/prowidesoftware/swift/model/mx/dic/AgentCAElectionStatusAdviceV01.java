
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
 * This message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of:
 * - a corporate action election advice;
 * - an election cancellation request; or
 * - an election amendment request.
 * Usage
 * This message must be sent in response to an:
 * - Agent Corporation Action Election Advice to provide the status of an election advice in the case of a rejection. However, it may also be used in all other situations, in which case, the building blocks Election Advice Identification and the Election Advice Status must be present.
 * - Agent Corporation Action Election Cancellation Request to provide the status of the cancellation request, in which case, the building blocks Election Cancellation Request Identification and the Election Cancellation Request Status must be present.
 * - Agent Corporation Action Election Amendment Request to provide the status of the amendment request, in which case, the building blocks Election Amendment Request Identification and the Election Amendment Request Status must be present.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAElectionStatusAdviceV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "agtCAElctnCxlReqId",
    "agtCAElctnAmdmntReqId",
    "corpActnGnlInf",
    "elctnAdvcSts",
    "elctnCxlReqSts",
    "elctnAmdmntReqSts"
})
public class AgentCAElectionStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId")
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "AgtCAElctnCxlReqId")
    protected DocumentIdentification8 agtCAElctnCxlReqId;
    @XmlElement(name = "AgtCAElctnAmdmntReqId")
    protected DocumentIdentification8 agtCAElctnAmdmntReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "ElctnAdvcSts")
    protected ElectionAdviceStatus1Choice elctnAdvcSts;
    @XmlElement(name = "ElctnCxlReqSts")
    protected ElectionCancellationStatus1Choice elctnCxlReqSts;
    @XmlElement(name = "ElctnAmdmntReqSts")
    protected ElectionAmendmentStatus1Choice elctnAmdmntReqSts;

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
    public AgentCAElectionStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAdvcId() {
        return agtCAElctnAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnCxlReqId() {
        return agtCAElctnCxlReqId;
    }

    /**
     * Sets the value of the agtCAElctnCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setAgtCAElctnCxlReqId(DocumentIdentification8 value) {
        this.agtCAElctnCxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAmdmntReqId() {
        return agtCAElctnAmdmntReqId;
    }

    /**
     * Sets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setAgtCAElctnAmdmntReqId(DocumentIdentification8 value) {
        this.agtCAElctnAmdmntReqId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public CorporateActionInformation1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the elctnAdvcSts property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionAdviceStatus1Choice }
     *     
     */
    public ElectionAdviceStatus1Choice getElctnAdvcSts() {
        return elctnAdvcSts;
    }

    /**
     * Sets the value of the elctnAdvcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionAdviceStatus1Choice }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setElctnAdvcSts(ElectionAdviceStatus1Choice value) {
        this.elctnAdvcSts = value;
        return this;
    }

    /**
     * Gets the value of the elctnCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionCancellationStatus1Choice }
     *     
     */
    public ElectionCancellationStatus1Choice getElctnCxlReqSts() {
        return elctnCxlReqSts;
    }

    /**
     * Sets the value of the elctnCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionCancellationStatus1Choice }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setElctnCxlReqSts(ElectionCancellationStatus1Choice value) {
        this.elctnCxlReqSts = value;
        return this;
    }

    /**
     * Gets the value of the elctnAmdmntReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionAmendmentStatus1Choice }
     *     
     */
    public ElectionAmendmentStatus1Choice getElctnAmdmntReqSts() {
        return elctnAmdmntReqSts;
    }

    /**
     * Sets the value of the elctnAmdmntReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionAmendmentStatus1Choice }
     *     
     */
    public AgentCAElectionStatusAdviceV01 setElctnAmdmntReqSts(ElectionAmendmentStatus1Choice value) {
        this.elctnAmdmntReqSts = value;
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
