
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
 * The FinancialInstrumentReportingNonEquityTradingActivityReport message is sent by the trading venue to the national competent authority to report on non-equity specific trading activity aggregated quantitative data, used for the transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentReportingNonEquityTradingActivityReportV01", propOrder = {
    "rptHdr",
    "nonEqtyTrnsprncyData",
    "splmtryData"
})
public class FinancialInstrumentReportingNonEquityTradingActivityReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SecuritiesMarketReportHeader1 rptHdr;
    @XmlElement(name = "NonEqtyTrnsprncyData", required = true)
    protected List<TransparencyDataReport15> nonEqtyTrnsprncyData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMarketReportHeader1 }
     *     
     */
    public SecuritiesMarketReportHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMarketReportHeader1 }
     *     
     */
    public FinancialInstrumentReportingNonEquityTradingActivityReportV01 setRptHdr(SecuritiesMarketReportHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the nonEqtyTrnsprncyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonEqtyTrnsprncyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonEqtyTrnsprncyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransparencyDataReport15 }
     * 
     * 
     */
    public List<TransparencyDataReport15> getNonEqtyTrnsprncyData() {
        if (nonEqtyTrnsprncyData == null) {
            nonEqtyTrnsprncyData = new ArrayList<TransparencyDataReport15>();
        }
        return this.nonEqtyTrnsprncyData;
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
     * Adds a new item to the nonEqtyTrnsprncyData list.
     * @see #getNonEqtyTrnsprncyData()
     * 
     */
    public FinancialInstrumentReportingNonEquityTradingActivityReportV01 addNonEqtyTrnsprncyData(TransparencyDataReport15 nonEqtyTrnsprncyData) {
        getNonEqtyTrnsprncyData().add(nonEqtyTrnsprncyData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FinancialInstrumentReportingNonEquityTradingActivityReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}