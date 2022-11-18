
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
 * Provides details on the reported trade transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeData29", propOrder = {
    "rptSttstcs",
    "txSttstcs",
    "splmtryData"
})
public class TradeData29 {

    @XmlElement(name = "RptSttstcs", required = true)
    protected List<DetailedReportStatistics5> rptSttstcs;
    @XmlElement(name = "TxSttstcs", required = true)
    protected List<DetailedTransactionStatistics2Choice> txSttstcs;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptSttstcs property.
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
     */
    public List<DetailedReportStatistics5> getRptSttstcs() {
        if (rptSttstcs == null) {
            rptSttstcs = new ArrayList<DetailedReportStatistics5>();
        }
        return this.rptSttstcs;
    }

    /**
     * Gets the value of the txSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSttstcs property.
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
     * {@link DetailedTransactionStatistics2Choice }
     * 
     * 
     */
    public List<DetailedTransactionStatistics2Choice> getTxSttstcs() {
        if (txSttstcs == null) {
            txSttstcs = new ArrayList<DetailedTransactionStatistics2Choice>();
        }
        return this.txSttstcs;
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
     * Adds a new item to the rptSttstcs list.
     * @see #getRptSttstcs()
     * 
     */
    public TradeData29 addRptSttstcs(DetailedReportStatistics5 rptSttstcs) {
        getRptSttstcs().add(rptSttstcs);
        return this;
    }

    /**
     * Adds a new item to the txSttstcs list.
     * @see #getTxSttstcs()
     * 
     */
    public TradeData29 addTxSttstcs(DetailedTransactionStatistics2Choice txSttstcs) {
        getTxSttstcs().add(txSttstcs);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeData29 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
