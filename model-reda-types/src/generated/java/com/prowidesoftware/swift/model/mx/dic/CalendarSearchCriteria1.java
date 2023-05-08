
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for calendar data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarSearchCriteria1", propOrder = {
    "yr",
    "mnth",
    "svc"
})
public class CalendarSearchCriteria1 {

    @XmlElement(name = "Yr")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yr;
    @XmlElement(name = "Mnth")
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar mnth;
    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;

    /**
     * Gets the value of the yr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYr() {
        return yr;
    }

    /**
     * Sets the value of the yr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CalendarSearchCriteria1 setYr(XMLGregorianCalendar value) {
        this.yr = value;
        return this;
    }

    /**
     * Gets the value of the mnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMnth() {
        return mnth;
    }

    /**
     * Sets the value of the mnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CalendarSearchCriteria1 setMnth(XMLGregorianCalendar value) {
        this.mnth = value;
        return this;
    }

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
    public CalendarSearchCriteria1 setSvc(SystemAndCurrency1 value) {
        this.svc = value;
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
