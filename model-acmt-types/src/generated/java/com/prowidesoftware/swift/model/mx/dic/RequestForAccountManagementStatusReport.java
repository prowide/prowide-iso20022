
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
 * The RequestForAccountManagementStatusReport message is sent by an account owner, eg, an investor or its designated agent, to an account servicer, eg, a registrar, transfer agent, or custodian bank. There may be one or more intermediary parties, eg, an investment manager or an investment funds hub, between the account owner and the account servicer.
 * This message is used to request the status of an AccountOpeningInstruction message or of an AccountModificationInstruction message previously sent.
 * Usage
 * The RequestForAccountManagementStatusReport message is used by an account owner to request to the account servicer the processing status of a previously sent AccountOpeningInstruction message or AccountModificationInstruction message for which a AccountDetailsConfirmation message has not yet been received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForAccountManagementStatusReport", propOrder = {
    "reqDtls"
})
public class RequestForAccountManagementStatusReport {

    @XmlElement(name = "ReqDtls", required = true)
    protected AccountManagementMessageReference reqDtls;

    /**
     * Gets the value of the reqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementMessageReference }
     *     
     */
    public AccountManagementMessageReference getReqDtls() {
        return reqDtls;
    }

    /**
     * Sets the value of the reqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementMessageReference }
     *     
     */
    public RequestForAccountManagementStatusReport setReqDtls(AccountManagementMessageReference value) {
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
