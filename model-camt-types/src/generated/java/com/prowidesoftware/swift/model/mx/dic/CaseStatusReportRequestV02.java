
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
 * The CaseStatusReportRequest message is sent by a case creator or case assigner to a case assignee.
 * This message is used to request the status of a case.
 * Usage
 * The Case Status Report Request message must be answered with a Case Status Report message. It can be used to request the status of a:
 * - request to cancel payment case
 * - request to modify payment case
 * - unable to apply case
 * - claim non receipt case
 * The Case Status Report Request message covers one and only one case at a time. If a case creator or case assigner needs the status of several cases, then multiple Case Status Report Request messages must be sent.
 * The Case Status Report Request message may be forwarded to subsequent case assignee(s) in the case processing chain.
 * The processing of a case generates Notification Of Case Assignment and/or Resolution Of Investigation messages to the case creator/case assigner. They alone should provide collaborating parties sufficient information about the progress of the investigation. The Case Status Report Request must therefore only be used when no information has been received from the case assignee within the expected time frame.
 * An agent may suspend an investigation by classifying it as overdue if, this agent, after sending the request for the status of the investigation, does not receive any response after a long time. Agents may set their individual threshold wait-time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatusReportRequestV02", propOrder = {
    "reqHdr",
    "_case"
})
public class CaseStatusReportRequestV02 {

    @XmlElement(name = "ReqHdr", required = true)
    protected ReportHeader2 reqHdr;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;

    /**
     * Gets the value of the reqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader2 }
     *     
     */
    public ReportHeader2 getReqHdr() {
        return reqHdr;
    }

    /**
     * Sets the value of the reqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader2 }
     *     
     */
    public CaseStatusReportRequestV02 setReqHdr(ReportHeader2 value) {
        this.reqHdr = value;
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
    public CaseStatusReportRequestV02 setCase(Case2 value) {
        this._case = value;
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
