
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
 * Choice between a date or a date time pattern as search selection criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeSearch3Choice", propOrder = {
    "dtTmSch",
    "dtSch"
})
public class DateAndDateTimeSearch3Choice {

    @XmlElement(name = "DtTmSch")
    protected DateTimePeriod1Choice dtTmSch;
    @XmlElement(name = "DtSch")
    protected DatePeriodSearch1Choice dtSch;

    /**
     * Gets the value of the dtTmSch property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getDtTmSch() {
        return dtTmSch;
    }

    /**
     * Sets the value of the dtTmSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateAndDateTimeSearch3Choice setDtTmSch(DateTimePeriod1Choice value) {
        this.dtTmSch = value;
        return this;
    }

    /**
     * Gets the value of the dtSch property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getDtSch() {
        return dtSch;
    }

    /**
     * Sets the value of the dtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DateAndDateTimeSearch3Choice setDtSch(DatePeriodSearch1Choice value) {
        this.dtSch = value;
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
