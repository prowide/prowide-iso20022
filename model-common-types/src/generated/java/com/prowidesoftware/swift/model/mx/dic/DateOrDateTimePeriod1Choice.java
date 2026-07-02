
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
 * Choice between a date or a date and time format for a period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriod1Choice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriod1Choice {

    @XmlElement(name = "Dt")
    protected DatePeriod2 dt;
    @XmlElement(name = "DtTm")
    protected DateTimePeriod1 dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public DateOrDateTimePeriod1Choice setDt(DatePeriod2 value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateOrDateTimePeriod1Choice setDtTm(DateTimePeriod1 value) {
        this.dtTm = value;
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
