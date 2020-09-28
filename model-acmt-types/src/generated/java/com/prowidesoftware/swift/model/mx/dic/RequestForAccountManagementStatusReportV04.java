
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
 * An account owner, for example, an investor or its designated agent, sends the RequestForAccountManagementStatusReport message to the account servicer, for example, a registrar, transfer agent, custodian bank or securities depository  to request the status of an AccountOpeningInstruction,  GetAccountDetails or an AccountModificationInstruction.
 * Usage
 * The RequestForAccountManagementStatusReport message is used to request the processing status of a previously sent AccountOpeningInstruction message or AccountModificationInstruction message for which a AccountDetailsConfirmation message has not yet been received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForAccountManagementStatusReportV04", propOrder = {
    "msgId",
    "reqDtls"
})
public class RequestForAccountManagementStatusReportV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "ReqDtls", required = true)
    protected AccountManagementMessageReference3 reqDtls;

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
    public RequestForAccountManagementStatusReportV04 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementMessageReference3 }
     *     
     */
    public AccountManagementMessageReference3 getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementMessageReference3 }
     *     
     */
    public RequestForAccountManagementStatusReportV04 setReqDtls(AccountManagementMessageReference3 value) {
        this.reqDtls = value;
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
