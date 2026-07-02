
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
 * Java class for HSMRemotePEDStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMRemotePEDStatus", propOrder = {
    "snlProxyAddress",
    "hsmHostIP",
    "registerTime",
    "connectTime",
    "workstationAddress",
    "lastActivityTime",
    "connectionStatusCode",
    "connectionReasonCode",
    "registerDuration",
    "connectDuration",
    "activityDuration"
})
public class SwHSMRemotePEDStatus {

    @XmlElement(name = "SNLProxyAddress")
    protected String snlProxyAddress;
    @XmlElement(name = "HSMHostIP", required = true)
    protected String hsmHostIP;
    @XmlElement(name = "RegisterTime")
    protected String registerTime;
    @XmlElement(name = "ConnectTime")
    protected String connectTime;
    @XmlElement(name = "WorkstationAddress")
    protected String workstationAddress;
    @XmlElement(name = "LastActivityTime")
    protected String lastActivityTime;
    @XmlElement(name = "ConnectionStatusCode", required = true)
    protected String connectionStatusCode;
    @XmlElement(name = "ConnectionReasonCode")
    protected String connectionReasonCode;
    @XmlElement(name = "RegisterDuration")
    protected String registerDuration;
    @XmlElement(name = "ConnectDuration")
    protected String connectDuration;
    @XmlElement(name = "ActivityDuration")
    protected String activityDuration;

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
    public SwHSMRemotePEDStatus setSNLProxyAddress(String value) {
        this.snlProxyAddress = value;
        return this;
    }

    /**
     * Gets the value of the hsmHostIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMHostIP() {
        return hsmHostIP;
    }

    /**
     * Sets the value of the hsmHostIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setHSMHostIP(String value) {
        this.hsmHostIP = value;
        return this;
    }

    /**
     * Gets the value of the registerTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * Sets the value of the registerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setRegisterTime(String value) {
        this.registerTime = value;
        return this;
    }

    /**
     * Gets the value of the connectTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectTime() {
        return connectTime;
    }

    /**
     * Sets the value of the connectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setConnectTime(String value) {
        this.connectTime = value;
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
    public SwHSMRemotePEDStatus setWorkstationAddress(String value) {
        this.workstationAddress = value;
        return this;
    }

    /**
     * Gets the value of the lastActivityTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivityTime() {
        return lastActivityTime;
    }

    /**
     * Sets the value of the lastActivityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setLastActivityTime(String value) {
        this.lastActivityTime = value;
        return this;
    }

    /**
     * Gets the value of the connectionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionStatusCode() {
        return connectionStatusCode;
    }

    /**
     * Sets the value of the connectionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setConnectionStatusCode(String value) {
        this.connectionStatusCode = value;
        return this;
    }

    /**
     * Gets the value of the connectionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReasonCode() {
        return connectionReasonCode;
    }

    /**
     * Sets the value of the connectionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setConnectionReasonCode(String value) {
        this.connectionReasonCode = value;
        return this;
    }

    /**
     * Gets the value of the registerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDuration() {
        return registerDuration;
    }

    /**
     * Sets the value of the registerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setRegisterDuration(String value) {
        this.registerDuration = value;
        return this;
    }

    /**
     * Gets the value of the connectDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectDuration() {
        return connectDuration;
    }

    /**
     * Sets the value of the connectDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setConnectDuration(String value) {
        this.connectDuration = value;
        return this;
    }

    /**
     * Gets the value of the activityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityDuration() {
        return activityDuration;
    }

    /**
     * Sets the value of the activityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMRemotePEDStatus setActivityDuration(String value) {
        this.activityDuration = value;
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
