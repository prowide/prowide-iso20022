
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
 * Identifies the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryTransaction15", propOrder = {
    "refs",
    "amt",
    "cdtDbtInd",
    "amtDtls",
    "avlbty",
    "bkTxCd",
    "chrgs",
    "intrst",
    "rltdPties",
    "rltdAgts",
    "lclInstrm",
    "pmtTpInf",
    "purp",
    "rltdRmtInf",
    "rmtInf",
    "rltdDts",
    "rltdPric",
    "rltdQties",
    "finInstrmId",
    "tax",
    "rtrInf",
    "rltdCorpActn",
    "sfkpgAcct",
    "undrlygAllcn",
    "cshDpst",
    "cardTx",
    "instrCpy",
    "addtlTxInf",
    "splmtryData"
})
public class EntryTransaction15 {

    @XmlElement(name = "Refs")
    protected TransactionReferences6 refs;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange4 amtDtls;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Chrgs")
    protected Charges15 chrgs;
    @XmlElement(name = "Intrst")
    protected TransactionInterest4 intrst;
    @XmlElement(name = "RltdPties")
    protected TransactionParties12 rltdPties;
    @XmlElement(name = "RltdAgts")
    protected TransactionAgents6 rltdAgts;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation27 pmtTpInf;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation8> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation22 rmtInf;
    @XmlElement(name = "RltdDts")
    protected TransactionDates3 rltdDts;
    @XmlElement(name = "RltdPric")
    protected TransactionPrice4Choice rltdPric;
    @XmlElement(name = "RltdQties")
    protected List<TransactionQuantities4Choice> rltdQties;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Tax")
    protected TaxData1 tax;
    @XmlElement(name = "RtrInf")
    protected PaymentReturnReason8 rtrInf;
    @XmlElement(name = "RltdCorpActn")
    protected CorporateAction82 rltdCorpActn;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "UndrlygAllcn")
    protected List<TransactionAllocation1> undrlygAllcn;
    @XmlElement(name = "CshDpst")
    protected List<CashDeposit1> cshDpst;
    @XmlElement(name = "CardTx")
    protected CardTransaction18 cardTx;
    @XmlElement(name = "InstrCpy")
    protected String instrCpy;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences6 }
     *     
     */
    public TransactionReferences6 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences6 }
     *     
     */
    public EntryTransaction15 setRefs(TransactionReferences6 value) {
        this.refs = value;
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
    public EntryTransaction15 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public EntryTransaction15 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange4 }
     *     
     */
    public AmountAndCurrencyExchange4 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange4 }
     *     
     */
    public EntryTransaction15 setAmtDtls(AmountAndCurrencyExchange4 value) {
        this.amtDtls = value;
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
     * {@link CashAvailability1 }
     * 
     * 
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<CashAvailability1>();
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
    public EntryTransaction15 setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
        return this;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charges15 }
     *     
     */
    public Charges15 getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges15 }
     *     
     */
    public EntryTransaction15 setChrgs(Charges15 value) {
        this.chrgs = value;
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
    public EntryTransaction15 setIntrst(TransactionInterest4 value) {
        this.intrst = value;
        return this;
    }

    /**
     * Gets the value of the rltdPties property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties12 }
     *     
     */
    public TransactionParties12 getRltdPties() {
        return rltdPties;
    }

    /**
     * Sets the value of the rltdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties12 }
     *     
     */
    public EntryTransaction15 setRltdPties(TransactionParties12 value) {
        this.rltdPties = value;
        return this;
    }

    /**
     * Gets the value of the rltdAgts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAgents6 }
     *     
     */
    public TransactionAgents6 getRltdAgts() {
        return rltdAgts;
    }

    /**
     * Sets the value of the rltdAgts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAgents6 }
     *     
     */
    public EntryTransaction15 setRltdAgts(TransactionAgents6 value) {
        this.rltdAgts = value;
        return this;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public EntryTransaction15 setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
        return this;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation27 }
     *     
     */
    public PaymentTypeInformation27 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation27 }
     *     
     */
    public EntryTransaction15 setPmtTpInf(PaymentTypeInformation27 value) {
        this.pmtTpInf = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public EntryTransaction15 setPurp(Purpose2Choice value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation8 }
     * 
     * 
     */
    public List<RemittanceLocation8> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<RemittanceLocation8>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation22 }
     *     
     */
    public RemittanceInformation22 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation22 }
     *     
     */
    public EntryTransaction15 setRmtInf(RemittanceInformation22 value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the rltdDts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDates3 }
     *     
     */
    public TransactionDates3 getRltdDts() {
        return rltdDts;
    }

    /**
     * Sets the value of the rltdDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDates3 }
     *     
     */
    public EntryTransaction15 setRltdDts(TransactionDates3 value) {
        this.rltdDts = value;
        return this;
    }

    /**
     * Gets the value of the rltdPric property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPrice4Choice }
     *     
     */
    public TransactionPrice4Choice getRltdPric() {
        return rltdPric;
    }

    /**
     * Sets the value of the rltdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPrice4Choice }
     *     
     */
    public EntryTransaction15 setRltdPric(TransactionPrice4Choice value) {
        this.rltdPric = value;
        return this;
    }

    /**
     * Gets the value of the rltdQties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdQties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdQties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionQuantities4Choice }
     * 
     * 
     */
    public List<TransactionQuantities4Choice> getRltdQties() {
        if (rltdQties == null) {
            rltdQties = new ArrayList<TransactionQuantities4Choice>();
        }
        return this.rltdQties;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public EntryTransaction15 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public EntryTransaction15 setTax(TaxData1 value) {
        this.tax = value;
        return this;
    }

    /**
     * Gets the value of the rtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason8 }
     *     
     */
    public PaymentReturnReason8 getRtrInf() {
        return rtrInf;
    }

    /**
     * Sets the value of the rtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason8 }
     *     
     */
    public EntryTransaction15 setRtrInf(PaymentReturnReason8 value) {
        this.rtrInf = value;
        return this;
    }

    /**
     * Gets the value of the rltdCorpActn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction82 }
     *     
     */
    public CorporateAction82 getRltdCorpActn() {
        return rltdCorpActn;
    }

    /**
     * Sets the value of the rltdCorpActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction82 }
     *     
     */
    public EntryTransaction15 setRltdCorpActn(CorporateAction82 value) {
        this.rltdCorpActn = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public EntryTransaction15 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the undrlygAllcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygAllcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygAllcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionAllocation1 }
     * 
     * 
     */
    public List<TransactionAllocation1> getUndrlygAllcn() {
        if (undrlygAllcn == null) {
            undrlygAllcn = new ArrayList<TransactionAllocation1>();
        }
        return this.undrlygAllcn;
    }

    /**
     * Gets the value of the cshDpst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshDpst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDpst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashDeposit1 }
     * 
     * 
     */
    public List<CashDeposit1> getCshDpst() {
        if (cshDpst == null) {
            cshDpst = new ArrayList<CashDeposit1>();
        }
        return this.cshDpst;
    }

    /**
     * Gets the value of the cardTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction18 }
     *     
     */
    public CardTransaction18 getCardTx() {
        return cardTx;
    }

    /**
     * Sets the value of the cardTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction18 }
     *     
     */
    public EntryTransaction15 setCardTx(CardTransaction18 value) {
        this.cardTx = value;
        return this;
    }

    /**
     * Gets the value of the instrCpy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrCpy() {
        return instrCpy;
    }

    /**
     * Sets the value of the instrCpy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntryTransaction15 setInstrCpy(String value) {
        this.instrCpy = value;
        return this;
    }

    /**
     * Gets the value of the addtlTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxInf() {
        return addtlTxInf;
    }

    /**
     * Sets the value of the addtlTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EntryTransaction15 setAddtlTxInf(String value) {
        this.addtlTxInf = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
    public EntryTransaction15 addAvlbty(CashAvailability1 avlbty) {
        getAvlbty().add(avlbty);
        return this;
    }

    /**
     * Adds a new item to the rltdRmtInf list.
     * @see #getRltdRmtInf()
     * 
     */
    public EntryTransaction15 addRltdRmtInf(RemittanceLocation8 rltdRmtInf) {
        getRltdRmtInf().add(rltdRmtInf);
        return this;
    }

    /**
     * Adds a new item to the rltdQties list.
     * @see #getRltdQties()
     * 
     */
    public EntryTransaction15 addRltdQties(TransactionQuantities4Choice rltdQties) {
        getRltdQties().add(rltdQties);
        return this;
    }

    /**
     * Adds a new item to the undrlygAllcn list.
     * @see #getUndrlygAllcn()
     * 
     */
    public EntryTransaction15 addUndrlygAllcn(TransactionAllocation1 undrlygAllcn) {
        getUndrlygAllcn().add(undrlygAllcn);
        return this;
    }

    /**
     * Adds a new item to the cshDpst list.
     * @see #getCshDpst()
     * 
     */
    public EntryTransaction15 addCshDpst(CashDeposit1 cshDpst) {
        getCshDpst().add(cshDpst);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public EntryTransaction15 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
