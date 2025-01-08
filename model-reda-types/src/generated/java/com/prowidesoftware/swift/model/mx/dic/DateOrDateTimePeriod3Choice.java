
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
@XmlType(name = "DateOrDateTimePeriod3Choice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriod3Choice {

    @XmlElement(name = "Dt")
    protected Period4Choice dt;
    @XmlElement(name = "DtTm")
    protected Period8Choice dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public DateOrDateTimePeriod3Choice setDt(Period4Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link Period8Choice }
     *     
     */
    public Period8Choice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period8Choice }
     *     
     */
    public DateOrDateTimePeriod3Choice setDtTm(Period8Choice value) {
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
