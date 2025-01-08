
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
 * The MeetingEntitlementNotification message is sent by an account servicer to advise the entitlement of an account owner or of a voting rights holder in relation to a general meeting.
 * Usage
 * This message is sent to advise the number of securities held by an account owner. The balance is specified for the securities for which a general meeting is taking place. The message is sent by the account servicer or the registrar to the account owner, an intermediary or the issuer's agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seev.003.001.01", propOrder = {
    "entitlmntNtfctnId",
    "rltdRef",
    "ntfctnSts",
    "mtgRef",
    "ntifngPty",
    "scty",
    "elgblty"
})
public class Seev00300101 {

    @XmlElement(name = "EntitlmntNtfctnId", required = true)
    protected InstructionIdentification entitlmntNtfctnId;
    @XmlElement(name = "RltdRef")
    protected InstructionIdentification rltdRef;
    @XmlElement(name = "NtfctnSts")
    protected NotificationStatus ntfctnSts;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference1 mtgRef;
    @XmlElement(name = "NtifngPty", required = true)
    protected PartyIdentification7Choice ntifngPty;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition> scty;
    @XmlElement(name = "Elgblty", required = true)
    protected EligibilityDates elgblty;

    /**
     * Gets the value of the entitlmntNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getEntitlmntNtfctnId() {
        return entitlmntNtfctnId;
    }

    /**
     * Sets the value of the entitlmntNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00300101 setEntitlmntNtfctnId(InstructionIdentification value) {
        this.entitlmntNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIdentification }
     *     
     */
    public InstructionIdentification getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIdentification }
     *     
     */
    public Seev00300101 setRltdRef(InstructionIdentification value) {
        this.rltdRef = value;
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
    public Seev00300101 setNtfctnSts(NotificationStatus value) {
        this.ntfctnSts = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference1 }
     *     
     */
    public MeetingReference1 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference1 }
     *     
     */
    public Seev00300101 setMtgRef(MeetingReference1 value) {
        this.mtgRef = value;
        return this;
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
    public Seev00300101 setNtifngPty(PartyIdentification7Choice value) {
        this.ntifngPty = value;
        return this;
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
     * {@link SecurityPosition }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<SecurityPosition> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the elgblty property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityDates }
     *     
     */
    public EligibilityDates getElgblty() {
        return elgblty;
    }

    /**
     * Sets the value of the elgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityDates }
     *     
     */
    public Seev00300101 setElgblty(EligibilityDates value) {
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
    public Seev00300101 addScty(SecurityPosition scty) {
        getScty().add(scty);
        return this;
    }

}
