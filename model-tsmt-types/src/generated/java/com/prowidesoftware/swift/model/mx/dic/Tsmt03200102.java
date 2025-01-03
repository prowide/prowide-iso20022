
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * The StatusExtensionNotification message is sent by the matching application to the parties involved in a request to extend the status of a transaction.
 * This message is used to inform about the acceptance of a request to extend the status of a transaction.
 * Usage
 * The StatusExtensionNotification message can be sent by the matching application
 * - to the submitter of a request to extend the status of a transaction to pass on information about the acceptance of the request that it has obtained through the receipt of an StatusExtensionAcceptance message.
 * - to the accepter of a request to extend the status of a transaction to inform about the actual status of the transaction in response to a StatusExtensionAcceptance message.
 * In order to pass on information about the rejection of a request to extend the status of a transaction the matching application sends a StatusExtensionRejectionNotification message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.032.001.02", propOrder = {
    "ntfctnId",
    "txId",
    "tsuBaselnId",
    "usrTxRef",
    "xtndedSts",
    "reqForActn"
})
public class Tsmt03200102 {

    @XmlElement(name = "NtfctnId", required = true)
    protected MessageIdentification1 ntfctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "TSUBaselnId")
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "UsrTxRef", required = true)
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "XtndedSts", required = true)
    protected TransactionStatus2 xtndedSts;
    @XmlElement(name = "ReqForActn", required = true)
    protected PendingActivity1 reqForActn;

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
    public Tsmt03200102 setNtfctnId(MessageIdentification1 value) {
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
    public Tsmt03200102 setTxId(SimpleIdentificationInformation value) {
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
    public Tsmt03200102 setTSUBaselnId(DocumentIdentification3 value) {
        this.tsuBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usrTxRef property.
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
     * @return
     *     The value of the usrTxRef property.
     */
    public List<DocumentIdentification5> getUsrTxRef() {
        if (usrTxRef == null) {
            usrTxRef = new ArrayList<>();
        }
        return this.usrTxRef;
    }

    /**
     * Gets the value of the xtndedSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus2 }
     *     
     */
    public TransactionStatus2 getXtndedSts() {
        return xtndedSts;
    }

    /**
     * Sets the value of the xtndedSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus2 }
     *     
     */
    public Tsmt03200102 setXtndedSts(TransactionStatus2 value) {
        this.xtndedSts = value;
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
    public Tsmt03200102 setReqForActn(PendingActivity1 value) {
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
    public Tsmt03200102 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

}
