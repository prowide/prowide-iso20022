
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
 * Java class for HandleSnFResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleSnFResponse", propOrder = {
    "authorisationContext",
    "snFResponse"
})
public class SwHandleSnFResponse {

    @XmlElement(name = "AuthorisationContext", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "SnFResponse", required = true)
    protected SwSnFResponse snFResponse;

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
    public SwHandleSnFResponse setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the snFResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFResponse }
     *     
     */
    public SwSnFResponse getSnFResponse() {
        return snFResponse;
    }

    /**
     * Sets the value of the snFResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFResponse }
     *     
     */
    public SwHandleSnFResponse setSnFResponse(SwSnFResponse value) {
        this.snFResponse = value;
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
