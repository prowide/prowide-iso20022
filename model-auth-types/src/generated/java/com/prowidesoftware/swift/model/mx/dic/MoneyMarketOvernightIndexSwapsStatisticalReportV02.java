
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
 * The MoneyMarketOvernightIndexSwapsStatisticalReport message is sent by the reporting agents to the relevant competent authority, to report the daily overnight index swaps (OIS) transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketOvernightIndexSwapsStatisticalReportV02", propOrder = {
    "rptHdr",
    "ovrnghtIndxSwpsRpt",
    "splmtryData"
})
public class MoneyMarketOvernightIndexSwapsStatisticalReportV02 {

    @XmlElement(name = "RptHdr", required = true)
    protected MoneyMarketReportHeader1 rptHdr;
    @XmlElement(name = "OvrnghtIndxSwpsRpt", required = true)
    protected OvernightIndexSwap4Choice ovrnghtIndxSwpsRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketReportHeader1 }
     *     
     */
    public MoneyMarketReportHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketReportHeader1 }
     *     
     */
    public MoneyMarketOvernightIndexSwapsStatisticalReportV02 setRptHdr(MoneyMarketReportHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the ovrnghtIndxSwpsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OvernightIndexSwap4Choice }
     *     
     */
    public OvernightIndexSwap4Choice getOvrnghtIndxSwpsRpt() {
        return ovrnghtIndxSwpsRpt;
    }

    /**
     * Sets the value of the ovrnghtIndxSwpsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvernightIndexSwap4Choice }
     *     
     */
    public MoneyMarketOvernightIndexSwapsStatisticalReportV02 setOvrnghtIndxSwpsRpt(OvernightIndexSwap4Choice value) {
        this.ovrnghtIndxSwpsRpt = value;
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
    public MoneyMarketOvernightIndexSwapsStatisticalReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
