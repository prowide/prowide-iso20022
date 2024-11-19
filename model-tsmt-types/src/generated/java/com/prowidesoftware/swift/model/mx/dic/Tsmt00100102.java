
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
 * The Acknowledgement message is sent by the matching application to the party from which it received a message.
 * This message is used to acknowledge the receipt of a message by the matching application.
 * Usage
 * The Acknowledgement message can be sent to a party from which the matching application received a message to acknowledge the receipt of that message. The message is sent when the matching application does not send any other message in response to a received message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.001.001.02", propOrder = {
    "ackId",
    "txId",
    "tsuBaselnId",
    "txSts",
    "usrTxRef",
    "ackdMsgRef",
    "reqForActn"
})
public class Tsmt00100102 {

    @XmlElement(name = "AckId", required = true)
    protected MessageIdentification1 ackId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "TSUBaselnId")
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus1 txSts;
    @XmlElement(name = "UsrTxRef", required = true)
    protected DocumentIdentification5 usrTxRef;
    @XmlElement(name = "AckdMsgRef", required = true)
    protected MessageIdentification1 ackdMsgRef;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity1 reqForActn;

    /**
     * Gets the value of the ackId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAckId() {
        return ackId;
    }

    /**
     * Sets the value of the ackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt00100102 setAckId(MessageIdentification1 value) {
        this.ackId = value;
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
    public Tsmt00100102 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the tsuBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public DocumentIdentification3 getTSUBaselnId() {
        return tsuBaselnId;
    }

    /**
     * Sets the value of the tsuBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public Tsmt00100102 setTSUBaselnId(DocumentIdentification3 value) {
        this.tsuBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus1 }
     *     
     */
    public TransactionStatus1 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus1 }
     *     
     */
    public Tsmt00100102 setTxSts(TransactionStatus1 value) {
        this.txSts = value;
        return this;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public DocumentIdentification5 getUsrTxRef() {
        return usrTxRef;
    }

    /**
     * Sets the value of the usrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification5 }
     *     
     */
    public Tsmt00100102 setUsrTxRef(DocumentIdentification5 value) {
        this.usrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the ackdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAckdMsgRef() {
        return ackdMsgRef;
    }

    /**
     * Sets the value of the ackdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt00100102 setAckdMsgRef(MessageIdentification1 value) {
        this.ackdMsgRef = value;
        return this;
    }

    /**
     * Gets the value of the reqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity1 }
     *     
     */
    public PendingActivity1 getReqForActn() {
        return reqForActn;
    }

    /**
     * Sets the value of the reqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity1 }
     *     
     */
    public Tsmt00100102 setReqForActn(PendingActivity1 value) {
        this.reqForActn = value;
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
