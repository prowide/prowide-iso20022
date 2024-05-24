
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
 * The ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.
 * This message is used to inform of the resolution of a case, and optionally provides details about.
 * - the corrective action undertaken by the case assignee
 * - information on the return where applicable
 * Usage
 * The ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:
 * - request to cancel payment case
 * - request to modify payment case
 * - unable to apply case
 * - claim non receipt case
 * The ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.
 * The ResolutionOfInvestigation message provides:
 * - the final outcome of the case, whether positive or negative
 * - optionally, the details of the corrective action undertaken by the case assignee and the information of the return
 * Whenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.
 * Whenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.
 * The ResolutionOfInvestigation message must:
 * - be forwarded by all subsequent case assignee(s) until it reaches the case creator
 * - not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message
 * Take note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.
 * The ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV08", propOrder = {
    "assgnmt",
    "rslvdCase",
    "sts",
    "cxlDtls",
    "modDtls",
    "clmNonRctDtls",
    "stmtDtls",
    "crrctnTx",
    "rsltnRltdInf",
    "splmtryData"
})
public class ResolutionOfInvestigationV08 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment4 assgnmt;
    @XmlElement(name = "RslvdCase")
    protected Case4 rslvdCase;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus4Choice sts;
    @XmlElement(name = "CxlDtls")
    protected List<UnderlyingTransaction19> cxlDtls;
    @XmlElement(name = "ModDtls")
    protected PaymentTransaction90 modDtls;
    @XmlElement(name = "ClmNonRctDtls")
    protected ClaimNonReceipt1Choice clmNonRctDtls;
    @XmlElement(name = "StmtDtls")
    protected StatementResolutionEntry3 stmtDtls;
    @XmlElement(name = "CrrctnTx")
    protected CorrectiveTransaction3Choice crrctnTx;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionInformation2 rsltnRltdInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment4 }
     *     
     */
    public CaseAssignment4 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment4 }
     *     
     */
    public ResolutionOfInvestigationV08 setAssgnmt(CaseAssignment4 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case4 }
     *     
     */
    public Case4 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case4 }
     *     
     */
    public ResolutionOfInvestigationV08 setRslvdCase(Case4 value) {
        this.rslvdCase = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus4Choice }
     *     
     */
    public InvestigationStatus4Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus4Choice }
     *     
     */
    public ResolutionOfInvestigationV08 setSts(InvestigationStatus4Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingTransaction19 }
     * 
     * 
     * @return
     *     The value of the cxlDtls property.
     */
    public List<UnderlyingTransaction19> getCxlDtls() {
        if (cxlDtls == null) {
            cxlDtls = new ArrayList<>();
        }
        return this.cxlDtls;
    }

    /**
     * Gets the value of the modDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction90 }
     *     
     */
    public PaymentTransaction90 getModDtls() {
        return modDtls;
    }

    /**
     * Sets the value of the modDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction90 }
     *     
     */
    public ResolutionOfInvestigationV08 setModDtls(PaymentTransaction90 value) {
        this.modDtls = value;
        return this;
    }

    /**
     * Gets the value of the clmNonRctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceipt1Choice }
     *     
     */
    public ClaimNonReceipt1Choice getClmNonRctDtls() {
        return clmNonRctDtls;
    }

    /**
     * Sets the value of the clmNonRctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceipt1Choice }
     *     
     */
    public ResolutionOfInvestigationV08 setClmNonRctDtls(ClaimNonReceipt1Choice value) {
        this.clmNonRctDtls = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StatementResolutionEntry3 }
     *     
     */
    public StatementResolutionEntry3 getStmtDtls() {
        return stmtDtls;
    }

    /**
     * Sets the value of the stmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementResolutionEntry3 }
     *     
     */
    public ResolutionOfInvestigationV08 setStmtDtls(StatementResolutionEntry3 value) {
        this.stmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the crrctnTx property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveTransaction3Choice }
     *     
     */
    public CorrectiveTransaction3Choice getCrrctnTx() {
        return crrctnTx;
    }

    /**
     * Sets the value of the crrctnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveTransaction3Choice }
     *     
     */
    public ResolutionOfInvestigationV08 setCrrctnTx(CorrectiveTransaction3Choice value) {
        this.crrctnTx = value;
        return this;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionInformation2 }
     *     
     */
    public ResolutionInformation2 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionInformation2 }
     *     
     */
    public ResolutionOfInvestigationV08 setRsltnRltdInf(ResolutionInformation2 value) {
        this.rsltnRltdInf = value;
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
     * Adds a new item to the cxlDtls list.
     * @see #getCxlDtls()
     * 
     */
    public ResolutionOfInvestigationV08 addCxlDtls(UnderlyingTransaction19 cxlDtls) {
        getCxlDtls().add(cxlDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ResolutionOfInvestigationV08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
