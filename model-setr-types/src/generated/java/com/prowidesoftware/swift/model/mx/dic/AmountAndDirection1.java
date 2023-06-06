
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
 * Amount of money debited or credited on the books of an account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndDirection1", propOrder = {
    "amt",
    "orgnlCcyAndOrdrdAmt",
    "cdtDbt",
    "xchg"
})
public class AmountAndDirection1 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "OrgnlCcyAndOrdrdAmt")
    protected ActiveCurrencyAndAmount orgnlCcyAndOrdrdAmt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbt;
    @XmlElement(name = "Xchg")
    protected CurrencyExchange4 xchg;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AmountAndDirection1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCcyAndOrdrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlCcyAndOrdrdAmt() {
        return orgnlCcyAndOrdrdAmt;
    }

    /**
     * Sets the value of the orgnlCcyAndOrdrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AmountAndDirection1 setOrgnlCcyAndOrdrdAmt(ActiveCurrencyAndAmount value) {
        this.orgnlCcyAndOrdrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public AmountAndDirection1 setCdtDbt(CreditDebitCode value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the xchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange4 }
     *     
     */
    public CurrencyExchange4 getXchg() {
        return xchg;
    }

    /**
     * Sets the value of the xchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange4 }
     *     
     */
    public AmountAndDirection1 setXchg(CurrencyExchange4 value) {
        this.xchg = value;
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
