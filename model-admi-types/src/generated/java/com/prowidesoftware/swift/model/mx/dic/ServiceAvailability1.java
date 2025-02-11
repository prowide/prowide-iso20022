
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
 * Provides details on the availability of a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAvailability1", propOrder = {
    "bizSvc",
    "avlbtySts"
})
public class ServiceAvailability1 {

    @XmlElement(name = "BizSvc")
    protected String bizSvc;
    @XmlElement(name = "AvlbtySts", required = true)
    protected SystemEventType3Choice avlbtySts;

    /**
     * Gets the value of the bizSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizSvc() {
        return bizSvc;
    }

    /**
     * Sets the value of the bizSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceAvailability1 setBizSvc(String value) {
        this.bizSvc = value;
        return this;
    }

    /**
     * Gets the value of the avlbtySts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType3Choice }
     *     
     */
    public SystemEventType3Choice getAvlbtySts() {
        return avlbtySts;
    }

    /**
     * Sets the value of the avlbtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType3Choice }
     *     
     */
    public ServiceAvailability1 setAvlbtySts(SystemEventType3Choice value) {
        this.avlbtySts = value;
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
