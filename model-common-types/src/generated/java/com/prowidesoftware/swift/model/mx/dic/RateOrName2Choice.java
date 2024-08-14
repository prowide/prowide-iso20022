
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
 * Choice between a percentage rate or a rate name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateOrName2Choice", propOrder = {
    "rate",
    "rateNm"
})
public class RateOrName2Choice {

    @XmlElement(name = "Rate")
    protected Rate2 rate;
    @XmlElement(name = "RateNm")
    protected RateName2 rateNm;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public RateOrName2Choice setRate(Rate2 value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the rateNm property.
     * 
     * @return
     *     possible object is
     *     {@link RateName2 }
     *     
     */
    public RateName2 getRateNm() {
        return rateNm;
    }

    /**
     * Sets the value of the rateNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName2 }
     *     
     */
    public RateOrName2Choice setRateNm(RateName2 value) {
        this.rateNm = value;
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
