
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
 * The MeetingNotification message is used to provide information on the participation of a general meeting, including vote parameters and resolutions.
 * It is sent by an issuer, its agent or an intermediary to another intermediary, to a party holding the right to vote, to a registered security holder or to an ultimate security holder.
 * Usage
 * The MeetingNotification message is sent to notify a new meeting, a change in the meeting parameters or to provide a list of resolutions.
 * To notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.
 * To update the resolutions ie the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.001.001.01", propOrder = {
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
public class Seev00100101 {

    @XmlElement(name = "MtgNtfctnId", required = true)
    protected InstructionIdentification mtgNtfctnId;
    @XmlElement(name = "Amdmnt")
    protected AmendInformation amdmnt;
    @XmlElement(name = "NtfctnSts")
    protected NotificationStatus ntfctnSts;
    @XmlElement(name = "Mtg", required = true)
    protected MeetingNotice1 mtg;
    @XmlElement(name = "MtgDtls", required = true)
    protected List<Meeting1> mtgDtls;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification7Choice ntifngPty;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification7Choice issr;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification7Choice> issrAgt;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition> scty;
    @XmlElement(name = "Rsltn")
    protected List<Resolution1> rsltn;
    @XmlElement(name = "Vote")
    protected VoteParameters vote;
    @XmlElement(name = "EntitlmntSpcfctn")
    protected EntitlementAssessment entitlmntSpcfctn;
    @XmlElement(name = "PwrOfAttnyRqrmnts")
    protected PowerOfAttorneyRequirements1 pwrOfAttnyRqrmnts;

    /**
     * Gets the value of the mtgNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getMtgNtfctnId() {
        return mtgNtfctnId;
    }

    /**
     * Sets the value of the mtgNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00100101 setMtgNtfctnId(InstructionIdentification value) {
        this.mtgNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link AmendInformation }
     *     
     */
    public AmendInformation getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendInformation }
     *     
     */
    public Seev00100101 setAmdmnt(AmendInformation value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatus }
     *     
     */
    public NotificationStatus getNtfctnSts() {
        return ntfctnSts;
    }

    /**
     * Sets the value of the ntfctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatus }
     *     
     */
    public Seev00100101 setNtfctnSts(NotificationStatus value) {
        this.ntfctnSts = value;
        return this;
    }

    /**
     * Gets the value of the mtg property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingNotice1 }
     *     
     */
    public MeetingNotice1 getMtg() {
        return mtg;
    }

    /**
     * Sets the value of the mtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingNotice1 }
     *     
     */
    public Seev00100101 setMtg(MeetingNotice1 value) {
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
     * {@link Meeting1 }
     * 
     * 
     */
    public List<Meeting1> getMtgDtls() {
        if (mtgDtls == null) {
            mtgDtls = new ArrayList<Meeting1>();
        }
        return this.mtgDtls;
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
    public Seev00100101 setNtifngPty(PartyIdentification7Choice value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public PartyIdentification7Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification7Choice }
     *     
     */
    public Seev00100101 setIssr(PartyIdentification7Choice value) {
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
     * {@link PartyIdentification7Choice }
     * 
     * 
     */
    public List<PartyIdentification7Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification7Choice>();
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
     * {@link Resolution1 }
     * 
     * 
     */
    public List<Resolution1> getRsltn() {
        if (rsltn == null) {
            rsltn = new ArrayList<Resolution1>();
        }
        return this.rsltn;
    }

    /**
     * Gets the value of the vote property.
     * 
     * @return
     *     possible object is
     *     {@link VoteParameters }
     *     
     */
    public VoteParameters getVote() {
        return vote;
    }

    /**
     * Sets the value of the vote property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteParameters }
     *     
     */
    public Seev00100101 setVote(VoteParameters value) {
        this.vote = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntSpcfctn property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementAssessment }
     *     
     */
    public EntitlementAssessment getEntitlmntSpcfctn() {
        return entitlmntSpcfctn;
    }

    /**
     * Sets the value of the entitlmntSpcfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementAssessment }
     *     
     */
    public Seev00100101 setEntitlmntSpcfctn(EntitlementAssessment value) {
        this.entitlmntSpcfctn = value;
        return this;
    }

    /**
     * Gets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyRequirements1 }
     *     
     */
    public PowerOfAttorneyRequirements1 getPwrOfAttnyRqrmnts() {
        return pwrOfAttnyRqrmnts;
    }

    /**
     * Sets the value of the pwrOfAttnyRqrmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyRequirements1 }
     *     
     */
    public Seev00100101 setPwrOfAttnyRqrmnts(PowerOfAttorneyRequirements1 value) {
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
    public Seev00100101 addMtgDtls(Meeting1 mtgDtls) {
        getMtgDtls().add(mtgDtls);
        return this;
    }

    /**
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public Seev00100101 addIssrAgt(PartyIdentification7Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public Seev00100101 addScty(SecurityPosition scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the rsltn list.
     * @see #getRsltn()
     * 
     */
    public Seev00100101 addRsltn(Resolution1 rsltn) {
        getRsltn().add(rsltn);
        return this;
    }

}
