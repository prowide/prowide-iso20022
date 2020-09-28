
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
 * The SettlementInternaliserReport message is sent by the settlement internalisers to the relevant competent authority to report aggregated information on all securities transactions that they settle outside securities settlement systems, on a quarterly basis. The report contains aggregated information on the value and volume of all internalised settlement instructions (settled and failed) that have been performed during the period covered by the report, for financial instruments, types of transactions, types of clients and cash transfers.
 * 
 * Usage: 
 * This report may be used by settlement internalisers to provide aggregated information (volume and value) on internalised settlement instructions (settled and failed) to their competent authorities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserReportV01", propOrder = {
    "rptHdr",
    "sttlmIntlr",
    "issrCSD",
    "splmtryData"
})
public class SettlementInternaliserReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SettlementInternaliserReportHeader1 rptHdr;
    @XmlElement(name = "SttlmIntlr", required = true)
    protected SettlementInternaliser1 sttlmIntlr;
    @XmlElement(name = "IssrCSD", required = true)
    protected List<IssuerCSDReport1> issrCSD;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserReportHeader1 }
     *     
     */
    public SettlementInternaliserReportHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserReportHeader1 }
     *     
     */
    public SettlementInternaliserReportV01 setRptHdr(SettlementInternaliserReportHeader1 value) {
        this.rptHdr = value;
        return this;
    }

    /**
     * Gets the value of the sttlmIntlr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliser1 }
     *     
     */
    public SettlementInternaliser1 getSttlmIntlr() {
        return sttlmIntlr;
    }

    /**
     * Sets the value of the sttlmIntlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliser1 }
     *     
     */
    public SettlementInternaliserReportV01 setSttlmIntlr(SettlementInternaliser1 value) {
        this.sttlmIntlr = value;
        return this;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrCSD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrCSD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerCSDReport1 }
     * 
     * 
     */
    public List<IssuerCSDReport1> getIssrCSD() {
        if (issrCSD == null) {
            issrCSD = new ArrayList<IssuerCSDReport1>();
        }
        return this.issrCSD;
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
     * Adds a new item to the issrCSD list.
     * @see #getIssrCSD()
     * 
     */
    public SettlementInternaliserReportV01 addIssrCSD(IssuerCSDReport1 issrCSD) {
        getIssrCSD().add(issrCSD);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SettlementInternaliserReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
