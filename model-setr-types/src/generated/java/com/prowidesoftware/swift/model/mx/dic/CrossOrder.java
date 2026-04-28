
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
 * Scope
 * The executing party, eg, a broker, wishing to take the other side of an order and cross with the instructing party, eg, an investment manager, sends a CrossOrder message to a point of execution such as an exchange.
 * Usage
 * The CrossOrder contains two order sides, ie, an order to buy and an order to sell. For many markets the Order message does not provide enough information about the counterparties of a trade to meet regulatory and post-trade requirements. When additional information regarding the counterparty to cross the trade is required, the CrossOrder message is to be used.
 * Four types of cross trades have been identified:
 * - Cross order that is executed completely or not at all. Both sides are treated in the same manner. This is equivalent to a Fill or Kill, where the cross order meets the crossing criteria within the market and is executed or rejected.
 * - Cross order that is executed partially and the rest is cancelled. One side is fully executed, the other side is partially executed with the remainder being cancelled. This is equivalent to an Immediate or Cancel on the other side. The Prioritisation Indicator is used to indicate which side should fully execute in this scenario.
 * - Cross order that is partially executed with the unfilled portions remaining active. One side of the cross order is fully executed as indicated in the Prioritisation Indicator, but the unfilled portion remains active.
 * - Cross order that is executed with existing orders with the same price. In the case other orders exist with the same price, the quantity of the cross order is executed against the existing orders and quotes, the remainder of the cross is executed against the other side of the cross. The two sides potentially have different quantities. The Prioritisation Indicator is used to indicate which side of the cross order will be executed against the existing market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossOrder", propOrder = {
    "id",
    "refs",
    "ordrDtls",
    "ordrQtyDtls",
    "ordrParamsDtls",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrm",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "legGrpDtls",
    "sprdAndBchmkCrvDtls",
    "yldDtls",
    "exctnInstrsDtls",
    "strtgyParamsDtls",
    "tradgSsnDtls",
    "trggrgInstrsDtls",
    "dscrtnInstrsDtls",
    "dispInstrDtls",
    "tradgPties",
    "cshPties",
    "rcvgPties",
    "dlvrgPties",
    "othrBizPties",
    "amtsDtls"
})
public class CrossOrder {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference11 refs;
    @XmlElement(name = "OrdrDtls", required = true)
    protected CrossOrder1 ordrDtls;
    @XmlElement(name = "OrdrQtyDtls")
    protected OrderQuantity3 ordrQtyDtls;
    @XmlElement(name = "OrdrParamsDtls")
    protected OrderParameters1 ordrParamsDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations stiptns;
    @XmlElement(name = "UndrlygFinInstrm")
    protected List<SecurityIdentification7> undrlygFinInstrm;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "LegGrpDtls")
    protected List<InstrumentLeg2> legGrpDtls;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;
    @XmlElement(name = "ExctnInstrsDtls")
    protected List<SecuritiesExecutionInstructions1> exctnInstrsDtls;
    @XmlElement(name = "StrtgyParamsDtls")
    protected List<StrategyParameters1> strtgyParamsDtls;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "TrggrgInstrsDtls", required = true)
    protected TriggeringInstructions trggrgInstrsDtls;
    @XmlElement(name = "DscrtnInstrsDtls")
    protected DiscretionInstructions1 dscrtnInstrsDtls;
    @XmlElement(name = "DispInstrDtls", required = true)
    protected DisplayInstruction1 dispInstrDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties")
    protected CashParties1 cshPties;
    @XmlElement(name = "RcvgPties")
    protected SettlementParties3 rcvgPties;
    @XmlElement(name = "DlvrgPties")
    protected SettlementParties3 dlvrgPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "AmtsDtls")
    protected List<OtherAmounts1> amtsDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public CrossOrder setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference11 }
     *     
     */
    public Reference11 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference11 }
     *     
     */
    public CrossOrder setRefs(Reference11 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CrossOrder1 }
     *     
     */
    public CrossOrder1 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossOrder1 }
     *     
     */
    public CrossOrder setOrdrDtls(CrossOrder1 value) {
        this.ordrDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrQtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity3 }
     *     
     */
    public OrderQuantity3 getOrdrQtyDtls() {
        return ordrQtyDtls;
    }

    /**
     * Sets the value of the ordrQtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity3 }
     *     
     */
    public CrossOrder setOrdrQtyDtls(OrderQuantity3 value) {
        this.ordrQtyDtls = value;
        return this;
    }

    /**
     * Gets the value of the ordrParamsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderParameters1 }
     *     
     */
    public OrderParameters1 getOrdrParamsDtls() {
        return ordrParamsDtls;
    }

    /**
     * Sets the value of the ordrParamsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderParameters1 }
     *     
     */
    public CrossOrder setOrdrParamsDtls(OrderParameters1 value) {
        this.ordrParamsDtls = value;
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
    public CrossOrder setFinInstrmDtls(SecurityIdentification7 value) {
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
    public CrossOrder setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
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
    public CrossOrder setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<SecurityIdentification7>();
        }
        return this.undrlygFinInstrm;
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
     * Gets the value of the legGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg2 }
     * 
     * 
     */
    public List<InstrumentLeg2> getLegGrpDtls() {
        if (legGrpDtls == null) {
            legGrpDtls = new ArrayList<InstrumentLeg2>();
        }
        return this.legGrpDtls;
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
    public CrossOrder setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
        return this;
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
    public CrossOrder setYldDtls(YieldCalculation1 value) {
        this.yldDtls = value;
        return this;
    }

    /**
     * Gets the value of the exctnInstrsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exctnInstrsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExctnInstrsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesExecutionInstructions1 }
     * 
     * 
     */
    public List<SecuritiesExecutionInstructions1> getExctnInstrsDtls() {
        if (exctnInstrsDtls == null) {
            exctnInstrsDtls = new ArrayList<SecuritiesExecutionInstructions1>();
        }
        return this.exctnInstrsDtls;
    }

    /**
     * Gets the value of the strtgyParamsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strtgyParamsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrtgyParamsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyParameters1 }
     * 
     * 
     */
    public List<StrategyParameters1> getStrtgyParamsDtls() {
        if (strtgyParamsDtls == null) {
            strtgyParamsDtls = new ArrayList<StrategyParameters1>();
        }
        return this.strtgyParamsDtls;
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
    public CrossOrder setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the trggrgInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeringInstructions }
     *     
     */
    public TriggeringInstructions getTrggrgInstrsDtls() {
        return trggrgInstrsDtls;
    }

    /**
     * Sets the value of the trggrgInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeringInstructions }
     *     
     */
    public CrossOrder setTrggrgInstrsDtls(TriggeringInstructions value) {
        this.trggrgInstrsDtls = value;
        return this;
    }

    /**
     * Gets the value of the dscrtnInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public DiscretionInstructions1 getDscrtnInstrsDtls() {
        return dscrtnInstrsDtls;
    }

    /**
     * Sets the value of the dscrtnInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscretionInstructions1 }
     *     
     */
    public CrossOrder setDscrtnInstrsDtls(DiscretionInstructions1 value) {
        this.dscrtnInstrsDtls = value;
        return this;
    }

    /**
     * Gets the value of the dispInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayInstruction1 }
     *     
     */
    public DisplayInstruction1 getDispInstrDtls() {
        return dispInstrDtls;
    }

    /**
     * Sets the value of the dispInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayInstruction1 }
     *     
     */
    public CrossOrder setDispInstrDtls(DisplayInstruction1 value) {
        this.dispInstrDtls = value;
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
    public CrossOrder setCshPties(CashParties1 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getRcvgPties() {
        return rcvgPties;
    }

    /**
     * Sets the value of the rcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public CrossOrder setRcvgPties(SettlementParties3 value) {
        this.rcvgPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getDlvrgPties() {
        return dlvrgPties;
    }

    /**
     * Sets the value of the dlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public CrossOrder setDlvrgPties(SettlementParties3 value) {
        this.dlvrgPties = value;
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
    public CrossOrder setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the amtsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amtsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts1 }
     * 
     * 
     */
    public List<OtherAmounts1> getAmtsDtls() {
        if (amtsDtls == null) {
            amtsDtls = new ArrayList<OtherAmounts1>();
        }
        return this.amtsDtls;
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
     * Adds a new item to the undrlygFinInstrm list.
     * @see #getUndrlygFinInstrm()
     * 
     */
    public CrossOrder addUndrlygFinInstrm(SecurityIdentification7 undrlygFinInstrm) {
        getUndrlygFinInstrm().add(undrlygFinInstrm);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public CrossOrder addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public CrossOrder addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the legGrpDtls list.
     * @see #getLegGrpDtls()
     * 
     */
    public CrossOrder addLegGrpDtls(InstrumentLeg2 legGrpDtls) {
        getLegGrpDtls().add(legGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the exctnInstrsDtls list.
     * @see #getExctnInstrsDtls()
     * 
     */
    public CrossOrder addExctnInstrsDtls(SecuritiesExecutionInstructions1 exctnInstrsDtls) {
        getExctnInstrsDtls().add(exctnInstrsDtls);
        return this;
    }

    /**
     * Adds a new item to the strtgyParamsDtls list.
     * @see #getStrtgyParamsDtls()
     * 
     */
    public CrossOrder addStrtgyParamsDtls(StrategyParameters1 strtgyParamsDtls) {
        getStrtgyParamsDtls().add(strtgyParamsDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public CrossOrder addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the amtsDtls list.
     * @see #getAmtsDtls()
     * 
     */
    public CrossOrder addAmtsDtls(OtherAmounts1 amtsDtls) {
        getAmtsDtls().add(amtsDtls);
        return this;
    }

}
