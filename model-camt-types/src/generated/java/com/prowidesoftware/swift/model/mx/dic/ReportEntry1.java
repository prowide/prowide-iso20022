
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the elements of an entry in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportEntry1", propOrder = {
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
    "btch",
    "amtDtls",
    "chrgs",
    "intrst",
    "txDtls",
    "addtlNtryInf"
})
public class ReportEntry1 {

    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "RvslInd")
    protected Boolean rvslInd;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected EntryStatus2Code sts;
    @XmlElement(name = "BookgDt")
    protected DateAndDateTimeChoice bookgDt;
    @XmlElement(name = "ValDt")
    protected DateAndDateTimeChoice valDt;
    @XmlElement(name = "AcctSvcrRef")
    protected String acctSvcrRef;
    @XmlElement(name = "Avlbty")
    protected List<CashBalanceAvailability1> avlbty;
    @XmlElement(name = "BkTxCd", required = true)
    protected BankTransactionCodeStructure1 bkTxCd;
    @XmlElement(name = "ComssnWvrInd")
    protected Boolean comssnWvrInd;
    @XmlElement(name = "AddtlInfInd")
    protected MessageIdentification2 addtlInfInd;
    @XmlElement(name = "Btch")
    protected List<BatchInformation1> btch;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange2 amtDtls;
    @XmlElement(name = "Chrgs")
    protected List<ChargesInformation3> chrgs;
    @XmlElement(name = "Intrst")
    protected List<TransactionInterest1> intrst;
    @XmlElement(name = "TxDtls")
    protected List<EntryTransaction1> txDtls;
    @XmlElement(name = "AddtlNtryInf")
    protected String addtlNtryInf;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public ReportEntry1 setAmt(CurrencyAndAmount value) {
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
    public ReportEntry1 setCdtDbtInd(CreditDebitCode value) {
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
    public ReportEntry1 setRvslInd(Boolean value) {
        this.rvslInd = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link EntryStatus2Code }
     *     
     */
    public EntryStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryStatus2Code }
     *     
     */
    public ReportEntry1 setSts(EntryStatus2Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the bookgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getBookgDt() {
        return bookgDt;
    }

    /**
     * Sets the value of the bookgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ReportEntry1 setBookgDt(DateAndDateTimeChoice value) {
        this.bookgDt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ReportEntry1 setValDt(DateAndDateTimeChoice value) {
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
    public ReportEntry1 setAcctSvcrRef(String value) {
        this.acctSvcrRef = value;
        return this;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avlbty property.
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
     * {@link CashBalanceAvailability1 }
     * 
     * 
     */
    public List<CashBalanceAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<CashBalanceAvailability1>();
        }
        return this.avlbty;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure1 }
     *     
     */
    public BankTransactionCodeStructure1 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure1 }
     *     
     */
    public ReportEntry1 setBkTxCd(BankTransactionCodeStructure1 value) {
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
    public ReportEntry1 setComssnWvrInd(Boolean value) {
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
    public ReportEntry1 setAddtlInfInd(MessageIdentification2 value) {
        this.addtlInfInd = value;
        return this;
    }

    /**
     * Gets the value of the btch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the btch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchInformation1 }
     * 
     * 
     */
    public List<BatchInformation1> getBtch() {
        if (btch == null) {
            btch = new ArrayList<BatchInformation1>();
        }
        return this.btch;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange2 }
     *     
     */
    public AmountAndCurrencyExchange2 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange2 }
     *     
     */
    public ReportEntry1 setAmtDtls(AmountAndCurrencyExchange2 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesInformation3 }
     * 
     * 
     */
    public List<ChargesInformation3> getChrgs() {
        if (chrgs == null) {
            chrgs = new ArrayList<ChargesInformation3>();
        }
        return this.chrgs;
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
     * {@link TransactionInterest1 }
     * 
     * 
     */
    public List<TransactionInterest1> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<TransactionInterest1>();
        }
        return this.intrst;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryTransaction1 }
     * 
     * 
     */
    public List<EntryTransaction1> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<EntryTransaction1>();
        }
        return this.txDtls;
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
    public ReportEntry1 setAddtlNtryInf(String value) {
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
    public ReportEntry1 addAvlbty(CashBalanceAvailability1 avlbty) {
        getAvlbty().add(avlbty);
        return this;
    }

    /**
     * Adds a new item to the btch list.
     * @see #getBtch()
     * 
     */
    public ReportEntry1 addBtch(BatchInformation1 btch) {
        getBtch().add(btch);
        return this;
    }

    /**
     * Adds a new item to the chrgs list.
     * @see #getChrgs()
     * 
     */
    public ReportEntry1 addChrgs(ChargesInformation3 chrgs) {
        getChrgs().add(chrgs);
        return this;
    }

    /**
     * Adds a new item to the intrst list.
     * @see #getIntrst()
     * 
     */
    public ReportEntry1 addIntrst(TransactionInterest1 intrst) {
        getIntrst().add(intrst);
        return this;
    }

    /**
     * Adds a new item to the txDtls list.
     * @see #getTxDtls()
     * 
     */
    public ReportEntry1 addTxDtls(EntryTransaction1 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
