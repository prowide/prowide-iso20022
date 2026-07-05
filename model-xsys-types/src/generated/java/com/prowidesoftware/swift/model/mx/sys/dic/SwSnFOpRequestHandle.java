
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
 * Java class for SnFOpRequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnFOpRequestHandle", propOrder = {
    "notifySnFRequestHandle"
})
public class SwSnFOpRequestHandle {

    @XmlElement(name = "NotifySnFRequestHandle", required = true)
    protected SwNotifySnFRequestHandle notifySnFRequestHandle;

    /**
     * Gets the value of the notifySnFRequestHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SwNotifySnFRequestHandle }
     *     
     */
    public SwNotifySnFRequestHandle getNotifySnFRequestHandle() {
        return notifySnFRequestHandle;
    }

    /**
     * Sets the value of the notifySnFRequestHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwNotifySnFRequestHandle }
     *     
     */
    public SwSnFOpRequestHandle setNotifySnFRequestHandle(SwNotifySnFRequestHandle value) {
        this.notifySnFRequestHandle = value;
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
