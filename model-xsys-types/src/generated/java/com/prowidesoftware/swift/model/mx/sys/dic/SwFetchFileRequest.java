
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
 * Java class for FetchFileRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchFileRequest", propOrder = {
    "authorisationContext",
    "eventEP",
    "transferEP",
    "partition",
    "transferKey",
    "localRef",
    "productList",
    "fileRequestHandle",
    "physicalName",
    "transferEPVerifier"
})
public class SwFetchFileRequest {

    @XmlElement(name = "AuthorisationContext", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected SwSecSecurityContext authorisationContext;
    @XmlElement(name = "EventEP")
    protected String eventEP;
    @XmlElement(name = "TransferEP")
    protected String transferEP;
    @XmlElement(name = "Partition")
    protected String partition;
    @XmlElement(name = "TransferKey")
    protected String transferKey;
    @XmlElement(name = "LocalRef")
    protected String localRef;
    @XmlElement(name = "ProductList")
    protected SwProductList productList;
    @XmlElement(name = "FileRequestHandle", required = true)
    protected SwFileRequestHandle fileRequestHandle;
    @XmlElement(name = "PhysicalName", required = true)
    protected String physicalName;
    @XmlElement(name = "TransferEPVerifier")
    protected String transferEPVerifier;

    /**
     * Gets the value of the authorisationContext property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSecurityContext }
     *     
     */
    public SwSecSecurityContext getAuthorisationContext() {
        return authorisationContext;
    }

    /**
     * Sets the value of the authorisationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSecurityContext }
     *     
     */
    public SwFetchFileRequest setAuthorisationContext(SwSecSecurityContext value) {
        this.authorisationContext = value;
        return this;
    }

    /**
     * Gets the value of the eventEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventEP() {
        return eventEP;
    }

    /**
     * Sets the value of the eventEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFetchFileRequest setEventEP(String value) {
        this.eventEP = value;
        return this;
    }

    /**
     * Gets the value of the transferEP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEP() {
        return transferEP;
    }

    /**
     * Sets the value of the transferEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFetchFileRequest setTransferEP(String value) {
        this.transferEP = value;
        return this;
    }

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
    public SwFetchFileRequest setPartition(String value) {
        this.partition = value;
        return this;
    }

    /**
     * Gets the value of the transferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferKey() {
        return transferKey;
    }

    /**
     * Sets the value of the transferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFetchFileRequest setTransferKey(String value) {
        this.transferKey = value;
        return this;
    }

    /**
     * Gets the value of the localRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRef() {
        return localRef;
    }

    /**
     * Sets the value of the localRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFetchFileRequest setLocalRef(String value) {
        this.localRef = value;
        return this;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link SwProductList }
     *     
     */
    public SwProductList getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwProductList }
     *     
     */
    public SwFetchFileRequest setProductList(SwProductList value) {
        this.productList = value;
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
    public SwFetchFileRequest setFileRequestHandle(SwFileRequestHandle value) {
        this.fileRequestHandle = value;
        return this;
    }

    /**
     * Gets the value of the physicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalName() {
        return physicalName;
    }

    /**
     * Sets the value of the physicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFetchFileRequest setPhysicalName(String value) {
        this.physicalName = value;
        return this;
    }

    /**
     * Gets the value of the transferEPVerifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferEPVerifier() {
        return transferEPVerifier;
    }

    /**
     * Sets the value of the transferEPVerifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFetchFileRequest setTransferEPVerifier(String value) {
        this.transferEPVerifier = value;
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
