
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
 * Java class for FileOpRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileOpRequest", propOrder = {
    "putFileRequest",
    "getFileRequest",
    "ackFileRequest"
})
public class SwFileOpRequest {

    @XmlElement(name = "PutFileRequest")
    protected SwPutFileRequest putFileRequest;
    @XmlElement(name = "GetFileRequest")
    protected SwGetFileRequest getFileRequest;
    @XmlElement(name = "AckFileRequest")
    protected SwAckFileRequest ackFileRequest;

    /**
     * Gets the value of the putFileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwPutFileRequest }
     *     
     */
    public SwPutFileRequest getPutFileRequest() {
        return putFileRequest;
    }

    /**
     * Sets the value of the putFileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwPutFileRequest }
     *     
     */
    public SwFileOpRequest setPutFileRequest(SwPutFileRequest value) {
        this.putFileRequest = value;
        return this;
    }

    /**
     * Gets the value of the getFileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwGetFileRequest }
     *     
     */
    public SwGetFileRequest getGetFileRequest() {
        return getFileRequest;
    }

    /**
     * Sets the value of the getFileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGetFileRequest }
     *     
     */
    public SwFileOpRequest setGetFileRequest(SwGetFileRequest value) {
        this.getFileRequest = value;
        return this;
    }

    /**
     * Gets the value of the ackFileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckFileRequest }
     *     
     */
    public SwAckFileRequest getAckFileRequest() {
        return ackFileRequest;
    }

    /**
     * Sets the value of the ackFileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckFileRequest }
     *     
     */
    public SwFileOpRequest setAckFileRequest(SwAckFileRequest value) {
        this.ackFileRequest = value;
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
