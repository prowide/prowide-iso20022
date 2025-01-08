
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
 * Java class for SMACommandResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMACommandResponse", propOrder = {
    "hsmManageUsersResponse",
    "hsmManageKeysResponse",
    "hsmManagePartitionsResponse",
    "hsmActivateResponse",
    "hsmSelfTestResponse",
    "hsmShowPartitionResponse",
    "hsmRemotePEDResponse",
    "hsmGetClusterListResponse",
    "status"
})
public class SwSMACommandResponse {

    @XmlElement(name = "HSMManageUsersResponse")
    protected SwHSMManageUsersResponse hsmManageUsersResponse;
    @XmlElement(name = "HSMManageKeysResponse")
    protected SwHSMManageKeysResponse hsmManageKeysResponse;
    @XmlElement(name = "HSMManagePartitionsResponse")
    protected SwHSMManagePartitionsResponse hsmManagePartitionsResponse;
    @XmlElement(name = "HSMActivateResponse")
    protected SwHSMActivateResponse hsmActivateResponse;
    @XmlElement(name = "HSMSelfTestResponse")
    protected SwHSMSelfTestResponse hsmSelfTestResponse;
    @XmlElement(name = "HSMShowPartitionResponse")
    protected SwHSMShowPartitionResponse hsmShowPartitionResponse;
    @XmlElement(name = "HSMRemotePEDResponse")
    protected SwHSMRemotePEDResponse hsmRemotePEDResponse;
    @XmlElement(name = "HSMGetClusterListResponse")
    protected SwHSMGetClusterListResponse hsmGetClusterListResponse;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the hsmManageUsersResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMManageUsersResponse }
     *     
     */
    public SwHSMManageUsersResponse getHSMManageUsersResponse() {
        return hsmManageUsersResponse;
    }

    /**
     * Sets the value of the hsmManageUsersResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMManageUsersResponse }
     *     
     */
    public SwSMACommandResponse setHSMManageUsersResponse(SwHSMManageUsersResponse value) {
        this.hsmManageUsersResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmManageKeysResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMManageKeysResponse }
     *     
     */
    public SwHSMManageKeysResponse getHSMManageKeysResponse() {
        return hsmManageKeysResponse;
    }

    /**
     * Sets the value of the hsmManageKeysResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMManageKeysResponse }
     *     
     */
    public SwSMACommandResponse setHSMManageKeysResponse(SwHSMManageKeysResponse value) {
        this.hsmManageKeysResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmManagePartitionsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMManagePartitionsResponse }
     *     
     */
    public SwHSMManagePartitionsResponse getHSMManagePartitionsResponse() {
        return hsmManagePartitionsResponse;
    }

    /**
     * Sets the value of the hsmManagePartitionsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMManagePartitionsResponse }
     *     
     */
    public SwSMACommandResponse setHSMManagePartitionsResponse(SwHSMManagePartitionsResponse value) {
        this.hsmManagePartitionsResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmActivateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMActivateResponse }
     *     
     */
    public SwHSMActivateResponse getHSMActivateResponse() {
        return hsmActivateResponse;
    }

    /**
     * Sets the value of the hsmActivateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMActivateResponse }
     *     
     */
    public SwSMACommandResponse setHSMActivateResponse(SwHSMActivateResponse value) {
        this.hsmActivateResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmSelfTestResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMSelfTestResponse }
     *     
     */
    public SwHSMSelfTestResponse getHSMSelfTestResponse() {
        return hsmSelfTestResponse;
    }

    /**
     * Sets the value of the hsmSelfTestResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMSelfTestResponse }
     *     
     */
    public SwSMACommandResponse setHSMSelfTestResponse(SwHSMSelfTestResponse value) {
        this.hsmSelfTestResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmShowPartitionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMShowPartitionResponse }
     *     
     */
    public SwHSMShowPartitionResponse getHSMShowPartitionResponse() {
        return hsmShowPartitionResponse;
    }

    /**
     * Sets the value of the hsmShowPartitionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMShowPartitionResponse }
     *     
     */
    public SwSMACommandResponse setHSMShowPartitionResponse(SwHSMShowPartitionResponse value) {
        this.hsmShowPartitionResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmRemotePEDResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMRemotePEDResponse }
     *     
     */
    public SwHSMRemotePEDResponse getHSMRemotePEDResponse() {
        return hsmRemotePEDResponse;
    }

    /**
     * Sets the value of the hsmRemotePEDResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMRemotePEDResponse }
     *     
     */
    public SwSMACommandResponse setHSMRemotePEDResponse(SwHSMRemotePEDResponse value) {
        this.hsmRemotePEDResponse = value;
        return this;
    }

    /**
     * Gets the value of the hsmGetClusterListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMGetClusterListResponse }
     *     
     */
    public SwHSMGetClusterListResponse getHSMGetClusterListResponse() {
        return hsmGetClusterListResponse;
    }

    /**
     * Sets the value of the hsmGetClusterListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMGetClusterListResponse }
     *     
     */
    public SwSMACommandResponse setHSMGetClusterListResponse(SwHSMGetClusterListResponse value) {
        this.hsmGetClusterListResponse = value;
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
    public SwSMACommandResponse setStatus(SwGblStatus value) {
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
