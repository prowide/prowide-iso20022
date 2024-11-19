
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
 * This message is sent by a CSD to an issuer (or its agent) to report the status, or a change in status, of
 * - a global distribution status advice released by an issuer (or its agent);
 * - a movement instruction released by an issuer (or its agent);
 * - a movement cancellation request sent by the issuer (or its agent); and
 * - the non-settlement of the movements at the CSD.
 * Usage
 * This message is used to report the status of:
 * - the movements resulting from a movement instruction message, in which case, the Agent Corporate Action Movement Instruction Identification must be present;
 * - the movements resulting from a global distribution status advice message (with the status, authorised), in which case, the Agent Corporate Action Global Distribution Status Advice Identification must be present;
 * - the movement cancellation request, in which case, the Agent Corporate Action Movement Cancellation Request Identification must be present; and
 * - the movements resulting from an election status advice (if the status of the election advice is rejected or if the status of the election cancellation request or amendment request is accepted) in case there is a settlement problem. The Election Status Advice Identification must be present.
 * In the case of a failed settlement, the message contains details of the movement, such as account details, securities or cash information and the reason of the failure.
 * This message should not be used to provide the confirmation of the settlement; the Agent Corporate Action Movement Confirmation message should be used instead.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAMovementStatusAdviceV01", propOrder = {
    "id",
    "agtCAElctnStsAdvcId",
    "agtCAGblDstrbtnStsAdvcId",
    "agtCAMvmntInstrId",
    "agtCAMvmntCxlReqId",
    "corpActnGnlInf",
    "mvmntStsDtls",
    "mvmntCxlStsDtls"
})
public class AgentCAMovementStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnStsAdvcId")
    protected DocumentIdentification8 agtCAElctnStsAdvcId;
    @XmlElement(name = "AgtCAGblDstrbtnStsAdvcId")
    protected DocumentIdentification8 agtCAGblDstrbtnStsAdvcId;
    @XmlElement(name = "AgtCAMvmntInstrId")
    protected DocumentIdentification8 agtCAMvmntInstrId;
    @XmlElement(name = "AgtCAMvmntCxlReqId")
    protected DocumentIdentification8 agtCAMvmntCxlReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "MvmntStsDtls")
    protected CorporateActionMovementStatus1Choice mvmntStsDtls;
    @XmlElement(name = "MvmntCxlStsDtls")
    protected CorporateMovementStatus2 mvmntCxlStsDtls;

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
    public AgentCAMovementStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAElctnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnStsAdvcId() {
        return agtCAElctnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementStatusAdviceV01 setAgtCAElctnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnStsAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAGblDstrbtnStsAdvcId() {
        return agtCAGblDstrbtnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementStatusAdviceV01 setAgtCAGblDstrbtnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAGblDstrbtnStsAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAMvmntInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAMvmntInstrId() {
        return agtCAMvmntInstrId;
    }

    /**
     * Sets the value of the agtCAMvmntInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementStatusAdviceV01 setAgtCAMvmntInstrId(DocumentIdentification8 value) {
        this.agtCAMvmntInstrId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAMvmntCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAMvmntCxlReqId() {
        return agtCAMvmntCxlReqId;
    }

    /**
     * Sets the value of the agtCAMvmntCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAMovementStatusAdviceV01 setAgtCAMvmntCxlReqId(DocumentIdentification8 value) {
        this.agtCAMvmntCxlReqId = value;
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
    public AgentCAMovementStatusAdviceV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the mvmntStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementStatus1Choice }
     *     
     */
    public CorporateActionMovementStatus1Choice getMvmntStsDtls() {
        return mvmntStsDtls;
    }

    /**
     * Sets the value of the mvmntStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementStatus1Choice }
     *     
     */
    public AgentCAMovementStatusAdviceV01 setMvmntStsDtls(CorporateActionMovementStatus1Choice value) {
        this.mvmntStsDtls = value;
        return this;
    }

    /**
     * Gets the value of the mvmntCxlStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateMovementStatus2 }
     *     
     */
    public CorporateMovementStatus2 getMvmntCxlStsDtls() {
        return mvmntCxlStsDtls;
    }

    /**
     * Sets the value of the mvmntCxlStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateMovementStatus2 }
     *     
     */
    public AgentCAMovementStatusAdviceV01 setMvmntCxlStsDtls(CorporateMovementStatus2 value) {
        this.mvmntCxlStsDtls = value;
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
