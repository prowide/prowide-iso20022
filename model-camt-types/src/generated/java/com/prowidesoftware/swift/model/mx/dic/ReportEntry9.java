
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further details on an entry in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportEntry9", propOrder = {
    "ntryRef",
    "amt",
    "cdtDbtInd",
    "rvslInd",
    "sts",
    "bookgDt",
    "valDt",
    "acctSvcrRef",
    "avlbty",
    "bkTxCd",
    "comssnWvrInd",
    "addtlInfInd",
    "amtDtls",
    "chrgs",
    "techInptChanl",
    "intrst",
    "cardTx",
    "ntryDtls",
    "addtlNtryInf"
})
public class ReportEntry9 {

    @XmlElement(name = "NtryRef")
    protected String ntryRef;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "RvslInd")
    protected Boolean rvslInd;
    @XmlElement(name = "Sts", required = true)
    protected EntryStatus1Choice sts;
    @XmlElement(name = "BookgDt")
    protected DateAndDateTime2Choice bookgDt;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "AcctSvcrRef")
    protected String acctSvcrRef;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;
    @XmlElement(name = "BkTxCd", required = true)
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "ComssnWvrInd")
    protected Boolean comssnWvrInd;
    @XmlElement(name = "AddtlInfInd")
    protected MessageIdentification2 addtlInfInd;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange3 amtDtls;
    @XmlElement(name = "Chrgs")
    protected Charges4 chrgs;
    @XmlElement(name = "TechInptChanl")
    protected TechnicalInputChannel1Choice techInptChanl;
    @XmlElement(name = "Intrst")
    protected TransactionInterest4 intrst;
    @XmlElement(name = "CardTx")
    protected CardEntry3 cardTx;
    @XmlElement(name = "NtryDtls")
    protected List<EntryDetails8> ntryDtls;
    @XmlElement(name = "AddtlNtryInf")
    protected String addtlNtryInf;

    /**
     * Gets the value of the ntryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryRef() {
        return ntryRef;
    }

    /**
     * Sets the value of the ntryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportEntry9 setNtryRef(String value) {
        this.ntryRef = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ReportEntry9 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public ReportEntry9 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the rvslInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRvslInd() {
        return rvslInd;
    }

    /**
     * Sets the value of the rvslInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReportEntry9 setRvslInd(Boolean value) {
        this.rvslInd = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link EntryStatus1Choice }
     *     
     */
    public EntryStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryStatus1Choice }
     *     
     */
    public ReportEntry9 setSts(EntryStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the bookgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getBookgDt() {
        return bookgDt;
    }

    /**
     * Sets the value of the bookgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public ReportEntry9 setBookgDt(DateAndDateTime2Choice value) {
        this.bookgDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public ReportEntry9 setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrRef() {
        return acctSvcrRef;
    }

    /**
     * Sets the value of the acctSvcrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportEntry9 setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
        return this;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the avlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAvailability1 }
     * 
     * 
     * @return
     *     The value of the avlbty property.
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<>();
        }
        return this.avlbty;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public ReportEntry9 setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
        return this;
    }

    /**
     * Gets the value of the comssnWvrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComssnWvrInd() {
        return comssnWvrInd;
    }

    /**
     * Sets the value of the comssnWvrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReportEntry9 setComssnWvrInd(Boolean value) {
        this.comssnWvrInd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInfInd property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification2 }
     *     
     */
    public MessageIdentification2 getAddtlInfInd() {
        return addtlInfInd;
    }

    /**
     * Sets the value of the addtlInfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification2 }
     *     
     */
    public ReportEntry9 setAddtlInfInd(MessageIdentification2 value) {
        this.addtlInfInd = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange3 }
     *     
     */
    public AmountAndCurrencyExchange3 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange3 }
     *     
     */
    public ReportEntry9 setAmtDtls(AmountAndCurrencyExchange3 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charges4 }
     *     
     */
    public Charges4 getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges4 }
     *     
     */
    public ReportEntry9 setChrgs(Charges4 value) {
        this.chrgs = value;
        return this;
    }

    /**
     * Gets the value of the techInptChanl property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalInputChannel1Choice }
     *     
     */
    public TechnicalInputChannel1Choice getTechInptChanl() {
        return techInptChanl;
    }

    /**
     * Sets the value of the techInptChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalInputChannel1Choice }
     *     
     */
    public ReportEntry9 setTechInptChanl(TechnicalInputChannel1Choice value) {
        this.techInptChanl = value;
        return this;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInterest4 }
     *     
     */
    public TransactionInterest4 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInterest4 }
     *     
     */
    public ReportEntry9 setIntrst(TransactionInterest4 value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the cardTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardEntry3 }
     *     
     */
    public CardEntry3 getCardTx() {
        return cardTx;
    }

    /**
     * Sets the value of the cardTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardEntry3 }
     *     
     */
    public ReportEntry9 setCardTx(CardEntry3 value) {
        this.cardTx = value;
        return this;
    }

    /**
     * Gets the value of the ntryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryDetails8 }
     * 
     * 
     * @return
     *     The value of the ntryDtls property.
     */
    public List<EntryDetails8> getNtryDtls() {
        if (ntryDtls == null) {
            ntryDtls = new ArrayList<>();
        }
        return this.ntryDtls;
    }

    /**
     * Gets the value of the addtlNtryInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlNtryInf() {
        return addtlNtryInf;
    }

    /**
     * Sets the value of the addtlNtryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportEntry9 setAddtlNtryInf(String value) {
        this.addtlNtryInf = value;
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
     * Adds a new item to the avlbty list.
     * @see #getAvlbty()
     * 
     */
    public ReportEntry9 addAvlbty(CashAvailability1 avlbty) {
        getAvlbty().add(avlbty);
        return this;
    }

    /**
     * Adds a new item to the ntryDtls list.
     * @see #getNtryDtls()
     * 
     */
    public ReportEntry9 addNtryDtls(EntryDetails8 ntryDtls) {
        getNtryDtls().add(ntryDtls);
        return this;
    }

}
