
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
 * Information about a statement of investment fund transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementOfInvestmentFundTransactions1", propOrder = {
    "msgPgntn",
    "stmtGnlDtls",
    "invstmtAcctDtls",
    "txOnAcct",
    "subAcctDtls",
    "xtnsn"
})
public class StatementOfInvestmentFundTransactions1 {

    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtGnlDtls")
    protected Statement5 stmtGnlDtls;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount12 invstmtAcctDtls;
    @XmlElement(name = "TxOnAcct")
    protected List<InvestmentFundTransactionsByFund1> txOnAcct;
    @XmlElement(name = "SubAcctDtls", required = true)
    protected SubAccountIdentification4 subAcctDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

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
    public StatementOfInvestmentFundTransactions1 setMsgPgntn(Pagination value) {
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
    public StatementOfInvestmentFundTransactions1 setStmtGnlDtls(Statement5 value) {
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
    public StatementOfInvestmentFundTransactions1 setInvstmtAcctDtls(InvestmentAccount12 value) {
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
     * @return
     *     possible object is
     *     {@link SubAccountIdentification4 }
     *     
     */
    public SubAccountIdentification4 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Sets the value of the subAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccountIdentification4 }
     *     
     */
    public StatementOfInvestmentFundTransactions1 setSubAcctDtls(SubAccountIdentification4 value) {
        this.subAcctDtls = value;
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
     * Adds a new item to the txOnAcct list.
     * @see #getTxOnAcct()
     * 
     */
    public StatementOfInvestmentFundTransactions1 addTxOnAcct(InvestmentFundTransactionsByFund1 txOnAcct) {
        getTxOnAcct().add(txOnAcct);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public StatementOfInvestmentFundTransactions1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
