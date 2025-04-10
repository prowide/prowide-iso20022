
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the options for the time to maturity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeToMaturity2Choice", propOrder = {
    "prd",
    "spcl"
})
public class TimeToMaturity2Choice {

    @XmlElement(name = "Prd")
    protected TimeToMaturityPeriod2 prd;
    @XmlElement(name = "Spcl")
    @XmlSchemaType(name = "string")
    protected SpecialPurpose2Code spcl;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToMaturityPeriod2 }
     *     
     */
    public TimeToMaturityPeriod2 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToMaturityPeriod2 }
     *     
     */
    public TimeToMaturity2Choice setPrd(TimeToMaturityPeriod2 value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the spcl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialPurpose2Code }
     *     
     */
    public SpecialPurpose2Code getSpcl() {
        return spcl;
    }

    /**
     * Sets the value of the spcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialPurpose2Code }
     *     
     */
    public TimeToMaturity2Choice setSpcl(SpecialPurpose2Code value) {
        this.spcl = value;
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
