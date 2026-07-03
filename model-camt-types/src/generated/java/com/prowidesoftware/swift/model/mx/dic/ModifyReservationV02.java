
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
 * The ModifyReservation message is sent by a member to the transaction administrator.
 * It is sent by a member to the transaction administrator to request a modification of details of one or more reservation facilities set by the member and managed by the transaction administrator.
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
 * After the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.
 * If there is enough liquidity available, the requested amount will be reserved. In case the requested amount exceeds the available liquidity, only the available liquidity will be reserved. The difference will not be blocked at a later point, even if the account balance of the member reaches the level of the initial reservation request.
 * At any time during the operating hours of the system, the member can query the transaction administrator to modify the reservations facilities that the transaction administrator manages for the member.
 * The member can request to modify the reservations based on the following elements:
 * - identification of the system
 * - identification of the account
 * - status of the reservation (default and/or current )
 * - type of reservation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyReservationV02", propOrder = {
    "msgId",
    "curRsvatnId",
    "dfltRsvatnId",
    "newRsvatnValSet"
})
public class ModifyReservationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "CurRsvatnId")
    protected ReservationIdentificationDetails1 curRsvatnId;
    @XmlElement(name = "DfltRsvatnId")
    protected ReservationIdentificationDetails1 dfltRsvatnId;
    @XmlElement(name = "NewRsvatnValSet", required = true)
    protected ReservationDetails2 newRsvatnValSet;

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
    public ModifyReservationV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the curRsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ReservationIdentificationDetails1 getCurRsvatnId() {
        return curRsvatnId;
    }

    /**
     * Sets the value of the curRsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ModifyReservationV02 setCurRsvatnId(ReservationIdentificationDetails1 value) {
        this.curRsvatnId = value;
        return this;
    }

    /**
     * Gets the value of the dfltRsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ReservationIdentificationDetails1 getDfltRsvatnId() {
        return dfltRsvatnId;
    }

    /**
     * Sets the value of the dfltRsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentificationDetails1 }
     *     
     */
    public ModifyReservationV02 setDfltRsvatnId(ReservationIdentificationDetails1 value) {
        this.dfltRsvatnId = value;
        return this;
    }

    /**
     * Gets the value of the newRsvatnValSet property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetails2 }
     *     
     */
    public ReservationDetails2 getNewRsvatnValSet() {
        return newRsvatnValSet;
    }

    /**
     * Sets the value of the newRsvatnValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetails2 }
     *     
     */
    public ModifyReservationV02 setNewRsvatnValSet(ReservationDetails2 value) {
        this.newRsvatnValSet = value;
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
