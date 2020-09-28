
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Technique whereby a position in the underlying is traded for a futures position in the physical commodity markets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeForPhysicalTradeParameters1", propOrder = {
    "outsdIndx",
    "fairVal",
    "valForFutrs"
})
public class ExchangeForPhysicalTradeParameters1 {

    @XmlElement(name = "OutsdIndx")
    protected BigDecimal outsdIndx;
    @XmlElement(name = "FairVal")
    protected ActiveCurrencyAndAmount fairVal;
    @XmlElement(name = "ValForFutrs")
    protected ActiveCurrencyAndAmount valForFutrs;

    /**
     * Gets the value of the outsdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutsdIndx() {
        return outsdIndx;
    }

    /**
     * Sets the value of the outsdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeForPhysicalTradeParameters1 setOutsdIndx(BigDecimal value) {
        this.outsdIndx = value;
        return this;
    }

    /**
     * Gets the value of the fairVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFairVal() {
        return fairVal;
    }

    /**
     * Sets the value of the fairVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ExchangeForPhysicalTradeParameters1 setFairVal(ActiveCurrencyAndAmount value) {
        this.fairVal = value;
        return this;
    }

    /**
     * Gets the value of the valForFutrs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getValForFutrs() {
        return valForFutrs;
    }

    /**
     * Sets the value of the valForFutrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ExchangeForPhysicalTradeParameters1 setValForFutrs(ActiveCurrencyAndAmount value) {
        this.valForFutrs = value;
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
