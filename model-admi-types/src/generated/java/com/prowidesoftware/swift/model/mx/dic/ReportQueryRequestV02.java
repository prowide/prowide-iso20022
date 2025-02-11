
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
 * The ReportQueryRequest message is exchanged between system member and system transaction administrator.
 * It aims at querying the latest available report data of a specific report type. A report is stored and available for query until the event occurs again report is replaced.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportQueryRequestV02", propOrder = {
    "msgHdr",
    "rptQryCrit",
    "splmtryData"
})
public class ReportQueryRequestV02 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader7 msgHdr;
    @XmlElement(name = "RptQryCrit")
    protected List<ReportQueryCriteria3> rptQryCrit;
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
    public ReportQueryRequestV02 setMsgHdr(MessageHeader7 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptQryCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptQryCrit property.
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
     * {@link ReportQueryCriteria3 }
     * 
     * 
     * @return
     *     The value of the rptQryCrit property.
     */
    public List<ReportQueryCriteria3> getRptQryCrit() {
        if (rptQryCrit == null) {
            rptQryCrit = new ArrayList<>();
        }
        return this.rptQryCrit;
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
     * Adds a new item to the rptQryCrit list.
     * @see #getRptQryCrit()
     * 
     */
    public ReportQueryRequestV02 addRptQryCrit(ReportQueryCriteria3 rptQryCrit) {
        getRptQryCrit().add(rptQryCrit);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReportQueryRequestV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
