
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
 * Java class for FileOpResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileOpResponse", propOrder = {
    "putFileResponse",
    "getFileResponse",
    "ackFileResponse",
    "notifyFileResponse"
})
public class SwFileOpResponse {

    @XmlElement(name = "PutFileResponse")
    protected SwPutFileResponse putFileResponse;
    @XmlElement(name = "GetFileResponse")
    protected SwGetFileResponse getFileResponse;
    @XmlElement(name = "AckFileResponse")
    protected SwAckFileResponse ackFileResponse;
    @XmlElement(name = "NotifyFileResponse")
    protected SwNotifyFileResponse notifyFileResponse;

    /**
     * Gets the value of the putFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwPutFileResponse }
     *     
     */
    public SwPutFileResponse getPutFileResponse() {
        return putFileResponse;
    }

    /**
     * Sets the value of the putFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwPutFileResponse }
     *     
     */
    public SwFileOpResponse setPutFileResponse(SwPutFileResponse value) {
        this.putFileResponse = value;
        return this;
    }

    /**
     * Gets the value of the getFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwGetFileResponse }
     *     
     */
    public SwGetFileResponse getGetFileResponse() {
        return getFileResponse;
    }

    /**
     * Sets the value of the getFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGetFileResponse }
     *     
     */
    public SwFileOpResponse setGetFileResponse(SwGetFileResponse value) {
        this.getFileResponse = value;
        return this;
    }

    /**
     * Gets the value of the ackFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckFileResponse }
     *     
     */
    public SwAckFileResponse getAckFileResponse() {
        return ackFileResponse;
    }

    /**
     * Sets the value of the ackFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckFileResponse }
     *     
     */
    public SwFileOpResponse setAckFileResponse(SwAckFileResponse value) {
        this.ackFileResponse = value;
        return this;
    }

    /**
     * Gets the value of the notifyFileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwNotifyFileResponse }
     *     
     */
    public SwNotifyFileResponse getNotifyFileResponse() {
        return notifyFileResponse;
    }

    /**
     * Sets the value of the notifyFileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwNotifyFileResponse }
     *     
     */
    public SwFileOpResponse setNotifyFileResponse(SwNotifyFileResponse value) {
        this.notifyFileResponse = value;
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
