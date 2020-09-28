
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
 * Java class for KMAChangePasswordRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KMAChangePasswordRequest", propOrder = {
    "fileName",
    "certLocation",
    "oldPassword",
    "password"
})
public class SwKMAChangePasswordRequest {

    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "CertLocation")
    protected String certLocation;
    @XmlElement(name = "OldPassword", required = true)
    protected String oldPassword;
    @XmlElement(name = "Password", required = true)
    protected String password;

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
    public SwKMAChangePasswordRequest setFileName(String value) {
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
    public SwKMAChangePasswordRequest setCertLocation(String value) {
        this.certLocation = value;
        return this;
    }

    /**
     * Gets the value of the oldPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Sets the value of the oldPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMAChangePasswordRequest setOldPassword(String value) {
        this.oldPassword = value;
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
    public SwKMAChangePasswordRequest setPassword(String value) {
        this.password = value;
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
