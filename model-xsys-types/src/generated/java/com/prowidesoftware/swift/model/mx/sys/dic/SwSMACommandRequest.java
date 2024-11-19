
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
 * Java class for SMACommandRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMACommandRequest", propOrder = {
    "hsmManageUsersRequest",
    "hsmManageKeysRequest",
    "hsmManagePartitionsRequest",
    "hsmActivateRequest",
    "hsmSelfTestRequest",
    "hsmShowPartitionRequest",
    "hsmRemotePEDRequest",
    "hsmGetClusterListRequest"
})
public class SwSMACommandRequest {

    @XmlElement(name = "HSMManageUsersRequest")
    protected SwHSMManageUsersRequest hsmManageUsersRequest;
    @XmlElement(name = "HSMManageKeysRequest")
    protected SwHSMManageKeysRequest hsmManageKeysRequest;
    @XmlElement(name = "HSMManagePartitionsRequest")
    protected SwHSMManagePartitionsRequest hsmManagePartitionsRequest;
    @XmlElement(name = "HSMActivateRequest")
    protected SwHSMActivateRequest hsmActivateRequest;
    @XmlElement(name = "HSMSelfTestRequest")
    protected SwHSMSelfTestRequest hsmSelfTestRequest;
    @XmlElement(name = "HSMShowPartitionRequest")
    protected SwHSMShowPartitionRequest hsmShowPartitionRequest;
    @XmlElement(name = "HSMRemotePEDRequest")
    protected SwHSMRemotePEDRequest hsmRemotePEDRequest;
    @XmlElement(name = "HSMGetClusterListRequest")
    protected SwHSMGetClusterListRequest hsmGetClusterListRequest;

    /**
     * Gets the value of the hsmManageUsersRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMManageUsersRequest }
     *     
     */
    public SwHSMManageUsersRequest getHSMManageUsersRequest() {
        return hsmManageUsersRequest;
    }

    /**
     * Sets the value of the hsmManageUsersRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMManageUsersRequest }
     *     
     */
    public SwSMACommandRequest setHSMManageUsersRequest(SwHSMManageUsersRequest value) {
        this.hsmManageUsersRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmManageKeysRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMManageKeysRequest }
     *     
     */
    public SwHSMManageKeysRequest getHSMManageKeysRequest() {
        return hsmManageKeysRequest;
    }

    /**
     * Sets the value of the hsmManageKeysRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMManageKeysRequest }
     *     
     */
    public SwSMACommandRequest setHSMManageKeysRequest(SwHSMManageKeysRequest value) {
        this.hsmManageKeysRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmManagePartitionsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMManagePartitionsRequest }
     *     
     */
    public SwHSMManagePartitionsRequest getHSMManagePartitionsRequest() {
        return hsmManagePartitionsRequest;
    }

    /**
     * Sets the value of the hsmManagePartitionsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMManagePartitionsRequest }
     *     
     */
    public SwSMACommandRequest setHSMManagePartitionsRequest(SwHSMManagePartitionsRequest value) {
        this.hsmManagePartitionsRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmActivateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMActivateRequest }
     *     
     */
    public SwHSMActivateRequest getHSMActivateRequest() {
        return hsmActivateRequest;
    }

    /**
     * Sets the value of the hsmActivateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMActivateRequest }
     *     
     */
    public SwSMACommandRequest setHSMActivateRequest(SwHSMActivateRequest value) {
        this.hsmActivateRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmSelfTestRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMSelfTestRequest }
     *     
     */
    public SwHSMSelfTestRequest getHSMSelfTestRequest() {
        return hsmSelfTestRequest;
    }

    /**
     * Sets the value of the hsmSelfTestRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMSelfTestRequest }
     *     
     */
    public SwSMACommandRequest setHSMSelfTestRequest(SwHSMSelfTestRequest value) {
        this.hsmSelfTestRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmShowPartitionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMShowPartitionRequest }
     *     
     */
    public SwHSMShowPartitionRequest getHSMShowPartitionRequest() {
        return hsmShowPartitionRequest;
    }

    /**
     * Sets the value of the hsmShowPartitionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMShowPartitionRequest }
     *     
     */
    public SwSMACommandRequest setHSMShowPartitionRequest(SwHSMShowPartitionRequest value) {
        this.hsmShowPartitionRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmRemotePEDRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMRemotePEDRequest }
     *     
     */
    public SwHSMRemotePEDRequest getHSMRemotePEDRequest() {
        return hsmRemotePEDRequest;
    }

    /**
     * Sets the value of the hsmRemotePEDRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMRemotePEDRequest }
     *     
     */
    public SwSMACommandRequest setHSMRemotePEDRequest(SwHSMRemotePEDRequest value) {
        this.hsmRemotePEDRequest = value;
        return this;
    }

    /**
     * Gets the value of the hsmGetClusterListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMGetClusterListRequest }
     *     
     */
    public SwHSMGetClusterListRequest getHSMGetClusterListRequest() {
        return hsmGetClusterListRequest;
    }

    /**
     * Sets the value of the hsmGetClusterListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMGetClusterListRequest }
     *     
     */
    public SwSMACommandRequest setHSMGetClusterListRequest(SwHSMGetClusterListRequest value) {
        this.hsmGetClusterListRequest = value;
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
