
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
 * Java class for SnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFRequest", propOrder = {
    "snFRequestControl",
    "snFOpRequest"
})
public class SwSnFRequest {

    @XmlElement(name = "SnFRequestControl")
    protected SwSnFRequestControl snFRequestControl;
    @XmlElement(name = "SnFOpRequest", required = true)
    protected SwSnFOpRequest snFOpRequest;

    /**
     * Gets the value of the snFRequestControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFRequestControl }
     *     
     */
    public SwSnFRequestControl getSnFRequestControl() {
        return snFRequestControl;
    }

    /**
     * Sets the value of the snFRequestControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFRequestControl }
     *     
     */
    public SwSnFRequest setSnFRequestControl(SwSnFRequestControl value) {
        this.snFRequestControl = value;
        return this;
    }

    /**
     * Gets the value of the snFOpRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOpRequest }
     *     
     */
    public SwSnFOpRequest getSnFOpRequest() {
        return snFOpRequest;
    }

    /**
     * Sets the value of the snFOpRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOpRequest }
     *     
     */
    public SwSnFRequest setSnFOpRequest(SwSnFOpRequest value) {
        this.snFOpRequest = value;
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
