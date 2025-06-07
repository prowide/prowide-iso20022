
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the value of a date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat45Choice", propOrder = {
    "dt",
    "notSpcfdDt"
})
public class DateFormat45Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "NotSpcfdDt")
    @XmlSchemaType(name = "string")
    protected DateType8Code notSpcfdDt;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateFormat45Choice setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the notSpcfdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateType8Code }
     *     
     */
    public DateType8Code getNotSpcfdDt() {
        return notSpcfdDt;
    }

    /**
     * Sets the value of the notSpcfdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType8Code }
     *     
     */
    public DateFormat45Choice setNotSpcfdDt(DateType8Code value) {
        this.notSpcfdDt = value;
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
