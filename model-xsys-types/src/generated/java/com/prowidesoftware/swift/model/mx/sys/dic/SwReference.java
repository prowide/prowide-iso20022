
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for Reference complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "digestRef",
    "digestAlgorithm",
    "digestValue"
})
public class SwReference {

    @XmlElement(name = "DigestRef")
    protected String digestRef;
    @XmlElement(name = "DigestAlgorithm")
    protected String digestAlgorithm;
    @XmlElement(name = "DigestValue")
    protected String digestValue;

    /**
     * Gets the value of the digestRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestRef() {
        return digestRef;
    }

    /**
     * Sets the value of the digestRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwReference setDigestRef(String value) {
        this.digestRef = value;
        return this;
    }

    /**
     * Gets the value of the digestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * Sets the value of the digestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwReference setDigestAlgorithm(String value) {
        this.digestAlgorithm = value;
        return this;
    }

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwReference setDigestValue(String value) {
        this.digestValue = value;
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
