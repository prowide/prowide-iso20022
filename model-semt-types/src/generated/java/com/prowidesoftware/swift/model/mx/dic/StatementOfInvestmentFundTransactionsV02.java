
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
 * An account servicer, for example, a transfer agent sends the StatementOfInvestmentFundTransactions message to the account owner, for example, an investment manager or its authorised representative to provide detailed transactions (increases and decreases) of holdings which occurred during a specified period of time.
 * Usage
 * The StatementOfInvestmentFundTransactions message is used to list the holdings transactions of a single (master) account or several sub-accounts.
 * This message should be used at a frequency agreed bi-laterally between the account servicer and the account owner.
 * This message must not be used in place of confirmation messages.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementOfInvestmentFundTransactionsV02", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "stmtGnlDtls",
    "invstmtAcctDtls",
    "txOnAcct",
    "subAcctDtls",
    "xtnsn"
})
public class StatementOfInvestmentFundTransactionsV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference2> prvsRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference2> rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement8 stmtGnlDtls;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount25 invstmtAcctDtls;
    @XmlElement(name = "TxOnAcct")
    protected List<InvestmentFundTransactionsByFund2> txOnAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification6> subAcctDtls;
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
    public StatementOfInvestmentFundTransactionsV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsRef property.
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
     * {@link AdditionalReference2 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference2> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRef property.
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
     * {@link AdditionalReference2 }
     * 
     * 
     * @return
     *     The value of the rltdRef property.
     */
    public List<AdditionalReference2> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<>();
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
    public StatementOfInvestmentFundTransactionsV02 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement8 }
     *     
     */
    public Statement8 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement8 }
     *     
     */
    public StatementOfInvestmentFundTransactionsV02 setStmtGnlDtls(Statement8 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount25 }
     *     
     */
    public InvestmentAccount25 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount25 }
     *     
     */
    public StatementOfInvestmentFundTransactionsV02 setInvstmtAcctDtls(InvestmentAccount25 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the txOnAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txOnAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxOnAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundTransactionsByFund2 }
     * 
     * 
     * @return
     *     The value of the txOnAcct property.
     */
    public List<InvestmentFundTransactionsByFund2> getTxOnAcct() {
        if (txOnAcct == null) {
            txOnAcct = new ArrayList<>();
        }
        return this.txOnAcct;
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
     * {@link SubAccountIdentification6 }
     * 
     * 
     * @return
     *     The value of the subAcctDtls property.
     */
    public List<SubAccountIdentification6> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<>();
        }
        return this.subAcctDtls;
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public StatementOfInvestmentFundTransactionsV02 addPrvsRef(AdditionalReference2 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public StatementOfInvestmentFundTransactionsV02 addRltdRef(AdditionalReference2 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the txOnAcct list.
     * @see #getTxOnAcct()
     * 
     */
    public StatementOfInvestmentFundTransactionsV02 addTxOnAcct(InvestmentFundTransactionsByFund2 txOnAcct) {
        getTxOnAcct().add(txOnAcct);
        return this;
    }

    /**
     * Adds a new item to the subAcctDtls list.
     * @see #getSubAcctDtls()
     * 
     */
    public StatementOfInvestmentFundTransactionsV02 addSubAcctDtls(SubAccountIdentification6 subAcctDtls) {
        getSubAcctDtls().add(subAcctDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public StatementOfInvestmentFundTransactionsV02 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
