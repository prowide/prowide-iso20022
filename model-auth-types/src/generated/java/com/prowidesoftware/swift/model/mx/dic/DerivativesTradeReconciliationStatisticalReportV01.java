
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
 * The DerivativesTradeReportReconciliationStatistics message is sent by the the trade repositories to the supervisory authority system, to report cumulative information within the reference period for the reconciliation status of the reported and outstanding derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesTradeReconciliationStatisticalReportV01", propOrder = {
    "sttstcsPerCtrPty",
    "splmtryData"
})
public class DerivativesTradeReconciliationStatisticalReportV01 {

    @XmlElement(name = "SttstcsPerCtrPty", required = true)
    protected List<DetailedStatisticsPerCounterparty4> sttstcsPerCtrPty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the sttstcsPerCtrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttstcsPerCtrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttstcsPerCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedStatisticsPerCounterparty4 }
     * 
     * 
     */
    public List<DetailedStatisticsPerCounterparty4> getSttstcsPerCtrPty() {
        if (sttstcsPerCtrPty == null) {
            sttstcsPerCtrPty = new ArrayList<DetailedStatisticsPerCounterparty4>();
        }
        return this.sttstcsPerCtrPty;
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
     * Adds a new item to the sttstcsPerCtrPty list.
     * @see #getSttstcsPerCtrPty()
     * 
     */
    public DerivativesTradeReconciliationStatisticalReportV01 addSttstcsPerCtrPty(DetailedStatisticsPerCounterparty4 sttstcsPerCtrPty) {
        getSttstcsPerCtrPty().add(sttstcsPerCtrPty);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DerivativesTradeReconciliationStatisticalReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
