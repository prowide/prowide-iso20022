
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
 * Communication device number or electronic address used for communication.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationAddress11", propOrder = {
    "emailAdr",
    "urlAdr"
})
public class CommunicationAddress11 {

    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationAddress11 setEmailAdr(String value) {
        this.emailAdr = value;
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
    public CommunicationAddress11 setURLAdr(String value) {
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
