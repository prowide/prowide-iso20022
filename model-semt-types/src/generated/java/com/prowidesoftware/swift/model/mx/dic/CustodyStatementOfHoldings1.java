
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
 * Information about a custody statement of holdings.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustodyStatementOfHoldings1", propOrder = {
    "msgPgntn",
    "stmtGnlDtls",
    "acctDtls",
    "balForAcct",
    "subAcctDtls",
    "ttlVals",
    "xtnsn"
})
public class CustodyStatementOfHoldings1 {

    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtGnlDtls")
    protected Statement3 stmtGnlDtls;
    @XmlElement(name = "AcctDtls")
    protected SafekeepingAccount1 acctDtls;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation1> balForAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification1> subAcctDtls;
    @XmlElement(name = "TtlVals")
    protected TotalValueInPageAndStatement ttlVals;
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
    public CustodyStatementOfHoldings1 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement3 }
     *     
     */
    public Statement3 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement3 }
     *     
     */
    public CustodyStatementOfHoldings1 setStmtGnlDtls(Statement3 value) {
        this.stmtGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount1 }
     *     
     */
    public SafekeepingAccount1 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount1 }
     *     
     */
    public CustodyStatementOfHoldings1 setAcctDtls(SafekeepingAccount1 value) {
        this.acctDtls = value;
        return this;
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
     * {@link AggregateBalanceInformation1 }
     * 
     * 
     */
    public List<AggregateBalanceInformation1> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<AggregateBalanceInformation1>();
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
     * {@link SubAccountIdentification1 }
     * 
     * 
     */
    public List<SubAccountIdentification1> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<SubAccountIdentification1>();
        }
        return this.subAcctDtls;
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
    public CustodyStatementOfHoldings1 setTtlVals(TotalValueInPageAndStatement value) {
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
     * Adds a new item to the balForAcct list.
     * @see #getBalForAcct()
     * 
     */
    public CustodyStatementOfHoldings1 addBalForAcct(AggregateBalanceInformation1 balForAcct) {
        getBalForAcct().add(balForAcct);
        return this;
    }

    /**
     * Adds a new item to the subAcctDtls list.
     * @see #getSubAcctDtls()
     * 
     */
    public CustodyStatementOfHoldings1 addSubAcctDtls(SubAccountIdentification1 subAcctDtls) {
        getSubAcctDtls().add(subAcctDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public CustodyStatementOfHoldings1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
