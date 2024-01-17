
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
 * Java class for HSMStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMStatus", propOrder = {
    "hsmName",
    "hsmRunStatus",
    "hsmReplicationStatus",
    "hsmPartitionUsed",
    "hsmPartitionFree",
    "primaryHSMStatus",
    "secondaryHSMStatus",
    "hsmDetailStatusList"
})
public class SwHSMStatus {

    @XmlElement(name = "HSMName", required = true)
    protected String hsmName;
    @XmlElement(name = "HSMRunStatus", required = true)
    protected String hsmRunStatus;
    @XmlElement(name = "HSMReplicationStatus", required = true)
    protected String hsmReplicationStatus;
    @XmlElement(name = "HSMPartitionUsed", required = true)
    protected String hsmPartitionUsed;
    @XmlElement(name = "HSMPartitionFree", required = true)
    protected String hsmPartitionFree;
    @XmlElement(name = "PrimaryHSMStatus")
    protected SwHSMDetailStatus primaryHSMStatus;
    @XmlElement(name = "SecondaryHSMStatus")
    protected SwHSMDetailStatus secondaryHSMStatus;
    @XmlElement(name = "HSMDetailStatusList")
    protected SwHSMDetailStatusList hsmDetailStatusList;

    /**
     * Gets the value of the hsmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMName() {
        return hsmName;
    }

    /**
     * Sets the value of the hsmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMStatus setHSMName(String value) {
        this.hsmName = value;
        return this;
    }

    /**
     * Gets the value of the hsmRunStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMRunStatus() {
        return hsmRunStatus;
    }

    /**
     * Sets the value of the hsmRunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMStatus setHSMRunStatus(String value) {
        this.hsmRunStatus = value;
        return this;
    }

    /**
     * Gets the value of the hsmReplicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMReplicationStatus() {
        return hsmReplicationStatus;
    }

    /**
     * Sets the value of the hsmReplicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMStatus setHSMReplicationStatus(String value) {
        this.hsmReplicationStatus = value;
        return this;
    }

    /**
     * Gets the value of the hsmPartitionUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMPartitionUsed() {
        return hsmPartitionUsed;
    }

    /**
     * Sets the value of the hsmPartitionUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMStatus setHSMPartitionUsed(String value) {
        this.hsmPartitionUsed = value;
        return this;
    }

    /**
     * Gets the value of the hsmPartitionFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMPartitionFree() {
        return hsmPartitionFree;
    }

    /**
     * Sets the value of the hsmPartitionFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMStatus setHSMPartitionFree(String value) {
        this.hsmPartitionFree = value;
        return this;
    }

    /**
     * Gets the value of the primaryHSMStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMDetailStatus }
     *     
     */
    public SwHSMDetailStatus getPrimaryHSMStatus() {
        return primaryHSMStatus;
    }

    /**
     * Sets the value of the primaryHSMStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMDetailStatus }
     *     
     */
    public SwHSMStatus setPrimaryHSMStatus(SwHSMDetailStatus value) {
        this.primaryHSMStatus = value;
        return this;
    }

    /**
     * Gets the value of the secondaryHSMStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMDetailStatus }
     *     
     */
    public SwHSMDetailStatus getSecondaryHSMStatus() {
        return secondaryHSMStatus;
    }

    /**
     * Sets the value of the secondaryHSMStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMDetailStatus }
     *     
     */
    public SwHSMStatus setSecondaryHSMStatus(SwHSMDetailStatus value) {
        this.secondaryHSMStatus = value;
        return this;
    }

    /**
     * Gets the value of the hsmDetailStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMDetailStatusList }
     *     
     */
    public SwHSMDetailStatusList getHSMDetailStatusList() {
        return hsmDetailStatusList;
    }

    /**
     * Sets the value of the hsmDetailStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMDetailStatusList }
     *     
     */
    public SwHSMStatus setHSMDetailStatusList(SwHSMDetailStatusList value) {
        this.hsmDetailStatusList = value;
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
