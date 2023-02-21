
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
 * The MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.
 * To notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.
 * To update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotificationV03", propOrder = {
    "id",
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
public class MeetingNotificationV03 {

    @XmlElement(name = "Id", required = true)
    protected MessageIdentification1 id;
    @XmlElement(name = "Amdmnt")
    protected AmendInformation1 amdmnt;
    @XmlElement(name = "NtfctnSts", required = true)
    protected NotificationStatus1 ntfctnSts;
    @XmlElement(name = "Mtg", required = true)
    protected MeetingNotice3 mtg;
    @XmlElement(name = "MtgDtls", required = true)
    protected List<Meeting3> mtgDtls;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification9Choice ntifngPty;
    @XmlElement(name = "Issr", required = true)
    protected IssuerInformation1 issr;
    @XmlElement(name = "IssrAgt")
    protected List<IssuerAgent1> issrAgt;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition6> scty;
    @XmlElement(name = "Rsltn")
    protected List<Resolution2> rsltn;
    @XmlElement(name = "Vote")
    protected VoteParameters2 vote;
    @XmlElement(name = "EntitlmntSpcfctn", required = true)
    protected EntitlementAssessment2 entitlmntSpcfctn;
    @XmlElement(name = "PwrOfAttnyRqrmnts")
    protected PowerOfAttorneyRequirements2 pwrOfAttnyRqrmnts;

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
    public MeetingNotificationV03 setId(MessageIdentification1 value) {
        this.id = value;
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
    public MeetingNotificationV03 setAmdmnt(AmendInformation1 value) {
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
    public MeetingNotificationV03 setNtfctnSts(NotificationStatus1 value) {
        this.ntfctnSts = value;
        return this;
    }

    /**
     * Gets the value of the mtg property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotice3 }
     *     
     */
    public MeetingNotice3 getMtg() {
        return mtg;
    }

    /**
     * Sets the value of the mtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotice3 }
     *     
     */
    public MeetingNotificationV03 setMtg(MeetingNotice3 value) {
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
     * {@link Meeting3 }
     * 
     * 
     */
    public List<Meeting3> getMtgDtls() {
        if (mtgDtls == null) {
            mtgDtls = new ArrayList<Meeting3>();
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
    public MeetingNotificationV03 setNtifngPty(PartyIdentification9Choice value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInformation1 }
     *     
     */
    public IssuerInformation1 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInformation1 }
     *     
     */
    public MeetingNotificationV03 setIssr(IssuerInformation1 value) {
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
     *     {@link VoteParameters2 }
     *     
     */
    public VoteParameters2 getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteParameters2 }
     *     
     */
    public MeetingNotificationV03 setVote(VoteParameters2 value) {
        this.vote = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntSpcfctn property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementAssessment2 }
     *     
     */
    public EntitlementAssessment2 getEntitlmntSpcfctn() {
        return entitlmntSpcfctn;
    }

    /**
     * Sets the value of the entitlmntSpcfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementAssessment2 }
     *     
     */
    public MeetingNotificationV03 setEntitlmntSpcfctn(EntitlementAssessment2 value) {
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
    public MeetingNotificationV03 setPwrOfAttnyRqrmnts(PowerOfAttorneyRequirements2 value) {
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
    public MeetingNotificationV03 addMtgDtls(Meeting3 mtgDtls) {
        getMtgDtls().add(mtgDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public MeetingNotificationV03 addIssrAgt(IssuerAgent1 issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public MeetingNotificationV03 addScty(SecurityPosition6 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the rsltn list.
     * @see #getRsltn()
     * 
     */
    public MeetingNotificationV03 addRsltn(Resolution2 rsltn) {
        getRsltn().add(rsltn);
        return this;
    }

}
