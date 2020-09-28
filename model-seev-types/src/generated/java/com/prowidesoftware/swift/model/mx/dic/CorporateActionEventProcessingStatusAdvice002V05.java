
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
 * An account servicer sends the CorporateActionEventProcessingStatusAdvice message to an account owner or its designated agent to report processing status of a corporate action event.
 * The account servicer uses this message to provide a reason as to why a corporate action event has not been completed by the announced payment dates.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate), 
 * using the relevant elements in the business application header (BAH).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventProcessingStatusAdvice002V05", propOrder = {
    "ntfctnId",
    "othrDocId",
    "corpActnGnlInf",
    "evtPrcgSts",
    "addtlInf",
    "splmtryData"
})
public class CorporateActionEventProcessingStatusAdvice002V05 {

    @XmlElement(name = "NtfctnId")
    protected DocumentIdentification17 ntfctnId;
    @XmlElement(name = "OthrDocId")
    protected List<DocumentIdentification34> othrDocId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation94 corpActnGnlInf;
    @XmlElement(name = "EvtPrcgSts", required = true)
    protected List<EventProcessingStatus4Choice> evtPrcgSts;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative19 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public DocumentIdentification17 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification17 }
     *     
     */
    public CorporateActionEventProcessingStatusAdvice002V05 setNtfctnId(DocumentIdentification17 value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the othrDocId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrDocId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification34 }
     * 
     * 
     */
    public List<DocumentIdentification34> getOthrDocId() {
        if (othrDocId == null) {
            othrDocId = new ArrayList<DocumentIdentification34>();
        }
        return this.othrDocId;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation94 }
     *     
     */
    public CorporateActionGeneralInformation94 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation94 }
     *     
     */
    public CorporateActionEventProcessingStatusAdvice002V05 setCorpActnGnlInf(CorporateActionGeneralInformation94 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the evtPrcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtPrcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventProcessingStatus4Choice }
     * 
     * 
     */
    public List<EventProcessingStatus4Choice> getEvtPrcgSts() {
        if (evtPrcgSts == null) {
            evtPrcgSts = new ArrayList<EventProcessingStatus4Choice>();
        }
        return this.evtPrcgSts;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative19 }
     *     
     */
    public CorporateActionNarrative19 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative19 }
     *     
     */
    public CorporateActionEventProcessingStatusAdvice002V05 setAddtlInf(CorporateActionNarrative19 value) {
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
     * Adds a new item to the othrDocId list.
     * @see #getOthrDocId()
     * 
     */
    public CorporateActionEventProcessingStatusAdvice002V05 addOthrDocId(DocumentIdentification34 othrDocId) {
        getOthrDocId().add(othrDocId);
        return this;
    }

    /**
     * Adds a new item to the evtPrcgSts list.
     * @see #getEvtPrcgSts()
     * 
     */
    public CorporateActionEventProcessingStatusAdvice002V05 addEvtPrcgSts(EventProcessingStatus4Choice evtPrcgSts) {
        getEvtPrcgSts().add(evtPrcgSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CorporateActionEventProcessingStatusAdvice002V05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
