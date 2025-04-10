
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a percentage rate or a rate index or a rate name.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateOrName4Choice", propOrder = {
    "rate",
    "rateIndxDtls"
})
public class RateOrName4Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateIndxDtls")
    protected RateTypeAndLookback2 rateIndxDtls;

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
    public RateOrName4Choice setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the rateIndxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndLookback2 }
     *     
     */
    public RateTypeAndLookback2 getRateIndxDtls() {
        return rateIndxDtls;
    }

    /**
     * Sets the value of the rateIndxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndLookback2 }
     *     
     */
    public RateOrName4Choice setRateIndxDtls(RateTypeAndLookback2 value) {
        this.rateIndxDtls = value;
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
