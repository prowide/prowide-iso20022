
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The CCPAvailableFinancialResourcesReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority of the aggregate quantum of resources available in each default waterfall to absorb losses resulting from the failure of one or more clearing member(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPAvailableFinancialResourcesReportV01", propOrder = {
    "avlblFinRsrcsAmt",
    "othrPrfnddRsrcs",
    "splmtryData"
})
public class CCPAvailableFinancialResourcesReportV01 {

    @XmlElement(name = "AvlblFinRsrcsAmt", required = true)
    protected AvailableFinancialResourcesAmount1 avlblFinRsrcsAmt;
    @XmlElement(name = "OthrPrfnddRsrcs")
    protected ReportingAssetBreakdown1 othrPrfnddRsrcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the avlblFinRsrcsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableFinancialResourcesAmount1 }
     *     
     */
    public AvailableFinancialResourcesAmount1 getAvlblFinRsrcsAmt() {
        return avlblFinRsrcsAmt;
    }

    /**
     * Sets the value of the avlblFinRsrcsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableFinancialResourcesAmount1 }
     *     
     */
    public CCPAvailableFinancialResourcesReportV01 setAvlblFinRsrcsAmt(AvailableFinancialResourcesAmount1 value) {
        this.avlblFinRsrcsAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrPrfnddRsrcs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingAssetBreakdown1 }
     *     
     */
    public ReportingAssetBreakdown1 getOthrPrfnddRsrcs() {
        return othrPrfnddRsrcs;
    }

    /**
     * Sets the value of the othrPrfnddRsrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingAssetBreakdown1 }
     *     
     */
    public CCPAvailableFinancialResourcesReportV01 setOthrPrfnddRsrcs(ReportingAssetBreakdown1 value) {
        this.othrPrfnddRsrcs = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPAvailableFinancialResourcesReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
