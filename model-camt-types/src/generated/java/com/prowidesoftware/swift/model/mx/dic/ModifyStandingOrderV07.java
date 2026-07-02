
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
@XmlType(name = "ModifyStandingOrderV07", propOrder = {
    "msgHdr",
    "stgOrdrId",
    "newStgOrdrValSet",
    "splmtryData"
})
public class ModifyStandingOrderV07 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification6 stgOrdrId;
    @XmlElement(name = "NewStgOrdrValSet", required = true)
    protected StandingOrder8 newStgOrdrValSet;
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
    public ModifyStandingOrderV07 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification6 }
     *     
     */
    public StandingOrderIdentification6 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification6 }
     *     
     */
    public ModifyStandingOrderV07 setStgOrdrId(StandingOrderIdentification6 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the newStgOrdrValSet property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrder8 }
     *     
     */
    public StandingOrder8 getNewStgOrdrValSet() {
        return newStgOrdrValSet;
    }

    /**
     * Sets the value of the newStgOrdrValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrder8 }
     *     
     */
    public ModifyStandingOrderV07 setNewStgOrdrValSet(StandingOrder8 value) {
        this.newStgOrdrValSet = value;
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
    public ModifyStandingOrderV07 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
