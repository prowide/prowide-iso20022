
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for CertInfoList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertInfoList", propOrder = {
    "certKeyUsage",
    "renewalDate",
    "expirationDate",
    "privateSignKeyExpirationDate",
    "certDN",
    "certPolicyId",
    "certIssuer",
    "certSerialNumber",
    "certCRLDistPoint",
    "certFingerPrint"
})
public class SwCertInfoList {

    @XmlElement(name = "CertKeyUsage", required = true)
    protected String certKeyUsage;
    @XmlElement(name = "RenewalDate")
    protected String renewalDate;
    @XmlElement(name = "ExpirationDate", required = true)
    protected String expirationDate;
    @XmlElement(name = "PrivateSignKeyExpirationDate")
    protected String privateSignKeyExpirationDate;
    @XmlElement(name = "CertDN", required = true)
    protected String certDN;
    @XmlElement(name = "CertPolicyId")
    protected String certPolicyId;
    @XmlElement(name = "CertIssuer", required = true)
    protected String certIssuer;
    @XmlElement(name = "CertSerialNumber", required = true)
    protected String certSerialNumber;
    @XmlElement(name = "CertCRLDistPoint", required = true)
    protected String certCRLDistPoint;
    @XmlElement(name = "CertFingerPrint", required = true)
    protected String certFingerPrint;

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
    public SwCertInfoList setCertKeyUsage(String value) {
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
    public SwCertInfoList setRenewalDate(String value) {
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
    public SwCertInfoList setExpirationDate(String value) {
        this.expirationDate = value;
        return this;
    }

    /**
     * Gets the value of the privateSignKeyExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateSignKeyExpirationDate() {
        return privateSignKeyExpirationDate;
    }

    /**
     * Sets the value of the privateSignKeyExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertInfoList setPrivateSignKeyExpirationDate(String value) {
        this.privateSignKeyExpirationDate = value;
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
    public SwCertInfoList setCertDN(String value) {
        this.certDN = value;
        return this;
    }

    /**
     * Gets the value of the certPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertPolicyId() {
        return certPolicyId;
    }

    /**
     * Sets the value of the certPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertInfoList setCertPolicyId(String value) {
        this.certPolicyId = value;
        return this;
    }

    /**
     * Gets the value of the certIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertIssuer() {
        return certIssuer;
    }

    /**
     * Sets the value of the certIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertInfoList setCertIssuer(String value) {
        this.certIssuer = value;
        return this;
    }

    /**
     * Gets the value of the certSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertSerialNumber() {
        return certSerialNumber;
    }

    /**
     * Sets the value of the certSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertInfoList setCertSerialNumber(String value) {
        this.certSerialNumber = value;
        return this;
    }

    /**
     * Gets the value of the certCRLDistPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertCRLDistPoint() {
        return certCRLDistPoint;
    }

    /**
     * Sets the value of the certCRLDistPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertInfoList setCertCRLDistPoint(String value) {
        this.certCRLDistPoint = value;
        return this;
    }

    /**
     * Gets the value of the certFingerPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertFingerPrint() {
        return certFingerPrint;
    }

    /**
     * Sets the value of the certFingerPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwCertInfoList setCertFingerPrint(String value) {
        this.certFingerPrint = value;
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
