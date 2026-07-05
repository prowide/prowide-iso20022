
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
 * Java class for HSMManageUsersRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMManageUsersRequest", propOrder = {
    "actionCode",
    "targetHSM",
    "requestorUsername",
    "requestorPassword",
    "targetUsername",
    "targetPassword",
    "targetRole"
})
public class SwHSMManageUsersRequest {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "TargetHSM", required = true)
    protected String targetHSM;
    @XmlElement(name = "RequestorUsername", required = true)
    protected String requestorUsername;
    @XmlElement(name = "RequestorPassword", required = true)
    protected String requestorPassword;
    @XmlElement(name = "TargetUsername")
    protected String targetUsername;
    @XmlElement(name = "TargetPassword")
    protected String targetPassword;
    @XmlElement(name = "TargetRole")
    protected String targetRole;

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
    public SwHSMManageUsersRequest setActionCode(String value) {
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
    public SwHSMManageUsersRequest setTargetHSM(String value) {
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
    public SwHSMManageUsersRequest setRequestorUsername(String value) {
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
    public SwHSMManageUsersRequest setRequestorPassword(String value) {
        this.requestorPassword = value;
        return this;
    }

    /**
     * Gets the value of the targetUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUsername() {
        return targetUsername;
    }

    /**
     * Sets the value of the targetUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManageUsersRequest setTargetUsername(String value) {
        this.targetUsername = value;
        return this;
    }

    /**
     * Gets the value of the targetPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPassword() {
        return targetPassword;
    }

    /**
     * Sets the value of the targetPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManageUsersRequest setTargetPassword(String value) {
        this.targetPassword = value;
        return this;
    }

    /**
     * Gets the value of the targetRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRole() {
        return targetRole;
    }

    /**
     * Sets the value of the targetRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMManageUsersRequest setTargetRole(String value) {
        this.targetRole = value;
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
