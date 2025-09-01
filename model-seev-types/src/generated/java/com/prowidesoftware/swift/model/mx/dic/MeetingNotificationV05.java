
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
 * A notifying party, for example, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.
 * Usage
 * The MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.
 * To notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.
 * To update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.
 * This message definition is intended for use with the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotificationV05", propOrder = {
    "amdmnt",
    "ntfctnSts",
    "mtg",
    "mtgDtls",
    "issr",
    "issrAgt",
    "scty",
    "rsltn",
    "vote",
    "entitlmntSpcfctn",
    "pwrOfAttnyRqrmnts",
    "addtlInf",
    "splmtryData"
})
public class MeetingNotificationV05 {

    @XmlElement(name = "Amdmnt")
    protected AmendInformation1 amdmnt;
    @XmlElement(name = "NtfctnSts", required = true)
    protected NotificationStatus2 ntfctnSts;
    @XmlElement(name = "Mtg", required = true)
    protected MeetingNotice4 mtg;
    @XmlElement(name = "MtgDtls", required = true)
    protected List<Meeting4> mtgDtls;
    @XmlElement(name = "Issr", required = true)
    protected IssuerInformation2 issr;
    @XmlElement(name = "IssrAgt")
    protected List<IssuerAgent2> issrAgt;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition8> scty;
    @XmlElement(name = "Rsltn")
    protected List<Resolution3> rsltn;
    @XmlElement(name = "Vote")
    protected VoteParameters4 vote;
    @XmlElement(name = "EntitlmntSpcfctn")
    protected EntitlementAssessment3 entitlmntSpcfctn;
    @XmlElement(name = "PwrOfAttnyRqrmnts")
    protected PowerOfAttorneyRequirements3 pwrOfAttnyRqrmnts;
    @XmlElement(name = "AddtlInf")
    protected CorporateEventNarrative2 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public MeetingNotificationV05 setAmdmnt(AmendInformation1 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus2 }
     *     
     */
    public NotificationStatus2 getNtfctnSts() {
        return ntfctnSts;
    }

    /**
     * Sets the value of the ntfctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus2 }
     *     
     */
    public MeetingNotificationV05 setNtfctnSts(NotificationStatus2 value) {
        this.ntfctnSts = value;
        return this;
    }

    /**
     * Gets the value of the mtg property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotice4 }
     *     
     */
    public MeetingNotice4 getMtg() {
        return mtg;
    }

    /**
     * Sets the value of the mtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotice4 }
     *     
     */
    public MeetingNotificationV05 setMtg(MeetingNotice4 value) {
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
     * {@link Meeting4 }
     * 
     * 
     */
    public List<Meeting4> getMtgDtls() {
        if (mtgDtls == null) {
            mtgDtls = new ArrayList<Meeting4>();
        }
        return this.mtgDtls;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInformation2 }
     *     
     */
    public IssuerInformation2 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInformation2 }
     *     
     */
    public MeetingNotificationV05 setIssr(IssuerInformation2 value) {
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
     * {@link IssuerAgent2 }
     * 
     * 
     */
    public List<IssuerAgent2> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<IssuerAgent2>();
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
     * {@link SecurityPosition8 }
     * 
     * 
     */
    public List<SecurityPosition8> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition8>();
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
     * {@link Resolution3 }
     * 
     * 
     */
    public List<Resolution3> getRsltn() {
        if (rsltn == null) {
            rsltn = new ArrayList<Resolution3>();
        }
        return this.rsltn;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link VoteParameters4 }
     *     
     */
    public VoteParameters4 getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteParameters4 }
     *     
     */
    public MeetingNotificationV05 setVote(VoteParameters4 value) {
        this.vote = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntSpcfctn property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementAssessment3 }
     *     
     */
    public EntitlementAssessment3 getEntitlmntSpcfctn() {
        return entitlmntSpcfctn;
    }

    /**
     * Sets the value of the entitlmntSpcfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementAssessment3 }
     *     
     */
    public MeetingNotificationV05 setEntitlmntSpcfctn(EntitlementAssessment3 value) {
        this.entitlmntSpcfctn = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyRequirements3 }
     *     
     */
    public PowerOfAttorneyRequirements3 getPwrOfAttnyRqrmnts() {
        return pwrOfAttnyRqrmnts;
    }

    /**
     * Sets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyRequirements3 }
     *     
     */
    public MeetingNotificationV05 setPwrOfAttnyRqrmnts(PowerOfAttorneyRequirements3 value) {
        this.pwrOfAttnyRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateEventNarrative2 }
     *     
     */
    public CorporateEventNarrative2 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateEventNarrative2 }
     *     
     */
    public MeetingNotificationV05 setAddtlInf(CorporateEventNarrative2 value) {
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
     * Adds a new item to the mtgDtls list.
     * @see #getMtgDtls()
     * 
     */
    public MeetingNotificationV05 addMtgDtls(Meeting4 mtgDtls) {
        getMtgDtls().add(mtgDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public MeetingNotificationV05 addIssrAgt(IssuerAgent2 issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public MeetingNotificationV05 addScty(SecurityPosition8 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the rsltn list.
     * @see #getRsltn()
     * 
     */
    public MeetingNotificationV05 addRsltn(Resolution3 rsltn) {
        getRsltn().add(rsltn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingNotificationV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
