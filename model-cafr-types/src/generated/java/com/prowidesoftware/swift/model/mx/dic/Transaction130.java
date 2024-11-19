
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
 * Fraud reporting transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction130", propOrder = {
    "frdTxId",
    "rptdFrd",
    "frdlntTxData",
    "cardNotRcvdDtls",
    "crdhldrNm",
    "addtlFee",
    "addtlInf",
    "addtlData",
    "lclData"
})
public class Transaction130 {

    @XmlElement(name = "FrdTxId", required = true)
    protected String frdTxId;
    @XmlElement(name = "RptdFrd", required = true)
    protected ReportedFraud3 rptdFrd;
    @XmlElement(name = "FrdlntTxData", required = true)
    protected FraudulentTransactionData2 frdlntTxData;
    @XmlElement(name = "CardNotRcvdDtls")
    protected CardNotReceivedDetails2 cardNotRcvdDtls;
    @XmlElement(name = "CrdhldrNm")
    protected CardholderName3 crdhldrNm;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation22> addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData6 lclData;

    /**
     * Gets the value of the frdTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdTxId() {
        return frdTxId;
    }

    /**
     * Sets the value of the frdTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transaction130 setFrdTxId(String value) {
        this.frdTxId = value;
        return this;
    }

    /**
     * Gets the value of the rptdFrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedFraud3 }
     *     
     */
    public ReportedFraud3 getRptdFrd() {
        return rptdFrd;
    }

    /**
     * Sets the value of the rptdFrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedFraud3 }
     *     
     */
    public Transaction130 setRptdFrd(ReportedFraud3 value) {
        this.rptdFrd = value;
        return this;
    }

    /**
     * Gets the value of the frdlntTxData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudulentTransactionData2 }
     *     
     */
    public FraudulentTransactionData2 getFrdlntTxData() {
        return frdlntTxData;
    }

    /**
     * Sets the value of the frdlntTxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudulentTransactionData2 }
     *     
     */
    public Transaction130 setFrdlntTxData(FraudulentTransactionData2 value) {
        this.frdlntTxData = value;
        return this;
    }

    /**
     * Gets the value of the cardNotRcvdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardNotReceivedDetails2 }
     *     
     */
    public CardNotReceivedDetails2 getCardNotRcvdDtls() {
        return cardNotRcvdDtls;
    }

    /**
     * Sets the value of the cardNotRcvdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNotReceivedDetails2 }
     *     
     */
    public Transaction130 setCardNotRcvdDtls(CardNotReceivedDetails2 value) {
        this.cardNotRcvdDtls = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Sets the value of the crdhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public Transaction130 setCrdhldrNm(CardholderName3 value) {
        this.crdhldrNm = value;
        return this;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation22 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation22> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
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
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData6 }
     *     
     */
    public LocalData6 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData6 }
     *     
     */
    public Transaction130 setLclData(LocalData6 value) {
        this.lclData = value;
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
     * Adds a new item to the addtlFee list.
     * @see #getAddtlFee()
     * 
     */
    public Transaction130 addAddtlFee(AdditionalFee2 addtlFee) {
        getAddtlFee().add(addtlFee);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Transaction130 addAddtlInf(AdditionalInformation22 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction130 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
