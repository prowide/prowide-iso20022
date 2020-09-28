
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
 * Java class for NonDeliveryWarning complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDeliveryWarning", propOrder = {
    "ovrdueWrng"
})
public class NonDeliveryWarningXsys01000102 {

    @XmlElement(name = "OvrdueWrng", required = true)
    protected OverdueWarningXsys01000102 ovrdueWrng;

    /**
     * Gets the value of the ovrdueWrng property.
     * 
     * @return
     *     possible object is
     *     {@link OverdueWarningXsys01000102 }
     *     
     */
    public OverdueWarningXsys01000102 getOvrdueWrng() {
        return ovrdueWrng;
    }

    /**
     * Sets the value of the ovrdueWrng property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdueWarningXsys01000102 }
     *     
     */
    public NonDeliveryWarningXsys01000102 setOvrdueWrng(OverdueWarningXsys01000102 value) {
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
