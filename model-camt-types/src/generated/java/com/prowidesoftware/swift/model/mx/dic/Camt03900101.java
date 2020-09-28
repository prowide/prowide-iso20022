
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
 * The Case Status Report message is sent by a case assignee to a case creator or case assigner.
 * This message is used to report on the status of a case.
 * Usage
 * A Case Status Report message is sent in reply to a Case Status Report Request message. This message
 * - covers one and only one case at a time. (If a case assignee needs to report on several cases, then multiple Case Status Report messages must be sent.)
 * - may be forwarded to subsequent case assigner(s) until it reaches the end point
 * - is able to indicate the fact that a case has been assigned to a party downstream in the payment processing chain
 * - may not be used in place of a Resolution Of Investigation (except for the condition given in the next bullet point) or Notification Of Case Assignment message
 * - may be skipped and replaced by a Resolution Of Investigation message if at the moment when the request for a investigation status arrives, the assignee has obtained a solution. (In this case a Resolution Of Investigation message can be sent in lieu of a Case Status Report and the case may be closed.)
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.039.001.01", propOrder = {
    "hdr",
    "_case",
    "sts",
    "newAssgnmt"
})
public class Camt03900101 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader hdr;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "Sts", required = true)
    protected CaseStatus sts;
    @XmlElement(name = "NewAssgnmt")
    protected CaseAssignment newAssgnmt;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader }
     *     
     */
    public ReportHeader getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader }
     *     
     */
    public Camt03900101 setHdr(ReportHeader value) {
        this.hdr = value;
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
    public Camt03900101 setCase(Case value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatus }
     *     
     */
    public CaseStatus getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatus }
     *     
     */
    public Camt03900101 setSts(CaseStatus value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the newAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment }
     *     
     */
    public CaseAssignment getNewAssgnmt() {
        return newAssgnmt;
    }

    /**
     * Sets the value of the newAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment }
     *     
     */
    public Camt03900101 setNewAssgnmt(CaseAssignment value) {
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
