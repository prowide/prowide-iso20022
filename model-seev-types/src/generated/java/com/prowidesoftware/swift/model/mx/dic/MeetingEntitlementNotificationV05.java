
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
 * This message definition is intended for use with the Business Application Header (head.001.001.01).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEntitlementNotificationV05", propOrder = {
    "rltdRef",
    "mtgRef",
    "scty",
    "elgblty",
    "splmtryData"
})
public class MeetingEntitlementNotificationV05 {

    @XmlElement(name = "RltdRef")
    protected MessageIdentification rltdRef;
    @XmlElement(name = "MtgRef", required = true)
    protected MeetingReference7 mtgRef;
    @XmlElement(name = "Scty", required = true)
    protected List<SecurityPosition9> scty;
    @XmlElement(name = "Elgblty", required = true)
    protected EligibilityDates1 elgblty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public MeetingEntitlementNotificationV05 setRltdRef(MessageIdentification value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the mtgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingReference7 }
     *     
     */
    public MeetingReference7 getMtgRef() {
        return mtgRef;
    }

    /**
     * Sets the value of the mtgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingReference7 }
     *     
     */
    public MeetingEntitlementNotificationV05 setMtgRef(MeetingReference7 value) {
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
     * {@link SecurityPosition9 }
     * 
     * 
     */
    public List<SecurityPosition9> getScty() {
        if (scty == null) {
            scty = new ArrayList<SecurityPosition9>();
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
    public MeetingEntitlementNotificationV05 setElgblty(EligibilityDates1 value) {
        this.elgblty = value;
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
    public MeetingEntitlementNotificationV05 addScty(SecurityPosition9 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MeetingEntitlementNotificationV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
