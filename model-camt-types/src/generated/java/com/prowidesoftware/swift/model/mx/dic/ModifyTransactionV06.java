
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The ModifyTransaction message is sent by a member to the transaction administrator.
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
@XmlType(name = "ModifyTransactionV06", propOrder = {
    "msgHdr",
    "mod"
})
public class ModifyTransactionV06 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "Mod", required = true)
    protected List<TransactionModification3> mod;

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
    public ModifyTransactionV06 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionModification3 }
     * 
     * 
     */
    public List<TransactionModification3> getMod() {
        if (mod == null) {
            mod = new ArrayList<TransactionModification3>();
        }
        return this.mod;
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
     * Adds a new item to the mod list.
     * @see #getMod()
     * 
     */
    public ModifyTransactionV06 addMod(TransactionModification3 mod) {
        getMod().add(mod);
        return this;
    }

}
