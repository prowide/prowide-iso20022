
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
 * Additional information on the generic design of the Get/Return messages can be found in the MDR Part 1 section How to Use the Cash Management Messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnBusinessDayInformationV04", propOrder = {
    "msgHdr",
    "rptOrErr"
})
public class ReturnBusinessDayInformationV04 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader3 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected BusinessDayReportOrError1Choice rptOrErr;

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
    public ReturnBusinessDayInformationV04 setMsgHdr(MessageHeader3 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayReportOrError1Choice }
     *     
     */
    public BusinessDayReportOrError1Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayReportOrError1Choice }
     *     
     */
    public ReturnBusinessDayInformationV04 setRptOrErr(BusinessDayReportOrError1Choice value) {
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
