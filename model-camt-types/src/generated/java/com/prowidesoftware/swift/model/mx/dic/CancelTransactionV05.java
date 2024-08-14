
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
 * The CancelTransaction message is sent by a member to the transaction administrator.
 * It is used to request the cancellation of one payment instruction held at the transaction administrator and sent by the member.
 * Usage
 * Following normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types), final (such as rejected, revoked and/or settled) or the status may even be defined as a proprietary status.
 * Members of a system need to have information about the payments queue(s), and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.
 * For this reason, at any time during the operating hours of the system, the member can request the cancellation of a transaction that has not received a final status.
 * The member will submit a CancelTransaction message containing the identification of the transaction to be cancelled.
 * Based on the criteria received within the CancelTransaction message, the transaction administrator will execute or reject the requested cancellation.
 * The transaction administrator may send a Receipt message as a reply to the CancelTransaction request.
 * To verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelTransactionV05", propOrder = {
    "msgHdr",
    "pmtId"
})
public class CancelTransactionV05 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader2 msgHdr;
    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification4Choice pmtId;

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
    public CancelTransactionV05 setMsgHdr(MessageHeader2 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification4Choice }
     *     
     */
    public PaymentIdentification4Choice getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification4Choice }
     *     
     */
    public CancelTransactionV05 setPmtId(PaymentIdentification4Choice value) {
        this.pmtId = value;
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
