
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
 * Set of elements used to qualify the interest rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate4", propOrder = {
    "tp",
    "vldtyRg"
})
public class Rate4 {

    @XmlElement(name = "Tp", required = true)
    protected RateType4Choice tp;
    @XmlElement(name = "VldtyRg")
    protected ActiveOrHistoricCurrencyAndAmountRange2 vldtyRg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType4Choice }
     *     
     */
    public RateType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType4Choice }
     *     
     */
    public Rate4 setTp(RateType4Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the vldtyRg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange2 }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmountRange2 getVldtyRg() {
        return vldtyRg;
    }

    /**
     * Sets the value of the vldtyRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange2 }
     *     
     */
    public Rate4 setVldtyRg(ActiveOrHistoricCurrencyAndAmountRange2 value) {
        this.vldtyRg = value;
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
