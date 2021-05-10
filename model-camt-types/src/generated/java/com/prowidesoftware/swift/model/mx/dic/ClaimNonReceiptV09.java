
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
 * The ClaimNonReceipt message is sent by a case creator/case assigner to a case assignee.
 * This message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).
 * Usage
 * The claim non receipt case occurs in two situations: 
 * - The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a ClaimNonReceipt message to its account servicing institution is not retained;
 * - An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a ClaimNonReceipt message to the sender of the original payment instruction.
 * The ClaimNonReceipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple ClaimNonReceipt messages must be sent.
 * Depending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a: 
 * - CustomerPaymentCancellationRequest or FIToFIPaymentCancellationRequest message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued);
 * - RequestToModifyPayment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.
 * If the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a ResolutionOfInvestigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on ResolutionOfInvestigation for more details).
 * In the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a ResolutionOfInvestigation message with the CorrectionTransaction element mentioning the references of the cover payment.
 * The ClaimNonReceipt message may be forwarded to subsequent case assignees.
 * The ClaimNonReceipt message has the following main characteristics: 
 * - Case identification: The case creator assigns a unique case identification. This information will be passed unchanged to subsequent case assignee(s);
 * - Underlying payment: The case creator refers to the underlying payment instruction for the unambiguous identification of the payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s);
 * - Missing cover indicator: The MissingCoverIndicator element distinguishes between a missing cover situation (when set to YES - true) or a missing funds situation (when set to NO - false);
 * - CoverCorrection: The CoverCorrection element allows the case assigner to provide corrected cover information, when these are incorrect in the underlying payment instruction for which the cover is issued.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimNonReceiptV09", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "coverDtls",
    "instrForAssgne",
    "splmtryData"
})
public class ClaimNonReceiptV09 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction7Choice undrlyg;
    @XmlElement(name = "CoverDtls")
    protected MissingCover5 coverDtls;
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
    public ClaimNonReceiptV09 setAssgnmt(CaseAssignment5 value) {
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
    public ClaimNonReceiptV09 setCase(Case5 value) {
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
    public ClaimNonReceiptV09 setUndrlyg(UnderlyingTransaction7Choice value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the coverDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MissingCover5 }
     *     
     */
    public MissingCover5 getCoverDtls() {
        return coverDtls;
    }

    /**
     * Sets the value of the coverDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingCover5 }
     *     
     */
    public ClaimNonReceiptV09 setCoverDtls(MissingCover5 value) {
        this.coverDtls = value;
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
    public ClaimNonReceiptV09 setInstrForAssgne(InstructionForAssignee1 value) {
        this.instrForAssgne = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ClaimNonReceiptV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
