
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
 * Outcome of the authorisation, and actions to perform.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult1", propOrder = {
    "authstnNtty",
    "rspnToAuthstn",
    "authstnCd",
    "cmpltnReqrd",
    "tmsTrggr"
})
public class AuthorisationResult1 {

    @XmlElement(name = "AuthstnNtty")
    protected GenericIdentification33 authstnNtty;
    @XmlElement(name = "RspnToAuthstn", required = true)
    protected ResponseType1 rspnToAuthstn;
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
     *     {@link GenericIdentification33 }
     *     
     */
    public GenericIdentification33 getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification33 }
     *     
     */
    public AuthorisationResult1 setAuthstnNtty(GenericIdentification33 value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the rspnToAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType1 }
     *     
     */
    public ResponseType1 getRspnToAuthstn() {
        return rspnToAuthstn;
    }

    /**
     * Sets the value of the rspnToAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType1 }
     *     
     */
    public AuthorisationResult1 setRspnToAuthstn(ResponseType1 value) {
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
    public AuthorisationResult1 setAuthstnCd(String value) {
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
    public AuthorisationResult1 setCmpltnReqrd(Boolean value) {
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
    public AuthorisationResult1 setTMSTrggr(TMSTrigger1 value) {
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
