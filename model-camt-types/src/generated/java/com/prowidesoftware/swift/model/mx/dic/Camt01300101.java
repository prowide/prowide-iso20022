
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
@XmlType(name = "camt.013.001.01", propOrder = {
    "msgId",
    "mmbQryDef"
})
public class Camt01300101 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "MmbQryDef")
    protected MemberQueryDefinition mmbQryDef;

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
    public Camt01300101 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the mmbQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link MemberQueryDefinition }
     *     
     */
    public MemberQueryDefinition getMmbQryDef() {
        return mmbQryDef;
    }

    /**
     * Sets the value of the mmbQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberQueryDefinition }
     *     
     */
    public Camt01300101 setMmbQryDef(MemberQueryDefinition value) {
        this.mmbQryDef = value;
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
