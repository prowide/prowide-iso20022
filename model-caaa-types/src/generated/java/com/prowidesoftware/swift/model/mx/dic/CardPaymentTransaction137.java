
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Transaction information in the authorisation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction137", propOrder = {
    "saleRefId",
    "txId",
    "initrTxId",
    "rcptTxId",
    "rcncltnId",
    "intrchngData",
    "txDtls",
    "mrchntRefData"
})
public class CardPaymentTransaction137 {

    @XmlElement(name = "SaleRefId")
    protected String saleRefId;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "InitrTxId")
    protected String initrTxId;
    @XmlElement(name = "RcptTxId")
    protected String rcptTxId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IntrchngData")
    protected String intrchngData;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails53 txDtls;
    @XmlElement(name = "MrchntRefData")
    protected String mrchntRefData;

    /**
     * Gets the value of the saleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefId() {
        return saleRefId;
    }

    /**
     * Sets the value of the saleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction137 setSaleRefId(String value) {
        this.saleRefId = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public CardPaymentTransaction137 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction137 setInitrTxId(String value) {
        this.initrTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcptTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTxId() {
        return rcptTxId;
    }

    /**
     * Sets the value of the rcptTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction137 setRcptTxId(String value) {
        this.rcptTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction137 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the intrchngData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngData() {
        return intrchngData;
    }

    /**
     * Sets the value of the intrchngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction137 setIntrchngData(String value) {
        this.intrchngData = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails53 }
     *     
     */
    public CardPaymentTransactionDetails53 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails53 }
     *     
     */
    public CardPaymentTransaction137 setTxDtls(CardPaymentTransactionDetails53 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the mrchntRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntRefData() {
        return mrchntRefData;
    }

    /**
     * Sets the value of the mrchntRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction137 setMrchntRefData(String value) {
        this.mrchntRefData = value;
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

}
