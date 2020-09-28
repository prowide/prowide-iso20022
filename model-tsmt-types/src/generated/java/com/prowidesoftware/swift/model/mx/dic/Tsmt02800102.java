
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
 * The StatusChangeRequestNotification message is sent by the matching application to the party requested to accept or reject the request of a change in the status of a transaction.
 * This message is used to notify the request of a change in the status of a transaction.
 * Usage
 * The StatusChangeRequestNotification message can be sent by the matching application to pass on the information about the request of a change in the status of a transaction that it has obtained through the receipt of a StatusChangeRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.028.001.02", propOrder = {
    "ntfctnId",
    "txId",
    "tsuBaselnId",
    "txSts",
    "usrTxRef",
    "propsdStsChng",
    "reqRsn",
    "reqForActn"
})
public class Tsmt02800102 {

    @XmlElement(name = "NtfctnId", required = true)
    protected MessageIdentification1 ntfctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "TSUBaselnId")
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus1 txSts;
    @XmlElement(name = "UsrTxRef", required = true)
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "PropsdStsChng", required = true)
    protected TransactionStatus3 propsdStsChng;
    @XmlElement(name = "ReqRsn")
    protected Reason2 reqRsn;
    @XmlElement(name = "ReqForActn")
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
    public Tsmt02800102 setNtfctnId(MessageIdentification1 value) {
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
    public Tsmt02800102 setTxId(SimpleIdentificationInformation value) {
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
    public Tsmt02800102 setTSUBaselnId(DocumentIdentification3 value) {
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
    public Tsmt02800102 setTxSts(TransactionStatus1 value) {
        this.txSts = value;
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
     * Gets the value of the propsdStsChng property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus3 }
     *     
     */
    public TransactionStatus3 getPropsdStsChng() {
        return propsdStsChng;
    }

    /**
     * Sets the value of the propsdStsChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus3 }
     *     
     */
    public Tsmt02800102 setPropsdStsChng(TransactionStatus3 value) {
        this.propsdStsChng = value;
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
    public Tsmt02800102 setReqRsn(Reason2 value) {
        this.reqRsn = value;
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
    public Tsmt02800102 setReqForActn(PendingActivity1 value) {
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
    public Tsmt02800102 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

}
