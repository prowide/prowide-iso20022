
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Format to express a date and a date mode.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat1", propOrder = {
    "dt",
    "dtMd"
})
public class DateFormat1 {

    @XmlElement(name = "Dt", required = true)
    protected DateFormat3Choice dt;
    @XmlElement(name = "DtMd")
    @XmlSchemaType(name = "string")
    protected DateMode1Code dtMd;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat3Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat1 setDt(DateFormat3Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtMd property.
     * 
     * @return
     *     possible object is
     *     {@link DateMode1Code }
     *     
     */
    public DateMode1Code getDtMd() {
        return dtMd;
    }

    /**
     * Sets the value of the dtMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateMode1Code }
     *     
     */
    public DateFormat1 setDtMd(DateMode1Code value) {
        this.dtMd = value;
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
