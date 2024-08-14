
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
 * Certification request PKCS#10 (Public Key Certificate Standard 10) for creation or renewal of an X.509 certificate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationRequest1", propOrder = {
    "certReqInf",
    "keyId",
    "keyVrsn"
})
public class CertificationRequest1 {

    @XmlElement(name = "CertReqInf", required = true)
    protected CertificationRequest2 certReqInf;
    @XmlElement(name = "KeyId")
    protected String keyId;
    @XmlElement(name = "KeyVrsn")
    protected String keyVrsn;

    /**
     * Gets the value of the certReqInf property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationRequest2 }
     *     
     */
    public CertificationRequest2 getCertReqInf() {
        return certReqInf;
    }

    /**
     * Sets the value of the certReqInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationRequest2 }
     *     
     */
    public CertificationRequest1 setCertReqInf(CertificationRequest2 value) {
        this.certReqInf = value;
        return this;
    }

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificationRequest1 setKeyId(String value) {
        this.keyId = value;
        return this;
    }

    /**
     * Gets the value of the keyVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVrsn() {
        return keyVrsn;
    }

    /**
     * Sets the value of the keyVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CertificationRequest1 setKeyVrsn(String value) {
        this.keyVrsn = value;
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
