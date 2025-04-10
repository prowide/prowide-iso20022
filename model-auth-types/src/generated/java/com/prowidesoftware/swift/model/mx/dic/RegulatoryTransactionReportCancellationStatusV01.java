
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
 * A regulator or an intermediary sends the RegulatoryTransactionReportCancellationStatus to a reporting institution to provide the status of a RegulatoryTransactionReportCancellationRequest previously sent by the reporting institution.
 * Usage
 * The message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:
 * - Completed, or,
 * - Pending, or,
 * - Rejected.
 * If the status is rejected, then reason for the rejection must be specified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryTransactionReportCancellationStatusV01", propOrder = {
    "id",
    "rptgInstn",
    "rptCxlSts",
    "indvTxCxlSts"
})
public class RegulatoryTransactionReportCancellationStatusV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "RptgInstn", required = true)
    protected PartyIdentification23Choice rptgInstn;
    @XmlElement(name = "RptCxlSts")
    protected ReportStatusAndReason2 rptCxlSts;
    @XmlElement(name = "IndvTxCxlSts")
    protected List<TradeTransactionStatusAndReason2> indvTxCxlSts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public RegulatoryTransactionReportCancellationStatusV01 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rptgInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification23Choice }
     *     
     */
    public PartyIdentification23Choice getRptgInstn() {
        return rptgInstn;
    }

    /**
     * Sets the value of the rptgInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification23Choice }
     *     
     */
    public RegulatoryTransactionReportCancellationStatusV01 setRptgInstn(PartyIdentification23Choice value) {
        this.rptgInstn = value;
        return this;
    }

    /**
     * Gets the value of the rptCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportStatusAndReason2 }
     *     
     */
    public ReportStatusAndReason2 getRptCxlSts() {
        return rptCxlSts;
    }

    /**
     * Sets the value of the rptCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStatusAndReason2 }
     *     
     */
    public RegulatoryTransactionReportCancellationStatusV01 setRptCxlSts(ReportStatusAndReason2 value) {
        this.rptCxlSts = value;
        return this;
    }

    /**
     * Gets the value of the indvTxCxlSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTxCxlSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTxCxlSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionStatusAndReason2 }
     * 
     * 
     * @return
     *     The value of the indvTxCxlSts property.
     */
    public List<TradeTransactionStatusAndReason2> getIndvTxCxlSts() {
        if (indvTxCxlSts == null) {
            indvTxCxlSts = new ArrayList<>();
        }
        return this.indvTxCxlSts;
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
     * Adds a new item to the indvTxCxlSts list.
     * @see #getIndvTxCxlSts()
     * 
     */
    public RegulatoryTransactionReportCancellationStatusV01 addIndvTxCxlSts(TradeTransactionStatusAndReason2 indvTxCxlSts) {
        getIndvTxCxlSts().add(indvTxCxlSts);
        return this;
    }

}
