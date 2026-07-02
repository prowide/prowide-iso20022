
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
@XmlType(name = "ContactInformation1", propOrder = {
    "nm",
    "faxNb",
    "telNb",
    "emailAdr"
})
public class ContactInformation1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "TelNb")
    protected String telNb;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactInformation1 setNm(String value) {
        this.nm = value;
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
    public ContactInformation1 setFaxNb(String value) {
        this.faxNb = value;
        return this;
    }

    /**
     * Gets the value of the telNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNb() {
        return telNb;
    }

    /**
     * Sets the value of the telNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactInformation1 setTelNb(String value) {
        this.telNb = value;
        return this;
    }

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
    public ContactInformation1 setEmailAdr(String value) {
        this.emailAdr = value;
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
