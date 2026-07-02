
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between search criteria based on dates and date ranges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeSearch2Choice", propOrder = {
    "frDtTm",
    "toDtTm",
    "frToDtTm",
    "eqDtTm",
    "neqDtTm"
})
public class DateTimeSearch2Choice {

    @XmlElement(name = "FrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frDtTm;
    @XmlElement(name = "ToDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDtTm;
    @XmlElement(name = "FrToDtTm")
    protected DateTimePeriod1 frToDtTm;
    @XmlElement(name = "EQDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eqDtTm;
    @XmlElement(name = "NEQDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar neqDtTm;

    /**
     * Gets the value of the frDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFrDtTm() {
        return frDtTm;
    }

    /**
     * Sets the value of the frDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DateTimeSearch2Choice setFrDtTm(XMLGregorianCalendar value) {
        this.frDtTm = value;
        return this;
    }

    /**
     * Gets the value of the toDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getToDtTm() {
        return toDtTm;
    }

    /**
     * Sets the value of the toDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DateTimeSearch2Choice setToDtTm(XMLGregorianCalendar value) {
        this.toDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frToDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDtTm() {
        return frToDtTm;
    }

    /**
     * Sets the value of the frToDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimeSearch2Choice setFrToDtTm(DateTimePeriod1 value) {
        this.frToDtTm = value;
        return this;
    }

    /**
     * Gets the value of the eqDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEQDtTm() {
        return eqDtTm;
    }

    /**
     * Sets the value of the eqDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DateTimeSearch2Choice setEQDtTm(XMLGregorianCalendar value) {
        this.eqDtTm = value;
        return this;
    }

    /**
     * Gets the value of the neqDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getNEQDtTm() {
        return neqDtTm;
    }

    /**
     * Sets the value of the neqDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DateTimeSearch2Choice setNEQDtTm(XMLGregorianCalendar value) {
        this.neqDtTm = value;
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
