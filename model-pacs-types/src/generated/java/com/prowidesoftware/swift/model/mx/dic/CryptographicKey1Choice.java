
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
 * Choice of format for a cryptographic key which ensures that a payment can only be executed on the terms previously agreed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey1Choice", propOrder = {
    "ilpv4",
    "sgntr"
})
public class CryptographicKey1Choice {

    @XmlElement(name = "ILPV4")
    protected String ilpv4;
    @XmlElement(name = "Sgntr")
    protected String sgntr;

    /**
     * Gets the value of the ilpv4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILPV4() {
        return ilpv4;
    }

    /**
     * Sets the value of the ilpv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey1Choice setILPV4(String value) {
        this.ilpv4 = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CryptographicKey1Choice setSgntr(String value) {
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
