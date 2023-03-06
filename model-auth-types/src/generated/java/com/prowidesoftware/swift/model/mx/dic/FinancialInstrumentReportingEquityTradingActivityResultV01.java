
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
 * The FinancialInstrumentReportingEquityTradingActivityResult message is sent by a national competent authority to report on computed results data of equity specific trading activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentReportingEquityTradingActivityResultV01", propOrder = {
    "rptHdr",
    "eqtyTrnsprncyData",
    "splmtryData"
})
public class FinancialInstrumentReportingEquityTradingActivityResultV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SecuritiesMarketReportHeader1 rptHdr;
    @XmlElement(name = "EqtyTrnsprncyData", required = true)
    protected List<TransparencyDataReport12> eqtyTrnsprncyData;
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
    public FinancialInstrumentReportingEquityTradingActivityResultV01 setRptHdr(SecuritiesMarketReportHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the eqtyTrnsprncyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eqtyTrnsprncyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqtyTrnsprncyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransparencyDataReport12 }
     * 
     * 
     */
    public List<TransparencyDataReport12> getEqtyTrnsprncyData() {
        if (eqtyTrnsprncyData == null) {
            eqtyTrnsprncyData = new ArrayList<TransparencyDataReport12>();
        }
        return this.eqtyTrnsprncyData;
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
     * Adds a new item to the eqtyTrnsprncyData list.
     * @see #getEqtyTrnsprncyData()
     * 
     */
    public FinancialInstrumentReportingEquityTradingActivityResultV01 addEqtyTrnsprncyData(TransparencyDataReport12 eqtyTrnsprncyData) {
        getEqtyTrnsprncyData().add(eqtyTrnsprncyData);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public FinancialInstrumentReportingEquityTradingActivityResultV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
