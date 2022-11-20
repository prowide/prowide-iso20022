
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 * This message definition is intended for use with the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingResultDisseminationV06", propOrder = {
    "mtgRsltsDssmntnTp",
    "prvsMtgRsltsDssmntnId",
    "mtgRef",
    "scty",
    "voteRslt",
    "prtcptn",
    "addtlInf",
    "splmtryData"
})
public class MeetingResultDisseminationV06 {

    @XmlElement(name = "MtgRsltsDssmntnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType2Code mtgRsltsDssmntnTp;
    @XmlElement(name = "PrvsMtgRsltsDssmntnId")
    protected String prvsMtgRsltsDssmntnId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference8 mtgRef;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition10> scty;
    @XmlElement(name = "VoteRslt", required = true)
    protected List<Vote12> voteRslt;
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
    public MeetingResultDisseminationV06 setMtgRsltsDssmntnTp(NotificationType2Code value) {
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
    public MeetingResultDisseminationV06 setPrvsMtgRsltsDssmntnId(String value) {
        this.prvsMtgRsltsDssmntnId = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference8 }
     *     
     */
    public MeetingReference8 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference8 }
     *     
     */
    public MeetingResultDisseminationV06 setMtgRef(MeetingReference8 value) {
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
     * {@link SecurityPosition10 }
     * 
     * 
     */
    public List<SecurityPosition10> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition10>();
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
     * {@link Vote12 }
     * 
     * 
     */
    public List<Vote12> getVoteRslt() {
        if (voteRslt == null) {
            voteRslt = new ArrayList<Vote12>();
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
    public MeetingResultDisseminationV06 setPrtcptn(Participation5 value) {
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
    public MeetingResultDisseminationV06 setAddtlInf(CommunicationAddress11 value) {
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
    public MeetingResultDisseminationV06 addScty(SecurityPosition10 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the voteRslt list.
     * @see #getVoteRslt()
     * 
     */
    public MeetingResultDisseminationV06 addVoteRslt(Vote12 voteRslt) {
        getVoteRslt().add(voteRslt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingResultDisseminationV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
