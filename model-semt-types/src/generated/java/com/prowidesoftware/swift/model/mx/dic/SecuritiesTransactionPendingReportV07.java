
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
 * An account servicer sends a SecuritiesTransactionPendingReport to an account owner to provide, as at a specified time, the details of pending increases and decreases of holdings, for all or selected securities in a specified safekeeping account, for all or selected reasons why the transaction is pending. 
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or 
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * 
 * Usage
 * The statement may also include future settlement or forward transactions which have become binding on the account owner.
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPendingReportV07", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "sfkpgAcct",
    "sts",
    "txs"
})
public class SecuritiesTransactionPendingReportV07 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement41 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification98 acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount24 sfkpgAcct;
    @XmlElement(name = "Sts")
    protected List<StatusAndReason27> sts;
    @XmlElement(name = "Txs")
    protected List<Transaction47> txs;

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
    public SecuritiesTransactionPendingReportV07 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement41 }
     *     
     */
    public Statement41 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement41 }
     *     
     */
    public SecuritiesTransactionPendingReportV07 setStmtGnlDtls(Statement41 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification98 }
     *     
     */
    public PartyIdentification98 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification98 }
     *     
     */
    public SecuritiesTransactionPendingReportV07 setAcctOwnr(PartyIdentification98 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount24 }
     *     
     */
    public SecuritiesAccount24 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount24 }
     *     
     */
    public SecuritiesTransactionPendingReportV07 setSfkpgAcct(SecuritiesAccount24 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusAndReason27 }
     * 
     * 
     * @return
     *     The value of the sts property.
     */
    public List<StatusAndReason27> getSts() {
        if (sts == null) {
            sts = new ArrayList<>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the txs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction47 }
     * 
     * 
     * @return
     *     The value of the txs property.
     */
    public List<Transaction47> getTxs() {
        if (txs == null) {
            txs = new ArrayList<>();
        }
        return this.txs;
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
     * Adds a new item to the sts list.
     * @see #getSts()
     * 
     */
    public SecuritiesTransactionPendingReportV07 addSts(StatusAndReason27 sts) {
        getSts().add(sts);
        return this;
    }

    /**
     * Adds a new item to the txs list.
     * @see #getTxs()
     * 
     */
    public SecuritiesTransactionPendingReportV07 addTxs(Transaction47 txs) {
        getTxs().add(txs);
        return this;
    }

}
