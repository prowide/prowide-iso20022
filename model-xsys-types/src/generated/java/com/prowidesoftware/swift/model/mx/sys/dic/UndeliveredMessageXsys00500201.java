
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
 * Java class for UndeliveredMessage complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndeliveredMessage", propOrder = {
    "snFRef",
    "snFInputTime",
    "fileRequestHeader",
    "requestHeader",
    "code",
    "origSnFRef",
    "recipientDN"
})
public class UndeliveredMessageXsys00500201 {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "SnFInputTime", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFInputTime;
    @XmlElement(name = "FileRequestHeader", namespace = "urn:swift:snl:ns.Sw")
    protected SwFileRequestHeader fileRequestHeader;
    @XmlElement(name = "RequestHeader", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "Code", namespace = "urn:swift:snl:ns.SwGbl")
    protected String code;
    @XmlElement(name = "OrigSnFRef", namespace = "urn:swift:snl:ns.Sw")
    protected String origSnFRef;
    @XmlElement(name = "RecipientDN", namespace = "urn:swift:snl:ns.Sw")
    protected String recipientDN;

    /**
     * SnFRef
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
    public UndeliveredMessageXsys00500201 setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * SnFInputTime
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
    public UndeliveredMessageXsys00500201 setSnFInputTime(String value) {
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
    public UndeliveredMessageXsys00500201 setFileRequestHeader(SwFileRequestHeader value) {
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
    public UndeliveredMessageXsys00500201 setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
        return this;
    }

    /**
     * Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndeliveredMessageXsys00500201 setCode(String value) {
        this.code = value;
        return this;
    }

    /**
     * OrigSnFRef
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSnFRef() {
        return origSnFRef;
    }

    /**
     * Sets the value of the origSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndeliveredMessageXsys00500201 setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

    /**
     * RecipientDN
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientDN() {
        return recipientDN;
    }

    /**
     * Sets the value of the recipientDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndeliveredMessageXsys00500201 setRecipientDN(String value) {
        this.recipientDN = value;
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
