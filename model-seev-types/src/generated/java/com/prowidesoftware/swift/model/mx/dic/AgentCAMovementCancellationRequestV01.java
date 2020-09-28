
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
 * This message is sent by an issuer (or its agent) to a CSD to request the cancellation of (a) movement(s) previously sent via an Agent Corporate Action Movement Instruction.
 * Usage
 * This message may be used to cancel an entire Agent Corporate Action Movement Instruction message that was previously sent by the issuer (or its agent) or specific movements.
 * This message must contain the identification of the Agent Corporate Action Movement Instruction containing the movement(s) to be cancelled, the agent identification and the corporate action references. This message must also contain details of the movement(s) to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAMovementCancellationRequestV01", propOrder = {
    "id",
    "agtCAMvmntInstrId",
    "corpActnGnlInf",
    "mvmntDtls"
})
public class AgentCAMovementCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAMvmntInstrId", required = true)
    protected DocumentIdentification8 agtCAMvmntInstrId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "MvmntDtls")
    protected MovementInstruction1 mvmntDtls;

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
    public AgentCAMovementCancellationRequestV01 setId(DocumentIdentification8 value) {
        this.id = value;
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
    public AgentCAMovementCancellationRequestV01 setAgtCAMvmntInstrId(DocumentIdentification8 value) {
        this.agtCAMvmntInstrId = value;
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
    public AgentCAMovementCancellationRequestV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the mvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MovementInstruction1 }
     *     
     */
    public MovementInstruction1 getMvmntDtls() {
        return mvmntDtls;
    }

    /**
     * Sets the value of the mvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementInstruction1 }
     *     
     */
    public AgentCAMovementCancellationRequestV01 setMvmntDtls(MovementInstruction1 value) {
        this.mvmntDtls = value;
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
