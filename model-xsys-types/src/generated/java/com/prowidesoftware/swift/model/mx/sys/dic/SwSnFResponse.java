
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
 * Java class for SnFResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFResponse", propOrder = {
    "snFResponseControl",
    "snFOpResponse"
})
public class SwSnFResponse {

    @XmlElement(name = "SnFResponseControl")
    protected SwSnFResponseControl snFResponseControl;
    @XmlElement(name = "SnFOpResponse", required = true)
    protected SwSnFOpResponse snFOpResponse;

    /**
     * Gets the value of the snFResponseControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFResponseControl }
     *     
     */
    public SwSnFResponseControl getSnFResponseControl() {
        return snFResponseControl;
    }

    /**
     * Sets the value of the snFResponseControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFResponseControl }
     *     
     */
    public SwSnFResponse setSnFResponseControl(SwSnFResponseControl value) {
        this.snFResponseControl = value;
        return this;
    }

    /**
     * Gets the value of the snFOpResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOpResponse }
     *     
     */
    public SwSnFOpResponse getSnFOpResponse() {
        return snFOpResponse;
    }

    /**
     * Sets the value of the snFOpResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOpResponse }
     *     
     */
    public SwSnFResponse setSnFOpResponse(SwSnFOpResponse value) {
        this.snFOpResponse = value;
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
