
package com.prowidesoftware.swift.model.mx.dic;

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
 * The GetStandingOrder message is sent by a member to the transaction administrator.
 * It is used to request information on the details of one or more standing orders, based on specific request criteria, especially to query the amount of the overall liquidity available. It will allow to query both reserved liquidity and liquidity available for normal operations.
 * Usage
 * The member can request information based on the following elements: 
 * - individual standing orders (predefined or standing liquidity transfer orders)
 * - amount
 * - account to be credited
 * - account to be debited
 * - account owner (for on behalf scenario)
 * - frequency of payment
 * - daytime or overnight processing
 * - dates when the standing order begins and ceases to be effective
 * This message will be answered by a ReturnStandingOrder message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStandingOrderV01", propOrder = {
    "msgHdr",
    "stgOrdrQryDef"
})
public class GetStandingOrderV01 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader4 msgHdr;
    @XmlElement(name = "StgOrdrQryDef")
    protected StandingOrderQuery1 stgOrdrQryDef;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader4 }
     *     
     */
    public MessageHeader4 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader4 }
     *     
     */
    public GetStandingOrderV01 setMsgHdr(MessageHeader4 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderQuery1 }
     *     
     */
    public StandingOrderQuery1 getStgOrdrQryDef() {
        return stgOrdrQryDef;
    }

    /**
     * Sets the value of the stgOrdrQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderQuery1 }
     *     
     */
    public GetStandingOrderV01 setStgOrdrQryDef(StandingOrderQuery1 value) {
        this.stgOrdrQryDef = value;
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
