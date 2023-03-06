
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
@XmlType(name = "ReportingRequest2", propOrder = {
    "id",
    "reqdMsgNmId",
    "acct",
    "acctOwnr",
    "acctSvcr",
    "rptgPrd",
    "reqdTxTp",
    "reqdBalTp"
})
public class ReportingRequest2 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ReqdMsgNmId", required = true)
    protected String reqdMsgNmId;
    @XmlElement(name = "Acct")
    protected CashAccount16 acct;
    @XmlElement(name = "AcctOwnr", required = true)
    protected Party12Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification5 acctSvcr;
    @XmlElement(name = "RptgPrd")
    protected ReportingPeriod1 rptgPrd;
    @XmlElement(name = "ReqdTxTp")
    protected TransactionType1 reqdTxTp;
    @XmlElement(name = "ReqdBalTp")
    protected List<BalanceType12> reqdBalTp;

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
    public ReportingRequest2 setId(String value) {
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
    public ReportingRequest2 setReqdMsgNmId(String value) {
        this.reqdMsgNmId = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public ReportingRequest2 setAcct(CashAccount16 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party12Choice }
     *     
     */
    public Party12Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party12Choice }
     *     
     */
    public ReportingRequest2 setAcctOwnr(Party12Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public ReportingRequest2 setAcctSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod1 }
     *     
     */
    public ReportingPeriod1 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod1 }
     *     
     */
    public ReportingRequest2 setRptgPrd(ReportingPeriod1 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the reqdTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType1 }
     *     
     */
    public TransactionType1 getReqdTxTp() {
        return reqdTxTp;
    }

    /**
     * Sets the value of the reqdTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType1 }
     *     
     */
    public ReportingRequest2 setReqdTxTp(TransactionType1 value) {
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
     * {@link BalanceType12 }
     * 
     * 
     */
    public List<BalanceType12> getReqdBalTp() {
        if (reqdBalTp == null) {
            reqdBalTp = new ArrayList<BalanceType12>();
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
    public ReportingRequest2 addReqdBalTp(BalanceType12 reqdBalTp) {
        getReqdBalTp().add(reqdBalTp);
        return this;
    }

}
