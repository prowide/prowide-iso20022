
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
 * Information describing the high level details of a split trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitTradeDetails4", propOrder = {
    "stsDtls",
    "tradAmts",
    "agrdRate"
})
public class SplitTradeDetails4 {

    @XmlElement(name = "StsDtls")
    protected TradeData16 stsDtls;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate6 tradAmts;
    @XmlElement(name = "AgrdRate")
    protected AgreedRate3 agrdRate;

    /**
     * Gets the value of the stsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData16 }
     *     
     */
    public TradeData16 getStsDtls() {
        return stsDtls;
    }

    /**
     * Sets the value of the stsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData16 }
     *     
     */
    public SplitTradeDetails4 setStsDtls(TradeData16 value) {
        this.stsDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate6 }
     *     
     */
    public AmountsAndValueDate6 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate6 }
     *     
     */
    public SplitTradeDetails4 setTradAmts(AmountsAndValueDate6 value) {
        this.tradAmts = value;
        return this;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public SplitTradeDetails4 setAgrdRate(AgreedRate3 value) {
        this.agrdRate = value;
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
