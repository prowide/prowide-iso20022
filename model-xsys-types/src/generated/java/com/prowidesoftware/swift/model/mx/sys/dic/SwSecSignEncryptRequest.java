
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
 * Java class for SignEncryptRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignEncryptRequest", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "authorisationContext",
    "secToSecureData"
})
public class SwSecSignEncryptRequest {

    @XmlElement(name = "AuthorisationContext", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "SecToSecureData", required = true)
    protected SwSecMixedAny secToSecureData;

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
    public SwSecSignEncryptRequest setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the secToSecureData property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwSecMixedAny getSecToSecureData() {
        return secToSecureData;
    }

    /**
     * Sets the value of the secToSecureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwSecSignEncryptRequest setSecToSecureData(SwSecMixedAny value) {
        this.secToSecureData = value;
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
