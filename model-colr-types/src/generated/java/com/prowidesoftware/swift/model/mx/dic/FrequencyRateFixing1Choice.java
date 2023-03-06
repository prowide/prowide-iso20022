
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
 * Specifies the frequency fixing for the rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyRateFixing1Choice", propOrder = {
    "cd",
    "nbOfDays"
})
public class FrequencyRateFixing1Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected FrequencyRateFixing1Code cd;
    @XmlElement(name = "NbOfDays")
    protected String nbOfDays;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyRateFixing1Code }
     *     
     */
    public FrequencyRateFixing1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyRateFixing1Code }
     *     
     */
    public FrequencyRateFixing1Choice setCd(FrequencyRateFixing1Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FrequencyRateFixing1Choice setNbOfDays(String value) {
        this.nbOfDays = value;
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
