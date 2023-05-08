
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
 * The CaseStatusReport message is sent by a case assignee to a case creator or case assigner.
 * This message is used to report on the status of a case.
 * Usage
 * A CaseStatusReport message is sent in reply to a CaseStatusReportRequest message. This message
 * - covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple CaseStatusReport messages must be sent);
 * - may be forwarded to subsequent case assigner(s) until it reaches the end point;
 * - is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain;
 * - may not be used in place of a ResolutionOfInvestigation (except for the condition given in the next bullet point) or NotificationOfCaseAssignment message;
 * - may be skipped and replaced by a ResolutionOfInvestigation message when the request for a investigation status is received at the time the assigner has resolved the case. (In this case a ResolutionOfInvestigation message can be sent instead of a CaseStatusReport and the case may be closed).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatusReportV05", propOrder = {
    "hdr",
    "_case",
    "sts",
    "newAssgnmt",
    "splmtryData"
})
public class CaseStatusReportV05 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader5 hdr;
    @XmlElement(name = "Case", required = true)
    protected Case5 _case;
    @XmlElement(name = "Sts", required = true)
    protected CaseStatus2 sts;
    @XmlElement(name = "NewAssgnmt")
    protected CaseAssignment5 newAssgnmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader5 }
     *     
     */
    public ReportHeader5 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader5 }
     *     
     */
    public CaseStatusReportV05 setHdr(ReportHeader5 value) {
        this.hdr = value;
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
    public CaseStatusReportV05 setCase(Case5 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatus2 }
     *     
     */
    public CaseStatus2 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatus2 }
     *     
     */
    public CaseStatusReportV05 setSts(CaseStatus2 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the newAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getNewAssgnmt() {
        return newAssgnmt;
    }

    /**
     * Sets the value of the newAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseStatusReportV05 setNewAssgnmt(CaseAssignment5 value) {
        this.newAssgnmt = value;
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
    public CaseStatusReportV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
