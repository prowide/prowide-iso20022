
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
 * Card reading capability of the terminal performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardReadingCapabilities1", propOrder = {
    "cpblty",
    "othrCpblty"
})
public class CardReadingCapabilities1 {

    @XmlElement(name = "Cpblty", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataReading10Code cpblty;
    @XmlElement(name = "OthrCpblty")
    protected String othrCpblty;

    /**
     * Gets the value of the cpblty property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading10Code }
     *     
     */
    public CardDataReading10Code getCpblty() {
        return cpblty;
    }

    /**
     * Sets the value of the cpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading10Code }
     *     
     */
    public CardReadingCapabilities1 setCpblty(CardDataReading10Code value) {
        this.cpblty = value;
        return this;
    }

    /**
     * Gets the value of the othrCpblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCpblty() {
        return othrCpblty;
    }

    /**
     * Sets the value of the othrCpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardReadingCapabilities1 setOthrCpblty(String value) {
        this.othrCpblty = value;
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
