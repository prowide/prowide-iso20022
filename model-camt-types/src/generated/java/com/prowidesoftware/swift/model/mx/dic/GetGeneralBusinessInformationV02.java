
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
 * The GetGeneralBusinessInformation message is sent by a member to the transaction administrator.
 * It is used to request information on a broadcast-type message previously sent by the transaction administrator to all or some of the members, giving information related to the processing business.
 * Usage
 * The transaction administrator can send general business information messages to the members, which may request further action from them. General business information can contain either static data announcing foreseen events affecting the system operations, or dynamic data warning or notifying about unexpected events.
 * This type of information can be transmitted in either of the two following ways:
 * - non-solicited reports are pushed by the transaction administrator to the (selected) members together with a reference, a qualifier and a subject line
 * - upon request from the members (pull mode), the transaction administrator delivers the full text/content of the message back to the user
 * The Get General Business Information message is used in this second context. At any time during the operating hours of the system, the member can query the transaction administrator to get information about a report of general business information previously sent.
 * The member can request information based on the following elements:
 * - reference of the report previously delivered
 * - subject of the report previously delivered, detailing the purpose and content of the message
 * - priority of the report previously sent, and indication of its format. (Note that if the format is indicated, the subject refers to a set of pre-agreed texts. This enumeration has to be agreed upon by the transaction administrator and the members of the system.)
 * - details of the previously sent message
 * This message will be replied to by a ReturnGeneralBusinessInformation message.
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGeneralBusinessInformationV02", propOrder = {
    "msgId",
    "gnlBizInfQryDef"
})
public class GetGeneralBusinessInformationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "GnlBizInfQryDef")
    protected BusinessInformationQueryDefinition2 gnlBizInfQryDef;

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
    public GetGeneralBusinessInformationV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the gnlBizInfQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInformationQueryDefinition2 }
     *     
     */
    public BusinessInformationQueryDefinition2 getGnlBizInfQryDef() {
        return gnlBizInfQryDef;
    }

    /**
     * Sets the value of the gnlBizInfQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInformationQueryDefinition2 }
     *     
     */
    public GetGeneralBusinessInformationV02 setGnlBizInfQryDef(BusinessInformationQueryDefinition2 value) {
        this.gnlBizInfQryDef = value;
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
