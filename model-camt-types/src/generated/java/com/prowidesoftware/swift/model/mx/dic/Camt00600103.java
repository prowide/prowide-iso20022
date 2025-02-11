
package com.prowidesoftware.swift.model.mx.dic;

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
 * Additional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.006.001.03", propOrder = {
    "msgId",
    "msgPgntn",
    "bizQryRef",
    "bizRpt",
    "oprlErr"
})
public class Camt00600103 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "MsgPgntn")
    protected Pagination msgPgntn;
    @XmlElement(name = "BizQryRef")
    protected QueryReference bizQryRef;
    @XmlElement(name = "BizRpt")
    protected Transactions3 bizRpt;
    @XmlElement(name = "OprlErr")
    protected ErrorHandling2 oprlErr;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public Camt00600103 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public Camt00600103 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the bizQryRef property.
     * 
     * @return
     *     possible object is
     *     {@link QueryReference }
     *     
     */
    public QueryReference getBizQryRef() {
        return bizQryRef;
    }

    /**
     * Sets the value of the bizQryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryReference }
     *     
     */
    public Camt00600103 setBizQryRef(QueryReference value) {
        this.bizQryRef = value;
        return this;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link Transactions3 }
     *     
     */
    public Transactions3 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transactions3 }
     *     
     */
    public Camt00600103 setBizRpt(Transactions3 value) {
        this.bizRpt = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getOprlErr() {
        return oprlErr;
    }

    /**
     * Sets the value of the oprlErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public Camt00600103 setOprlErr(ErrorHandling2 value) {
        this.oprlErr = value;
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
