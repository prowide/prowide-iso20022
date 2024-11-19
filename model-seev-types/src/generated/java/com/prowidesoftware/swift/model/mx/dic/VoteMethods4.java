
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
 * Information about the vote methods to be used.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteMethods4", propOrder = {
    "voteThrghNtwk",
    "voteByMail",
    "elctrncVote",
    "voteByTel"
})
public class VoteMethods4 {

    @XmlElement(name = "VoteThrghNtwk")
    protected List<String> voteThrghNtwk;
    @XmlElement(name = "VoteByMail")
    protected MailAddress1 voteByMail;
    @XmlElement(name = "ElctrncVote")
    protected List<CommunicationAddress12> elctrncVote;
    @XmlElement(name = "VoteByTel")
    protected List<String> voteByTel;

    /**
     * Gets the value of the voteThrghNtwk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteThrghNtwk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteThrghNtwk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the voteThrghNtwk property.
     */
    public List<String> getVoteThrghNtwk() {
        if (voteThrghNtwk == null) {
            voteThrghNtwk = new ArrayList<>();
        }
        return this.voteThrghNtwk;
    }

    /**
     * Gets the value of the voteByMail property.
     * 
     * @return
     *     possible object is
     *     {@link MailAddress1 }
     *     
     */
    public MailAddress1 getVoteByMail() {
        return voteByMail;
    }

    /**
     * Sets the value of the voteByMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddress1 }
     *     
     */
    public VoteMethods4 setVoteByMail(MailAddress1 value) {
        this.voteByMail = value;
        return this;
    }

    /**
     * Gets the value of the elctrncVote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the elctrncVote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElctrncVote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress12 }
     * 
     * 
     * @return
     *     The value of the elctrncVote property.
     */
    public List<CommunicationAddress12> getElctrncVote() {
        if (elctrncVote == null) {
            elctrncVote = new ArrayList<>();
        }
        return this.elctrncVote;
    }

    /**
     * Gets the value of the voteByTel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteByTel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteByTel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the voteByTel property.
     */
    public List<String> getVoteByTel() {
        if (voteByTel == null) {
            voteByTel = new ArrayList<>();
        }
        return this.voteByTel;
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
     * Adds a new item to the voteThrghNtwk list.
     * @see #getVoteThrghNtwk()
     * 
     */
    public VoteMethods4 addVoteThrghNtwk(String voteThrghNtwk) {
        getVoteThrghNtwk().add(voteThrghNtwk);
        return this;
    }

    /**
     * Adds a new item to the elctrncVote list.
     * @see #getElctrncVote()
     * 
     */
    public VoteMethods4 addElctrncVote(CommunicationAddress12 elctrncVote) {
        getElctrncVote().add(elctrncVote);
        return this;
    }

    /**
     * Adds a new item to the voteByTel list.
     * @see #getVoteByTel()
     * 
     */
    public VoteMethods4 addVoteByTel(String voteByTel) {
        getVoteByTel().add(voteByTel);
        return this;
    }

}
