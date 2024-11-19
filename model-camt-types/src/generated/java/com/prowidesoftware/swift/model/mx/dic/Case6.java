
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details to identify an investigation case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Case6", propOrder = {
    "id",
    "cretr",
    "reopCaseIndctn"
})
public class Case6 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Cretr", required = true)
    protected Party50Choice cretr;
    @XmlElement(name = "ReopCaseIndctn")
    protected Boolean reopCaseIndctn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Case6 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cretr property.
     * 
     * @return
     *     possible object is
     *     {@link Party50Choice }
     *     
     */
    public Party50Choice getCretr() {
        return cretr;
    }

    /**
     * Sets the value of the cretr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party50Choice }
     *     
     */
    public Case6 setCretr(Party50Choice value) {
        this.cretr = value;
        return this;
    }

    /**
     * Gets the value of the reopCaseIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReopCaseIndctn() {
        return reopCaseIndctn;
    }

    /**
     * Sets the value of the reopCaseIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Case6 setReopCaseIndctn(Boolean value) {
        this.reopCaseIndctn = value;
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
