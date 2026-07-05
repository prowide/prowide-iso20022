
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
 * Java class for HandleInitResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleInitResponse", propOrder = {
    "authorisationContext",
    "cryptoMode",
    "faCryptoMode",
    "callbackOnError",
    "explicitNamespaceAttributeMode",
    "errorCodeMode"
})
public class SwHandleInitResponse {

    @XmlElement(name = "AuthorisationContext", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "CryptoMode", required = true)
    protected String cryptoMode;
    @XmlElement(name = "FACryptoMode")
    protected String faCryptoMode;
    @XmlElement(name = "CallbackOnError")
    protected String callbackOnError;
    @XmlElement(name = "ExplicitNamespaceAttributeMode")
    protected String explicitNamespaceAttributeMode;
    @XmlElement(name = "ErrorCodeMode")
    protected String errorCodeMode;

    /**
     * Gets the value of the authorisationContext property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSecurityContext }
     *     
     */
    public SwSecSecurityContext getAuthorisationContext() {
        return authorisationContext;
    }

    /**
     * Sets the value of the authorisationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSecurityContext }
     *     
     */
    public SwHandleInitResponse setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the cryptoMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptoMode() {
        return cryptoMode;
    }

    /**
     * Sets the value of the cryptoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleInitResponse setCryptoMode(String value) {
        this.cryptoMode = value;
        return this;
    }

    /**
     * Gets the value of the faCryptoMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACryptoMode() {
        return faCryptoMode;
    }

    /**
     * Sets the value of the faCryptoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleInitResponse setFACryptoMode(String value) {
        this.faCryptoMode = value;
        return this;
    }

    /**
     * Gets the value of the callbackOnError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackOnError() {
        return callbackOnError;
    }

    /**
     * Sets the value of the callbackOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleInitResponse setCallbackOnError(String value) {
        this.callbackOnError = value;
        return this;
    }

    /**
     * Gets the value of the explicitNamespaceAttributeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplicitNamespaceAttributeMode() {
        return explicitNamespaceAttributeMode;
    }

    /**
     * Sets the value of the explicitNamespaceAttributeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleInitResponse setExplicitNamespaceAttributeMode(String value) {
        this.explicitNamespaceAttributeMode = value;
        return this;
    }

    /**
     * Gets the value of the errorCodeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCodeMode() {
        return errorCodeMode;
    }

    /**
     * Sets the value of the errorCodeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHandleInitResponse setErrorCodeMode(String value) {
        this.errorCodeMode = value;
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
