
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Vote instruction applying to resolutions added during the meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteInstructionForMeetingResolution2Choice", propOrder = {
    "voteIndctn",
    "shrhldr"
})
public class VoteInstructionForMeetingResolution2Choice {

    @XmlElement(name = "VoteIndctn")
    @XmlSchemaType(name = "string")
    protected VoteInstruction4Code voteIndctn;
    @XmlElement(name = "Shrhldr")
    protected NameAndAddress9 shrhldr;

    /**
     * Gets the value of the voteIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstruction4Code }
     *     
     */
    public VoteInstruction4Code getVoteIndctn() {
        return voteIndctn;
    }

    /**
     * Sets the value of the voteIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstruction4Code }
     *     
     */
    public VoteInstructionForMeetingResolution2Choice setVoteIndctn(VoteInstruction4Code value) {
        this.voteIndctn = value;
        return this;
    }

    /**
     * Gets the value of the shrhldr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress9 }
     *     
     */
    public NameAndAddress9 getShrhldr() {
        return shrhldr;
    }

    /**
     * Sets the value of the shrhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress9 }
     *     
     */
    public VoteInstructionForMeetingResolution2Choice setShrhldr(NameAndAddress9 value) {
        this.shrhldr = value;
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
