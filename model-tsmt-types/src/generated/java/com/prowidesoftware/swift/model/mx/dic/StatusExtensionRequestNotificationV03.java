
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The StatusExtensionRequestNotification message is sent by the matching application to the party requested to accept or reject a request to extend the status of a transaction.
 * This message is used to notify the request to extend the status of a transaction.
 * Usage
 * The StatusExtensionRequestNotification message can be sent by the matching application to pass on information about the request to extend the status of a transaction that it has obtained through the receipt of a StatusExtensionRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusExtensionRequestNotificationV03", propOrder = {
    "ntfctnId",
    "txId",
    "estblishdBaselnId",
    "usrTxRef",
    "stsToBeXtnded",
    "initr",
    "reqForActn"
})
public class StatusExtensionRequestNotificationV03 {

    @XmlElement(name = "NtfctnId", required = true)
    protected MessageIdentification1 ntfctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "StsToBeXtnded", required = true)
    protected TransactionStatus5 stsToBeXtnded;
    @XmlElement(name = "Initr", required = true)
    protected BICIdentification1 initr;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity2 reqForActn;

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public StatusExtensionRequestNotificationV03 setNtfctnId(MessageIdentification1 value) {
        this.ntfctnId = value;
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
    public StatusExtensionRequestNotificationV03 setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the estblishdBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public DocumentIdentification3 getEstblishdBaselnId() {
        return estblishdBaselnId;
    }

    /**
     * Sets the value of the estblishdBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public StatusExtensionRequestNotificationV03 setEstblishdBaselnId(DocumentIdentification3 value) {
        this.estblishdBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification5 }
     * 
     * 
     */
    public List<DocumentIdentification5> getUsrTxRef() {
        if (usrTxRef == null) {
            usrTxRef = new ArrayList<DocumentIdentification5>();
        }
        return this.usrTxRef;
    }

    /**
     * Gets the value of the stsToBeXtnded property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus5 }
     *     
     */
    public TransactionStatus5 getStsToBeXtnded() {
        return stsToBeXtnded;
    }

    /**
     * Sets the value of the stsToBeXtnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus5 }
     *     
     */
    public StatusExtensionRequestNotificationV03 setStsToBeXtnded(TransactionStatus5 value) {
        this.stsToBeXtnded = value;
        return this;
    }

    /**
     * Gets the value of the initr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getInitr() {
        return initr;
    }

    /**
     * Sets the value of the initr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public StatusExtensionRequestNotificationV03 setInitr(BICIdentification1 value) {
        this.initr = value;
        return this;
    }

    /**
     * Gets the value of the reqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity2 }
     *     
     */
    public PendingActivity2 getReqForActn() {
        return reqForActn;
    }

    /**
     * Sets the value of the reqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity2 }
     *     
     */
    public StatusExtensionRequestNotificationV03 setReqForActn(PendingActivity2 value) {
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

    /**
     * Adds a new item to the usrTxRef list.
     * @see #getUsrTxRef()
     * 
     */
    public StatusExtensionRequestNotificationV03 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

}
