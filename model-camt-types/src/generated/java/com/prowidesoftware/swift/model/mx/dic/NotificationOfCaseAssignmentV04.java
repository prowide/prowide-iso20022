
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
 * The Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.
 * This message is used to inform the case assigner that:
 * - the assignee is reassigning the case to the next agent in the transaction processing chain for further action
 * - the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point
 * Usage
 * The Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:
 * - request to cancel payment case
 * - request to modify payment case
 * - unable to apply case
 * - claim non receipt case
 * The Notification Of Case Assignment message
 * - covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent
 * - except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator
 * - must not be used in place of a Resolution Of Investigation or a Case Status Report message
 * When the assignee does not reassign the case to another party (that is responding with a Notification Of Case Assignment message with notification MINE - The case is processed by the assignee), the case assignment should contain the case assignment elements as received in the original query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationOfCaseAssignmentV04", propOrder = {
    "hdr",
    "_case",
    "assgnmt",
    "ntfctn",
    "splmtryData"
})
public class NotificationOfCaseAssignmentV04 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader4 hdr;
    @XmlElement(name = "Case", required = true)
    protected Case3 _case;
    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment3 assgnmt;
    @XmlElement(name = "Ntfctn", required = true)
    protected CaseForwardingNotification3 ntfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader4 }
     *     
     */
    public ReportHeader4 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader4 }
     *     
     */
    public NotificationOfCaseAssignmentV04 setHdr(ReportHeader4 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case3 }
     *     
     */
    public Case3 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case3 }
     *     
     */
    public NotificationOfCaseAssignmentV04 setCase(Case3 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment3 }
     *     
     */
    public CaseAssignment3 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment3 }
     *     
     */
    public NotificationOfCaseAssignmentV04 setAssgnmt(CaseAssignment3 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CaseForwardingNotification3 }
     *     
     */
    public CaseForwardingNotification3 getNtfctn() {
        return ntfctn;
    }

    /**
     * Sets the value of the ntfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseForwardingNotification3 }
     *     
     */
    public NotificationOfCaseAssignmentV04 setNtfctn(CaseForwardingNotification3 value) {
        this.ntfctn = value;
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
    public NotificationOfCaseAssignmentV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
