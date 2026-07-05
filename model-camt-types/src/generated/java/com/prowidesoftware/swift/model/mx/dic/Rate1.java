
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
 * Set of elements qualifying the interest rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate1", propOrder = {
    "rate",
    "vldtyRg"
})
public class Rate1 {

    @XmlElement(name = "Rate", required = true)
    protected RateTypeChoice rate;
    @XmlElement(name = "VldtyRg")
    protected CurrencyAndAmountRange vldtyRg;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeChoice }
     *     
     */
    public RateTypeChoice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeChoice }
     *     
     */
    public Rate1 setRate(RateTypeChoice value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the vldtyRg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmountRange }
     *     
     */
    public CurrencyAndAmountRange getVldtyRg() {
        return vldtyRg;
    }

    /**
     * Sets the value of the vldtyRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmountRange }
     *     
     */
    public Rate1 setVldtyRg(CurrencyAndAmountRange value) {
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
