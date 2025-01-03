
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
 * The CancelTransaction message is sent by a member to the transaction administrator.
 * It is used to request the cancellation of one payment instruction held at the transaction administrator and sent by the member.
 * Usage
 * Following normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types), final (such as rejected, revoked and/or settled) or the status may even be defined as a proprietary status.
 * Members of a system need to have information about the payments queue(s), and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.
 * For this reason, at any time during the operating hours of the system, the member can request the cancellation of a transaction that has not received a final status.
 * The member will submit a CancelTransaction message containing the identification of the transaction to be cancelled.
 * Based on the criteria received within the CancelTransaction message, the transaction administrator will execute or reject the requested cancellation.
 * The transaction administrator may send a Receipt message as a reply to the CancelTransaction request.
 * To verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelTransactionV10", propOrder = {
    "msgHdr",
    "pmtId",
    "cshAcct",
    "cxlRsn",
    "splmtryData"
})
public class CancelTransactionV10 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader9 msgHdr;
    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification7Choice pmtId;
    @XmlElement(name = "CshAcct")
    protected CashAccount40 cshAcct;
    @XmlElement(name = "CxlRsn")
    protected PaymentCancellationReason5 cxlRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader9 }
     *     
     */
    public MessageHeader9 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader9 }
     *     
     */
    public CancelTransactionV10 setMsgHdr(MessageHeader9 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification7Choice }
     *     
     */
    public PaymentIdentification7Choice getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification7Choice }
     *     
     */
    public CancelTransactionV10 setPmtId(PaymentIdentification7Choice value) {
        this.pmtId = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public CancelTransactionV10 setCshAcct(CashAccount40 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCancellationReason5 }
     *     
     */
    public PaymentCancellationReason5 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCancellationReason5 }
     *     
     */
    public CancelTransactionV10 setCxlRsn(PaymentCancellationReason5 value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CancelTransactionV10 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
