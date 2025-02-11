
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
 * Java class for ExchangeFileRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeFileRequest", propOrder = {
    "authorisationContext",
    "fileRequest"
})
public class SwExchangeFileRequest {

    @XmlElement(name = "AuthorisationContext", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "FileRequest", required = true)
    protected SwFileRequest fileRequest;

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
    public SwExchangeFileRequest setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the fileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequest }
     *     
     */
    public SwFileRequest getFileRequest() {
        return fileRequest;
    }

    /**
     * Sets the value of the fileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequest }
     *     
     */
    public SwExchangeFileRequest setFileRequest(SwFileRequest value) {
        this.fileRequest = value;
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
