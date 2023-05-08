
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Exchange rate and calculated amount to be presented to the customer when the dispense currency or the deposit currency (target currency) is different to account currency (source currency).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion5", propOrder = {
    "srcCcy",
    "srcCcyNmrc",
    "trgtCcy",
    "trgtCcyNmrc",
    "rate",
    "clctdAmt"
})
public class CurrencyConversion5 {

    @XmlElement(name = "SrcCcy", required = true)
    protected String srcCcy;
    @XmlElement(name = "SrcCcyNmrc", required = true)
    protected String srcCcyNmrc;
    @XmlElement(name = "TrgtCcy", required = true)
    protected String trgtCcy;
    @XmlElement(name = "TrgtCcyNmrc", required = true)
    protected String trgtCcyNmrc;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "ClctdAmt", required = true)
    protected BigDecimal clctdAmt;

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion5 setSrcCcy(String value) {
        this.srcCcy = value;
        return this;
    }

    /**
     * Gets the value of the srcCcyNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcyNmrc() {
        return srcCcyNmrc;
    }

    /**
     * Sets the value of the srcCcyNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion5 setSrcCcyNmrc(String value) {
        this.srcCcyNmrc = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion5 setTrgtCcy(String value) {
        this.trgtCcy = value;
        return this;
    }

    /**
     * Gets the value of the trgtCcyNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcyNmrc() {
        return trgtCcyNmrc;
    }

    /**
     * Sets the value of the trgtCcyNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyConversion5 setTrgtCcyNmrc(String value) {
        this.trgtCcyNmrc = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion5 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the clctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctdAmt() {
        return clctdAmt;
    }

    /**
     * Sets the value of the clctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyConversion5 setClctdAmt(BigDecimal value) {
        this.clctdAmt = value;
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
