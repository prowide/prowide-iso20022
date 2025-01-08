
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
 * Java class for SMAGetStatusRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMAGetStatusRequest", propOrder = {
    "instanceName",
    "subSystemList",
    "subSystemGroupList",
    "heartbeatIndicator",
    "connectionIndicator",
    "versionIndicator",
    "hsmIndicator",
    "hsmRequiredInfo"
})
public class SwSMAGetStatusRequest {

    @XmlElement(name = "InstanceName")
    protected String instanceName;
    @XmlElement(name = "SubSystemList")
    protected SwSubSystemList subSystemList;
    @XmlElement(name = "SubSystemGroupList")
    protected SwSubSystemGroupList subSystemGroupList;
    @XmlElement(name = "HeartbeatIndicator")
    protected String heartbeatIndicator;
    @XmlElement(name = "ConnectionIndicator")
    protected String connectionIndicator;
    @XmlElement(name = "VersionIndicator")
    protected String versionIndicator;
    @XmlElement(name = "HSMIndicator")
    protected String hsmIndicator;
    @XmlElement(name = "HSMRequiredInfo")
    protected String hsmRequiredInfo;

    /**
     * Gets the value of the instanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Sets the value of the instanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSMAGetStatusRequest setInstanceName(String value) {
        this.instanceName = value;
        return this;
    }

    /**
     * Gets the value of the subSystemList property.
     * 
     * @return
     *     possible object is
     *     {@link SwSubSystemList }
     *     
     */
    public SwSubSystemList getSubSystemList() {
        return subSystemList;
    }

    /**
     * Sets the value of the subSystemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSubSystemList }
     *     
     */
    public SwSMAGetStatusRequest setSubSystemList(SwSubSystemList value) {
        this.subSystemList = value;
        return this;
    }

    /**
     * Gets the value of the subSystemGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link SwSubSystemGroupList }
     *     
     */
    public SwSubSystemGroupList getSubSystemGroupList() {
        return subSystemGroupList;
    }

    /**
     * Sets the value of the subSystemGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSubSystemGroupList }
     *     
     */
    public SwSMAGetStatusRequest setSubSystemGroupList(SwSubSystemGroupList value) {
        this.subSystemGroupList = value;
        return this;
    }

    /**
     * Gets the value of the heartbeatIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeartbeatIndicator() {
        return heartbeatIndicator;
    }

    /**
     * Sets the value of the heartbeatIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSMAGetStatusRequest setHeartbeatIndicator(String value) {
        this.heartbeatIndicator = value;
        return this;
    }

    /**
     * Gets the value of the connectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionIndicator() {
        return connectionIndicator;
    }

    /**
     * Sets the value of the connectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSMAGetStatusRequest setConnectionIndicator(String value) {
        this.connectionIndicator = value;
        return this;
    }

    /**
     * Gets the value of the versionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionIndicator() {
        return versionIndicator;
    }

    /**
     * Sets the value of the versionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSMAGetStatusRequest setVersionIndicator(String value) {
        this.versionIndicator = value;
        return this;
    }

    /**
     * Gets the value of the hsmIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMIndicator() {
        return hsmIndicator;
    }

    /**
     * Sets the value of the hsmIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSMAGetStatusRequest setHSMIndicator(String value) {
        this.hsmIndicator = value;
        return this;
    }

    /**
     * Gets the value of the hsmRequiredInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMRequiredInfo() {
        return hsmRequiredInfo;
    }

    /**
     * Sets the value of the hsmRequiredInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSMAGetStatusRequest setHSMRequiredInfo(String value) {
        this.hsmRequiredInfo = value;
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
