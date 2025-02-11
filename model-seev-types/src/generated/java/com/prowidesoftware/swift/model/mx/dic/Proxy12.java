
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
 * Identification of a proxy appointed to represent a party authorised to vote at a shareholders meeting and proxy vote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy12", propOrder = {
    "prxyTp",
    "prsnDtls"
})
public class Proxy12 {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProxyType3Code prxyTp;
    @XmlElement(name = "PrsnDtls")
    protected IndividualPerson42 prsnDtls;

    /**
     * Gets the value of the prxyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyType3Code }
     *     
     */
    public ProxyType3Code getPrxyTp() {
        return prxyTp;
    }

    /**
     * Sets the value of the prxyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyType3Code }
     *     
     */
    public Proxy12 setPrxyTp(ProxyType3Code value) {
        this.prxyTp = value;
        return this;
    }

    /**
     * Gets the value of the prsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson42 }
     *     
     */
    public IndividualPerson42 getPrsnDtls() {
        return prsnDtls;
    }

    /**
     * Sets the value of the prsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson42 }
     *     
     */
    public Proxy12 setPrsnDtls(IndividualPerson42 value) {
        this.prsnDtls = value;
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
