
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
 * This message is sent by the central counterparty (CCP) to a clearing member to report on the settlement obligation that will be submitted for settlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligationReportV01", propOrder = {
    "id",
    "pgntn",
    "rptParams",
    "clrMmb",
    "clrSgmt",
    "dlvryAcct",
    "rptDtls",
    "dlvrgPties",
    "rcvgPties",
    "splmtryData"
})
public class SettlementObligationReportV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters4 rptParams;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "DlvryAcct", required = true)
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "RptDtls", required = true)
    protected List<Report1> rptDtls;
    @XmlElement(name = "DlvrgPties")
    protected List<DeliveringPartiesAndAccount5> dlvrgPties;
    @XmlElement(name = "RcvgPties")
    protected List<ReceivingPartiesAndAccount6> rcvgPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public SettlementObligationReportV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public SettlementObligationReportV01 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters4 }
     *     
     */
    public ReportParameters4 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters4 }
     *     
     */
    public SettlementObligationReportV01 setRptParams(ReportParameters4 value) {
        this.rptParams = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public SettlementObligationReportV01 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public SettlementObligationReportV01 setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Sets the value of the dlvryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SettlementObligationReportV01 setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
        return this;
    }

    /**
     * Gets the value of the rptDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report1 }
     * 
     * 
     */
    public List<Report1> getRptDtls() {
        if (rptDtls == null) {
            rptDtls = new ArrayList<Report1>();
        }
        return this.rptDtls;
    }

    /**
     * Gets the value of the dlvrgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvrgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvrgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveringPartiesAndAccount5 }
     * 
     * 
     */
    public List<DeliveringPartiesAndAccount5> getDlvrgPties() {
        if (dlvrgPties == null) {
            dlvrgPties = new ArrayList<DeliveringPartiesAndAccount5>();
        }
        return this.dlvrgPties;
    }

    /**
     * Gets the value of the rcvgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcvgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcvgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivingPartiesAndAccount6 }
     * 
     * 
     */
    public List<ReceivingPartiesAndAccount6> getRcvgPties() {
        if (rcvgPties == null) {
            rcvgPties = new ArrayList<ReceivingPartiesAndAccount6>();
        }
        return this.rcvgPties;
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
     * Adds a new item to the rptDtls list.
     * @see #getRptDtls()
     * 
     */
    public SettlementObligationReportV01 addRptDtls(Report1 rptDtls) {
        getRptDtls().add(rptDtls);
        return this;
    }

    /**
     * Adds a new item to the dlvrgPties list.
     * @see #getDlvrgPties()
     * 
     */
    public SettlementObligationReportV01 addDlvrgPties(DeliveringPartiesAndAccount5 dlvrgPties) {
        getDlvrgPties().add(dlvrgPties);
        return this;
    }

    /**
     * Adds a new item to the rcvgPties list.
     * @see #getRcvgPties()
     * 
     */
    public SettlementObligationReportV01 addRcvgPties(ReceivingPartiesAndAccount6 rcvgPties) {
        getRcvgPties().add(rcvgPties);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SettlementObligationReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
