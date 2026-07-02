
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
 * The DeleteReservation message is sent by a member to the transaction administrator.
 * It is used to request a deletion of one or more reservation facilities set by the member and managed by the transaction administrator.
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
 * At any time during the operating hours of the system, the member can query the transaction administrator to delete the reservations facilities that the transaction administrator manages for the member.
 * The member can make his request for deletion based on the following elements:
 * - identification of the system
 * - identification of the account
 * - status of the reservation (default and/or current )
 * - type of reservation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteReservationV02", propOrder = {
    "msgId",
    "curRsvatn"
})
public class DeleteReservationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "CurRsvatn")
    protected ReservationIdentificationDetails1 curRsvatn;

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
    public DeleteReservationV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the curRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ReservationIdentificationDetails1 getCurRsvatn() {
        return curRsvatn;
    }

    /**
     * Sets the value of the curRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public DeleteReservationV02 setCurRsvatn(ReservationIdentificationDetails1 value) {
        this.curRsvatn = value;
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
