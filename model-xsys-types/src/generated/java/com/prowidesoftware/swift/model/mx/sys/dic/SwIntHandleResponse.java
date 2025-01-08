
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
 * Java class for HandleResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleResponse", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "authorisationContext",
    "response",
    "status"
})
public class SwIntHandleResponse {

    @XmlElement(name = "AuthorisationContext", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "Response")
    protected SwIntResponse response;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

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
    public SwIntHandleResponse setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntResponse }
     *     
     */
    public SwIntResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntResponse }
     *     
     */
    public SwIntHandleResponse setResponse(SwIntResponse value) {
        this.response = value;
        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGblStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatus }
     *     
     */
    public SwIntHandleResponse setStatus(SwGblStatus value) {
        this.status = value;
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
