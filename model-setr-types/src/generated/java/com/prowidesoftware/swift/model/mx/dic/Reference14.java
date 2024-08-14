
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
 * Additional references linked to the cross order modification request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference14", propOrder = {
    "orgnlCrossOrdrId",
    "hstCrossId"
})
public class Reference14 {

    @XmlElement(name = "OrgnlCrossOrdrId", required = true)
    protected String orgnlCrossOrdrId;
    @XmlElement(name = "HstCrossId", required = true)
    protected String hstCrossId;

    /**
     * Gets the value of the orgnlCrossOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlCrossOrdrId() {
        return orgnlCrossOrdrId;
    }

    /**
     * Sets the value of the orgnlCrossOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference14 setOrgnlCrossOrdrId(String value) {
        this.orgnlCrossOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the hstCrossId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCrossId() {
        return hstCrossId;
    }

    /**
     * Sets the value of the hstCrossId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference14 setHstCrossId(String value) {
        this.hstCrossId = value;
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
