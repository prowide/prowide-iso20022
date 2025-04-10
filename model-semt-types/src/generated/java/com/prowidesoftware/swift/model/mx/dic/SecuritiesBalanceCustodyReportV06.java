
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
 * An account servicer sends a SecuritiesBalanceCustodyReport to an account owner to provide, at a moment in time, the quantity and identification of the financial instruments that the account servicer holds for the account owner.
 * 
 * The account servicer/owner relationship may be:
 * - a central securities depository or another settlement market infrastructure acting on behalf of their participants, or
 * - an agent (sub-custodian) acting on behalf of their global custodian customer, or 
 * - a custodian acting on behalf of an investment management institution or a broker/dealer, or
 * - a transfer agent acting on behalf of a fund manager or an account owner's designated agent.
 * 
 * Usage
 * The message can also include availability and the location of holdings to facilitate trading and minimise settlement issues. The message reports all information per financial instrument, that is, when a financial instrument is held at multiple places of safekeeping, the total holdings for all locations can be provided. 
 * The message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner. The message may be provided on a trade date, contractual or settlement date basis. 
 * There may be one or more intermediary parties, for example, an intermediary or a concentrator between the account owner and account servicer.
 * The message may also be used to:
 * - re-send a message previously sent,
 * - provide a third party with a copy of a message for information,
 * - re-send to a third party a copy of a message for information
 * using the relevant elements in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceCustodyReportV06", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "acctSvcr",
    "sfkpgAcct",
    "intrmyInf",
    "balForAcct",
    "subAcctDtls",
    "acctBaseCcyTtlAmts"
})
public class SecuritiesBalanceCustodyReportV06 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement33 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification36Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification49Choice acctSvcr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount11 sfkpgAcct;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary23> intrmyInf;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation21> balForAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification28> subAcctDtls;
    @XmlElement(name = "AcctBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement1 acctBaseCcyTtlAmts;

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
    public SecuritiesBalanceCustodyReportV06 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement33 }
     *     
     */
    public Statement33 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement33 }
     *     
     */
    public SecuritiesBalanceCustodyReportV06 setStmtGnlDtls(Statement33 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public PartyIdentification36Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification36Choice }
     *     
     */
    public SecuritiesBalanceCustodyReportV06 setAcctOwnr(PartyIdentification36Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification49Choice }
     *     
     */
    public PartyIdentification49Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification49Choice }
     *     
     */
    public SecuritiesBalanceCustodyReportV06 setAcctSvcr(PartyIdentification49Choice value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount11 }
     *     
     */
    public SecuritiesAccount11 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount11 }
     *     
     */
    public SecuritiesBalanceCustodyReportV06 setSfkpgAcct(SecuritiesAccount11 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
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
     * {@link Intermediary23 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary23> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the balForAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balForAcct property.
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
     * {@link AggregateBalanceInformation21 }
     * 
     * 
     * @return
     *     The value of the balForAcct property.
     */
    public List<AggregateBalanceInformation21> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<>();
        }
        return this.balForAcct;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subAcctDtls property.
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
     * {@link SubAccountIdentification28 }
     * 
     * 
     * @return
     *     The value of the subAcctDtls property.
     */
    public List<SubAccountIdentification28> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<>();
        }
        return this.subAcctDtls;
    }

    /**
     * Gets the value of the acctBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement1 }
     *     
     */
    public TotalValueInPageAndStatement1 getAcctBaseCcyTtlAmts() {
        return acctBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the acctBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement1 }
     *     
     */
    public SecuritiesBalanceCustodyReportV06 setAcctBaseCcyTtlAmts(TotalValueInPageAndStatement1 value) {
        this.acctBaseCcyTtlAmts = value;
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
    public SecuritiesBalanceCustodyReportV06 addIntrmyInf(Intermediary23 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the balForAcct list.
     * @see #getBalForAcct()
     * 
     */
    public SecuritiesBalanceCustodyReportV06 addBalForAcct(AggregateBalanceInformation21 balForAcct) {
        getBalForAcct().add(balForAcct);
        return this;
    }

    /**
     * Adds a new item to the subAcctDtls list.
     * @see #getSubAcctDtls()
     * 
     */
    public SecuritiesBalanceCustodyReportV06 addSubAcctDtls(SubAccountIdentification28 subAcctDtls) {
        getSubAcctDtls().add(subAcctDtls);
        return this;
    }

}
