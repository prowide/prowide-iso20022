
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice element specifying the underlying types of an interest rate derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateDerivative2Choice", propOrder = {
    "swpRltd",
    "othr"
})
public class InterestRateDerivative2Choice {

    @XmlElement(name = "SwpRltd")
    @XmlSchemaType(name = "string")
    protected SwapType1Code swpRltd;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected UnderlyingInterestRateType3Code othr;

    /**
     * Gets the value of the swpRltd property.
     * 
     * @return
     *     possible object is
     *     {@link SwapType1Code }
     *     
     */
    public SwapType1Code getSwpRltd() {
        return swpRltd;
    }

    /**
     * Sets the value of the swpRltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapType1Code }
     *     
     */
    public InterestRateDerivative2Choice setSwpRltd(SwapType1Code value) {
        this.swpRltd = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInterestRateType3Code }
     *     
     */
    public UnderlyingInterestRateType3Code getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInterestRateType3Code }
     *     
     */
    public InterestRateDerivative2Choice setOthr(UnderlyingInterestRateType3Code value) {
        this.othr = value;
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
