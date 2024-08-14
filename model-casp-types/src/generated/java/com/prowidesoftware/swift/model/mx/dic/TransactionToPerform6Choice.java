
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
 * Content of the batch request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionToPerform6Choice", propOrder = {
    "pmtReq",
    "lltyReq",
    "rvslReq"
})
public class TransactionToPerform6Choice {

    @XmlElement(name = "PmtReq")
    protected PaymentRequest6 pmtReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest6 lltyReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest6 rvslReq;

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest6 }
     *     
     */
    public PaymentRequest6 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest6 }
     *     
     */
    public TransactionToPerform6Choice setPmtReq(PaymentRequest6 value) {
        this.pmtReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest6 }
     *     
     */
    public LoyaltyRequest6 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest6 }
     *     
     */
    public TransactionToPerform6Choice setLltyReq(LoyaltyRequest6 value) {
        this.lltyReq = value;
        return this;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest6 }
     *     
     */
    public ReversalRequest6 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest6 }
     *     
     */
    public TransactionToPerform6Choice setRvslReq(ReversalRequest6 value) {
        this.rvslReq = value;
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
