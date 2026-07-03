
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
 * The StatementOfInvestmentFundTransactions is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a fund administrator or fund intermediary, trustee or registrar.
 * This message provides the details of increases and decreases of holdings which occurred during a specified period.
 * This message can also be used for information purposes, eg, tax information.
 * Usage
 * The StatementOfInvestmentFundTransactions message can be sent:
 * - At a frequency agreed bi-laterally between the Sender and the Receiver and/or
 * - As a response to a request for statement sent by the account owner.
 * The StatementOfInvestmentFundTransactions message can only be used to list the transactions of a single (master) account. However, it is possible to break down these transactions into one or several sub-accounts. Therefore, the message can be used to either specify transactions at
 * - the main account level, or
 * - the sub-account level.
 * This message must not be used in place of confirmation messages.
 * Since a SWIFT message as sent is restricted to the maximum input message length, several messages may be needed to accommodate all the information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semt.006.001.01", propOrder = {
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "stmtGnlDtls",
    "invstmtAcctDtls",
    "txOnAcct",
    "subAcctDtls",
    "xtnsn"
})
public class Semt00600101 {

    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference2> prvsRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference2> rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement5 stmtGnlDtls;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount12 invstmtAcctDtls;
    @XmlElement(name = "TxOnAcct")
    protected List<InvestmentFundTransactionsByFund1> txOnAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification4> subAcctDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

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
     * {@link AdditionalReference2 }
     * 
     * 
     */
    public List<AdditionalReference2> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<AdditionalReference2>();
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
     * {@link AdditionalReference2 }
     * 
     * 
     */
    public List<AdditionalReference2> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<AdditionalReference2>();
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
    public Semt00600101 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement5 }
     *     
     */
    public Statement5 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement5 }
     *     
     */
    public Semt00600101 setStmtGnlDtls(Statement5 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount12 }
     *     
     */
    public InvestmentAccount12 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount12 }
     *     
     */
    public Semt00600101 setInvstmtAcctDtls(InvestmentAccount12 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the txOnAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txOnAcct property.
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
     * {@link InvestmentFundTransactionsByFund1 }
     * 
     * 
     */
    public List<InvestmentFundTransactionsByFund1> getTxOnAcct() {
        if (txOnAcct == null) {
            txOnAcct = new ArrayList<InvestmentFundTransactionsByFund1>();
        }
        return this.txOnAcct;
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
     * {@link SubAccountIdentification4 }
     * 
     * 
     */
    public List<SubAccountIdentification4> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<SubAccountIdentification4>();
        }
        return this.subAcctDtls;
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
    public Semt00600101 addPrvsRef(AdditionalReference2 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public Semt00600101 addRltdRef(AdditionalReference2 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the txOnAcct list.
     * @see #getTxOnAcct()
     * 
     */
    public Semt00600101 addTxOnAcct(InvestmentFundTransactionsByFund1 txOnAcct) {
        getTxOnAcct().add(txOnAcct);
        return this;
    }

    /**
     * Adds a new item to the subAcctDtls list.
     * @see #getSubAcctDtls()
     * 
     */
    public Semt00600101 addSubAcctDtls(SubAccountIdentification4 subAcctDtls) {
        getSubAcctDtls().add(subAcctDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public Semt00600101 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
