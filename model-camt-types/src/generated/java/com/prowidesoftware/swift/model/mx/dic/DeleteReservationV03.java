
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
 * The DeleteReservation message is used to request the deletion of one particular reservation by the member and managed by the transaction administrator.
 * Usage
 * The deletion of a reservation in the system, will not only reset the reserved liquidity to zero, but also delete the reservation itself from the system: only the default reservation for the current business day remains in the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteReservationV03", propOrder = {
    "msgHdr",
    "curRsvatn"
})
public class DeleteReservationV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "CurRsvatn")
    protected ReservationIdentification1 curRsvatn;

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
    public DeleteReservationV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the curRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification1 }
     *     
     */
    public ReservationIdentification1 getCurRsvatn() {
        return curRsvatn;
    }

    /**
     * Sets the value of the curRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification1 }
     *     
     */
    public DeleteReservationV03 setCurRsvatn(ReservationIdentification1 value) {
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
