
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
 * This message is sent by a CSD to the issuer agent to request the cancellation of a previously sent Agent Corporate Action Standing Instruction.
 * Usage
 * This message is used to request the cancellation of a standing instruction.
 * This message must contain the identification of the standing instruction to be cancelled. It may also contain details of the standing instruction to be cancelled, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAStandingInstructionCancellationRequestV01", propOrder = {
    "id",
    "agtCAStgInstrReqId",
    "stgInstrGnlInf",
    "stgInstrDtls"
})
public class AgentCAStandingInstructionCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAStgInstrReqId", required = true)
    protected DocumentIdentification8 agtCAStgInstrReqId;
    @XmlElement(name = "StgInstrGnlInf", required = true)
    protected CorporateActionStandingInstructionGeneralInformation1 stgInstrGnlInf;
    @XmlElement(name = "StgInstrDtls")
    protected CorporateActionStandingInstruction1 stgInstrDtls;

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
    public AgentCAStandingInstructionCancellationRequestV01 setId(DocumentIdentification8 value) {
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
    public AgentCAStandingInstructionCancellationRequestV01 setAgtCAStgInstrReqId(DocumentIdentification8 value) {
        this.agtCAStgInstrReqId = value;
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
    public AgentCAStandingInstructionCancellationRequestV01 setStgInstrGnlInf(CorporateActionStandingInstructionGeneralInformation1 value) {
        this.stgInstrGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstruction1 }
     *     
     */
    public CorporateActionStandingInstruction1 getStgInstrDtls() {
        return stgInstrDtls;
    }

    /**
     * Sets the value of the stgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstruction1 }
     *     
     */
    public AgentCAStandingInstructionCancellationRequestV01 setStgInstrDtls(CorporateActionStandingInstruction1 value) {
        this.stgInstrDtls = value;
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
