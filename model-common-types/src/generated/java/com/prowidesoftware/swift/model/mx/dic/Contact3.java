
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
 * Details of a contact person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact3", propOrder = {
    "cntrlPhneNb",
    "prprtyPhneNb",
    "tollFreePhneNb",
    "email",
    "faxNb",
    "urlAdr",
    "lang"
})
public class Contact3 {

    @XmlElement(name = "CntrlPhneNb")
    protected String cntrlPhneNb;
    @XmlElement(name = "PrprtyPhneNb")
    protected String prprtyPhneNb;
    @XmlElement(name = "TollFreePhneNb")
    protected String tollFreePhneNb;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Lang")
    protected String lang;

    /**
     * Gets the value of the cntrlPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrlPhneNb() {
        return cntrlPhneNb;
    }

    /**
     * Sets the value of the cntrlPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact3 setCntrlPhneNb(String value) {
        this.cntrlPhneNb = value;
        return this;
    }

    /**
     * Gets the value of the prprtyPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyPhneNb() {
        return prprtyPhneNb;
    }

    /**
     * Sets the value of the prprtyPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact3 setPrprtyPhneNb(String value) {
        this.prprtyPhneNb = value;
        return this;
    }

    /**
     * Gets the value of the tollFreePhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreePhneNb() {
        return tollFreePhneNb;
    }

    /**
     * Sets the value of the tollFreePhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact3 setTollFreePhneNb(String value) {
        this.tollFreePhneNb = value;
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
    public Contact3 setEmail(String value) {
        this.email = value;
        return this;
    }

    /**
     * Gets the value of the faxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNb() {
        return faxNb;
    }

    /**
     * Sets the value of the faxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact3 setFaxNb(String value) {
        this.faxNb = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Contact3 setURLAdr(String value) {
        this.urlAdr = value;
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
    public Contact3 setLang(String value) {
        this.lang = value;
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
