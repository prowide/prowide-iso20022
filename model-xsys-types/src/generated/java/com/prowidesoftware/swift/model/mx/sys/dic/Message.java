
package com.prowidesoftware.swift.model.mx.sys.dic;

import com.prowidesoftware.swift.model.mx.sys.dic.SwFileRequestHeader;
import com.prowidesoftware.swift.model.mx.sys.dic.SwIntRequestHeader;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for Message complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "snFRef",
    "snFRefType",
    "snFInputTime",
    "fileRequestHeader",
    "requestHeader"
})
public class Message {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "SnFRefType", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRefType;
    @XmlElement(name = "SnFInputTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFInputTime;
    @XmlElement(name = "FileRequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "RequestHeader", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntRequestHeader requestHeader;

    /**
     * StoreAndForwardReference
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Message setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * StoreAndForwardReferenceType
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRefType() {
        return snFRefType;
    }

    /**
     * Sets the value of the snFRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Message setSnFRefType(String value) {
        this.snFRefType = value;
        return this;
    }

    /**
     * StoreAndForwardInputTime
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFInputTime() {
        return snFInputTime;
    }

    /**
     * Sets the value of the snFInputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Message setSnFInputTime(String value) {
        this.snFInputTime = value;
        return this;
    }

    /**
     * FileRequestHeader
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
    public Message setFileRequestHeader(SwFileRequestHeader value) {
        this.fileRequestHeader = value;
        return this;
    }

    /**
     * RequestHeader
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public SwIntRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public Message setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
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
