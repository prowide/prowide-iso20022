
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
 * Java class for HSMManageKeysRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMManageKeysRequest", propOrder = {
    "actionCode",
    "targetHSM",
    "requestorUsername",
    "requestorPassword",
    "maxSOPEDKeyAttempts",
    "maxUserPEDKeyAttempts"
})
public class SwHSMManageKeysRequest {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "TargetHSM", required = true)
    protected String targetHSM;
    @XmlElement(name = "RequestorUsername", required = true)
    protected String requestorUsername;
    @XmlElement(name = "RequestorPassword", required = true)
    protected String requestorPassword;
    @XmlElement(name = "MaxSOPEDKeyAttempts", required = true)
    protected String maxSOPEDKeyAttempts;
    @XmlElement(name = "MaxUserPEDKeyAttempts")
    protected String maxUserPEDKeyAttempts;

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
    public SwHSMManageKeysRequest setActionCode(String value) {
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
    public SwHSMManageKeysRequest setTargetHSM(String value) {
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
    public SwHSMManageKeysRequest setRequestorUsername(String value) {
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
    public SwHSMManageKeysRequest setRequestorPassword(String value) {
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
    public SwHSMManageKeysRequest setMaxSOPEDKeyAttempts(String value) {
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
    public SwHSMManageKeysRequest setMaxUserPEDKeyAttempts(String value) {
        this.maxUserPEDKeyAttempts = value;
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
