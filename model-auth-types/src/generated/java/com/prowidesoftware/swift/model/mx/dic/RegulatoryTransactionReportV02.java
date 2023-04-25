
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
 * A reporting institution, eg, an investment bank, sends the RegulatoryTransactionReport to a regulator or an intermediary (eg a reporting agent), to report the transaction details of a trade that has been executed on or off-exchange.
 * Usage
 * The message definition can be used to report more than one transaction. The message definition can also be used to specify, on a trade by trade basis, to which authorities the transaction report(s) need to be sent using the TransactionReportMarker.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryTransactionReportV02", propOrder = {
    "id",
    "txDtls",
    "rptgInstn",
    "rptgAgt",
    "xtnsn"
})
public class RegulatoryTransactionReportV02 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "TxDtls", required = true)
    protected List<TransactionDetails3> txDtls;
    @XmlElement(name = "RptgInstn", required = true)
    protected PartyIdentification23Choice rptgInstn;
    @XmlElement(name = "RptgAgt")
    protected PartyIdentification24Choice rptgAgt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

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
    public RegulatoryTransactionReportV02 setId(DocumentIdentification8 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDetails3 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<TransactionDetails3> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
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
    public RegulatoryTransactionReportV02 setRptgInstn(PartyIdentification23Choice value) {
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
    public RegulatoryTransactionReportV02 setRptgAgt(PartyIdentification24Choice value) {
        this.rptgAgt = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the txDtls list.
     * @see #getTxDtls()
     * 
     */
    public RegulatoryTransactionReportV02 addTxDtls(TransactionDetails3 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public RegulatoryTransactionReportV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
