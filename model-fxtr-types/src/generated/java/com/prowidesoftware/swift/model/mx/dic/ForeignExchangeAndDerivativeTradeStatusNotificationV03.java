
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
 * Scope
 * The ForeignExchangeAndDerivativeTradeStatusNotification message is sent by a central system to the participant to notify the current status of a foreign exchange or derivative trade in the system.
 * Usage
 * This message will be sent at specific times agreed upon by the central settlement system and a participant in a central settlement system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeAndDerivativeTradeStatusNotificationV03", propOrder = {
    "tradData"
})
public class ForeignExchangeAndDerivativeTradeStatusNotificationV03 {

    @XmlElement(name = "TradData", required = true)
    protected TradeData6 tradData;

    /**
     * Gets the value of the tradData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData6 }
     *     
     */
    public TradeData6 getTradData() {
        return tradData;
    }

    /**
     * Sets the value of the tradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData6 }
     *     
     */
    public ForeignExchangeAndDerivativeTradeStatusNotificationV03 setTradData(TradeData6 value) {
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
