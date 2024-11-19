
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
 * Java class for FileStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileStatus", propOrder = {
    "transferRef",
    "localRef",
    "fileRequestHeader",
    "fileResponseHeader",
    "transferSide",
    "transferType",
    "transferDirection",
    "deliveryMode",
    "storedTransferRef",
    "snFInputInfo",
    "msgId",
    "transferStatus",
    "stopReason",
    "ackIndicator",
    "logicalName",
    "physicalName",
    "currentSize",
    "size",
    "startTime",
    "stateTime",
    "fileStatusDetails"
})
public class SwFileStatus {

    @XmlElement(name = "TransferRef", required = true)
    protected String transferRef;
    @XmlElement(name = "LocalRef")
    protected String localRef;
    @XmlElement(name = "FileRequestHeader", required = true)
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "FileResponseHeader")
    protected SwFileResponseHeader fileResponseHeader;
    @XmlElement(name = "TransferSide", required = true)
    protected String transferSide;
    @XmlElement(name = "TransferType", required = true)
    protected String transferType;
    @XmlElement(name = "TransferDirection", required = true)
    protected String transferDirection;
    @XmlElement(name = "DeliveryMode", namespace = "urn:swift:snl:ns.SwInt")
    protected String deliveryMode;
    @XmlElement(name = "StoredTransferRef")
    protected String storedTransferRef;
    @XmlElement(name = "SnFInputInfo")
    protected SwSnFInputInfo snFInputInfo;
    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "TransferStatus", required = true)
    protected String transferStatus;
    @XmlElement(name = "StopReason")
    protected SwStopReason stopReason;
    @XmlElement(name = "AckIndicator")
    protected String ackIndicator;
    @XmlElement(name = "LogicalName", required = true)
    protected String logicalName;
    @XmlElement(name = "PhysicalName")
    protected String physicalName;
    @XmlElement(name = "CurrentSize")
    protected String currentSize;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "StartTime", required = true)
    protected String startTime;
    @XmlElement(name = "StateTime", required = true)
    protected String stateTime;
    @XmlElement(name = "FileStatusDetails")
    protected SwFileStatusDetails fileStatusDetails;

    /**
     * Gets the value of the transferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRef() {
        return transferRef;
    }

    /**
     * Sets the value of the transferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the localRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRef() {
        return localRef;
    }

    /**
     * Sets the value of the localRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setLocalRef(String value) {
        this.localRef = value;
        return this;
    }

    /**
     * Gets the value of the fileRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequestHeader }
     *     
     */
    public SwFileRequestHeader getFileRequestHeader() {
        return fileRequestHeader;
    }

    /**
     * Sets the value of the fileRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequestHeader }
     *     
     */
    public SwFileStatus setFileRequestHeader(SwFileRequestHeader value) {
        this.fileRequestHeader = value;
        return this;
    }

    /**
     * Gets the value of the fileResponseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileResponseHeader }
     *     
     */
    public SwFileResponseHeader getFileResponseHeader() {
        return fileResponseHeader;
    }

    /**
     * Sets the value of the fileResponseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileResponseHeader }
     *     
     */
    public SwFileStatus setFileResponseHeader(SwFileResponseHeader value) {
        this.fileResponseHeader = value;
        return this;
    }

    /**
     * Gets the value of the transferSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferSide() {
        return transferSide;
    }

    /**
     * Sets the value of the transferSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setTransferSide(String value) {
        this.transferSide = value;
        return this;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setTransferType(String value) {
        this.transferType = value;
        return this;
    }

    /**
     * Gets the value of the transferDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDirection() {
        return transferDirection;
    }

    /**
     * Sets the value of the transferDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setTransferDirection(String value) {
        this.transferDirection = value;
        return this;
    }

    /**
     * Gets the value of the deliveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * Sets the value of the deliveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setDeliveryMode(String value) {
        this.deliveryMode = value;
        return this;
    }

    /**
     * Gets the value of the storedTransferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoredTransferRef() {
        return storedTransferRef;
    }

    /**
     * Sets the value of the storedTransferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setStoredTransferRef(String value) {
        this.storedTransferRef = value;
        return this;
    }

    /**
     * Gets the value of the snFInputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFInputInfo }
     *     
     */
    public SwSnFInputInfo getSnFInputInfo() {
        return snFInputInfo;
    }

    /**
     * Sets the value of the snFInputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFInputInfo }
     *     
     */
    public SwFileStatus setSnFInputInfo(SwSnFInputInfo value) {
        this.snFInputInfo = value;
        return this;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the transferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    /**
     * Sets the value of the transferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setTransferStatus(String value) {
        this.transferStatus = value;
        return this;
    }

    /**
     * Gets the value of the stopReason property.
     * 
     * @return
     *     possible object is
     *     {@link SwStopReason }
     *     
     */
    public SwStopReason getStopReason() {
        return stopReason;
    }

    /**
     * Sets the value of the stopReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwStopReason }
     *     
     */
    public SwFileStatus setStopReason(SwStopReason value) {
        this.stopReason = value;
        return this;
    }

    /**
     * Gets the value of the ackIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckIndicator() {
        return ackIndicator;
    }

    /**
     * Sets the value of the ackIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setAckIndicator(String value) {
        this.ackIndicator = value;
        return this;
    }

    /**
     * Gets the value of the logicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * Sets the value of the logicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setLogicalName(String value) {
        this.logicalName = value;
        return this;
    }

    /**
     * Gets the value of the physicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalName() {
        return physicalName;
    }

    /**
     * Sets the value of the physicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setPhysicalName(String value) {
        this.physicalName = value;
        return this;
    }

    /**
     * Gets the value of the currentSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSize() {
        return currentSize;
    }

    /**
     * Sets the value of the currentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setCurrentSize(String value) {
        this.currentSize = value;
        return this;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setSize(String value) {
        this.size = value;
        return this;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setStartTime(String value) {
        this.startTime = value;
        return this;
    }

    /**
     * Gets the value of the stateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTime() {
        return stateTime;
    }

    /**
     * Sets the value of the stateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatus setStateTime(String value) {
        this.stateTime = value;
        return this;
    }

    /**
     * Gets the value of the fileStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileStatusDetails }
     *     
     */
    public SwFileStatusDetails getFileStatusDetails() {
        return fileStatusDetails;
    }

    /**
     * Sets the value of the fileStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileStatusDetails }
     *     
     */
    public SwFileStatus setFileStatusDetails(SwFileStatusDetails value) {
        this.fileStatusDetails = value;
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
