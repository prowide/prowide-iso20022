
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
 * The GetLimit message is sent by a member to the transaction administrator.
 * It is used to request information on the details of one or more limits set by the member (or on behalf of the member) and managed by the transaction administrator.
 * Usage
 * There are two purposes in establishing limits: to help members to make more efficient use of their liquidity and to facilitate risk management.
 * When limits are reached, the transaction administrator stops posting transactions to the account and puts them in a queue. The transaction administrator will resume processing the transactions held in the queue when the account balance of the member becomes sufficient to allow for the transactions to be executed while remaining within the limits.
 * Limits set by members are expressed as a maximum net position and are managed by the transaction administrator. At any time during the day, the transaction administrator can ensure that incoming and outgoing operations for a given member will not go over the fixed limit.
 * Limits are set by a member of the system either with regard to another specific member (bilateral limit) or with regard to all other participants (multilateral limit). As a result, there can be a maximum of one multilateral limit and as many bilateral limits as members of the system.
 * Note that for a bilateral limit, a member always needs to identify the counterparty to which it applies.
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the limit(s) that the transaction administrator manages for the member.
 * The member can request information based on the following elements:
 * - identification of the system
 * - type of risk and/or liquidity limit
 * - status of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)
 * - point in time when the limit becomes effective
 * - identification of the counterparty
 * This message will be answered by a ReturnLimit message.
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLimitV04", propOrder = {
    "msgId",
    "lmtQryDef"
})
public class GetLimitV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "LmtQryDef")
    protected LimitQueryDefinition3 lmtQryDef;

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
    public GetLimitV04 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the lmtQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link LimitQueryDefinition3 }
     *     
     */
    public LimitQueryDefinition3 getLmtQryDef() {
        return lmtQryDef;
    }

    /**
     * Sets the value of the lmtQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitQueryDefinition3 }
     *     
     */
    public GetLimitV04 setLmtQryDef(LimitQueryDefinition3 value) {
        this.lmtQryDef = value;
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
