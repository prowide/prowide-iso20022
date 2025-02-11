
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
 * Choice between formats for the frequency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyCodeAndDSSCode1Choice", propOrder = {
    "frqcyAsCd",
    "frqcyAsDSS"
})
public class FrequencyCodeAndDSSCode1Choice {

    @XmlElement(name = "FrqcyAsCd")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code frqcyAsCd;
    @XmlElement(name = "FrqcyAsDSS")
    protected GenericIdentification7 frqcyAsDSS;

    /**
     * Gets the value of the frqcyAsCd property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getFrqcyAsCd() {
        return frqcyAsCd;
    }

    /**
     * Sets the value of the frqcyAsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public FrequencyCodeAndDSSCode1Choice setFrqcyAsCd(EventFrequency1Code value) {
        this.frqcyAsCd = value;
        return this;
    }

    /**
     * Gets the value of the frqcyAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification7 }
     *     
     */
    public GenericIdentification7 getFrqcyAsDSS() {
        return frqcyAsDSS;
    }

    /**
     * Sets the value of the frqcyAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification7 }
     *     
     */
    public FrequencyCodeAndDSSCode1Choice setFrqcyAsDSS(GenericIdentification7 value) {
        this.frqcyAsDSS = value;
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
