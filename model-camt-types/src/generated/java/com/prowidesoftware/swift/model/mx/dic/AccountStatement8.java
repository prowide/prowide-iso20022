
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details of the account statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatement8", propOrder = {
    "id",
    "stmtPgntn",
    "elctrncSeqNb",
    "rptgSeq",
    "lglSeqNb",
    "creDtTm",
    "frToDt",
    "cpyDplctInd",
    "rptgSrc",
    "acct",
    "rltdAcct",
    "intrst",
    "bal",
    "txsSummry",
    "ntry",
    "addtlStmtInf"
})
public class AccountStatement8 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "StmtPgntn")
    protected Pagination1 stmtPgntn;
    @XmlElement(name = "ElctrncSeqNb")
    protected BigDecimal elctrncSeqNb;
    @XmlElement(name = "RptgSeq")
    protected SequenceRange1Choice rptgSeq;
    @XmlElement(name = "LglSeqNb")
    protected BigDecimal lglSeqNb;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creDtTm;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriod1 frToDt;
    @XmlElement(name = "CpyDplctInd")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplctInd;
    @XmlElement(name = "RptgSrc")
    protected ReportingSource1Choice rptgSrc;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount36 acct;
    @XmlElement(name = "RltdAcct")
    protected CashAccount24 rltdAcct;
    @XmlElement(name = "Intrst")
    protected List<AccountInterest4> intrst;
    @XmlElement(name = "Bal", required = true)
    protected List<CashBalance8> bal;
    @XmlElement(name = "TxsSummry")
    protected TotalTransactions6 txsSummry;
    @XmlElement(name = "Ntry")
    protected List<ReportEntry9> ntry;
    @XmlElement(name = "AddtlStmtInf")
    protected String addtlStmtInf;

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
    public AccountStatement8 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the stmtPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getStmtPgntn() {
        return stmtPgntn;
    }

    /**
     * Sets the value of the stmtPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public AccountStatement8 setStmtPgntn(Pagination1 value) {
        this.stmtPgntn = value;
        return this;
    }

    /**
     * Gets the value of the elctrncSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElctrncSeqNb() {
        return elctrncSeqNb;
    }

    /**
     * Sets the value of the elctrncSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AccountStatement8 setElctrncSeqNb(BigDecimal value) {
        this.elctrncSeqNb = value;
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
    public AccountStatement8 setRptgSeq(SequenceRange1Choice value) {
        this.rptgSeq = value;
        return this;
    }

    /**
     * Gets the value of the lglSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLglSeqNb() {
        return lglSeqNb;
    }

    /**
     * Sets the value of the lglSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AccountStatement8 setLglSeqNb(BigDecimal value) {
        this.lglSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatement8 setCreDtTm(Calendar value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public AccountStatement8 setFrToDt(DateTimePeriod1 value) {
        this.frToDt = value;
        return this;
    }

    /**
     * Gets the value of the cpyDplctInd property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplctInd() {
        return cpyDplctInd;
    }

    /**
     * Sets the value of the cpyDplctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public AccountStatement8 setCpyDplctInd(CopyDuplicate1Code value) {
        this.cpyDplctInd = value;
        return this;
    }

    /**
     * Gets the value of the rptgSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public ReportingSource1Choice getRptgSrc() {
        return rptgSrc;
    }

    /**
     * Sets the value of the rptgSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public AccountStatement8 setRptgSrc(ReportingSource1Choice value) {
        this.rptgSrc = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount36 }
     *     
     */
    public CashAccount36 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount36 }
     *     
     */
    public AccountStatement8 setAcct(CashAccount36 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the rltdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public AccountStatement8 setRltdAcct(CashAccount24 value) {
        this.rltdAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInterest4 }
     * 
     * 
     * @return
     *     The value of the intrst property.
     */
    public List<AccountInterest4> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<>();
        }
        return this.intrst;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance8 }
     * 
     * 
     * @return
     *     The value of the bal property.
     */
    public List<CashBalance8> getBal() {
        if (bal == null) {
            bal = new ArrayList<>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the txsSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransactions6 }
     *     
     */
    public TotalTransactions6 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransactions6 }
     *     
     */
    public AccountStatement8 setTxsSummry(TotalTransactions6 value) {
        this.txsSummry = value;
        return this;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportEntry9 }
     * 
     * 
     * @return
     *     The value of the ntry property.
     */
    public List<ReportEntry9> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<>();
        }
        return this.ntry;
    }

    /**
     * Gets the value of the addtlStmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlStmtInf() {
        return addtlStmtInf;
    }

    /**
     * Sets the value of the addtlStmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatement8 setAddtlStmtInf(String value) {
        this.addtlStmtInf = value;
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
     * Adds a new item to the intrst list.
     * @see #getIntrst()
     * 
     */
    public AccountStatement8 addIntrst(AccountInterest4 intrst) {
        getIntrst().add(intrst);
        return this;
    }

    /**
     * Adds a new item to the bal list.
     * @see #getBal()
     * 
     */
    public AccountStatement8 addBal(CashBalance8 bal) {
        getBal().add(bal);
        return this;
    }

    /**
     * Adds a new item to the ntry list.
     * @see #getNtry()
     * 
     */
    public AccountStatement8 addNtry(ReportEntry9 ntry) {
        getNtry().add(ntry);
        return this;
    }

}
