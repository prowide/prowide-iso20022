
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
 * Choice between an ISODate or ISODateTime format or a date code or a date code and a time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat54Choice", propOrder = {
    "dt",
    "dtCdAndTm",
    "dtCd"
})
public class DateFormat54Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "DtCdAndTm")
    protected DateCodeAndTimeFormat4 dtCdAndTm;
    @XmlElement(name = "DtCd")
    protected DateCode22Choice dtCd;

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
    public DateFormat54Choice setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtCdAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateCodeAndTimeFormat4 }
     *     
     */
    public DateCodeAndTimeFormat4 getDtCdAndTm() {
        return dtCdAndTm;
    }

    /**
     * Sets the value of the dtCdAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCodeAndTimeFormat4 }
     *     
     */
    public DateFormat54Choice setDtCdAndTm(DateCodeAndTimeFormat4 value) {
        this.dtCdAndTm = value;
        return this;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateCode22Choice }
     *     
     */
    public DateCode22Choice getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCode22Choice }
     *     
     */
    public DateFormat54Choice setDtCd(DateCode22Choice value) {
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
