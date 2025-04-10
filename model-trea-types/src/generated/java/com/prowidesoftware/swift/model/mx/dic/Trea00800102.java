
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
 * Scope
 * The StatusNotification message is sent by a central system to a participant to notify the current status of a trade in the system.
 * Usage
 * This message will be sent at specific times agreed upon by the central settlement system and a participant in a central settlement system.
 * 
 * 
 * This message is obsolete please use ForeignExchangeAndDerivativeTradeStatusNotificationV03 - fxtr.008.001.03
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trea.008.001.02", propOrder = {
    "tradData"
})
public class Trea00800102 {

    @XmlElement(name = "TradData", required = true)
    protected TradeData1 tradData;

    /**
     * Gets the value of the tradData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData1 }
     *     
     */
    public TradeData1 getTradData() {
        return tradData;
    }

    /**
     * Sets the value of the tradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData1 }
     *     
     */
    public Trea00800102 setTradData(TradeData1 value) {
        this.tradData = value;
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
