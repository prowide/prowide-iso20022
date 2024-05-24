
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
 * Java class for PutFileRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutFileRequestHandle", propOrder = {
    "transferRef",
    "transferDescription",
    "transferInfo",
    "possibleDuplicate",
    "origTransferRef",
    "ackIndicator",
    "ackServerInfo",
    "logicalName",
    "fileDescription",
    "fileInfo",
    "size",
    "digest"
})
public class SwPutFileRequestHandle {

    @XmlElement(name = "TransferRef", required = true)
    protected String transferRef;
    @XmlElement(name = "TransferDescription")
    protected String transferDescription;
    @XmlElement(name = "TransferInfo")
    protected String transferInfo;
    @XmlElement(name = "PossibleDuplicate")
    protected String possibleDuplicate;
    @XmlElement(name = "OrigTransferRef")
    protected String origTransferRef;
    @XmlElement(name = "AckIndicator", required = true)
    protected String ackIndicator;
    @XmlElement(name = "AckServerInfo")
    protected SwServerInfo ackServerInfo;
    @XmlElement(name = "LogicalName", required = true)
    protected String logicalName;
    @XmlElement(name = "FileDescription")
    protected String fileDescription;
    @XmlElement(name = "FileInfo")
    protected String fileInfo;
    @XmlElement(name = "Size", required = true)
    protected String size;
    @XmlElement(name = "Digest", required = true)
    protected SwDigest digest;

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
    public SwPutFileRequestHandle setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the transferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDescription() {
        return transferDescription;
    }

    /**
     * Sets the value of the transferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileRequestHandle setTransferDescription(String value) {
        this.transferDescription = value;
        return this;
    }

    /**
     * Gets the value of the transferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferInfo() {
        return transferInfo;
    }

    /**
     * Sets the value of the transferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileRequestHandle setTransferInfo(String value) {
        this.transferInfo = value;
        return this;
    }

    /**
     * Gets the value of the possibleDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossibleDuplicate() {
        return possibleDuplicate;
    }

    /**
     * Sets the value of the possibleDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileRequestHandle setPossibleDuplicate(String value) {
        this.possibleDuplicate = value;
        return this;
    }

    /**
     * Gets the value of the origTransferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTransferRef() {
        return origTransferRef;
    }

    /**
     * Sets the value of the origTransferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileRequestHandle setOrigTransferRef(String value) {
        this.origTransferRef = value;
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
    public SwPutFileRequestHandle setAckIndicator(String value) {
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
    public SwPutFileRequestHandle setAckServerInfo(SwServerInfo value) {
        this.ackServerInfo = value;
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
    public SwPutFileRequestHandle setLogicalName(String value) {
        this.logicalName = value;
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
    public SwPutFileRequestHandle setFileDescription(String value) {
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
    public SwPutFileRequestHandle setFileInfo(String value) {
        this.fileInfo = value;
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
    public SwPutFileRequestHandle setSize(String value) {
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
    public SwPutFileRequestHandle setDigest(SwDigest value) {
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
