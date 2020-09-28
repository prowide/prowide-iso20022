
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
 * The SecuritesFinancingReportingReconciliationStatusAdvice message is sent by the trade repositories (TRs) to the reporting agent to provide a status advice for the correctness, issues or errors that arise.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingReportingReconciliationStatusAdviceV01", propOrder = {
    "pairgRcncltnSts",
    "rcncltnRpt",
    "splmtryData"
})
public class SecuritiesFinancingReportingReconciliationStatusAdviceV01 {

    @XmlElement(name = "PairgRcncltnSts")
    protected List<NumberOfReportsPerStatus2> pairgRcncltnSts;
    @XmlElement(name = "RcncltnRpt", required = true)
    protected List<ReconciliationReport3> rcncltnRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pairgRcncltnSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairgRcncltnSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairgRcncltnSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfReportsPerStatus2 }
     * 
     * 
     */
    public List<NumberOfReportsPerStatus2> getPairgRcncltnSts() {
        if (pairgRcncltnSts == null) {
            pairgRcncltnSts = new ArrayList<NumberOfReportsPerStatus2>();
        }
        return this.pairgRcncltnSts;
    }

    /**
     * Gets the value of the rcncltnRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcncltnRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationReport3 }
     * 
     * 
     */
    public List<ReconciliationReport3> getRcncltnRpt() {
        if (rcncltnRpt == null) {
            rcncltnRpt = new ArrayList<ReconciliationReport3>();
        }
        return this.rcncltnRpt;
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
     * Adds a new item to the pairgRcncltnSts list.
     * @see #getPairgRcncltnSts()
     * 
     */
    public SecuritiesFinancingReportingReconciliationStatusAdviceV01 addPairgRcncltnSts(NumberOfReportsPerStatus2 pairgRcncltnSts) {
        getPairgRcncltnSts().add(pairgRcncltnSts);
        return this;
    }

    /**
     * Adds a new item to the rcncltnRpt list.
     * @see #getRcncltnRpt()
     * 
     */
    public SecuritiesFinancingReportingReconciliationStatusAdviceV01 addRcncltnRpt(ReconciliationReport3 rcncltnRpt) {
        getRcncltnRpt().add(rcncltnRpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesFinancingReportingReconciliationStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
