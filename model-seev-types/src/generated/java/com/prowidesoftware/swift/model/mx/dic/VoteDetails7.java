
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
 * Vote instruction for an agenda or a meeting resolution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDetails7", propOrder = {
    "voteInstrForAgndRsltn",
    "voteInstrForMtgRsltn",
    "invstrTpId"
})
public class VoteDetails7 {

    @XmlElement(name = "VoteInstrForAgndRsltn", required = true)
    protected Vote17Choice voteInstrForAgndRsltn;
    @XmlElement(name = "VoteInstrForMtgRsltn")
    protected VoteInstructionForMeetingResolution3Choice voteInstrForMtgRsltn;
    @XmlElement(name = "InvstrTpId")
    protected InvestorTypeIdentification1 invstrTpId;

    /**
     * Gets the value of the voteInstrForAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote17Choice }
     *     
     */
    public Vote17Choice getVoteInstrForAgndRsltn() {
        return voteInstrForAgndRsltn;
    }

    /**
     * Sets the value of the voteInstrForAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote17Choice }
     *     
     */
    public VoteDetails7 setVoteInstrForAgndRsltn(Vote17Choice value) {
        this.voteInstrForAgndRsltn = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrForMtgRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionForMeetingResolution3Choice }
     *     
     */
    public VoteInstructionForMeetingResolution3Choice getVoteInstrForMtgRsltn() {
        return voteInstrForMtgRsltn;
    }

    /**
     * Sets the value of the voteInstrForMtgRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionForMeetingResolution3Choice }
     *     
     */
    public VoteDetails7 setVoteInstrForMtgRsltn(VoteInstructionForMeetingResolution3Choice value) {
        this.voteInstrForMtgRsltn = value;
        return this;
    }

    /**
     * Gets the value of the invstrTpId property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorTypeIdentification1 }
     *     
     */
    public InvestorTypeIdentification1 getInvstrTpId() {
        return invstrTpId;
    }

    /**
     * Sets the value of the invstrTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorTypeIdentification1 }
     *     
     */
    public VoteDetails7 setInvstrTpId(InvestorTypeIdentification1 value) {
        this.invstrTpId = value;
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
