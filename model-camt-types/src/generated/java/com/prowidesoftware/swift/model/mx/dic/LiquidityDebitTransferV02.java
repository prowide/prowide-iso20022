
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
 * The LiquidityDebitTransfer message is sent by a member to the transaction administrator.
 * It is used to request a transfer of funds between two accounts belonging to the same member or the same group of accounts, and being held at the transaction administrator.
 * Usage
 * At any time during the operating hours of the system, and to perform the appropriate liquidity management, the member can request the transaction administrator to execute the transfer of funds between two accounts that the transaction administrator maintains for the member. For instance, this may be an action resulting from a Get/Return Account pair of messages.
 * The LiquidityDebitTransfer message can be used when the transactions to/from the member are unbalanced in value for the business day, or to unlock pending transactions at the end of day.
 * The member can request the transfer by identifying the accounts stored at the transaction administrator:
 * - If the accounts involved in the requested transfer are known without doubt to the transaction administrator, it is possible to indicate only the type of the account to be credited.
 * - If, on the contrary, more clarity is desired, it is possible to identify the accounts from and to which the funds should be transferred.
 * Note that transfers are processed only when the balance in the account to be debited is sufficient to pass the liquidity transfer instruction and remain positive. Based on the criteria received within the LiquidityDebitTransfer message, the transaction administrator will execute or reject the requested transfer.
 * In principle, the transaction administrator may send a Receipt message as a reply to the liquidity transfer request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityDebitTransferV02", propOrder = {
    "msgId",
    "cdtAcctOwnr",
    "cdtAcct",
    "trfdAmt",
    "dbtAcctOwnr",
    "dbtAcct"
})
public class LiquidityDebitTransferV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "CdtAcctOwnr")
    protected BICIdentification1 cdtAcctOwnr;
    @XmlElement(name = "CdtAcct")
    protected AccountIdentificationDetails cdtAcct;
    @XmlElement(name = "TrfdAmt", required = true)
    protected AmountChoice trfdAmt;
    @XmlElement(name = "DbtAcctOwnr")
    protected BICIdentification1 dbtAcctOwnr;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentificationDetails dbtAcct;

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
    public LiquidityDebitTransferV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the cdtAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getCdtAcctOwnr() {
        return cdtAcctOwnr;
    }

    /**
     * Sets the value of the cdtAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public LiquidityDebitTransferV02 setCdtAcctOwnr(BICIdentification1 value) {
        this.cdtAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the cdtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public AccountIdentificationDetails getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Sets the value of the cdtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public LiquidityDebitTransferV02 setCdtAcct(AccountIdentificationDetails value) {
        this.cdtAcct = value;
        return this;
    }

    /**
     * Gets the value of the trfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountChoice }
     *     
     */
    public AmountChoice getTrfdAmt() {
        return trfdAmt;
    }

    /**
     * Sets the value of the trfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountChoice }
     *     
     */
    public LiquidityDebitTransferV02 setTrfdAmt(AmountChoice value) {
        this.trfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the dbtAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getDbtAcctOwnr() {
        return dbtAcctOwnr;
    }

    /**
     * Sets the value of the dbtAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public LiquidityDebitTransferV02 setDbtAcctOwnr(BICIdentification1 value) {
        this.dbtAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the dbtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public AccountIdentificationDetails getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Sets the value of the dbtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationDetails }
     *     
     */
    public LiquidityDebitTransferV02 setDbtAcct(AccountIdentificationDetails value) {
        this.dbtAcct = value;
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
