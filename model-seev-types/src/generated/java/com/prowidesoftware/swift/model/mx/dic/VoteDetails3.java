
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
 * Specifies detailed voting instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDetails3", propOrder = {
    "voteInstrForAgndRsltn",
    "voteInstrForMtgRsltn"
})
public class VoteDetails3 {

    @XmlElement(name = "VoteInstrForAgndRsltn", required = true)
    protected Vote3Choice voteInstrForAgndRsltn;
    @XmlElement(name = "VoteInstrForMtgRsltn")
    protected VoteInstructionForMeetingResolution2Choice voteInstrForMtgRsltn;

    /**
     * Gets the value of the voteInstrForAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote3Choice }
     *     
     */
    public Vote3Choice getVoteInstrForAgndRsltn() {
        return voteInstrForAgndRsltn;
    }

    /**
     * Sets the value of the voteInstrForAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote3Choice }
     *     
     */
    public VoteDetails3 setVoteInstrForAgndRsltn(Vote3Choice value) {
        this.voteInstrForAgndRsltn = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrForMtgRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionForMeetingResolution2Choice }
     *     
     */
    public VoteInstructionForMeetingResolution2Choice getVoteInstrForMtgRsltn() {
        return voteInstrForMtgRsltn;
    }

    /**
     * Sets the value of the voteInstrForMtgRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionForMeetingResolution2Choice }
     *     
     */
    public VoteDetails3 setVoteInstrForMtgRsltn(VoteInstructionForMeetingResolution2Choice value) {
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
