
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "DateTimeSearch2Choice__1", propOrder = {
    "frDtTm",
    "toDtTm",
    "frToDtTm",
    "eqDtTm"
})
public class DateTimeSearch2Choice1 {

    @XmlElement(name = "FrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frDtTm;
    @XmlElement(name = "ToDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDtTm;
    @XmlElement(name = "FrToDtTm")
    protected DateTimePeriod11 frToDtTm;
    @XmlElement(name = "EQDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eqDtTm;

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
    public DateTimeSearch2Choice1 setFrDtTm(XMLGregorianCalendar value) {
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
    public DateTimeSearch2Choice1 setToDtTm(XMLGregorianCalendar value) {
        this.toDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frToDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod11 }
     *     
     */
    public DateTimePeriod11 getFrToDtTm() {
        return frToDtTm;
    }

    /**
     * Sets the value of the frToDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod11 }
     *     
     */
    public DateTimeSearch2Choice1 setFrToDtTm(DateTimePeriod11 value) {
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
    public DateTimeSearch2Choice1 setEQDtTm(XMLGregorianCalendar value) {
        this.eqDtTm = value;
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
