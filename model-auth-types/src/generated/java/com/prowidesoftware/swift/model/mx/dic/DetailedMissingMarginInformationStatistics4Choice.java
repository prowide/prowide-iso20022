
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
 * Detailed information of no margin or outdated margin information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedMissingMarginInformationStatistics4Choice", propOrder = {
    "dataSetActn",
    "rpt"
})
public class DetailedMissingMarginInformationStatistics4Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity1Code dataSetActn;
    @XmlElement(name = "Rpt")
    protected DetailedTransactionStatistics26 rpt;

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
    public DetailedMissingMarginInformationStatistics4Choice setDataSetActn(ReportPeriodActivity1Code value) {
        this.dataSetActn = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics26 }
     *     
     */
    public DetailedTransactionStatistics26 getRpt() {
        return rpt;
    }

    /**
     * Sets the value of the rpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics26 }
     *     
     */
    public DetailedMissingMarginInformationStatistics4Choice setRpt(DetailedTransactionStatistics26 value) {
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
