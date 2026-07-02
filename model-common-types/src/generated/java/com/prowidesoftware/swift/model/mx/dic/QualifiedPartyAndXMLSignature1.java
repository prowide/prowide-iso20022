
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines a signing party and a digital signature made by this party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedPartyAndXMLSignature1", propOrder = {
    "pty",
    "sgntr"
})
public class QualifiedPartyAndXMLSignature1 {

    @XmlElement(name = "Pty")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object pty;
    @XmlElement(name = "Sgntr", required = true)
    protected SignatureEnvelope sgntr;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public QualifiedPartyAndXMLSignature1 setPty(Object value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public QualifiedPartyAndXMLSignature1 setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
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
