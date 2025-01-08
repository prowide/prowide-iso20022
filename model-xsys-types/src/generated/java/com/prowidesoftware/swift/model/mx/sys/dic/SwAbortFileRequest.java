
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
 * Java class for AbortFileRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbortFileRequest", propOrder = {
    "transferRef",
    "transferKey",
    "abortReason"
})
public class SwAbortFileRequest {

    @XmlElement(name = "TransferRef", required = true)
    protected String transferRef;
    @XmlElement(name = "TransferKey")
    protected String transferKey;
    @XmlElement(name = "AbortReason")
    protected String abortReason;

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
    public SwAbortFileRequest setTransferRef(String value) {
        this.transferRef = value;
        return this;
    }

    /**
     * Gets the value of the transferKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferKey() {
        return transferKey;
    }

    /**
     * Sets the value of the transferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAbortFileRequest setTransferKey(String value) {
        this.transferKey = value;
        return this;
    }

    /**
     * Gets the value of the abortReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbortReason() {
        return abortReason;
    }

    /**
     * Sets the value of the abortReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwAbortFileRequest setAbortReason(String value) {
        this.abortReason = value;
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
