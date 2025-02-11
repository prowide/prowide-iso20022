
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
 * Transport key or key encryption key (KEK) for the recipient.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient6Choice", propOrder = {
    "keyTrnsprt",
    "kek",
    "keyIdr"
})
public class Recipient6Choice {

    @XmlElement(name = "KeyTrnsprt")
    protected KeyTransport5 keyTrnsprt;
    @XmlElement(name = "KEK")
    protected KEK5 kek;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier2 keyIdr;

    /**
     * Gets the value of the keyTrnsprt property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTransport5 }
     *     
     */
    public KeyTransport5 getKeyTrnsprt() {
        return keyTrnsprt;
    }

    /**
     * Sets the value of the keyTrnsprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTransport5 }
     *     
     */
    public Recipient6Choice setKeyTrnsprt(KeyTransport5 value) {
        this.keyTrnsprt = value;
        return this;
    }

    /**
     * Gets the value of the kek property.
     * 
     * @return
     *     possible object is
     *     {@link KEK5 }
     *     
     */
    public KEK5 getKEK() {
        return kek;
    }

    /**
     * Sets the value of the kek property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEK5 }
     *     
     */
    public Recipient6Choice setKEK(KEK5 value) {
        this.kek = value;
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
    public Recipient6Choice setKeyIdr(KEKIdentifier2 value) {
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
