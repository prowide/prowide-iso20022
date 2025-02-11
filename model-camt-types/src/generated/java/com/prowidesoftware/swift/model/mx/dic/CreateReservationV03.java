
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
 * The CreateReservation message is used to request for the creation of one particular reservation by the member and managed by the transaction administrator.
 * Usage
 * Based on the criteria defined in the CreateReservation message, the transaction administrator will execute or reject the requested creation and respond with a Receipt message as a reply to the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateReservationV03", propOrder = {
    "msgHdr",
    "rsvatnId",
    "valSet",
    "splmtryData"
})
public class CreateReservationV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "RsvatnId", required = true)
    protected ReservationIdentification4 rsvatnId;
    @XmlElement(name = "ValSet", required = true)
    protected Reservation4 valSet;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public CreateReservationV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification4 }
     *     
     */
    public ReservationIdentification4 getRsvatnId() {
        return rsvatnId;
    }

    /**
     * Sets the value of the rsvatnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification4 }
     *     
     */
    public CreateReservationV03 setRsvatnId(ReservationIdentification4 value) {
        this.rsvatnId = value;
        return this;
    }

    /**
     * Gets the value of the valSet property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation4 }
     *     
     */
    public Reservation4 getValSet() {
        return valSet;
    }

    /**
     * Sets the value of the valSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation4 }
     *     
     */
    public CreateReservationV03 setValSet(Reservation4 value) {
        this.valSet = value;
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
    public CreateReservationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
