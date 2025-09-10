
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The CCPAvailableFinancialResourcesReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority of the aggregate quantum of resources available in each default waterfall to absorb losses resulting from the failure of one or more clearing member(s).
 * 
 * V02 amends the reporting asset types to be consistent across the scope of CCP Supervisory Reporting data collection.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPAvailableFinancialResourcesReportV02", propOrder = {
    "avlblFinRsrcsAmt",
    "othrPrfnddRsrcs",
    "splmtryData"
})
public class CCPAvailableFinancialResourcesReportV02 {

    @XmlElement(name = "AvlblFinRsrcsAmt", required = true)
    protected AvailableFinancialResourcesAmount2 avlblFinRsrcsAmt;
    @XmlElement(name = "OthrPrfnddRsrcs")
    protected ReportingAssetBreakdown2 othrPrfnddRsrcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the avlblFinRsrcsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableFinancialResourcesAmount2 }
     *     
     */
    public AvailableFinancialResourcesAmount2 getAvlblFinRsrcsAmt() {
        return avlblFinRsrcsAmt;
    }

    /**
     * Sets the value of the avlblFinRsrcsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableFinancialResourcesAmount2 }
     *     
     */
    public CCPAvailableFinancialResourcesReportV02 setAvlblFinRsrcsAmt(AvailableFinancialResourcesAmount2 value) {
        this.avlblFinRsrcsAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrPrfnddRsrcs property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingAssetBreakdown2 }
     *     
     */
    public ReportingAssetBreakdown2 getOthrPrfnddRsrcs() {
        return othrPrfnddRsrcs;
    }

    /**
     * Sets the value of the othrPrfnddRsrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingAssetBreakdown2 }
     *     
     */
    public CCPAvailableFinancialResourcesReportV02 setOthrPrfnddRsrcs(ReportingAssetBreakdown2 value) {
        this.othrPrfnddRsrcs = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CCPAvailableFinancialResourcesReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
