
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Particular time span specified between a start time and an end time. The time period cannot exceed 24 hours.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriod2", propOrder = {
    "frTm",
    "toTm"
})
public class TimePeriod2 {

    @XmlElement(name = "FrTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frTm;
    @XmlElement(name = "ToTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar toTm;

    /**
     * Gets the value of the frTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFrTm() {
        return frTm;
    }

    /**
     * Sets the value of the frTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TimePeriod2 setFrTm(XMLGregorianCalendar value) {
        this.frTm = value;
        return this;
    }

    /**
     * Gets the value of the toTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getToTm() {
        return toTm;
    }

    /**
     * Sets the value of the toTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TimePeriod2 setToTm(XMLGregorianCalendar value) {
        this.toTm = value;
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
