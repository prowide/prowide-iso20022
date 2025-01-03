
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
 * The Resolution Of Investigation message is sent by a case assignee to a case creator/case assigner.
 * This message is used to inform of the resolution of a case, and optionally provides details about.
 * - the corrective action undertaken by the case assignee
 * - information on the return where applicable
 * Usage
 * The Resolution Of Investigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:
 * - request to cancel payment case
 * - request to modify payment case
 * - unable to apply case
 * - claim non receipt case
 * The Resolution Of Investigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.
 * The Resolution Of Investigation message provides:
 * - the final outcome of the case, whether positive or negative
 * - optionally, the details of the corrective action undertaken by the case assignee and the information of the return
 * Whenever a payment instruction has been generated to solve the case under investigation, the optional CorrectionTransaction component present in the message must be completed.
 * Whenever the action of modifying or cancelling a payment results in funds being returned, an investigating agent may attached some details in this message. These details facilitates the account reconciliations at the initiating bank and the intermediaries. It must be stressed that returning of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of returns when it is available.
 * The Resolution Of Investigation message must
 * - be forwarded by all subsequent case assignee(s) until it reaches the case creator
 * - not be used in place of a Reject Case Assignment or Case Status Report or Notification Of Case Assignment message.
 * Take note of an exceptional rule that allows the use of Resolution Of Investigation in lieu of a Case Status Report. Case Status Report is a response-message to a Case Status Report Request. The latter which is sent when the assigner has waited too long (by his standard) for an answer. However it may happen that when the Request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a Case Status Report when then followed immediately by a Resolution Of Investigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the Resolution Of Investigation message directly.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.029.001.02", propOrder = {
    "assgnmt",
    "rslvdCase",
    "sts",
    "crrctnTx"
})
public class Camt02900102 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "RslvdCase", required = true)
    protected Case rslvdCase;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus sts;
    @XmlElement(name = "CrrctnTx")
    protected CorrectivePaymentInstructionExtract crrctnTx;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment }
     *     
     */
    public CaseAssignment getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment }
     *     
     */
    public Camt02900102 setAssgnmt(CaseAssignment value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public Camt02900102 setRslvdCase(Case value) {
        this.rslvdCase = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus }
     *     
     */
    public InvestigationStatus getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus }
     *     
     */
    public Camt02900102 setSts(InvestigationStatus value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the crrctnTx property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectivePaymentInstructionExtract }
     *     
     */
    public CorrectivePaymentInstructionExtract getCrrctnTx() {
        return crrctnTx;
    }

    /**
     * Sets the value of the crrctnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectivePaymentInstructionExtract }
     *     
     */
    public Camt02900102 setCrrctnTx(CorrectivePaymentInstructionExtract value) {
        this.crrctnTx = value;
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
