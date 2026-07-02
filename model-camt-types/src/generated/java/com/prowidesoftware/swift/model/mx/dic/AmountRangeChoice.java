
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
 * Search for an amount with or without the currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountRangeChoice", propOrder = {
    "impldCcyAndAmtRg",
    "ccyAndAmtRg"
})
public class AmountRangeChoice {

    @XmlElement(name = "ImpldCcyAndAmtRg")
    protected ImpliedCurrencyAndAmountRange impldCcyAndAmtRg;
    @XmlElement(name = "CcyAndAmtRg")
    protected CurrencyAndAmountRange ccyAndAmtRg;

    /**
     * Gets the value of the impldCcyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAndAmountRange }
     *     
     */
    public ImpliedCurrencyAndAmountRange getImpldCcyAndAmtRg() {
        return impldCcyAndAmtRg;
    }

    /**
     * Sets the value of the impldCcyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAndAmountRange }
     *     
     */
    public AmountRangeChoice setImpldCcyAndAmtRg(ImpliedCurrencyAndAmountRange value) {
        this.impldCcyAndAmtRg = value;
        return this;
    }

    /**
     * Gets the value of the ccyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountRange }
     *     
     */
    public CurrencyAndAmountRange getCcyAndAmtRg() {
        return ccyAndAmtRg;
    }

    /**
     * Sets the value of the ccyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountRange }
     *     
     */
    public AmountRangeChoice setCcyAndAmtRg(CurrencyAndAmountRange value) {
        this.ccyAndAmtRg = value;
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
