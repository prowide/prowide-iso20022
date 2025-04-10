
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of the customer device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device1", propOrder = {
    "tp",
    "othrTp",
    "lang",
    "phneNb",
    "lctn",
    "ipAdr",
    "email"
})
public class Device1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerDeviceType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "Lctn")
    protected GeographicCoordinates1 lctn;
    @XmlElement(name = "IPAdr")
    protected String ipAdr;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDeviceType1Code }
     *     
     */
    public CustomerDeviceType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDeviceType1Code }
     *     
     */
    public Device1 setTp(CustomerDeviceType1Code value) {
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
    public Device1 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device1 setLang(String value) {
        this.lang = value;
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
    public Device1 setPhneNb(String value) {
        this.phneNb = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public GeographicCoordinates1 getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public Device1 setLctn(GeographicCoordinates1 value) {
        this.lctn = value;
        return this;
    }

    /**
     * Gets the value of the ipAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdr() {
        return ipAdr;
    }

    /**
     * Sets the value of the ipAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device1 setIPAdr(String value) {
        this.ipAdr = value;
        return this;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Device1 setEmail(String value) {
        this.email = value;
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
