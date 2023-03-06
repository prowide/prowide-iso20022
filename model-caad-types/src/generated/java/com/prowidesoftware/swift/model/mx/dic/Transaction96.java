
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Batch management transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction96", propOrder = {
    "txId",
    "btchId",
    "orgnlBtchId",
    "nbOfMsgs",
    "btchChcksm",
    "reqAck",
    "clrBtchData",
    "clrCtrlTtls",
    "agtData",
    "rcrd",
    "addtlData"
})
public class Transaction96 {

    @XmlElement(name = "TxId")
    protected TransactionIdentification10 txId;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "OrgnlBtchId")
    protected String orgnlBtchId;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "BtchChcksm")
    protected byte[] btchChcksm;
    @XmlElement(name = "ReqAck")
    protected Boolean reqAck;
    @XmlElement(name = "ClrBtchData")
    protected List<ClearingBatchData1> clrBtchData;
    @XmlElement(name = "ClrCtrlTtls")
    protected ClearingControlTotals1 clrCtrlTtls;
    @XmlElement(name = "AgtData")
    protected List<AdditionalInformation21> agtData;
    @XmlElement(name = "Rcrd")
    protected List<Record1> rcrd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification10 }
     *     
     */
    public TransactionIdentification10 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification10 }
     *     
     */
    public Transaction96 setTxId(TransactionIdentification10 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the btchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Sets the value of the btchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction96 setBtchId(String value) {
        this.btchId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlBtchId() {
        return orgnlBtchId;
    }

    /**
     * Sets the value of the orgnlBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction96 setOrgnlBtchId(String value) {
        this.orgnlBtchId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMsgs() {
        return nbOfMsgs;
    }

    /**
     * Sets the value of the nbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transaction96 setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
        return this;
    }

    /**
     * Gets the value of the btchChcksm property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBtchChcksm() {
        return btchChcksm;
    }

    /**
     * Sets the value of the btchChcksm property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Transaction96 setBtchChcksm(byte[] value) {
        this.btchChcksm = value;
        return this;
    }

    /**
     * Gets the value of the reqAck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqAck() {
        return reqAck;
    }

    /**
     * Sets the value of the reqAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transaction96 setReqAck(Boolean value) {
        this.reqAck = value;
        return this;
    }

    /**
     * Gets the value of the clrBtchData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clrBtchData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrBtchData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingBatchData1 }
     * 
     * 
     */
    public List<ClearingBatchData1> getClrBtchData() {
        if (clrBtchData == null) {
            clrBtchData = new ArrayList<ClearingBatchData1>();
        }
        return this.clrBtchData;
    }

    /**
     * Gets the value of the clrCtrlTtls property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingControlTotals1 }
     *     
     */
    public ClearingControlTotals1 getClrCtrlTtls() {
        return clrCtrlTtls;
    }

    /**
     * Sets the value of the clrCtrlTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingControlTotals1 }
     *     
     */
    public Transaction96 setClrCtrlTtls(ClearingControlTotals1 value) {
        this.clrCtrlTtls = value;
        return this;
    }

    /**
     * Gets the value of the agtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation21 }
     * 
     * 
     */
    public List<AdditionalInformation21> getAgtData() {
        if (agtData == null) {
            agtData = new ArrayList<AdditionalInformation21>();
        }
        return this.agtData;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Record1 }
     * 
     * 
     */
    public List<Record1> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<Record1>();
        }
        return this.rcrd;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
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
     * Adds a new item to the clrBtchData list.
     * @see #getClrBtchData()
     * 
     */
    public Transaction96 addClrBtchData(ClearingBatchData1 clrBtchData) {
        getClrBtchData().add(clrBtchData);
        return this;
    }

    /**
     * Adds a new item to the agtData list.
     * @see #getAgtData()
     * 
     */
    public Transaction96 addAgtData(AdditionalInformation21 agtData) {
        getAgtData().add(agtData);
        return this;
    }

    /**
     * Adds a new item to the rcrd list.
     * @see #getRcrd()
     * 
     */
    public Transaction96 addRcrd(Record1 rcrd) {
        getRcrd().add(rcrd);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction96 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
