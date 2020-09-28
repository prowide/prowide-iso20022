
package com.prowidesoftware.swift.model.mx.dic;

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
 * A report user, eg, a professional investor, investment fund distributor, market data provider, regulator or other interested party sends the RequestForInvestmentFundReport message to the report provider, eg, a fund promoter, fund management company, transfer agent, or market data provider to request a report.
 * The RequestForInvestmentFundReport message can be used to request the following reports and statements:
 * - Fund cash forecast report, eg, a FundDetailedConfirmedCashForecastReport
 * - FundProcessingPassportReport
 * - PriceReport
 * - Statement, eg, AccountingStatementOfHoldings
 * - User defined report
 * Usage
 * If the RequestForInvestmentFundReport message is used to request a funds processing passport, fund cash forecast or price report then the request can specify the financial instrument for which the report is requested. Other appropriate parameters can also be included. It is also possible to indicate that the request is an open request, ie, there is no specific criteria for the report requested. For example, a request for a fund processing passport report that is specified as "no criteria" means that the request is a request for all fund processing passports.
 * If the RequestForInvestmentFundReport message is used to request a statement, then the account for which the statement is requested must be included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForInvestmentFundReportV01", propOrder = {
    "msgId",
    "reqDtls"
})
public class RequestForInvestmentFundReportV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "ReqDtls", required = true)
    protected RequestParameters reqDtls;

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
    public RequestForInvestmentFundReportV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestParameters }
     *     
     */
    public RequestParameters getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestParameters }
     *     
     */
    public RequestForInvestmentFundReportV01 setReqDtls(RequestParameters value) {
        this.reqDtls = value;
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

}
