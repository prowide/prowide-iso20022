
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
 * Java class for GetFileRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFileRequestHandle", propOrder = {
    "transferRef",
    "transferDescription",
    "transferInfo",
    "maxSize",
    "logicalName"
})
public class SwGetFileRequestHandle {

    @XmlElement(name = "TransferRef", required = true)
    protected String transferRef;
    @XmlElement(name = "TransferDescription")
    protected String transferDescription;
    @XmlElement(name = "TransferInfo")
    protected String transferInfo;
    @XmlElement(name = "MaxSize")
    protected String maxSize;
    @XmlElement(name = "LogicalName", required = true)
    protected String logicalName;

    /**
     * Gets the value of the transferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferRef() {
        return transferRef;
    }

    /**
     * Sets the value of the transferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGetFileRequestHandle setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

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
    public SwGetFileRequestHandle setTransferDescription(String value) {
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
    public SwGetFileRequestHandle setTransferInfo(String value) {
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
    public SwGetFileRequestHandle setMaxSize(String value) {
        this.maxSize = value;
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
    public SwGetFileRequestHandle setLogicalName(String value) {
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
