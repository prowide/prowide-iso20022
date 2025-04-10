
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
 * Choice between a rate or an absolute value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateOrAbsoluteValue1Choice", propOrder = {
    "rateVal",
    "absVal"
})
public class RateOrAbsoluteValue1Choice {

    @XmlElement(name = "RateVal")
    protected BigDecimal rateVal;
    @XmlElement(name = "AbsVal")
    protected BigDecimal absVal;

    /**
     * Gets the value of the rateVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateVal() {
        return rateVal;
    }

    /**
     * Sets the value of the rateVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateOrAbsoluteValue1Choice setRateVal(BigDecimal value) {
        this.rateVal = value;
        return this;
    }

    /**
     * Gets the value of the absVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAbsVal() {
        return absVal;
    }

    /**
     * Sets the value of the absVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateOrAbsoluteValue1Choice setAbsVal(BigDecimal value) {
        this.absVal = value;
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
