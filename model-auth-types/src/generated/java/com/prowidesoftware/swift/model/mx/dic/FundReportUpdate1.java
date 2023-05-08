
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the attributes for the creation or correction of the money market fund report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReportUpdate1", propOrder = {
    "rptgPrd",
    "fndData",
    "rptData"
})
public class FundReportUpdate1 {

    @XmlElement(name = "RptgPrd", required = true)
    protected Period4Choice rptgPrd;
    @XmlElement(name = "FndData", required = true)
    protected FinancialInstrument77 fndData;
    @XmlElement(name = "RptData", required = true)
    protected ReportData2Choice rptData;

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public FundReportUpdate1 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the fndData property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument77 }
     *     
     */
    public FinancialInstrument77 getFndData() {
        return fndData;
    }

    /**
     * Sets the value of the fndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument77 }
     *     
     */
    public FundReportUpdate1 setFndData(FinancialInstrument77 value) {
        this.fndData = value;
        return this;
    }

    /**
     * Gets the value of the rptData property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData2Choice }
     *     
     */
    public ReportData2Choice getRptData() {
        return rptData;
    }

    /**
     * Sets the value of the rptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData2Choice }
     *     
     */
    public FundReportUpdate1 setRptData(ReportData2Choice value) {
        this.rptData = value;
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
