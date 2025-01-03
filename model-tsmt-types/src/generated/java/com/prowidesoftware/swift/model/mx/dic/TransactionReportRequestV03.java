
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
 * The TransactionReportRequest message is sent by a party involved in a transaction to the matching application.
 * This message is used to request a report on details of transactions registered in the matching application.
 * Usage
 * The TransactionReportRequest message can be sent by either party involved in a transaction to request a report on a variety of details of all transactions that the requester is involved in. For example, the message can be used to request a report on all transactions that the requester is involved in with a certain customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportRequestV03", propOrder = {
    "reqId",
    "rptSpcfctn"
})
public class TransactionReportRequestV03 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "RptSpcfctn", required = true)
    protected ReportSpecification4 rptSpcfctn;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public TransactionReportRequestV03 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the rptSpcfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSpecification4 }
     *     
     */
    public ReportSpecification4 getRptSpcfctn() {
        return rptSpcfctn;
    }

    /**
     * Sets the value of the rptSpcfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSpecification4 }
     *     
     */
    public TransactionReportRequestV03 setRptSpcfctn(ReportSpecification4 value) {
        this.rptSpcfctn = value;
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
