
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
 * Java class for VerifyDecryptRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyDecryptRequest", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "authorisationContext",
    "swiftVerifiedRevocation",
    "secSecuredData"
})
public class SwSecVerifyDecryptRequest {

    @XmlElement(name = "AuthorisationContext", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "SwiftVerifiedRevocation")
    protected String swiftVerifiedRevocation;
    @XmlElement(name = "SecSecuredData", required = true)
    protected SwSecMixedAny secSecuredData;

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
    public SwSecVerifyDecryptRequest setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the swiftVerifiedRevocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftVerifiedRevocation() {
        return swiftVerifiedRevocation;
    }

    /**
     * Sets the value of the swiftVerifiedRevocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecVerifyDecryptRequest setSwiftVerifiedRevocation(String value) {
        this.swiftVerifiedRevocation = value;
        return this;
    }

    /**
     * Gets the value of the secSecuredData property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwSecMixedAny getSecSecuredData() {
        return secSecuredData;
    }

    /**
     * Sets the value of the secSecuredData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecMixedAny }
     *     
     */
    public SwSecVerifyDecryptRequest setSecSecuredData(SwSecMixedAny value) {
        this.secSecuredData = value;
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
