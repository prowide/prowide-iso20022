
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
 * Java class for HSMManagePartitionsRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMManagePartitionsRequest", propOrder = {
    "actionCode",
    "targetHSM",
    "requestorUsername",
    "requestorPassword",
    "maxSOPEDKeyAttempts",
    "maxUserPEDKeyAttempts",
    "partitionName"
})
public class SwHSMManagePartitionsRequest {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "TargetHSM", required = true)
    protected String targetHSM;
    @XmlElement(name = "RequestorUsername")
    protected String requestorUsername;
    @XmlElement(name = "RequestorPassword")
    protected String requestorPassword;
    @XmlElement(name = "MaxSOPEDKeyAttempts")
    protected String maxSOPEDKeyAttempts;
    @XmlElement(name = "MaxUserPEDKeyAttempts")
    protected String maxUserPEDKeyAttempts;
    @XmlElement(name = "PartitionName")
    protected String partitionName;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setActionCode(String value) {
        this.actionCode = value;
        return this;
    }

    /**
     * Gets the value of the targetHSM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetHSM() {
        return targetHSM;
    }

    /**
     * Sets the value of the targetHSM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setTargetHSM(String value) {
        this.targetHSM = value;
        return this;
    }

    /**
     * Gets the value of the requestorUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorUsername() {
        return requestorUsername;
    }

    /**
     * Sets the value of the requestorUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setRequestorUsername(String value) {
        this.requestorUsername = value;
        return this;
    }

    /**
     * Gets the value of the requestorPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorPassword() {
        return requestorPassword;
    }

    /**
     * Sets the value of the requestorPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setRequestorPassword(String value) {
        this.requestorPassword = value;
        return this;
    }

    /**
     * Gets the value of the maxSOPEDKeyAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSOPEDKeyAttempts() {
        return maxSOPEDKeyAttempts;
    }

    /**
     * Sets the value of the maxSOPEDKeyAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setMaxSOPEDKeyAttempts(String value) {
        this.maxSOPEDKeyAttempts = value;
        return this;
    }

    /**
     * Gets the value of the maxUserPEDKeyAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxUserPEDKeyAttempts() {
        return maxUserPEDKeyAttempts;
    }

    /**
     * Sets the value of the maxUserPEDKeyAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setMaxUserPEDKeyAttempts(String value) {
        this.maxUserPEDKeyAttempts = value;
        return this;
    }

    /**
     * Gets the value of the partitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Sets the value of the partitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManagePartitionsRequest setPartitionName(String value) {
        this.partitionName = value;
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
