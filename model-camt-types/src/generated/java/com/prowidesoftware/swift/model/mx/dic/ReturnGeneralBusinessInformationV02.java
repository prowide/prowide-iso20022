
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
@XmlType(name = "ReturnGeneralBusinessInformationV02", propOrder = {
    "msgId",
    "bizQryRef",
    "oprlErr",
    "bizRpt"
})
public class ReturnGeneralBusinessInformationV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "BizQryRef")
    protected QueryReference bizQryRef;
    @XmlElement(name = "OprlErr")
    protected ErrorHandling3 oprlErr;
    @XmlElement(name = "BizRpt")
    protected BusinessInformation2 bizRpt;

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
    public ReturnGeneralBusinessInformationV02 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the bizQryRef property.
     * 
     * @return
     *     possible object is
     *     {@link QueryReference }
     *     
     */
    public QueryReference getBizQryRef() {
        return bizQryRef;
    }

    /**
     * Sets the value of the bizQryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryReference }
     *     
     */
    public ReturnGeneralBusinessInformationV02 setBizQryRef(QueryReference value) {
        this.bizQryRef = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getOprlErr() {
        return oprlErr;
    }

    /**
     * Sets the value of the oprlErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ReturnGeneralBusinessInformationV02 setOprlErr(ErrorHandling3 value) {
        this.oprlErr = value;
        return this;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInformation2 }
     *     
     */
    public BusinessInformation2 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInformation2 }
     *     
     */
    public ReturnGeneralBusinessInformationV02 setBizRpt(BusinessInformation2 value) {
        this.bizRpt = value;
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
