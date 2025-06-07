
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
 * The InvestmentFundReportRequest message is sent by a report user, for example, a professional investor, investment fund distributor, market data provider, regulator or other interested party to the report provider, for example, a fund promoter, fund management company, transfer agent, or market data provider to request a report.
 * The Investment Fund Report Request message can be used to request one or many fund reference data report messages.
 * Usage
 * If the InvestmentFundReportRequest message is used to request a fund reference data report then the request can specify the financial instrument for which the report is requested. Other appropriate parameters can also be included. It is also possible to indicate that the request is an open request, that is, there is no specific criteria for the report requested. For example, a request for a fund reference data report that is specified as "no criteria" means that the request is a request for a reference data report messages for all funds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundReportRequestV03", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "rptReq"
})
public class InvestmentFundReportRequestV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference10 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "RptReq", required = true)
    protected List<FundParameters4Choice> rptReq;

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
    public InvestmentFundReportRequestV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public InvestmentFundReportRequestV03 setPrvsRef(AdditionalReference10 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public InvestmentFundReportRequestV03 setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the rptReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundParameters4Choice }
     * 
     * 
     */
    public List<FundParameters4Choice> getRptReq() {
        if (rptReq == null) {
            rptReq = new ArrayList<FundParameters4Choice>();
        }
        return this.rptReq;
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
     * Adds a new item to the rptReq list.
     * @see #getRptReq()
     * 
     */
    public InvestmentFundReportRequestV03 addRptReq(FundParameters4Choice rptReq) {
        getRptReq().add(rptReq);
        return this;
    }

}
