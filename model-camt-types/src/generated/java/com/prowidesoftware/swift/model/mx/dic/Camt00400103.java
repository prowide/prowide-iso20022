
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
 * The ReturnAccount message is sent by the transaction administrator to a member.
 * It is used to provide information on the details of one or more accounts held at the transaction administrator, including information on the balances.
 * The Return Account message can be sent as a response to a related GetAccount message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the account(s) that the transaction administrator maintains for the member.
 * For example, this may be necessary in order to perform the appropriate liquidity management and the necessary funds transfers between accounts.
 * The member can request information about accounts through a series of criteria, corresponding to the known information stored at the transaction administrator.
 * The query can concern one or more specific accounts, accounts of a particular identification, or a particular type. The purpose of the query may be to obtain one or more types of balance.
 * The transaction administrator may also send a ReturnAccount message with pre-defined information, at times previously agreed with the member, or to warn the member about a particular problem that may have arisen and which needs attention.
 * The message from the transaction administrator can contain information based on the following elements:
 * - account identification
 * - account name
 * - account type (this is used when the account identification represents, for example, a group of accounts)
 * - currency of the account (this is used for example when the account identification represents a group of account in various currencies, or when it is a multi-currency account with one single identifier)
 * - type of balance (if not present in the GetAccount message, all balances will be reported)
 * - bilateral or multilateral limits
 * - related counterparty (when the limit or balance is bilateral)
 * - balance value date (if not present in the GetAccount message, the ReturnAccount message will contain the latest available balance)
 * - number of payments to the additional account information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.004.001.03", propOrder = {
    "msgId",
    "bizQryRef",
    "bizRpt",
    "oprlErr"
})
public class Camt00400103 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "BizQryRef")
    protected QueryReference bizQryRef;
    @XmlElement(name = "BizRpt")
    protected Accounts3 bizRpt;
    @XmlElement(name = "OprlErr")
    protected ErrorHandling2 oprlErr;

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
    public Camt00400103 setMsgId(MessageIdentification value) {
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
    public Camt00400103 setBizQryRef(QueryReference value) {
        this.bizQryRef = value;
        return this;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link Accounts3 }
     *     
     */
    public Accounts3 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounts3 }
     *     
     */
    public Camt00400103 setBizRpt(Accounts3 value) {
        this.bizRpt = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getOprlErr() {
        return oprlErr;
    }

    /**
     * Sets the value of the oprlErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public Camt00400103 setOprlErr(ErrorHandling2 value) {
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
