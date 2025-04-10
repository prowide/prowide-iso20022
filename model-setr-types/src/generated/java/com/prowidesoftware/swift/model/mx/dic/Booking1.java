
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information used to book the executions of a trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking1", propOrder = {
    "dayBookg",
    "bookgUnit",
    "preAllcnMtd",
    "bookgTp"
})
public class Booking1 {

    @XmlElement(name = "DayBookg")
    @XmlSchemaType(name = "string")
    protected DayBookingInstruction1Code dayBookg;
    @XmlElement(name = "BookgUnit")
    protected BookingUnit1Choice bookgUnit;
    @XmlElement(name = "PreAllcnMtd")
    @XmlSchemaType(name = "string")
    protected PreAllocationMethod1Code preAllcnMtd;
    @XmlElement(name = "BookgTp")
    @XmlSchemaType(name = "string")
    protected BookingType1Code bookgTp;

    /**
     * Gets the value of the dayBookg property.
     * 
     * @return
     *     possible object is
     *     {@link DayBookingInstruction1Code }
     *     
     */
    public DayBookingInstruction1Code getDayBookg() {
        return dayBookg;
    }

    /**
     * Sets the value of the dayBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayBookingInstruction1Code }
     *     
     */
    public Booking1 setDayBookg(DayBookingInstruction1Code value) {
        this.dayBookg = value;
        return this;
    }

    /**
     * Gets the value of the bookgUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BookingUnit1Choice }
     *     
     */
    public BookingUnit1Choice getBookgUnit() {
        return bookgUnit;
    }

    /**
     * Sets the value of the bookgUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingUnit1Choice }
     *     
     */
    public Booking1 setBookgUnit(BookingUnit1Choice value) {
        this.bookgUnit = value;
        return this;
    }

    /**
     * Gets the value of the preAllcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PreAllocationMethod1Code }
     *     
     */
    public PreAllocationMethod1Code getPreAllcnMtd() {
        return preAllcnMtd;
    }

    /**
     * Sets the value of the preAllcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreAllocationMethod1Code }
     *     
     */
    public Booking1 setPreAllcnMtd(PreAllocationMethod1Code value) {
        this.preAllcnMtd = value;
        return this;
    }

    /**
     * Gets the value of the bookgTp property.
     * 
     * @return
     *     possible object is
     *     {@link BookingType1Code }
     *     
     */
    public BookingType1Code getBookgTp() {
        return bookgTp;
    }

    /**
     * Sets the value of the bookgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingType1Code }
     *     
     */
    public Booking1 setBookgTp(BookingType1Code value) {
        this.bookgTp = value;
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
