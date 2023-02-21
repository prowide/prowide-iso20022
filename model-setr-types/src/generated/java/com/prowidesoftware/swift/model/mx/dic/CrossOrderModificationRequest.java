
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An executing party, eg, a broker, sends the CrossOrderModificationRequest message to a point of execution such as an exchange, to request the modification of the previously sent CrossOrder.
 * Usage
 * This message must contain the reference of the message to be modified and it must contain all the details of the message to be modified.
 * This modification message is a request to modify. There is no automatic acceptance of the modification instruction. The rejection or acceptance of a modification message instruction is made using an OrderStatus message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossOrderModificationRequest", propOrder = {
    "id",
    "refs",
    "ordrDtls",
    "ordrQtyDtls",
    "ordrParamsDtls",
    "finInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrmDtls",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "legGrpDtls",
    "yldDtls",
    "sprdAndBchmkCrvDtls",
    "tradgSsnDtls",
    "exctnInstrsDtls",
    "dscrtnInstrsDtls",
    "dispInstrDtls",
    "trggrgInstrsDtls",
    "tradgPties",
    "cshPties",
    "othrBizPties",
    "rcvgSttlmPties",
    "dlvrgSttlmPties"
})
public class CrossOrderModificationRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference14 refs;
    @XmlElement(name = "OrdrDtls", required = true)
    protected CrossOrder1 ordrDtls;
    @XmlElement(name = "OrdrQtyDtls", required = true)
    protected OrderQuantity3 ordrQtyDtls;
    @XmlElement(name = "OrdrParamsDtls")
    protected OrderParameters1 ordrParamsDtls;
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
    @XmlElement(name = "LegGrpDtls")
    protected List<InstrumentLeg2> legGrpDtls;
    @XmlElement(name = "YldDtls")
    protected YieldCalculation1 yldDtls;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "TradgSsnDtls")
    protected TradingSession1 tradgSsnDtls;
    @XmlElement(name = "ExctnInstrsDtls")
    protected SecuritiesExecutionInstructions1 exctnInstrsDtls;
    @XmlElement(name = "DscrtnInstrsDtls")
    protected DiscretionInstructions1 dscrtnInstrsDtls;
    @XmlElement(name = "DispInstrDtls")
    protected DisplayInstruction1 dispInstrDtls;
    @XmlElement(name = "TrggrgInstrsDtls")
    protected TriggeringInstructions trggrgInstrsDtls;
    @XmlElement(name = "TradgPties")
    protected List<Intermediary14> tradgPties;
    @XmlElement(name = "CshPties")
    protected List<CashParties1> cshPties;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties1 othrBizPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties3 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties3 dlvrgSttlmPties;

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
    public CrossOrderModificationRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference14 }
     *     
     */
    public Reference14 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference14 }
     *     
     */
    public CrossOrderModificationRequest setRefs(Reference14 value) {
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
    public CrossOrderModificationRequest setOrdrDtls(CrossOrder1 value) {
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
    public CrossOrderModificationRequest setOrdrQtyDtls(OrderQuantity3 value) {
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
    public CrossOrderModificationRequest setOrdrParamsDtls(OrderParameters1 value) {
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
    public CrossOrderModificationRequest setFinInstrmDtls(SecurityIdentification7 value) {
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
    public CrossOrderModificationRequest setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
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
    public CrossOrderModificationRequest setStiptns(FinancialInstrumentStipulations value) {
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
    public CrossOrderModificationRequest setYldDtls(YieldCalculation1 value) {
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
    public CrossOrderModificationRequest setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
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
    public CrossOrderModificationRequest setTradgSsnDtls(TradingSession1 value) {
        this.tradgSsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the exctnInstrsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesExecutionInstructions1 }
     *     
     */
    public SecuritiesExecutionInstructions1 getExctnInstrsDtls() {
        return exctnInstrsDtls;
    }

    /**
     * Sets the value of the exctnInstrsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesExecutionInstructions1 }
     *     
     */
    public CrossOrderModificationRequest setExctnInstrsDtls(SecuritiesExecutionInstructions1 value) {
        this.exctnInstrsDtls = value;
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
    public CrossOrderModificationRequest setDscrtnInstrsDtls(DiscretionInstructions1 value) {
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
    public CrossOrderModificationRequest setDispInstrDtls(DisplayInstruction1 value) {
        this.dispInstrDtls = value;
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
    public CrossOrderModificationRequest setTrggrgInstrsDtls(TriggeringInstructions value) {
        this.trggrgInstrsDtls = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashParties1 }
     * 
     * 
     */
    public List<CashParties1> getCshPties() {
        if (cshPties == null) {
            cshPties = new ArrayList<CashParties1>();
        }
        return this.cshPties;
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
    public CrossOrderModificationRequest setOthrBizPties(OtherParties1 value) {
        this.othrBizPties = value;
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
    public CrossOrderModificationRequest setRcvgSttlmPties(SettlementParties3 value) {
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
    public CrossOrderModificationRequest setDlvrgSttlmPties(SettlementParties3 value) {
        this.dlvrgSttlmPties = value;
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
     * Adds a new item to the undrlygFinInstrmDtls list.
     * @see #getUndrlygFinInstrmDtls()
     * 
     */
    public CrossOrderModificationRequest addUndrlygFinInstrmDtls(SecurityIdentification7 undrlygFinInstrmDtls) {
        getUndrlygFinInstrmDtls().add(undrlygFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public CrossOrderModificationRequest addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public CrossOrderModificationRequest addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the legGrpDtls list.
     * @see #getLegGrpDtls()
     * 
     */
    public CrossOrderModificationRequest addLegGrpDtls(InstrumentLeg2 legGrpDtls) {
        getLegGrpDtls().add(legGrpDtls);
        return this;
    }

    /**
     * Adds a new item to the tradgPties list.
     * @see #getTradgPties()
     * 
     */
    public CrossOrderModificationRequest addTradgPties(Intermediary14 tradgPties) {
        getTradgPties().add(tradgPties);
        return this;
    }

    /**
     * Adds a new item to the cshPties list.
     * @see #getCshPties()
     * 
     */
    public CrossOrderModificationRequest addCshPties(CashParties1 cshPties) {
        getCshPties().add(cshPties);
        return this;
    }

}
