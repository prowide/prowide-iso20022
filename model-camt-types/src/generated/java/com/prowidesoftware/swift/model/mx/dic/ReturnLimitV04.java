
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
 * The ReturnLimit message is sent by the transaction administrator to a member of the system.
 * It is used to provide information on the details of one or more limits set by the member (or on behalf of the member) and managed by the transaction administrator.
 * The ReturnLimit message can be sent as a response to a related GetLimit message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * There are two purposes in establishing limits: to help members to make more efficient use of their liquidity and to facilitate risk management.
 * When limits are reached, the transaction administrator stops posting transactions to the account and puts them in a queue. The transaction administrator will resume processing the transactions held in the queue when the account balance of the member becomes sufficient to allow for the transactions to be executed while remaining within the limits.
 * Limits set by members are expressed as a maximum net position, and are managed by the transaction administrator. At any time during the day, the transaction administrator can ensure that the net position resulting from all incoming and outgoing transactions for a given member will not go over the fixed limit.
 * Limits are set by a member of the system either with regard to another specific member (bilateral limit) or with regard to all other participants (multilateral limit). As a result, there can be a maximum of one multilateral limit and as many bilateral limits as members of the system.
 * Note that for a bilateral limit, a member always needs to identify the counterparty to which it applies.
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the limit(s) that the transaction administrator manages for the member.
 * The transaction administrator may also send a ReturnLimit message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.
 * The message from the transaction administrator can contain information on the following elements:
 * - type of risk and/or liquidity limit
 * - value of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)
 * - identification of the system
 * - status of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)
 * - point in time when the limit becomes effective
 * - identification of the counterparty
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnLimitV04", propOrder = {
    "msgId",
    "bizQryRef",
    "bizRpt",
    "oprlErr"
})
public class ReturnLimitV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "BizQryRef")
    protected QueryReference bizQryRef;
    @XmlElement(name = "BizRpt")
    protected Limits3 bizRpt;
    @XmlElement(name = "OprlErr")
    protected ErrorHandling3 oprlErr;

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
    public ReturnLimitV04 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the bizQryRef property.
     * 
     * @return
     *     possible object is
     *     {@link QueryReference }
     *     
     */
    public QueryReference getBizQryRef() {
        return bizQryRef;
    }

    /**
     * Sets the value of the bizQryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryReference }
     *     
     */
    public ReturnLimitV04 setBizQryRef(QueryReference value) {
        this.bizQryRef = value;
        return this;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link Limits3 }
     *     
     */
    public Limits3 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limits3 }
     *     
     */
    public ReturnLimitV04 setBizRpt(Limits3 value) {
        this.bizRpt = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getOprlErr() {
        return oprlErr;
    }

    /**
     * Sets the value of the oprlErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ReturnLimitV04 setOprlErr(ErrorHandling3 value) {
        this.oprlErr = value;
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
