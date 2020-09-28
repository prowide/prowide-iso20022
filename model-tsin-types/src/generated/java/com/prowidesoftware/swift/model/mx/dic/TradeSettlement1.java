
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
 * Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSettlement1", propOrder = {
    "duePyblAmt",
    "cdtrRef",
    "pmtRef",
    "invcCcyCd",
    "invcr",
    "invcee",
    "pyee",
    "pyer",
    "taxCcyXchg",
    "invcCcyXchg",
    "pmtCcyXchg",
    "pmtMeans",
    "tax",
    "bllgPrd",
    "allwncChrg",
    "subTtlClctdTax",
    "logstcsChrg",
    "pmtTerms",
    "mntrySummtn",
    "adjstmntAmtAndRsn",
    "invcRefdDoc",
    "profrmInvcRefdDoc",
    "lttrOfCdtRefdDoc",
    "finCard",
    "purchsAcctgAcct",
    "issrFactrgListId",
    "issrFactrgAgrmtId"
})
public class TradeSettlement1 {

    @XmlElement(name = "DuePyblAmt")
    protected List<CurrencyAndAmount> duePyblAmt;
    @XmlElement(name = "CdtrRef")
    protected List<CreditorReferenceInformation2> cdtrRef;
    @XmlElement(name = "PmtRef")
    protected List<String> pmtRef;
    @XmlElement(name = "InvcCcyCd")
    protected String invcCcyCd;
    @XmlElement(name = "Invcr")
    protected TradeParty1 invcr;
    @XmlElement(name = "Invcee")
    protected TradeParty1 invcee;
    @XmlElement(name = "Pyee")
    protected TradeParty1 pyee;
    @XmlElement(name = "Pyer")
    protected TradeParty1 pyer;
    @XmlElement(name = "TaxCcyXchg")
    protected CurrencyReference2 taxCcyXchg;
    @XmlElement(name = "InvcCcyXchg")
    protected CurrencyReference2 invcCcyXchg;
    @XmlElement(name = "PmtCcyXchg")
    protected CurrencyReference2 pmtCcyXchg;
    @XmlElement(name = "PmtMeans")
    protected List<PaymentMeans1> pmtMeans;
    @XmlElement(name = "Tax")
    protected List<SettlementTax1> tax;
    @XmlElement(name = "BllgPrd")
    protected Period1 bllgPrd;
    @XmlElement(name = "AllwncChrg")
    protected List<SettlementAllowanceCharge1> allwncChrg;
    @XmlElement(name = "SubTtlClctdTax")
    protected List<SettlementSubTotalCalculatedTax1> subTtlClctdTax;
    @XmlElement(name = "LogstcsChrg")
    protected List<ChargesDetails2> logstcsChrg;
    @XmlElement(name = "PmtTerms")
    protected List<PaymentTerms3> pmtTerms;
    @XmlElement(name = "MntrySummtn", required = true)
    protected SettlementMonetarySummation1 mntrySummtn;
    @XmlElement(name = "AdjstmntAmtAndRsn")
    protected List<DocumentAdjustment2> adjstmntAmtAndRsn;
    @XmlElement(name = "InvcRefdDoc")
    protected DocumentIdentification22 invcRefdDoc;
    @XmlElement(name = "ProfrmInvcRefdDoc")
    protected DocumentIdentification22 profrmInvcRefdDoc;
    @XmlElement(name = "LttrOfCdtRefdDoc")
    protected DocumentIdentification7 lttrOfCdtRefdDoc;
    @XmlElement(name = "FinCard")
    protected List<FinancialCard1> finCard;
    @XmlElement(name = "PurchsAcctgAcct")
    protected List<AccountingAccount1> purchsAcctgAcct;
    @XmlElement(name = "IssrFactrgListId")
    protected List<String> issrFactrgListId;
    @XmlElement(name = "IssrFactrgAgrmtId")
    protected List<String> issrFactrgAgrmtId;

    /**
     * Gets the value of the duePyblAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duePyblAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuePyblAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getDuePyblAmt() {
        if (duePyblAmt == null) {
            duePyblAmt = new ArrayList<CurrencyAndAmount>();
        }
        return this.duePyblAmt;
    }

    /**
     * Gets the value of the cdtrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditorReferenceInformation2 }
     * 
     * 
     */
    public List<CreditorReferenceInformation2> getCdtrRef() {
        if (cdtrRef == null) {
            cdtrRef = new ArrayList<CreditorReferenceInformation2>();
        }
        return this.cdtrRef;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtRef() {
        if (pmtRef == null) {
            pmtRef = new ArrayList<String>();
        }
        return this.pmtRef;
    }

    /**
     * Gets the value of the invcCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcCcyCd() {
        return invcCcyCd;
    }

    /**
     * Sets the value of the invcCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeSettlement1 setInvcCcyCd(String value) {
        this.invcCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the invcr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getInvcr() {
        return invcr;
    }

    /**
     * Sets the value of the invcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeSettlement1 setInvcr(TradeParty1 value) {
        this.invcr = value;
        return this;
    }

    /**
     * Gets the value of the invcee property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getInvcee() {
        return invcee;
    }

    /**
     * Sets the value of the invcee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeSettlement1 setInvcee(TradeParty1 value) {
        this.invcee = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeSettlement1 setPyee(TradeParty1 value) {
        this.pyee = value;
        return this;
    }

    /**
     * Gets the value of the pyer property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getPyer() {
        return pyer;
    }

    /**
     * Sets the value of the pyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeSettlement1 setPyer(TradeParty1 value) {
        this.pyer = value;
        return this;
    }

    /**
     * Gets the value of the taxCcyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReference2 }
     *     
     */
    public CurrencyReference2 getTaxCcyXchg() {
        return taxCcyXchg;
    }

    /**
     * Sets the value of the taxCcyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReference2 }
     *     
     */
    public TradeSettlement1 setTaxCcyXchg(CurrencyReference2 value) {
        this.taxCcyXchg = value;
        return this;
    }

    /**
     * Gets the value of the invcCcyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReference2 }
     *     
     */
    public CurrencyReference2 getInvcCcyXchg() {
        return invcCcyXchg;
    }

    /**
     * Sets the value of the invcCcyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReference2 }
     *     
     */
    public TradeSettlement1 setInvcCcyXchg(CurrencyReference2 value) {
        this.invcCcyXchg = value;
        return this;
    }

    /**
     * Gets the value of the pmtCcyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReference2 }
     *     
     */
    public CurrencyReference2 getPmtCcyXchg() {
        return pmtCcyXchg;
    }

    /**
     * Sets the value of the pmtCcyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReference2 }
     *     
     */
    public TradeSettlement1 setPmtCcyXchg(CurrencyReference2 value) {
        this.pmtCcyXchg = value;
        return this;
    }

    /**
     * Gets the value of the pmtMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeans1 }
     * 
     * 
     */
    public List<PaymentMeans1> getPmtMeans() {
        if (pmtMeans == null) {
            pmtMeans = new ArrayList<PaymentMeans1>();
        }
        return this.pmtMeans;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTax1 }
     * 
     * 
     */
    public List<SettlementTax1> getTax() {
        if (tax == null) {
            tax = new ArrayList<SettlementTax1>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the bllgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getBllgPrd() {
        return bllgPrd;
    }

    /**
     * Sets the value of the bllgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public TradeSettlement1 setBllgPrd(Period1 value) {
        this.bllgPrd = value;
        return this;
    }

    /**
     * Gets the value of the allwncChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwncChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwncChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementAllowanceCharge1 }
     * 
     * 
     */
    public List<SettlementAllowanceCharge1> getAllwncChrg() {
        if (allwncChrg == null) {
            allwncChrg = new ArrayList<SettlementAllowanceCharge1>();
        }
        return this.allwncChrg;
    }

    /**
     * Gets the value of the subTtlClctdTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTtlClctdTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTtlClctdTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementSubTotalCalculatedTax1 }
     * 
     * 
     */
    public List<SettlementSubTotalCalculatedTax1> getSubTtlClctdTax() {
        if (subTtlClctdTax == null) {
            subTtlClctdTax = new ArrayList<SettlementSubTotalCalculatedTax1>();
        }
        return this.subTtlClctdTax;
    }

    /**
     * Gets the value of the logstcsChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logstcsChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogstcsChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesDetails2 }
     * 
     * 
     */
    public List<ChargesDetails2> getLogstcsChrg() {
        if (logstcsChrg == null) {
            logstcsChrg = new ArrayList<ChargesDetails2>();
        }
        return this.logstcsChrg;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms3 }
     * 
     * 
     */
    public List<PaymentTerms3> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<PaymentTerms3>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the mntrySummtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementMonetarySummation1 }
     *     
     */
    public SettlementMonetarySummation1 getMntrySummtn() {
        return mntrySummtn;
    }

    /**
     * Sets the value of the mntrySummtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementMonetarySummation1 }
     *     
     */
    public TradeSettlement1 setMntrySummtn(SettlementMonetarySummation1 value) {
        this.mntrySummtn = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntAmtAndRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmntAmtAndRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmntAmtAndRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAdjustment2 }
     * 
     * 
     */
    public List<DocumentAdjustment2> getAdjstmntAmtAndRsn() {
        if (adjstmntAmtAndRsn == null) {
            adjstmntAmtAndRsn = new ArrayList<DocumentAdjustment2>();
        }
        return this.adjstmntAmtAndRsn;
    }

    /**
     * Gets the value of the invcRefdDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getInvcRefdDoc() {
        return invcRefdDoc;
    }

    /**
     * Sets the value of the invcRefdDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeSettlement1 setInvcRefdDoc(DocumentIdentification22 value) {
        this.invcRefdDoc = value;
        return this;
    }

    /**
     * Gets the value of the profrmInvcRefdDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getProfrmInvcRefdDoc() {
        return profrmInvcRefdDoc;
    }

    /**
     * Sets the value of the profrmInvcRefdDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeSettlement1 setProfrmInvcRefdDoc(DocumentIdentification22 value) {
        this.profrmInvcRefdDoc = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfCdtRefdDoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getLttrOfCdtRefdDoc() {
        return lttrOfCdtRefdDoc;
    }

    /**
     * Sets the value of the lttrOfCdtRefdDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public TradeSettlement1 setLttrOfCdtRefdDoc(DocumentIdentification7 value) {
        this.lttrOfCdtRefdDoc = value;
        return this;
    }

    /**
     * Gets the value of the finCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialCard1 }
     * 
     * 
     */
    public List<FinancialCard1> getFinCard() {
        if (finCard == null) {
            finCard = new ArrayList<FinancialCard1>();
        }
        return this.finCard;
    }

    /**
     * Gets the value of the purchsAcctgAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchsAcctgAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchsAcctgAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingAccount1 }
     * 
     * 
     */
    public List<AccountingAccount1> getPurchsAcctgAcct() {
        if (purchsAcctgAcct == null) {
            purchsAcctgAcct = new ArrayList<AccountingAccount1>();
        }
        return this.purchsAcctgAcct;
    }

    /**
     * Gets the value of the issrFactrgListId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrFactrgListId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrFactrgListId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIssrFactrgListId() {
        if (issrFactrgListId == null) {
            issrFactrgListId = new ArrayList<String>();
        }
        return this.issrFactrgListId;
    }

    /**
     * Gets the value of the issrFactrgAgrmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrFactrgAgrmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrFactrgAgrmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIssrFactrgAgrmtId() {
        if (issrFactrgAgrmtId == null) {
            issrFactrgAgrmtId = new ArrayList<String>();
        }
        return this.issrFactrgAgrmtId;
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
     * Adds a new item to the duePyblAmt list.
     * @see #getDuePyblAmt()
     * 
     */
    public TradeSettlement1 addDuePyblAmt(CurrencyAndAmount duePyblAmt) {
        getDuePyblAmt().add(duePyblAmt);
        return this;
    }

    /**
     * Adds a new item to the cdtrRef list.
     * @see #getCdtrRef()
     * 
     */
    public TradeSettlement1 addCdtrRef(CreditorReferenceInformation2 cdtrRef) {
        getCdtrRef().add(cdtrRef);
        return this;
    }

    /**
     * Adds a new item to the pmtRef list.
     * @see #getPmtRef()
     * 
     */
    public TradeSettlement1 addPmtRef(String pmtRef) {
        getPmtRef().add(pmtRef);
        return this;
    }

    /**
     * Adds a new item to the pmtMeans list.
     * @see #getPmtMeans()
     * 
     */
    public TradeSettlement1 addPmtMeans(PaymentMeans1 pmtMeans) {
        getPmtMeans().add(pmtMeans);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public TradeSettlement1 addTax(SettlementTax1 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the allwncChrg list.
     * @see #getAllwncChrg()
     * 
     */
    public TradeSettlement1 addAllwncChrg(SettlementAllowanceCharge1 allwncChrg) {
        getAllwncChrg().add(allwncChrg);
        return this;
    }

    /**
     * Adds a new item to the subTtlClctdTax list.
     * @see #getSubTtlClctdTax()
     * 
     */
    public TradeSettlement1 addSubTtlClctdTax(SettlementSubTotalCalculatedTax1 subTtlClctdTax) {
        getSubTtlClctdTax().add(subTtlClctdTax);
        return this;
    }

    /**
     * Adds a new item to the logstcsChrg list.
     * @see #getLogstcsChrg()
     * 
     */
    public TradeSettlement1 addLogstcsChrg(ChargesDetails2 logstcsChrg) {
        getLogstcsChrg().add(logstcsChrg);
        return this;
    }

    /**
     * Adds a new item to the pmtTerms list.
     * @see #getPmtTerms()
     * 
     */
    public TradeSettlement1 addPmtTerms(PaymentTerms3 pmtTerms) {
        getPmtTerms().add(pmtTerms);
        return this;
    }

    /**
     * Adds a new item to the adjstmntAmtAndRsn list.
     * @see #getAdjstmntAmtAndRsn()
     * 
     */
    public TradeSettlement1 addAdjstmntAmtAndRsn(DocumentAdjustment2 adjstmntAmtAndRsn) {
        getAdjstmntAmtAndRsn().add(adjstmntAmtAndRsn);
        return this;
    }

    /**
     * Adds a new item to the finCard list.
     * @see #getFinCard()
     * 
     */
    public TradeSettlement1 addFinCard(FinancialCard1 finCard) {
        getFinCard().add(finCard);
        return this;
    }

    /**
     * Adds a new item to the purchsAcctgAcct list.
     * @see #getPurchsAcctgAcct()
     * 
     */
    public TradeSettlement1 addPurchsAcctgAcct(AccountingAccount1 purchsAcctgAcct) {
        getPurchsAcctgAcct().add(purchsAcctgAcct);
        return this;
    }

    /**
     * Adds a new item to the issrFactrgListId list.
     * @see #getIssrFactrgListId()
     * 
     */
    public TradeSettlement1 addIssrFactrgListId(String issrFactrgListId) {
        getIssrFactrgListId().add(issrFactrgListId);
        return this;
    }

    /**
     * Adds a new item to the issrFactrgAgrmtId list.
     * @see #getIssrFactrgAgrmtId()
     * 
     */
    public TradeSettlement1 addIssrFactrgAgrmtId(String issrFactrgAgrmtId) {
        getIssrFactrgAgrmtId().add(issrFactrgAgrmtId);
        return this;
    }

}
