
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
 * Details about praticipant's liquidity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLiquidityReport1", propOrder = {
    "acct",
    "acctOvrdueInd",
    "lmtInf",
    "lqdtyInf",
    "arrstInf",
    "dbtQdTxs",
    "cdtQdTxs"
})
public class AccountLiquidityReport1 {

    @XmlElement(name = "Acct", required = true)
    protected CashAccount25 acct;
    @XmlElement(name = "AcctOvrdueInd")
    protected boolean acctOvrdueInd;
    @XmlElement(name = "LmtInf")
    protected List<AccountLimits1> lmtInf;
    @XmlElement(name = "LqdtyInf")
    protected LiquidityDetails1 lqdtyInf;
    @XmlElement(name = "ArrstInf", required = true)
    protected ArrestedFunds1 arrstInf;
    @XmlElement(name = "DbtQdTxs")
    protected List<QueuedTransactionsReport1> dbtQdTxs;
    @XmlElement(name = "CdtQdTxs")
    protected List<QueuedTransactionsReport1> cdtQdTxs;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount25 }
     *     
     */
    public CashAccount25 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount25 }
     *     
     */
    public AccountLiquidityReport1 setAcct(CashAccount25 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctOvrdueInd property.
     * 
     */
    public boolean isAcctOvrdueInd() {
        return acctOvrdueInd;
    }

    /**
     * Sets the value of the acctOvrdueInd property.
     * 
     */
    public AccountLiquidityReport1 setAcctOvrdueInd(boolean value) {
        this.acctOvrdueInd = value;
        return this;
    }

    /**
     * Gets the value of the lmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountLimits1 }
     * 
     * 
     */
    public List<AccountLimits1> getLmtInf() {
        if (lmtInf == null) {
            lmtInf = new ArrayList<AccountLimits1>();
        }
        return this.lmtInf;
    }

    /**
     * Gets the value of the lqdtyInf property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityDetails1 }
     *     
     */
    public LiquidityDetails1 getLqdtyInf() {
        return lqdtyInf;
    }

    /**
     * Sets the value of the lqdtyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityDetails1 }
     *     
     */
    public AccountLiquidityReport1 setLqdtyInf(LiquidityDetails1 value) {
        this.lqdtyInf = value;
        return this;
    }

    /**
     * Gets the value of the arrstInf property.
     * 
     * @return
     *     possible object is
     *     {@link ArrestedFunds1 }
     *     
     */
    public ArrestedFunds1 getArrstInf() {
        return arrstInf;
    }

    /**
     * Sets the value of the arrstInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrestedFunds1 }
     *     
     */
    public AccountLiquidityReport1 setArrstInf(ArrestedFunds1 value) {
        this.arrstInf = value;
        return this;
    }

    /**
     * Gets the value of the dbtQdTxs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbtQdTxs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbtQdTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueuedTransactionsReport1 }
     * 
     * 
     */
    public List<QueuedTransactionsReport1> getDbtQdTxs() {
        if (dbtQdTxs == null) {
            dbtQdTxs = new ArrayList<QueuedTransactionsReport1>();
        }
        return this.dbtQdTxs;
    }

    /**
     * Gets the value of the cdtQdTxs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtQdTxs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtQdTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueuedTransactionsReport1 }
     * 
     * 
     */
    public List<QueuedTransactionsReport1> getCdtQdTxs() {
        if (cdtQdTxs == null) {
            cdtQdTxs = new ArrayList<QueuedTransactionsReport1>();
        }
        return this.cdtQdTxs;
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
     * Adds a new item to the lmtInf list.
     * @see #getLmtInf()
     * 
     */
    public AccountLiquidityReport1 addLmtInf(AccountLimits1 lmtInf) {
        getLmtInf().add(lmtInf);
        return this;
    }

    /**
     * Adds a new item to the dbtQdTxs list.
     * @see #getDbtQdTxs()
     * 
     */
    public AccountLiquidityReport1 addDbtQdTxs(QueuedTransactionsReport1 dbtQdTxs) {
        getDbtQdTxs().add(dbtQdTxs);
        return this;
    }

    /**
     * Adds a new item to the cdtQdTxs list.
     * @see #getCdtQdTxs()
     * 
     */
    public AccountLiquidityReport1 addCdtQdTxs(QueuedTransactionsReport1 cdtQdTxs) {
        getCdtQdTxs().add(cdtQdTxs);
        return this;
    }

}
