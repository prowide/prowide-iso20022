
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
 * 
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
 * - re-send to a third party a copy of a message for information using the relevant elements in the Business Application Header.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceAccountingReportV10", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "acctSvcr",
    "sfkpgAcct",
    "intrmyInf",
    "balForAcct",
    "subAcctDtls",
    "acctBaseCcyTtlAmts",
    "altrnRptgCcyTtlAmts"
})
public class SecuritiesBalanceAccountingReportV10 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement74 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification136 acctSvcr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount26 sfkpgAcct;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary44> intrmyInf;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation37> balForAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification56> subAcctDtls;
    @XmlElement(name = "AcctBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement2 acctBaseCcyTtlAmts;
    @XmlElement(name = "AltrnRptgCcyTtlAmts")
    protected TotalValueInPageAndStatement2 altrnRptgCcyTtlAmts;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement74 }
     *     
     */
    public Statement74 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement74 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setStmtGnlDtls(Statement74 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setAcctSvcr(PartyIdentification136 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount26 }
     *     
     */
    public SecuritiesAccount26 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount26 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setSfkpgAcct(SecuritiesAccount26 value) {
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
     * {@link Intermediary44 }
     * 
     * 
     */
    public List<Intermediary44> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary44>();
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
     * {@link AggregateBalanceInformation37 }
     * 
     * 
     */
    public List<AggregateBalanceInformation37> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<AggregateBalanceInformation37>();
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
     * {@link SubAccountIdentification56 }
     * 
     * 
     */
    public List<SubAccountIdentification56> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<SubAccountIdentification56>();
        }
        return this.subAcctDtls;
    }

    /**
     * Gets the value of the acctBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement2 }
     *     
     */
    public TotalValueInPageAndStatement2 getAcctBaseCcyTtlAmts() {
        return acctBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the acctBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement2 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setAcctBaseCcyTtlAmts(TotalValueInPageAndStatement2 value) {
        this.acctBaseCcyTtlAmts = value;
        return this;
    }

    /**
     * Gets the value of the altrnRptgCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement2 }
     *     
     */
    public TotalValueInPageAndStatement2 getAltrnRptgCcyTtlAmts() {
        return altrnRptgCcyTtlAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement2 }
     *     
     */
    public SecuritiesBalanceAccountingReportV10 setAltrnRptgCcyTtlAmts(TotalValueInPageAndStatement2 value) {
        this.altrnRptgCcyTtlAmts = value;
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
    public SecuritiesBalanceAccountingReportV10 addIntrmyInf(Intermediary44 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the balForAcct list.
     * @see #getBalForAcct()
     * 
     */
    public SecuritiesBalanceAccountingReportV10 addBalForAcct(AggregateBalanceInformation37 balForAcct) {
        getBalForAcct().add(balForAcct);
        return this;
    }

    /**
     * Adds a new item to the subAcctDtls list.
     * @see #getSubAcctDtls()
     * 
     */
    public SecuritiesBalanceAccountingReportV10 addSubAcctDtls(SubAccountIdentification56 subAcctDtls) {
        getSubAcctDtls().add(subAcctDtls);
        return this;
    }

}
