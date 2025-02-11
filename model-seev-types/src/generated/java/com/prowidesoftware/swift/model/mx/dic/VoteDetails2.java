
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
 * Specifies detailed voting instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDetails2", propOrder = {
    "voteInstrForAgndRsltn",
    "voteInstrForMtgRsltn"
})
public class VoteDetails2 {

    @XmlElement(name = "VoteInstrForAgndRsltn", required = true)
    protected Vote2Choice voteInstrForAgndRsltn;
    @XmlElement(name = "VoteInstrForMtgRsltn")
    protected VoteInstructionForMeetingResolution1Choice voteInstrForMtgRsltn;

    /**
     * Gets the value of the voteInstrForAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote2Choice }
     *     
     */
    public Vote2Choice getVoteInstrForAgndRsltn() {
        return voteInstrForAgndRsltn;
    }

    /**
     * Sets the value of the voteInstrForAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote2Choice }
     *     
     */
    public VoteDetails2 setVoteInstrForAgndRsltn(Vote2Choice value) {
        this.voteInstrForAgndRsltn = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrForMtgRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionForMeetingResolution1Choice }
     *     
     */
    public VoteInstructionForMeetingResolution1Choice getVoteInstrForMtgRsltn() {
        return voteInstrForMtgRsltn;
    }

    /**
     * Sets the value of the voteInstrForMtgRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionForMeetingResolution1Choice }
     *     
     */
    public VoteDetails2 setVoteInstrForMtgRsltn(VoteInstructionForMeetingResolution1Choice value) {
        this.voteInstrForMtgRsltn = value;
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
