
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.YearMonth;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoYearMonthAdapter;
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

    @XmlElement(name = "YrMnth", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth yrMnth;
    @XmlElement(name = "YrMnthDay", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate yrMnthDay;

    /**
     * Gets the value of the yrMnth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public YearMonth getYrMnth() {
        return yrMnth;
    }

    /**
     * Sets the value of the yrMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DateFormat42Choice setYrMnth(YearMonth value) {
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
    public LocalDate getYrMnthDay() {
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
    public DateFormat42Choice setYrMnthDay(LocalDate value) {
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
