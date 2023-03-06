
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
 * The SettlementFailsMonthlyReport is sent by central securities depository or by a central bank operating a securities settlement system to the CSD competent authority in its jurisdiction, to provide monthly and daily aggregated data on the number and the nature of settlement instructions which failed to settle on their intended settlement day. The report contains monthly and daily statistical information on the number and value of overall settlement instructions, settled instructions, and settlement fails that occurred during a specified period and within a given securities settlement system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsMonthlyReportV01", propOrder = {
    "rptHdr",
    "mnthlyAggt",
    "dalyData",
    "splmtryData"
})
public class SettlementFailsMonthlyReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SettlementFailsReportHeader2 rptHdr;
    @XmlElement(name = "MnthlyAggt", required = true)
    protected SettlementFailsData3 mnthlyAggt;
    @XmlElement(name = "DalyData", required = true)
    protected List<SettlementFailsDailyData3> dalyData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsReportHeader2 }
     *     
     */
    public SettlementFailsReportHeader2 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsReportHeader2 }
     *     
     */
    public SettlementFailsMonthlyReportV01 setRptHdr(SettlementFailsReportHeader2 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyAggt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsData3 }
     *     
     */
    public SettlementFailsData3 getMnthlyAggt() {
        return mnthlyAggt;
    }

    /**
     * Sets the value of the mnthlyAggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsData3 }
     *     
     */
    public SettlementFailsMonthlyReportV01 setMnthlyAggt(SettlementFailsData3 value) {
        this.mnthlyAggt = value;
        return this;
    }

    /**
     * Gets the value of the dalyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dalyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDalyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementFailsDailyData3 }
     * 
     * 
     */
    public List<SettlementFailsDailyData3> getDalyData() {
        if (dalyData == null) {
            dalyData = new ArrayList<SettlementFailsDailyData3>();
        }
        return this.dalyData;
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
     * Adds a new item to the dalyData list.
     * @see #getDalyData()
     * 
     */
    public SettlementFailsMonthlyReportV01 addDalyData(SettlementFailsDailyData3 dalyData) {
        getDalyData().add(dalyData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SettlementFailsMonthlyReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
