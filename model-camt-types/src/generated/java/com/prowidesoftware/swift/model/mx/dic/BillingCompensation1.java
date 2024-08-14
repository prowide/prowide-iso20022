
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
 * Specifies the compensation data of an incorrect billing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCompensation1", propOrder = {
    "tp",
    "val",
    "ccyTp"
})
public class BillingCompensation1 {

    @XmlElement(name = "Tp", required = true)
    protected BillingCompensationType1Choice tp;
    @XmlElement(name = "Val", required = true)
    protected AmountAndDirection34 val;
    @XmlElement(name = "CcyTp")
    @XmlSchemaType(name = "string")
    protected BillingCurrencyType2Code ccyTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCompensationType1Choice }
     *     
     */
    public BillingCompensationType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCompensationType1Choice }
     *     
     */
    public BillingCompensation1 setTp(BillingCompensationType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BillingCompensation1 setVal(AmountAndDirection34 value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the ccyTp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCurrencyType2Code }
     *     
     */
    public BillingCurrencyType2Code getCcyTp() {
        return ccyTp;
    }

    /**
     * Sets the value of the ccyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCurrencyType2Code }
     *     
     */
    public BillingCompensation1 setCcyTp(BillingCurrencyType2Code value) {
        this.ccyTp = value;
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
