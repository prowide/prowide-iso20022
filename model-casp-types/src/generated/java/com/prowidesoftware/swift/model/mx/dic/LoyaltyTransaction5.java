
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to the loyalty transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyTransaction5", propOrder = {
    "saleTxId",
    "lltyTxTp",
    "ccy",
    "ttlAmt",
    "orgnlPOITx",
    "saleItm"
})
public class LoyaltyTransaction5 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "LltyTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected LoyaltyTransactionType1Code lltyTxTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "OrgnlPOITx")
    protected CardPaymentTransaction127 orgnlPOITx;
    @XmlElement(name = "SaleItm")
    protected List<Product6> saleItm;

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public LoyaltyTransaction5 setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
        return this;
    }

    /**
     * Gets the value of the lltyTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTransactionType1Code }
     *     
     */
    public LoyaltyTransactionType1Code getLltyTxTp() {
        return lltyTxTp;
    }

    /**
     * Sets the value of the lltyTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTransactionType1Code }
     *     
     */
    public LoyaltyTransaction5 setLltyTxTp(LoyaltyTransactionType1Code value) {
        this.lltyTxTp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyTransaction5 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LoyaltyTransaction5 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPOITx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public CardPaymentTransaction127 getOrgnlPOITx() {
        return orgnlPOITx;
    }

    /**
     * Sets the value of the orgnlPOITx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public LoyaltyTransaction5 setOrgnlPOITx(CardPaymentTransaction127 value) {
        this.orgnlPOITx = value;
        return this;
    }

    /**
     * Gets the value of the saleItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product6 }
     * 
     * 
     * @return
     *     The value of the saleItm property.
     */
    public List<Product6> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<>();
        }
        return this.saleItm;
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
     * Adds a new item to the saleItm list.
     * @see #getSaleItm()
     * 
     */
    public LoyaltyTransaction5 addSaleItm(Product6 saleItm) {
        getSaleItm().add(saleItm);
        return this;
    }

}
