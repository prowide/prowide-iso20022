
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
 * Java class for PullSnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PullSnFRequest", propOrder = {
    "authorisationContext",
    "snFRequestControl",
    "snFSessionId",
    "ackMessage"
})
public class SwPullSnFRequest {

    @XmlElement(name = "AuthorisationContext", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "SnFRequestControl")
    protected SwSnFRequestControl snFRequestControl;
    @XmlElement(name = "SnFSessionId", required = true)
    protected String snFSessionId;
    @XmlElement(name = "AckMessage")
    protected SwAckMessage ackMessage;

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
    public SwPullSnFRequest setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the snFRequestControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFRequestControl }
     *     
     */
    public SwSnFRequestControl getSnFRequestControl() {
        return snFRequestControl;
    }

    /**
     * Sets the value of the snFRequestControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFRequestControl }
     *     
     */
    public SwPullSnFRequest setSnFRequestControl(SwSnFRequestControl value) {
        this.snFRequestControl = value;
        return this;
    }

    /**
     * Gets the value of the snFSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFSessionId() {
        return snFSessionId;
    }

    /**
     * Sets the value of the snFSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPullSnFRequest setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Gets the value of the ackMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckMessage }
     *     
     */
    public SwAckMessage getAckMessage() {
        return ackMessage;
    }

    /**
     * Sets the value of the ackMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckMessage }
     *     
     */
    public SwPullSnFRequest setAckMessage(SwAckMessage value) {
        this.ackMessage = value;
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
