
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
 * The MeetingVoteExecutionConfirmation message is sent to confirm that the votes which were sent to the sender have been processed and transferred to the next intermediary or to the issuer or its agent.
 * Usage
 * This message is sent by the receiver of a MeetingInstruction message containing vote instructions to the sender. It is sent to confirm that the vote instructions have been executed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.007.001.01", propOrder = {
    "voteConfId",
    "rltdRef",
    "mtgRef",
    "ntifngPty",
    "sctyPos"
})
public class Seev00700101 {

    @XmlElement(name = "VoteConfId", required = true)
    protected InstructionIdentification voteConfId;
    @XmlElement(name = "RltdRef", required = true)
    protected InstructionIdentification rltdRef;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification7Choice ntifngPty;
    @XmlElement(name = "SctyPos", required = true)
    protected SecurityPosition3 sctyPos;

    /**
     * Gets the value of the voteConfId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getVoteConfId() {
        return voteConfId;
    }

    /**
     * Sets the value of the voteConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00700101 setVoteConfId(InstructionIdentification value) {
        this.voteConfId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00700101 setRltdRef(InstructionIdentification value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference1 }
     *     
     */
    public MeetingReference1 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference1 }
     *     
     */
    public Seev00700101 setMtgRef(MeetingReference1 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the ntifngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Sets the value of the ntifngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public Seev00700101 setNtifngPty(PartyIdentification7Choice value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the sctyPos property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityPosition3 }
     *     
     */
    public SecurityPosition3 getSctyPos() {
        return sctyPos;
    }

    /**
     * Sets the value of the sctyPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityPosition3 }
     *     
     */
    public Seev00700101 setSctyPos(SecurityPosition3 value) {
        this.sctyPos = value;
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
