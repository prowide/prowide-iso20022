
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
 * The ReportQueryRequest message is exchanged between system member and system transaction administrator.
 * It aims at querying the latest available report data of a specific report type. A report is stored and available for query until the event occurs again report is replaced.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQueryRequestV01", propOrder = {
    "msgHdr",
    "rptQryCrit",
    "splmtryData"
})
public class ReportQueryRequestV01 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader7 msgHdr;
    @XmlElement(name = "RptQryCrit")
    protected List<ReportQueryCriteria2> rptQryCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader7 }
     *     
     */
    public MessageHeader7 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader7 }
     *     
     */
    public ReportQueryRequestV01 setMsgHdr(MessageHeader7 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptQryCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptQryCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptQryCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportQueryCriteria2 }
     * 
     * 
     */
    public List<ReportQueryCriteria2> getRptQryCrit() {
        if (rptQryCrit == null) {
            rptQryCrit = new ArrayList<ReportQueryCriteria2>();
        }
        return this.rptQryCrit;
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
     * Adds a new item to the rptQryCrit list.
     * @see #getRptQryCrit()
     * 
     */
    public ReportQueryRequestV01 addRptQryCrit(ReportQueryCriteria2 rptQryCrit) {
        getRptQryCrit().add(rptQryCrit);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReportQueryRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
