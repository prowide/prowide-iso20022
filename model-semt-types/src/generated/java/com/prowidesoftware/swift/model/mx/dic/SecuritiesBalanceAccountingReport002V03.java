
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
 * An account servicer sends a SecuritiesBalanceAccountingReport to an account owner to provide, at a moment in time, valuations of the portfolio together with details of each financial instrument holding.
 * The account servicer/owner relationship may be:
 * - an accounting agent acting on behalf of an account owner, or
 * - a transfer agent acting on behalf of a fund manager or an account owner's designated agent.
 * Usage
 * The message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.
 * The message can be sent either audited or un-audited and may be provided on a trade date, contractual or settlement date basis.
 * This message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, the message can be used to either specify holdings at
 * - the main account level, or,
 * - the sub-account level.
 * This message can be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated.
 * The SecuritiesBalanceAccountingReport message should not be used for trading purposes.
 * There may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence Subset
 * This message definition is a subset of an ISO 20022 message that was reversed engineered from ISO 15022. A subset is a message definition that is compatible with another definition, but is more restrictive
 * The ISO 15022 and ISO 20022 standards will coexist for a number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. These restrictions, which are described by textual usage rules in the ISO 20022 message, have been made mandatory in this subset. 
 * NOTE: The ISO 20022 message coexistence textual rules have been kept in the subset to explain why specific data types have been restricted. These textual rules are identified as follows: CoexistenceXxxxRule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceAccountingReport.002V03", propOrder = {
    "id",
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "acctSvcr",
    "sfkpgAcct",
    "intrmyInf",
    "balForAcct",
    "subAcctDtls",
    "acctBaseCcyTtlAmts",
    "altrnRptgCcyTtlAmts",
    "msgOrgtr",
    "msgRcpt"
})
public class SecuritiesBalanceAccountingReport002V03 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification16 id;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement24 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification18Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification16Choice acctSvcr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount15 sfkpgAcct;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary3> intrmyInf;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation11> balForAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification13> subAcctDtls;
    @XmlElement(name = "AcctBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement4 acctBaseCcyTtlAmts;
    @XmlElement(name = "AltrnRptgCcyTtlAmts")
    protected TotalValueInPageAndStatement4 altrnRptgCcyTtlAmts;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification16Choice msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification16Choice msgRcpt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification16 }
     *     
     */
    public DocumentIdentification16 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification16 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setId(DocumentIdentification16 value) {
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
    public SecuritiesBalanceAccountingReport002V03 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement24 }
     *     
     */
    public Statement24 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement24 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setStmtGnlDtls(Statement24 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public PartyIdentification18Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification18Choice }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setAcctOwnr(PartyIdentification18Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setAcctSvcr(PartyIdentification16Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount15 }
     *     
     */
    public SecuritiesAccount15 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount15 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setSfkpgAcct(SecuritiesAccount15 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary3 }
     * 
     * 
     */
    public List<Intermediary3> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary3>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the balForAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balForAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalanceInformation11 }
     * 
     * 
     */
    public List<AggregateBalanceInformation11> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<AggregateBalanceInformation11>();
        }
        return this.balForAcct;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAccountIdentification13 }
     * 
     * 
     */
    public List<SubAccountIdentification13> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<SubAccountIdentification13>();
        }
        return this.subAcctDtls;
    }

    /**
     * Gets the value of the acctBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement4 }
     *     
     */
    public TotalValueInPageAndStatement4 getAcctBaseCcyTtlAmts() {
        return acctBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the acctBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement4 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setAcctBaseCcyTtlAmts(TotalValueInPageAndStatement4 value) {
        this.acctBaseCcyTtlAmts = value;
        return this;
    }

    /**
     * Gets the value of the altrnRptgCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement4 }
     *     
     */
    public TotalValueInPageAndStatement4 getAltrnRptgCcyTtlAmts() {
        return altrnRptgCcyTtlAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement4 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setAltrnRptgCcyTtlAmts(TotalValueInPageAndStatement4 value) {
        this.altrnRptgCcyTtlAmts = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setMsgOrgtr(PartyIdentification16Choice value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public PartyIdentification16Choice getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification16Choice }
     *     
     */
    public SecuritiesBalanceAccountingReport002V03 setMsgRcpt(PartyIdentification16Choice value) {
        this.msgRcpt = value;
        return this;
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
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public SecuritiesBalanceAccountingReport002V03 addIntrmyInf(Intermediary3 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the balForAcct list.
     * @see #getBalForAcct()
     * 
     */
    public SecuritiesBalanceAccountingReport002V03 addBalForAcct(AggregateBalanceInformation11 balForAcct) {
        getBalForAcct().add(balForAcct);
        return this;
    }

    /**
     * Adds a new item to the subAcctDtls list.
     * @see #getSubAcctDtls()
     * 
     */
    public SecuritiesBalanceAccountingReport002V03 addSubAcctDtls(SubAccountIdentification13 subAcctDtls) {
        getSubAcctDtls().add(subAcctDtls);
        return this;
    }

}
