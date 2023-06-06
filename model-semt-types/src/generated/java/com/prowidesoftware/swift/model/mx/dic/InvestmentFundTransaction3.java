
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundTransaction3", propOrder = {
    "txTp",
    "xtndedTxTp",
    "corpActnEvtTp",
    "xtndedCorpActnEvtTp",
    "bookgSts",
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "legId",
    "legExctnId",
    "ordrDtTm",
    "sttldTxInd",
    "regdTxInd",
    "unitsQty",
    "cdtDbt",
    "rvsl",
    "sttlmAmt",
    "sttlmDt",
    "tradDtTm",
    "cumDvddInd",
    "prtlyExctdInd",
    "pricDtls"
})
public class InvestmentFundTransaction3 {

    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected TransactionType2Code txTp;
    @XmlElement(name = "XtndedTxTp")
    protected String xtndedTxTp;
    @XmlElement(name = "CorpActnEvtTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionEventType1Code corpActnEvtTp;
    @XmlElement(name = "XtndedCorpActnEvtTp")
    protected String xtndedCorpActnEvtTp;
    @XmlElement(name = "BookgSts")
    @XmlSchemaType(name = "string")
    protected TransactionStatus1Code bookgSts;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef")
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "LegExctnId")
    protected String legExctnId;
    @XmlElement(name = "OrdrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ordrDtTm;
    @XmlElement(name = "SttldTxInd")
    protected boolean sttldTxInd;
    @XmlElement(name = "RegdTxInd")
    protected boolean regdTxInd;
    @XmlElement(name = "UnitsQty", required = true)
    protected FinancialInstrumentQuantity1 unitsQty;
    @XmlElement(name = "CdtDbt", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbt;
    @XmlElement(name = "Rvsl")
    @XmlSchemaType(name = "string")
    protected ReversalCode rvsl;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sttlmDt;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "PrtlyExctdInd")
    protected boolean prtlyExctdInd;
    @XmlElement(name = "PricDtls")
    protected UnitPrice11 pricDtls;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType2Code }
     *     
     */
    public TransactionType2Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType2Code }
     *     
     */
    public InvestmentFundTransaction3 setTxTp(TransactionType2Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTxTp() {
        return xtndedTxTp;
    }

    /**
     * Sets the value of the xtndedTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setXtndedTxTp(String value) {
        this.xtndedTxTp = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType1Code }
     *     
     */
    public CorporateActionEventType1Code getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType1Code }
     *     
     */
    public InvestmentFundTransaction3 setCorpActnEvtTp(CorporateActionEventType1Code value) {
        this.corpActnEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCorpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCorpActnEvtTp() {
        return xtndedCorpActnEvtTp;
    }

    /**
     * Sets the value of the xtndedCorpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setXtndedCorpActnEvtTp(String value) {
        this.xtndedCorpActnEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the bookgSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus1Code }
     *     
     */
    public TransactionStatus1Code getBookgSts() {
        return bookgSts;
    }

    /**
     * Sets the value of the bookgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus1Code }
     *     
     */
    public InvestmentFundTransaction3 setBookgSts(TransactionStatus1Code value) {
        this.bookgSts = value;
        return this;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setLegId(String value) {
        this.legId = value;
        return this;
    }

    /**
     * Gets the value of the legExctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExctnId() {
        return legExctnId;
    }

    /**
     * Sets the value of the legExctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setLegExctnId(String value) {
        this.legExctnId = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setOrdrDtTm(OffsetDateTime value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sttldTxInd property.
     * 
     */
    public boolean isSttldTxInd() {
        return sttldTxInd;
    }

    /**
     * Sets the value of the sttldTxInd property.
     * 
     */
    public InvestmentFundTransaction3 setSttldTxInd(boolean value) {
        this.sttldTxInd = value;
        return this;
    }

    /**
     * Gets the value of the regdTxInd property.
     * 
     */
    public boolean isRegdTxInd() {
        return regdTxInd;
    }

    /**
     * Sets the value of the regdTxInd property.
     * 
     */
    public InvestmentFundTransaction3 setRegdTxInd(boolean value) {
        this.regdTxInd = value;
        return this;
    }

    /**
     * Gets the value of the unitsQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getUnitsQty() {
        return unitsQty;
    }

    /**
     * Sets the value of the unitsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public InvestmentFundTransaction3 setUnitsQty(FinancialInstrumentQuantity1 value) {
        this.unitsQty = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public InvestmentFundTransaction3 setCdtDbt(CreditDebitCode value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the rvsl property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalCode }
     *     
     */
    public ReversalCode getRvsl() {
        return rvsl;
    }

    /**
     * Sets the value of the rvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalCode }
     *     
     */
    public InvestmentFundTransaction3 setRvsl(ReversalCode value) {
        this.rvsl = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentFundTransaction3 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransaction3 setSttlmDt(LocalDate value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public InvestmentFundTransaction3 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public InvestmentFundTransaction3 setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
        return this;
    }

    /**
     * Gets the value of the prtlyExctdInd property.
     * 
     */
    public boolean isPrtlyExctdInd() {
        return prtlyExctdInd;
    }

    /**
     * Sets the value of the prtlyExctdInd property.
     * 
     */
    public InvestmentFundTransaction3 setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice11 }
     *     
     */
    public UnitPrice11 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice11 }
     *     
     */
    public InvestmentFundTransaction3 setPricDtls(UnitPrice11 value) {
        this.pricDtls = value;
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

}
