
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
 * Java class for CertList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertList", propOrder = {
    "profileName",
    "certKeyUsage",
    "renewalDate",
    "expirationDate",
    "userPolicy",
    "certDN"
})
public class SwCertList {

    @XmlElement(name = "ProfileName", required = true)
    protected String profileName;
    @XmlElement(name = "CertKeyUsage")
    protected String certKeyUsage;
    @XmlElement(name = "RenewalDate")
    protected String renewalDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "UserPolicy")
    protected String userPolicy;
    @XmlElement(name = "CertDN")
    protected String certDN;

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertList setProfileName(String value) {
        this.profileName = value;
        return this;
    }

    /**
     * Gets the value of the certKeyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertKeyUsage() {
        return certKeyUsage;
    }

    /**
     * Sets the value of the certKeyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertList setCertKeyUsage(String value) {
        this.certKeyUsage = value;
        return this;
    }

    /**
     * Gets the value of the renewalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalDate() {
        return renewalDate;
    }

    /**
     * Sets the value of the renewalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertList setRenewalDate(String value) {
        this.renewalDate = value;
        return this;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertList setExpirationDate(String value) {
        this.expirationDate = value;
        return this;
    }

    /**
     * Gets the value of the userPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPolicy() {
        return userPolicy;
    }

    /**
     * Sets the value of the userPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertList setUserPolicy(String value) {
        this.userPolicy = value;
        return this;
    }

    /**
     * Gets the value of the certDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertDN() {
        return certDN;
    }

    /**
     * Sets the value of the certDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertList setCertDN(String value) {
        this.certDN = value;
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
