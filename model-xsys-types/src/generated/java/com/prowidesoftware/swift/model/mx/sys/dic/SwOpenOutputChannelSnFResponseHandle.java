
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
 * Java class for OpenOutputChannelSnFResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOutputChannelSnFResponseHandle", propOrder = {
    "acquiredStatus",
    "snFSessionId",
    "snFOutputSeq",
    "previousSessionInfo",
    "currentSessionInfo",
    "windowSize",
    "pendingFiles",
    "unAckedSnFOutputSeqList"
})
public class SwOpenOutputChannelSnFResponseHandle {

    @XmlElement(name = "AcquiredStatus", required = true)
    protected String acquiredStatus;
    @XmlElement(name = "SnFSessionId")
    protected String snFSessionId;
    @XmlElement(name = "SnFOutputSeq")
    protected String snFOutputSeq;
    @XmlElement(name = "PreviousSessionInfo")
    protected SwSessionInfo previousSessionInfo;
    @XmlElement(name = "CurrentSessionInfo")
    protected SwSessionInfo currentSessionInfo;
    @XmlElement(name = "WindowSize")
    protected String windowSize;
    @XmlElement(name = "PendingFiles")
    protected String pendingFiles;
    @XmlElement(name = "UnAckedSnFOutputSeqList")
    protected SwUnAckedSnFOutputSeqList unAckedSnFOutputSeqList;

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
    public SwOpenOutputChannelSnFResponseHandle setAcquiredStatus(String value) {
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
    public SwOpenOutputChannelSnFResponseHandle setSnFSessionId(String value) {
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
    public SwOpenOutputChannelSnFResponseHandle setSnFOutputSeq(String value) {
        this.snFOutputSeq = value;
        return this;
    }

    /**
     * Gets the value of the previousSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSessionInfo }
     *     
     */
    public SwSessionInfo getPreviousSessionInfo() {
        return previousSessionInfo;
    }

    /**
     * Sets the value of the previousSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSessionInfo }
     *     
     */
    public SwOpenOutputChannelSnFResponseHandle setPreviousSessionInfo(SwSessionInfo value) {
        this.previousSessionInfo = value;
        return this;
    }

    /**
     * Gets the value of the currentSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSessionInfo }
     *     
     */
    public SwSessionInfo getCurrentSessionInfo() {
        return currentSessionInfo;
    }

    /**
     * Sets the value of the currentSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSessionInfo }
     *     
     */
    public SwOpenOutputChannelSnFResponseHandle setCurrentSessionInfo(SwSessionInfo value) {
        this.currentSessionInfo = value;
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
    public SwOpenOutputChannelSnFResponseHandle setWindowSize(String value) {
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
    public SwOpenOutputChannelSnFResponseHandle setPendingFiles(String value) {
        this.pendingFiles = value;
        return this;
    }

    /**
     * Gets the value of the unAckedSnFOutputSeqList property.
     * 
     * @return
     *     possible object is
     *     {@link SwUnAckedSnFOutputSeqList }
     *     
     */
    public SwUnAckedSnFOutputSeqList getUnAckedSnFOutputSeqList() {
        return unAckedSnFOutputSeqList;
    }

    /**
     * Sets the value of the unAckedSnFOutputSeqList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwUnAckedSnFOutputSeqList }
     *     
     */
    public SwOpenOutputChannelSnFResponseHandle setUnAckedSnFOutputSeqList(SwUnAckedSnFOutputSeqList value) {
        this.unAckedSnFOutputSeqList = value;
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
