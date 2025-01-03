
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
@XmlType(name = "GetBusinessDayInformationV02", propOrder = {
    "msgId",
    "bizDayInfQryDef"
})
public class GetBusinessDayInformationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "BizDayInfQryDef")
    protected BusinessDayInformationQueryDefinition2 bizDayInfQryDef;

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
    public GetBusinessDayInformationV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the bizDayInfQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayInformationQueryDefinition2 }
     *     
     */
    public BusinessDayInformationQueryDefinition2 getBizDayInfQryDef() {
        return bizDayInfQryDef;
    }

    /**
     * Sets the value of the bizDayInfQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayInformationQueryDefinition2 }
     *     
     */
    public GetBusinessDayInformationV02 setBizDayInfQryDef(BusinessDayInformationQueryDefinition2 value) {
        this.bizDayInfQryDef = value;
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
