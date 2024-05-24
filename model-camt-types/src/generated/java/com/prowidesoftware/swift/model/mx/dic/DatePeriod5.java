
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
 * Range of time defined by a current value date and a requested value date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriod5", propOrder = {
    "curValDt",
    "reqdValDt"
})
public class DatePeriod5 {

    @XmlElement(name = "CurValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate curValDt;
    @XmlElement(name = "ReqdValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdValDt;

    /**
     * Gets the value of the curValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCurValDt() {
        return curValDt;
    }

    /**
     * Sets the value of the curValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriod5 setCurValDt(LocalDate value) {
        this.curValDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdValDt() {
        return reqdValDt;
    }

    /**
     * Sets the value of the reqdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriod5 setReqdValDt(LocalDate value) {
        this.reqdValDt = value;
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
