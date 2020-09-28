
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
 * The GetMember message is sent by a member to the transaction administrator.
 * It is used to request information on static data maintained by the transaction administrator and related to the participants in the system and their membership status vis-a-vis this system.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can refer to information about the membership of the system.
 * At any time during the operating hours of the system, the member can query the transaction administrator to get information about the static data related to the members of the system.
 * The member can request information based on the following elements:
 * - identification of the member within the system
 * - membership status
 * - type of member
 * - contact details for the member: name, address
 * - account number of the member
 * - identification of contact persons for the member
 * This message will be replied to by a ReturnMember message.
 * Additional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMemberV04", propOrder = {
    "msgHdr",
    "mmbQryDef",
    "splmtryData"
})
public class GetMemberV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader9 msgHdr;
    @XmlElement(name = "MmbQryDef")
    protected MemberQueryDefinition4 mmbQryDef;
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
    public GetMemberV04 setMsgHdr(MessageHeader9 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the mmbQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link MemberQueryDefinition4 }
     *     
     */
    public MemberQueryDefinition4 getMmbQryDef() {
        return mmbQryDef;
    }

    /**
     * Sets the value of the mmbQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberQueryDefinition4 }
     *     
     */
    public GetMemberV04 setMmbQryDef(MemberQueryDefinition4 value) {
        this.mmbQryDef = value;
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
    public GetMemberV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
