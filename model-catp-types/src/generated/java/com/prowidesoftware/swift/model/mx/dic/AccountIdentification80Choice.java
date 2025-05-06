
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
 * Unique identifier of an account, as assigned by the account servicer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification80Choice", propOrder = {
    "iban",
    "bban",
    "upic",
    "dmstAcct",
    "msisdn",
    "email"
})
public class AccountIdentification80Choice {

    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "DmstAcct")
    protected SimpleIdentificationInformation4 dmstAcct;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification80Choice setIBAN(String value) {
        this.iban = value;
        return this;
    }

    /**
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification80Choice setBBAN(String value) {
        this.bban = value;
        return this;
    }

    /**
     * Gets the value of the upic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Sets the value of the upic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification80Choice setUPIC(String value) {
        this.upic = value;
        return this;
    }

    /**
     * Gets the value of the dmstAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation4 }
     *     
     */
    public SimpleIdentificationInformation4 getDmstAcct() {
        return dmstAcct;
    }

    /**
     * Sets the value of the dmstAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation4 }
     *     
     */
    public AccountIdentification80Choice setDmstAcct(SimpleIdentificationInformation4 value) {
        this.dmstAcct = value;
        return this;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentification80Choice setMSISDN(String value) {
        this.msisdn = value;
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
    public AccountIdentification80Choice setEmail(String value) {
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
