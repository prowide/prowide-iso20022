
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
 * Response to a secure input request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSecureInputResponse1", propOrder = {
    "crdhldrPIN"
})
public class DeviceSecureInputResponse1 {

    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN6 crdhldrPIN;

    /**
     * Gets the value of the crdhldrPIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN6 }
     *     
     */
    public OnLinePIN6 getCrdhldrPIN() {
        return crdhldrPIN;
    }

    /**
     * Sets the value of the crdhldrPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN6 }
     *     
     */
    public DeviceSecureInputResponse1 setCrdhldrPIN(OnLinePIN6 value) {
        this.crdhldrPIN = value;
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
