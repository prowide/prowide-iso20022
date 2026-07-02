
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details of the account notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNotification21", propOrder = {
    "id",
    "ntfctnPgntn",
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
    "txsSummry",
    "ntry",
    "addtlNtfctnInf"
})
public class AccountNotification21 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "NtfctnPgntn")
    protected Pagination1 ntfctnPgntn;
    @XmlElement(name = "ElctrncSeqNb")
    protected BigDecimal elctrncSeqNb;
    @XmlElement(name = "RptgSeq")
    protected SequenceRange1Choice rptgSeq;
    @XmlElement(name = "LglSeqNb")
    protected BigDecimal lglSeqNb;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriod1 frToDt;
    @XmlElement(name = "CpyDplctInd")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplctInd;
    @XmlElement(name = "RptgSrc")
    protected ReportingSource1Choice rptgSrc;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount41 acct;
    @XmlElement(name = "RltdAcct")
    protected CashAccount40 rltdAcct;
    @XmlElement(name = "Intrst")
    protected List<AccountInterest4> intrst;
    @XmlElement(name = "TxsSummry")
    protected TotalTransactions6 txsSummry;
    @XmlElement(name = "Ntry")
    protected List<ReportEntry13> ntry;
    @XmlElement(name = "AddtlNtfctnInf")
    protected String addtlNtfctnInf;

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
    public AccountNotification21 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getNtfctnPgntn() {
        return ntfctnPgntn;
    }

    /**
     * Sets the value of the ntfctnPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public AccountNotification21 setNtfctnPgntn(Pagination1 value) {
        this.ntfctnPgntn = value;
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
    public AccountNotification21 setElctrncSeqNb(BigDecimal value) {
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
    public AccountNotification21 setRptgSeq(SequenceRange1Choice value) {
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
    public AccountNotification21 setLglSeqNb(BigDecimal value) {
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
    public XMLGregorianCalendar getCreDtTm() {
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
    public AccountNotification21 setCreDtTm(XMLGregorianCalendar value) {
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
    public AccountNotification21 setFrToDt(DateTimePeriod1 value) {
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
    public AccountNotification21 setCpyDplctInd(CopyDuplicate1Code value) {
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
    public AccountNotification21 setRptgSrc(ReportingSource1Choice value) {
        this.rptgSrc = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public AccountNotification21 setAcct(CashAccount41 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the rltdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public AccountNotification21 setRltdAcct(CashAccount40 value) {
        this.rltdAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrst property.
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
     */
    public List<AccountInterest4> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<AccountInterest4>();
        }
        return this.intrst;
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
    public AccountNotification21 setTxsSummry(TotalTransactions6 value) {
        this.txsSummry = value;
        return this;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntry property.
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
     * {@link ReportEntry13 }
     * 
     * 
     */
    public List<ReportEntry13> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<ReportEntry13>();
        }
        return this.ntry;
    }

    /**
     * Gets the value of the addtlNtfctnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlNtfctnInf() {
        return addtlNtfctnInf;
    }

    /**
     * Sets the value of the addtlNtfctnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountNotification21 setAddtlNtfctnInf(String value) {
        this.addtlNtfctnInf = value;
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
    public AccountNotification21 addIntrst(AccountInterest4 intrst) {
        getIntrst().add(intrst);
        return this;
    }

    /**
     * Adds a new item to the ntry list.
     * @see #getNtry()
     * 
     */
    public AccountNotification21 addNtry(ReportEntry13 ntry) {
        getNtry().add(ntry);
        return this;
    }

}
