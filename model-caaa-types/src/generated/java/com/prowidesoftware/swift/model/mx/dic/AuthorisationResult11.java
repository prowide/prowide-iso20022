
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
 * Outcome of the authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult11", propOrder = {
    "authstnNtty",
    "rspnToAuthstn",
    "authstnCd"
})
public class AuthorisationResult11 {

    @XmlElement(name = "AuthstnNtty")
    protected GenericIdentification90 authstnNtty;
    @XmlElement(name = "RspnToAuthstn", required = true)
    protected ResponseType5 rspnToAuthstn;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification90 }
     *     
     */
    public GenericIdentification90 getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification90 }
     *     
     */
    public AuthorisationResult11 setAuthstnNtty(GenericIdentification90 value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the rspnToAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType5 }
     *     
     */
    public ResponseType5 getRspnToAuthstn() {
        return rspnToAuthstn;
    }

    /**
     * Sets the value of the rspnToAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType5 }
     *     
     */
    public AuthorisationResult11 setRspnToAuthstn(ResponseType5 value) {
        this.rspnToAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the authstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnCd() {
        return authstnCd;
    }

    /**
     * Sets the value of the authstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationResult11 setAuthstnCd(String value) {
        this.authstnCd = value;
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
