
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related to the authentication of the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication5", propOrder = {
    "authntcnMtd",
    "authntcnNtty",
    "authntcnVal",
    "crdhldrOnLinePIN",
    "authntcnColltnInd"
})
public class CardholderAuthentication5 {

    @XmlElement(name = "AuthntcnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod2Code authntcnMtd;
    @XmlElement(name = "AuthntcnNtty")
    @XmlSchemaType(name = "string")
    protected AuthenticationEntity1Code authntcnNtty;
    @XmlElement(name = "AuthntcnVal")
    protected String authntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN3 crdhldrOnLinePIN;
    @XmlElement(name = "AuthntcnColltnInd")
    protected String authntcnColltnInd;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod2Code }
     *     
     */
    public AuthenticationMethod2Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod2Code }
     *     
     */
    public CardholderAuthentication5 setAuthntcnMtd(AuthenticationMethod2Code value) {
        this.authntcnMtd = value;
        return this;
    }

    /**
     * Gets the value of the authntcnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationEntity1Code }
     *     
     */
    public AuthenticationEntity1Code getAuthntcnNtty() {
        return authntcnNtty;
    }

    /**
     * Sets the value of the authntcnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationEntity1Code }
     *     
     */
    public CardholderAuthentication5 setAuthntcnNtty(AuthenticationEntity1Code value) {
        this.authntcnNtty = value;
        return this;
    }

    /**
     * Gets the value of the authntcnVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnVal() {
        return authntcnVal;
    }

    /**
     * Sets the value of the authntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderAuthentication5 setAuthntcnVal(String value) {
        this.authntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrOnLinePIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN3 }
     *     
     */
    public OnLinePIN3 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Sets the value of the crdhldrOnLinePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN3 }
     *     
     */
    public CardholderAuthentication5 setCrdhldrOnLinePIN(OnLinePIN3 value) {
        this.crdhldrOnLinePIN = value;
        return this;
    }

    /**
     * Gets the value of the authntcnColltnInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnColltnInd() {
        return authntcnColltnInd;
    }

    /**
     * Sets the value of the authntcnColltnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderAuthentication5 setAuthntcnColltnInd(String value) {
        this.authntcnColltnInd = value;
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
