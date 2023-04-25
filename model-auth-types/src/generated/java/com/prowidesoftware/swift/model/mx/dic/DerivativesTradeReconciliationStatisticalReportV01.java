
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
 * The DerivativesTradeReportReconciliationStatisticalReport message is sent by the trade repositories to the supervisory authority system, to report cumulative information within the reference period for the reconciliation status of the reported and outstanding derivatives.
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
    protected StatisticsPerCounterparty1Choice sttstcsPerCtrPty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the sttstcsPerCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerCounterparty1Choice }
     *     
     */
    public StatisticsPerCounterparty1Choice getSttstcsPerCtrPty() {
        return sttstcsPerCtrPty;
    }

    /**
     * Sets the value of the sttstcsPerCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerCounterparty1Choice }
     *     
     */
    public DerivativesTradeReconciliationStatisticalReportV01 setSttstcsPerCtrPty(StatisticsPerCounterparty1Choice value) {
        this.sttstcsPerCtrPty = value;
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
    public DerivativesTradeReconciliationStatisticalReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
