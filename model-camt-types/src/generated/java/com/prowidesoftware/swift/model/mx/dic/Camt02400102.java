
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
 * The ModifyStandingOrder message is sent by a member to the transaction administrator.
 * It is used to request a change in the features of a permanent order for the transfer of funds between two accounts belonging to the same member and being held at the transaction administrator.
 * Usage
 * Standing orders trigger a transfer of funds between two accounts belonging to the member in the books of the transaction administrator.
 * Standing orders are permanent transfer orders input by the member into the system. They allow the member to move funds from outside the system into its accounts with the transaction administrator that are used for specific purposes (for example, the settlement account for RTGS operations), objective of these transfers being for example to provide sufficient liquidity for the start of operations at the beginning of the business day.
 * The standing order may be pre-set by the system and the necessary amount necessary left to the discretion of the members, or the transaction administrator may effect a calculation and a call for funds for efficient use of the liquidity.
 * The standing order can be modified at any time during the operating hours of the system and comes into force the next day. When set, the new value becomes the default value for subsequent working days.
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
 * The transaction administrator may send a Receipt message as a reply to the Modify Standing Order request. To verify the outcome of the request, the member may submit a GetTransaction or GetAccount message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.024.001.02", propOrder = {
    "msgId",
    "stgOrdrId",
    "newStgOrdrValSet"
})
public class Camt02400102 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification1 stgOrdrId;
    @XmlElement(name = "NewStgOrdrValSet", required = true)
    protected StandingOrderDetails1 newStgOrdrValSet;

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
    public Camt02400102 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification1 }
     *     
     */
    public StandingOrderIdentification1 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification1 }
     *     
     */
    public Camt02400102 setStgOrdrId(StandingOrderIdentification1 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the newStgOrdrValSet property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderDetails1 }
     *     
     */
    public StandingOrderDetails1 getNewStgOrdrValSet() {
        return newStgOrdrValSet;
    }

    /**
     * Sets the value of the newStgOrdrValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderDetails1 }
     *     
     */
    public Camt02400102 setNewStgOrdrValSet(StandingOrderDetails1 value) {
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
