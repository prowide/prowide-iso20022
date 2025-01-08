
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
 * Choice between a date or a date and time format for a period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriodChoice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriodChoice {

    @XmlElement(name = "Dt")
    protected DatePeriodDetails dt;
    @XmlElement(name = "DtTm")
    protected DateTimePeriodDetails dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DateOrDateTimePeriodChoice setDt(DatePeriodDetails value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateOrDateTimePeriodChoice setDtTm(DateTimePeriodDetails value) {
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
