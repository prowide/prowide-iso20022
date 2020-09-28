
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
 * The ReturnReservation message is sent by the transaction administrator to a member.
 * It is used to provide information on the details of one or more reservation facilities set by the member and managed by the transaction administrator.
 * The ReturnReservation message can be sent as a response to a related Get Reservation message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * The purpose of establishing reservations facilities is to ensure part of the liquidity on the account will be used exclusively for specific cash flow operations .
 * There are five types of reservation facilities :
 * - UrgentPaymentReservation: Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing critical payments called urgent payments.
 * - HighlyUrgentPaymentReservation: Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing highly urgent payments.
 * - CashReservation : Amount set aside by a participant to reserve liquidity from its own account, exclusively for executing cash withdrawals.
 * - NetSSSReservation : Amount set aside by a participant to reserve liquidity from its own account, exclusively for the settlement of the multilateral cash balance stemming from the Net Security Settlement System.
 * - ThresholdForInvestment : Amount above which funds will be destined for investment.
 * The reservation can be effected directly by the member.
 * He has the possibility to :
 * - reset the reserved liquidity to zero
 * - change the reservation amount during the day with immediate effect
 * - input a default reservation amount for the following day(s); valid until a new reservation amount is requested
 * After the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.
 * If there is enough liquidity available, the requested amount will be reserved. In case the requested amount exceeds the available liquidity, only the available liquidity will be reserved . The difference will not be blocked at a later point, even if the account balance of the member reaches the level of the initial reservation request.
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the reservations facilities that the transaction administrator manages for the member.
 * The transaction administrator will send reservations information to the member based on the following elements:
 * - identification of the system
 * - identification of the account
 * - status of the reservation (default and/or current )
 * - type of reservation
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnReservationV02", propOrder = {
    "msgId",
    "bizQryRef",
    "bizRpt",
    "oprlErr"
})
public class ReturnReservationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "BizQryRef")
    protected QueryReference bizQryRef;
    @XmlElement(name = "BizRpt")
    protected Reservations2 bizRpt;
    @XmlElement(name = "OprlErr")
    protected ErrorHandling3 oprlErr;

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
    public ReturnReservationV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
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
    public ReturnReservationV02 setBizQryRef(QueryReference value) {
        this.bizQryRef = value;
        return this;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link Reservations2 }
     *     
     */
    public Reservations2 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservations2 }
     *     
     */
    public ReturnReservationV02 setBizRpt(Reservations2 value) {
        this.bizRpt = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getOprlErr() {
        return oprlErr;
    }

    /**
     * Sets the value of the oprlErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ReturnReservationV02 setOprlErr(ErrorHandling3 value) {
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
