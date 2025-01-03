
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
 * The ModifyLimit message is sent by a member to the transaction administrator.
 * It is used to request modifications in the details of one particular limit set by the member and managed by the transaction administrator.
 * Each ModifyLimit message can alter only one type of limit (current or default).
 * Usage
 * There are two purposes in establishing limits: to help members to make more efficient use of their liquidity and to facilitate risk management.
 * When limits are reached, the transaction administrator stops posting transactions to the account and puts them in a queue. The transaction administrator will resume processing the transactions held in the queue when the account balance of the member becomes sufficient to allow for the transactions to be executed while remaining within the limits.
 * Limits set by members are expressed as a maximum net position, and are managed by the transaction administrator. At any time during the day, the transaction administrator can ensure that the net position resulting from all incoming and outgoing transactions for a given member will not go over the fixed limit.
 * Limits are set by a member of the system either with regard to another specific member (bilateral limit) or with regard to all other participants (multilateral limit). As a result, there can be a maximum of one multilateral limit and as many bilateral limits as members of the system.
 * Note that for a bilateral limit, a member always needs to identify the counterparty to which it applies.
 * At any time during the operating hours of the system, the member can request modifications in the limits it has set. For example, the reason may be to unlock the payments queue regarding a particular member, or following a risk management decision issued after an exceptional event has occurred.
 * The member will submit a message requesting modifications in one or more of the following criteria:
 * - type of limit (current/default)
 * - identification of the system
 * - identification of the counterparty
 * - value of the limit(s) (default and/or current limit(s))
 * - point in time when the limit becomes effective
 * Based on the criteria received within the ModifyLimit message, the transaction administrator will execute or reject the requested modification. The transaction administrator may send a Receipt message as a reply to the ModifyLimit request. To verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.011.001.02", propOrder = {
    "msgId",
    "curLmtId",
    "dfltLmtId",
    "newLmtValSet"
})
public class Camt01100102 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "CurLmtId")
    protected LimitIdentificationDetails1 curLmtId;
    @XmlElement(name = "DfltLmtId")
    protected LimitIdentificationDetails1 dfltLmtId;
    @XmlElement(name = "NewLmtValSet", required = true)
    protected LimitDetails4 newLmtValSet;

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
    public Camt01100102 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the curLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails1 }
     *     
     */
    public LimitIdentificationDetails1 getCurLmtId() {
        return curLmtId;
    }

    /**
     * Sets the value of the curLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails1 }
     *     
     */
    public Camt01100102 setCurLmtId(LimitIdentificationDetails1 value) {
        this.curLmtId = value;
        return this;
    }

    /**
     * Gets the value of the dfltLmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentificationDetails1 }
     *     
     */
    public LimitIdentificationDetails1 getDfltLmtId() {
        return dfltLmtId;
    }

    /**
     * Sets the value of the dfltLmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentificationDetails1 }
     *     
     */
    public Camt01100102 setDfltLmtId(LimitIdentificationDetails1 value) {
        this.dfltLmtId = value;
        return this;
    }

    /**
     * Gets the value of the newLmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link LimitDetails4 }
     *     
     */
    public LimitDetails4 getNewLmtValSet() {
        return newLmtValSet;
    }

    /**
     * Sets the value of the newLmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitDetails4 }
     *     
     */
    public Camt01100102 setNewLmtValSet(LimitDetails4 value) {
        this.newLmtValSet = value;
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
