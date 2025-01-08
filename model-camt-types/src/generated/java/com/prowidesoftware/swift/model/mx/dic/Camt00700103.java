
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
 * The Modify Transaction message is sent by a member to the transaction administrator.
 * It is used to request one modification in one payment instruction held at the transaction administrator and sent by the member, debiting or crediting its account at the transaction administrator.
 * Usage
 * Following normal business flows, transactions registered by the transaction administrator may be queued for later settlement (because of insufficient funds available, or because of risk or liquidity limits, etc.). A transaction may have a series of statuses. These can be transient (such as pending or related types) and final (such as rejected, revoked and/or settled).
 * Members of a system need to have information about the payments queue(s) and must have the ability to take action (that is, to cancel or modify the transaction(s) to be settled). Note, however, that actions by a member will always concern transactions in a transient status.
 * For this reason, at any time during the operating hours of the system, the member can request modifications to the features of transient transactions.
 * The member will submit a message requesting modifications in one or more of the following criteria:
 * - instruction given, related to the processing of the transaction
 * - type of payment instructed
 * - priority of payment period in which the payment instruction should be processed (processing validity time)
 * The ModifyTransaction message will contain the new values that the member wants to see applied to the features of the transaction identified in the message.
 * Based on the criteria received within the ModifyTransaction message, the transaction administrator will execute or reject the requested modifications.
 * The transaction administrator may send a Receipt message as a reply to the ModifyTransaction request.
 * To verify the outcome of the request, the member may submit a GetTransaction message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.007.001.03", propOrder = {
    "msgId",
    "instrRef",
    "newPmtValSet"
})
public class Camt00700103 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "InstrRef", required = true)
    protected PaymentIdentification3Choice instrRef;
    @XmlElement(name = "NewPmtValSet", required = true)
    protected PaymentDetails4 newPmtValSet;

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
    public Camt00700103 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the instrRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public PaymentIdentification3Choice getInstrRef() {
        return instrRef;
    }

    /**
     * Sets the value of the instrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public Camt00700103 setInstrRef(PaymentIdentification3Choice value) {
        this.instrRef = value;
        return this;
    }

    /**
     * Gets the value of the newPmtValSet property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails4 }
     *     
     */
    public PaymentDetails4 getNewPmtValSet() {
        return newPmtValSet;
    }

    /**
     * Sets the value of the newPmtValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails4 }
     *     
     */
    public Camt00700103 setNewPmtValSet(PaymentDetails4 value) {
        this.newPmtValSet = value;
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
