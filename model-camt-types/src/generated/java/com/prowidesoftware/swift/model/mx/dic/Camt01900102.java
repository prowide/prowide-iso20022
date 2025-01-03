
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
 * The ReturnBusinessDayInformation message is sent by the transaction administrator to a member of the system.
 * It is used to provide information on different types of administrative data linked to the system.
 * The ReturnBusinessDayInformation message can be sent as a response to a related GetBusines DayInformation message (pull mode), or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * Usage
 * The transaction administrator is in charge of providing the members with business information. The term business day information covers all information related to the management of the system, that is, not related to the transactions or requests created in the system. The type of business information available can vary depending on the system.
 * The member can request information about the static data of the system through a series of criteria, corresponding to the known information stored within the transaction administrator. Based on the criteria received within the request, the transaction administrator will select items that match the request and report them to the requester.
 * The transaction administrator may also send a ReturnBusinessDayInformation message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.
 * The message from the transaction administrator can contain information based on the following elements:
 * - identification of the system
 * - status of the system and period in which this status is valid
 * - currency within the system concerned and details of the hours of availability linked to that particular currency
 * - events related to the functioning of the system and the timing of their occurrence
 * Additional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.019.001.02", propOrder = {
    "msgId",
    "bizQryRef",
    "oprlErr",
    "bizRpt"
})
public class Camt01900102 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "BizQryRef")
    protected QueryReference bizQryRef;
    @XmlElement(name = "OprlErr")
    protected ErrorHandling2 oprlErr;
    @XmlElement(name = "BizRpt")
    protected BusinessDayInformation1 bizRpt;

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
    public Camt01900102 setMsgId(MessageIdentification value) {
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
    public Camt01900102 setBizQryRef(QueryReference value) {
        this.bizQryRef = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling2 }
     *     
     */
    public ErrorHandling2 getOprlErr() {
        return oprlErr;
    }

    /**
     * Sets the value of the oprlErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling2 }
     *     
     */
    public Camt01900102 setOprlErr(ErrorHandling2 value) {
        this.oprlErr = value;
        return this;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayInformation1 }
     *     
     */
    public BusinessDayInformation1 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayInformation1 }
     *     
     */
    public Camt01900102 setBizRpt(BusinessDayInformation1 value) {
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
