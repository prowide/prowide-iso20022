
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
 * Numeric variables calculated on the number of transactions or on market exposures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeMetrics4", propOrder = {
    "reuseVal",
    "rinvstdCshAmt"
})
public class VolumeMetrics4 {

    @XmlElement(name = "ReuseVal")
    protected ReuseValue1Choice reuseVal;
    @XmlElement(name = "RinvstdCshAmt")
    protected ActiveOrHistoricCurrencyAndAmount rinvstdCshAmt;

    /**
     * Gets the value of the reuseVal property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public ReuseValue1Choice getReuseVal() {
        return reuseVal;
    }

    /**
     * Sets the value of the reuseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public VolumeMetrics4 setReuseVal(ReuseValue1Choice value) {
        this.reuseVal = value;
        return this;
    }

    /**
     * Gets the value of the rinvstdCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRinvstdCshAmt() {
        return rinvstdCshAmt;
    }

    /**
     * Sets the value of the rinvstdCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public VolumeMetrics4 setRinvstdCshAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rinvstdCshAmt = value;
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
