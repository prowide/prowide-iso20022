
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides the balance for the billing services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingBalance1", propOrder = {
    "tp",
    "val",
    "ccyTp"
})
public class BillingBalance1 {

    @XmlElement(name = "Tp", required = true)
    protected BillingBalanceType1Choice tp;
    @XmlElement(name = "Val", required = true)
    protected AmountAndDirection34 val;
    @XmlElement(name = "CcyTp")
    @XmlSchemaType(name = "string")
    protected BillingCurrencyType1Code ccyTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingBalanceType1Choice }
     *     
     */
    public BillingBalanceType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingBalanceType1Choice }
     *     
     */
    public BillingBalance1 setTp(BillingBalanceType1Choice value) {
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
    public BillingBalance1 setVal(AmountAndDirection34 value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the ccyTp property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCurrencyType1Code }
     *     
     */
    public BillingCurrencyType1Code getCcyTp() {
        return ccyTp;
    }

    /**
     * Sets the value of the ccyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCurrencyType1Code }
     *     
     */
    public BillingBalance1 setCcyTp(BillingCurrencyType1Code value) {
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
