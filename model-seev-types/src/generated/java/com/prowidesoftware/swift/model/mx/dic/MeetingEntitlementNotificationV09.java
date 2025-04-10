
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
 * The MeetingEntitlementNotification is sent by an account servicer to the account owner to advise the entitlement in relation to a meeting.
 * Usage
 * This message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place. The message is also used to amend a previously sent MeetingEntitlementNotification. 
 * The MeetingEntitlementNotification message may be sent either before receiving a voting instruction to confirm the entitlement; or after having received a voting instruction to confirm details of the person attending the meeting. 
 * The message may also be used in place of an attendance card or to confirm entitlements in the case of bearer shares.
 * This message definition is intended for use with the Business Application Header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEntitlementNotificationV09", propOrder = {
    "ntfctnTp",
    "prvsEntitlmntNtfctnId",
    "mtgRef",
    "issr",
    "scty",
    "elgblty",
    "mtgAttndee",
    "prxy",
    "splmtryData"
})
public class MeetingEntitlementNotificationV09 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType2Code ntfctnTp;
    @XmlElement(name = "PrvsEntitlmntNtfctnId")
    protected String prvsEntitlmntNtfctnId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference10 mtgRef;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification129Choice issr;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition18> scty;
    @XmlElement(name = "Elgblty", required = true)
    protected EligibilityDates1 elgblty;
    @XmlElement(name = "MtgAttndee")
    protected PartyIdentification232Choice mtgAttndee;
    @XmlElement(name = "Prxy")
    protected PartyIdentification232Choice prxy;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType2Code }
     *     
     */
    public NotificationType2Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType2Code }
     *     
     */
    public MeetingEntitlementNotificationV09 setNtfctnTp(NotificationType2Code value) {
        this.ntfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the prvsEntitlmntNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsEntitlmntNtfctnId() {
        return prvsEntitlmntNtfctnId;
    }

    /**
     * Sets the value of the prvsEntitlmntNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingEntitlementNotificationV09 setPrvsEntitlmntNtfctnId(String value) {
        this.prvsEntitlmntNtfctnId = value;
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
    public MeetingEntitlementNotificationV09 setMtgRef(MeetingReference10 value) {
        this.mtgRef = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public MeetingEntitlementNotificationV09 setIssr(PartyIdentification129Choice value) {
        this.issr = value;
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
     * {@link SecurityPosition18 }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<SecurityPosition18> getScty() {
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
    public MeetingEntitlementNotificationV09 setElgblty(EligibilityDates1 value) {
        this.elgblty = value;
        return this;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getMtgAttndee() {
        return mtgAttndee;
    }

    /**
     * Sets the value of the mtgAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public MeetingEntitlementNotificationV09 setMtgAttndee(PartyIdentification232Choice value) {
        this.mtgAttndee = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public MeetingEntitlementNotificationV09 setPrxy(PartyIdentification232Choice value) {
        this.prxy = value;
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
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public MeetingEntitlementNotificationV09 addScty(SecurityPosition18 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingEntitlementNotificationV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
