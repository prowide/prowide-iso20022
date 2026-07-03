
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
 * Content of the Batch Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionToPerform2Choice", propOrder = {
    "pmtReq",
    "lltyReq",
    "rvslReq"
})
public class TransactionToPerform2Choice {

    @XmlElement(name = "PmtReq")
    protected PaymentRequest2 pmtReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest2 lltyReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest2 rvslReq;

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest2 }
     *     
     */
    public PaymentRequest2 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest2 }
     *     
     */
    public TransactionToPerform2Choice setPmtReq(PaymentRequest2 value) {
        this.pmtReq = value;
        return this;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest2 }
     *     
     */
    public LoyaltyRequest2 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest2 }
     *     
     */
    public TransactionToPerform2Choice setLltyReq(LoyaltyRequest2 value) {
        this.lltyReq = value;
        return this;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest2 }
     *     
     */
    public ReversalRequest2 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest2 }
     *     
     */
    public TransactionToPerform2Choice setRvslReq(ReversalRequest2 value) {
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
