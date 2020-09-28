
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
 * Choice between a range of amount values with or without the currency. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveOrHistoricAmountRange1Choice", propOrder = {
    "impldCcyAndAmtRg",
    "ccyAndAmtRg"
})
public class ActiveOrHistoricAmountRange1Choice {

    @XmlElement(name = "ImpldCcyAndAmtRg")
    protected ImpliedCurrencyAndAmountRange impldCcyAndAmtRg;
    @XmlElement(name = "CcyAndAmtRg")
    protected ActiveOrHistoricCurrencyAndAmountRange1 ccyAndAmtRg;

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
    public ActiveOrHistoricAmountRange1Choice setImpldCcyAndAmtRg(ImpliedCurrencyAndAmountRange value) {
        this.impldCcyAndAmtRg = value;
        return this;
    }

    /**
     * Gets the value of the ccyAndAmtRg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange1 }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmountRange1 getCcyAndAmtRg() {
        return ccyAndAmtRg;
    }

    /**
     * Sets the value of the ccyAndAmtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange1 }
     *     
     */
    public ActiveOrHistoricAmountRange1Choice setCcyAndAmtRg(ActiveOrHistoricCurrencyAndAmountRange1 value) {
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
