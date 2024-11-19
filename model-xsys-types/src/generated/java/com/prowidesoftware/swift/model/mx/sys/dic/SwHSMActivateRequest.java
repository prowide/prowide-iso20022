
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
 * Java class for HSMActivateRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMActivateRequest", propOrder = {
    "actionCode",
    "targetHSM",
    "requestorUsername",
    "requestorPassword",
    "maxUserPEDKeyAttempts"
})
public class SwHSMActivateRequest {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "TargetHSM", required = true)
    protected String targetHSM;
    @XmlElement(name = "RequestorUsername", required = true)
    protected String requestorUsername;
    @XmlElement(name = "RequestorPassword", required = true)
    protected String requestorPassword;
    @XmlElement(name = "MaxUserPEDKeyAttempts", required = true)
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
    public SwHSMActivateRequest setActionCode(String value) {
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
    public SwHSMActivateRequest setTargetHSM(String value) {
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
    public SwHSMActivateRequest setRequestorUsername(String value) {
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
    public SwHSMActivateRequest setRequestorPassword(String value) {
        this.requestorPassword = value;
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
    public SwHSMActivateRequest setMaxUserPEDKeyAttempts(String value) {
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
