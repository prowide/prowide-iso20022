
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
 * Java class for DistributionInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionInfo", propOrder = {
    "recipientList",
    "origSnFRef",
    "snFRefType"
})
public class SwDistributionInfo {

    @XmlElement(name = "RecipientList")
    protected SwRecipientList recipientList;
    @XmlElement(name = "OrigSnFRef", required = true)
    protected String origSnFRef;
    @XmlElement(name = "SnFRefType", required = true)
    protected String snFRefType;

    /**
     * Gets the value of the recipientList property.
     * 
     * @return
     *     possible object is
     *     {@link SwRecipientList }
     *     
     */
    public SwRecipientList getRecipientList() {
        return recipientList;
    }

    /**
     * Sets the value of the recipientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwRecipientList }
     *     
     */
    public SwDistributionInfo setRecipientList(SwRecipientList value) {
        this.recipientList = value;
        return this;
    }

    /**
     * Gets the value of the origSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSnFRef() {
        return origSnFRef;
    }

    /**
     * Sets the value of the origSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDistributionInfo setOrigSnFRef(String value) {
        this.origSnFRef = value;
        return this;
    }

    /**
     * Gets the value of the snFRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRefType() {
        return snFRefType;
    }

    /**
     * Sets the value of the snFRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDistributionInfo setSnFRefType(String value) {
        this.snFRefType = value;
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
