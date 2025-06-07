
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
@XmlType(name = "CardPaymentDataSet7", propOrder = {
    "dataSetId",
    "tracblt",
    "dataSetInitr",
    "txTtls",
    "cmonData",
    "tx"
})
public class CardPaymentDataSet7 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification1 dataSetId;
    @XmlElement(name = "Tracblt")
    protected List<Traceability1> tracblt;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification32 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals2> txTtls;
    @XmlElement(name = "CmonData")
    protected CommonData3 cmonData;
    @XmlElement(name = "Tx", required = true)
    protected List<CardPaymentDataSetTransaction2Choice> tx;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification1 }
     *     
     */
    public DataSetIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification1 }
     *     
     */
    public CardPaymentDataSet7 setDataSetId(DataSetIdentification1 value) {
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
     * {@link Traceability1 }
     * 
     * 
     */
    public List<Traceability1> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability1>();
        }
        return this.tracblt;
    }

    /**
     * Gets the value of the dataSetInitr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getDataSetInitr() {
        return dataSetInitr;
    }

    /**
     * Sets the value of the dataSetInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentDataSet7 setDataSetInitr(GenericIdentification32 value) {
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
     * {@link TransactionTotals2 }
     * 
     * 
     */
    public List<TransactionTotals2> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals2>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the cmonData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonData3 }
     *     
     */
    public CommonData3 getCmonData() {
        return cmonData;
    }

    /**
     * Sets the value of the cmonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonData3 }
     *     
     */
    public CardPaymentDataSet7 setCmonData(CommonData3 value) {
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
     * {@link CardPaymentDataSetTransaction2Choice }
     * 
     * 
     */
    public List<CardPaymentDataSetTransaction2Choice> getTx() {
        if (tx == null) {
            tx = new ArrayList<CardPaymentDataSetTransaction2Choice>();
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
    public CardPaymentDataSet7 addTracblt(Traceability1 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

    /**
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public CardPaymentDataSet7 addTxTtls(TransactionTotals2 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the tx list.
     * @see #getTx()
     * 
     */
    public CardPaymentDataSet7 addTx(CardPaymentDataSetTransaction2Choice tx) {
        getTx().add(tx);
        return this;
    }

}
