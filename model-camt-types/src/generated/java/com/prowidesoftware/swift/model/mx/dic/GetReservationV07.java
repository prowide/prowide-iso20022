
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "GetReservationV07", propOrder = {
    "msgHdr",
    "rsvatnQryDef",
    "splmtryData"
})
public class GetReservationV07 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader9 msgHdr;
    @XmlElement(name = "RsvatnQryDef")
    protected ReservationQuery5 rsvatnQryDef;
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
    public GetReservationV07 setMsgHdr(MessageHeader9 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationQuery5 }
     *     
     */
    public ReservationQuery5 getRsvatnQryDef() {
        return rsvatnQryDef;
    }

    /**
     * Sets the value of the rsvatnQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationQuery5 }
     *     
     */
    public GetReservationV07 setRsvatnQryDef(ReservationQuery5 value) {
        this.rsvatnQryDef = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public GetReservationV07 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
