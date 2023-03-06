
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "BackupPaymentV06", propOrder = {
    "msgHdr",
    "orgnlMsgId",
    "instrInf",
    "trfdAmt",
    "cdtr",
    "cdtrAgt",
    "dbtrAgt",
    "splmtryData"
})
public class BackupPaymentV06 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "OrgnlMsgId")
    protected MessageHeader1 orgnlMsgId;
    @XmlElement(name = "InstrInf")
    protected PaymentInstruction13 instrInf;
    @XmlElement(name = "TrfdAmt", required = true)
    protected Amount2Choice trfdAmt;
    @XmlElement(name = "Cdtr", required = true)
    protected SystemMember2 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected SystemMember2 cdtrAgt;
    @XmlElement(name = "DbtrAgt")
    protected SystemMember2 dbtrAgt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public BackupPaymentV06 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public BackupPaymentV06 setOrgnlMsgId(MessageHeader1 value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the instrInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction13 }
     *     
     */
    public PaymentInstruction13 getInstrInf() {
        return instrInf;
    }

    /**
     * Sets the value of the instrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction13 }
     *     
     */
    public BackupPaymentV06 setInstrInf(PaymentInstruction13 value) {
        this.instrInf = value;
        return this;
    }

    /**
     * Gets the value of the trfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getTrfdAmt() {
        return trfdAmt;
    }

    /**
     * Sets the value of the trfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public BackupPaymentV06 setTrfdAmt(Amount2Choice value) {
        this.trfdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMember2 }
     *     
     */
    public SystemMember2 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMember2 }
     *     
     */
    public BackupPaymentV06 setCdtr(SystemMember2 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMember2 }
     *     
     */
    public SystemMember2 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMember2 }
     *     
     */
    public BackupPaymentV06 setCdtrAgt(SystemMember2 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemMember2 }
     *     
     */
    public SystemMember2 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMember2 }
     *     
     */
    public BackupPaymentV06 setDbtrAgt(SystemMember2 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public BackupPaymentV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
