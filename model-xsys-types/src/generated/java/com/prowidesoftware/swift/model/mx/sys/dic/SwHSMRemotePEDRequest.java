
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
 * Java class for HSMRemotePEDRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMRemotePEDRequest", propOrder = {
    "actionCode",
    "targetHSM",
    "requestorUsername",
    "requestorPassword",
    "workstationAddress",
    "snlProxyAddress"
})
public class SwHSMRemotePEDRequest {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "TargetHSM", required = true)
    protected String targetHSM;
    @XmlElement(name = "RequestorUsername")
    protected String requestorUsername;
    @XmlElement(name = "RequestorPassword")
    protected String requestorPassword;
    @XmlElement(name = "WorkstationAddress")
    protected String workstationAddress;
    @XmlElement(name = "SNLProxyAddress")
    protected String snlProxyAddress;

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
    public SwHSMRemotePEDRequest setActionCode(String value) {
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
    public SwHSMRemotePEDRequest setTargetHSM(String value) {
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
    public SwHSMRemotePEDRequest setRequestorUsername(String value) {
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
    public SwHSMRemotePEDRequest setRequestorPassword(String value) {
        this.requestorPassword = value;
        return this;
    }

    /**
     * Gets the value of the workstationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationAddress() {
        return workstationAddress;
    }

    /**
     * Sets the value of the workstationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDRequest setWorkstationAddress(String value) {
        this.workstationAddress = value;
        return this;
    }

    /**
     * Gets the value of the snlProxyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLProxyAddress() {
        return snlProxyAddress;
    }

    /**
     * Sets the value of the snlProxyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDRequest setSNLProxyAddress(String value) {
        this.snlProxyAddress = value;
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
