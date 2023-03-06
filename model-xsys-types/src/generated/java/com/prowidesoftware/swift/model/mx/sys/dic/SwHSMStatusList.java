
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
 * Java class for HSMStatusList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMStatusList", propOrder = {
    "overallStatus",
    "hsmStatus",
    "hsmTokenStatus"
})
public class SwHSMStatusList {

    @XmlElement(name = "OverallStatus", required = true)
    protected String overallStatus;
    @XmlElement(name = "HSMStatus")
    protected List<SwHSMStatus> hsmStatus;
    @XmlElement(name = "HSMTokenStatus")
    protected List<SwHSMTokenStatus> hsmTokenStatus;

    /**
     * Gets the value of the overallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallStatus() {
        return overallStatus;
    }

    /**
     * Sets the value of the overallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMStatusList setOverallStatus(String value) {
        this.overallStatus = value;
        return this;
    }

    /**
     * Gets the value of the hsmStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMStatus }
     * 
     * 
     */
    public List<SwHSMStatus> getHSMStatus() {
        if (hsmStatus == null) {
            hsmStatus = new ArrayList<SwHSMStatus>();
        }
        return this.hsmStatus;
    }

    /**
     * Gets the value of the hsmTokenStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmTokenStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMTokenStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMTokenStatus }
     * 
     * 
     */
    public List<SwHSMTokenStatus> getHSMTokenStatus() {
        if (hsmTokenStatus == null) {
            hsmTokenStatus = new ArrayList<SwHSMTokenStatus>();
        }
        return this.hsmTokenStatus;
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
     * Adds a new item to the hSMStatus list.
     * @see #getHSMStatus()
     * 
     */
    public SwHSMStatusList addHSMStatus(SwHSMStatus hSMStatus) {
        getHSMStatus().add(hSMStatus);
        return this;
    }

    /**
     * Adds a new item to the hSMTokenStatus list.
     * @see #getHSMTokenStatus()
     * 
     */
    public SwHSMStatusList addHSMTokenStatus(SwHSMTokenStatus hSMTokenStatus) {
        getHSMTokenStatus().add(hSMTokenStatus);
        return this;
    }

}
