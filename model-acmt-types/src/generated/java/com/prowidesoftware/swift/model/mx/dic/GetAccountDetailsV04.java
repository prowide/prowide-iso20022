
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
 * An account owner, for example, an investor or its designated agent, sends the GetAccountDetails message to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository to query the details of an existing account.
 * Usage
 * The GetAccountDetails message is used to query all or some of the account details for a given account held with an account servicer.
 * The message is used prior to an AccountModificationInstruction in order to validate account information before requesting a modification.
 * The GetAccountDetails message may also be used to collect account information for general account reconciliation purposes.
 * The response to a GetAccountDetails message is via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountDetailsV04", propOrder = {
    "msgId",
    "invstmtAcctSelctn",
    "selctdInfTp"
})
public class GetAccountDetailsV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected AccountSelection1Choice invstmtAcctSelctn;
    @XmlElement(name = "SelctdInfTp", required = true)
    protected InvestmentAccountInformationType1 selctdInfTp;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public GetAccountDetailsV04 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSelection1Choice }
     *     
     */
    public AccountSelection1Choice getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSelection1Choice }
     *     
     */
    public GetAccountDetailsV04 setInvstmtAcctSelctn(AccountSelection1Choice value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the selctdInfTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountInformationType1 }
     *     
     */
    public InvestmentAccountInformationType1 getSelctdInfTp() {
        return selctdInfTp;
    }

    /**
     * Sets the value of the selctdInfTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountInformationType1 }
     *     
     */
    public GetAccountDetailsV04 setSelctdInfTp(InvestmentAccountInformationType1 value) {
        this.selctdInfTp = value;
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
