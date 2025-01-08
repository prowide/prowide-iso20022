
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
 * The RejectInvestigation message is sent by a case assignee to a case creator or case assigner to reject a case given to him.
 * Usage
 * The RejectInvestigation message is used to notify the case creator or case assigner the rejection of an assignment by the case assignee in a:
 * - request to cancel payment case;
 * - request to modify payment case;
 * - unable to apply case;
 * - claim non receipt case.
 * Rejecting a case assignment occurs when:
 * - the case assignee is unable to trace the original payment instruction;
 * - the case assignee is unable, or does not have authority, to process the assigned case (indicate "You have by-passed a party";
 * - the case assignee has received a non expected message, and rejects the message with a wrong message indicator;
 * - the case assignee has not yet received the ResolutionOfInvestigation message and the case has already been reopened;
 * - the case assignee has rejects an non-cash related query.
 * The RejectInvestigation message covers one and only one case at a time. If the case assignee needs to reject several case assignments, then multiple RejectInvestigation messages must be sent.
 * The RejectInvestigation message must be forwarded by all subsequent case assignee(s) until it reaches the case assigner and must not be used in place of a ResolutionOfInvestigation or CaseStatusReport message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectInvestigationV07", propOrder = {
    "assgnmt",
    "_case",
    "justfn",
    "splmtryData"
})
public class RejectInvestigationV07 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment6 assgnmt;
    @XmlElement(name = "Case")
    protected Case6 _case;
    @XmlElement(name = "Justfn", required = true)
    protected InvestigationRejectionJustification1 justfn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment6 }
     *     
     */
    public CaseAssignment6 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment6 }
     *     
     */
    public RejectInvestigationV07 setAssgnmt(CaseAssignment6 value) {
        this.assgnmt = value;
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
    public RejectInvestigationV07 setCase(Case6 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the justfn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRejectionJustification1 }
     *     
     */
    public InvestigationRejectionJustification1 getJustfn() {
        return justfn;
    }

    /**
     * Sets the value of the justfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRejectionJustification1 }
     *     
     */
    public RejectInvestigationV07 setJustfn(InvestigationRejectionJustification1 value) {
        this.justfn = value;
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
    public RejectInvestigationV07 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
