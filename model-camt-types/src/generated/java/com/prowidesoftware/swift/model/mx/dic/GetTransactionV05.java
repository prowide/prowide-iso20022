
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
 * The GetTransaction message is sent by a member to the transaction administrator.
 * It is used to request information about payment instructions held at the transaction administrator. Payment instructions are either sent by the member, debiting or crediting its account at the transaction administrator or received by the transaction administrator, crediting or debiting the member's account.
 * Usage
 * Following normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, or because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).
 * Members of a system need to have information about the payments queue(s) and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about transactions, whatever their status.
 * These requests will concern either all transactions, all transactions with a particular status or a specific transaction.
 * The member can request information about transactions through a series of criteria, corresponding to the known information stored at the transaction administrator, based on the following elements:
 * - provenance or destination of the payment (payment to/payment from)
 * - transaction reference
 * - transfer value date
 * - payment instruction reference
 * - payment instruction status, as registered at the transaction administrator
 * - instructed amount and/or currency
 * - interbank settlement amount and/or currency
 * - credit/debit indicator of the payment instruction/transaction
 * - SWIFT FIN payment message used for the payment instruction
 * - priority of the payment transaction
 * - period in which the payment instruction should be processed (processing validity time)
 * - instructions given, related to the processing of the transaction
 * - type of payment instructed
 * - account identification (entries booked to a specific account)
 * - entry amount and/or currency
 * - entry debit/credit indicator (if absent, all entries should be reported)
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionV05", propOrder = {
    "msgHdr",
    "txQryDef"
})
public class GetTransactionV05 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader2 msgHdr;
    @XmlElement(name = "TxQryDef")
    protected TransactionQuery1 txQryDef;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader2 }
     *     
     */
    public MessageHeader2 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader2 }
     *     
     */
    public GetTransactionV05 setMsgHdr(MessageHeader2 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the txQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionQuery1 }
     *     
     */
    public TransactionQuery1 getTxQryDef() {
        return txQryDef;
    }

    /**
     * Sets the value of the txQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionQuery1 }
     *     
     */
    public GetTransactionV05 setTxQryDef(TransactionQuery1 value) {
        this.txQryDef = value;
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
