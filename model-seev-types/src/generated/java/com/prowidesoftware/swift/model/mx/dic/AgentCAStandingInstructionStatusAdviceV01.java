
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
 * This message is sent by an issuer (or its agent) to the CSD to report the status, or a change in status, of a standing instruction request or the status of a standing instruction cancellation request.
 * Usage
 * When this message is used to report the status of a standing instruction request, the building block Standing Instruction Request Identification must be present.
 * When this message is used to report the status of a standing instruction cancellation request, the building block Standing Instruction Cancellation Request Identification must be present.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAStandingInstructionStatusAdviceV01", propOrder = {
    "id",
    "agtCAStgInstrReqId",
    "agtCAStgInstrCxlReqId",
    "stgInstrGnlInf",
    "stgInstrReqSts",
    "stgInstrCxlReqSts"
})
public class AgentCAStandingInstructionStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAStgInstrReqId")
    protected DocumentIdentification8 agtCAStgInstrReqId;
    @XmlElement(name = "AgtCAStgInstrCxlReqId")
    protected DocumentIdentification8 agtCAStgInstrCxlReqId;
    @XmlElement(name = "StgInstrGnlInf", required = true)
    protected CorporateActionStandingInstructionGeneralInformation1 stgInstrGnlInf;
    @XmlElement(name = "StgInstrReqSts")
    protected StandingInstructionStatus1Choice stgInstrReqSts;
    @XmlElement(name = "StgInstrCxlReqSts")
    protected StandingInstructionCancellationStatus1Choice stgInstrCxlReqSts;

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
    public AgentCAStandingInstructionStatusAdviceV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCAStgInstrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAStgInstrReqId() {
        return agtCAStgInstrReqId;
    }

    /**
     * Sets the value of the agtCAStgInstrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAStandingInstructionStatusAdviceV01 setAgtCAStgInstrReqId(DocumentIdentification8 value) {
        this.agtCAStgInstrReqId = value;
        return this;
    }

    /**
     * Gets the value of the agtCAStgInstrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAStgInstrCxlReqId() {
        return agtCAStgInstrCxlReqId;
    }

    /**
     * Sets the value of the agtCAStgInstrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCAStandingInstructionStatusAdviceV01 setAgtCAStgInstrCxlReqId(DocumentIdentification8 value) {
        this.agtCAStgInstrCxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionGeneralInformation1 }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 getStgInstrGnlInf() {
        return stgInstrGnlInf;
    }

    /**
     * Sets the value of the stgInstrGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionGeneralInformation1 }
     *     
     */
    public AgentCAStandingInstructionStatusAdviceV01 setStgInstrGnlInf(CorporateActionStandingInstructionGeneralInformation1 value) {
        this.stgInstrGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionStatus1Choice }
     *     
     */
    public StandingInstructionStatus1Choice getStgInstrReqSts() {
        return stgInstrReqSts;
    }

    /**
     * Sets the value of the stgInstrReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionStatus1Choice }
     *     
     */
    public AgentCAStandingInstructionStatusAdviceV01 setStgInstrReqSts(StandingInstructionStatus1Choice value) {
        this.stgInstrReqSts = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionCancellationStatus1Choice }
     *     
     */
    public StandingInstructionCancellationStatus1Choice getStgInstrCxlReqSts() {
        return stgInstrCxlReqSts;
    }

    /**
     * Sets the value of the stgInstrCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionCancellationStatus1Choice }
     *     
     */
    public AgentCAStandingInstructionStatusAdviceV01 setStgInstrCxlReqSts(StandingInstructionCancellationStatus1Choice value) {
        this.stgInstrCxlReqSts = value;
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
