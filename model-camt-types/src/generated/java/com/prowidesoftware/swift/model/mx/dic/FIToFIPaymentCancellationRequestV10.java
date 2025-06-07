
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The FIToFIPaymentCancellationRequest message is sent by a case creator/case assigner to a case assignee.
 * This message is used to request the cancellation of an original payment instruction. The FIToFIPaymentCancellationRequest message is exchanged between the instructing agent and the instructed agent to request the cancellation of a interbank payment message previously sent (such as FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit or FinancialInstitutionCreditTransfer).
 * 
 * The FIToFIPaymentCancellationRequest message supports both the request for cancellation (the instructed agent - or assignee - has not yet processed and forwarded the payment instruction) as well as the request for refund (payment has been fully processed already by the instructed agent - or assignee).
 * 
 * Usage
 * The FIToFIPaymentCancellationRequest message must be answered with a:
 * - ResolutionOfInvestigation message with a positive final outcome when the case assignee can perform the requested cancellation;
 * - ResolutionOfInvestigation message with a negative final outcome when the case assignee may perform the requested cancellation but fails to do so (too late, irrevocable instruction);
 * - RejectInvestigation message when the case assignee is unable or not authorised to perform the requested cancellation;
 * - NotificationOfCaseAssignment message to indicate whether the case assignee will take on the case himself or reassign the case to a subsequent party in the payment processing chain.
 * A FIToFIPaymentCancellationRequest message concerns one and only one original payment instruction at a time.
 * When a case assignee successfully performs a cancellation, it must return the corresponding funds to the case assigner. It may provide some details about the return in the ResolutionOfInvestigation message.
 * The processing of a FIToFIPaymentCancellationRequest message case may lead to a DebitAuthorisationRequest message sent to the creditor by its account servicing institution.
 * The FIToFIPaymentCancellationRequest message may be used to escalate a case after an unsuccessful request to modify the payment. In this scenario, the case identification remains the same as in the original FIToFIPaymentCancellationRequest message and the element ReopenCaseIndication is set to 'Yes' or 'true'.
 * The FIToFIPaymentCancellationRequest message has the following main characteristics: the case creator assigns a unique case identification and the reason code for the cancellation request. This information will be passed unchanged to all subsequent case assignee(s). 
 * For the FIToFIPaymentCancellationRequest message the case has been made optional, as the message might be used outside of a case management environment where the case identification is not relevant.
 * Moreover, the case identification may be present at different levels:
 * - One unique case is defined per cancellation request message: If multiple underlying groups or transactions are present in the message and the case assignee has already forwarded the transaction for which the cancellation is requested, the case cannot be forwarded to the next party in the chain (see rule on uniqueness of the case) and the case creator will have to issue individual cancellation requests for each underlying individual transaction. In response to this cancellation request, the case must also be present at the message level in the Resolution of Investigation message;
 * - One case per original group or transaction present in the cancellation request: For each group or transaction, a unique case has been assigned. This means, when a payment instruction has already been forwarded by the case assignee, the cancellation request may be forwarded to next party in the payment chain, with the unique case assigned to the transaction. When the group can only be cancelled partially, new cancellation requests need however to be issued for the individual transactions within the group for which the cancellation request has not been successful. In response to this cancellation request, the case must be present in the cancellation details identifying the original group or transaction in the Resolution of Investigation message;
 * - No case used in cancellation request message.
 * Cancellation of a cover payment:
 * The cancellation of a payment instruction for which cover is provided by a separate instruction always results in the cancellation of the whole transaction, including the cover. The case assignee performing the cancellation must initiate the return of funds to the case creator. The case assigner must not request the cancellation of the cover separately.
 * Cancellation request initiators:
 * The cancellation of a payment instruction can be initiated by either the debtor/creditor or any subsequent agent in the payment instruction processing chain.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIToFIPaymentCancellationRequestV10", propOrder = {
    "assgnmt",
    "_case",
    "ctrlData",
    "undrlyg",
    "splmtryData"
})
public class FIToFIPaymentCancellationRequestV10 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "CtrlData")
    protected ControlData1 ctrlData;
    @XmlElement(name = "Undrlyg", required = true)
    protected List<UnderlyingTransaction28> undrlyg;
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
    public FIToFIPaymentCancellationRequestV10 setAssgnmt(CaseAssignment5 value) {
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
    public FIToFIPaymentCancellationRequestV10 setCase(Case5 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the ctrlData property.
     * 
     * @return
     *     possible object is
     *     {@link ControlData1 }
     *     
     */
    public ControlData1 getCtrlData() {
        return ctrlData;
    }

    /**
     * Sets the value of the ctrlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlData1 }
     *     
     */
    public FIToFIPaymentCancellationRequestV10 setCtrlData(ControlData1 value) {
        this.ctrlData = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlyg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlyg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingTransaction28 }
     * 
     * 
     */
    public List<UnderlyingTransaction28> getUndrlyg() {
        if (undrlyg == null) {
            undrlyg = new ArrayList<UnderlyingTransaction28>();
        }
        return this.undrlyg;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the undrlyg list.
     * @see #getUndrlyg()
     * 
     */
    public FIToFIPaymentCancellationRequestV10 addUndrlyg(UnderlyingTransaction28 undrlyg) {
        getUndrlyg().add(undrlyg);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FIToFIPaymentCancellationRequestV10 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
