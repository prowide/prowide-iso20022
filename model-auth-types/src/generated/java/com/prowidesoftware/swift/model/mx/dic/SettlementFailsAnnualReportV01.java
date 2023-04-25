
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
 * The SettlementFailsAnnualReport is sent by a central securities depository or by a central bank operating a securities settlement system to the CSD competent authority to provide annual aggregated data on the number and the nature of settlement instructions which failed to settle on their intended settlement day. The report contains annual statistical information on the number and value of overall settlement instructions, settled instructions, and settlement fails that occurred during a specified period and within a given securities settlement system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsAnnualReportV01", propOrder = {
    "rptHdr",
    "anlAggt",
    "splmtryData"
})
public class SettlementFailsAnnualReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SettlementFailsReportHeader2 rptHdr;
    @XmlElement(name = "AnlAggt", required = true)
    protected SettlementFailsData4 anlAggt;
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
    public SettlementFailsAnnualReportV01 setRptHdr(SettlementFailsReportHeader2 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the anlAggt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsData4 }
     *     
     */
    public SettlementFailsData4 getAnlAggt() {
        return anlAggt;
    }

    /**
     * Sets the value of the anlAggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsData4 }
     *     
     */
    public SettlementFailsAnnualReportV01 setAnlAggt(SettlementFailsData4 value) {
        this.anlAggt = value;
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
    public SettlementFailsAnnualReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
