
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
 * Set of transactions to capture, sharing common characteristics.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet19", propOrder = {
    "dataSetId",
    "tracblt",
    "dataSetInitr",
    "txTtls",
    "cmonData",
    "tx"
})
public class CardPaymentDataSet19 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification5 dataSetId;
    @XmlElement(name = "Tracblt")
    protected List<Traceability5> tracblt;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification53 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals7> txTtls;
    @XmlElement(name = "CmonData")
    protected CommonData7 cmonData;
    @XmlElement(name = "Tx", required = true)
    protected List<CardPaymentDataSetTransaction6Choice> tx;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification5 }
     *     
     */
    public DataSetIdentification5 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification5 }
     *     
     */
    public CardPaymentDataSet19 setDataSetId(DataSetIdentification5 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability5 }
     * 
     * 
     */
    public List<Traceability5> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability5>();
        }
        return this.tracblt;
    }

    /**
     * Gets the value of the dataSetInitr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification53 }
     *     
     */
    public GenericIdentification53 getDataSetInitr() {
        return dataSetInitr;
    }

    /**
     * Sets the value of the dataSetInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification53 }
     *     
     */
    public CardPaymentDataSet19 setDataSetInitr(GenericIdentification53 value) {
        this.dataSetInitr = value;
        return this;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals7 }
     * 
     * 
     */
    public List<TransactionTotals7> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals7>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the cmonData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonData7 }
     *     
     */
    public CommonData7 getCmonData() {
        return cmonData;
    }

    /**
     * Sets the value of the cmonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonData7 }
     *     
     */
    public CardPaymentDataSet19 setCmonData(CommonData7 value) {
        this.cmonData = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSetTransaction6Choice }
     * 
     * 
     */
    public List<CardPaymentDataSetTransaction6Choice> getTx() {
        if (tx == null) {
            tx = new ArrayList<CardPaymentDataSetTransaction6Choice>();
        }
        return this.tx;
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
     * Adds a new item to the tracblt list.
     * @see #getTracblt()
     * 
     */
    public CardPaymentDataSet19 addTracblt(Traceability5 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

    /**
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public CardPaymentDataSet19 addTxTtls(TransactionTotals7 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the tx list.
     * @see #getTx()
     * 
     */
    public CardPaymentDataSet19 addTx(CardPaymentDataSetTransaction6Choice tx) {
        getTx().add(tx);
        return this;
    }

}
