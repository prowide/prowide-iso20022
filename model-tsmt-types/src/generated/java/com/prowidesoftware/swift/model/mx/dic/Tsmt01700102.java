
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
 * The ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty of the submitter of data sets.
 * This message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.
 * Usage
 * The ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.017.001.02", propOrder = {
    "rptId",
    "txRltdRefs",
    "tsuBaselnId",
    "txSts",
    "usrTxRef",
    "buyrBk",
    "sellrBk",
    "comrclDataSet",
    "trnsprtDataSet",
    "reqForActn"
})
public class Tsmt01700102 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TxRltdRefs", required = true)
    protected List<DataSetSubmissionReferences1> txRltdRefs;
    @XmlElement(name = "TSUBaselnId", required = true)
    protected DocumentIdentification3 tsuBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus1 txSts;
    @XmlElement(name = "UsrTxRef", required = true)
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "ComrclDataSet")
    protected CommercialDataSet2 comrclDataSet;
    @XmlElement(name = "TrnsprtDataSet")
    protected TransportDataSet2 trnsprtDataSet;
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
    public Tsmt01700102 setRptId(MessageIdentification1 value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the txRltdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txRltdRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRltdRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSetSubmissionReferences1 }
     * 
     * 
     * @return
     *     The value of the txRltdRefs property.
     */
    public List<DataSetSubmissionReferences1> getTxRltdRefs() {
        if (txRltdRefs == null) {
            txRltdRefs = new ArrayList<>();
        }
        return this.txRltdRefs;
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
    public Tsmt01700102 setTSUBaselnId(DocumentIdentification3 value) {
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
    public Tsmt01700102 setTxSts(TransactionStatus1 value) {
        this.txSts = value;
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
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public Tsmt01700102 setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
        return this;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public Tsmt01700102 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the comrclDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDataSet2 }
     *     
     */
    public CommercialDataSet2 getComrclDataSet() {
        return comrclDataSet;
    }

    /**
     * Sets the value of the comrclDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDataSet2 }
     *     
     */
    public Tsmt01700102 setComrclDataSet(CommercialDataSet2 value) {
        this.comrclDataSet = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDataSet2 }
     *     
     */
    public TransportDataSet2 getTrnsprtDataSet() {
        return trnsprtDataSet;
    }

    /**
     * Sets the value of the trnsprtDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDataSet2 }
     *     
     */
    public Tsmt01700102 setTrnsprtDataSet(TransportDataSet2 value) {
        this.trnsprtDataSet = value;
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
    public Tsmt01700102 setReqForActn(PendingActivity1 value) {
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
     * Adds a new item to the txRltdRefs list.
     * @see #getTxRltdRefs()
     * 
     */
    public Tsmt01700102 addTxRltdRefs(DataSetSubmissionReferences1 txRltdRefs) {
        getTxRltdRefs().add(txRltdRefs);
        return this;
    }

    /**
     * Adds a new item to the usrTxRef list.
     * @see #getUsrTxRef()
     * 
     */
    public Tsmt01700102 addUsrTxRef(DocumentIdentification5 usrTxRef) {
        getUsrTxRef().add(usrTxRef);
        return this;
    }

}
