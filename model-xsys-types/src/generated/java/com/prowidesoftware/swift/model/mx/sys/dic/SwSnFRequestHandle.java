
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
 * Java class for SnFRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFRequestHandle", propOrder = {
    "snFRequestDescriptor",
    "snFOpRequestHandle"
})
public class SwSnFRequestHandle {

    @XmlElement(name = "SnFRequestDescriptor", required = true)
    protected SwSnFRequestDescriptor snFRequestDescriptor;
    @XmlElement(name = "SnFOpRequestHandle", required = true)
    protected SwSnFOpRequestHandle snFOpRequestHandle;

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
    public SwSnFRequestHandle setSnFRequestDescriptor(SwSnFRequestDescriptor value) {
        this.snFRequestDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the snFOpRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOpRequestHandle }
     *     
     */
    public SwSnFOpRequestHandle getSnFOpRequestHandle() {
        return snFOpRequestHandle;
    }

    /**
     * Sets the value of the snFOpRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOpRequestHandle }
     *     
     */
    public SwSnFRequestHandle setSnFOpRequestHandle(SwSnFOpRequestHandle value) {
        this.snFOpRequestHandle = value;
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
