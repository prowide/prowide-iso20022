
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
 * The ModifyMember message is sent by a member to the transaction administrator.
 * It is used to request modifications to the static data related to the profile of a member that the transaction administrator maintains.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business information covers all information related to the management of the system, that is, not related to the transactions entered into the system. The type of business information available can vary depending on the system. Among other things, it can , refer to information about the membership of the system.
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
@XmlType(name = "camt.015.001.01", propOrder = {
    "msgId",
    "mmbId",
    "newMmbValSet"
})
public class Camt01500101 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "MmbId", required = true)
    protected MemberIdentificationChoice mmbId;
    @XmlElement(name = "NewMmbValSet", required = true)
    protected MemberDetails1 newMmbValSet;

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
    public Camt01500101 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public MemberIdentificationChoice getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberIdentificationChoice }
     *     
     */
    public Camt01500101 setMmbId(MemberIdentificationChoice value) {
        this.mmbId = value;
        return this;
    }

    /**
     * Gets the value of the newMmbValSet property.
     * 
     * @return
     *     possible object is
     *     {@link MemberDetails1 }
     *     
     */
    public MemberDetails1 getNewMmbValSet() {
        return newMmbValSet;
    }

    /**
     * Sets the value of the newMmbValSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberDetails1 }
     *     
     */
    public Camt01500101 setNewMmbValSet(MemberDetails1 value) {
        this.newMmbValSet = value;
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
