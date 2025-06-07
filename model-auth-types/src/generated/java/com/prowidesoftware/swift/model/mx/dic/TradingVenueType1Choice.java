
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the trading venue where the transaction was executed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueType1Choice", propOrder = {
    "onVn",
    "offVn"
})
public class TradingVenueType1Choice {

    @XmlElement(name = "OnVn")
    @XmlSchemaType(name = "string")
    protected TradeMarket2Code onVn;
    @XmlElement(name = "OffVn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode offVn;

    /**
     * Gets the value of the onVn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarket2Code }
     *     
     */
    public TradeMarket2Code getOnVn() {
        return onVn;
    }

    /**
     * Sets the value of the onVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarket2Code }
     *     
     */
    public TradingVenueType1Choice setOnVn(TradeMarket2Code value) {
        this.onVn = value;
        return this;
    }

    /**
     * Gets the value of the offVn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getOffVn() {
        return offVn;
    }

    /**
     * Sets the value of the offVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public TradingVenueType1Choice setOffVn(NoReasonCode value) {
        this.offVn = value;
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
