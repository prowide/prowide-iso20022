
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
 * Java class for LastHeartbeat complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastHeartbeat", propOrder = {
    "lastHeartbeatStatus",
    "sendTime",
    "ackTime",
    "zoneName"
})
public class SwLastHeartbeat {

    @XmlElement(name = "LastHeartbeatStatus", required = true)
    protected String lastHeartbeatStatus;
    @XmlElement(name = "SendTime")
    protected String sendTime;
    @XmlElement(name = "AckTime")
    protected String ackTime;
    @XmlElement(name = "ZoneName")
    protected String zoneName;

    /**
     * Gets the value of the lastHeartbeatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastHeartbeatStatus() {
        return lastHeartbeatStatus;
    }

    /**
     * Sets the value of the lastHeartbeatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwLastHeartbeat setLastHeartbeatStatus(String value) {
        this.lastHeartbeatStatus = value;
        return this;
    }

    /**
     * Gets the value of the sendTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * Sets the value of the sendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwLastHeartbeat setSendTime(String value) {
        this.sendTime = value;
        return this;
    }

    /**
     * Gets the value of the ackTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckTime() {
        return ackTime;
    }

    /**
     * Sets the value of the ackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwLastHeartbeat setAckTime(String value) {
        this.ackTime = value;
        return this;
    }

    /**
     * Gets the value of the zoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * Sets the value of the zoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwLastHeartbeat setZoneName(String value) {
        this.zoneName = value;
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
