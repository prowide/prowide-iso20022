
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
 * Java class for HSMShowPartitionResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMShowPartitionResponse", propOrder = {
    "actionCode",
    "partitionName",
    "partitionOrigName",
    "partitionSlot",
    "partitionHandle",
    "partitionLoginCount",
    "partitionSID",
    "partitionErrorCount",
    "partitionBadLoginCount",
    "partitionDeleted",
    "partitionLockoutEnforced",
    "partitionLocked",
    "partitionEnabled"
})
public class SwHSMShowPartitionResponse {

    @XmlElement(name = "ActionCode", required = true)
    protected String actionCode;
    @XmlElement(name = "PartitionName", required = true)
    protected String partitionName;
    @XmlElement(name = "PartitionOrigName", required = true)
    protected String partitionOrigName;
    @XmlElement(name = "PartitionSlot", required = true)
    protected String partitionSlot;
    @XmlElement(name = "PartitionHandle", required = true)
    protected String partitionHandle;
    @XmlElement(name = "PartitionLoginCount", required = true)
    protected String partitionLoginCount;
    @XmlElement(name = "PartitionSID", required = true)
    protected String partitionSID;
    @XmlElement(name = "PartitionErrorCount", required = true)
    protected String partitionErrorCount;
    @XmlElement(name = "PartitionBadLoginCount", required = true)
    protected String partitionBadLoginCount;
    @XmlElement(name = "PartitionDeleted", required = true)
    protected String partitionDeleted;
    @XmlElement(name = "PartitionLockoutEnforced")
    protected String partitionLockoutEnforced;
    @XmlElement(name = "PartitionLocked", required = true)
    protected String partitionLocked;
    @XmlElement(name = "PartitionEnabled", required = true)
    protected String partitionEnabled;

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
    public SwHSMShowPartitionResponse setActionCode(String value) {
        this.actionCode = value;
        return this;
    }

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
    public SwHSMShowPartitionResponse setPartitionName(String value) {
        this.partitionName = value;
        return this;
    }

    /**
     * Gets the value of the partitionOrigName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionOrigName() {
        return partitionOrigName;
    }

    /**
     * Sets the value of the partitionOrigName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionOrigName(String value) {
        this.partitionOrigName = value;
        return this;
    }

    /**
     * Gets the value of the partitionSlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionSlot() {
        return partitionSlot;
    }

    /**
     * Sets the value of the partitionSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionSlot(String value) {
        this.partitionSlot = value;
        return this;
    }

    /**
     * Gets the value of the partitionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionHandle() {
        return partitionHandle;
    }

    /**
     * Sets the value of the partitionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionHandle(String value) {
        this.partitionHandle = value;
        return this;
    }

    /**
     * Gets the value of the partitionLoginCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionLoginCount() {
        return partitionLoginCount;
    }

    /**
     * Sets the value of the partitionLoginCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionLoginCount(String value) {
        this.partitionLoginCount = value;
        return this;
    }

    /**
     * Gets the value of the partitionSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionSID() {
        return partitionSID;
    }

    /**
     * Sets the value of the partitionSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionSID(String value) {
        this.partitionSID = value;
        return this;
    }

    /**
     * Gets the value of the partitionErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionErrorCount() {
        return partitionErrorCount;
    }

    /**
     * Sets the value of the partitionErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionErrorCount(String value) {
        this.partitionErrorCount = value;
        return this;
    }

    /**
     * Gets the value of the partitionBadLoginCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionBadLoginCount() {
        return partitionBadLoginCount;
    }

    /**
     * Sets the value of the partitionBadLoginCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionBadLoginCount(String value) {
        this.partitionBadLoginCount = value;
        return this;
    }

    /**
     * Gets the value of the partitionDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionDeleted() {
        return partitionDeleted;
    }

    /**
     * Sets the value of the partitionDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMShowPartitionResponse setPartitionDeleted(String value) {
        this.partitionDeleted = value;
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
    public SwHSMShowPartitionResponse setPartitionLockoutEnforced(String value) {
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
    public SwHSMShowPartitionResponse setPartitionLocked(String value) {
        this.partitionLocked = value;
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
    public SwHSMShowPartitionResponse setPartitionEnabled(String value) {
        this.partitionEnabled = value;
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
