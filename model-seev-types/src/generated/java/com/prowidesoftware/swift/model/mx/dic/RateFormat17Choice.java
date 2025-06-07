
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
 * Choice between a rate or a rate type and rate or an unspecified rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateFormat17Choice", propOrder = {
    "rate",
    "rateTpAndRate"
})
public class RateFormat17Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateTpAndRate")
    protected RateTypeAndPercentageRate3 rateTpAndRate;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateFormat17Choice setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the rateTpAndRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndPercentageRate3 }
     *     
     */
    public RateTypeAndPercentageRate3 getRateTpAndRate() {
        return rateTpAndRate;
    }

    /**
     * Sets the value of the rateTpAndRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndPercentageRate3 }
     *     
     */
    public RateFormat17Choice setRateTpAndRate(RateTypeAndPercentageRate3 value) {
        this.rateTpAndRate = value;
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
