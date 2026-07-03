
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
 * Java class for AcquireSnFResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquireSnFResponseHandle", propOrder = {
    "acquiredStatus",
    "snFSessionId",
    "snFOutputSeq",
    "previousQueueInfo",
    "currentQueueInfo",
    "windowSize",
    "pendingFiles"
})
public class SwAcquireSnFResponseHandle {

    @XmlElement(name = "AcquiredStatus", required = true)
    protected String acquiredStatus;
    @XmlElement(name = "SnFSessionId")
    protected String snFSessionId;
    @XmlElement(name = "SnFOutputSeq")
    protected String snFOutputSeq;
    @XmlElement(name = "PreviousQueueInfo")
    protected SwQueueInfo previousQueueInfo;
    @XmlElement(name = "CurrentQueueInfo")
    protected SwQueueInfo currentQueueInfo;
    @XmlElement(name = "WindowSize")
    protected String windowSize;
    @XmlElement(name = "PendingFiles")
    protected String pendingFiles;

    /**
     * Gets the value of the acquiredStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredStatus() {
        return acquiredStatus;
    }

    /**
     * Sets the value of the acquiredStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFResponseHandle setAcquiredStatus(String value) {
        this.acquiredStatus = value;
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
    public SwAcquireSnFResponseHandle setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Gets the value of the snFOutputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFOutputSeq() {
        return snFOutputSeq;
    }

    /**
     * Sets the value of the snFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFResponseHandle setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
        return this;
    }

    /**
     * Gets the value of the previousQueueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwQueueInfo }
     *     
     */
    public SwQueueInfo getPreviousQueueInfo() {
        return previousQueueInfo;
    }

    /**
     * Sets the value of the previousQueueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwQueueInfo }
     *     
     */
    public SwAcquireSnFResponseHandle setPreviousQueueInfo(SwQueueInfo value) {
        this.previousQueueInfo = value;
        return this;
    }

    /**
     * Gets the value of the currentQueueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwQueueInfo }
     *     
     */
    public SwQueueInfo getCurrentQueueInfo() {
        return currentQueueInfo;
    }

    /**
     * Sets the value of the currentQueueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwQueueInfo }
     *     
     */
    public SwAcquireSnFResponseHandle setCurrentQueueInfo(SwQueueInfo value) {
        this.currentQueueInfo = value;
        return this;
    }

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFResponseHandle setWindowSize(String value) {
        this.windowSize = value;
        return this;
    }

    /**
     * Gets the value of the pendingFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingFiles() {
        return pendingFiles;
    }

    /**
     * Sets the value of the pendingFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAcquireSnFResponseHandle setPendingFiles(String value) {
        this.pendingFiles = value;
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
