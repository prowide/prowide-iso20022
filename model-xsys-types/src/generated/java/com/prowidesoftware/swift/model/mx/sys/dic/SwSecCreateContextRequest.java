
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
 * Java class for CreateContextRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContextRequest", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "fileName",
    "password",
    "sign",
    "decrypt",
    "authorisation",
    "requiredInfo"
})
public class SwSecCreateContextRequest {

    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Sign", required = true)
    protected String sign;
    @XmlElement(name = "Decrypt", required = true)
    protected String decrypt;
    @XmlElement(name = "Authorisation", required = true)
    protected String authorisation;
    @XmlElement(name = "RequiredInfo", namespace = "urn:swift:snl:ns.Sw")
    protected String requiredInfo;

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
    public SwSecCreateContextRequest setFileName(String value) {
        this.fileName = value;
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
    public SwSecCreateContextRequest setPassword(String value) {
        this.password = value;
        return this;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCreateContextRequest setSign(String value) {
        this.sign = value;
        return this;
    }

    /**
     * Gets the value of the decrypt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecrypt() {
        return decrypt;
    }

    /**
     * Sets the value of the decrypt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCreateContextRequest setDecrypt(String value) {
        this.decrypt = value;
        return this;
    }

    /**
     * Gets the value of the authorisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisation() {
        return authorisation;
    }

    /**
     * Sets the value of the authorisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCreateContextRequest setAuthorisation(String value) {
        this.authorisation = value;
        return this;
    }

    /**
     * Gets the value of the requiredInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredInfo() {
        return requiredInfo;
    }

    /**
     * Sets the value of the requiredInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCreateContextRequest setRequiredInfo(String value) {
        this.requiredInfo = value;
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
