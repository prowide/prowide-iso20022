
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
 * Specifies the agent specific tracking system information of a payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerRecord3", propOrder = {
    "chrgsAmt",
    "xchgRateData"
})
public class TrackerRecord3 {

    @XmlElement(name = "ChrgsAmt")
    protected RestrictedFINActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "XchgRateData")
    protected CurrencyExchange16 xchgRateData;

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public TrackerRecord3 setChrgsAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange16 }
     *     
     */
    public CurrencyExchange16 getXchgRateData() {
        return xchgRateData;
    }

    /**
     * Sets the value of the xchgRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange16 }
     *     
     */
    public TrackerRecord3 setXchgRateData(CurrencyExchange16 value) {
        this.xchgRateData = value;
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
