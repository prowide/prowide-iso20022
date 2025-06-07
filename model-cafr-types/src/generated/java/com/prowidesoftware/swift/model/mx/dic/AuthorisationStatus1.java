
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
 * Authorisation status about the fraudulent transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationStatus1", propOrder = {
    "authstnInd",
    "authstnNtty",
    "othrAuthstnNtty"
})
public class AuthorisationStatus1 {

    @XmlElement(name = "AuthstnInd")
    protected Boolean authstnInd;
    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType26Code authstnNtty;
    @XmlElement(name = "OthrAuthstnNtty")
    protected String othrAuthstnNtty;

    /**
     * Gets the value of the authstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthstnInd() {
        return authstnInd;
    }

    /**
     * Sets the value of the authstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AuthorisationStatus1 setAuthstnInd(Boolean value) {
        this.authstnInd = value;
        return this;
    }

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType26Code }
     *     
     */
    public PartyType26Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType26Code }
     *     
     */
    public AuthorisationStatus1 setAuthstnNtty(PartyType26Code value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the othrAuthstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAuthstnNtty() {
        return othrAuthstnNtty;
    }

    /**
     * Sets the value of the othrAuthstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationStatus1 setOthrAuthstnNtty(String value) {
        this.othrAuthstnNtty = value;
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
