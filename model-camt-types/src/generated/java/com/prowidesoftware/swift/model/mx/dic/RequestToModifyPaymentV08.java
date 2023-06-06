
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
 * The RequestToModifyPayment message is sent by a case creator/case assigner to a case assignee.
 * This message is used to request the modification of characteristics of an original payment instruction.
 * Usage
 * The RequestToModifyPayment message must be answered with a:
 * - ResolutionOfInvestigation message with a positive final outcome when the case assignee can perform the requested modification;
 * - ResolutionOfInvestigation message with a negative final outcome when the case assignee may perform the requested modification but fails to do so (too late, irrevocable instruction, one requested element cannot be modified);
 * - RejectCaseAssignment message when the case assignee is unable or not authorised to perform the requested modification;
 * - NotificationOfCaseAssignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.
 * The RequestToModifyPayment message covers one and only one original instruction at a time. If several original payment instructions need to be modified, then multiple RequestToModifyPayment messages must be sent.
 * The RequestToModifyPayment message can be sent to request the modification of one or several elements of the original payment instruction. If many elements need to be modified, it is recommended to cancel the original payment instruction and initiate a new one.
 * The RequestToModifyPayment must be processed on an all or nothing basis. If one of the elements to be modified cannot be altered, the assignment must be rejected in full by means of a negative ResolutionOfInvestigation message. (See section on ResolutionOfInvestigation for more details).
 * The RequestToModifyPayment message must never be sent to request the modification of the currency of the original payment instruction. If the currency is wrong, use a CustomerPaymentCancellationRequest or a FIToFIPaymentCancellationRequest message to cancel it and issue and a new payment instruction.
 * The RequestToModifyPayment message may be forwarded to subsequent case assignee(s).
 * When a RequestToModifyPayment message is used to decrease the amount of the original payment instruction, the modification will trigger a return of funds from the case assignee to the case creator. The assignee may indicate, within the ResolutionOfInvestigation message, the amount to be returned, the date it is or will be returned and the channel through which the return will be done.
 * The RequestToModifyPayment message must never be sent to request the increase of the amount of the original payment instruction. To increase the amount in a payment, the debtor can do one of the following:
 * - Cancel the first payment using a CustomerPaymentCancellationRequest or a FIToFIPaymentCancellationRequest message and make a new payment with a higher and correct amount;
 * - Simply send a second payment with the supplementary amount.
 * Depending on the requested modification(s) and the processing stage of the original payment instruction, the processing of a request to modify payment case may end with one of the following:
 * - an AdditionalPaymentInformation message sent to the creditor of the original payment instruction;
 * - a DebitAuthorisationRequest message sent to the creditor of the original payment instruction;
 * - a CustomerPaymentCancellationRequest or a FIToFIPaymentCancellationRequest message sent to a subsequent case assignee.
 * The RequestToModifyPayment message can be sent to correct characteristics of an original payment instruction following receipt of an UnableToApply message. In this scenario, the case identification will remain the same.
 * The RequestToModifyPayment message has the following main characteristics:
 * The case creator assigns a unique case identification. This information will be passed unchanged to all subsequent case assignee(s).
 * Lowering the amount of an original payment instruction for which cover is provided by a separate instruction will systematically mean the modification of the whole transaction, including the cover. The case assignee performing the amount modification must initiate the return of funds in excess to the case creator.
 * The modification of the agent's or agents' information on an original payment instruction for which cover is provided by a separate instruction will systematically mean the whole transaction is modified, that is the cover is executed through the agent(s) mentioned in the RequestToModifyPayment message. The cover payment must not be modified separately.
 * The modification of a payment instruction can be initiated by either the debtor or any subsequent agent in the payment processing chain.
 * The case creator provides the information to be modified in line with agreements made with the case assignee. If the case assignee needs in turn to assign the case to a subsequent case assignee, the requested modification(s) must be in line with the agreement made with the next case assignee and a NotificationOfCaseAssignment message must be sent to the case assigner. Otherwise, the request to modify payment case must be rejected (by means of a negative ResolutionOfInvestigation message).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestToModifyPaymentV08", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "mod",
    "instrForAssgne",
    "splmtryData"
})
public class RequestToModifyPaymentV08 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction7Choice undrlyg;
    @XmlElement(name = "Mod", required = true)
    protected RequestedModification10 mod;
    @XmlElement(name = "InstrForAssgne")
    protected InstructionForAssignee1 instrForAssgne;
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
    public RequestToModifyPaymentV08 setAssgnmt(CaseAssignment5 value) {
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
    public RequestToModifyPaymentV08 setCase(Case5 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction7Choice }
     *     
     */
    public UnderlyingTransaction7Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction7Choice }
     *     
     */
    public RequestToModifyPaymentV08 setUndrlyg(UnderlyingTransaction7Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedModification10 }
     *     
     */
    public RequestedModification10 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedModification10 }
     *     
     */
    public RequestToModifyPaymentV08 setMod(RequestedModification10 value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the instrForAssgne property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForAssignee1 }
     *     
     */
    public InstructionForAssignee1 getInstrForAssgne() {
        return instrForAssgne;
    }

    /**
     * Sets the value of the instrForAssgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForAssignee1 }
     *     
     */
    public RequestToModifyPaymentV08 setInstrForAssgne(InstructionForAssignee1 value) {
        this.instrForAssgne = value;
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
    public RequestToModifyPaymentV08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
