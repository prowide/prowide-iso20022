
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
 * This message is sent by an issuer (or its agent) to the CSD to request the cancellation of a previously sent corporate action deactivation instruction.
 * Usage
 * This message is used to request the cancellation of a pending deactivation instruction. The cancellation must apply to exactly the same level as the original instruction, ie to the entire CA event or to an option as per the original instruction.
 * This message must be sent before the deactivation execution date.
 * In case a corporate action or option is already deactivated, this message can not be used to reactivate the corporate action entire event or option; the notification advice message must be used to reactivate a corporate action or option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCADeactivationCancellationRequestV01", propOrder = {
    "id",
    "agtCADeactvtnInstrId",
    "corpActnGnlInf",
    "deactvtnInstrDtls"
})
public class AgentCADeactivationCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCADeactvtnInstrId", required = true)
    protected DocumentIdentification8 agtCADeactvtnInstrId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "DeactvtnInstrDtls")
    protected CorporateActionDeactivationInstruction1 deactvtnInstrDtls;

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
    public AgentCADeactivationCancellationRequestV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the agtCADeactvtnInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCADeactvtnInstrId() {
        return agtCADeactvtnInstrId;
    }

    /**
     * Sets the value of the agtCADeactvtnInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public AgentCADeactivationCancellationRequestV01 setAgtCADeactvtnInstrId(DocumentIdentification8 value) {
        this.agtCADeactvtnInstrId = value;
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
    public AgentCADeactivationCancellationRequestV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the deactvtnInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationInstruction1 }
     *     
     */
    public CorporateActionDeactivationInstruction1 getDeactvtnInstrDtls() {
        return deactvtnInstrDtls;
    }

    /**
     * Sets the value of the deactvtnInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationInstruction1 }
     *     
     */
    public AgentCADeactivationCancellationRequestV01 setDeactvtnInstrDtls(CorporateActionDeactivationInstruction1 value) {
        this.deactvtnInstrDtls = value;
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
