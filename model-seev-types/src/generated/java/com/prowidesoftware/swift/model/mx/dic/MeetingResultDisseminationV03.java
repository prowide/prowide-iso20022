
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * An issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.
 * Usage
 * The MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.
 * This message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingResultDisseminationV03", propOrder = {
    "id",
    "amdmnt",
    "mtgRef",
    "rptgPty",
    "scty",
    "voteRslt",
    "prtcptn",
    "addtlInf"
})
public class MeetingResultDisseminationV03 {

    @XmlElement(name = "Id", required = true)
    protected MessageIdentification1 id;
    @XmlElement(name = "Amdmnt")
    protected AmendInformation2 amdmnt;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference4 mtgRef;
    @XmlElement(name = "RptgPty", required = true)
    protected PartyIdentification9Choice rptgPty;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition6> scty;
    @XmlElement(name = "VoteRslt", required = true)
    protected List<Vote5> voteRslt;
    @XmlElement(name = "Prtcptn")
    protected Participation3 prtcptn;
    @XmlElement(name = "AddtlInf")
    protected CommunicationAddress4 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingResultDisseminationV03 setId(MessageIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link AmendInformation2 }
     *     
     */
    public AmendInformation2 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInformation2 }
     *     
     */
    public MeetingResultDisseminationV03 setAmdmnt(AmendInformation2 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference4 }
     *     
     */
    public MeetingReference4 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference4 }
     *     
     */
    public MeetingResultDisseminationV03 setMtgRef(MeetingReference4 value) {
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
    public MeetingResultDisseminationV03 setRptgPty(PartyIdentification9Choice value) {
        this.rptgPty = value;
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
     * {@link SecurityPosition6 }
     * 
     * 
     */
    public List<SecurityPosition6> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition6>();
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
     * {@link Vote5 }
     * 
     * 
     */
    public List<Vote5> getVoteRslt() {
        if (voteRslt == null) {
            voteRslt = new ArrayList<Vote5>();
        }
        return this.voteRslt;
    }

    /**
     * Gets the value of the prtcptn property.
     * 
     * @return
     *     possible object is
     *     {@link Participation3 }
     *     
     */
    public Participation3 getPrtcptn() {
        return prtcptn;
    }

    /**
     * Sets the value of the prtcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participation3 }
     *     
     */
    public MeetingResultDisseminationV03 setPrtcptn(Participation3 value) {
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
    public MeetingResultDisseminationV03 setAddtlInf(CommunicationAddress4 value) {
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
    public MeetingResultDisseminationV03 addScty(SecurityPosition6 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the voteRslt list.
     * @see #getVoteRslt()
     * 
     */
    public MeetingResultDisseminationV03 addVoteRslt(Vote5 voteRslt) {
        getVoteRslt().add(voteRslt);
        return this;
    }

}
