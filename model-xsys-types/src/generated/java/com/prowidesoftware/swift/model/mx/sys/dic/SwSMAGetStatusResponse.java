
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SMAGetStatusResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMAGetStatusResponse", propOrder = {
    "subSystems",
    "lastHeartbeat",
    "connectivity",
    "snlVersion",
    "hsMs",
    "status"
})
public class SwSMAGetStatusResponse {

    @XmlElement(name = "SubSystems")
    protected SwSubSystems subSystems;
    @XmlElement(name = "LastHeartbeat")
    protected List<SwLastHeartbeat> lastHeartbeat;
    @XmlElement(name = "Connectivity")
    protected SwConnectivity connectivity;
    @XmlElement(name = "SNLVersion")
    protected SwSNLVersion snlVersion;
    @XmlElement(name = "HSMs")
    protected SwHSMStatusList hsMs;
    @XmlElement(name = "Status", namespace = "urn:swift:snl:ns.SwGbl")
    protected SwGblStatus status;

    /**
     * Gets the value of the subSystems property.
     * 
     * @return
     *     possible object is
     *     {@link SwSubSystems }
     *     
     */
    public SwSubSystems getSubSystems() {
        return subSystems;
    }

    /**
     * Sets the value of the subSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSubSystems }
     *     
     */
    public SwSMAGetStatusResponse setSubSystems(SwSubSystems value) {
        this.subSystems = value;
        return this;
    }

    /**
     * Gets the value of the lastHeartbeat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastHeartbeat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastHeartbeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwLastHeartbeat }
     * 
     * 
     */
    public List<SwLastHeartbeat> getLastHeartbeat() {
        if (lastHeartbeat == null) {
            lastHeartbeat = new ArrayList<SwLastHeartbeat>();
        }
        return this.lastHeartbeat;
    }

    /**
     * Gets the value of the connectivity property.
     * 
     * @return
     *     possible object is
     *     {@link SwConnectivity }
     *     
     */
    public SwConnectivity getConnectivity() {
        return connectivity;
    }

    /**
     * Sets the value of the connectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwConnectivity }
     *     
     */
    public SwSMAGetStatusResponse setConnectivity(SwConnectivity value) {
        this.connectivity = value;
        return this;
    }

    /**
     * Gets the value of the snlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SwSNLVersion }
     *     
     */
    public SwSNLVersion getSNLVersion() {
        return snlVersion;
    }

    /**
     * Sets the value of the snlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSNLVersion }
     *     
     */
    public SwSMAGetStatusResponse setSNLVersion(SwSNLVersion value) {
        this.snlVersion = value;
        return this;
    }

    /**
     * Gets the value of the hsMs property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMStatusList }
     *     
     */
    public SwHSMStatusList getHSMs() {
        return hsMs;
    }

    /**
     * Sets the value of the hsMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMStatusList }
     *     
     */
    public SwSMAGetStatusResponse setHSMs(SwHSMStatusList value) {
        this.hsMs = value;
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
    public SwSMAGetStatusResponse setStatus(SwGblStatus value) {
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

    /**
     * Adds a new item to the lastHeartbeat list.
     * @see #getLastHeartbeat()
     * 
     */
    public SwSMAGetStatusResponse addLastHeartbeat(SwLastHeartbeat lastHeartbeat) {
        getLastHeartbeat().add(lastHeartbeat);
        return this;
    }

}
