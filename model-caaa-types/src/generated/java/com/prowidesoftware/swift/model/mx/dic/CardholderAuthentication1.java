
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
 * Data related to the authentication of the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication1", propOrder = {
    "authntcnMtd",
    "authntcnNtty",
    "authntcnVal",
    "crdhldrOnLinePIN",
    "authntcnColltnInd"
})
public class CardholderAuthentication1 {

    @XmlElement(name = "AuthntcnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod1Code authntcnMtd;
    @XmlElement(name = "AuthntcnNtty", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationEntity1Code authntcnNtty;
    @XmlElement(name = "AuthntcnVal")
    protected String authntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN1 crdhldrOnLinePIN;
    @XmlElement(name = "AuthntcnColltnInd")
    protected String authntcnColltnInd;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod1Code }
     *     
     */
    public AuthenticationMethod1Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod1Code }
     *     
     */
    public CardholderAuthentication1 setAuthntcnMtd(AuthenticationMethod1Code value) {
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
    public CardholderAuthentication1 setAuthntcnNtty(AuthenticationEntity1Code value) {
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
    public CardholderAuthentication1 setAuthntcnVal(String value) {
        this.authntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrOnLinePIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN1 }
     *     
     */
    public OnLinePIN1 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Sets the value of the crdhldrOnLinePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN1 }
     *     
     */
    public CardholderAuthentication1 setCrdhldrOnLinePIN(OnLinePIN1 value) {
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
    public CardholderAuthentication1 setAuthntcnColltnInd(String value) {
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
