
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
 * Java class for GetFileRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileRequest", propOrder = {
    "transferDescription",
    "transferInfo",
    "maxSize",
    "physicalName",
    "logicalName"
})
public class SwGetFileRequest {

    @XmlElement(name = "TransferDescription")
    protected String transferDescription;
    @XmlElement(name = "TransferInfo")
    protected String transferInfo;
    @XmlElement(name = "MaxSize")
    protected String maxSize;
    @XmlElement(name = "PhysicalName", required = true)
    protected String physicalName;
    @XmlElement(name = "LogicalName")
    protected String logicalName;

    /**
     * Gets the value of the transferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDescription() {
        return transferDescription;
    }

    /**
     * Sets the value of the transferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileRequest setTransferDescription(String value) {
        this.transferDescription = value;
        return this;
    }

    /**
     * Gets the value of the transferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferInfo() {
        return transferInfo;
    }

    /**
     * Sets the value of the transferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileRequest setTransferInfo(String value) {
        this.transferInfo = value;
        return this;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileRequest setMaxSize(String value) {
        this.maxSize = value;
        return this;
    }

    /**
     * Gets the value of the physicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalName() {
        return physicalName;
    }

    /**
     * Sets the value of the physicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileRequest setPhysicalName(String value) {
        this.physicalName = value;
        return this;
    }

    /**
     * Gets the value of the logicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * Sets the value of the logicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileRequest setLogicalName(String value) {
        this.logicalName = value;
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
