
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
 * The StatusNotification message is sent by a central system to a participant to notify the current status of a trade in the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trea.008.001.01", propOrder = {
    "tradData"
})
public class Trea00800101 {

    @XmlElement(name = "TradData", required = true)
    protected TradeData2 tradData;

    /**
     * Gets the value of the tradData property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData2 }
     *     
     */
    public TradeData2 getTradData() {
        return tradData;
    }

    /**
     * Sets the value of the tradData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData2 }
     *     
     */
    public Trea00800101 setTradData(TradeData2 value) {
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
