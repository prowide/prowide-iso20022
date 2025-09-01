
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
 * The ReturnCurrencyExchangeRate message is sent by the transaction administrator to a member of the system.
 * It is used to provide information on static data and related to currency exchange details as maintained for system operations by the transaction administrator.
 * The ReturnCurrencyExchangeRate message can be sent as a response to a related GetCurrencyExchangeRate message (pull mode) or initiated by the account servicer (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions or requests created in the system. The type of business information available can vary depending on the system.
 * When a system manages a pool of accounts in various currencies for a member, it needs to maintain currency exchange details between the various currencies and the reporting on base currency. The reporting on base currency is used to calculate the actual position of the members in terms of aggregate limits and balances. It also allows the system to contain risk within defined and agreed boundaries.
 * The currency exchange details can be fixed for the entire operational day or regularly updated according to near real-time market feeds.
 * The member can request information about a currency exchange operation through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that will match with the request and report them to the requestor.
 * The transaction administrator may also send a Return Currency Exchange Rate message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs the member(s) attention.
 * The message from the transaction administrator will contain information based on the following elements:
 * - the currency to be converted (source currency)
 * - the currency into which the amount is converted (target currency)
 * - the exchange rate
 * - the quotation date and currency
 * Additional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnCurrencyExchangeRateV03", propOrder = {
    "msgHdr",
    "rptOrErr",
    "splmtryData"
})
public class ReturnCurrencyExchangeRateV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader7 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected ExchangeRateReportOrError1Choice rptOrErr;
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
    public ReturnCurrencyExchangeRateV03 setMsgHdr(MessageHeader7 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateReportOrError1Choice }
     *     
     */
    public ExchangeRateReportOrError1Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateReportOrError1Choice }
     *     
     */
    public ReturnCurrencyExchangeRateV03 setRptOrErr(ExchangeRateReportOrError1Choice value) {
        this.rptOrErr = value;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReturnCurrencyExchangeRateV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
