
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
 * Java class for ListFileStatusRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFileStatusRequest", propOrder = {
    "partition",
    "transferStatus",
    "storedTransferRef",
    "msgId",
    "fullFileStatus",
    "transferRef",
    "recordCount"
})
public class SwListFileStatusRequest {

    @XmlElement(name = "Partition")
    protected String partition;
    @XmlElement(name = "TransferStatus")
    protected String transferStatus;
    @XmlElement(name = "StoredTransferRef")
    protected String storedTransferRef;
    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "FullFileStatus")
    protected String fullFileStatus;
    @XmlElement(name = "TransferRef")
    protected String transferRef;
    @XmlElement(name = "RecordCount")
    protected String recordCount;

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwListFileStatusRequest setPartition(String value) {
        this.partition = value;
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
    public SwListFileStatusRequest setTransferStatus(String value) {
        this.transferStatus = value;
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
    public SwListFileStatusRequest setStoredTransferRef(String value) {
        this.storedTransferRef = value;
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
    public SwListFileStatusRequest setMsgId(String value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the fullFileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullFileStatus() {
        return fullFileStatus;
    }

    /**
     * Sets the value of the fullFileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwListFileStatusRequest setFullFileStatus(String value) {
        this.fullFileStatus = value;
        return this;
    }

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
    public SwListFileStatusRequest setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwListFileStatusRequest setRecordCount(String value) {
        this.recordCount = value;
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
