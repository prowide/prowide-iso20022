
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
 * An account servicer, for example, a transfer agent or administrator, sends the AlternativeFundsAccountingStatementOfHoldings message to the account owner, for example, an investment manager, custodian, fund manager or an account owner's designated agent, to provide detailed holdings of the portfolio at a specified moment in time.
 * There may be one or more parties between the account servicer and the account owner.
 * The message provides, at a moment in time, valuations of the portfolio together with details of each financial instrument holding.
 * Usage
 * The AlternativeFundsAccountingStatementOfHoldings message is sent by the account servicer to the account owner:
 * - at a frequency agreed bilaterally between the account servicer and the account owner,
 * - as a response to a request for statement sent by the account owner.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeFundsAccountingStatementOfHoldingsV01", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "invstmtAcctDtls",
    "stmtGnlDtls",
    "rltdPtyDtls",
    "balForAcct",
    "ttlVals",
    "xtnsn"
})
public class AlternativeFundsAccountingStatementOfHoldingsV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference4> prvsRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference4> rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement10 stmtGnlDtls;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary17> rltdPtyDtls;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation5> balForAcct;
    @XmlElement(name = "TtlVals")
    protected TotalValueInPageAndStatement ttlVals;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference4 }
     * 
     * 
     */
    public List<AdditionalReference4> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<AdditionalReference4>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference4 }
     * 
     * 
     */
    public List<AdditionalReference4> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<AdditionalReference4>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public InvestmentAccount30 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 setInvstmtAcctDtls(InvestmentAccount30 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement10 }
     *     
     */
    public Statement10 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement10 }
     *     
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 setStmtGnlDtls(Statement10 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary17 }
     * 
     * 
     */
    public List<Intermediary17> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<Intermediary17>();
        }
        return this.rltdPtyDtls;
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
     * {@link AggregateBalanceInformation5 }
     * 
     * 
     */
    public List<AggregateBalanceInformation5> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<AggregateBalanceInformation5>();
        }
        return this.balForAcct;
    }

    /**
     * Gets the value of the ttlVals property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement }
     *     
     */
    public TotalValueInPageAndStatement getTtlVals() {
        return ttlVals;
    }

    /**
     * Sets the value of the ttlVals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement }
     *     
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 setTtlVals(TotalValueInPageAndStatement value) {
        this.ttlVals = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
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
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 addPrvsRef(AdditionalReference4 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 addRltdRef(AdditionalReference4 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 addRltdPtyDtls(Intermediary17 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

    /**
     * Adds a new item to the balForAcct list.
     * @see #getBalForAcct()
     * 
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 addBalForAcct(AggregateBalanceInformation5 balForAcct) {
        getBalForAcct().add(balForAcct);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
