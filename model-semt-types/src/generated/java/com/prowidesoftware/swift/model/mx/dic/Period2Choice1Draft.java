
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
 * Choice between date and date-time for the specification of a period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period2Choice__1", propOrder = {
    "frDtTmToDtTm"
})
public class Period2Choice1Draft {

    @XmlElement(name = "FrDtTmToDtTm")
    protected DateTimePeriodDetails1Draft frDtTmToDtTm;

    /**
     * Gets the value of the frDtTmToDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails1Draft }
     *     
     */
    public DateTimePeriodDetails1Draft getFrDtTmToDtTm() {
        return frDtTmToDtTm;
    }

    /**
     * Sets the value of the frDtTmToDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails1Draft }
     *     
     */
    public Period2Choice1Draft setFrDtTmToDtTm(DateTimePeriodDetails1Draft value) {
        this.frDtTmToDtTm = value;
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
