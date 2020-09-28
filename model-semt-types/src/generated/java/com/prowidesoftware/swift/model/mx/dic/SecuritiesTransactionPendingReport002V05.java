
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
 * An account servicer sends a SecuritiesTransactionPendingReport to an account owner to provide, as at a specified time, the details of pending increases and decreases of holdings, for all or selected securities in a specified safekeeping account, for all or selected reasons why the transaction is pending.
 *  
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or 
 * - a custodian acting on behalf of an investment management institution or a broker/dealer.
 * 
 * Usage
 * The statement may also include future settlement or forward transactions which have become binding on the account owner.
 * 
 * The message may also be used to: 
 * 
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive.The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset.
 * 
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows:  CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPendingReport002V05", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "sfkpgAcct",
    "sts",
    "txs"
})
public class SecuritiesTransactionPendingReport002V05 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement26 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification51Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount17 sfkpgAcct;
    @XmlElement(name = "Sts")
    protected List<StatusAndReason21> sts;
    @XmlElement(name = "Txs")
    protected List<Transaction38> txs;

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
    public SecuritiesTransactionPendingReport002V05 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement26 }
     *     
     */
    public Statement26 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement26 }
     *     
     */
    public SecuritiesTransactionPendingReport002V05 setStmtGnlDtls(Statement26 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public PartyIdentification51Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification51Choice }
     *     
     */
    public SecuritiesTransactionPendingReport002V05 setAcctOwnr(PartyIdentification51Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesAccount17 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount17 }
     *     
     */
    public SecuritiesTransactionPendingReport002V05 setSfkpgAcct(SecuritiesAccount17 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sts property.
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
     * {@link StatusAndReason21 }
     * 
     * 
     */
    public List<StatusAndReason21> getSts() {
        if (sts == null) {
            sts = new ArrayList<StatusAndReason21>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the txs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txs property.
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
     * {@link Transaction38 }
     * 
     * 
     */
    public List<Transaction38> getTxs() {
        if (txs == null) {
            txs = new ArrayList<Transaction38>();
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
    public SecuritiesTransactionPendingReport002V05 addSts(StatusAndReason21 sts) {
        getSts().add(sts);
        return this;
    }

    /**
     * Adds a new item to the txs list.
     * @see #getTxs()
     * 
     */
    public SecuritiesTransactionPendingReport002V05 addTxs(Transaction38 txs) {
        getTxs().add(txs);
        return this;
    }

}
