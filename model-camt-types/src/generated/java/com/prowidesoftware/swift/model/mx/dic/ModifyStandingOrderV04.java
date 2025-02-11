
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
 * The ModifyStandingOrder message is sent by a member to the transaction administrator.
 * It is used to request a change in the features of a permanent order for the transfer of funds between two accounts belonging to the same member and being held at the transaction administrator.
 * Usage
 * There should be one standing order per (direct) member and per business day. The ModifyStandingOrder message must not be used to request a transfer of funds between accounts during the working day. The liquidity transfer messages must be used for this purpose. There is no need to have a standing order to empty the settlement account at the end of the day and transfer the funds to the current account. For liquidity savings purposes, systems will effect the necessary transfers automatically when and where relevant.
 * The ModifyStandingOrder message first identifies the standing order to be modified and then provide the details of the new standing order. The elements that can be modified are:
 * - amount
 * - account to be credited
 * - account to be debited
 * - account owner (for on behalf scenario)
 * - frequency of payment
 * - daytime or overnight processing
 * - dates when the standing order begins and ceases to be effective
 * Based on the criteria received within the ModifyStandingOrder message, the transaction administrator will execute or reject the requested modifications.
 * The transaction administrator may send a Receipt message as a reply to the Modify Standing Order request. To verify the outcome of the request, the member may submit a GetStandingOrder message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyStandingOrderV04", propOrder = {
    "msgHdr",
    "stgOrdrId",
    "newStgOrdrValSet"
})
public class ModifyStandingOrderV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification2 stgOrdrId;
    @XmlElement(name = "NewStgOrdrValSet", required = true)
    protected StandingOrder1 newStgOrdrValSet;

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
    public ModifyStandingOrderV04 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification2 }
     *     
     */
    public StandingOrderIdentification2 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification2 }
     *     
     */
    public ModifyStandingOrderV04 setStgOrdrId(StandingOrderIdentification2 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the newStgOrdrValSet property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrder1 }
     *     
     */
    public StandingOrder1 getNewStgOrdrValSet() {
        return newStgOrdrValSet;
    }

    /**
     * Sets the value of the newStgOrdrValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrder1 }
     *     
     */
    public ModifyStandingOrderV04 setNewStgOrdrValSet(StandingOrder1 value) {
        this.newStgOrdrValSet = value;
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
