
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
 * Choice of proxy allowance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy4Choice", propOrder = {
    "prxy",
    "prxyNotAllwd"
})
public class Proxy4Choice {

    @XmlElement(name = "Prxy")
    protected ProxyAppointmentInformation5 prxy;
    @XmlElement(name = "PrxyNotAllwd")
    @XmlSchemaType(name = "string")
    protected ProxyNotAllowed1Code prxyNotAllwd;

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAppointmentInformation5 }
     *     
     */
    public ProxyAppointmentInformation5 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAppointmentInformation5 }
     *     
     */
    public Proxy4Choice setPrxy(ProxyAppointmentInformation5 value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the prxyNotAllwd property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyNotAllowed1Code }
     *     
     */
    public ProxyNotAllowed1Code getPrxyNotAllwd() {
        return prxyNotAllwd;
    }

    /**
     * Sets the value of the prxyNotAllwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyNotAllowed1Code }
     *     
     */
    public Proxy4Choice setPrxyNotAllwd(ProxyNotAllowed1Code value) {
        this.prxyNotAllwd = value;
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
