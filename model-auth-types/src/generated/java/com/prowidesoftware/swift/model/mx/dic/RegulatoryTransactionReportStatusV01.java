
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
 * A regulator or an intermediary sends the RegulatoryTransactionReportStatus to a reporting institution to provide the status of a RegulatoryTransactionReport previously sent by the reporting institution.
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
@XmlType(name = "RegulatoryTransactionReportStatusV01", propOrder = {
    "id",
    "rptgInstn",
    "rptSts",
    "indvTxSts"
})
public class RegulatoryTransactionReportStatusV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "RptgInstn", required = true)
    protected PartyIdentification23Choice rptgInstn;
    @XmlElement(name = "RptSts")
    protected ReportStatusAndReason1 rptSts;
    @XmlElement(name = "IndvTxSts")
    protected List<TradeTransactionStatusAndReason1> indvTxSts;

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
    public RegulatoryTransactionReportStatusV01 setId(DocumentIdentification8 value) {
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
    public RegulatoryTransactionReportStatusV01 setRptgInstn(PartyIdentification23Choice value) {
        this.rptgInstn = value;
        return this;
    }

    /**
     * Gets the value of the rptSts property.
     * 
     * @return
     *     possible object is
     *     {@link ReportStatusAndReason1 }
     *     
     */
    public ReportStatusAndReason1 getRptSts() {
        return rptSts;
    }

    /**
     * Sets the value of the rptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStatusAndReason1 }
     *     
     */
    public RegulatoryTransactionReportStatusV01 setRptSts(ReportStatusAndReason1 value) {
        this.rptSts = value;
        return this;
    }

    /**
     * Gets the value of the indvTxSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTxSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionStatusAndReason1 }
     * 
     * 
     * @return
     *     The value of the indvTxSts property.
     */
    public List<TradeTransactionStatusAndReason1> getIndvTxSts() {
        if (indvTxSts == null) {
            indvTxSts = new ArrayList<>();
        }
        return this.indvTxSts;
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
     * Adds a new item to the indvTxSts list.
     * @see #getIndvTxSts()
     * 
     */
    public RegulatoryTransactionReportStatusV01 addIndvTxSts(TradeTransactionStatusAndReason1 indvTxSts) {
        getIndvTxSts().add(indvTxSts);
        return this;
    }

}
