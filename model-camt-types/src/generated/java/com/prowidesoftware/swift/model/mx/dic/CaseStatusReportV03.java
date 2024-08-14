
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
 * The Case Status Report message is sent by a case assignee to a case creator or case assigner.
 * This message is used to report on the status of a case.
 * Usage
 * A Case Status Report message is sent in reply to a Case Status Report Request message. This message
 * - covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)
 * - may be forwarded to subsequent case assigner(s) until it reaches the end point
 * - is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain
 * - may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message
 * - may be skipped and replaced by a Resolution Of Investigation message when the request for a investigation status is received at the time the assigner has resolved the case. (In this case a Resolution Of Investigation message can be sent instead of a Case Status Report and the case may be closed.).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatusReportV03", propOrder = {
    "hdr",
    "_case",
    "sts",
    "newAssgnmt"
})
public class CaseStatusReportV03 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader2 hdr;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;
    @XmlElement(name = "Sts", required = true)
    protected CaseStatus2 sts;
    @XmlElement(name = "NewAssgnmt")
    protected CaseAssignment2 newAssgnmt;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader2 }
     *     
     */
    public ReportHeader2 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader2 }
     *     
     */
    public CaseStatusReportV03 setHdr(ReportHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public CaseStatusReportV03 setCase(Case2 value) {
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
    public CaseStatusReportV03 setSts(CaseStatus2 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the newAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment2 }
     *     
     */
    public CaseAssignment2 getNewAssgnmt() {
        return newAssgnmt;
    }

    /**
     * Sets the value of the newAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment2 }
     *     
     */
    public CaseStatusReportV03 setNewAssgnmt(CaseAssignment2 value) {
        this.newAssgnmt = value;
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
