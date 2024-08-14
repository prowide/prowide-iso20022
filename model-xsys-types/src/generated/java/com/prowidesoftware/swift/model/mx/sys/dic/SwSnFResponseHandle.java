
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
 * Java class for SnFResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFResponseHandle", propOrder = {
    "snFRequestDescriptor",
    "snFOpResponseHandle"
})
public class SwSnFResponseHandle {

    @XmlElement(name = "SnFRequestDescriptor")
    protected SwSnFRequestDescriptor snFRequestDescriptor;
    @XmlElement(name = "SnFOpResponseHandle", required = true)
    protected SwSnFOpResponseHandle snFOpResponseHandle;

    /**
     * Gets the value of the snFRequestDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFRequestDescriptor }
     *     
     */
    public SwSnFRequestDescriptor getSnFRequestDescriptor() {
        return snFRequestDescriptor;
    }

    /**
     * Sets the value of the snFRequestDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFRequestDescriptor }
     *     
     */
    public SwSnFResponseHandle setSnFRequestDescriptor(SwSnFRequestDescriptor value) {
        this.snFRequestDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the snFOpResponseHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOpResponseHandle }
     *     
     */
    public SwSnFOpResponseHandle getSnFOpResponseHandle() {
        return snFOpResponseHandle;
    }

    /**
     * Sets the value of the snFOpResponseHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOpResponseHandle }
     *     
     */
    public SwSnFResponseHandle setSnFOpResponseHandle(SwSnFOpResponseHandle value) {
        this.snFOpResponseHandle = value;
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
