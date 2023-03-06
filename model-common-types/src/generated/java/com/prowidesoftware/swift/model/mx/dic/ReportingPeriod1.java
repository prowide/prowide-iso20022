
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the requested reporting period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingPeriod1", propOrder = {
    "frToDt",
    "frToTm",
    "tp"
})
public class ReportingPeriod1 {

    @XmlElement(name = "FrToDt", required = true)
    protected DatePeriodDetails1 frToDt;
    @XmlElement(name = "FrToTm", required = true)
    protected TimePeriodDetails1 frToTm;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected QueryType3Code tp;

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails1 }
     *     
     */
    public DatePeriodDetails1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails1 }
     *     
     */
    public ReportingPeriod1 setFrToDt(DatePeriodDetails1 value) {
        this.frToDt = value;
        return this;
    }

    /**
     * Gets the value of the frToTm property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodDetails1 }
     *     
     */
    public TimePeriodDetails1 getFrToTm() {
        return frToTm;
    }

    /**
     * Sets the value of the frToTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodDetails1 }
     *     
     */
    public ReportingPeriod1 setFrToTm(TimePeriodDetails1 value) {
        this.frToTm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType3Code }
     *     
     */
    public QueryType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType3Code }
     *     
     */
    public ReportingPeriod1 setTp(QueryType3Code value) {
        this.tp = value;
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
