
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "SecurityParameters10", propOrder = {
    "hstChllng",
    "key",
    "sgntrChc"
})
public class SecurityParameters10 {

    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;
    @XmlElement(name = "Key")
    protected List<CryptographicKey12> key;
    @XmlElement(name = "SgntrChc")
    protected ATMSignature2Choice sgntrChc;

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
    public SecurityParameters10 setHstChllng(byte[] value) {
        this.hstChllng = value;
        return this;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
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
     * {@link CryptographicKey12 }
     * 
     * 
     */
    public List<CryptographicKey12> getKey() {
        if (key == null) {
            key = new ArrayList<CryptographicKey12>();
        }
        return this.key;
    }

    /**
     * Gets the value of the sgntrChc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSignature2Choice }
     *     
     */
    public ATMSignature2Choice getSgntrChc() {
        return sgntrChc;
    }

    /**
     * Sets the value of the sgntrChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSignature2Choice }
     *     
     */
    public SecurityParameters10 setSgntrChc(ATMSignature2Choice value) {
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
    public SecurityParameters10 addKey(CryptographicKey12 key) {
        getKey().add(key);
        return this;
    }

}
