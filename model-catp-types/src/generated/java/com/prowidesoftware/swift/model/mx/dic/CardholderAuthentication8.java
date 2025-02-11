
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
 * Data related to the authentication of the card and the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication8", propOrder = {
    "authntcnMtd",
    "tknReqd",
    "authntcnVal",
    "prtctdAuthntcnVal",
    "crdhldrOnLinePIN"
})
public class CardholderAuthentication8 {

    @XmlElement(name = "AuthntcnMtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod7Code authntcnMtd;
    @XmlElement(name = "TknReqd")
    protected Boolean tknReqd;
    @XmlElement(name = "AuthntcnVal")
    protected byte[] authntcnVal;
    @XmlElement(name = "PrtctdAuthntcnVal")
    protected ContentInformationType10 prtctdAuthntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN5 crdhldrOnLinePIN;

    /**
     * Gets the value of the authntcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod7Code }
     *     
     */
    public AuthenticationMethod7Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Sets the value of the authntcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod7Code }
     *     
     */
    public CardholderAuthentication8 setAuthntcnMtd(AuthenticationMethod7Code value) {
        this.authntcnMtd = value;
        return this;
    }

    /**
     * Gets the value of the tknReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknReqd() {
        return tknReqd;
    }

    /**
     * Sets the value of the tknReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardholderAuthentication8 setTknReqd(Boolean value) {
        this.tknReqd = value;
        return this;
    }

    /**
     * Gets the value of the authntcnVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthntcnVal() {
        return authntcnVal;
    }

    /**
     * Sets the value of the authntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardholderAuthentication8 setAuthntcnVal(byte[] value) {
        this.authntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the prtctdAuthntcnVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAuthntcnVal() {
        return prtctdAuthntcnVal;
    }

    /**
     * Sets the value of the prtctdAuthntcnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public CardholderAuthentication8 setPrtctdAuthntcnVal(ContentInformationType10 value) {
        this.prtctdAuthntcnVal = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrOnLinePIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN5 }
     *     
     */
    public OnLinePIN5 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Sets the value of the crdhldrOnLinePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN5 }
     *     
     */
    public CardholderAuthentication8 setCrdhldrOnLinePIN(OnLinePIN5 value) {
        this.crdhldrOnLinePIN = value;
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
