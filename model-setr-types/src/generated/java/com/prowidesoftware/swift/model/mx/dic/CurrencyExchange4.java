
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
 * Information needed to process a currency exchange or conversion.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange4", propOrder = {
    "xchgRate",
    "rsltgAmt",
    "srcAndTrgtCcy"
})
public class CurrencyExchange4 {

    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "RsltgAmt", required = true)
    protected ActiveCurrencyAndAmount rsltgAmt;
    @XmlElement(name = "SrcAndTrgtCcy", required = true)
    protected CurrencyReferenceDetails srcAndTrgtCcy;

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyExchange4 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the rsltgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRsltgAmt() {
        return rsltgAmt;
    }

    /**
     * Sets the value of the rsltgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CurrencyExchange4 setRsltgAmt(ActiveCurrencyAndAmount value) {
        this.rsltgAmt = value;
        return this;
    }

    /**
     * Gets the value of the srcAndTrgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReferenceDetails }
     *     
     */
    public CurrencyReferenceDetails getSrcAndTrgtCcy() {
        return srcAndTrgtCcy;
    }

    /**
     * Sets the value of the srcAndTrgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReferenceDetails }
     *     
     */
    public CurrencyExchange4 setSrcAndTrgtCcy(CurrencyReferenceDetails value) {
        this.srcAndTrgtCcy = value;
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
