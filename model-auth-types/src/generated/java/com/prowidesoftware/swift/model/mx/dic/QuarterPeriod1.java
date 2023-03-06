
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
 * Quarterly periods range.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuarterPeriod1", propOrder = {
    "frPrd",
    "toPrd"
})
public class QuarterPeriod1 {

    @XmlElement(name = "FrPrd", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingPeriodType1Code frPrd;
    @XmlElement(name = "ToPrd", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingPeriodType1Code toPrd;

    /**
     * Gets the value of the frPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriodType1Code }
     *     
     */
    public ReportingPeriodType1Code getFrPrd() {
        return frPrd;
    }

    /**
     * Sets the value of the frPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriodType1Code }
     *     
     */
    public QuarterPeriod1 setFrPrd(ReportingPeriodType1Code value) {
        this.frPrd = value;
        return this;
    }

    /**
     * Gets the value of the toPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriodType1Code }
     *     
     */
    public ReportingPeriodType1Code getToPrd() {
        return toPrd;
    }

    /**
     * Sets the value of the toPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriodType1Code }
     *     
     */
    public QuarterPeriod1 setToPrd(ReportingPeriodType1Code value) {
        this.toPrd = value;
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
