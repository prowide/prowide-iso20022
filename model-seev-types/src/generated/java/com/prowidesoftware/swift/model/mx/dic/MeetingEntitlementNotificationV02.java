
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
 * An account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.
 * Usage
 * This message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.
 * This entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.
 * The message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEntitlementNotificationV02", propOrder = {
    "entitlmntNtfctnId",
    "rltdRef",
    "mtgRef",
    "ntifngPty",
    "scty",
    "elgblty"
})
public class MeetingEntitlementNotificationV02 {

    @XmlElement(name = "EntitlmntNtfctnId", required = true)
    protected MessageIdentification1 entitlmntNtfctnId;
    @XmlElement(name = "RltdRef")
    protected MessageIdentification rltdRef;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference3 mtgRef;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification9Choice ntifngPty;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition5> scty;
    @XmlElement(name = "Elgblty", required = true)
    protected EligibilityDates1 elgblty;

    /**
     * Gets the value of the entitlmntNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getEntitlmntNtfctnId() {
        return entitlmntNtfctnId;
    }

    /**
     * Sets the value of the entitlmntNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MeetingEntitlementNotificationV02 setEntitlmntNtfctnId(MessageIdentification1 value) {
        this.entitlmntNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public MeetingEntitlementNotificationV02 setRltdRef(MessageIdentification value) {
        this.rltdRef = value;
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
    public MeetingEntitlementNotificationV02 setMtgRef(MeetingReference3 value) {
        this.mtgRef = value;
        return this;
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
    public MeetingEntitlementNotificationV02 setNtifngPty(PartyIdentification9Choice value) {
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
     * Gets the value of the elgblty property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityDates1 }
     *     
     */
    public EligibilityDates1 getElgblty() {
        return elgblty;
    }

    /**
     * Sets the value of the elgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityDates1 }
     *     
     */
    public MeetingEntitlementNotificationV02 setElgblty(EligibilityDates1 value) {
        this.elgblty = value;
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
    public MeetingEntitlementNotificationV02 addScty(SecurityPosition5 scty) {
        getScty().add(scty);
        return this;
    }

}
