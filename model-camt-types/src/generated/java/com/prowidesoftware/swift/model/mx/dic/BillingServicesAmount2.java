
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
 * Taxable service charge amount conversions to host currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServicesAmount2", propOrder = {
    "hstAmt",
    "sttlmAmt",
    "pricgAmt"
})
public class BillingServicesAmount2 {

    @XmlElement(name = "HstAmt", required = true)
    protected AmountAndDirection34 hstAmt;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection34 sttlmAmt;
    @XmlElement(name = "PricgAmt")
    protected AmountAndDirection34 pricgAmt;

    /**
     * Gets the value of the hstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getHstAmt() {
        return hstAmt;
    }

    /**
     * Sets the value of the hstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServicesAmount2 setHstAmt(AmountAndDirection34 value) {
        this.hstAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServicesAmount2 setSttlmAmt(AmountAndDirection34 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the pricgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getPricgAmt() {
        return pricgAmt;
    }

    /**
     * Sets the value of the pricgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingServicesAmount2 setPricgAmt(AmountAndDirection34 value) {
        this.pricgAmt = value;
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
