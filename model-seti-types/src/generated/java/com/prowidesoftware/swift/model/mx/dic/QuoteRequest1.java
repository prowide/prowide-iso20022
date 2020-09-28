
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
 * Request for a proposition of price for a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequest1", propOrder = {
    "qtReqTp",
    "xpryDtTm",
    "prvsClsgPric",
    "sd",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrmDtls",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "instrmLegGrpDtls",
    "qtDtls",
    "yldDtls",
    "sprdAndBchmkCrvDtls",
    "tradgSsnDtls",
    "twoLegTxDtls",
    "tradgPties",
    "cshPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "othrBizPties"
})
public class QuoteRequest1 {

    @XmlElement(name = "QtReqTp")
    @XmlSchemaType(name = "string")
    protected QuoteRequestType1Code qtReqTp;
    @XmlElement(name = "XpryDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtTm;
    @XmlElement(name = "PrvsClsgPric")
    protected List<Price1> prvsClsgPric;
    @XmlElement(name = "Sd")
    @XmlSchemaType(name = "string")
    protected Side1Code sd;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations stiptns;
    @XmlElement(name = "UndrlygFinInstrmDtls")
    protected List<SecurityIdentification7> undrlygFinInstrmDtls;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "InstrmLegGrpDtls")
    protected List<InstrumentLeg2> instrmLegGrpDtls;
    @XmlElement(name = "QtDtls", required = true)
    protected List<Quote3> qtDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "TwoLegTxDtls")
    protected SecuritiesFinancing1 twoLegTxDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;

    /**
     * Gets the value of the qtReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteRequestType1Code }
     *     
     */
    public QuoteRequestType1Code getQtReqTp() {
        return qtReqTp;
    }

    /**
     * Sets the value of the qtReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteRequestType1Code }
     *     
     */
    public QuoteRequest1 setQtReqTp(QuoteRequestType1Code value) {
        this.qtReqTp = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public QuoteRequest1 setXpryDtTm(XMLGregorianCalendar value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsClsgPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsClsgPric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsClsgPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price1 }
     * 
     * 
     */
    public List<Price1> getPrvsClsgPric() {
        if (prvsClsgPric == null) {
            prvsClsgPric = new ArrayList<Price1>();
        }
        return this.prvsClsgPric;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Side1Code }
     *     
     */
    public Side1Code getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Side1Code }
     *     
     */
    public QuoteRequest1 setSd(Side1Code value) {
        this.sd = value;
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
    public QuoteRequest1 setFinInstrmDtls(SecurityIdentification7 value) {
        this.finInstrmDtls = value;
        return this;
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
    public QuoteRequest1 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
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
    public QuoteRequest1 setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
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
     * Gets the value of the qtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quote3 }
     * 
     * 
     */
    public List<Quote3> getQtDtls() {
        if (qtDtls == null) {
            qtDtls = new ArrayList<Quote3>();
        }
        return this.qtDtls;
    }

    /**
     * Gets the value of the yldDtls property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getYldDtls() {
        return yldDtls;
    }

    /**
     * Sets the value of the yldDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public QuoteRequest1 setYldDtls(YieldCalculation1 value) {
        this.yldDtls = value;
        return this;
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
    public QuoteRequest1 setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
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
    public QuoteRequest1 setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
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
    public QuoteRequest1 setTwoLegTxDtls(SecuritiesFinancing1 value) {
        this.twoLegTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary14 }
     * 
     * 
     */
    public List<Intermediary14> getTradgPties() {
        if (tradgPties == null) {
            tradgPties = new ArrayList<Intermediary14>();
        }
        return this.tradgPties;
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
    public QuoteRequest1 setCshPties(CashParties1 value) {
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
    public QuoteRequest1 setRcvgSttlmPties(SettlementParties3 value) {
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
    public QuoteRequest1 setDlvrgSttlmPties(SettlementParties3 value) {
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
    public QuoteRequest1 setOthrBizPties(OtherParties1 value) {
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
     * Adds a new item to the prvsClsgPric list.
     * @see #getPrvsClsgPric()
     * 
     */
    public QuoteRequest1 addPrvsClsgPric(Price1 prvsClsgPric) {
        getPrvsClsgPric().add(prvsClsgPric);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmDtls list.
     * @see #getUndrlygFinInstrmDtls()
     * 
     */
    public QuoteRequest1 addUndrlygFinInstrmDtls(SecurityIdentification7 undrlygFinInstrmDtls) {
        getUndrlygFinInstrmDtls().add(undrlygFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public QuoteRequest1 addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public QuoteRequest1 addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the instrmLegGrpDtls list.
     * @see #getInstrmLegGrpDtls()
     * 
     */
    public QuoteRequest1 addInstrmLegGrpDtls(InstrumentLeg2 instrmLegGrpDtls) {
        getInstrmLegGrpDtls().add(instrmLegGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the qtDtls list.
     * @see #getQtDtls()
     * 
     */
    public QuoteRequest1 addQtDtls(Quote3 qtDtls) {
        getQtDtls().add(qtDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public QuoteRequest1 addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

}
