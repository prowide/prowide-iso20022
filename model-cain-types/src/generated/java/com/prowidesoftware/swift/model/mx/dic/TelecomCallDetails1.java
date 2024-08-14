
package com.prowidesoftware.swift.model.mx.dic;

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
 * Structured call details with address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomCallDetails1", propOrder = {
    "tp",
    "othrTp",
    "phneNb",
    "city",
    "stat",
    "prvc",
    "ctry"
})
public class TelecomCallDetails1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TelephonyCallType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Prvc")
    protected String prvc;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelephonyCallType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelecomCallDetails1 setTp(TelephonyCallType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomCallDetails1 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomCallDetails1 setPhneNb(String value) {
        this.phneNb = value;
        return this;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomCallDetails1 setCity(String value) {
        this.city = value;
        return this;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomCallDetails1 setStat(String value) {
        this.stat = value;
        return this;
    }

    /**
     * Gets the value of the prvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvc() {
        return prvc;
    }

    /**
     * Sets the value of the prvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomCallDetails1 setPrvc(String value) {
        this.prvc = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomCallDetails1 setCtry(String value) {
        this.ctry = value;
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
