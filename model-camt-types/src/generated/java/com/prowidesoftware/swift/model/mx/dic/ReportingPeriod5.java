
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ReportingPeriod5", propOrder = {
    "frToDt",
    "frToTm",
    "tp"
})
public class ReportingPeriod5 {

    @XmlElement(name = "FrToDt", required = true)
    protected DatePeriod3 frToDt;
    @XmlElement(name = "FrToTm")
    protected TimePeriodDetails1 frToTm;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected QueryType3Code tp;

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod3 }
     *     
     */
    public DatePeriod3 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod3 }
     *     
     */
    public ReportingPeriod5 setFrToDt(DatePeriod3 value) {
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
    public ReportingPeriod5 setFrToTm(TimePeriodDetails1 value) {
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
    public ReportingPeriod5 setTp(QueryType3Code value) {
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
