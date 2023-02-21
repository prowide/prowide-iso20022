
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The ParticipantStatusNotification message is sent by a participant within a payment system to their counter-party to notify the occurrence of a change in their operational status and in the operational status of participants that they may service.
 * Usage
 * The message can be used by a participant within a payment system to inform their counterpart participants of a change in their status in the system, for example as notification that the participant plans to be off-line or is currently flooded with messages.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantStatusNotificationV01", propOrder = {
    "msgId",
    "creDtTm",
    "ntifngPtcpt",
    "ptcptAndSts",
    "splmtryData"
})
public class ParticipantStatusNotificationV01 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NtifngPtcpt", required = true)
    protected FinancialInstitutionIdentification13 ntifngPtcpt;
    @XmlElement(name = "PtcptAndSts", required = true)
    protected List<ParticipantAndStatus1> ptcptAndSts;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantStatusNotificationV01 setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantStatusNotificationV01 setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ntifngPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification13 }
     *     
     */
    public FinancialInstitutionIdentification13 getNtifngPtcpt() {
        return ntifngPtcpt;
    }

    /**
     * Sets the value of the ntifngPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification13 }
     *     
     */
    public ParticipantStatusNotificationV01 setNtifngPtcpt(FinancialInstitutionIdentification13 value) {
        this.ntifngPtcpt = value;
        return this;
    }

    /**
     * Gets the value of the ptcptAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcptAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcptAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantAndStatus1 }
     * 
     * 
     */
    public List<ParticipantAndStatus1> getPtcptAndSts() {
        if (ptcptAndSts == null) {
            ptcptAndSts = new ArrayList<ParticipantAndStatus1>();
        }
        return this.ptcptAndSts;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Sets the value of the splmtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public ParticipantStatusNotificationV01 setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
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
     * Adds a new item to the ptcptAndSts list.
     * @see #getPtcptAndSts()
     * 
     */
    public ParticipantStatusNotificationV01 addPtcptAndSts(ParticipantAndStatus1 ptcptAndSts) {
        getPtcptAndSts().add(ptcptAndSts);
        return this;
    }

}
