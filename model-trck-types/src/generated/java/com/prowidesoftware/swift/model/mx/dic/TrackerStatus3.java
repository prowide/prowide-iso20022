
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides detailed information on the transaction status to be updated in the tracker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerStatus3", propOrder = {
    "sts",
    "stsRsn",
    "rjctRtrRsn"
})
public class TrackerStatus3 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected TrackerPaymentStatus1Code sts;
    @XmlElement(name = "StsRsn")
    protected PaymentStatusReason2 stsRsn;
    @XmlElement(name = "RjctRtrRsn")
    protected PaymentRejectReturnReason2 rjctRtrRsn;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPaymentStatus1Code }
     *     
     */
    public TrackerPaymentStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPaymentStatus1Code }
     *     
     */
    public TrackerStatus3 setSts(TrackerPaymentStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusReason2 }
     *     
     */
    public PaymentStatusReason2 getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusReason2 }
     *     
     */
    public TrackerStatus3 setStsRsn(PaymentStatusReason2 value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctRtrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRejectReturnReason2 }
     *     
     */
    public PaymentRejectReturnReason2 getRjctRtrRsn() {
        return rjctRtrRsn;
    }

    /**
     * Sets the value of the rjctRtrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRejectReturnReason2 }
     *     
     */
    public TrackerStatus3 setRjctRtrRsn(PaymentRejectReturnReason2 value) {
        this.rjctRtrRsn = value;
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
