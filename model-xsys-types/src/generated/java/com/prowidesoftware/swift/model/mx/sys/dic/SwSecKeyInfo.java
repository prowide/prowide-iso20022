
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
 * Java class for KeyInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyInfo", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "signDN",
    "certPolicyId"
})
public class SwSecKeyInfo {

    @XmlElement(name = "SignDN", required = true)
    protected String signDN;
    @XmlElement(name = "CertPolicyId")
    protected String certPolicyId;

    /**
     * Gets the value of the signDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDN() {
        return signDN;
    }

    /**
     * Sets the value of the signDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecKeyInfo setSignDN(String value) {
        this.signDN = value;
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
    public SwSecKeyInfo setCertPolicyId(String value) {
        this.certPolicyId = value;
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
