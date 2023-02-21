
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
 * Java class for NonDeliveryWarning complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDeliveryWarning", propOrder = {
    "ovrdueWrng"
})
public class NonDeliveryWarning {

    @XmlElement(name = "OvrdueWrng", required = true)
    protected OverdueWarning ovrdueWrng;

    /**
     * Gets the value of the ovrdueWrng property.
     * 
     * @return
     *     possible object is
     *     {@link OverdueWarning }
     *     
     */
    public OverdueWarning getOvrdueWrng() {
        return ovrdueWrng;
    }

    /**
     * Sets the value of the ovrdueWrng property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdueWarning }
     *     
     */
    public NonDeliveryWarning setOvrdueWrng(OverdueWarning value) {
        this.ovrdueWrng = value;
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
