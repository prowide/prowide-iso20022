
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
 * Set of elements providing information on the original amount and currency information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchangeDetails2", propOrder = {
    "tp",
    "amt",
    "ccyXchg"
})
public class AmountAndCurrencyExchangeDetails2 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;
    @XmlElement(name = "CcyXchg")
    protected CurrencyExchange3 ccyXchg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AmountAndCurrencyExchangeDetails2 setTp(String value) {
        this.tp = value;
        return this;
    }

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
    public AmountAndCurrencyExchangeDetails2 setAmt(CurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange3 }
     *     
     */
    public CurrencyExchange3 getCcyXchg() {
        return ccyXchg;
    }

    /**
     * Sets the value of the ccyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails2 setCcyXchg(CurrencyExchange3 value) {
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
