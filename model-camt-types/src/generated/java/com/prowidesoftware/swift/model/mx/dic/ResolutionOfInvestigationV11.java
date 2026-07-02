
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
 * The ResolutionOfInvestigation message is sent by a case assignee to a case creator/case assigner.
 * This message is used to inform of the resolution of a case, and optionally provides details about.
 * - the corrective action undertaken by the case assignee;
 * - information on the return where applicable.
 * Usage
 * The ResolutionOfInvestigation message is used by the case assignee to inform a case creator or case assigner about the resolution of a:
 * - request to cancel payment case;
 * - request to modify payment case;
 * - unable to apply case;
 * - claim non receipt case.
 * The ResolutionOfInvestigation message covers one and only one case at a time. If the case assignee needs to communicate about several cases, then several Resolution Of Investigation messages must be sent.
 * The ResolutionOfInvestigation message provides:
 * - the final outcome of the case, whether positive or negative;
 * - optionally, the details of the corrective action undertaken by the case assignee and the information of the return.
 * Whenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.
 * Whenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.
 * The ResolutionOfInvestigation message must:
 * - be forwarded by all subsequent case assignee(s) until it reaches the case creator;
 * - not be used in place of a RejectCaseAssignment or CaseStatusReport or NotificationOfCaseAssignment message.
 * Take note of an exceptional rule that allows the use of ResolutionOfInvestigation in lieu of a CaseStatusReport. CaseStatusReport is a response-message to a CaseStatusReportRequest. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a CaseStatusReport when then followed immediately by a ResolutionOfInvestigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the ResolutionOfInvestigation message directly.
 * The ResolutionOfInvestigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the CancellationDetails component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV11", propOrder = {
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
public class ResolutionOfInvestigationV11 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "RslvdCase")
    protected Case5 rslvdCase;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus5Choice sts;
    @XmlElement(name = "CxlDtls")
    protected List<UnderlyingTransaction29> cxlDtls;
    @XmlElement(name = "ModDtls")
    protected PaymentTransaction132 modDtls;
    @XmlElement(name = "ClmNonRctDtls")
    protected ClaimNonReceipt2Choice clmNonRctDtls;
    @XmlElement(name = "StmtDtls")
    protected StatementResolutionEntry4 stmtDtls;
    @XmlElement(name = "CrrctnTx")
    protected CorrectiveTransaction5Choice crrctnTx;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionData3 rsltnRltdInf;
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
    public ResolutionOfInvestigationV11 setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public ResolutionOfInvestigationV11 setRslvdCase(Case5 value) {
        this.rslvdCase = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus5Choice }
     *     
     */
    public InvestigationStatus5Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus5Choice }
     *     
     */
    public ResolutionOfInvestigationV11 setSts(InvestigationStatus5Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlDtls property.
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
     * {@link UnderlyingTransaction29 }
     * 
     * 
     */
    public List<UnderlyingTransaction29> getCxlDtls() {
        if (cxlDtls == null) {
            cxlDtls = new ArrayList<UnderlyingTransaction29>();
        }
        return this.cxlDtls;
    }

    /**
     * Gets the value of the modDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction132 }
     *     
     */
    public PaymentTransaction132 getModDtls() {
        return modDtls;
    }

    /**
     * Sets the value of the modDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction132 }
     *     
     */
    public ResolutionOfInvestigationV11 setModDtls(PaymentTransaction132 value) {
        this.modDtls = value;
        return this;
    }

    /**
     * Gets the value of the clmNonRctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceipt2Choice }
     *     
     */
    public ClaimNonReceipt2Choice getClmNonRctDtls() {
        return clmNonRctDtls;
    }

    /**
     * Sets the value of the clmNonRctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceipt2Choice }
     *     
     */
    public ResolutionOfInvestigationV11 setClmNonRctDtls(ClaimNonReceipt2Choice value) {
        this.clmNonRctDtls = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StatementResolutionEntry4 }
     *     
     */
    public StatementResolutionEntry4 getStmtDtls() {
        return stmtDtls;
    }

    /**
     * Sets the value of the stmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementResolutionEntry4 }
     *     
     */
    public ResolutionOfInvestigationV11 setStmtDtls(StatementResolutionEntry4 value) {
        this.stmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the crrctnTx property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveTransaction5Choice }
     *     
     */
    public CorrectiveTransaction5Choice getCrrctnTx() {
        return crrctnTx;
    }

    /**
     * Sets the value of the crrctnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveTransaction5Choice }
     *     
     */
    public ResolutionOfInvestigationV11 setCrrctnTx(CorrectiveTransaction5Choice value) {
        this.crrctnTx = value;
        return this;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionData3 }
     *     
     */
    public ResolutionData3 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionData3 }
     *     
     */
    public ResolutionOfInvestigationV11 setRsltnRltdInf(ResolutionData3 value) {
        this.rsltnRltdInf = value;
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
     * Adds a new item to the cxlDtls list.
     * @see #getCxlDtls()
     * 
     */
    public ResolutionOfInvestigationV11 addCxlDtls(UnderlyingTransaction29 cxlDtls) {
        getCxlDtls().add(cxlDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ResolutionOfInvestigationV11 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
