
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
 * Amount of money to be transferred between the debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred into a different currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquivalentAmount", propOrder = {
    "amt",
    "ccyOfTrf"
})
public class EquivalentAmount {

    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;
    @XmlElement(name = "CcyOfTrf", required = true)
    protected String ccyOfTrf;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public EquivalentAmount setAmt(CurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ccyOfTrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOfTrf() {
        return ccyOfTrf;
    }

    /**
     * Sets the value of the ccyOfTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EquivalentAmount setCcyOfTrf(String value) {
        this.ccyOfTrf = value;
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
