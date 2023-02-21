
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
 * is sent by the Executing/Servicing Party to the instructing party to inform about the cash penalties: 
 * - Newly computed cash penalties. For example, in case of a CSD, the information shall include the cash penalties that are either imposed or credited to all of its participants and the CSD itself; in case of a CSD participant, the information shall include the cash penalties that are either imposed or credited to the CSD participant itself.
 * - Modified penalties: to inform about the modifications occurred in existing cash penalties since the previous reporting.
 * - Aggregated amounts of cash penalties: to inform about the aggregated amounts of the cash penalties computed for the business days of a given period, for example the previous month.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPenaltiesReportV01", propOrder = {
    "rptPgntn",
    "rptGnlDtls",
    "acctSvcr",
    "pnlty",
    "splmtryData"
})
public class SecuritiesTransactionPenaltiesReportV01 {

    @XmlElement(name = "RptPgntn")
    protected Pagination1 rptPgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected PenaltyReport1 rptGnlDtls;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification136 acctSvcr;
    @XmlElement(name = "Pnlty")
    protected List<Penalty1> pnlty;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getRptPgntn() {
        return rptPgntn;
    }

    /**
     * Sets the value of the rptPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 setRptPgntn(Pagination1 value) {
        this.rptPgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyReport1 }
     *     
     */
    public PenaltyReport1 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyReport1 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 setRptGnlDtls(PenaltyReport1 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 setAcctSvcr(PartyIdentification136 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the pnlty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnlty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnlty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Penalty1 }
     * 
     * 
     */
    public List<Penalty1> getPnlty() {
        if (pnlty == null) {
            pnlty = new ArrayList<Penalty1>();
        }
        return this.pnlty;
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
     * Adds a new item to the pnlty list.
     * @see #getPnlty()
     * 
     */
    public SecuritiesTransactionPenaltiesReportV01 addPnlty(Penalty1 pnlty) {
        getPnlty().add(pnlty);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTransactionPenaltiesReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
