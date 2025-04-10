
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
 * Choice between search criteria based on dates and time ranges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriodSearch1Choice", propOrder = {
    "frDt",
    "toDt",
    "frToDt",
    "eqDt",
    "neqDt"
})
public class DatePeriodSearch1Choice {

    @XmlElement(name = "FrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate frDt;
    @XmlElement(name = "ToDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate toDt;
    @XmlElement(name = "FrToDt")
    protected DatePeriod2 frToDt;
    @XmlElement(name = "EQDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate eqDt;
    @XmlElement(name = "NEQDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate neqDt;

    /**
     * Gets the value of the frDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFrDt() {
        return frDt;
    }

    /**
     * Sets the value of the frDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriodSearch1Choice setFrDt(LocalDate value) {
        this.frDt = value;
        return this;
    }

    /**
     * Gets the value of the toDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getToDt() {
        return toDt;
    }

    /**
     * Sets the value of the toDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriodSearch1Choice setToDt(LocalDate value) {
        this.toDt = value;
        return this;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriodSearch1Choice setFrToDt(DatePeriod2 value) {
        this.frToDt = value;
        return this;
    }

    /**
     * Gets the value of the eqDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEQDt() {
        return eqDt;
    }

    /**
     * Sets the value of the eqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriodSearch1Choice setEQDt(LocalDate value) {
        this.eqDt = value;
        return this;
    }

    /**
     * Gets the value of the neqDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNEQDt() {
        return neqDt;
    }

    /**
     * Sets the value of the neqDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DatePeriodSearch1Choice setNEQDt(LocalDate value) {
        this.neqDt = value;
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
