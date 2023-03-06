
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Scope
 * The MeetingResultDissemination message is sent by an issuer, its agent or an intermediary to another intermediary, a party holding the right to vote, a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.
 * Usage
 * The MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.
 * This message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingResultDisseminationV07", propOrder = {
    "mtgRsltsDssmntnTp",
    "prvsMtgRsltsDssmntnId",
    "mtgRef",
    "scty",
    "voteRslt",
    "prtcptn",
    "addtlInf",
    "splmtryData"
})
public class MeetingResultDisseminationV07 {

    @XmlElement(name = "MtgRsltsDssmntnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType2Code mtgRsltsDssmntnTp;
    @XmlElement(name = "PrvsMtgRsltsDssmntnId")
    protected String prvsMtgRsltsDssmntnId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition12> scty;
    @XmlElement(name = "VoteRslt", required = true)
    protected List<Vote16> voteRslt;
    @XmlElement(name = "Prtcptn")
    protected Participation5 prtcptn;
    @XmlElement(name = "AddtlInf")
    protected CommunicationAddress11 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the mtgRsltsDssmntnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType2Code }
     *     
     */
    public NotificationType2Code getMtgRsltsDssmntnTp() {
        return mtgRsltsDssmntnTp;
    }

    /**
     * Sets the value of the mtgRsltsDssmntnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType2Code }
     *     
     */
    public MeetingResultDisseminationV07 setMtgRsltsDssmntnTp(NotificationType2Code value) {
        this.mtgRsltsDssmntnTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsMtgRsltsDssmntnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsMtgRsltsDssmntnId() {
        return prvsMtgRsltsDssmntnId;
    }

    /**
     * Sets the value of the prvsMtgRsltsDssmntnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingResultDisseminationV07 setPrvsMtgRsltsDssmntnId(String value) {
        this.prvsMtgRsltsDssmntnId = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference10 }
     *     
     */
    public MeetingReference10 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference10 }
     *     
     */
    public MeetingResultDisseminationV07 setMtgRef(MeetingReference10 value) {
        this.mtgRef = value;
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
     * {@link SecurityPosition12 }
     * 
     * 
     */
    public List<SecurityPosition12> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition12>();
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
     * {@link Vote16 }
     * 
     * 
     */
    public List<Vote16> getVoteRslt() {
        if (voteRslt == null) {
            voteRslt = new ArrayList<Vote16>();
        }
        return this.voteRslt;
    }

    /**
     * Gets the value of the prtcptn property.
     * 
     * @return
     *     possible object is
     *     {@link Participation5 }
     *     
     */
    public Participation5 getPrtcptn() {
        return prtcptn;
    }

    /**
     * Sets the value of the prtcptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participation5 }
     *     
     */
    public MeetingResultDisseminationV07 setPrtcptn(Participation5 value) {
        this.prtcptn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public CommunicationAddress11 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress11 }
     *     
     */
    public MeetingResultDisseminationV07 setAddtlInf(CommunicationAddress11 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
    public MeetingResultDisseminationV07 addScty(SecurityPosition12 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the voteRslt list.
     * @see #getVoteRslt()
     * 
     */
    public MeetingResultDisseminationV07 addVoteRslt(Vote16 voteRslt) {
        getVoteRslt().add(voteRslt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingResultDisseminationV07 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
