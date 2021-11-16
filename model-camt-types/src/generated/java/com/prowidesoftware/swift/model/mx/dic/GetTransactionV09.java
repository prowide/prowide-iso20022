
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
 * - entry debit/credit indicator (if absent, all entries should be reported).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionV09", propOrder = {
    "msgHdr",
    "txQryDef",
    "splmtryData"
})
public class GetTransactionV09 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader9 msgHdr;
    @XmlElement(name = "TxQryDef")
    protected TransactionQuery6 txQryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader9 }
     *     
     */
    public MessageHeader9 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader9 }
     *     
     */
    public GetTransactionV09 setMsgHdr(MessageHeader9 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the txQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionQuery6 }
     *     
     */
    public TransactionQuery6 getTxQryDef() {
        return txQryDef;
    }

    /**
     * Sets the value of the txQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionQuery6 }
     *     
     */
    public GetTransactionV09 setTxQryDef(TransactionQuery6 value) {
        this.txQryDef = value;
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
    public GetTransactionV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
