
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
 * The MeetingNotification message is sent by a notifying party, for example, an issuer, its agent or an intermediary to another intermediary, a party holding the right to vote, a registered security holder or to a beneficial holder to announce a meeting.
 * Usage
 * The MeetingNotification message is used to announce a meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingNotificationV08", propOrder = {
    "ntfctnGnlInf",
    "ntfctnUpd",
    "evtsLkg",
    "mtg",
    "mtgDtls",
    "issr",
    "issrAgt",
    "scty",
    "rsltn",
    "vote",
    "pwrOfAttnyRqrmnts",
    "addtlInf",
    "splmtryData"
})
public class MeetingNotificationV08 {

    @XmlElement(name = "NtfctnGnlInf", required = true)
    protected NotificationGeneralInformation2 ntfctnGnlInf;
    @XmlElement(name = "NtfctnUpd")
    protected NotificationUpdate2 ntfctnUpd;
    @XmlElement(name = "EvtsLkg")
    protected List<MeetingEventReference1> evtsLkg;
    @XmlElement(name = "Mtg", required = true)
    protected MeetingNotice6 mtg;
    @XmlElement(name = "MtgDtls", required = true)
    protected List<Meeting6> mtgDtls;
    @XmlElement(name = "Issr", required = true)
    protected IssuerInformation3 issr;
    @XmlElement(name = "IssrAgt")
    protected List<IssuerAgent3> issrAgt;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition12> scty;
    @XmlElement(name = "Rsltn")
    protected List<Resolution5> rsltn;
    @XmlElement(name = "Vote")
    protected VoteParameters6 vote;
    @XmlElement(name = "PwrOfAttnyRqrmnts")
    protected PowerOfAttorneyRequirements4 pwrOfAttnyRqrmnts;
    @XmlElement(name = "AddtlInf")
    protected CorporateEventNarrative3 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationGeneralInformation2 }
     *     
     */
    public NotificationGeneralInformation2 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationGeneralInformation2 }
     *     
     */
    public MeetingNotificationV08 setNtfctnGnlInf(NotificationGeneralInformation2 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationUpdate2 }
     *     
     */
    public NotificationUpdate2 getNtfctnUpd() {
        return ntfctnUpd;
    }

    /**
     * Sets the value of the ntfctnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationUpdate2 }
     *     
     */
    public MeetingNotificationV08 setNtfctnUpd(NotificationUpdate2 value) {
        this.ntfctnUpd = value;
        return this;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtsLkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingEventReference1 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<MeetingEventReference1> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the mtg property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotice6 }
     *     
     */
    public MeetingNotice6 getMtg() {
        return mtg;
    }

    /**
     * Sets the value of the mtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotice6 }
     *     
     */
    public MeetingNotificationV08 setMtg(MeetingNotice6 value) {
        this.mtg = value;
        return this;
    }

    /**
     * Gets the value of the mtgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mtgDtls property.
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
     * {@link Meeting6 }
     * 
     * 
     * @return
     *     The value of the mtgDtls property.
     */
    public List<Meeting6> getMtgDtls() {
        if (mtgDtls == null) {
            mtgDtls = new ArrayList<>();
        }
        return this.mtgDtls;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerInformation3 }
     *     
     */
    public IssuerInformation3 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerInformation3 }
     *     
     */
    public MeetingNotificationV08 setIssr(IssuerInformation3 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrAgt property.
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
     * {@link IssuerAgent3 }
     * 
     * 
     * @return
     *     The value of the issrAgt property.
     */
    public List<IssuerAgent3> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scty property.
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
     * @return
     *     The value of the scty property.
     */
    public List<SecurityPosition12> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the rsltn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsltn property.
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
     * {@link Resolution5 }
     * 
     * 
     * @return
     *     The value of the rsltn property.
     */
    public List<Resolution5> getRsltn() {
        if (rsltn == null) {
            rsltn = new ArrayList<>();
        }
        return this.rsltn;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link VoteParameters6 }
     *     
     */
    public VoteParameters6 getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteParameters6 }
     *     
     */
    public MeetingNotificationV08 setVote(VoteParameters6 value) {
        this.vote = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyRequirements4 }
     *     
     */
    public PowerOfAttorneyRequirements4 getPwrOfAttnyRqrmnts() {
        return pwrOfAttnyRqrmnts;
    }

    /**
     * Sets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyRequirements4 }
     *     
     */
    public MeetingNotificationV08 setPwrOfAttnyRqrmnts(PowerOfAttorneyRequirements4 value) {
        this.pwrOfAttnyRqrmnts = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateEventNarrative3 }
     *     
     */
    public CorporateEventNarrative3 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateEventNarrative3 }
     *     
     */
    public MeetingNotificationV08 setAddtlInf(CorporateEventNarrative3 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public MeetingNotificationV08 addEvtsLkg(MeetingEventReference1 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the mtgDtls list.
     * @see #getMtgDtls()
     * 
     */
    public MeetingNotificationV08 addMtgDtls(Meeting6 mtgDtls) {
        getMtgDtls().add(mtgDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public MeetingNotificationV08 addIssrAgt(IssuerAgent3 issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public MeetingNotificationV08 addScty(SecurityPosition12 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the rsltn list.
     * @see #getRsltn()
     * 
     */
    public MeetingNotificationV08 addRsltn(Resolution5 rsltn) {
        getRsltn().add(rsltn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingNotificationV08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
