
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
 * Scope
 * The MarginReport message is sent by the central counterparty (CCP) to a clearing member to report on:
 * - the exposure resulting from the trade positions
 * - the value of the collateral held by the CCP (market value of this collateral) and
 * - the resulting difference representing the risk encountered by the CCP.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * There are four possibilities to report the above information. Indeed, the margin report may be structured as follows:
 * - per clearing member: the report will only show the information for the clearing member, or
 * - per clearing member and per financial instrument: the report will show the information for the clearing member, structured by security identification, or
 * - per clearing member and per non clearing member: the report will show the information for the clearing member (that is for global clearing member only) structured by non clearing member(s), or
 * - per clearing member and per non clearing member and per security identification: the report will show the information for the clearing member (global clearing member only) structured by non clearing member(s) and by security identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginReportV02", propOrder = {
    "rptParams",
    "pgntn",
    "clrMmb",
    "rptSummry",
    "rptDtls",
    "splmtryData"
})
public class MarginReportV02 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters3 rptParams;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "RptSummry")
    protected MarginCalculation1 rptSummry;
    @XmlElement(name = "RptDtls", required = true)
    protected List<MarginReport2> rptDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters3 }
     *     
     */
    public ReportParameters3 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters3 }
     *     
     */
    public MarginReportV02 setRptParams(ReportParameters3 value) {
        this.rptParams = value;
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
    public MarginReportV02 setPgntn(Pagination value) {
        this.pgntn = value;
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
    public MarginReportV02 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the rptSummry property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCalculation1 }
     *     
     */
    public MarginCalculation1 getRptSummry() {
        return rptSummry;
    }

    /**
     * Sets the value of the rptSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCalculation1 }
     *     
     */
    public MarginReportV02 setRptSummry(MarginCalculation1 value) {
        this.rptSummry = value;
        return this;
    }

    /**
     * Gets the value of the rptDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptDtls property.
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
     * {@link MarginReport2 }
     * 
     * 
     * @return
     *     The value of the rptDtls property.
     */
    public List<MarginReport2> getRptDtls() {
        if (rptDtls == null) {
            rptDtls = new ArrayList<>();
        }
        return this.rptDtls;
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
     * Adds a new item to the rptDtls list.
     * @see #getRptDtls()
     * 
     */
    public MarginReportV02 addRptDtls(MarginReport2 rptDtls) {
        getRptDtls().add(rptDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MarginReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
