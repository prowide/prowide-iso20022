
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
 * Specifies data element nexessary to request balance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryRequest9", propOrder = {
    "saleTxId",
    "pmtAcctReq",
    "lltyAcctReq",
    "stordValAcctReq"
})
public class BalanceInquiryRequest9 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "PmtAcctReq")
    protected PaymentAccountRequest1 pmtAcctReq;
    @XmlElement(name = "LltyAcctReq")
    protected LoyaltyAccountRequest3 lltyAcctReq;
    @XmlElement(name = "StordValAcctReq")
    protected StoredValueRequest9 stordValAcctReq;

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
    public BalanceInquiryRequest9 setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
        return this;
    }

    /**
     * Gets the value of the pmtAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAccountRequest1 }
     *     
     */
    public PaymentAccountRequest1 getPmtAcctReq() {
        return pmtAcctReq;
    }

    /**
     * Sets the value of the pmtAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAccountRequest1 }
     *     
     */
    public BalanceInquiryRequest9 setPmtAcctReq(PaymentAccountRequest1 value) {
        this.pmtAcctReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccountRequest3 }
     *     
     */
    public LoyaltyAccountRequest3 getLltyAcctReq() {
        return lltyAcctReq;
    }

    /**
     * Sets the value of the lltyAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountRequest3 }
     *     
     */
    public BalanceInquiryRequest9 setLltyAcctReq(LoyaltyAccountRequest3 value) {
        this.lltyAcctReq = value;
        return this;
    }

    /**
     * Gets the value of the stordValAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest9 }
     *     
     */
    public StoredValueRequest9 getStordValAcctReq() {
        return stordValAcctReq;
    }

    /**
     * Sets the value of the stordValAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest9 }
     *     
     */
    public BalanceInquiryRequest9 setStordValAcctReq(StoredValueRequest9 value) {
        this.stordValAcctReq = value;
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
