
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
 * The CancelTransaction message is sent by a member to the transaction administrator.
 * It is used to request the cancellation of one payment instruction held at the transaction administrator and sent by the member.
 * Usage
 * Following normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).
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
@XmlType(name = "camt.008.001.03", propOrder = {
    "msgId",
    "instrRef"
})
public class Camt00800103 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "InstrRef", required = true)
    protected PaymentIdentification3Choice instrRef;

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
    public Camt00800103 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the instrRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public PaymentIdentification3Choice getInstrRef() {
        return instrRef;
    }

    /**
     * Sets the value of the instrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public Camt00800103 setInstrRef(PaymentIdentification3Choice value) {
        this.instrRef = value;
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
