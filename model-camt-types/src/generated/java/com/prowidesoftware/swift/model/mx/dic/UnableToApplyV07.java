
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The UnableToApply message is sent by a case creator or a case assigner to a case assignee. This message is used to initiate an investigation of a payment instruction that cannot be executed or reconciled.
 * Usage
 * The Unable To Apply case occurs in two situations:
 * - an agent cannot execute the payment instruction due to missing or incorrect information;
 * - a creditor cannot reconcile the payment entry as it is received unexpectedly, or missing or incorrect information prevents reconciliation.
 * The UnableToApply message:
 * - always follows the reverse route of the original payment instruction;
 * - must be forwarded to the preceding agents in the payment processing chain, where appropriate;
 * - covers one and only one payment instruction (or payment entry) at a time; if several payment instructions cannot be executed or several payment entries cannot be reconciled, then multiple UnableToApply messages must be sent.
 * Depending on what stage the payment is and what has been done to it, for example incorrect routing, errors/omissions when processing the instruction or even the absence of any error, the unable to apply case may lead to a:
 * - AdditionalPaymentInformation message, sent to the case creator/case assigner, if a truncation or omission in a payment instruction prevented reconciliation;
 * - CustomerPaymentCancellationRequest or FIToFIPaymentCancellationRequest message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents (this also entails a new corrected payment instruction being issued). Prior to sending the payment cancellation request, the agent should first send a resolution indicating that a cancellation will follow (CWFW);
 * - RequestToModifyPayment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction. Prior to sending the modify payment request, the agent should first send a resolution indicating that a modification will follow (MWFW);
 * - DebitAuthorisationRequest message, sent to the case creator/case assigner, if the payment instruction has reached an incorrect creditor.
 * The UnableToApply message has the following main characteristics:
 * The case creator (the instructed party/creditor of a payment instruction) assigns a unique case identification and optionally the reason code for the UnableToApply message. This information will be passed unchanged to all subsequent case assignees.
 * The case creator specifies the identification of the underlying payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).
 * The UnableToApply Justification element allows the assigner to indicate whether a specific element causes the unable to apply situation (incorrect element and/or mismatched element can be listed) or whether any supplementary information needs to be forwarded.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnableToApplyV07", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "justfn",
    "splmtryData"
})
public class UnableToApplyV07 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction5Choice undrlyg;
    @XmlElement(name = "Justfn", required = true)
    protected UnableToApplyJustification3Choice justfn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public UnableToApplyV07 setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public UnableToApplyV07 setCase(Case5 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction5Choice }
     *     
     */
    public UnderlyingTransaction5Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction5Choice }
     *     
     */
    public UnableToApplyV07 setUndrlyg(UnderlyingTransaction5Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyJustification3Choice }
     *     
     */
    public UnableToApplyJustification3Choice getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyJustification3Choice }
     *     
     */
    public UnableToApplyV07 setJustfn(UnableToApplyJustification3Choice value) {
        this.justfn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public UnableToApplyV07 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
