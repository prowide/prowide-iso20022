
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
 * The Unable To Apply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.
 * Usage
 * The Unable To Apply case occurs in two situations:
 * - an agent cannot execute the payment instruction due to missing or incorrect information
 * - a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation
 * The Unable To Apply message:
 * - always follows the reverse route of the original payment instruction
 * - must be forwarded to the preceding agents in the payment processing chain, where appropriate
 * - covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple Unable To Apply messages must be sent.
 * Depending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:
 * - Additional Payment Information message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation.
 * - Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW).
 * - Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW).
 * - Debit Authorisation Request message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.026.001.02", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "justfn"
})
public class Camt02600102 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected PaymentInstructionExtract2 undrlyg;
    @XmlElement(name = "Justfn", required = true)
    protected UnableToApplyJustification1Choice justfn;

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
    public Camt02600102 setAssgnmt(CaseAssignment value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public Camt02600102 setCase(Case value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionExtract2 }
     *     
     */
    public PaymentInstructionExtract2 getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionExtract2 }
     *     
     */
    public Camt02600102 setUndrlyg(PaymentInstructionExtract2 value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyJustification1Choice }
     *     
     */
    public UnableToApplyJustification1Choice getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyJustification1Choice }
     *     
     */
    public Camt02600102 setJustfn(UnableToApplyJustification1Choice value) {
        this.justfn = value;
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
