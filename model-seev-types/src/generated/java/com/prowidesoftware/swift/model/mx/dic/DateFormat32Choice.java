
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
@XmlType(name = "DateFormat32Choice", propOrder = {
    "dt",
    "dtCdAndTm",
    "dtCd"
})
public class DateFormat32Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTimeChoice dt;
    @XmlElement(name = "DtCdAndTm")
    protected DateCodeAndTimeFormat3 dtCdAndTm;
    @XmlElement(name = "DtCd")
    protected DateCode19Choice dtCd;

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
    public DateFormat32Choice setDt(DateAndDateTimeChoice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtCdAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateCodeAndTimeFormat3 }
     *     
     */
    public DateCodeAndTimeFormat3 getDtCdAndTm() {
        return dtCdAndTm;
    }

    /**
     * Sets the value of the dtCdAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCodeAndTimeFormat3 }
     *     
     */
    public DateFormat32Choice setDtCdAndTm(DateCodeAndTimeFormat3 value) {
        this.dtCdAndTm = value;
        return this;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateCode19Choice }
     *     
     */
    public DateCode19Choice getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCode19Choice }
     *     
     */
    public DateFormat32Choice setDtCd(DateCode19Choice value) {
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
