
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
@XmlType(name = "CardPaymentDataSet33", propOrder = {
    "dataSetId",
    "dataSetRslt",
    "rmvDataSet",
    "dataSetInitr",
    "txTtls",
    "rjctdTx",
    "sspdTx",
    "rsmdApprvl",
    "rsmdRjctn"
})
public class CardPaymentDataSet33 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification5 dataSetId;
    @XmlElement(name = "DataSetRslt", required = true)
    protected ResponseType10 dataSetRslt;
    @XmlElement(name = "RmvDataSet")
    protected boolean rmvDataSet;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification176 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "RjctdTx")
    protected List<CardPaymentDataSet32> rjctdTx;
    @XmlElement(name = "SspdTx")
    protected List<CardPaymentDataSet32> sspdTx;
    @XmlElement(name = "RsmdApprvl")
    protected List<CardPaymentDataSet32> rsmdApprvl;
    @XmlElement(name = "RsmdRjctn")
    protected List<CardPaymentDataSet32> rsmdRjctn;

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
    public CardPaymentDataSet33 setDataSetId(DataSetIdentification5 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the dataSetRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getDataSetRslt() {
        return dataSetRslt;
    }

    /**
     * Sets the value of the dataSetRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public CardPaymentDataSet33 setDataSetRslt(ResponseType10 value) {
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
    public CardPaymentDataSet33 setRmvDataSet(boolean value) {
        this.rmvDataSet = value;
        return this;
    }

    /**
     * Gets the value of the dataSetInitr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getDataSetInitr() {
        return dataSetInitr;
    }

    /**
     * Sets the value of the dataSetInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public CardPaymentDataSet33 setDataSetInitr(GenericIdentification176 value) {
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
     * {@link TransactionTotals12 }
     * 
     * 
     * @return
     *     The value of the txTtls property.
     */
    public List<TransactionTotals12> getTxTtls() {
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
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the rjctdTx property.
     */
    public List<CardPaymentDataSet32> getRjctdTx() {
        if (rjctdTx == null) {
            rjctdTx = new ArrayList<>();
        }
        return this.rjctdTx;
    }

    /**
     * Gets the value of the sspdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sspdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSspdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the sspdTx property.
     */
    public List<CardPaymentDataSet32> getSspdTx() {
        if (sspdTx == null) {
            sspdTx = new ArrayList<>();
        }
        return this.sspdTx;
    }

    /**
     * Gets the value of the rsmdApprvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsmdApprvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsmdApprvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the rsmdApprvl property.
     */
    public List<CardPaymentDataSet32> getRsmdApprvl() {
        if (rsmdApprvl == null) {
            rsmdApprvl = new ArrayList<>();
        }
        return this.rsmdApprvl;
    }

    /**
     * Gets the value of the rsmdRjctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsmdRjctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsmdRjctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the rsmdRjctn property.
     */
    public List<CardPaymentDataSet32> getRsmdRjctn() {
        if (rsmdRjctn == null) {
            rsmdRjctn = new ArrayList<>();
        }
        return this.rsmdRjctn;
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
    public CardPaymentDataSet33 addTxTtls(TransactionTotals12 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the rjctdTx list.
     * @see #getRjctdTx()
     * 
     */
    public CardPaymentDataSet33 addRjctdTx(CardPaymentDataSet32 rjctdTx) {
        getRjctdTx().add(rjctdTx);
        return this;
    }

    /**
     * Adds a new item to the sspdTx list.
     * @see #getSspdTx()
     * 
     */
    public CardPaymentDataSet33 addSspdTx(CardPaymentDataSet32 sspdTx) {
        getSspdTx().add(sspdTx);
        return this;
    }

    /**
     * Adds a new item to the rsmdApprvl list.
     * @see #getRsmdApprvl()
     * 
     */
    public CardPaymentDataSet33 addRsmdApprvl(CardPaymentDataSet32 rsmdApprvl) {
        getRsmdApprvl().add(rsmdApprvl);
        return this;
    }

    /**
     * Adds a new item to the rsmdRjctn list.
     * @see #getRsmdRjctn()
     * 
     */
    public CardPaymentDataSet33 addRsmdRjctn(CardPaymentDataSet32 rsmdRjctn) {
        getRsmdRjctn().add(rsmdRjctn);
        return this;
    }

}
