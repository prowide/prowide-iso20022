
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
 * Java class for CreateContextResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContextResponse", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "securityContext",
    "certPolicyId",
    "profileInfo",
    "applSpecific",
    "status"
})
public class SwSecCreateContextResponse {

    @XmlElement(name = "SecurityContext")
    protected SwSecSecurityContext securityContext;
    @XmlElement(name = "CertPolicyId")
    protected String certPolicyId;
    @XmlElement(name = "ProfileInfo")
    protected SwSecProfileInfo profileInfo;
    @XmlElement(name = "ApplSpecific", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny applSpecific;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the securityContext property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSecurityContext }
     *     
     */
    public SwSecSecurityContext getSecurityContext() {
        return securityContext;
    }

    /**
     * Sets the value of the securityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSecurityContext }
     *     
     */
    public SwSecCreateContextResponse setSecurityContext(SwSecSecurityContext value) {
        this.securityContext = value;
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
    public SwSecCreateContextResponse setCertPolicyId(String value) {
        this.certPolicyId = value;
        return this;
    }

    /**
     * Gets the value of the profileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecProfileInfo }
     *     
     */
    public SwSecProfileInfo getProfileInfo() {
        return profileInfo;
    }

    /**
     * Sets the value of the profileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecProfileInfo }
     *     
     */
    public SwSecCreateContextResponse setProfileInfo(SwSecProfileInfo value) {
        this.profileInfo = value;
        return this;
    }

    /**
     * Gets the value of the applSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getApplSpecific() {
        return applSpecific;
    }

    /**
     * Sets the value of the applSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public SwSecCreateContextResponse setApplSpecific(SwAny value) {
        this.applSpecific = value;
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
    public SwSecCreateContextResponse setStatus(SwGblStatus value) {
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
