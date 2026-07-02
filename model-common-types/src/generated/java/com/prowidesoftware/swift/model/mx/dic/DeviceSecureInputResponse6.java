
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "DeviceSecureInputResponse6", propOrder = {
    "crdhldrPIN"
})
public class DeviceSecureInputResponse6 {

    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN11 crdhldrPIN;

    /**
     * Gets the value of the crdhldrPIN property.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN11 }
     *     
     */
    public OnLinePIN11 getCrdhldrPIN() {
        return crdhldrPIN;
    }

    /**
     * Sets the value of the crdhldrPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN11 }
     *     
     */
    public DeviceSecureInputResponse6 setCrdhldrPIN(OnLinePIN11 value) {
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
