
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
 * The GetStandingOrder message is sent by a member to the transaction administrator.
 * It is used to request information on the details of one or more standing orders, based on specific request criteria, especially to query the amount of the overall liquidity available. It will allow to query both reserved liquidity and liquidity available for normal operations.
 * Usage
 * The member can request information based on the following elements: 
 * - individual standing orders (predefined or standing liquidity transfer orders)
 * - amount
 * - account to be credited
 * - account to be debited
 * - account owner (for on behalf scenario)
 * - frequency of payment
 * - daytime or overnight processing
 * - dates when the standing order begins and ceases to be effective
 * This message will be answered by a ReturnStandingOrder message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStandingOrderV04", propOrder = {
    "msgHdr",
    "stgOrdrQryDef",
    "splmtryData"
})
public class GetStandingOrderV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader4 msgHdr;
    @XmlElement(name = "StgOrdrQryDef")
    protected StandingOrderQuery4 stgOrdrQryDef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader4 }
     *     
     */
    public MessageHeader4 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader4 }
     *     
     */
    public GetStandingOrderV04 setMsgHdr(MessageHeader4 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderQuery4 }
     *     
     */
    public StandingOrderQuery4 getStgOrdrQryDef() {
        return stgOrdrQryDef;
    }

    /**
     * Sets the value of the stgOrdrQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderQuery4 }
     *     
     */
    public GetStandingOrderV04 setStgOrdrQryDef(StandingOrderQuery4 value) {
        this.stgOrdrQryDef = value;
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
    public GetStandingOrderV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
