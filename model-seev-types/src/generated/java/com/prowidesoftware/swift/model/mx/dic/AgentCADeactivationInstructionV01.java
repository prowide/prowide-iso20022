
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
 * This message is sent by an issuer (or its agent) to the CSD to instruct the deactivation of a corporate action event or to deactivate one or more specific options of the corporate action. As of the deactivation date, the CSD is allowed to reject any related election instruction received from clients.
 * Usage
 * Deactivation refers only to the empowerment of the CSD to reject further elections. To withdraw an event, the Agent Corporate Action Notification Advice message must be used.
 * This message can be used to deactivate all the options of a corporate action event, in which case, no option should be mentioned in the message.
 * This message can also be used to deactivate one or more specific corporate action options, in which case, the option type and option number must be present.
 * This message can only be used when the deactivation date is after the market deadline. Before the market deadline, an updated notification advice message must be sent with option availability status: inactive or cancelled.
 * An un-effected deactivation (pending deactivation date/time) can be cancelled with an Agent Corporate Action Deactivation Cancellation Request.
 * The amendment of a deactivation is effected by cancel/replace mechanism.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCADeactivationInstructionV01", propOrder = {
    "id",
    "corpActnGnlInf",
    "deactvtnDtls"
})
public class AgentCADeactivationInstructionV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "DeactvtnDtls", required = true)
    protected CorporateActionDeactivationInstruction1 deactvtnDtls;

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
    public AgentCADeactivationInstructionV01 setId(DocumentIdentification8 value) {
        this.id = value;
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
    public AgentCADeactivationInstructionV01 setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the deactvtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationInstruction1 }
     *     
     */
    public CorporateActionDeactivationInstruction1 getDeactvtnDtls() {
        return deactvtnDtls;
    }

    /**
     * Sets the value of the deactvtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationInstruction1 }
     *     
     */
    public AgentCADeactivationInstructionV01 setDeactvtnDtls(CorporateActionDeactivationInstruction1 value) {
        this.deactvtnDtls = value;
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
