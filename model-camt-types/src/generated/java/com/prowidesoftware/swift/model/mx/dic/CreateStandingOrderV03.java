
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
 * The CreateStandingOrder message is sent by a member to the transaction administrator.
 * It is used to create a permanent order for the transfer of funds between two accounts belonging to the same member and being held at the transaction administrator.
 * Usage
 * Based on the criteria defined in the CreateStandingOrder message, the transaction administrator will execute or reject the requested creation and respond with a Receipt message as a reply to the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateStandingOrderV03", propOrder = {
    "msgHdr",
    "stgOrdrId",
    "valSet",
    "splmtryData"
})
public class CreateStandingOrderV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification8 stgOrdrId;
    @XmlElement(name = "ValSet", required = true)
    protected StandingOrder10 valSet;
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
    public CreateStandingOrderV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification8 }
     *     
     */
    public StandingOrderIdentification8 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification8 }
     *     
     */
    public CreateStandingOrderV03 setStgOrdrId(StandingOrderIdentification8 value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the valSet property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrder10 }
     *     
     */
    public StandingOrder10 getValSet() {
        return valSet;
    }

    /**
     * Sets the value of the valSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrder10 }
     *     
     */
    public CreateStandingOrderV03 setValSet(StandingOrder10 value) {
        this.valSet = value;
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
    public CreateStandingOrderV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
