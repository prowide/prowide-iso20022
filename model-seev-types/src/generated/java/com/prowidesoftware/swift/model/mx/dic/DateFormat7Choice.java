
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
 * Choice between an ISODate or ISODateTime format or a date code or a date code and a time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat7Choice", propOrder = {
    "dt",
    "dtCdAndTm",
    "dtCd"
})
public class DateFormat7Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTimeChoice dt;
    @XmlElement(name = "DtCdAndTm")
    protected DateCodeAndTimeFormat1 dtCdAndTm;
    @XmlElement(name = "DtCd")
    protected DateCode2Choice dtCd;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateFormat7Choice setDt(DateAndDateTimeChoice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtCdAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateCodeAndTimeFormat1 }
     *     
     */
    public DateCodeAndTimeFormat1 getDtCdAndTm() {
        return dtCdAndTm;
    }

    /**
     * Sets the value of the dtCdAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCodeAndTimeFormat1 }
     *     
     */
    public DateFormat7Choice setDtCdAndTm(DateCodeAndTimeFormat1 value) {
        this.dtCdAndTm = value;
        return this;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateCode2Choice }
     *     
     */
    public DateCode2Choice getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCode2Choice }
     *     
     */
    public DateFormat7Choice setDtCd(DateCode2Choice value) {
        this.dtCd = value;
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
