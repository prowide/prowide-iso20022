
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
 * Specifies a multi-leg interest derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInterest3", propOrder = {
    "intrstRate",
    "frstLegIntrstRate",
    "othrNtnlCcy",
    "othrLegIntrstRate"
})
public class DerivativeInterest3 {

    @XmlElement(name = "IntrstRate", required = true)
    protected FloatingInterestRate8 intrstRate;
    @XmlElement(name = "FrstLegIntrstRate")
    protected InterestRate8Choice frstLegIntrstRate;
    @XmlElement(name = "OthrNtnlCcy")
    protected String othrNtnlCcy;
    @XmlElement(name = "OthrLegIntrstRate")
    protected InterestRate8Choice othrLegIntrstRate;

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public FloatingInterestRate8 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public DerivativeInterest3 setIntrstRate(FloatingInterestRate8 value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the frstLegIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate8Choice }
     *     
     */
    public InterestRate8Choice getFrstLegIntrstRate() {
        return frstLegIntrstRate;
    }

    /**
     * Sets the value of the frstLegIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate8Choice }
     *     
     */
    public DerivativeInterest3 setFrstLegIntrstRate(InterestRate8Choice value) {
        this.frstLegIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the othrNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtnlCcy() {
        return othrNtnlCcy;
    }

    /**
     * Sets the value of the othrNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeInterest3 setOthrNtnlCcy(String value) {
        this.othrNtnlCcy = value;
        return this;
    }

    /**
     * Gets the value of the othrLegIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate8Choice }
     *     
     */
    public InterestRate8Choice getOthrLegIntrstRate() {
        return othrLegIntrstRate;
    }

    /**
     * Sets the value of the othrLegIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate8Choice }
     *     
     */
    public DerivativeInterest3 setOthrLegIntrstRate(InterestRate8Choice value) {
        this.othrLegIntrstRate = value;
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
