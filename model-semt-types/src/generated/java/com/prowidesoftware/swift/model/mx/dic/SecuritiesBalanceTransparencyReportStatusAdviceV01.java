
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
 * SCOPE
 * 
 * An account owner, such as a custodian, central securities depository, international securities depository or transfer agent, sends the SecuritiesBalanceTransparencyReportStatusAdvice message in response to a SecuritiesBalanceTransparencyReport, to accept or reject the statement of holdings as sent in a SecuritiesBalanceTransparencyReport.
 * 
 * USAGE
 * The SecuritiesBalanceTransparencyReportStatusAdvice is used to accept (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a previously received SecuritiesBalanceTransparencyReport.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceTransparencyReportStatusAdviceV01", propOrder = {
    "msgId",
    "sndrId",
    "rcvrId",
    "rltdStmt",
    "sts",
    "nbOfItmsPerSts",
    "splmtryData"
})
public class SecuritiesBalanceTransparencyReportStatusAdviceV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "SndrId", required = true)
    protected PartyIdentification100 sndrId;
    @XmlElement(name = "RcvrId")
    protected PartyIdentification100 rcvrId;
    @XmlElement(name = "RltdStmt", required = true)
    protected StatementReference1 rltdStmt;
    @XmlElement(name = "Sts", required = true)
    protected ReportItemStatus1Choice sts;
    @XmlElement(name = "NbOfItmsPerSts")
    protected List<NumberOfItemsPerStatus1> nbOfItmsPerSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the sndrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getSndrId() {
        return sndrId;
    }

    /**
     * Sets the value of the sndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 setSndrId(PartyIdentification100 value) {
        this.sndrId = value;
        return this;
    }

    /**
     * Gets the value of the rcvrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getRcvrId() {
        return rcvrId;
    }

    /**
     * Sets the value of the rcvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 setRcvrId(PartyIdentification100 value) {
        this.rcvrId = value;
        return this;
    }

    /**
     * Gets the value of the rltdStmt property.
     * 
     * @return
     *     possible object is
     *     {@link StatementReference1 }
     *     
     */
    public StatementReference1 getRltdStmt() {
        return rltdStmt;
    }

    /**
     * Sets the value of the rltdStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementReference1 }
     *     
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 setRltdStmt(StatementReference1 value) {
        this.rltdStmt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemStatus1Choice }
     *     
     */
    public ReportItemStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemStatus1Choice }
     *     
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 setSts(ReportItemStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the nbOfItmsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nbOfItmsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfItmsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfItemsPerStatus1 }
     * 
     * 
     * @return
     *     The value of the nbOfItmsPerSts property.
     */
    public List<NumberOfItemsPerStatus1> getNbOfItmsPerSts() {
        if (nbOfItmsPerSts == null) {
            nbOfItmsPerSts = new ArrayList<>();
        }
        return this.nbOfItmsPerSts;
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
     * Adds a new item to the nbOfItmsPerSts list.
     * @see #getNbOfItmsPerSts()
     * 
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 addNbOfItmsPerSts(NumberOfItemsPerStatus1 nbOfItmsPerSts) {
        getNbOfItmsPerSts().add(nbOfItmsPerSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
