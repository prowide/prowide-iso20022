
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
 * Java class for HSMPartition complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMPartition", propOrder = {
    "partitionName",
    "partitionEnabled",
    "partitionLockoutEnforced",
    "partitionLocked"
})
public class SwHSMPartition {

    @XmlElement(name = "PartitionName", required = true)
    protected String partitionName;
    @XmlElement(name = "PartitionEnabled", required = true)
    protected String partitionEnabled;
    @XmlElement(name = "PartitionLockoutEnforced", required = true)
    protected String partitionLockoutEnforced;
    @XmlElement(name = "PartitionLocked", required = true)
    protected String partitionLocked;

    /**
     * Gets the value of the partitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Sets the value of the partitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMPartition setPartitionName(String value) {
        this.partitionName = value;
        return this;
    }

    /**
     * Gets the value of the partitionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionEnabled() {
        return partitionEnabled;
    }

    /**
     * Sets the value of the partitionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMPartition setPartitionEnabled(String value) {
        this.partitionEnabled = value;
        return this;
    }

    /**
     * Gets the value of the partitionLockoutEnforced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionLockoutEnforced() {
        return partitionLockoutEnforced;
    }

    /**
     * Sets the value of the partitionLockoutEnforced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMPartition setPartitionLockoutEnforced(String value) {
        this.partitionLockoutEnforced = value;
        return this;
    }

    /**
     * Gets the value of the partitionLocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionLocked() {
        return partitionLocked;
    }

    /**
     * Sets the value of the partitionLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMPartition setPartitionLocked(String value) {
        this.partitionLocked = value;
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
