
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
 * Identification of a cryptographic asymmetric key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient9Choice", propOrder = {
    "issrAndSrlNb",
    "keyIdr"
})
public class Recipient9Choice {

    @XmlElement(name = "IssrAndSrlNb")
    protected IssuerAndSerialNumber2 issrAndSrlNb;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier2 keyIdr;

    /**
     * Gets the value of the issrAndSrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumber2 }
     *     
     */
    public IssuerAndSerialNumber2 getIssrAndSrlNb() {
        return issrAndSrlNb;
    }

    /**
     * Sets the value of the issrAndSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumber2 }
     *     
     */
    public Recipient9Choice setIssrAndSrlNb(IssuerAndSerialNumber2 value) {
        this.issrAndSrlNb = value;
        return this;
    }

    /**
     * Gets the value of the keyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public KEKIdentifier2 getKeyIdr() {
        return keyIdr;
    }

    /**
     * Sets the value of the keyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public Recipient9Choice setKeyIdr(KEKIdentifier2 value) {
        this.keyIdr = value;
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
