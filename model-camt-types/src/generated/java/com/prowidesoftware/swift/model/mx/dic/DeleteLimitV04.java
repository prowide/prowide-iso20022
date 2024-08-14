
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
 * The DeleteLimit message is sent by a member to the transaction administrator.
 * It is used to request the deletion of one particular, several or all limits set by the member and managed by the transaction administrator.
 * The DeleteLimit message may delete several types of current limits (risk or liquidity management limit), based on a multiple requests.
 * Usage
 * There are two purposes in establishing limits: to help members to make more efficient use of their liquidity and to facilitate risk management.
 * When limits are reached, the transaction administrator stops posting transactions to the account and puts them in a queue. The transaction administrator will resume processing the transactions held in the queue when the account balance of the member becomes sufficient to allow for the transactions to be executed while remaining within the limits.
 * Limits set by members are expressed as a maximum net position, and are managed by the transaction administrator. At any time during the day, the transaction administrator can ensure that the net position resulting from all incoming and outgoing transactions for a given member will not go over the fixed limit.
 * Limits are set by a member of the system either with regard to another specific member (bilateral limit) or with regard to all other participants (multilateral limit). As a result, there can be a maximum of one multilateral limit and as many bilateral limits as members of the system.
 * Note that for a bilateral limit, a member always needs to identify the counterparty to which it applies.
 * At any time during the operating hours of the system, the member can request the transaction administrator to delete any of the limits it has set (current limits). For example, the reason may be to unlock the payments queue regarding a particular member, or following a risk management decision issued after an exceptional event has occurred.
 * The member will submit a DeleteLimit message identifying which limit(s) it wants to delete (current limit risk/liquidity limit concepts have been merged) based on following criteria:
 * - type of limit(s) (current/default)
 * - value of the limit(s) (default and/or current limit(s))
 * - identification of the counterparty (bilateral limit)
 * Based on the criteria received within the DeleteLimit message, the transaction administrator will execute or reject the requested modifications.
 * The transaction administrator may send a Receipt message as a reply to the DeleteLimit request.
 * To verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLimitV04", propOrder = {
    "msgId",
    "lmtDtls"
})
public class DeleteLimitV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "LmtDtls", required = true)
    protected LimitDetailsStructure3 lmtDtls;

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
    public DeleteLimitV04 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the lmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetailsStructure3 }
     *     
     */
    public LimitDetailsStructure3 getLmtDtls() {
        return lmtDtls;
    }

    /**
     * Sets the value of the lmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetailsStructure3 }
     *     
     */
    public DeleteLimitV04 setLmtDtls(LimitDetailsStructure3 value) {
        this.lmtDtls = value;
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
