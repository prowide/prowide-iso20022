
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Communication device number or electronic address used for communication.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationAddress3", propOrder = {
    "email",
    "phne",
    "mob",
    "faxNb",
    "tlxAdr",
    "urlAdr"
})
public class CommunicationAddress3 {

    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "Mob")
    protected String mob;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "TlxAdr")
    protected String tlxAdr;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

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
    public CommunicationAddress3 setEmail(String value) {
        this.email = value;
        return this;
    }

    /**
     * Gets the value of the phne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhne() {
        return phne;
    }

    /**
     * Sets the value of the phne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationAddress3 setPhne(String value) {
        this.phne = value;
        return this;
    }

    /**
     * Gets the value of the mob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMob() {
        return mob;
    }

    /**
     * Sets the value of the mob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationAddress3 setMob(String value) {
        this.mob = value;
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
    public CommunicationAddress3 setFaxNb(String value) {
        this.faxNb = value;
        return this;
    }

    /**
     * Gets the value of the tlxAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlxAdr() {
        return tlxAdr;
    }

    /**
     * Sets the value of the tlxAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationAddress3 setTlxAdr(String value) {
        this.tlxAdr = value;
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
    public CommunicationAddress3 setURLAdr(String value) {
        this.urlAdr = value;
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
