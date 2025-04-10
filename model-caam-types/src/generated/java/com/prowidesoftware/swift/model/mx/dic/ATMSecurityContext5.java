
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to security commands.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityContext5", propOrder = {
    "curSctySchme",
    "sctySchmeCpblties",
    "sctyDvc",
    "key",
    "hstChllng"
})
public class ATMSecurityContext5 {

    @XmlElement(name = "CurSctySchme", required = true)
    @XmlSchemaType(name = "string")
    protected ATMSecurityScheme3Code curSctySchme;
    @XmlElement(name = "SctySchmeCpblties")
    @XmlSchemaType(name = "string")
    protected List<ATMSecurityScheme4Code> sctySchmeCpblties;
    @XmlElement(name = "SctyDvc", required = true)
    protected ATMSecurityDevice2 sctyDvc;
    @XmlElement(name = "Key")
    protected List<CryptographicKey11> key;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;

    /**
     * Gets the value of the curSctySchme property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public ATMSecurityScheme3Code getCurSctySchme() {
        return curSctySchme;
    }

    /**
     * Sets the value of the curSctySchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public ATMSecurityContext5 setCurSctySchme(ATMSecurityScheme3Code value) {
        this.curSctySchme = value;
        return this;
    }

    /**
     * Gets the value of the sctySchmeCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctySchmeCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctySchmeCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMSecurityScheme4Code }
     * 
     * 
     * @return
     *     The value of the sctySchmeCpblties property.
     */
    public List<ATMSecurityScheme4Code> getSctySchmeCpblties() {
        if (sctySchmeCpblties == null) {
            sctySchmeCpblties = new ArrayList<>();
        }
        return this.sctySchmeCpblties;
    }

    /**
     * Gets the value of the sctyDvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityDevice2 }
     *     
     */
    public ATMSecurityDevice2 getSctyDvc() {
        return sctyDvc;
    }

    /**
     * Sets the value of the sctyDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityDevice2 }
     *     
     */
    public ATMSecurityContext5 setSctyDvc(ATMSecurityDevice2 value) {
        this.sctyDvc = value;
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
     * {@link CryptographicKey11 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<CryptographicKey11> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
    }

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
    public ATMSecurityContext5 setHstChllng(byte[] value) {
        this.hstChllng = value;
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
     * Adds a new item to the sctySchmeCpblties list.
     * @see #getSctySchmeCpblties()
     * 
     */
    public ATMSecurityContext5 addSctySchmeCpblties(ATMSecurityScheme4Code sctySchmeCpblties) {
        getSctySchmeCpblties().add(sctySchmeCpblties);
        return this;
    }

    /**
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public ATMSecurityContext5 addKey(CryptographicKey11 key) {
        getKey().add(key);
        return this;
    }

}
