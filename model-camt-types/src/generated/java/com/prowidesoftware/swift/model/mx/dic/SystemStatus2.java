
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
 * Status of a system and the period of time during which the status is valid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatus2", propOrder = {
    "sts",
    "vldtyTm"
})
public class SystemStatus2 {

    @XmlElement(name = "Sts", required = true)
    protected SystemStatus2Choice sts;
    @XmlElement(name = "VldtyTm")
    protected DateTimePeriodChoice vldtyTm;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatus2Choice }
     *     
     */
    public SystemStatus2Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatus2Choice }
     *     
     */
    public SystemStatus2 setSts(SystemStatus2Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the vldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getVldtyTm() {
        return vldtyTm;
    }

    /**
     * Sets the value of the vldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public SystemStatus2 setVldtyTm(DateTimePeriodChoice value) {
        this.vldtyTm = value;
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
