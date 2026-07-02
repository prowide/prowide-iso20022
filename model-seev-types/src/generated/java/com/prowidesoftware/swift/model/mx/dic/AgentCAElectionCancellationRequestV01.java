
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
 * This message is sent by a CSD to the issuer (or its agent) to request the cancellation of a previously sent Agent Corporate Action Election Advice message.
 * Usage
 * This message may only be used to cancel an entire Agent Corporate Action Election Advice message that was previously sent by the CSD. No partial cancellation is allowed.
 * This message must contain the identification of the Agent Corporate Action Election Advice to be cancelled, the agent identification and the corporate action references. This message may also contain details of the election advice to be cancelled, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAElectionCancellationRequestV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "corpActnGnlInf",
    "elctnDtls"
})
public class AgentCAElectionCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId", required = true)
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "ElctnDtls")
    protected CorporateActionElection3 elctnDtls;

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
    public AgentCAElectionCancellationRequestV01 setId(DocumentIdentification8 value) {
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
    public AgentCAElectionCancellationRequestV01 setAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnAdvcId = value;
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
    public AgentCAElectionCancellationRequestV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the elctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionElection3 }
     *     
     */
    public CorporateActionElection3 getElctnDtls() {
        return elctnDtls;
    }

    /**
     * Sets the value of the elctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionElection3 }
     *     
     */
    public AgentCAElectionCancellationRequestV01 setElctnDtls(CorporateActionElection3 value) {
        this.elctnDtls = value;
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
