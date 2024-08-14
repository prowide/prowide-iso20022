
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
 * Amounts of the transaction expressed within the terminal currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransactionAmount5", propOrder = {
    "ttlAmt",
    "crdhldrBllgTxAmt",
    "rcncltnTxAmt"
})
public class CardTransactionAmount5 {

    @XmlElement(name = "TtlAmt", required = true)
    protected CurrencyAndAmount ttlAmt;
    @XmlElement(name = "CrdhldrBllgTxAmt")
    protected DetailedAmount8 crdhldrBllgTxAmt;
    @XmlElement(name = "RcncltnTxAmt")
    protected DetailedAmount8 rcncltnTxAmt;

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CardTransactionAmount5 setTtlAmt(CurrencyAndAmount value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount8 }
     *     
     */
    public DetailedAmount8 getCrdhldrBllgTxAmt() {
        return crdhldrBllgTxAmt;
    }

    /**
     * Sets the value of the crdhldrBllgTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount8 }
     *     
     */
    public CardTransactionAmount5 setCrdhldrBllgTxAmt(DetailedAmount8 value) {
        this.crdhldrBllgTxAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount8 }
     *     
     */
    public DetailedAmount8 getRcncltnTxAmt() {
        return rcncltnTxAmt;
    }

    /**
     * Sets the value of the rcncltnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount8 }
     *     
     */
    public CardTransactionAmount5 setRcncltnTxAmt(DetailedAmount8 value) {
        this.rcncltnTxAmt = value;
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
