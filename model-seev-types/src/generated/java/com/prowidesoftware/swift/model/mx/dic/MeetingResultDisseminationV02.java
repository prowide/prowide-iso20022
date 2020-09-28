
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
@XmlType(name = "MeetingResultDisseminationV02", propOrder = {
    "mtgRsltDssmntnId",
    "amdmnt",
    "mtgRef",
    "rptgPty",
    "scty",
    "voteRslt",
    "prtcptn",
    "addtlInf"
})
public class MeetingResultDisseminationV02 {

    @XmlElement(name = "MtgRsltDssmntnId", required = true)
    protected MessageIdentification1 mtgRsltDssmntnId;
    @XmlElement(name = "Amdmnt")
    protected AmendInformation2 amdmnt;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference3 mtgRef;
    @XmlElement(name = "RptgPty", required = true)
    protected PartyIdentification9Choice rptgPty;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition5> scty;
    @XmlElement(name = "VoteRslt", required = true)
    protected List<Vote5> voteRslt;
    @XmlElement(name = "Prtcptn")
    protected Participation2 prtcptn;
    @XmlElement(name = "AddtlInf")
    protected CommunicationAddress4 addtlInf;

    /**
     * Gets the value of the mtgRsltDssmntnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMtgRsltDssmntnId() {
        return mtgRsltDssmntnId;
    }

    /**
     * Sets the value of the mtgRsltDssmntnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingResultDisseminationV02 setMtgRsltDssmntnId(MessageIdentification1 value) {
        this.mtgRsltDssmntnId = value;
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
    public MeetingResultDisseminationV02 setAmdmnt(AmendInformation2 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference3 }
     *     
     */
    public MeetingReference3 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference3 }
     *     
     */
    public MeetingResultDisseminationV02 setMtgRef(MeetingReference3 value) {
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
    public MeetingResultDisseminationV02 setRptgPty(PartyIdentification9Choice value) {
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
     * {@link SecurityPosition5 }
     * 
     * 
     */
    public List<SecurityPosition5> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition5>();
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
     *     {@link Participation2 }
     *     
     */
    public Participation2 getPrtcptn() {
        return prtcptn;
    }

    /**
     * Sets the value of the prtcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participation2 }
     *     
     */
    public MeetingResultDisseminationV02 setPrtcptn(Participation2 value) {
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
    public MeetingResultDisseminationV02 setAddtlInf(CommunicationAddress4 value) {
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
    public MeetingResultDisseminationV02 addScty(SecurityPosition5 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the voteRslt list.
     * @see #getVoteRslt()
     * 
     */
    public MeetingResultDisseminationV02 addVoteRslt(Vote5 voteRslt) {
        getVoteRslt().add(voteRslt);
        return this;
    }

}
