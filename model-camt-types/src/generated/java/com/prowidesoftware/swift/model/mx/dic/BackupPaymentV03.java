
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
 * The BackupPayment message is sent by a member to the transaction administrator.
 * It is used to request a liquidity transfer from the member to another participant in the system when the user is in recovery mode.
 * Usage
 * Under very specific circumstances, the transaction administrator can accept direct input of transactions as part of its cash management functionalities. This possibility is available only when a declared incident has been reported to the transaction administrator This could be the case, for example, when the internal systems of the member are having problems sending out payments or when the continuity of the whole system is put at risk.
 * The purpose of the BackupPayment message is to prevent the consequences of a specific failure affecting not only the member experiencing problems but also its counterparties. Members can therefore input transactions directly in order to ensure the stability of the system and smooth exchanges.
 * At any time during the operating hours of the system, and under the agreed circumstances, the member can request a backup payment to be effected.
 * The member can request the transfer by identifying the following elements:
 * - party (account owner) that will receive the funds
 * - the financial institution that will receive the funds on behalf of the account owner
 * Based on the criteria received within the BackupPayment message, the transaction administrator will execute or reject the requested funds transfer.
 * The transaction administrator may send a Receipt message as a reply to the BackupPayment request.
 * To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackupPaymentV03", propOrder = {
    "msgId",
    "pmtInstrRef",
    "instrInf",
    "trfdAmt",
    "cdtr",
    "fnlAgt",
    "frstAgt"
})
public class BackupPaymentV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "PmtInstrRef")
    protected MessageIdentification pmtInstrRef;
    @XmlElement(name = "InstrInf")
    protected PaymentInstructionInformation instrInf;
    @XmlElement(name = "TrfdAmt", required = true)
    protected AmountChoice trfdAmt;
    @XmlElement(name = "Cdtr", required = true)
    protected SystemDetails1 cdtr;
    @XmlElement(name = "FnlAgt")
    protected SystemDetails1 fnlAgt;
    @XmlElement(name = "FrstAgt")
    protected SystemDetails1 frstAgt;

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
    public BackupPaymentV03 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public BackupPaymentV03 setPmtInstrRef(MessageIdentification value) {
        this.pmtInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the instrInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstructionInformation }
     *     
     */
    public PaymentInstructionInformation getInstrInf() {
        return instrInf;
    }

    /**
     * Sets the value of the instrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstructionInformation }
     *     
     */
    public BackupPaymentV03 setInstrInf(PaymentInstructionInformation value) {
        this.instrInf = value;
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
    public BackupPaymentV03 setTrfdAmt(AmountChoice value) {
        this.trfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails1 }
     *     
     */
    public SystemDetails1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails1 }
     *     
     */
    public BackupPaymentV03 setCdtr(SystemDetails1 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the fnlAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails1 }
     *     
     */
    public SystemDetails1 getFnlAgt() {
        return fnlAgt;
    }

    /**
     * Sets the value of the fnlAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails1 }
     *     
     */
    public BackupPaymentV03 setFnlAgt(SystemDetails1 value) {
        this.fnlAgt = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails1 }
     *     
     */
    public SystemDetails1 getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails1 }
     *     
     */
    public BackupPaymentV03 setFrstAgt(SystemDetails1 value) {
        this.frstAgt = value;
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
