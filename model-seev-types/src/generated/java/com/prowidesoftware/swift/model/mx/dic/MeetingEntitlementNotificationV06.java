
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
 * The MeetingEntitlementNotification is sent by an account servicer to the account owner to advise the entitlement in relation to a meeting.
 * Usage
 * This message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place. The message is also used to amend a previously sent MeetingEntitlementNotification. 
 * The MeetingEntitlementNotification message may be sent either before receiving a voting instruction to confirm the entitlement; or after having received a voting instruction to confirm details of the person attending the meeting. 
 * The message may also be used in place of an attendance card or to confirm entitlements in case of bearer shares.
 * This message definition is intended for use with the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEntitlementNotificationV06", propOrder = {
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
public class MeetingEntitlementNotificationV06 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationType2Code ntfctnTp;
    @XmlElement(name = "PrvsEntitlmntNtfctnId")
    protected String prvsEntitlmntNtfctnId;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference8 mtgRef;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification129Choice issr;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition11> scty;
    @XmlElement(name = "Elgblty", required = true)
    protected EligibilityDates1 elgblty;
    @XmlElement(name = "MtgAttndee")
    protected PartyIdentification223Choice mtgAttndee;
    @XmlElement(name = "Prxy")
    protected PartyIdentification223Choice prxy;
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
    public MeetingEntitlementNotificationV06 setNtfctnTp(NotificationType2Code value) {
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
    public MeetingEntitlementNotificationV06 setPrvsEntitlmntNtfctnId(String value) {
        this.prvsEntitlmntNtfctnId = value;
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
    public MeetingEntitlementNotificationV06 setMtgRef(MeetingReference8 value) {
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
    public MeetingEntitlementNotificationV06 setIssr(PartyIdentification129Choice value) {
        this.issr = value;
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
     * {@link SecurityPosition11 }
     * 
     * 
     */
    public List<SecurityPosition11> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition11>();
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
    public MeetingEntitlementNotificationV06 setElgblty(EligibilityDates1 value) {
        this.elgblty = value;
        return this;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification223Choice }
     *     
     */
    public PartyIdentification223Choice getMtgAttndee() {
        return mtgAttndee;
    }

    /**
     * Sets the value of the mtgAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification223Choice }
     *     
     */
    public MeetingEntitlementNotificationV06 setMtgAttndee(PartyIdentification223Choice value) {
        this.mtgAttndee = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification223Choice }
     *     
     */
    public PartyIdentification223Choice getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification223Choice }
     *     
     */
    public MeetingEntitlementNotificationV06 setPrxy(PartyIdentification223Choice value) {
        this.prxy = value;
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
    public MeetingEntitlementNotificationV06 addScty(SecurityPosition11 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingEntitlementNotificationV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
