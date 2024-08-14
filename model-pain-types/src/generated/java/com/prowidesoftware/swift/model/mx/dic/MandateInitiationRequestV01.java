
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
 * The MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.
 * The MandateInitiationRequest message is used to set-up the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.
 * Usage
 * The MandateInitiationRequest message can contain only one request to set-up one specific mandate.
 * The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.
 * The MandateInitiationRequest message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateInitiationRequestV01", propOrder = {
    "grpHdr",
    "mndt"
})
public class MandateInitiationRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader31 grpHdr;
    @XmlElement(name = "Mndt", required = true)
    protected MandateInformation2 mndt;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader31 }
     *     
     */
    public GroupHeader31 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader31 }
     *     
     */
    public MandateInitiationRequestV01 setGrpHdr(GroupHeader31 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the mndt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateInformation2 }
     *     
     */
    public MandateInformation2 getMndt() {
        return mndt;
    }

    /**
     * Sets the value of the mndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateInformation2 }
     *     
     */
    public MandateInitiationRequestV01 setMndt(MandateInformation2 value) {
        this.mndt = value;
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
