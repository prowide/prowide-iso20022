
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
 * Transport key or key encryption key (KEK) identification for the recipient.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateIdentifier1", propOrder = {
    "issrAndSrlNb"
})
public class CertificateIdentifier1 {

    @XmlElement(name = "IssrAndSrlNb", required = true)
    protected IssuerAndSerialNumber1 issrAndSrlNb;

    /**
     * Gets the value of the issrAndSrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumber1 }
     *     
     */
    public IssuerAndSerialNumber1 getIssrAndSrlNb() {
        return issrAndSrlNb;
    }

    /**
     * Sets the value of the issrAndSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumber1 }
     *     
     */
    public CertificateIdentifier1 setIssrAndSrlNb(IssuerAndSerialNumber1 value) {
        this.issrAndSrlNb = value;
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
