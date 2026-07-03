
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
 * The member can request reservations information based on the following elements:
 * - identification of the system;
 * - identification of the account;
 * - status of the reservation (default and/or current);
 * - type of reservation.
 * This message will be replied to by a ReturnReservation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetReservationV03", propOrder = {
    "msgHdr",
    "rsvatnQryDef"
})
public class GetReservationV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader2 msgHdr;
    @XmlElement(name = "RsvatnQryDef")
    protected ReservationQuery1 rsvatnQryDef;

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
    public GetReservationV03 setMsgHdr(MessageHeader2 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationQuery1 }
     *     
     */
    public ReservationQuery1 getRsvatnQryDef() {
        return rsvatnQryDef;
    }

    /**
     * Sets the value of the rsvatnQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationQuery1 }
     *     
     */
    public GetReservationV03 setRsvatnQryDef(ReservationQuery1 value) {
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
