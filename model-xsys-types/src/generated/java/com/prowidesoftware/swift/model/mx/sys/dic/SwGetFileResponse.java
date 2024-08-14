
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
 * Java class for GetFileResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileResponse", propOrder = {
    "transferAnswer",
    "rejectDescription",
    "rejectInfo",
    "physicalName",
    "fileDescription",
    "fileInfo",
    "ackIndicator",
    "ackServerInfo",
    "size",
    "digest"
})
public class SwGetFileResponse {

    @XmlElement(name = "TransferAnswer", required = true)
    protected String transferAnswer;
    @XmlElement(name = "RejectDescription")
    protected String rejectDescription;
    @XmlElement(name = "RejectInfo")
    protected String rejectInfo;
    @XmlElement(name = "PhysicalName")
    protected String physicalName;
    @XmlElement(name = "FileDescription")
    protected String fileDescription;
    @XmlElement(name = "FileInfo")
    protected String fileInfo;
    @XmlElement(name = "AckIndicator")
    protected String ackIndicator;
    @XmlElement(name = "AckServerInfo")
    protected SwServerInfo ackServerInfo;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "Digest")
    protected SwDigest digest;

    /**
     * Gets the value of the transferAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAnswer() {
        return transferAnswer;
    }

    /**
     * Sets the value of the transferAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileResponse setTransferAnswer(String value) {
        this.transferAnswer = value;
        return this;
    }

    /**
     * Gets the value of the rejectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectDescription() {
        return rejectDescription;
    }

    /**
     * Sets the value of the rejectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileResponse setRejectDescription(String value) {
        this.rejectDescription = value;
        return this;
    }

    /**
     * Gets the value of the rejectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectInfo() {
        return rejectInfo;
    }

    /**
     * Sets the value of the rejectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileResponse setRejectInfo(String value) {
        this.rejectInfo = value;
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
    public SwGetFileResponse setPhysicalName(String value) {
        this.physicalName = value;
        return this;
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileResponse setFileDescription(String value) {
        this.fileDescription = value;
        return this;
    }

    /**
     * Gets the value of the fileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileInfo() {
        return fileInfo;
    }

    /**
     * Sets the value of the fileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileResponse setFileInfo(String value) {
        this.fileInfo = value;
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
    public SwGetFileResponse setAckIndicator(String value) {
        this.ackIndicator = value;
        return this;
    }

    /**
     * Gets the value of the ackServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerInfo }
     *     
     */
    public SwServerInfo getAckServerInfo() {
        return ackServerInfo;
    }

    /**
     * Sets the value of the ackServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerInfo }
     *     
     */
    public SwGetFileResponse setAckServerInfo(SwServerInfo value) {
        this.ackServerInfo = value;
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
    public SwGetFileResponse setSize(String value) {
        this.size = value;
        return this;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link SwDigest }
     *     
     */
    public SwDigest getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDigest }
     *     
     */
    public SwGetFileResponse setDigest(SwDigest value) {
        this.digest = value;
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
