
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
 * Java class for SnFOpRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFOpRequest", propOrder = {
    "acquireSnFRequest",
    "releaseSnFRequest",
    "ackSnFRequest",
    "createInputChannelSnFRequest",
    "deleteInputChannelSnFRequest",
    "openInputChannelSnFRequest",
    "closeInputChannelSnFRequest",
    "resolveGapSnFRequest",
    "createOutputChannelSnFRequest",
    "deleteOutputChannelSnFRequest",
    "openOutputChannelSnFRequest",
    "closeOutputChannelSnFRequest",
    "getLastReplicationTimeSnFRequest"
})
public class SwSnFOpRequest {

    @XmlElement(name = "AcquireSnFRequest")
    protected SwAcquireSnFRequest acquireSnFRequest;
    @XmlElement(name = "ReleaseSnFRequest")
    protected SwReleaseSnFRequest releaseSnFRequest;
    @XmlElement(name = "AckSnFRequest")
    protected SwAckSnFRequest ackSnFRequest;
    @XmlElement(name = "CreateInputChannelSnFRequest")
    protected SwCreateInputChannelSnFRequest createInputChannelSnFRequest;
    @XmlElement(name = "DeleteInputChannelSnFRequest")
    protected SwDeleteInputChannelSnFRequest deleteInputChannelSnFRequest;
    @XmlElement(name = "OpenInputChannelSnFRequest")
    protected SwOpenInputChannelSnFRequest openInputChannelSnFRequest;
    @XmlElement(name = "CloseInputChannelSnFRequest")
    protected SwCloseInputChannelSnFRequest closeInputChannelSnFRequest;
    @XmlElement(name = "ResolveGapSnFRequest")
    protected SwResolveGapSnFRequest resolveGapSnFRequest;
    @XmlElement(name = "CreateOutputChannelSnFRequest")
    protected SwCreateOutputChannelSnFRequest createOutputChannelSnFRequest;
    @XmlElement(name = "DeleteOutputChannelSnFRequest")
    protected SwDeleteOutputChannelSnFRequest deleteOutputChannelSnFRequest;
    @XmlElement(name = "OpenOutputChannelSnFRequest")
    protected SwOpenOutputChannelSnFRequest openOutputChannelSnFRequest;
    @XmlElement(name = "CloseOutputChannelSnFRequest")
    protected SwCloseOutputChannelSnFRequest closeOutputChannelSnFRequest;
    @XmlElement(name = "GetLastReplicationTimeSnFRequest")
    protected SwEmpty getLastReplicationTimeSnFRequest;

    /**
     * Gets the value of the acquireSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwAcquireSnFRequest }
     *     
     */
    public SwAcquireSnFRequest getAcquireSnFRequest() {
        return acquireSnFRequest;
    }

    /**
     * Sets the value of the acquireSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAcquireSnFRequest }
     *     
     */
    public SwSnFOpRequest setAcquireSnFRequest(SwAcquireSnFRequest value) {
        this.acquireSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the releaseSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwReleaseSnFRequest }
     *     
     */
    public SwReleaseSnFRequest getReleaseSnFRequest() {
        return releaseSnFRequest;
    }

    /**
     * Sets the value of the releaseSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwReleaseSnFRequest }
     *     
     */
    public SwSnFOpRequest setReleaseSnFRequest(SwReleaseSnFRequest value) {
        this.releaseSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the ackSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckSnFRequest }
     *     
     */
    public SwAckSnFRequest getAckSnFRequest() {
        return ackSnFRequest;
    }

    /**
     * Sets the value of the ackSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckSnFRequest }
     *     
     */
    public SwSnFOpRequest setAckSnFRequest(SwAckSnFRequest value) {
        this.ackSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the createInputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwCreateInputChannelSnFRequest }
     *     
     */
    public SwCreateInputChannelSnFRequest getCreateInputChannelSnFRequest() {
        return createInputChannelSnFRequest;
    }

    /**
     * Sets the value of the createInputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwCreateInputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setCreateInputChannelSnFRequest(SwCreateInputChannelSnFRequest value) {
        this.createInputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the deleteInputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwDeleteInputChannelSnFRequest }
     *     
     */
    public SwDeleteInputChannelSnFRequest getDeleteInputChannelSnFRequest() {
        return deleteInputChannelSnFRequest;
    }

    /**
     * Sets the value of the deleteInputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDeleteInputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setDeleteInputChannelSnFRequest(SwDeleteInputChannelSnFRequest value) {
        this.deleteInputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the openInputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwOpenInputChannelSnFRequest }
     *     
     */
    public SwOpenInputChannelSnFRequest getOpenInputChannelSnFRequest() {
        return openInputChannelSnFRequest;
    }

    /**
     * Sets the value of the openInputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwOpenInputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setOpenInputChannelSnFRequest(SwOpenInputChannelSnFRequest value) {
        this.openInputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the closeInputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwCloseInputChannelSnFRequest }
     *     
     */
    public SwCloseInputChannelSnFRequest getCloseInputChannelSnFRequest() {
        return closeInputChannelSnFRequest;
    }

    /**
     * Sets the value of the closeInputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwCloseInputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setCloseInputChannelSnFRequest(SwCloseInputChannelSnFRequest value) {
        this.closeInputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the resolveGapSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwResolveGapSnFRequest }
     *     
     */
    public SwResolveGapSnFRequest getResolveGapSnFRequest() {
        return resolveGapSnFRequest;
    }

    /**
     * Sets the value of the resolveGapSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwResolveGapSnFRequest }
     *     
     */
    public SwSnFOpRequest setResolveGapSnFRequest(SwResolveGapSnFRequest value) {
        this.resolveGapSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the createOutputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwCreateOutputChannelSnFRequest }
     *     
     */
    public SwCreateOutputChannelSnFRequest getCreateOutputChannelSnFRequest() {
        return createOutputChannelSnFRequest;
    }

    /**
     * Sets the value of the createOutputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwCreateOutputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setCreateOutputChannelSnFRequest(SwCreateOutputChannelSnFRequest value) {
        this.createOutputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the deleteOutputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwDeleteOutputChannelSnFRequest }
     *     
     */
    public SwDeleteOutputChannelSnFRequest getDeleteOutputChannelSnFRequest() {
        return deleteOutputChannelSnFRequest;
    }

    /**
     * Sets the value of the deleteOutputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDeleteOutputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setDeleteOutputChannelSnFRequest(SwDeleteOutputChannelSnFRequest value) {
        this.deleteOutputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the openOutputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwOpenOutputChannelSnFRequest }
     *     
     */
    public SwOpenOutputChannelSnFRequest getOpenOutputChannelSnFRequest() {
        return openOutputChannelSnFRequest;
    }

    /**
     * Sets the value of the openOutputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwOpenOutputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setOpenOutputChannelSnFRequest(SwOpenOutputChannelSnFRequest value) {
        this.openOutputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the closeOutputChannelSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwCloseOutputChannelSnFRequest }
     *     
     */
    public SwCloseOutputChannelSnFRequest getCloseOutputChannelSnFRequest() {
        return closeOutputChannelSnFRequest;
    }

    /**
     * Sets the value of the closeOutputChannelSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwCloseOutputChannelSnFRequest }
     *     
     */
    public SwSnFOpRequest setCloseOutputChannelSnFRequest(SwCloseOutputChannelSnFRequest value) {
        this.closeOutputChannelSnFRequest = value;
        return this;
    }

    /**
     * Gets the value of the getLastReplicationTimeSnFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getGetLastReplicationTimeSnFRequest() {
        return getLastReplicationTimeSnFRequest;
    }

    /**
     * Sets the value of the getLastReplicationTimeSnFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpRequest setGetLastReplicationTimeSnFRequest(SwEmpty value) {
        this.getLastReplicationTimeSnFRequest = value;
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
