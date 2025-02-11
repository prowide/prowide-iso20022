
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
 * Set of elements used to provide information on the original amount and currency exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchangeDetails5", propOrder = {
    "amt",
    "ccyXchg"
})
public class AmountAndCurrencyExchangeDetails5 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CcyXchg")
    protected CurrencyExchange24 ccyXchg;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange24 }
     *     
     */
    public CurrencyExchange24 getCcyXchg() {
        return ccyXchg;
    }

    /**
     * Sets the value of the ccyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange24 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 setCcyXchg(CurrencyExchange24 value) {
        this.ccyXchg = value;
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
