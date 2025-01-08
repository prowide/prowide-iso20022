
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
 * The ReturnTransaction message is sent by the transaction administrator to a member of the system.
 * It is used to provide information on transactions and booked entries held at the transaction administrator.
 * The Return Transaction message can be sent as a response to a related GetTransaction message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * Following normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected or settled).
 * Members of a system need to receive information about the payments queue(s) and must have the ability to take action (that is, cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.
 * At any time during operating hours of the system, the member can query the transaction administrator to get information about transactions, whatever their status.
 * These requests will concern either all transactions, all transactions within a particular status or a specific transaction.
 * The member can request information about transactions through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that match the request and report them to the requester.
 * The transaction administrator may also send a ReturnTransaction message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.
 * The message from the transaction administrator can contain information based on the following elements:
 * - provenance or destination of the payment (payment to/payment from)
 * - transaction reference
 * - transfer value date
 * - payment instruction reference
 * - payment instruction status, as registered at the transaction administrator
 * - instructed amount and/or currency
 * - interbank settlement amount and/or currency
 * - credit/debit indicator of the payment instruction/transaction
 * - message used for the payment instruction
 * - priority of the payment transaction
 * - period in which the payment instruction should be processed (processing validity time)
 * - instructions given, related to the processing of the transaction
 * - type of payment instructed
 * - account identification (entries booked to a specific account)
 * - entry amount and/or currency
 * - entry debit/credit indicator (if absent, all entries should be reported)
 * - status of the entry (pending, booked.)
 * - entry date and time
 * - currency of the account
 * - type of the account
 * - entry reference
 * - entry date
 * - transfer reason
 * - details related to the status of the payment instruction
 * An element that is particular to the Get/Return Transaction pair is the Statement Report. When a GetTransaction message is sent requesting a statement report, the related ReturnTransaction message will provide a pre-defined set of return criteria per transaction. The information returned contains the following details for each transaction:
 * - value date
 * - entry date
 * - debit/credit code
 * - entry amount
 * - method of payment (payment instrument or message type)
 * - entry reference
 * - transaction reference
 * - supplementary details
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnTransactionV11", propOrder = {
    "msgHdr",
    "rptOrErr",
    "splmtryData"
})
public class ReturnTransactionV11 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader8 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected TransactionReportOrError7Choice rptOrErr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader8 }
     *     
     */
    public MessageHeader8 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader8 }
     *     
     */
    public ReturnTransactionV11 setMsgHdr(MessageHeader8 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReportOrError7Choice }
     *     
     */
    public TransactionReportOrError7Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReportOrError7Choice }
     *     
     */
    public ReturnTransactionV11 setRptOrErr(TransactionReportOrError7Choice value) {
        this.rptOrErr = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ReturnTransactionV11 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
