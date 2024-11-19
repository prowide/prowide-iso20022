
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
@XmlType(name = "Recipient13Choice", propOrder = {
    "issrAndSrlNb",
    "sbjtKeyIdr"
})
public class Recipient13Choice {

    @XmlElement(name = "IssrAndSrlNb")
    protected IssuerAndSerialNumber2 issrAndSrlNb;
    @XmlElement(name = "SbjtKeyIdr")
    protected byte[] sbjtKeyIdr;

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
    public Recipient13Choice setIssrAndSrlNb(IssuerAndSerialNumber2 value) {
        this.issrAndSrlNb = value;
        return this;
    }

    /**
     * Gets the value of the sbjtKeyIdr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSbjtKeyIdr() {
        return sbjtKeyIdr;
    }

    /**
     * Sets the value of the sbjtKeyIdr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Recipient13Choice setSbjtKeyIdr(byte[] value) {
        this.sbjtKeyIdr = value;
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
