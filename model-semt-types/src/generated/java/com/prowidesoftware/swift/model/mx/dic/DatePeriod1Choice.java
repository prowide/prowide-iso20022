
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * Period as a date, a month or a date time span for which the statement is provided.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriod1Choice", propOrder = {
    "dt",
    "dtMnth",
    "frDtToDt"
})
public class DatePeriod1Choice {

    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dt;
    @XmlElement(name = "DtMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar dtMnth;
    @XmlElement(name = "FrDtToDt")
    protected Period2 frDtToDt;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriod1Choice setDt(Calendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the dtMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtMnth() {
        return dtMnth;
    }

    /**
     * Sets the value of the dtMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DatePeriod1Choice setDtMnth(XMLGregorianCalendar value) {
        this.dtMnth = value;
        return this;
    }

    /**
     * Gets the value of the frDtToDt property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getFrDtToDt() {
        return frDtToDt;
    }

    /**
     * Sets the value of the frDtToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public DatePeriod1Choice setFrDtToDt(Period2 value) {
        this.frDtToDt = value;
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
