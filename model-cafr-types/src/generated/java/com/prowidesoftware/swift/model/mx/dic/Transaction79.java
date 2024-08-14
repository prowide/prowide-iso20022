
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
 * Fraud reporting transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction79", propOrder = {
    "frdTxId",
    "rptdFrd",
    "frdlntTxData",
    "cardNotRcvdDtls",
    "crdhldrCardNm",
    "addtlFees",
    "addtlInf",
    "addtlData"
})
public class Transaction79 {

    @XmlElement(name = "FrdTxId", required = true)
    protected String frdTxId;
    @XmlElement(name = "RptdFrd", required = true)
    protected ReportedFraud1 rptdFrd;
    @XmlElement(name = "FrdlntTxData", required = true)
    protected FraudulentTransactionData1 frdlntTxData;
    @XmlElement(name = "CardNotRcvdDtls")
    protected CardNotReceivedDetails1 cardNotRcvdDtls;
    @XmlElement(name = "CrdhldrCardNm")
    protected CardholderName1 crdhldrCardNm;
    @XmlElement(name = "AddtlFees")
    protected List<AdditionalFee1> addtlFees;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation22> addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
    public Transaction79 setFrdTxId(String value) {
        this.frdTxId = value;
        return this;
    }

    /**
     * Gets the value of the rptdFrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedFraud1 }
     *     
     */
    public ReportedFraud1 getRptdFrd() {
        return rptdFrd;
    }

    /**
     * Sets the value of the rptdFrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedFraud1 }
     *     
     */
    public Transaction79 setRptdFrd(ReportedFraud1 value) {
        this.rptdFrd = value;
        return this;
    }

    /**
     * Gets the value of the frdlntTxData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudulentTransactionData1 }
     *     
     */
    public FraudulentTransactionData1 getFrdlntTxData() {
        return frdlntTxData;
    }

    /**
     * Sets the value of the frdlntTxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudulentTransactionData1 }
     *     
     */
    public Transaction79 setFrdlntTxData(FraudulentTransactionData1 value) {
        this.frdlntTxData = value;
        return this;
    }

    /**
     * Gets the value of the cardNotRcvdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardNotReceivedDetails1 }
     *     
     */
    public CardNotReceivedDetails1 getCardNotRcvdDtls() {
        return cardNotRcvdDtls;
    }

    /**
     * Sets the value of the cardNotRcvdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNotReceivedDetails1 }
     *     
     */
    public Transaction79 setCardNotRcvdDtls(CardNotReceivedDetails1 value) {
        this.cardNotRcvdDtls = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrCardNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName1 }
     *     
     */
    public CardholderName1 getCrdhldrCardNm() {
        return crdhldrCardNm;
    }

    /**
     * Sets the value of the crdhldrCardNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName1 }
     *     
     */
    public Transaction79 setCrdhldrCardNm(CardholderName1 value) {
        this.crdhldrCardNm = value;
        return this;
    }

    /**
     * Gets the value of the addtlFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee1 }
     * 
     * 
     */
    public List<AdditionalFee1> getAddtlFees() {
        if (addtlFees == null) {
            addtlFees = new ArrayList<AdditionalFee1>();
        }
        return this.addtlFees;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
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
     */
    public List<AdditionalInformation22> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation22>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlFees list.
     * @see #getAddtlFees()
     * 
     */
    public Transaction79 addAddtlFees(AdditionalFee1 addtlFees) {
        getAddtlFees().add(addtlFees);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Transaction79 addAddtlInf(AdditionalInformation22 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Transaction79 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
