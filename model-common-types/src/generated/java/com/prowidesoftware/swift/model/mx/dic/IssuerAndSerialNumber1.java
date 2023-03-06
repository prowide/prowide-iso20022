
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
 * Certificate issuer name and serial number (see X.509).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerAndSerialNumber1", propOrder = {
    "issr",
    "srlNb"
})
public class IssuerAndSerialNumber1 {

    @XmlElement(name = "Issr", required = true)
    protected CertificateIssuer1 issr;
    @XmlElement(name = "SrlNb", required = true)
    protected byte[] srlNb;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public CertificateIssuer1 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public IssuerAndSerialNumber1 setIssr(CertificateIssuer1 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public IssuerAndSerialNumber1 setSrlNb(byte[] value) {
        this.srlNb = value;
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
