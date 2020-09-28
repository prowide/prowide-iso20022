
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional restrictions on the financial instrument, related to the stipulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentStipulations2", propOrder = {
    "geogcs",
    "yldRg",
    "ratg",
    "cpnRg",
    "amtsblInd",
    "purp",
    "altrntvMinTaxInd",
    "autoRinvstmt",
    "txConds",
    "ccy",
    "cstmDt",
    "hrcut",
    "insrdInd",
    "lookBck",
    "mtrtyDt",
    "isseDt",
    "issrId",
    "isseSz",
    "minDnmtn",
    "maxSbstitn",
    "minIncrmt",
    "pmtFrqcy",
    "minQty",
    "pdctn",
    "rstrctdInd",
    "pricFrqcy",
    "sctr",
    "sbstitnFrqcy",
    "sbstitnLft",
    "whlPoolInd",
    "pricSrc",
    "xprtnDt",
    "overAlltmtAmt",
    "overAlltmtRate",
    "pricRg",
    "cllblInd",
    "convtblInd",
    "putblInd",
    "preFnddInd",
    "escrwdInd",
    "perptlInd"
})
public class FinancialInstrumentStipulations2 {

    @XmlElement(name = "Geogcs")
    protected String geogcs;
    @XmlElement(name = "YldRg")
    protected AmountOrPercentageRange yldRg;
    @XmlElement(name = "Ratg")
    protected Rating1 ratg;
    @XmlElement(name = "CpnRg")
    protected AmountOrPercentageRange cpnRg;
    @XmlElement(name = "AmtsblInd")
    protected Boolean amtsblInd;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "AltrntvMinTaxInd")
    protected Boolean altrntvMinTaxInd;
    @XmlElement(name = "AutoRinvstmt")
    protected BigDecimal autoRinvstmt;
    @XmlElement(name = "TxConds")
    @XmlSchemaType(name = "string")
    protected TradeTransactionCondition2Code txConds;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CstmDt")
    protected DateTimePeriodDetails1 cstmDt;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "InsrdInd")
    protected Boolean insrdInd;
    @XmlElement(name = "LookBck")
    protected BigDecimal lookBck;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "IssrId")
    protected String issrId;
    @XmlElement(name = "IsseSz")
    protected BigDecimal isseSz;
    @XmlElement(name = "MinDnmtn")
    protected FinancialInstrumentQuantityChoice minDnmtn;
    @XmlElement(name = "MaxSbstitn")
    protected BigDecimal maxSbstitn;
    @XmlElement(name = "MinIncrmt")
    protected FinancialInstrumentQuantityChoice minIncrmt;
    @XmlElement(name = "PmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code pmtFrqcy;
    @XmlElement(name = "MinQty")
    protected FinancialInstrumentQuantityChoice minQty;
    @XmlElement(name = "Pdctn")
    protected String pdctn;
    @XmlElement(name = "RstrctdInd")
    protected Boolean rstrctdInd;
    @XmlElement(name = "PricFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code pricFrqcy;
    @XmlElement(name = "Sctr")
    protected String sctr;
    @XmlElement(name = "SbstitnFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code sbstitnFrqcy;
    @XmlElement(name = "SbstitnLft")
    protected BigDecimal sbstitnLft;
    @XmlElement(name = "WhlPoolInd")
    protected Boolean whlPoolInd;
    @XmlElement(name = "PricSrc")
    protected String pricSrc;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "OverAlltmtAmt")
    protected ActiveCurrencyAndAmount overAlltmtAmt;
    @XmlElement(name = "OverAlltmtRate")
    protected BigDecimal overAlltmtRate;
    @XmlElement(name = "PricRg")
    protected AmountOrPercentageRange pricRg;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "PreFnddInd")
    protected Boolean preFnddInd;
    @XmlElement(name = "EscrwdInd")
    protected Boolean escrwdInd;
    @XmlElement(name = "PerptlInd")
    protected Boolean perptlInd;

    /**
     * Gets the value of the geogcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcs() {
        return geogcs;
    }

    /**
     * Sets the value of the geogcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setGeogcs(String value) {
        this.geogcs = value;
        return this;
    }

    /**
     * Gets the value of the yldRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange }
     *     
     */
    public AmountOrPercentageRange getYldRg() {
        return yldRg;
    }

    /**
     * Sets the value of the yldRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange }
     *     
     */
    public FinancialInstrumentStipulations2 setYldRg(AmountOrPercentageRange value) {
        this.yldRg = value;
        return this;
    }

    /**
     * Gets the value of the ratg property.
     * 
     * @return
     *     possible object is
     *     {@link Rating1 }
     *     
     */
    public Rating1 getRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating1 }
     *     
     */
    public FinancialInstrumentStipulations2 setRatg(Rating1 value) {
        this.ratg = value;
        return this;
    }

    /**
     * Gets the value of the cpnRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange }
     *     
     */
    public AmountOrPercentageRange getCpnRg() {
        return cpnRg;
    }

    /**
     * Sets the value of the cpnRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange }
     *     
     */
    public FinancialInstrumentStipulations2 setCpnRg(AmountOrPercentageRange value) {
        this.cpnRg = value;
        return this;
    }

    /**
     * Gets the value of the amtsblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmtsblInd() {
        return amtsblInd;
    }

    /**
     * Sets the value of the amtsblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setAmtsblInd(Boolean value) {
        this.amtsblInd = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the altrntvMinTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAltrntvMinTaxInd() {
        return altrntvMinTaxInd;
    }

    /**
     * Sets the value of the altrntvMinTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setAltrntvMinTaxInd(Boolean value) {
        this.altrntvMinTaxInd = value;
        return this;
    }

    /**
     * Gets the value of the autoRinvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutoRinvstmt() {
        return autoRinvstmt;
    }

    /**
     * Sets the value of the autoRinvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setAutoRinvstmt(BigDecimal value) {
        this.autoRinvstmt = value;
        return this;
    }

    /**
     * Gets the value of the txConds property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCondition2Code }
     *     
     */
    public TradeTransactionCondition2Code getTxConds() {
        return txConds;
    }

    /**
     * Sets the value of the txConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCondition2Code }
     *     
     */
    public FinancialInstrumentStipulations2 setTxConds(TradeTransactionCondition2Code value) {
        this.txConds = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cstmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public DateTimePeriodDetails1 getCstmDt() {
        return cstmDt;
    }

    /**
     * Sets the value of the cstmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public FinancialInstrumentStipulations2 setCstmDt(DateTimePeriodDetails1 value) {
        this.cstmDt = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the insrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrdInd() {
        return insrdInd;
    }

    /**
     * Sets the value of the insrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setInsrdInd(Boolean value) {
        this.insrdInd = value;
        return this;
    }

    /**
     * Gets the value of the lookBck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLookBck() {
        return lookBck;
    }

    /**
     * Sets the value of the lookBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setLookBck(BigDecimal value) {
        this.lookBck = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentStipulations2 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentStipulations2 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the issrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrId() {
        return issrId;
    }

    /**
     * Sets the value of the issrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setIssrId(String value) {
        this.issrId = value;
        return this;
    }

    /**
     * Gets the value of the isseSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsseSz() {
        return isseSz;
    }

    /**
     * Sets the value of the isseSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setIsseSz(BigDecimal value) {
        this.isseSz = value;
        return this;
    }

    /**
     * Gets the value of the minDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinDnmtn() {
        return minDnmtn;
    }

    /**
     * Sets the value of the minDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentStipulations2 setMinDnmtn(FinancialInstrumentQuantityChoice value) {
        this.minDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the maxSbstitn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSbstitn() {
        return maxSbstitn;
    }

    /**
     * Sets the value of the maxSbstitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setMaxSbstitn(BigDecimal value) {
        this.maxSbstitn = value;
        return this;
    }

    /**
     * Gets the value of the minIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinIncrmt() {
        return minIncrmt;
    }

    /**
     * Sets the value of the minIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentStipulations2 setMinIncrmt(FinancialInstrumentQuantityChoice value) {
        this.minIncrmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public FinancialInstrumentStipulations2 setPmtFrqcy(Frequency1Code value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the minQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinQty() {
        return minQty;
    }

    /**
     * Sets the value of the minQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentStipulations2 setMinQty(FinancialInstrumentQuantityChoice value) {
        this.minQty = value;
        return this;
    }

    /**
     * Gets the value of the pdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctn() {
        return pdctn;
    }

    /**
     * Sets the value of the pdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setPdctn(String value) {
        this.pdctn = value;
        return this;
    }

    /**
     * Gets the value of the rstrctdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdInd() {
        return rstrctdInd;
    }

    /**
     * Sets the value of the rstrctdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setRstrctdInd(Boolean value) {
        this.rstrctdInd = value;
        return this;
    }

    /**
     * Gets the value of the pricFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getPricFrqcy() {
        return pricFrqcy;
    }

    /**
     * Sets the value of the pricFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public FinancialInstrumentStipulations2 setPricFrqcy(Frequency1Code value) {
        this.pricFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setSctr(String value) {
        this.sctr = value;
        return this;
    }

    /**
     * Gets the value of the sbstitnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getSbstitnFrqcy() {
        return sbstitnFrqcy;
    }

    /**
     * Sets the value of the sbstitnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public FinancialInstrumentStipulations2 setSbstitnFrqcy(Frequency1Code value) {
        this.sbstitnFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the sbstitnLft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbstitnLft() {
        return sbstitnLft;
    }

    /**
     * Sets the value of the sbstitnLft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setSbstitnLft(BigDecimal value) {
        this.sbstitnLft = value;
        return this;
    }

    /**
     * Gets the value of the whlPoolInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhlPoolInd() {
        return whlPoolInd;
    }

    /**
     * Sets the value of the whlPoolInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setWhlPoolInd(Boolean value) {
        this.whlPoolInd = value;
        return this;
    }

    /**
     * Gets the value of the pricSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricSrc() {
        return pricSrc;
    }

    /**
     * Sets the value of the pricSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentStipulations2 setPricSrc(String value) {
        this.pricSrc = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrumentStipulations2 setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the overAlltmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOverAlltmtAmt() {
        return overAlltmtAmt;
    }

    /**
     * Sets the value of the overAlltmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentStipulations2 setOverAlltmtAmt(ActiveCurrencyAndAmount value) {
        this.overAlltmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the overAlltmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverAlltmtRate() {
        return overAlltmtRate;
    }

    /**
     * Sets the value of the overAlltmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentStipulations2 setOverAlltmtRate(BigDecimal value) {
        this.overAlltmtRate = value;
        return this;
    }

    /**
     * Gets the value of the pricRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange }
     *     
     */
    public AmountOrPercentageRange getPricRg() {
        return pricRg;
    }

    /**
     * Sets the value of the pricRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange }
     *     
     */
    public FinancialInstrumentStipulations2 setPricRg(AmountOrPercentageRange value) {
        this.pricRg = value;
        return this;
    }

    /**
     * Gets the value of the cllblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCllblInd() {
        return cllblInd;
    }

    /**
     * Sets the value of the cllblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setCllblInd(Boolean value) {
        this.cllblInd = value;
        return this;
    }

    /**
     * Gets the value of the convtblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvtblInd() {
        return convtblInd;
    }

    /**
     * Sets the value of the convtblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setConvtblInd(Boolean value) {
        this.convtblInd = value;
        return this;
    }

    /**
     * Gets the value of the putblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPutblInd() {
        return putblInd;
    }

    /**
     * Sets the value of the putblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setPutblInd(Boolean value) {
        this.putblInd = value;
        return this;
    }

    /**
     * Gets the value of the preFnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreFnddInd() {
        return preFnddInd;
    }

    /**
     * Sets the value of the preFnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setPreFnddInd(Boolean value) {
        this.preFnddInd = value;
        return this;
    }

    /**
     * Gets the value of the escrwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscrwdInd() {
        return escrwdInd;
    }

    /**
     * Sets the value of the escrwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setEscrwdInd(Boolean value) {
        this.escrwdInd = value;
        return this;
    }

    /**
     * Gets the value of the perptlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerptlInd() {
        return perptlInd;
    }

    /**
     * Sets the value of the perptlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentStipulations2 setPerptlInd(Boolean value) {
        this.perptlInd = value;
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
