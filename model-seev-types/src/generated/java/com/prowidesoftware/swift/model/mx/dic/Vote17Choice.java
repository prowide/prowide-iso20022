
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
 * Choice between a vote per agenda resolution and vote for all agenda resolutions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote17Choice", propOrder = {
    "votePerAgndRsltn",
    "voteForAllAgndRsltns"
})
public class Vote17Choice {

    @XmlElement(name = "VotePerAgndRsltn")
    protected Vote18Choice votePerAgndRsltn;
    @XmlElement(name = "VoteForAllAgndRsltns")
    protected VoteInstructionType3Choice voteForAllAgndRsltns;

    /**
     * Gets the value of the votePerAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote18Choice }
     *     
     */
    public Vote18Choice getVotePerAgndRsltn() {
        return votePerAgndRsltn;
    }

    /**
     * Sets the value of the votePerAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote18Choice }
     *     
     */
    public Vote17Choice setVotePerAgndRsltn(Vote18Choice value) {
        this.votePerAgndRsltn = value;
        return this;
    }

    /**
     * Gets the value of the voteForAllAgndRsltns property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionType3Choice }
     *     
     */
    public VoteInstructionType3Choice getVoteForAllAgndRsltns() {
        return voteForAllAgndRsltns;
    }

    /**
     * Sets the value of the voteForAllAgndRsltns property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionType3Choice }
     *     
     */
    public Vote17Choice setVoteForAllAgndRsltns(VoteInstructionType3Choice value) {
        this.voteForAllAgndRsltns = value;
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
