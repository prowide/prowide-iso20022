
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
 * Java class for DomainConnection complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainConnection", propOrder = {
    "connectionStatus",
    "localDomain",
    "remoteDomain",
    "remoteDomainId",
    "remoteDomainNWAddr"
})
public class SwDomainConnection {

    @XmlElement(name = "ConnectionStatus", required = true)
    protected String connectionStatus;
    @XmlElement(name = "LocalDomain", required = true)
    protected String localDomain;
    @XmlElement(name = "RemoteDomain", required = true)
    protected String remoteDomain;
    @XmlElement(name = "RemoteDomainId", required = true)
    protected String remoteDomainId;
    @XmlElement(name = "RemoteDomainNWAddr", required = true)
    protected String remoteDomainNWAddr;

    /**
     * Gets the value of the connectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDomainConnection setConnectionStatus(String value) {
        this.connectionStatus = value;
        return this;
    }

    /**
     * Gets the value of the localDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDomain() {
        return localDomain;
    }

    /**
     * Sets the value of the localDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDomainConnection setLocalDomain(String value) {
        this.localDomain = value;
        return this;
    }

    /**
     * Gets the value of the remoteDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDomain() {
        return remoteDomain;
    }

    /**
     * Sets the value of the remoteDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDomainConnection setRemoteDomain(String value) {
        this.remoteDomain = value;
        return this;
    }

    /**
     * Gets the value of the remoteDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDomainId() {
        return remoteDomainId;
    }

    /**
     * Sets the value of the remoteDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDomainConnection setRemoteDomainId(String value) {
        this.remoteDomainId = value;
        return this;
    }

    /**
     * Gets the value of the remoteDomainNWAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDomainNWAddr() {
        return remoteDomainNWAddr;
    }

    /**
     * Sets the value of the remoteDomainNWAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDomainConnection setRemoteDomainNWAddr(String value) {
        this.remoteDomainNWAddr = value;
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
