
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
 * Choice between a date or a date time pattern as search selection criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTimeSearchChoice", propOrder = {
    "dtTmSch",
    "dtSch"
})
public class DateAndDateTimeSearchChoice {

    @XmlElement(name = "DtTmSch")
    protected DateTimePeriodChoice dtTmSch;
    @XmlElement(name = "DtSch")
    protected DateSearchChoice dtSch;

    /**
     * Gets the value of the dtTmSch property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getDtTmSch() {
        return dtTmSch;
    }

    /**
     * Sets the value of the dtTmSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateAndDateTimeSearchChoice setDtTmSch(DateTimePeriodChoice value) {
        this.dtTmSch = value;
        return this;
    }

    /**
     * Gets the value of the dtSch property.
     * 
     * @return
     *     possible object is
     *     {@link DateSearchChoice }
     *     
     */
    public DateSearchChoice getDtSch() {
        return dtSch;
    }

    /**
     * Sets the value of the dtSch property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSearchChoice }
     *     
     */
    public DateAndDateTimeSearchChoice setDtSch(DateSearchChoice value) {
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
