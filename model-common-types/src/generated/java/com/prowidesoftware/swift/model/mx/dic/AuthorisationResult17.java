
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
 * Outcome of the authorisation, and actions to perform.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult17", propOrder = {
    "authstnNtty",
    "rspnToAuthstn",
    "authstnCd",
    "cmpltnReqrd",
    "tmsTrggr"
})
public class AuthorisationResult17 {

    @XmlElement(name = "AuthstnNtty")
    protected GenericIdentification90 authstnNtty;
    @XmlElement(name = "RspnToAuthstn", required = true)
    protected ResponseType10 rspnToAuthstn;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "CmpltnReqrd")
    protected Boolean cmpltnReqrd;
    @XmlElement(name = "TMSTrggr")
    protected TMSTrigger1 tmsTrggr;

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
    public AuthorisationResult17 setAuthstnNtty(GenericIdentification90 value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the rspnToAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getRspnToAuthstn() {
        return rspnToAuthstn;
    }

    /**
     * Sets the value of the rspnToAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public AuthorisationResult17 setRspnToAuthstn(ResponseType10 value) {
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
    public AuthorisationResult17 setAuthstnCd(String value) {
        this.authstnCd = value;
        return this;
    }

    /**
     * Gets the value of the cmpltnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmpltnReqrd() {
        return cmpltnReqrd;
    }

    /**
     * Sets the value of the cmpltnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AuthorisationResult17 setCmpltnReqrd(Boolean value) {
        this.cmpltnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the tmsTrggr property.
     * 
     * @return
     *     possible object is
     *     {@link TMSTrigger1 }
     *     
     */
    public TMSTrigger1 getTMSTrggr() {
        return tmsTrggr;
    }

    /**
     * Sets the value of the tmsTrggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSTrigger1 }
     *     
     */
    public AuthorisationResult17 setTMSTrggr(TMSTrigger1 value) {
        this.tmsTrggr = value;
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
