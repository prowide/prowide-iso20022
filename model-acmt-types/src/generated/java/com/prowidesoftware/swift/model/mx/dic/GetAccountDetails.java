
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
 * The GetAccountDetails message is sent by an account owner, eg, an investor or its designated agent, to an account servicer, eg, a registrar, transfer agent, or custodian bank. There may be one or more intermediary parties, eg, an investment manager or an investment funds hub, between the account owner and the account servicer.
 * This message is used to query the details of an existing investment funds account.
 * Usage
 * The GetAccountDetails message is used by an account owner to query all or some of the account details for a given account held with an account servicer.
 * The message is used prior to an AccountModificationInstruction in order to validate account information before requesting a modification
 * The GetAccountDetails message may also be used to collect account information for general account reconciliation purposes.
 * The response to a GetAccountDetails message is via an AccountDetailsConfirmation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountDetails", propOrder = {
    "invstmtAcctSelctn",
    "selctdInfTp"
})
public class GetAccountDetails {

    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected InvestmentAccountSelection1 invstmtAcctSelctn;
    @XmlElement(name = "SelctdInfTp", required = true)
    protected InvestmentAccountInformationType selctdInfTp;

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountSelection1 }
     *     
     */
    public InvestmentAccountSelection1 getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountSelection1 }
     *     
     */
    public GetAccountDetails setInvstmtAcctSelctn(InvestmentAccountSelection1 value) {
        this.invstmtAcctSelctn = value;
        return this;
    }

    /**
     * Gets the value of the selctdInfTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountInformationType }
     *     
     */
    public InvestmentAccountInformationType getSelctdInfTp() {
        return selctdInfTp;
    }

    /**
     * Sets the value of the selctdInfTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountInformationType }
     *     
     */
    public GetAccountDetails setSelctdInfTp(InvestmentAccountInformationType value) {
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
