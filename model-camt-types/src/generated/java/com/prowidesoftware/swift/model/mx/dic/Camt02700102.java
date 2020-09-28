
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
 * The Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.
 * This message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).
 * Usage
 * The claim non receipt case occurs in two situations:
 * - The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.
 * - An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.
 * The Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.
 * Depending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a:
 * - Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).
 * - Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.
 * If the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details.
 * In the cover is missing, the case assignee may also simply issue the omitted cover payment. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.
 * The Claim Non Receipt message may be forwarded to subsequent case assignees.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.027.001.02", propOrder = {
    "assgnmt",
    "_case",
    "undrlyg",
    "mssngCover"
})
public class Camt02700102 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "Undrlyg", required = true)
    protected PaymentInstructionExtract2 undrlyg;
    @XmlElement(name = "MssngCover")
    protected MissingCover mssngCover;

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
    public Camt02700102 setAssgnmt(CaseAssignment value) {
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
    public Camt02700102 setCase(Case value) {
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
    public Camt02700102 setUndrlyg(PaymentInstructionExtract2 value) {
        this.undrlyg = value;
        return this;
    }

    /**
     * Gets the value of the mssngCover property.
     * 
     * @return
     *     possible object is
     *     {@link MissingCover }
     *     
     */
    public MissingCover getMssngCover() {
        return mssngCover;
    }

    /**
     * Sets the value of the mssngCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingCover }
     *     
     */
    public Camt02700102 setMssngCover(MissingCover value) {
        this.mssngCover = value;
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
