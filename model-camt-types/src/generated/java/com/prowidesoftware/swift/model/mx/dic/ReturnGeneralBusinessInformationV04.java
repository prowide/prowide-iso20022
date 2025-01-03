
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
 * The ReturnGeneralBusinessInformation message is sent by the transaction administrator to a member of the system. It is used to provide some or all of the members with information related to the processing of the system.
 * The Return General Business Information message can be sent as a response to a related GetGeneralBusinessInformation message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * The transaction administrator can send general business information messages to the members, which may request further action from them. General business information can contain either static data announcing foreseen events affecting the system operations, or dynamic data warning or notifying about unexpected events.
 * This type of information can be transmitted in either of the two following ways:
 * - non-solicited reports are pushed by the transaction administrator to the (selected) members together with a reference, a qualifier and a subject line
 * - upon request from the members (pull mode), the transaction administrator delivers the full text/content of the message back to the user
 * In either case, the message from the transaction administrator can contain information based on the following elements:
 * - subject of the report detailing the purpose and content of the message
 * - details of the report
 * - indication of the priority of the report and of its format. (Note that if the format is indicated, the subject refers to a set of pre-agreed texts. This enumeration has to be agreed upon by the transaction administrator and the members of the system).
 * Additional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnGeneralBusinessInformationV04", propOrder = {
    "msgHdr",
    "rptOrErr"
})
public class ReturnGeneralBusinessInformationV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader3 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected GeneralBusinessOrError3Choice rptOrErr;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader3 }
     *     
     */
    public MessageHeader3 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader3 }
     *     
     */
    public ReturnGeneralBusinessInformationV04 setMsgHdr(MessageHeader3 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessOrError3Choice }
     *     
     */
    public GeneralBusinessOrError3Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessOrError3Choice }
     *     
     */
    public ReturnGeneralBusinessInformationV04 setRptOrErr(GeneralBusinessOrError3Choice value) {
        this.rptOrErr = value;
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
