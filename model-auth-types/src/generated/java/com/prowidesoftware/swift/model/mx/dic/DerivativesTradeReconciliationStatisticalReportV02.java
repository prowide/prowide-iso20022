
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
 * The DerivativesTradeReportReconciliationStatisticalReport message is sent by the trade repositories to the reporting counterparty, to report cumulative information within the reference period for the reconciliation status of the reported and outstanding derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativesTradeReconciliationStatisticalReportV02", propOrder = {
    "rcncltnSttstcs",
    "splmtryData"
})
public class DerivativesTradeReconciliationStatisticalReportV02 {

    @XmlElement(name = "RcncltnSttstcs", required = true)
    protected StatisticsPerCounterparty15Choice rcncltnSttstcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rcncltnSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPerCounterparty15Choice }
     *     
     */
    public StatisticsPerCounterparty15Choice getRcncltnSttstcs() {
        return rcncltnSttstcs;
    }

    /**
     * Sets the value of the rcncltnSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPerCounterparty15Choice }
     *     
     */
    public DerivativesTradeReconciliationStatisticalReportV02 setRcncltnSttstcs(StatisticsPerCounterparty15Choice value) {
        this.rcncltnSttstcs = value;
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
    public DerivativesTradeReconciliationStatisticalReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
