
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
 * Provides further details on the reporting request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequest6", propOrder = {
    "id",
    "reqdMsgNmId",
    "acct",
    "acctOwnr",
    "acctSvcr",
    "rptgPrd",
    "rptgSeq",
    "reqdTxTp",
    "reqdBalTp"
})
public class ReportingRequest6 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ReqdMsgNmId", required = true)
    protected String reqdMsgNmId;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "AcctOwnr", required = true)
    protected Party40Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "RptgPrd")
    protected ReportingPeriod5 rptgPrd;
    @XmlElement(name = "RptgSeq")
    protected SequenceRange1Choice rptgSeq;
    @XmlElement(name = "ReqdTxTp")
    protected TransactionType2 reqdTxTp;
    @XmlElement(name = "ReqdBalTp")
    protected List<BalanceType13> reqdBalTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportingRequest6 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the reqdMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdMsgNmId() {
        return reqdMsgNmId;
    }

    /**
     * Sets the value of the reqdMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportingRequest6 setReqdMsgNmId(String value) {
        this.reqdMsgNmId = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public ReportingRequest6 setAcct(CashAccount40 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public ReportingRequest6 setAcctOwnr(Party40Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public ReportingRequest6 setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod5 }
     *     
     */
    public ReportingPeriod5 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod5 }
     *     
     */
    public ReportingRequest6 setRptgPrd(ReportingPeriod5 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the rptgSeq property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public SequenceRange1Choice getRptgSeq() {
        return rptgSeq;
    }

    /**
     * Sets the value of the rptgSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public ReportingRequest6 setRptgSeq(SequenceRange1Choice value) {
        this.rptgSeq = value;
        return this;
    }

    /**
     * Gets the value of the reqdTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType2 }
     *     
     */
    public TransactionType2 getReqdTxTp() {
        return reqdTxTp;
    }

    /**
     * Sets the value of the reqdTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType2 }
     *     
     */
    public ReportingRequest6 setReqdTxTp(TransactionType2 value) {
        this.reqdTxTp = value;
        return this;
    }

    /**
     * Gets the value of the reqdBalTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdBalTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdBalTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType13 }
     * 
     * 
     */
    public List<BalanceType13> getReqdBalTp() {
        if (reqdBalTp == null) {
            reqdBalTp = new ArrayList<BalanceType13>();
        }
        return this.reqdBalTp;
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
     * Adds a new item to the reqdBalTp list.
     * @see #getReqdBalTp()
     * 
     */
    public ReportingRequest6 addReqdBalTp(BalanceType13 reqdBalTp) {
        getReqdBalTp().add(reqdBalTp);
        return this;
    }

}
