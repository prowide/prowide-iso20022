
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
 * The ForeignExchangeTradeCaptureReportRequest message is sent by a trading member to the trading system for inquiry of trade capture report. 
 * Usage
 * The request is sent by the trading member to the trading system to inquire trade capture report. 
 * Note a capture request could be rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeCaptureReportRequestV01", propOrder = {
    "qryReqId",
    "qryOrdrSts",
    "qryTp",
    "qryStartNb",
    "qryByPrd",
    "qryPrd",
    "qryTradId",
    "qryEndId",
    "splmtryData",
    "qryPgSz",
    "qryParamVal"
})
public class ForeignExchangeTradeCaptureReportRequestV01 {

    @XmlElement(name = "QryReqId", required = true)
    protected MessageIdentification1 qryReqId;
    @XmlElement(name = "QryOrdrSts", required = true)
    @XmlSchemaType(name = "string")
    protected QueryOrderStatus1Code qryOrdrSts;
    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryDataType1Code qryTp;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "QryByPrd")
    protected boolean qryByPrd;
    @XmlElement(name = "QryPrd")
    protected Period4 qryPrd;
    @XmlElement(name = "QryTradId")
    protected String qryTradId;
    @XmlElement(name = "QryEndId")
    protected String qryEndId;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;
    @XmlElement(name = "QryPgSz")
    protected String qryPgSz;
    @XmlElement(name = "QryParamVal")
    protected String qryParamVal;

    /**
     * Gets the value of the qryReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getQryReqId() {
        return qryReqId;
    }

    /**
     * Sets the value of the qryReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryReqId(MessageIdentification1 value) {
        this.qryReqId = value;
        return this;
    }

    /**
     * Gets the value of the qryOrdrSts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrderStatus1Code }
     *     
     */
    public QueryOrderStatus1Code getQryOrdrSts() {
        return qryOrdrSts;
    }

    /**
     * Sets the value of the qryOrdrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrderStatus1Code }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryOrdrSts(QueryOrderStatus1Code value) {
        this.qryOrdrSts = value;
        return this;
    }

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryDataType1Code }
     *     
     */
    public QueryDataType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDataType1Code }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryTp(QueryDataType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryStartNb(String value) {
        this.qryStartNb = value;
        return this;
    }

    /**
     * Gets the value of the qryByPrd property.
     * 
     */
    public boolean isQryByPrd() {
        return qryByPrd;
    }

    /**
     * Sets the value of the qryByPrd property.
     * 
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryByPrd(boolean value) {
        this.qryByPrd = value;
        return this;
    }

    /**
     * Gets the value of the qryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getQryPrd() {
        return qryPrd;
    }

    /**
     * Sets the value of the qryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryPrd(Period4 value) {
        this.qryPrd = value;
        return this;
    }

    /**
     * Gets the value of the qryTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryTradId() {
        return qryTradId;
    }

    /**
     * Sets the value of the qryTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryTradId(String value) {
        this.qryTradId = value;
        return this;
    }

    /**
     * Gets the value of the qryEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryEndId() {
        return qryEndId;
    }

    /**
     * Sets the value of the qryEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryEndId(String value) {
        this.qryEndId = value;
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

    /**
     * Gets the value of the qryPgSz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryPgSz() {
        return qryPgSz;
    }

    /**
     * Sets the value of the qryPgSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryPgSz(String value) {
        this.qryPgSz = value;
        return this;
    }

    /**
     * Gets the value of the qryParamVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryParamVal() {
        return qryParamVal;
    }

    /**
     * Sets the value of the qryParamVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportRequestV01 setQryParamVal(String value) {
        this.qryParamVal = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ForeignExchangeTradeCaptureReportRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
