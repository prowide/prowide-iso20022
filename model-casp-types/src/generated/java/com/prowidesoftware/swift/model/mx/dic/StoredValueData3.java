
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Data related to the stored value card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueData3", propOrder = {
    "prvdr",
    "txTp",
    "acctId",
    "orgnlPOITx",
    "pdctCd",
    "eanupc",
    "itmAmt",
    "ccy",
    "hstTxId"
})
public class StoredValueData3 {

    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected StoredValueTransactionType2Code txTp;
    @XmlElement(name = "AcctId")
    protected StoredValueAccount2 acctId;
    @XmlElement(name = "OrgnlPOITx")
    protected CardPaymentTransaction100 orgnlPOITx;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "EANUPC")
    protected String eanupc;
    @XmlElement(name = "ItmAmt")
    protected BigDecimal itmAmt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "HstTxId")
    protected TransactionIdentifier1 hstTxId;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueData3 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueTransactionType2Code }
     *     
     */
    public StoredValueTransactionType2Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueTransactionType2Code }
     *     
     */
    public StoredValueData3 setTxTp(StoredValueTransactionType2Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueAccount2 }
     *     
     */
    public StoredValueAccount2 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueAccount2 }
     *     
     */
    public StoredValueData3 setAcctId(StoredValueAccount2 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPOITx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction100 }
     *     
     */
    public CardPaymentTransaction100 getOrgnlPOITx() {
        return orgnlPOITx;
    }

    /**
     * Sets the value of the orgnlPOITx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction100 }
     *     
     */
    public StoredValueData3 setOrgnlPOITx(CardPaymentTransaction100 value) {
        this.orgnlPOITx = value;
        return this;
    }

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueData3 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the eanupc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANUPC() {
        return eanupc;
    }

    /**
     * Sets the value of the eanupc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StoredValueData3 setEANUPC(String value) {
        this.eanupc = value;
        return this;
    }

    /**
     * Gets the value of the itmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItmAmt() {
        return itmAmt;
    }

    /**
     * Sets the value of the itmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StoredValueData3 setItmAmt(BigDecimal value) {
        this.itmAmt = value;
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
    public StoredValueData3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the hstTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getHstTxId() {
        return hstTxId;
    }

    /**
     * Sets the value of the hstTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public StoredValueData3 setHstTxId(TransactionIdentifier1 value) {
        this.hstTxId = value;
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
