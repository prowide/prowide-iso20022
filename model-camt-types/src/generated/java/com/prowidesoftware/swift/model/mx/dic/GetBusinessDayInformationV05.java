
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
 * The GetBusinessDayInformation message is sent by a member to the transaction administrator.
 * It is used to request information on different types of administrative data linked to the system.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business day information covers all information related to the management of the system, not related to the transactions created in the system. The type of business day information available can vary depending on the system.
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the static data of the system.
 * The member can request information based on the following elements:
 * - identification of the system
 * - currency within the system concerned
 * - status of the system
 * - period of availability of a given currency linked to the system concerned (in case the system handles more than one currency)
 * - closure information (dates when the system will be inactive and reasons for this inactivity)
 * - event indicator (types of event and precise timing of their occurrence within the system concerned)
 * This message will be replied to by a ReturnBusinessDayInformation message. Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessDayInformationV05", propOrder = {
    "msgHdr",
    "bizDayInfQryDef",
    "splmtryData"
})
public class GetBusinessDayInformationV05 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader9 msgHdr;
    @XmlElement(name = "BizDayInfQryDef")
    protected BusinessDayQuery2 bizDayInfQryDef;
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
    public GetBusinessDayInformationV05 setMsgHdr(MessageHeader9 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the bizDayInfQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayQuery2 }
     *     
     */
    public BusinessDayQuery2 getBizDayInfQryDef() {
        return bizDayInfQryDef;
    }

    /**
     * Sets the value of the bizDayInfQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayQuery2 }
     *     
     */
    public GetBusinessDayInformationV05 setBizDayInfQryDef(BusinessDayQuery2 value) {
        this.bizDayInfQryDef = value;
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
    public GetBusinessDayInformationV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
