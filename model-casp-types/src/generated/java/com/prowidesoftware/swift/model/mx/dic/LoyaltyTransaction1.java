
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to the Loyalty Transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyTransaction1", propOrder = {
    "lltyTxTp",
    "ccy",
    "ttlAmt",
    "orgnlPOITx",
    "saleItm"
})
public class LoyaltyTransaction1 {

    @XmlElement(name = "LltyTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected LoyaltyTransactionType1Code lltyTxTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "OrgnlPOITx")
    protected CardPaymentTransaction91 orgnlPOITx;
    @XmlElement(name = "SaleItm")
    protected List<Product6> saleItm;

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
    public LoyaltyTransaction1 setLltyTxTp(LoyaltyTransactionType1Code value) {
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
    public LoyaltyTransaction1 setCcy(String value) {
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
    public LoyaltyTransaction1 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPOITx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction91 }
     *     
     */
    public CardPaymentTransaction91 getOrgnlPOITx() {
        return orgnlPOITx;
    }

    /**
     * Sets the value of the orgnlPOITx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction91 }
     *     
     */
    public LoyaltyTransaction1 setOrgnlPOITx(CardPaymentTransaction91 value) {
        this.orgnlPOITx = value;
        return this;
    }

    /**
     * Gets the value of the saleItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleItm property.
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
     */
    public List<Product6> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<Product6>();
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
    public LoyaltyTransaction1 addSaleItm(Product6 saleItm) {
        getSaleItm().add(saleItm);
        return this;
    }

}