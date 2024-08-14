
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
 * Provides detailed information on the number of transactions that are reported with a specific transaction status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfRecordsPerStatus1", propOrder = {
    "dtldNbOfRcrds",
    "dtldSts"
})
public class NumberOfRecordsPerStatus1 {

    @XmlElement(name = "DtldNbOfRcrds", required = true)
    protected String dtldNbOfRcrds;
    @XmlElement(name = "DtldSts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportingRecordStatus1Code dtldSts;

    /**
     * Gets the value of the dtldNbOfRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldNbOfRcrds() {
        return dtldNbOfRcrds;
    }

    /**
     * Sets the value of the dtldNbOfRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NumberOfRecordsPerStatus1 setDtldNbOfRcrds(String value) {
        this.dtldNbOfRcrds = value;
        return this;
    }

    /**
     * Gets the value of the dtldSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRecordStatus1Code }
     *     
     */
    public ReportingRecordStatus1Code getDtldSts() {
        return dtldSts;
    }

    /**
     * Sets the value of the dtldSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRecordStatus1Code }
     *     
     */
    public NumberOfRecordsPerStatus1 setDtldSts(ReportingRecordStatus1Code value) {
        this.dtldSts = value;
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
