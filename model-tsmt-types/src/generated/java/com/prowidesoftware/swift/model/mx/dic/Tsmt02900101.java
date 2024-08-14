
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
 * The StatusChangeRequestRejection message is sent by the party requested to accept or reject the request of a change in the status of a transaction to the matching application.
 * This message is used to inform about the rejection of a request to change the status of a transaction.
 * Usage
 * The StatusChangeRequestRejection message can be sent by the party requested to accept or reject a request to change the status of a transaction to inform that it rejects the request.
 * The message can be sent in response to a StatusChangeRequestNotification message.
 * The acceptance of a request to change the status of a transaction can be achieved by sending a StatusChangeRequestAcceptance message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.029.001.01", propOrder = {
    "rjctnId",
    "txId",
    "submitrTxRef",
    "rjctdStsChng",
    "rjctnRsn"
})
public class Tsmt02900101 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef", required = true)
    protected DocumentIdentification5 submitrTxRef;
    @XmlElement(name = "RjctdStsChng", required = true)
    protected TransactionStatus3 rjctdStsChng;
    @XmlElement(name = "RjctnRsn", required = true)
    protected Reason2 rjctnRsn;

    /**
     * Gets the value of the rjctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctnId() {
        return rjctnId;
    }

    /**
     * Sets the value of the rjctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt02900101 setRjctnId(MessageIdentification1 value) {
        this.rjctnId = value;
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
    public Tsmt02900101 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public DocumentIdentification5 getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public Tsmt02900101 setSubmitrTxRef(DocumentIdentification5 value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the rjctdStsChng property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus3 }
     *     
     */
    public TransactionStatus3 getRjctdStsChng() {
        return rjctdStsChng;
    }

    /**
     * Sets the value of the rjctdStsChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus3 }
     *     
     */
    public Tsmt02900101 setRjctdStsChng(TransactionStatus3 value) {
        this.rjctdStsChng = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Reason2 }
     *     
     */
    public Reason2 getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason2 }
     *     
     */
    public Tsmt02900101 setRjctnRsn(Reason2 value) {
        this.rjctnRsn = value;
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
