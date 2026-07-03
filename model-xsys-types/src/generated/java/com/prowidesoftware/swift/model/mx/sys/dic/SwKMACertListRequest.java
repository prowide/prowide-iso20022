
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
 * Java class for KMACertListRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KMACertListRequest", propOrder = {
    "fileName",
    "certLocation",
    "requiredInfo",
    "errorHandling",
    "pageSize",
    "pageToken"
})
public class SwKMACertListRequest {

    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "CertLocation")
    protected String certLocation;
    @XmlElement(name = "RequiredInfo")
    protected String requiredInfo;
    @XmlElement(name = "ErrorHandling")
    protected String errorHandling;
    @XmlElement(name = "PageSize")
    protected String pageSize;
    @XmlElement(name = "PageToken")
    protected String pageToken;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListRequest setFileName(String value) {
        this.fileName = value;
        return this;
    }

    /**
     * Gets the value of the certLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertLocation() {
        return certLocation;
    }

    /**
     * Sets the value of the certLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListRequest setCertLocation(String value) {
        this.certLocation = value;
        return this;
    }

    /**
     * Gets the value of the requiredInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredInfo() {
        return requiredInfo;
    }

    /**
     * Sets the value of the requiredInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListRequest setRequiredInfo(String value) {
        this.requiredInfo = value;
        return this;
    }

    /**
     * Gets the value of the errorHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorHandling() {
        return errorHandling;
    }

    /**
     * Sets the value of the errorHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListRequest setErrorHandling(String value) {
        this.errorHandling = value;
        return this;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListRequest setPageSize(String value) {
        this.pageSize = value;
        return this;
    }

    /**
     * Gets the value of the pageToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * Sets the value of the pageToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwKMACertListRequest setPageToken(String value) {
        this.pageToken = value;
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
