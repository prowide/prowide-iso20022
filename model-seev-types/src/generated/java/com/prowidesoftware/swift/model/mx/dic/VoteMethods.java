
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
 * List of the different methods that can be used to vote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteMethods", propOrder = {
    "voteThrghNtwk",
    "voteByMail",
    "elctrncVote",
    "voteByTel"
})
public class VoteMethods {

    @XmlElement(name = "VoteThrghNtwk")
    protected String voteThrghNtwk;
    @XmlElement(name = "VoteByMail")
    protected PostalAddress1 voteByMail;
    @XmlElement(name = "ElctrncVote")
    protected CommunicationAddress4 elctrncVote;
    @XmlElement(name = "VoteByTel")
    protected String voteByTel;

    /**
     * Gets the value of the voteThrghNtwk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteThrghNtwk() {
        return voteThrghNtwk;
    }

    /**
     * Sets the value of the voteThrghNtwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteMethods setVoteThrghNtwk(String value) {
        this.voteThrghNtwk = value;
        return this;
    }

    /**
     * Gets the value of the voteByMail property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getVoteByMail() {
        return voteByMail;
    }

    /**
     * Sets the value of the voteByMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public VoteMethods setVoteByMail(PostalAddress1 value) {
        this.voteByMail = value;
        return this;
    }

    /**
     * Gets the value of the elctrncVote property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress4 }
     *     
     */
    public CommunicationAddress4 getElctrncVote() {
        return elctrncVote;
    }

    /**
     * Sets the value of the elctrncVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress4 }
     *     
     */
    public VoteMethods setElctrncVote(CommunicationAddress4 value) {
        this.elctrncVote = value;
        return this;
    }

    /**
     * Gets the value of the voteByTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteByTel() {
        return voteByTel;
    }

    /**
     * Sets the value of the voteByTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VoteMethods setVoteByTel(String value) {
        this.voteByTel = value;
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
