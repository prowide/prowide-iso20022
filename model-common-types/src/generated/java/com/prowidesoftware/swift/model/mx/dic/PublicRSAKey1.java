
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
 * Value of the public component of a RSA key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicRSAKey1", propOrder = {
    "mdlus",
    "expnt"
})
public class PublicRSAKey1 {

    @XmlElement(name = "Mdlus", required = true)
    protected byte[] mdlus;
    @XmlElement(name = "Expnt", required = true)
    protected byte[] expnt;

    /**
     * Gets the value of the mdlus property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMdlus() {
        return mdlus;
    }

    /**
     * Sets the value of the mdlus property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PublicRSAKey1 setMdlus(byte[] value) {
        this.mdlus = value;
        return this;
    }

    /**
     * Gets the value of the expnt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExpnt() {
        return expnt;
    }

    /**
     * Sets the value of the expnt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PublicRSAKey1 setExpnt(byte[] value) {
        this.expnt = value;
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
