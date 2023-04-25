
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData20", propOrder = {
    "rptSttstcs",
    "txSttstcs",
    "splmtryData"
})
public class TradeData20 {

    @XmlElement(name = "RptSttstcs", required = true)
    protected List<DetailedReportStatistics5> rptSttstcs;
    @XmlElement(name = "TxSttstcs", required = true)
    protected List<DetailedTransactionStatistics10> txSttstcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedReportStatistics5 }
     * 
     * 
     * @return
     *     The value of the rptSttstcs property.
     */
    public List<DetailedReportStatistics5> getRptSttstcs() {
        if (rptSttstcs == null) {
            rptSttstcs = new ArrayList<>();
        }
        return this.rptSttstcs;
    }

    /**
     * Gets the value of the txSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedTransactionStatistics10 }
     * 
     * 
     * @return
     *     The value of the txSttstcs property.
     */
    public List<DetailedTransactionStatistics10> getTxSttstcs() {
        if (txSttstcs == null) {
            txSttstcs = new ArrayList<>();
        }
        return this.txSttstcs;
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
     * Adds a new item to the rptSttstcs list.
     * @see #getRptSttstcs()
     * 
     */
    public TradeData20 addRptSttstcs(DetailedReportStatistics5 rptSttstcs) {
        getRptSttstcs().add(rptSttstcs);
        return this;
    }

    /**
     * Adds a new item to the txSttstcs list.
     * @see #getTxSttstcs()
     * 
     */
    public TradeData20 addTxSttstcs(DetailedTransactionStatistics10 txSttstcs) {
        getTxSttstcs().add(txSttstcs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeData20 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
