
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
 * Choice between a reason for no activity during the reporting period and the money market quantitative details for the reporting period.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData2Choice", propOrder = {
    "dataSetActn",
    "qttvData"
})
public class ReportData2Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity3Code dataSetActn;
    @XmlElement(name = "QttvData")
    protected QuantitativeData2 qttvData;

    /**
     * Gets the value of the dataSetActn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriodActivity3Code }
     *     
     */
    public ReportPeriodActivity3Code getDataSetActn() {
        return dataSetActn;
    }

    /**
     * Sets the value of the dataSetActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriodActivity3Code }
     *     
     */
    public ReportData2Choice setDataSetActn(ReportPeriodActivity3Code value) {
        this.dataSetActn = value;
        return this;
    }

    /**
     * Gets the value of the qttvData property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeData2 }
     *     
     */
    public QuantitativeData2 getQttvData() {
        return qttvData;
    }

    /**
     * Sets the value of the qttvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeData2 }
     *     
     */
    public ReportData2Choice setQttvData(QuantitativeData2 value) {
        this.qttvData = value;
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
