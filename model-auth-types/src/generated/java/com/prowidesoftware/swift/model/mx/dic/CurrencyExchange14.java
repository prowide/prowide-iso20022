
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
 * Specifies details of the fund currency exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange14", propOrder = {
    "baseCcyAmt",
    "rptgCcyAmt"
})
public class CurrencyExchange14 {

    @XmlElement(name = "BaseCcyAmt", required = true)
    protected BigDecimal baseCcyAmt;
    @XmlElement(name = "RptgCcyAmt")
    protected ActiveCurrencyAndAmount rptgCcyAmt;

    /**
     * Gets the value of the baseCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCcyAmt() {
        return baseCcyAmt;
    }

    /**
     * Sets the value of the baseCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyExchange14 setBaseCcyAmt(BigDecimal value) {
        this.baseCcyAmt = value;
        return this;
    }

    /**
     * Gets the value of the rptgCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRptgCcyAmt() {
        return rptgCcyAmt;
    }

    /**
     * Sets the value of the rptgCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CurrencyExchange14 setRptgCcyAmt(ActiveCurrencyAndAmount value) {
        this.rptgCcyAmt = value;
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
