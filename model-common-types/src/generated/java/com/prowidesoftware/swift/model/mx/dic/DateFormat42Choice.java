
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of formats for a date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat42Choice", propOrder = {
    "yrMnth",
    "yrMnthDay"
})
public class DateFormat42Choice {

    @XmlElement(name = "YrMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yrMnth;
    @XmlElement(name = "YrMnthDay", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yrMnthDay;

    /**
     * Gets the value of the yrMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrMnth() {
        return yrMnth;
    }

    /**
     * Sets the value of the yrMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DateFormat42Choice setYrMnth(XMLGregorianCalendar value) {
        this.yrMnth = value;
        return this;
    }

    /**
     * Gets the value of the yrMnthDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getYrMnthDay() {
        return yrMnthDay;
    }

    /**
     * Sets the value of the yrMnthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DateFormat42Choice setYrMnthDay(XMLGregorianCalendar value) {
        this.yrMnthDay = value;
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
