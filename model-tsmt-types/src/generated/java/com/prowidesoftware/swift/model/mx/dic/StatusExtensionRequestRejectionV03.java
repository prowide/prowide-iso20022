
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
 * Scope
 * The StatusExtensionRequestRejection message is sent by the party requested to accept or reject a request to extend the status of a transaction to the matching application.
 * This message is used to inform about the rejection of a request to extend the status of a transaction.
 * Usage
 * The StatusExtensionRequestRejection message can be sent by the party requested to accept or reject the request to extend the status of a transaction to inform that it rejects the request.
 * The message can be sent in response to a StatusExtensionRequestNotification message.
 * The acceptance of a request to extend the status of a transaction can be achieved by sending a StatusExtensionRequestAcceptance message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusExtensionRequestRejectionV03", propOrder = {
    "rjctnId",
    "txId",
    "submitrTxRef",
    "stsNotToBeXtnded",
    "rjctnRsn"
})
public class StatusExtensionRequestRejectionV03 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "StsNotToBeXtnded", required = true)
    protected TransactionStatus4 stsNotToBeXtnded;
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
    public StatusExtensionRequestRejectionV03 setRjctnId(MessageIdentification1 value) {
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
    public StatusExtensionRequestRejectionV03 setTxId(SimpleIdentificationInformation value) {
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
    public StatusExtensionRequestRejectionV03 setSubmitrTxRef(SimpleIdentificationInformation value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the stsNotToBeXtnded property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus4 }
     *     
     */
    public TransactionStatus4 getStsNotToBeXtnded() {
        return stsNotToBeXtnded;
    }

    /**
     * Sets the value of the stsNotToBeXtnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus4 }
     *     
     */
    public StatusExtensionRequestRejectionV03 setStsNotToBeXtnded(TransactionStatus4 value) {
        this.stsNotToBeXtnded = value;
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
    public StatusExtensionRequestRejectionV03 setRjctnRsn(Reason2 value) {
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
