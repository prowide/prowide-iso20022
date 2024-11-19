
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
 * The Request To Modify Payment message is sent by a case creator/case assigner to a case assignee.
 * This message is used to request the modification of characteristics of an original payment instruction.
 * Usage
 * The Request To Modify Payment message must be answered with a:
 * - Resolution Of Investigation message with a positive final outcome when the case assignee can perform the requested modification
 * - Resolution Of Investigation message with a negative final outcome when the case assignee may perform the requested modification but fails to do so (too late, irrevocable instruction, one requested element cannot be modified.)
 * - Reject Case Assignment message when the case assignee is unable or not authorised to perform the requested modification
 * - Notification Of Case Assignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.
 * The Request To Modify Payment message covers one and only one original instruction at a time. If several original payment instructions need to be modified, then multiple Request To Modify Payment messages must be sent.
 * The Request To Modify Payment message can be sent to request the modification of one or several elements of the original payment instruction. If many elements need to be modified, it is recommended to cancel the original payment instruction and initiate a new one.
 * The Request To Modify Payment must be processed on an all or nothing basis. If one of the elements to be modified cannot be altered, the assignment must be rejected in full by means of a negative Resolution Of Investigation message. (See section on Resolution Of Investigation for more details.)
 * The Request To Modify Payment message must never be sent to request the modification of the currency of the original payment instruction. If the currency is wrong, use Request To Cancel Payment message to cancel it and issue and a new payment instruction.
 * The Request To Modify Payment message may be forwarded to subsequent case assignee(s).
 * When a Request To Modify Payment message is used to decrease the amount of the original payment instruction, the modification will trigger a return of funds from the case assignee to the case creator. The assignee may indicate, within the Resolution Of Investigation message, the amount to be returned, the date it is or will be returned and the channel through which the return will be done.
 * The Request To Modify Payment message must never be sent to request the increase of the amount of the original payment instruction. To increase the amount in a payment, the debtor can do one of the following:
 * - Cancel the first payment using a Request To Cancel Payment message and make a new payment with a higher and correct amount.
 * - Simply send a second payment with the supplementary amount.
 * Depending on the requested modification(s) and the processing stage of the original payment instruction, the processing of a request to modify payment case may end with one of the following:
 * - an Additional Payment Information message sent to the creditor of the original payment instruction
 * - a Debit Authorisation Request message sent to the creditor of the original payment instruction
 * - a Request To Cancel Payment message sent to a subsequent case assignee
 * The Request To Modify Payment message can be sent to correct characteristics of an original payment instruction following receipt of an Unable To Apply message. In this scenario, the case identification will remain the same.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.007.002.02", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "mod"
})
public class Camt00700202 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected PaymentInstructionExtract2 undrlyg;
    @XmlElement(name = "Mod", required = true)
    protected RequestedModification mod;

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
    public Camt00700202 setAssgnmt(CaseAssignment value) {
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
    public Camt00700202 setCase(Case value) {
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
    public Camt00700202 setUndrlyg(PaymentInstructionExtract2 value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedModification }
     *     
     */
    public RequestedModification getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedModification }
     *     
     */
    public Camt00700202 setMod(RequestedModification value) {
        this.mod = value;
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
