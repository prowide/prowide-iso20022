
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
 * The Cancel Case Assignment message is sent by a case creator or case assigner to a case assignee. This message is used to request the cancellation of a case.
 * Usage
 * The Cancel Case Assignment message is used to stop the processing of a case at a case assignee when a case assignment is incorrect or when the root cause for the case disappears (such as the account owner was able to reconcile after sending a Claim Non Receipt message).
 * The Cancel Case Assignment message can be used to stop the processing of a:
 * - request to cancel payment case
 * - request to modify payment case
 * - unable to apply case
 * - claim non receipt case
 * The Cancel Case Assignment message covers one and only one case at a time. If several case assignments need to be cancelled, then multiple Cancel Case Assignment messages must be sent.
 * The Cancel Case Assignment message must be forwarded by all subsequent case assignee(s) in the case processing chain until it reaches the end point.
 * When an agent re-assigns the Cancel Case Assignment to a subsequent case assignee, this agent must send a Notification Of Case Assignment message to its assigner.
 * When the Cancel Case Assignment instruction has been acted upon by the relevant case assignee, a Resolution Of Investigation message is sent to the case assigner or case creator, in reply.
 * The Cancel Case Assignment message must not be used for other purposes. If, for example, a request to modify payment fails, and the case creator requests the cancellation of the payment, then a Request To Cancel Payment message must be used, with the case identification of the original Request To Modify Payment message. In this context it is incorrect to use the Cancel Case Assignment message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.032.001.01", propOrder = {
    "assgnmt",
    "_case"
})
public class Camt03200101 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment }
     *     
     */
    public CaseAssignment getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment }
     *     
     */
    public Camt03200101 setAssgnmt(CaseAssignment value) {
        this.assgnmt = value;
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
    public Camt03200101 setCase(Case value) {
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
