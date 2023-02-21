
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
 * A notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.
 * Usage
 * The MeetingNotification message is used to announce a shareholders meeting, ie, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.
 * To notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.
 * To update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotificationV02", propOrder = {
    "mtgNtfctnId",
    "amdmnt",
    "ntfctnSts",
    "mtg",
    "mtgDtls",
    "ntifngPty",
    "issr",
    "issrAgt",
    "scty",
    "rsltn",
    "vote",
    "entitlmntSpcfctn",
    "pwrOfAttnyRqrmnts"
})
public class MeetingNotificationV02 {

    @XmlElement(name = "MtgNtfctnId", required = true)
    protected MessageIdentification1 mtgNtfctnId;
    @XmlElement(name = "Amdmnt")
    protected AmendInformation1 amdmnt;
    @XmlElement(name = "NtfctnSts", required = true)
    protected NotificationStatus1 ntfctnSts;
    @XmlElement(name = "Mtg", required = true)
    protected MeetingNotice2 mtg;
    @XmlElement(name = "MtgDtls", required = true)
    protected List<Meeting2> mtgDtls;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification9Choice ntifngPty;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification9Choice issr;
    @XmlElement(name = "IssrAgt")
    protected List<IssuerAgent1> issrAgt;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition5> scty;
    @XmlElement(name = "Rsltn")
    protected List<Resolution2> rsltn;
    @XmlElement(name = "Vote")
    protected VoteParameters1 vote;
    @XmlElement(name = "EntitlmntSpcfctn", required = true)
    protected EntitlementAssessment1 entitlmntSpcfctn;
    @XmlElement(name = "PwrOfAttnyRqrmnts")
    protected PowerOfAttorneyRequirements2 pwrOfAttnyRqrmnts;

    /**
     * Gets the value of the mtgNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMtgNtfctnId() {
        return mtgNtfctnId;
    }

    /**
     * Sets the value of the mtgNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingNotificationV02 setMtgNtfctnId(MessageIdentification1 value) {
        this.mtgNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link AmendInformation1 }
     *     
     */
    public AmendInformation1 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInformation1 }
     *     
     */
    public MeetingNotificationV02 setAmdmnt(AmendInformation1 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus1 }
     *     
     */
    public NotificationStatus1 getNtfctnSts() {
        return ntfctnSts;
    }

    /**
     * Sets the value of the ntfctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus1 }
     *     
     */
    public MeetingNotificationV02 setNtfctnSts(NotificationStatus1 value) {
        this.ntfctnSts = value;
        return this;
    }

    /**
     * Gets the value of the mtg property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotice2 }
     *     
     */
    public MeetingNotice2 getMtg() {
        return mtg;
    }

    /**
     * Sets the value of the mtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotice2 }
     *     
     */
    public MeetingNotificationV02 setMtg(MeetingNotice2 value) {
        this.mtg = value;
        return this;
    }

    /**
     * Gets the value of the mtgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meeting2 }
     * 
     * 
     */
    public List<Meeting2> getMtgDtls() {
        if (mtgDtls == null) {
            mtgDtls = new ArrayList<Meeting2>();
        }
        return this.mtgDtls;
    }

    /**
     * Gets the value of the ntifngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Sets the value of the ntifngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingNotificationV02 setNtifngPty(PartyIdentification9Choice value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public MeetingNotificationV02 setIssr(PartyIdentification9Choice value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerAgent1 }
     * 
     * 
     */
    public List<IssuerAgent1> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<IssuerAgent1>();
        }
        return this.issrAgt;
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
     * Gets the value of the rsltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsltn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsltn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolution2 }
     * 
     * 
     */
    public List<Resolution2> getRsltn() {
        if (rsltn == null) {
            rsltn = new ArrayList<Resolution2>();
        }
        return this.rsltn;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link VoteParameters1 }
     *     
     */
    public VoteParameters1 getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteParameters1 }
     *     
     */
    public MeetingNotificationV02 setVote(VoteParameters1 value) {
        this.vote = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntSpcfctn property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementAssessment1 }
     *     
     */
    public EntitlementAssessment1 getEntitlmntSpcfctn() {
        return entitlmntSpcfctn;
    }

    /**
     * Sets the value of the entitlmntSpcfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementAssessment1 }
     *     
     */
    public MeetingNotificationV02 setEntitlmntSpcfctn(EntitlementAssessment1 value) {
        this.entitlmntSpcfctn = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyRequirements2 }
     *     
     */
    public PowerOfAttorneyRequirements2 getPwrOfAttnyRqrmnts() {
        return pwrOfAttnyRqrmnts;
    }

    /**
     * Sets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyRequirements2 }
     *     
     */
    public MeetingNotificationV02 setPwrOfAttnyRqrmnts(PowerOfAttorneyRequirements2 value) {
        this.pwrOfAttnyRqrmnts = value;
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
     * Adds a new item to the mtgDtls list.
     * @see #getMtgDtls()
     * 
     */
    public MeetingNotificationV02 addMtgDtls(Meeting2 mtgDtls) {
        getMtgDtls().add(mtgDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public MeetingNotificationV02 addIssrAgt(IssuerAgent1 issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public MeetingNotificationV02 addScty(SecurityPosition5 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the rsltn list.
     * @see #getRsltn()
     * 
     */
    public MeetingNotificationV02 addRsltn(Resolution2 rsltn) {
        getRsltn().add(rsltn);
        return this;
    }

}
