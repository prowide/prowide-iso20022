
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
 * The ErrorReport message is sent by the matching application to the party from which it received a message.
 * This message is used to inform about the inability of the matching application to process a received message.
 * Usage
 * The ErrorReport message can be sent to a party from which the matching application received a message to inform about its inability to process the received message because
 * - the syntax of the message is incorrect,or
 * - the message content is inconsistent,or
 * - according to the workflow implemented in the matching application, it did not expect the received message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.016.001.02", propOrder = {
    "rptId",
    "txId",
    "tsuBaselnId",
    "txSts",
    "usrTxRef",
    "rjctdMsgRef",
    "nbOfErrs",
    "errDesc",
    "reqForActn"
})
public class Tsmt01600102 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TxId")
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "TSUBaselnId")
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "TxSts")
    protected TransactionStatus1 txSts;
    @XmlElement(name = "UsrTxRef")
    protected DocumentIdentification5 usrTxRef;
    @XmlElement(name = "RjctdMsgRef")
    protected MessageIdentification1 rjctdMsgRef;
    @XmlElement(name = "NbOfErrs", required = true)
    protected Count1 nbOfErrs;
    @XmlElement(name = "ErrDesc", required = true)
    protected List<ValidationResult3> errDesc;
    @XmlElement(name = "ReqForActn")
    protected PendingActivity1 reqForActn;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt01600102 setRptId(MessageIdentification1 value) {
        this.rptId = value;
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
    public Tsmt01600102 setTxId(SimpleIdentificationInformation value) {
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
    public Tsmt01600102 setTSUBaselnId(DocumentIdentification3 value) {
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
    public Tsmt01600102 setTxSts(TransactionStatus1 value) {
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
    public Tsmt01600102 setUsrTxRef(DocumentIdentification5 value) {
        this.usrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the rjctdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctdMsgRef() {
        return rjctdMsgRef;
    }

    /**
     * Sets the value of the rjctdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt01600102 setRjctdMsgRef(MessageIdentification1 value) {
        this.rjctdMsgRef = value;
        return this;
    }

    /**
     * Gets the value of the nbOfErrs property.
     * 
     * @return
     *     possible object is
     *     {@link Count1 }
     *     
     */
    public Count1 getNbOfErrs() {
        return nbOfErrs;
    }

    /**
     * Sets the value of the nbOfErrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Count1 }
     *     
     */
    public Tsmt01600102 setNbOfErrs(Count1 value) {
        this.nbOfErrs = value;
        return this;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errDesc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidationResult3 }
     * 
     * 
     * @return
     *     The value of the errDesc property.
     */
    public List<ValidationResult3> getErrDesc() {
        if (errDesc == null) {
            errDesc = new ArrayList<>();
        }
        return this.errDesc;
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
    public Tsmt01600102 setReqForActn(PendingActivity1 value) {
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
     * Adds a new item to the errDesc list.
     * @see #getErrDesc()
     * 
     */
    public Tsmt01600102 addErrDesc(ValidationResult3 errDesc) {
        getErrDesc().add(errDesc);
        return this;
    }

}
