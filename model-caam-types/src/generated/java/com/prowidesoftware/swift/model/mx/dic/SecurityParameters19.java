
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Security parameters of the host downloading the key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityParameters19", propOrder = {
    "hstChllng",
    "key",
    "sgntrChc"
})
public class SecurityParameters19 {

    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;
    @XmlElement(name = "Key")
    protected List<CryptographicKey21> key;
    @XmlElement(name = "SgntrChc")
    protected ATMSignature3Choice sgntrChc;

    /**
     * Gets the value of the hstChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHstChllng() {
        return hstChllng;
    }

    /**
     * Sets the value of the hstChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public SecurityParameters19 setHstChllng(byte[] value) {
        this.hstChllng = value;
        return this;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey21 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<CryptographicKey21> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
    }

    /**
     * Gets the value of the sgntrChc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSignature3Choice }
     *     
     */
    public ATMSignature3Choice getSgntrChc() {
        return sgntrChc;
    }

    /**
     * Sets the value of the sgntrChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSignature3Choice }
     *     
     */
    public SecurityParameters19 setSgntrChc(ATMSignature3Choice value) {
        this.sgntrChc = value;
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

    /**
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public SecurityParameters19 addKey(CryptographicKey21 key) {
        getKey().add(key);
        return this;
    }

}
