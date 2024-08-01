
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the unadjusted effective and end date of the schedule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule11", propOrder = {
    "uadjstdFctvDt",
    "uadjstdEndDt",
    "amt"
})
public class Schedule11 {

    @XmlElement(name = "UadjstdFctvDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate uadjstdFctvDt;
    @XmlElement(name = "UadjstdEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate uadjstdEndDt;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection106 amt;

    /**
     * Gets the value of the uadjstdFctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getUadjstdFctvDt() {
        return uadjstdFctvDt;
    }

    /**
     * Sets the value of the uadjstdFctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Schedule11 setUadjstdFctvDt(LocalDate value) {
        this.uadjstdFctvDt = value;
        return this;
    }

    /**
     * Gets the value of the uadjstdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getUadjstdEndDt() {
        return uadjstdEndDt;
    }

    /**
     * Sets the value of the uadjstdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Schedule11 setUadjstdEndDt(LocalDate value) {
        this.uadjstdEndDt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public Schedule11 setAmt(AmountAndDirection106 value) {
        this.amt = value;
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
