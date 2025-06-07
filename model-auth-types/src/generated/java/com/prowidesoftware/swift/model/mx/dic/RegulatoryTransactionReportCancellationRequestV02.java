
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
 * Scope
 * A reporting institution, eg, an investment bank, sends the RegulatoryTransactionReportCancellationRequest to a regulator or to an intermediary (eg a reporting agent), to request a cancellation of a previously sent RegulatoryTransactionReport.
 * Usage
 * The message definition can be used to cancel an entire RegulatoryTransactionReport or to cancel one or more individual transactions in a previously sent RegulatoryTransactionReport.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryTransactionReportCancellationRequestV02", propOrder = {
    "id",
    "rptgInstn",
    "rptgAgt",
    "cxlByTxDtls",
    "prvsRef",
    "cxlByTradRef"
})
public class RegulatoryTransactionReportCancellationRequestV02 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "RptgInstn", required = true)
    protected PartyIdentification23Choice rptgInstn;
    @XmlElement(name = "RptgAgt")
    protected PartyIdentification24Choice rptgAgt;
    @XmlElement(name = "CxlByTxDtls")
    protected List<TransactionDetails3> cxlByTxDtls;
    @XmlElement(name = "PrvsRef")
    protected DocumentIdentification9 prvsRef;
    @XmlElement(name = "CxlByTradRef")
    protected List<TransactionDetails2> cxlByTradRef;

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
    public RegulatoryTransactionReportCancellationRequestV02 setId(DocumentIdentification8 value) {
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
    public RegulatoryTransactionReportCancellationRequestV02 setRptgInstn(PartyIdentification23Choice value) {
        this.rptgInstn = value;
        return this;
    }

    /**
     * Gets the value of the rptgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public PartyIdentification24Choice getRptgAgt() {
        return rptgAgt;
    }

    /**
     * Sets the value of the rptgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public RegulatoryTransactionReportCancellationRequestV02 setRptgAgt(PartyIdentification24Choice value) {
        this.rptgAgt = value;
        return this;
    }

    /**
     * Gets the value of the cxlByTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlByTxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlByTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDetails3 }
     * 
     * 
     */
    public List<TransactionDetails3> getCxlByTxDtls() {
        if (cxlByTxDtls == null) {
            cxlByTxDtls = new ArrayList<TransactionDetails3>();
        }
        return this.cxlByTxDtls;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public RegulatoryTransactionReportCancellationRequestV02 setPrvsRef(DocumentIdentification9 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlByTradRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlByTradRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlByTradRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDetails2 }
     * 
     * 
     */
    public List<TransactionDetails2> getCxlByTradRef() {
        if (cxlByTradRef == null) {
            cxlByTradRef = new ArrayList<TransactionDetails2>();
        }
        return this.cxlByTradRef;
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
     * Adds a new item to the cxlByTxDtls list.
     * @see #getCxlByTxDtls()
     * 
     */
    public RegulatoryTransactionReportCancellationRequestV02 addCxlByTxDtls(TransactionDetails3 cxlByTxDtls) {
        getCxlByTxDtls().add(cxlByTxDtls);
        return this;
    }

    /**
     * Adds a new item to the cxlByTradRef list.
     * @see #getCxlByTradRef()
     * 
     */
    public RegulatoryTransactionReportCancellationRequestV02 addCxlByTradRef(TransactionDetails2 cxlByTradRef) {
        getCxlByTradRef().add(cxlByTradRef);
        return this;
    }

}
