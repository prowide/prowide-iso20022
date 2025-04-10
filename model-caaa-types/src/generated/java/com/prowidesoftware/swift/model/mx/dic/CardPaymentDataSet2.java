
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
 * Result of the captured set of transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet2", propOrder = {
    "dataSetId",
    "dataSetRslt",
    "rmvDataSet",
    "dataSetInitr",
    "txTtls",
    "rjctdTx"
})
public class CardPaymentDataSet2 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification1 dataSetId;
    @XmlElement(name = "DataSetRslt", required = true)
    protected ResponseType1 dataSetRslt;
    @XmlElement(name = "RmvDataSet")
    protected boolean rmvDataSet;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification32 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals1> txTtls;
    @XmlElement(name = "RjctdTx")
    protected List<CardPaymentDataSet3> rjctdTx;

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
    public CardPaymentDataSet2 setDataSetId(DataSetIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the dataSetRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType1 }
     *     
     */
    public ResponseType1 getDataSetRslt() {
        return dataSetRslt;
    }

    /**
     * Sets the value of the dataSetRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType1 }
     *     
     */
    public CardPaymentDataSet2 setDataSetRslt(ResponseType1 value) {
        this.dataSetRslt = value;
        return this;
    }

    /**
     * Gets the value of the rmvDataSet property.
     * 
     */
    public boolean isRmvDataSet() {
        return rmvDataSet;
    }

    /**
     * Sets the value of the rmvDataSet property.
     * 
     */
    public CardPaymentDataSet2 setRmvDataSet(boolean value) {
        this.rmvDataSet = value;
        return this;
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
    public CardPaymentDataSet2 setDataSetInitr(GenericIdentification32 value) {
        this.dataSetInitr = value;
        return this;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txTtls property.
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
     * @return
     *     The value of the txTtls property.
     */
    public List<TransactionTotals1> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the rjctdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet3 }
     * 
     * 
     * @return
     *     The value of the rjctdTx property.
     */
    public List<CardPaymentDataSet3> getRjctdTx() {
        if (rjctdTx == null) {
            rjctdTx = new ArrayList<>();
        }
        return this.rjctdTx;
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
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public CardPaymentDataSet2 addTxTtls(TransactionTotals1 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the rjctdTx list.
     * @see #getRjctdTx()
     * 
     */
    public CardPaymentDataSet2 addRjctdTx(CardPaymentDataSet3 rjctdTx) {
        getRjctdTx().add(rjctdTx);
        return this;
    }

}
