
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
 * Java class for SnFOpResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFOpResponseHandle", propOrder = {
    "acquireSnFResponseHandle",
    "releaseSnFResponseHandle",
    "ackSnFResponseHandle",
    "createInputChannelSnFResponseHandle",
    "deleteInputChannelSnFResponseHandle",
    "openInputChannelSnFResponseHandle",
    "closeInputChannelSnFResponseHandle",
    "resolveGapSnFResponseHandle",
    "createOutputChannelSnFResponseHandle",
    "deleteOutputChannelSnFResponseHandle",
    "openOutputChannelSnFResponseHandle",
    "closeOutputChannelSnFResponseHandle",
    "getLastReplicationTimeSnFResponseHandle"
})
public class SwSnFOpResponseHandle {

    @XmlElement(name = "AcquireSnFResponseHandle")
    protected SwAcquireSnFResponseHandle acquireSnFResponseHandle;
    @XmlElement(name = "ReleaseSnFResponseHandle")
    protected SwEmpty releaseSnFResponseHandle;
    @XmlElement(name = "AckSnFResponseHandle")
    protected SwEmpty ackSnFResponseHandle;
    @XmlElement(name = "CreateInputChannelSnFResponseHandle")
    protected SwEmpty createInputChannelSnFResponseHandle;
    @XmlElement(name = "DeleteInputChannelSnFResponseHandle")
    protected SwEmpty deleteInputChannelSnFResponseHandle;
    @XmlElement(name = "OpenInputChannelSnFResponseHandle")
    protected SwOpenInputChannelSnFResponseHandle openInputChannelSnFResponseHandle;
    @XmlElement(name = "CloseInputChannelSnFResponseHandle")
    protected SwEmpty closeInputChannelSnFResponseHandle;
    @XmlElement(name = "ResolveGapSnFResponseHandle")
    protected SwResolveGapSnFResponseHandle resolveGapSnFResponseHandle;
    @XmlElement(name = "CreateOutputChannelSnFResponseHandle")
    protected SwEmpty createOutputChannelSnFResponseHandle;
    @XmlElement(name = "DeleteOutputChannelSnFResponseHandle")
    protected SwEmpty deleteOutputChannelSnFResponseHandle;
    @XmlElement(name = "OpenOutputChannelSnFResponseHandle")
    protected SwOpenOutputChannelSnFResponseHandle openOutputChannelSnFResponseHandle;
    @XmlElement(name = "CloseOutputChannelSnFResponseHandle")
    protected SwEmpty closeOutputChannelSnFResponseHandle;
    @XmlElement(name = "GetLastReplicationTimeSnFResponseHandle")
    protected SwGetLastReplicationTimeSnFResponseHandle getLastReplicationTimeSnFResponseHandle;

    /**
     * Gets the value of the acquireSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwAcquireSnFResponseHandle }
     *     
     */
    public SwAcquireSnFResponseHandle getAcquireSnFResponseHandle() {
        return acquireSnFResponseHandle;
    }

    /**
     * Sets the value of the acquireSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAcquireSnFResponseHandle }
     *     
     */
    public SwSnFOpResponseHandle setAcquireSnFResponseHandle(SwAcquireSnFResponseHandle value) {
        this.acquireSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the releaseSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getReleaseSnFResponseHandle() {
        return releaseSnFResponseHandle;
    }

    /**
     * Sets the value of the releaseSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setReleaseSnFResponseHandle(SwEmpty value) {
        this.releaseSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the ackSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getAckSnFResponseHandle() {
        return ackSnFResponseHandle;
    }

    /**
     * Sets the value of the ackSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setAckSnFResponseHandle(SwEmpty value) {
        this.ackSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the createInputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getCreateInputChannelSnFResponseHandle() {
        return createInputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the createInputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setCreateInputChannelSnFResponseHandle(SwEmpty value) {
        this.createInputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the deleteInputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getDeleteInputChannelSnFResponseHandle() {
        return deleteInputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the deleteInputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setDeleteInputChannelSnFResponseHandle(SwEmpty value) {
        this.deleteInputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the openInputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwOpenInputChannelSnFResponseHandle }
     *     
     */
    public SwOpenInputChannelSnFResponseHandle getOpenInputChannelSnFResponseHandle() {
        return openInputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the openInputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwOpenInputChannelSnFResponseHandle }
     *     
     */
    public SwSnFOpResponseHandle setOpenInputChannelSnFResponseHandle(SwOpenInputChannelSnFResponseHandle value) {
        this.openInputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the closeInputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getCloseInputChannelSnFResponseHandle() {
        return closeInputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the closeInputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setCloseInputChannelSnFResponseHandle(SwEmpty value) {
        this.closeInputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the resolveGapSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwResolveGapSnFResponseHandle }
     *     
     */
    public SwResolveGapSnFResponseHandle getResolveGapSnFResponseHandle() {
        return resolveGapSnFResponseHandle;
    }

    /**
     * Sets the value of the resolveGapSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwResolveGapSnFResponseHandle }
     *     
     */
    public SwSnFOpResponseHandle setResolveGapSnFResponseHandle(SwResolveGapSnFResponseHandle value) {
        this.resolveGapSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the createOutputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getCreateOutputChannelSnFResponseHandle() {
        return createOutputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the createOutputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setCreateOutputChannelSnFResponseHandle(SwEmpty value) {
        this.createOutputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the deleteOutputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getDeleteOutputChannelSnFResponseHandle() {
        return deleteOutputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the deleteOutputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setDeleteOutputChannelSnFResponseHandle(SwEmpty value) {
        this.deleteOutputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the openOutputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwOpenOutputChannelSnFResponseHandle }
     *     
     */
    public SwOpenOutputChannelSnFResponseHandle getOpenOutputChannelSnFResponseHandle() {
        return openOutputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the openOutputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwOpenOutputChannelSnFResponseHandle }
     *     
     */
    public SwSnFOpResponseHandle setOpenOutputChannelSnFResponseHandle(SwOpenOutputChannelSnFResponseHandle value) {
        this.openOutputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the closeOutputChannelSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwEmpty }
     *     
     */
    public SwEmpty getCloseOutputChannelSnFResponseHandle() {
        return closeOutputChannelSnFResponseHandle;
    }

    /**
     * Sets the value of the closeOutputChannelSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwEmpty }
     *     
     */
    public SwSnFOpResponseHandle setCloseOutputChannelSnFResponseHandle(SwEmpty value) {
        this.closeOutputChannelSnFResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the getLastReplicationTimeSnFResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwGetLastReplicationTimeSnFResponseHandle }
     *     
     */
    public SwGetLastReplicationTimeSnFResponseHandle getGetLastReplicationTimeSnFResponseHandle() {
        return getLastReplicationTimeSnFResponseHandle;
    }

    /**
     * Sets the value of the getLastReplicationTimeSnFResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGetLastReplicationTimeSnFResponseHandle }
     *     
     */
    public SwSnFOpResponseHandle setGetLastReplicationTimeSnFResponseHandle(SwGetLastReplicationTimeSnFResponseHandle value) {
        this.getLastReplicationTimeSnFResponseHandle = value;
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
