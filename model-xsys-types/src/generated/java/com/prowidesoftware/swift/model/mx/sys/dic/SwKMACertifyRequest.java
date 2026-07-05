
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for KMACertifyRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KMACertifyRequest", propOrder = {
    "authenticationCode",
    "referenceCode",
    "fileName",
    "certLocation",
    "password",
    "certRecover"
})
public class SwKMACertifyRequest {

    @XmlElement(name = "AuthenticationCode", required = true)
    protected String authenticationCode;
    @XmlElement(name = "ReferenceCode", required = true)
    protected String referenceCode;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "CertLocation")
    protected String certLocation;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "CertRecover")
    protected String certRecover;

    /**
     * Gets the value of the authenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Sets the value of the authenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertifyRequest setAuthenticationCode(String value) {
        this.authenticationCode = value;
        return this;
    }

    /**
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertifyRequest setReferenceCode(String value) {
        this.referenceCode = value;
        return this;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertifyRequest setFileName(String value) {
        this.fileName = value;
        return this;
    }

    /**
     * Gets the value of the certLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertLocation() {
        return certLocation;
    }

    /**
     * Sets the value of the certLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertifyRequest setCertLocation(String value) {
        this.certLocation = value;
        return this;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertifyRequest setPassword(String value) {
        this.password = value;
        return this;
    }

    /**
     * Gets the value of the certRecover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertRecover() {
        return certRecover;
    }

    /**
     * Sets the value of the certRecover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertifyRequest setCertRecover(String value) {
        this.certRecover = value;
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
