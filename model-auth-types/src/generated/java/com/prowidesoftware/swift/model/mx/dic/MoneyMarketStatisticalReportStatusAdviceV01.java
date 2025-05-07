
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
 * The MoneyMarketStatisticalReportStatusAdvice message is sent by the relevant competent authority to the reporting agents to provide the status on the reported transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketStatisticalReportStatusAdviceV01", propOrder = {
    "stsRptHdr",
    "txSts",
    "splmtryData"
})
public class MoneyMarketStatisticalReportStatusAdviceV01 {

    @XmlElement(name = "StsRptHdr", required = true)
    protected MoneyMarketStatusReportHeader1 stsRptHdr;
    @XmlElement(name = "TxSts")
    protected List<MoneyMarketTransactionStatus2> txSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsRptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketStatusReportHeader1 }
     *     
     */
    public MoneyMarketStatusReportHeader1 getStsRptHdr() {
        return stsRptHdr;
    }

    /**
     * Sets the value of the stsRptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketStatusReportHeader1 }
     *     
     */
    public MoneyMarketStatisticalReportStatusAdviceV01 setStsRptHdr(MoneyMarketStatusReportHeader1 value) {
        this.stsRptHdr = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyMarketTransactionStatus2 }
     * 
     * 
     */
    public List<MoneyMarketTransactionStatus2> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<MoneyMarketTransactionStatus2>();
        }
        return this.txSts;
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
     * Adds a new item to the txSts list.
     * @see #getTxSts()
     * 
     */
    public MoneyMarketStatisticalReportStatusAdviceV01 addTxSts(MoneyMarketTransactionStatus2 txSts) {
        getTxSts().add(txSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MoneyMarketStatisticalReportStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
