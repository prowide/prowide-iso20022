
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
 * The MoneyMarketFundReport message is sent by the reporting agent to the relevant competent authority of the money market fund, to report quarterly or yearly activity details of the money market fund.
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketFundReportV01", propOrder = {
    "rptHdr",
    "fndRpt",
    "splmtryData"
})
public class MoneyMarketFundReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected MoneyMarketFundReportHeader2 rptHdr;
    @XmlElement(name = "FndRpt", required = true)
    protected FundReportData1Choice fndRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketFundReportHeader2 }
     *     
     */
    public MoneyMarketFundReportHeader2 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketFundReportHeader2 }
     *     
     */
    public MoneyMarketFundReportV01 setRptHdr(MoneyMarketFundReportHeader2 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the fndRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundReportData1Choice }
     *     
     */
    public FundReportData1Choice getFndRpt() {
        return fndRpt;
    }

    /**
     * Sets the value of the fndRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReportData1Choice }
     *     
     */
    public MoneyMarketFundReportV01 setFndRpt(FundReportData1Choice value) {
        this.fndRpt = value;
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
    public MoneyMarketFundReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
