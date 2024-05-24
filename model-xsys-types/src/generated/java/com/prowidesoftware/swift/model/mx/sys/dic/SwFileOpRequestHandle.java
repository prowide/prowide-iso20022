
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
 * Java class for FileOpRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileOpRequestHandle", propOrder = {
    "putFileRequestHandle",
    "getFileRequestHandle",
    "ackFileRequestHandle",
    "notifyFileRequestHandle"
})
public class SwFileOpRequestHandle {

    @XmlElement(name = "PutFileRequestHandle")
    protected SwPutFileRequestHandle putFileRequestHandle;
    @XmlElement(name = "GetFileRequestHandle")
    protected SwGetFileRequestHandle getFileRequestHandle;
    @XmlElement(name = "AckFileRequestHandle")
    protected SwAckFileRequestHandle ackFileRequestHandle;
    @XmlElement(name = "NotifyFileRequestHandle")
    protected SwNotifyFileRequestHandle notifyFileRequestHandle;

    /**
     * Gets the value of the putFileRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwPutFileRequestHandle }
     *     
     */
    public SwPutFileRequestHandle getPutFileRequestHandle() {
        return putFileRequestHandle;
    }

    /**
     * Sets the value of the putFileRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwPutFileRequestHandle }
     *     
     */
    public SwFileOpRequestHandle setPutFileRequestHandle(SwPutFileRequestHandle value) {
        this.putFileRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the getFileRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwGetFileRequestHandle }
     *     
     */
    public SwGetFileRequestHandle getGetFileRequestHandle() {
        return getFileRequestHandle;
    }

    /**
     * Sets the value of the getFileRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGetFileRequestHandle }
     *     
     */
    public SwFileOpRequestHandle setGetFileRequestHandle(SwGetFileRequestHandle value) {
        this.getFileRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the ackFileRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckFileRequestHandle }
     *     
     */
    public SwAckFileRequestHandle getAckFileRequestHandle() {
        return ackFileRequestHandle;
    }

    /**
     * Sets the value of the ackFileRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckFileRequestHandle }
     *     
     */
    public SwFileOpRequestHandle setAckFileRequestHandle(SwAckFileRequestHandle value) {
        this.ackFileRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the notifyFileRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwNotifyFileRequestHandle }
     *     
     */
    public SwNotifyFileRequestHandle getNotifyFileRequestHandle() {
        return notifyFileRequestHandle;
    }

    /**
     * Sets the value of the notifyFileRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwNotifyFileRequestHandle }
     *     
     */
    public SwFileOpRequestHandle setNotifyFileRequestHandle(SwNotifyFileRequestHandle value) {
        this.notifyFileRequestHandle = value;
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
