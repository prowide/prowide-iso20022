
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
 * The ActionReminder message is sent by the matching application to a party involved in a transaction that it is expecting to take an action.
 * This message is used to remind a party of an action that it is expected to take.
 * Usage
 * The ActionReminder message can be sent by the matching application to remind a party that it is waiting for
 * - the submission of a transaction initiation message (BaselineReSubmission message),
 * or
 * - the acceptance or rejection of mis-matched data sets (MisMatchAcceptance or MisMatchRejection message),
 * or
 * - the acceptance or rejection of an amendment request (AmendmentAcceptance or AmendmentRejection message),
 * or
 * - the acceptance or rejection of a status change request (StatusChangeRequestAcceptance or StatusChangeRequestRejection message),
 * or
 * - the acceptance or rejection of a status extension request (StatusExtensionAcceptance or StatusExtensionRejection message).
 * - or
 * - the acceptance or rejection of a request to accept role and baseline (RoleAndBaselineAcceptance or RoleAndBaselineRejection message).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionReminderV03", propOrder = {
    "rmndrId",
    "txId",
    "estblishdBaselnId",
    "txSts",
    "usrTxRef",
    "msgReqrngActn",
    "pdgReqForActn"
})
public class ActionReminderV03 {

    @XmlElement(name = "RmndrId", required = true)
    protected MessageIdentification1 rmndrId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus4 txSts;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "MsgReqrngActn", required = true)
    protected MessageIdentification1 msgReqrngActn;
    @XmlElement(name = "PdgReqForActn", required = true)
    protected PendingActivity2 pdgReqForActn;

    /**
     * Gets the value of the rmndrId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRmndrId() {
        return rmndrId;
    }

    /**
     * Sets the value of the rmndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ActionReminderV03 setRmndrId(MessageIdentification1 value) {
        this.rmndrId = value;
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
    public ActionReminderV03 setTxId(SimpleIdentificationInformation value) {
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
    public ActionReminderV03 setEstblishdBaselnId(DocumentIdentification3 value) {
        this.estblishdBaselnId = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus4 }
     *     
     */
    public TransactionStatus4 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus4 }
     *     
     */
    public ActionReminderV03 setTxSts(TransactionStatus4 value) {
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
     * Gets the value of the msgReqrngActn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgReqrngActn() {
        return msgReqrngActn;
    }

    /**
     * Sets the value of the msgReqrngActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ActionReminderV03 setMsgReqrngActn(MessageIdentification1 value) {
        this.msgReqrngActn = value;
        return this;
    }

    /**
     * Gets the value of the pdgReqForActn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingActivity2 }
     *     
     */
    public PendingActivity2 getPdgReqForActn() {
        return pdgReqForActn;
    }

    /**
     * Sets the value of the pdgReqForActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingActivity2 }
     *     
     */
    public ActionReminderV03 setPdgReqForActn(PendingActivity2 value) {
        this.pdgReqForActn = value;
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
    public ActionReminderV03 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

}
