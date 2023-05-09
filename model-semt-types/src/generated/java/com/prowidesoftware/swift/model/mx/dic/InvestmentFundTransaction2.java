
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
@XmlType(name = "InvestmentFundTransaction2", propOrder = {
    "txTp",
    "corpActnEvtTp",
    "bookgSts",
    "mstrRef",
    "ordrRef",
    "dealRef",
    "legId",
    "legExctnId",
    "ordrDtTm",
    "sttldTxInd",
    "regdTxInd",
    "unitsQty",
    "cdtDbt",
    "rvsl",
    "grssSttlmAmt",
    "sttlmDt",
    "tradDtTm",
    "cumDvddInd",
    "prtlyExctdInd",
    "pricDtls"
})
public class InvestmentFundTransaction2 {

    @XmlElement(name = "TxTp")
    protected TransactionType1CodeChoice txTp;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType1CodeChoice corpActnEvtTp;
    @XmlElement(name = "BookgSts")
    @XmlSchemaType(name = "string")
    protected TransactionStatus1Code bookgSts;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef")
    protected String ordrRef;
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
    @XmlElement(name = "GrssSttlmAmt")
    protected ActiveCurrencyAndAmount grssSttlmAmt;
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
    protected UnitPrice1 pricDtls;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType1CodeChoice }
     *     
     */
    public TransactionType1CodeChoice getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType1CodeChoice }
     *     
     */
    public InvestmentFundTransaction2 setTxTp(TransactionType1CodeChoice value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType1CodeChoice }
     *     
     */
    public CorporateActionEventType1CodeChoice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType1CodeChoice }
     *     
     */
    public InvestmentFundTransaction2 setCorpActnEvtTp(CorporateActionEventType1CodeChoice value) {
        this.corpActnEvtTp = value;
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
    public InvestmentFundTransaction2 setBookgSts(TransactionStatus1Code value) {
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
    public InvestmentFundTransaction2 setMstrRef(String value) {
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
    public InvestmentFundTransaction2 setOrdrRef(String value) {
        this.ordrRef = value;
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
    public InvestmentFundTransaction2 setDealRef(String value) {
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
    public InvestmentFundTransaction2 setLegId(String value) {
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
    public InvestmentFundTransaction2 setLegExctnId(String value) {
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
    public InvestmentFundTransaction2 setOrdrDtTm(OffsetDateTime value) {
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
    public InvestmentFundTransaction2 setSttldTxInd(boolean value) {
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
    public InvestmentFundTransaction2 setRegdTxInd(boolean value) {
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
    public InvestmentFundTransaction2 setUnitsQty(FinancialInstrumentQuantity1 value) {
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
    public InvestmentFundTransaction2 setCdtDbt(CreditDebitCode value) {
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
    public InvestmentFundTransaction2 setRvsl(ReversalCode value) {
        this.rvsl = value;
        return this;
    }

    /**
     * Gets the value of the grssSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssSttlmAmt() {
        return grssSttlmAmt;
    }

    /**
     * Sets the value of the grssSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InvestmentFundTransaction2 setGrssSttlmAmt(ActiveCurrencyAndAmount value) {
        this.grssSttlmAmt = value;
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
    public InvestmentFundTransaction2 setSttlmDt(LocalDate value) {
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
    public InvestmentFundTransaction2 setTradDtTm(DateAndDateTimeChoice value) {
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
    public InvestmentFundTransaction2 setCumDvddInd(boolean value) {
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
    public InvestmentFundTransaction2 setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice1 }
     *     
     */
    public UnitPrice1 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice1 }
     *     
     */
    public InvestmentFundTransaction2 setPricDtls(UnitPrice1 value) {
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
