
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
 * The CaseStatusReportRequest message is sent by a case creator or case assigner to a case assignee.
 * This message is used to request the status of a case.
 * Usage
 * The CaseStatusReportRequest message must be answered with a CaseStatusReport message. It can be used to request the status of a:
 * - request to cancel payment case;
 * - request to modify payment case;
 * - unable to apply case;
 * - claim non receipt case.
 * The CaseStatusReportRequest message covers one and only one case at a time. If a case creator or case assigner needs the status of several cases, then multiple CaseStatusReportRequest messages must be sent.
 * The CaseStatusReportRequest message may be forwarded to subsequent case assignee(s) in the case processing chain.
 * The processing of a case generates NotificationOfCaseAssignment and/or ResolutionOfInvestigation messages to the case creator/case assigner. They alone should provide collaborating parties sufficient information about the progress of the investigation. The CaseStatusReportRequest must therefore only be used when no information has been received from the case assignee within the expected time frame.
 * An agent may suspend an investigation by classifying it as overdue if, this agent, after sending the request for the status of the investigation, does not receive any response after a long time. Agents may set their individual threshold wait-time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatusReportRequestV05", propOrder = {
    "reqHdr",
    "_case",
    "splmtryData"
})
public class CaseStatusReportRequestV05 {

    @XmlElement(name = "ReqHdr", required = true)
    protected ReportHeader7 reqHdr;
    @XmlElement(name = "Case", required = true)
    protected Case6 _case;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the reqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader7 }
     *     
     */
    public ReportHeader7 getReqHdr() {
        return reqHdr;
    }

    /**
     * Sets the value of the reqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader7 }
     *     
     */
    public CaseStatusReportRequestV05 setReqHdr(ReportHeader7 value) {
        this.reqHdr = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case6 }
     *     
     */
    public Case6 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case6 }
     *     
     */
    public CaseStatusReportRequestV05 setCase(Case6 value) {
        this._case = value;
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
    public CaseStatusReportRequestV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
