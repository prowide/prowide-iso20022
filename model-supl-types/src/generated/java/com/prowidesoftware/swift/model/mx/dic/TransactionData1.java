
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Card transaction information to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionData1", propOrder = {
    "cardBrnd",
    "cardData",
    "ptOfIntractn",
    "txDtls",
    "prePdAcct"
})
public class TransactionData1 {

    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardData")
    protected PlainCardData3 cardData;
    @XmlElement(name = "PtOfIntractn")
    protected PointOfInteraction1 ptOfIntractn;
    @XmlElement(name = "TxDtls")
    protected CardPaymentTransactionDetails8 txDtls;
    @XmlElement(name = "PrePdAcct")
    protected CashAccount24 prePdAcct;

    /**
     * Gets the value of the cardBrnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrnd() {
        return cardBrnd;
    }

    /**
     * Sets the value of the cardBrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionData1 setCardBrnd(String value) {
        this.cardBrnd = value;
        return this;
    }

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData3 }
     *     
     */
    public PlainCardData3 getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData3 }
     *     
     */
    public TransactionData1 setCardData(PlainCardData3 value) {
        this.cardData = value;
        return this;
    }

    /**
     * Gets the value of the ptOfIntractn property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public PointOfInteraction1 getPtOfIntractn() {
        return ptOfIntractn;
    }

    /**
     * Sets the value of the ptOfIntractn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public TransactionData1 setPtOfIntractn(PointOfInteraction1 value) {
        this.ptOfIntractn = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails8 }
     *     
     */
    public CardPaymentTransactionDetails8 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails8 }
     *     
     */
    public TransactionData1 setTxDtls(CardPaymentTransactionDetails8 value) {
        this.txDtls = value;
        return this;
    }

    /**
     * Gets the value of the prePdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getPrePdAcct() {
        return prePdAcct;
    }

    /**
     * Sets the value of the prePdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public TransactionData1 setPrePdAcct(CashAccount24 value) {
        this.prePdAcct = value;
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
