
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
 * Content of the Balance Inquiry Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryRequest4", propOrder = {
    "pmtAcctReq",
    "lltyAcctReq",
    "stordValAcctReq"
})
public class BalanceInquiryRequest4 {

    @XmlElement(name = "PmtAcctReq")
    protected PaymentAccountRequest1 pmtAcctReq;
    @XmlElement(name = "LltyAcctReq")
    protected LoyaltyAccountRequest2 lltyAcctReq;
    @XmlElement(name = "StordValAcctReq")
    protected StoredValueRequest4 stordValAcctReq;

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
    public BalanceInquiryRequest4 setPmtAcctReq(PaymentAccountRequest1 value) {
        this.pmtAcctReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccountRequest2 }
     *     
     */
    public LoyaltyAccountRequest2 getLltyAcctReq() {
        return lltyAcctReq;
    }

    /**
     * Sets the value of the lltyAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccountRequest2 }
     *     
     */
    public BalanceInquiryRequest4 setLltyAcctReq(LoyaltyAccountRequest2 value) {
        this.lltyAcctReq = value;
        return this;
    }

    /**
     * Gets the value of the stordValAcctReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest4 }
     *     
     */
    public StoredValueRequest4 getStordValAcctReq() {
        return stordValAcctReq;
    }

    /**
     * Sets the value of the stordValAcctReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest4 }
     *     
     */
    public BalanceInquiryRequest4 setStordValAcctReq(StoredValueRequest4 value) {
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
