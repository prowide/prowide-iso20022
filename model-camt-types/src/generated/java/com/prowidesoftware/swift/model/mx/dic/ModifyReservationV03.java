
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
 * The ModifyReservation message is used to request modifications in the details of one particular reservation set by the member and managed by the transaction administrator.
 * Usage
 * After the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.
 * If there is enough liquidity available, the requested amount will be reserved. In case the requested amount exceeds the available liquidity, only the available liquidity will be reserved. The difference will not be blocked at a later point, even if the account balance of the member reaches the level of the initial reservation request.
 * The reservation can be effected directly by the member, who has the possibility to: 
 * - reset the reserved liquidity to zero
 * - change the reservation amount during the day with immediate effect
 * - input a default reservation amount for the following day(s); valid until a new reservation amount is requested
 * After the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyReservationV03", propOrder = {
    "msgHdr",
    "rsvatnId",
    "newRsvatnValSet"
})
public class ModifyReservationV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "RsvatnId", required = true)
    protected CurrentOrDefaultReservation1Choice rsvatnId;
    @XmlElement(name = "NewRsvatnValSet", required = true)
    protected Reservation2 newRsvatnValSet;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public ModifyReservationV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentOrDefaultReservation1Choice }
     *     
     */
    public CurrentOrDefaultReservation1Choice getRsvatnId() {
        return rsvatnId;
    }

    /**
     * Sets the value of the rsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentOrDefaultReservation1Choice }
     *     
     */
    public ModifyReservationV03 setRsvatnId(CurrentOrDefaultReservation1Choice value) {
        this.rsvatnId = value;
        return this;
    }

    /**
     * Gets the value of the newRsvatnValSet property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation2 }
     *     
     */
    public Reservation2 getNewRsvatnValSet() {
        return newRsvatnValSet;
    }

    /**
     * Sets the value of the newRsvatnValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation2 }
     *     
     */
    public ModifyReservationV03 setNewRsvatnValSet(Reservation2 value) {
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
