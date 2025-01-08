
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
 * Cardholder verification capabilities performing the transaction at the point of service.
 * 
 * ISO 8583:87 bit 22-3, ISO 8583;93 bit 22-2, ISO 8583:2003 bit 27-2
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityCapability1", propOrder = {
    "cpblty",
    "othrCpblty"
})
public class CardSecurityCapability1 {

    @XmlElement(name = "Cpblty", required = true)
    @XmlSchemaType(name = "string")
    protected CardSecurityCapability1Code cpblty;
    @XmlElement(name = "OthrCpblty")
    protected String othrCpblty;

    /**
     * Gets the value of the cpblty property.
     * 
     * @return
     *     possible object is
     *     {@link CardSecurityCapability1Code }
     *     
     */
    public CardSecurityCapability1Code getCpblty() {
        return cpblty;
    }

    /**
     * Sets the value of the cpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSecurityCapability1Code }
     *     
     */
    public CardSecurityCapability1 setCpblty(CardSecurityCapability1Code value) {
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
    public CardSecurityCapability1 setOthrCpblty(String value) {
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
