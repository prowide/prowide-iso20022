
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
 * The MeetingResultDissemination message is sent to provide information on the voting results of a general meeting. It is sent by an issuer, its agent or an intermediary to another intermediary, to a party holding the right to vote, to a registered security holder or to an ultimate security holder.
 * Usage
 * The MeetingResultDissemination is used to provide the vote results per resolution. It may also provide information on the level of participation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.008.001.01", propOrder = {
    "mtgRef",
    "ntifngPty",
    "scty",
    "voteRslt",
    "prtcptn",
    "addtlInf"
})
public class Seev00800101 {

    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification7Choice ntifngPty;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition> scty;
    @XmlElement(name = "VoteRslt", required = true)
    protected List<Vote2> voteRslt;
    @XmlElement(name = "Prtcptn")
    protected Participation1 prtcptn;
    @XmlElement(name = "AddtlInf")
    protected CommunicationAddress4 addtlInf;

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
    public Seev00800101 setMtgRef(MeetingReference1 value) {
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
    public Seev00800101 setNtifngPty(PartyIdentification7Choice value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityPosition }
     * 
     * 
     */
    public List<SecurityPosition> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the voteRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote2 }
     * 
     * 
     */
    public List<Vote2> getVoteRslt() {
        if (voteRslt == null) {
            voteRslt = new ArrayList<Vote2>();
        }
        return this.voteRslt;
    }

    /**
     * Gets the value of the prtcptn property.
     * 
     * @return
     *     possible object is
     *     {@link Participation1 }
     *     
     */
    public Participation1 getPrtcptn() {
        return prtcptn;
    }

    /**
     * Sets the value of the prtcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participation1 }
     *     
     */
    public Seev00800101 setPrtcptn(Participation1 value) {
        this.prtcptn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress4 }
     *     
     */
    public CommunicationAddress4 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress4 }
     *     
     */
    public Seev00800101 setAddtlInf(CommunicationAddress4 value) {
        this.addtlInf = value;
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

    /**
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public Seev00800101 addScty(SecurityPosition scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the voteRslt list.
     * @see #getVoteRslt()
     * 
     */
    public Seev00800101 addVoteRslt(Vote2 voteRslt) {
        getVoteRslt().add(voteRslt);
        return this;
    }

}
