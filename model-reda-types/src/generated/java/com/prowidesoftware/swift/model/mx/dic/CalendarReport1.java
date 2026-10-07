
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarReport1", propOrder = {
    "svc",
    "calOrErr"
})
public class CalendarReport1 {

    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;
    @XmlElement(name = "CalOrErr", required = true)
    protected CalendarOrBusinessError1Choice calOrErr;

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public SystemAndCurrency1 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public CalendarReport1 setSvc(SystemAndCurrency1 value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the calOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarOrBusinessError1Choice }
     *     
     */
    public CalendarOrBusinessError1Choice getCalOrErr() {
        return calOrErr;
    }

    /**
     * Sets the value of the calOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarOrBusinessError1Choice }
     *     
     */
    public CalendarReport1 setCalOrErr(CalendarOrBusinessError1Choice value) {
        this.calOrErr = value;
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
