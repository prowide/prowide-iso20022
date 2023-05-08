
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
 * Java class for HandleSnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleSnFRequest", propOrder = {
    "snFRequestHandle"
})
public class SwHandleSnFRequest {

    @XmlElement(name = "SnFRequestHandle", required = true)
    protected SwSnFRequestHandle snFRequestHandle;

    /**
     * Gets the value of the snFRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFRequestHandle }
     *     
     */
    public SwSnFRequestHandle getSnFRequestHandle() {
        return snFRequestHandle;
    }

    /**
     * Sets the value of the snFRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFRequestHandle }
     *     
     */
    public SwHandleSnFRequest setSnFRequestHandle(SwSnFRequestHandle value) {
        this.snFRequestHandle = value;
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
