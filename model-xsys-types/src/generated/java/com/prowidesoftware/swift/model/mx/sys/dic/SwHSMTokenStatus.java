
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
 * Java class for HSMTokenStatus complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMTokenStatus", propOrder = {
    "hsmName",
    "hsmPartitionUsed",
    "hsmPartitionFree"
})
public class SwHSMTokenStatus {

    @XmlElement(name = "HSMName", required = true)
    protected String hsmName;
    @XmlElement(name = "HSMPartitionUsed", required = true)
    protected String hsmPartitionUsed;
    @XmlElement(name = "HSMPartitionFree", required = true)
    protected String hsmPartitionFree;

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
    public SwHSMTokenStatus setHSMName(String value) {
        this.hsmName = value;
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
    public SwHSMTokenStatus setHSMPartitionUsed(String value) {
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
    public SwHSMTokenStatus setHSMPartitionFree(String value) {
        this.hsmPartitionFree = value;
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
