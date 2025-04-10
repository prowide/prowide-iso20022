
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
 * The ModifyMember message is sent by a member to the transaction administrator.
 * It is used to request modifications to the static data related to the profile of a member that the transaction administrator maintains.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can, refer to information about the membership of the system.
 * At any time during the operating hours of the system, the member can request the transaction administrator to modify the information it maintains about the member.
 * The member will submit a message requesting modifications in one or more of the following criteria:
 * - identification of the member
 * - contact information for the member organization: postal address, e-mail address, telephone or fax number
 * - identification of contact persons for the member, their role and/or details (postal address, e-mail address, telephone or fax number)
 * Based on the criteria received within the Modify Member message, the transaction administrator will execute or reject the requested modifications.
 * In principle, the transaction administrator may send a Receipt message as a reply to the ModifyMember request. To verify the outcome of the request, the member may submit a GetMember message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyMemberV03", propOrder = {
    "msgHdr",
    "mmbId",
    "newMmbValSet",
    "splmtryData"
})
public class ModifyMemberV03 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentification2Choice mmbId;
    @XmlElement(name = "NewMmbValSet", required = true)
    protected Member3 newMmbValSet;
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
    public ModifyMemberV03 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentification2Choice }
     *     
     */
    public MemberIdentification2Choice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentification2Choice }
     *     
     */
    public ModifyMemberV03 setMmbId(MemberIdentification2Choice value) {
        this.mmbId = value;
        return this;
    }

    /**
     * Gets the value of the newMmbValSet property.
     * 
     * @return
     *     possible object is
     *     {@link Member3 }
     *     
     */
    public Member3 getNewMmbValSet() {
        return newMmbValSet;
    }

    /**
     * Sets the value of the newMmbValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member3 }
     *     
     */
    public ModifyMemberV03 setNewMmbValSet(Member3 value) {
        this.newMmbValSet = value;
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
    public ModifyMemberV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
