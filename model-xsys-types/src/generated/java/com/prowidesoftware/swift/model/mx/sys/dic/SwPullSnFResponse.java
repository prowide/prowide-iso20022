
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
 * Java class for PullSnFResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PullSnFResponse", propOrder = {
    "requestHandle",
    "fileRequestHandle",
    "snFRequestHandle",
    "status"
})
public class SwPullSnFResponse {

    @XmlElement(name = "RequestHandle", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntRequestHandle requestHandle;
    @XmlElement(name = "FileRequestHandle")
    protected SwFileRequestHandle fileRequestHandle;
    @XmlElement(name = "SnFRequestHandle")
    protected SwSnFRequestHandle snFRequestHandle;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the requestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestHandle }
     *     
     */
    public SwIntRequestHandle getRequestHandle() {
        return requestHandle;
    }

    /**
     * Sets the value of the requestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestHandle }
     *     
     */
    public SwPullSnFResponse setRequestHandle(SwIntRequestHandle value) {
        this.requestHandle = value;
        return this;
    }

    /**
     * Gets the value of the fileRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwFileRequestHandle }
     *     
     */
    public SwFileRequestHandle getFileRequestHandle() {
        return fileRequestHandle;
    }

    /**
     * Sets the value of the fileRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwFileRequestHandle }
     *     
     */
    public SwPullSnFResponse setFileRequestHandle(SwFileRequestHandle value) {
        this.fileRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the snFRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFRequestHandle }
     *     
     */
    public SwSnFRequestHandle getSnFRequestHandle() {
        return snFRequestHandle;
    }

    /**
     * Sets the value of the snFRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFRequestHandle }
     *     
     */
    public SwPullSnFResponse setSnFRequestHandle(SwSnFRequestHandle value) {
        this.snFRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SwGblStatus }
     *     
     */
    public SwGblStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGblStatus }
     *     
     */
    public SwPullSnFResponse setStatus(SwGblStatus value) {
        this.status = value;
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
