
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
 * Choice between a range of amount values with or without the currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveAmountRange1Choice", propOrder = {
    "impldCcyAndAmtRg",
    "ccyAndAmtRg"
})
public class ActiveAmountRange1Choice {

    @XmlElement(name = "ImpldCcyAndAmtRg")
    protected ImpliedCurrencyAndAmountRange impldCcyAndAmtRg;
    @XmlElement(name = "CcyAndAmtRg")
    protected ActiveCurrencyAndAmountRange1 ccyAndAmtRg;

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
    public ActiveAmountRange1Choice setImpldCcyAndAmtRg(ImpliedCurrencyAndAmountRange value) {
        this.impldCcyAndAmtRg = value;
        return this;
    }

    /**
     * Gets the value of the ccyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmountRange1 }
     *     
     */
    public ActiveCurrencyAndAmountRange1 getCcyAndAmtRg() {
        return ccyAndAmtRg;
    }

    /**
     * Sets the value of the ccyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmountRange1 }
     *     
     */
    public ActiveAmountRange1Choice setCcyAndAmtRg(ActiveCurrencyAndAmountRange1 value) {
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
