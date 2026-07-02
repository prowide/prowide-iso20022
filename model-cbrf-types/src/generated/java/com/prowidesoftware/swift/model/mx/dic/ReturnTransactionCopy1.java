
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
 * The ReturnTransaction message is sent by the transaction administrator to a member of the system.
 * It is used to provide information on transactions and booked entries held at the transaction administrator.
 * The Return Transaction message can be sent as a response to a related GetTransaction message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnTransactionCopy1", propOrder = {
    "msgHdr",
    "rptOrErr"
})
public class ReturnTransactionCopy1 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader5 msgHdr;
    @XmlElement(name = "RptOrErr", required = true)
    protected TransactionReportOrError2Choice rptOrErr;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader5 }
     *     
     */
    public MessageHeader5 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader5 }
     *     
     */
    public ReturnTransactionCopy1 setMsgHdr(MessageHeader5 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReportOrError2Choice }
     *     
     */
    public TransactionReportOrError2Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReportOrError2Choice }
     *     
     */
    public ReturnTransactionCopy1 setRptOrErr(TransactionReportOrError2Choice value) {
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
