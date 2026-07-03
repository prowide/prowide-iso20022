
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
 * The StoreDataSetRequest message is sent by the party specified in the baseline as data set submitter to the matching application.
 * This message is used to request the storage of data set(s) by the matching application.
 * Usage
 * The StoreDataSetRequest message can be sent to the matching application by the party specified in the baseline as data set submitter. It is used to store data set(s) conveyed to the matching application with this message.
 * The message can be used to request the storage of multiple data sets for multiple transactions (baselines) at the same time. However, all transactions (baselines) covered by the message must be for the same parties, that is transaction initiator and counterparty, as well as for the same buyer and seller.
 * The StoreDataSet message consists of data reflecting trade information related to the purchasing agreement covered by the transaction(s), for example shipment date, invoice amount.
 * The DataSetSubmission message can be used to request the matching of the stored data-set(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.039.001.02", propOrder = {
    "reqId",
    "txRltdRefs",
    "buyrBk",
    "sellrBk",
    "comrclDataSet",
    "trnsprtDataSet"
})
public class Tsmt03900102 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "TxRltdRefs", required = true)
    protected List<DataSetSubmissionReferences2> txRltdRefs;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "ComrclDataSet")
    protected List<CommercialDataSet2> comrclDataSet;
    @XmlElement(name = "TrnsprtDataSet")
    protected List<TransportDataSet2> trnsprtDataSet;

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
    public Tsmt03900102 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the txRltdRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRltdRefs property.
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
     * {@link DataSetSubmissionReferences2 }
     * 
     * 
     */
    public List<DataSetSubmissionReferences2> getTxRltdRefs() {
        if (txRltdRefs == null) {
            txRltdRefs = new ArrayList<DataSetSubmissionReferences2>();
        }
        return this.txRltdRefs;
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
    public Tsmt03900102 setBuyrBk(BICIdentification1 value) {
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
    public Tsmt03900102 setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
        return this;
    }

    /**
     * Gets the value of the comrclDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comrclDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComrclDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialDataSet2 }
     * 
     * 
     */
    public List<CommercialDataSet2> getComrclDataSet() {
        if (comrclDataSet == null) {
            comrclDataSet = new ArrayList<CommercialDataSet2>();
        }
        return this.comrclDataSet;
    }

    /**
     * Gets the value of the trnsprtDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportDataSet2 }
     * 
     * 
     */
    public List<TransportDataSet2> getTrnsprtDataSet() {
        if (trnsprtDataSet == null) {
            trnsprtDataSet = new ArrayList<TransportDataSet2>();
        }
        return this.trnsprtDataSet;
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
    public Tsmt03900102 addTxRltdRefs(DataSetSubmissionReferences2 txRltdRefs) {
        getTxRltdRefs().add(txRltdRefs);
        return this;
    }

    /**
     * Adds a new item to the comrclDataSet list.
     * @see #getComrclDataSet()
     * 
     */
    public Tsmt03900102 addComrclDataSet(CommercialDataSet2 comrclDataSet) {
        getComrclDataSet().add(comrclDataSet);
        return this;
    }

    /**
     * Adds a new item to the trnsprtDataSet list.
     * @see #getTrnsprtDataSet()
     * 
     */
    public Tsmt03900102 addTrnsprtDataSet(TransportDataSet2 trnsprtDataSet) {
        getTrnsprtDataSet().add(trnsprtDataSet);
        return this;
    }

}
