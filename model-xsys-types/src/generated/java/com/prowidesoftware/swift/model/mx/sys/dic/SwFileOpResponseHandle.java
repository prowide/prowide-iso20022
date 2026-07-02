
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
 * Java class for FileOpResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileOpResponseHandle", propOrder = {
    "putFileResponseHandle",
    "getFileResponseHandle",
    "ackFileResponseHandle"
})
public class SwFileOpResponseHandle {

    @XmlElement(name = "PutFileResponseHandle")
    protected SwPutFileResponseHandle putFileResponseHandle;
    @XmlElement(name = "GetFileResponseHandle")
    protected SwGetFileResponseHandle getFileResponseHandle;
    @XmlElement(name = "AckFileResponseHandle")
    protected SwAckFileResponseHandle ackFileResponseHandle;

    /**
     * Gets the value of the putFileResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwPutFileResponseHandle }
     *     
     */
    public SwPutFileResponseHandle getPutFileResponseHandle() {
        return putFileResponseHandle;
    }

    /**
     * Sets the value of the putFileResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwPutFileResponseHandle }
     *     
     */
    public SwFileOpResponseHandle setPutFileResponseHandle(SwPutFileResponseHandle value) {
        this.putFileResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the getFileResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwGetFileResponseHandle }
     *     
     */
    public SwGetFileResponseHandle getGetFileResponseHandle() {
        return getFileResponseHandle;
    }

    /**
     * Sets the value of the getFileResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwGetFileResponseHandle }
     *     
     */
    public SwFileOpResponseHandle setGetFileResponseHandle(SwGetFileResponseHandle value) {
        this.getFileResponseHandle = value;
        return this;
    }

    /**
     * Gets the value of the ackFileResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwAckFileResponseHandle }
     *     
     */
    public SwAckFileResponseHandle getAckFileResponseHandle() {
        return ackFileResponseHandle;
    }

    /**
     * Sets the value of the ackFileResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAckFileResponseHandle }
     *     
     */
    public SwFileOpResponseHandle setAckFileResponseHandle(SwAckFileResponseHandle value) {
        this.ackFileResponseHandle = value;
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
