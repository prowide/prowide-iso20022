
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
 * Detailed information of abnormal values.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAbnormalValuesStatistics4Choice", propOrder = {
    "dataSetActn",
    "rpt"
})
public class DetailedAbnormalValuesStatistics4Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity1Code dataSetActn;
    @XmlElement(name = "Rpt")
    protected DetailedTransactionStatistics28 rpt;

    /**
     * Gets the value of the dataSetActn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriodActivity1Code }
     *     
     */
    public ReportPeriodActivity1Code getDataSetActn() {
        return dataSetActn;
    }

    /**
     * Sets the value of the dataSetActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriodActivity1Code }
     *     
     */
    public DetailedAbnormalValuesStatistics4Choice setDataSetActn(ReportPeriodActivity1Code value) {
        this.dataSetActn = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics28 }
     *     
     */
    public DetailedTransactionStatistics28 getRpt() {
        return rpt;
    }

    /**
     * Sets the value of the rpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics28 }
     *     
     */
    public DetailedAbnormalValuesStatistics4Choice setRpt(DetailedTransactionStatistics28 value) {
        this.rpt = value;
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
