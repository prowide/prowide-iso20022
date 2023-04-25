
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
 * The ParticipantProfileReport message is sent by the CBR payment system to the participant, upon participant's request. 
 * Usage
 * The message can contain either full participant profile report (National BIC Directory) or only changes to the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantProfileReportV01", propOrder = {
    "msgHdr",
    "creRsn",
    "rptId",
    "rptPgntn",
    "drctryNtry",
    "splmtryData"
})
public class ParticipantProfileReportV01 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader3 msgHdr;
    @XmlElement(name = "CreRsn", required = true)
    protected String creRsn;
    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptPgntn")
    protected Pagination rptPgntn;
    @XmlElement(name = "DrctryNtry", required = true)
    protected List<DirectoryEntry1> drctryNtry;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader3 }
     *     
     */
    public MessageHeader3 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader3 }
     *     
     */
    public ParticipantProfileReportV01 setMsgHdr(MessageHeader3 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the creRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreRsn() {
        return creRsn;
    }

    /**
     * Sets the value of the creRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantProfileReportV01 setCreRsn(String value) {
        this.creRsn = value;
        return this;
    }

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ParticipantProfileReportV01 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getRptPgntn() {
        return rptPgntn;
    }

    /**
     * Sets the value of the rptPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public ParticipantProfileReportV01 setRptPgntn(Pagination value) {
        this.rptPgntn = value;
        return this;
    }

    /**
     * Gets the value of the drctryNtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drctryNtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctryNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectoryEntry1 }
     * 
     * 
     * @return
     *     The value of the drctryNtry property.
     */
    public List<DirectoryEntry1> getDrctryNtry() {
        if (drctryNtry == null) {
            drctryNtry = new ArrayList<>();
        }
        return this.drctryNtry;
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
     * Adds a new item to the drctryNtry list.
     * @see #getDrctryNtry()
     * 
     */
    public ParticipantProfileReportV01 addDrctryNtry(DirectoryEntry1 drctryNtry) {
        getDrctryNtry().add(drctryNtry);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ParticipantProfileReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
