
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
 * The Resolution Of Investigation message is sent by a case assignee to a case creator/case assigner.
 * This message is used to inform of the resolution of a case, and optionally provides details about .
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
 * Whenever a payment instruction has been generated to solve the case under investigation following a claim non receipt or an unable to apply, the optional CorrectionTransaction component present in the message must be completed.
 * Whenever the action of modifying or cancelling a payment results in funds being returned or reversed, an investigating agent may provide the details in the resolution related investigation component, to identify the return or reversal transaction. These details will facilitate the account reconciliations at the initiating bank and the intermediaries. It must be stressed that the return or reversal of funds is outside the scope of this Exceptions and Investigation service. The features given here is only meant to transmit the information of return or reversal when it is available through the resolution of the case.
 * The Resolution Of Investigation message must:
 * - be forwarded by all subsequent case assignee(s) until it reaches the case creator
 * - not be used in place of a Reject Case Assignment or Case Status Report or Notification Of Case Assignment message
 * Take note of an exceptional rule that allows the use of Resolution Of Investigation in lieu of a Case Status Report. Case Status Report is a response-message to a Case Status Report Request. The latter which is sent when the assigner has reached its own time-out threshold to receive a response. However it may happen that when the Request arrives, the investigating agent has just obtained a resolution. In such a situation, it would be redundant to send a Case Status Report when then followed immediately by a Resolution Of Investigation. It is therefore quite acceptable for the investigating agent, the assignee, to skip the Case Status Report and send the Resolution Of Investigation message directly.
 * The Resolution Of Investigation message should be the sole message to respond to a cancellation request. Details of the underlying transactions and the related statuses for which the cancellation request has been issued may be provided in the Cancellation Details component.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV03", propOrder = {
    "assgnmt",
    "rslvdCase",
    "sts",
    "cxlDtls",
    "stmtDtls",
    "crrctnTx",
    "rsltnRltdInf"
})
public class ResolutionOfInvestigationV03 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment2 assgnmt;
    @XmlElement(name = "RslvdCase")
    protected Case2 rslvdCase;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus2Choice sts;
    @XmlElement(name = "CxlDtls")
    protected List<UnderlyingTransaction3> cxlDtls;
    @XmlElement(name = "StmtDtls")
    protected StatementResolutionEntry1 stmtDtls;
    @XmlElement(name = "CrrctnTx")
    protected CorrectiveTransaction1Choice crrctnTx;
    @XmlElement(name = "RsltnRltdInf")
    protected ResolutionInformation1 rsltnRltdInf;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment2 }
     *     
     */
    public CaseAssignment2 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment2 }
     *     
     */
    public ResolutionOfInvestigationV03 setAssgnmt(CaseAssignment2 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public ResolutionOfInvestigationV03 setRslvdCase(Case2 value) {
        this.rslvdCase = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus2Choice }
     *     
     */
    public InvestigationStatus2Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus2Choice }
     *     
     */
    public ResolutionOfInvestigationV03 setSts(InvestigationStatus2Choice value) {
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
     * {@link UnderlyingTransaction3 }
     * 
     * 
     */
    public List<UnderlyingTransaction3> getCxlDtls() {
        if (cxlDtls == null) {
            cxlDtls = new ArrayList<UnderlyingTransaction3>();
        }
        return this.cxlDtls;
    }

    /**
     * Gets the value of the stmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link StatementResolutionEntry1 }
     *     
     */
    public StatementResolutionEntry1 getStmtDtls() {
        return stmtDtls;
    }

    /**
     * Sets the value of the stmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementResolutionEntry1 }
     *     
     */
    public ResolutionOfInvestigationV03 setStmtDtls(StatementResolutionEntry1 value) {
        this.stmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the crrctnTx property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveTransaction1Choice }
     *     
     */
    public CorrectiveTransaction1Choice getCrrctnTx() {
        return crrctnTx;
    }

    /**
     * Sets the value of the crrctnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveTransaction1Choice }
     *     
     */
    public ResolutionOfInvestigationV03 setCrrctnTx(CorrectiveTransaction1Choice value) {
        this.crrctnTx = value;
        return this;
    }

    /**
     * Gets the value of the rsltnRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionInformation1 }
     *     
     */
    public ResolutionInformation1 getRsltnRltdInf() {
        return rsltnRltdInf;
    }

    /**
     * Sets the value of the rsltnRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionInformation1 }
     *     
     */
    public ResolutionOfInvestigationV03 setRsltnRltdInf(ResolutionInformation1 value) {
        this.rsltnRltdInf = value;
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

    /**
     * Adds a new item to the cxlDtls list.
     * @see #getCxlDtls()
     * 
     */
    public ResolutionOfInvestigationV03 addCxlDtls(UnderlyingTransaction3 cxlDtls) {
        getCxlDtls().add(cxlDtls);
        return this;
    }

}
