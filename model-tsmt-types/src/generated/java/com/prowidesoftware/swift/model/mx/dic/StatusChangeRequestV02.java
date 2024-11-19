
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
 * The StatusChangeRequest message is sent by a party involved in a transaction to the matching application.
 * This message is used to request a change in the status of a transaction.
 * Usage
 * The StatusChangeRequest message can be sent by either party involved in a transaction to the matching application to request a change in the status of a transaction.
 * The matching application will pass on the request by sending a StatusChangeRequestNotification message to the counterparty which can accept or reject the request by sending a SatausChangeRequestAcceptance or StatusChangeRequestRejection message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeRequestV02", propOrder = {
    "reqId",
    "txId",
    "submitrTxRef",
    "reqdSts",
    "reqRsn"
})
public class StatusChangeRequestV02 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "ReqdSts", required = true)
    protected TransactionStatus3 reqdSts;
    @XmlElement(name = "ReqRsn")
    protected Reason2 reqRsn;

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
    public StatusChangeRequestV02 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public StatusChangeRequestV02 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public StatusChangeRequestV02 setSubmitrTxRef(SimpleIdentificationInformation value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the reqdSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus3 }
     *     
     */
    public TransactionStatus3 getReqdSts() {
        return reqdSts;
    }

    /**
     * Sets the value of the reqdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus3 }
     *     
     */
    public StatusChangeRequestV02 setReqdSts(TransactionStatus3 value) {
        this.reqdSts = value;
        return this;
    }

    /**
     * Gets the value of the reqRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Reason2 }
     *     
     */
    public Reason2 getReqRsn() {
        return reqRsn;
    }

    /**
     * Sets the value of the reqRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason2 }
     *     
     */
    public StatusChangeRequestV02 setReqRsn(Reason2 value) {
        this.reqRsn = value;
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
