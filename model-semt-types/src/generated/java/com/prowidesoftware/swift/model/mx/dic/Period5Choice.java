
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
 * Choice between date and date-time for the specification of a period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period5Choice", propOrder = {
    "frDtTmToDtTm",
    "frDtToDt"
})
public class Period5Choice {

    @XmlElement(name = "FrDtTmToDtTm")
    protected DateTimePeriodDetails2 frDtTmToDtTm;
    @XmlElement(name = "FrDtToDt")
    protected Period2 frDtToDt;

    /**
     * Gets the value of the frDtTmToDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails2 }
     *     
     */
    public DateTimePeriodDetails2 getFrDtTmToDtTm() {
        return frDtTmToDtTm;
    }

    /**
     * Sets the value of the frDtTmToDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails2 }
     *     
     */
    public Period5Choice setFrDtTmToDtTm(DateTimePeriodDetails2 value) {
        this.frDtTmToDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frDtToDt property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getFrDtToDt() {
        return frDtToDt;
    }

    /**
     * Sets the value of the frDtToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public Period5Choice setFrDtToDt(Period2 value) {
        this.frDtToDt = value;
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
