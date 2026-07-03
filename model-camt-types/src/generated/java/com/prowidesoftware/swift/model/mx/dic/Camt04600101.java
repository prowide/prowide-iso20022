
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
 * The GetReservation message is sent by a member to the transaction administrator.
 * It is used to request information on the details of one or more reservation facilities set by the member and managed by the transaction administrator.
 * Usage
 * The purpose of establishing reservations facilities is to ensure part of the liquidity on the account will be used exclusively for specific cash flow operations.
 * There are five types of reservation facilities:
 * - UrgentPaymentReservation: Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.
 * - HighlyUrgentPaymentReservation: Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments.
 * - CashReservation: Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.
 * - NetSSSReservation: Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.
 * - ThresholdForInvestment: Amount above which funds will be destined for investment.
 * The reservation can be effected directly by the member.
 * He has the possibility to:
 * - reset the reserved liquidity to zero
 * - change the reservation amount during the day with immediate effect
 * - input a default reservation amount for the following day(s); valid until a new reservation amount is requested
 * The member can request reservations information based on the following elements:
 * - identification of the system
 * - identification of the account
 * - status of the reservation (default and/or current )
 * - type of reservation
 * This message will be replied to by a ReturnReservation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.046.001.01", propOrder = {
    "msgId",
    "rsvatnQryDef"
})
public class Camt04600101 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "RsvatnQryDef")
    protected ReservationQueryDefinition1 rsvatnQryDef;

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
    public Camt04600101 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationQueryDefinition1 }
     *     
     */
    public ReservationQueryDefinition1 getRsvatnQryDef() {
        return rsvatnQryDef;
    }

    /**
     * Sets the value of the rsvatnQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationQueryDefinition1 }
     *     
     */
    public Camt04600101 setRsvatnQryDef(ReservationQueryDefinition1 value) {
        this.rsvatnQryDef = value;
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
