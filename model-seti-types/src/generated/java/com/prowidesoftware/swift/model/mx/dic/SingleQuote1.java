
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Identifies elements related to a single quote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleQuote1", propOrder = {
    "qlfr",
    "ccy",
    "vldUntilDtTm",
    "bidSd",
    "midSd",
    "offerSd",
    "sprdAndBchmkCrvDtls",
    "finInstrmDtls",
    "undrlygFinInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "instrmLegGrpDtls",
    "midYld",
    "bidYld",
    "offerYld",
    "tradgSsnDtls",
    "rltdPties",
    "twoLegTxDtls",
    "ordrDtls",
    "sttlmDtls",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties"
})
public class SingleQuote1 {

    @XmlElement(name = "Qlfr")
    @XmlSchemaType(name = "string")
    protected List<Qualifier1Code> qlfr;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "VldUntilDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntilDtTm;
    @XmlElement(name = "BidSd")
    protected List<QuoteSide1> bidSd;
    @XmlElement(name = "MidSd")
    protected List<QuoteSide1> midSd;
    @XmlElement(name = "OfferSd")
    protected List<QuoteSide1> offerSd;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "UndrlygFinInstrmDtls")
    protected List<SecurityIdentification7> undrlygFinInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations stiptns;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "InstrmLegGrpDtls")
    protected List<InstrumentLeg2> instrmLegGrpDtls;
    @XmlElement(name = "MidYld")
    protected YieldCalculation1 midYld;
    @XmlElement(name = "BidYld")
    protected YieldCalculation1 bidYld;
    @XmlElement(name = "OfferYld")
    protected YieldCalculation1 offerYld;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "RltdPties")
    protected List<Intermediary14> rltdPties;
    @XmlElement(name = "TwoLegTxDtls")
    protected SecuritiesFinancing1 twoLegTxDtls;
    @XmlElement(name = "OrdrDtls")
    protected Order1 ordrDtls;
    @XmlElement(name = "SttlmDtls")
    protected SecuritiesSettlement1 sttlmDtls;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties", required = true)
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Qualifier1Code }
     * 
     * 
     */
    public List<Qualifier1Code> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<Qualifier1Code>();
        }
        return this.qlfr;
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
    public SingleQuote1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the vldUntilDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldUntilDtTm() {
        return vldUntilDtTm;
    }

    /**
     * Sets the value of the vldUntilDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SingleQuote1 setVldUntilDtTm(XMLGregorianCalendar value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the bidSd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidSd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidSd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSide1 }
     * 
     * 
     */
    public List<QuoteSide1> getBidSd() {
        if (bidSd == null) {
            bidSd = new ArrayList<QuoteSide1>();
        }
        return this.bidSd;
    }

    /**
     * Gets the value of the midSd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the midSd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMidSd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSide1 }
     * 
     * 
     */
    public List<QuoteSide1> getMidSd() {
        if (midSd == null) {
            midSd = new ArrayList<QuoteSide1>();
        }
        return this.midSd;
    }

    /**
     * Gets the value of the offerSd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerSd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferSd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteSide1 }
     * 
     * 
     */
    public List<QuoteSide1> getOfferSd() {
        if (offerSd == null) {
            offerSd = new ArrayList<QuoteSide1>();
        }
        return this.offerSd;
    }

    /**
     * Gets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public BenchmarkCurve1 getSprdAndBchmkCrvDtls() {
        return sprdAndBchmkCrvDtls;
    }

    /**
     * Sets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public SingleQuote1 setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SingleQuote1 setFinInstrmDtls(SecurityIdentification7 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getUndrlygFinInstrmDtls() {
        if (undrlygFinInstrmDtls == null) {
            undrlygFinInstrmDtls = new ArrayList<SecurityIdentification7>();
        }
        return this.undrlygFinInstrmDtls;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public SingleQuote1 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public FinancialInstrumentStipulations getStiptns() {
        return stiptns;
    }

    /**
     * Sets the value of the stiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public SingleQuote1 setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributes1> getUndrlygFinInstrmAttrbts() {
        if (undrlygFinInstrmAttrbts == null) {
            undrlygFinInstrmAttrbts = new ArrayList<FinancialInstrumentAttributes1>();
        }
        return this.undrlygFinInstrmAttrbts;
    }

    /**
     * Gets the value of the undrlygStiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygStiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentStipulations }
     * 
     * 
     */
    public List<FinancialInstrumentStipulations> getUndrlygStiptns() {
        if (undrlygStiptns == null) {
            undrlygStiptns = new ArrayList<FinancialInstrumentStipulations>();
        }
        return this.undrlygStiptns;
    }

    /**
     * Gets the value of the instrmLegGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrmLegGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg2 }
     * 
     * 
     */
    public List<InstrumentLeg2> getInstrmLegGrpDtls() {
        if (instrmLegGrpDtls == null) {
            instrmLegGrpDtls = new ArrayList<InstrumentLeg2>();
        }
        return this.instrmLegGrpDtls;
    }

    /**
     * Gets the value of the midYld property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getMidYld() {
        return midYld;
    }

    /**
     * Sets the value of the midYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public SingleQuote1 setMidYld(YieldCalculation1 value) {
        this.midYld = value;
        return this;
    }

    /**
     * Gets the value of the bidYld property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getBidYld() {
        return bidYld;
    }

    /**
     * Sets the value of the bidYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public SingleQuote1 setBidYld(YieldCalculation1 value) {
        this.bidYld = value;
        return this;
    }

    /**
     * Gets the value of the offerYld property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getOfferYld() {
        return offerYld;
    }

    /**
     * Sets the value of the offerYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public SingleQuote1 setOfferYld(YieldCalculation1 value) {
        this.offerYld = value;
        return this;
    }

    /**
     * Gets the value of the tradgSsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getTradgSsnDtls() {
        return tradgSsnDtls;
    }

    /**
     * Sets the value of the tradgSsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public SingleQuote1 setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rltdPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     */
    public List<Intermediary14> getRltdPties() {
        if (rltdPties == null) {
            rltdPties = new ArrayList<Intermediary14>();
        }
        return this.rltdPties;
    }

    /**
     * Gets the value of the twoLegTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public SecuritiesFinancing1 getTwoLegTxDtls() {
        return twoLegTxDtls;
    }

    /**
     * Sets the value of the twoLegTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing1 }
     *     
     */
    public SingleQuote1 setTwoLegTxDtls(SecuritiesFinancing1 value) {
        this.twoLegTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order1 }
     *     
     */
    public Order1 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order1 }
     *     
     */
    public SingleQuote1 setOrdrDtls(Order1 value) {
        this.ordrDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SecuritiesSettlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlement1 }
     *     
     */
    public SingleQuote1 setSttlmDtls(SecuritiesSettlement1 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public SingleQuote1 setCshPties(CashParties1 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public SingleQuote1 setRcvgSttlmPties(SettlementParties3 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public SingleQuote1 setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public SingleQuote1 setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
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
     * Adds a new item to the qlfr list.
     * @see #getQlfr()
     * 
     */
    public SingleQuote1 addQlfr(Qualifier1Code qlfr) {
        getQlfr().add(qlfr);
        return this;
    }

    /**
     * Adds a new item to the bidSd list.
     * @see #getBidSd()
     * 
     */
    public SingleQuote1 addBidSd(QuoteSide1 bidSd) {
        getBidSd().add(bidSd);
        return this;
    }

    /**
     * Adds a new item to the midSd list.
     * @see #getMidSd()
     * 
     */
    public SingleQuote1 addMidSd(QuoteSide1 midSd) {
        getMidSd().add(midSd);
        return this;
    }

    /**
     * Adds a new item to the offerSd list.
     * @see #getOfferSd()
     * 
     */
    public SingleQuote1 addOfferSd(QuoteSide1 offerSd) {
        getOfferSd().add(offerSd);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmDtls list.
     * @see #getUndrlygFinInstrmDtls()
     * 
     */
    public SingleQuote1 addUndrlygFinInstrmDtls(SecurityIdentification7 undrlygFinInstrmDtls) {
        getUndrlygFinInstrmDtls().add(undrlygFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public SingleQuote1 addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public SingleQuote1 addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the instrmLegGrpDtls list.
     * @see #getInstrmLegGrpDtls()
     * 
     */
    public SingleQuote1 addInstrmLegGrpDtls(InstrumentLeg2 instrmLegGrpDtls) {
        getInstrmLegGrpDtls().add(instrmLegGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the rltdPties list.
     * @see #getRltdPties()
     * 
     */
    public SingleQuote1 addRltdPties(Intermediary14 rltdPties) {
        getRltdPties().add(rltdPties);
        return this;
    }

}
