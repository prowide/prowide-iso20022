
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
 * An issuer, its agent or an intermediary sends the MeetingVoteExecutionConfirmation message to confirm to the Sender of the MeetingInstruction message, the execution of their voting instruction.
 * Usage
 * This message is sent after the shareholders meeting has taken place. The Sender of this message confirms the execution of the vote at the meeting and confirms that the vote has been processed as instructed via the MeetingInstruction message.
 * This messages is sent if the Sender of the MeetingInstruction message has requested such a confirmation or if market practice or regulation stipulates the need for a full audit trail.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingVoteExecutionConfirmationV02", propOrder = {
    "voteExctnConfId",
    "rltdRef",
    "mtgRef",
    "rptgPty",
    "sctyId",
    "voteInstr"
})
public class MeetingVoteExecutionConfirmationV02 {

    @XmlElement(name = "VoteExctnConfId", required = true)
    protected MessageIdentification1 voteExctnConfId;
    @XmlElement(name = "RltdRef", required = true)
    protected MessageIdentification rltdRef;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference3 mtgRef;
    @XmlElement(name = "RptgPty", required = true)
    protected PartyIdentification9Choice rptgPty;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification3 sctyId;
    @XmlElement(name = "VoteInstr", required = true)
    protected List<DetailedInstructionStatus2> voteInstr;

    /**
     * Gets the value of the voteExctnConfId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getVoteExctnConfId() {
        return voteExctnConfId;
    }

    /**
     * Sets the value of the voteExctnConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingVoteExecutionConfirmationV02 setVoteExctnConfId(MessageIdentification1 value) {
        this.voteExctnConfId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public MeetingVoteExecutionConfirmationV02 setRltdRef(MessageIdentification value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference3 }
     *     
     */
    public MeetingReference3 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference3 }
     *     
     */
    public MeetingVoteExecutionConfirmationV02 setMtgRef(MeetingReference3 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingVoteExecutionConfirmationV02 setRptgPty(PartyIdentification9Choice value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityIdentification3 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public MeetingVoteExecutionConfirmationV02 setSctyId(SecurityIdentification3 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the voteInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionStatus2 }
     * 
     * 
     * @return
     *     The value of the voteInstr property.
     */
    public List<DetailedInstructionStatus2> getVoteInstr() {
        if (voteInstr == null) {
            voteInstr = new ArrayList<>();
        }
        return this.voteInstr;
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
     * Adds a new item to the voteInstr list.
     * @see #getVoteInstr()
     * 
     */
    public MeetingVoteExecutionConfirmationV02 addVoteInstr(DetailedInstructionStatus2 voteInstr) {
        getVoteInstr().add(voteInstr);
        return this;
    }

}
