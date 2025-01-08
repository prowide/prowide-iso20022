
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
 * The ReturnStandingOrder message is sent by a transaction administrator to a member.
 * It is used to provide information on the details of one or more standing orders, based on specific request and return criteria.
 * in response to a request a on information on standing and predefined orders.
 * Usage
 * The ReturnStandingOrder message lists the standing order based on the following possible return criteria: 
 * - Generic standing order details,
 * - Details of a specific predefined or standing liquidity transfer orders,
 * - Details on the set to which the standing order belongs to,
 * - List of all predefined and standing liquidity transfer standing orders and/or per set,
 * - Total amount of predefined and standing liquidity transfer orders defined in the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnStandingOrderV01", propOrder = {
    "msgHdr",
    "rptOrErr"
})
public class ReturnStandingOrderV01 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader6 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected StandingOrderOrError1Choice rptOrErr;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader6 }
     *     
     */
    public MessageHeader6 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader6 }
     *     
     */
    public ReturnStandingOrderV01 setMsgHdr(MessageHeader6 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError1Choice }
     *     
     */
    public StandingOrderOrError1Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError1Choice }
     *     
     */
    public ReturnStandingOrderV01 setRptOrErr(StandingOrderOrError1Choice value) {
        this.rptOrErr = value;
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
