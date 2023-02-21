
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
 * Set of transactions to capture, sharing common characteristics.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet1", propOrder = {
    "dataSetId",
    "tracblt",
    "dataSetInitr",
    "txTtls",
    "cmonData",
    "txToCaptr"
})
public class CardPaymentDataSet1 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification1 dataSetId;
    @XmlElement(name = "Tracblt")
    protected List<Traceability1> tracblt;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification32 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals1> txTtls;
    @XmlElement(name = "CmonData")
    protected CommonData1 cmonData;
    @XmlElement(name = "TxToCaptr")
    protected List<CardPaymentDataSetTransaction1> txToCaptr;

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
    public CardPaymentDataSet1 setDataSetId(DataSetIdentification1 value) {
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
    public CardPaymentDataSet1 setDataSetInitr(GenericIdentification32 value) {
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
     * {@link TransactionTotals1 }
     * 
     * 
     */
    public List<TransactionTotals1> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals1>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the cmonData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonData1 }
     *     
     */
    public CommonData1 getCmonData() {
        return cmonData;
    }

    /**
     * Sets the value of the cmonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonData1 }
     *     
     */
    public CardPaymentDataSet1 setCmonData(CommonData1 value) {
        this.cmonData = value;
        return this;
    }

    /**
     * Gets the value of the txToCaptr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txToCaptr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxToCaptr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSetTransaction1 }
     * 
     * 
     */
    public List<CardPaymentDataSetTransaction1> getTxToCaptr() {
        if (txToCaptr == null) {
            txToCaptr = new ArrayList<CardPaymentDataSetTransaction1>();
        }
        return this.txToCaptr;
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
    public CardPaymentDataSet1 addTracblt(Traceability1 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

    /**
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public CardPaymentDataSet1 addTxTtls(TransactionTotals1 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the txToCaptr list.
     * @see #getTxToCaptr()
     * 
     */
    public CardPaymentDataSet1 addTxToCaptr(CardPaymentDataSetTransaction1 txToCaptr) {
        getTxToCaptr().add(txToCaptr);
        return this;
    }

}
