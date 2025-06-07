
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
 * Information about number of transactions accepted and rejected and the reasons of the rejections.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics6Choice", propOrder = {
    "dataSetActn",
    "dtldSttstcs"
})
public class DetailedTransactionStatistics6Choice {

    @XmlElement(name = "DataSetActn")
    @XmlSchemaType(name = "string")
    protected ReportPeriodActivity1Code dataSetActn;
    @XmlElement(name = "DtldSttstcs")
    protected DetailedTransactionStatistics29 dtldSttstcs;

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
    public DetailedTransactionStatistics6Choice setDataSetActn(ReportPeriodActivity1Code value) {
        this.dataSetActn = value;
        return this;
    }

    /**
     * Gets the value of the dtldSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTransactionStatistics29 }
     *     
     */
    public DetailedTransactionStatistics29 getDtldSttstcs() {
        return dtldSttstcs;
    }

    /**
     * Sets the value of the dtldSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTransactionStatistics29 }
     *     
     */
    public DetailedTransactionStatistics6Choice setDtldSttstcs(DetailedTransactionStatistics29 value) {
        this.dtldSttstcs = value;
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
