
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
 * SCOPE
 * Sent by an executing party to an instructing party directly or through Central Matching Utility (CMU) to provide trade confirmation on a per-account basis based on instructions provided by the instructing party in the SecuritiesAllocationInstruction message.
 * 
 * It may also be used to provide trade confirmation on the trade level from an executing party or an instructing party to the custodian or an affirming party directly or through CMU.
 * 
 * The instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.
 * The executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.
 * The custodian or the affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.
 * 
 * USAGE
 * Initiator:  In local matching, the initiator of this message is always the executing party.  In central matching the initiator may be either the executing party or instructing party.
 * Respondent: instructing party, a custodian or an affirming party responds with SecuritiesTradeConfirmationResponse (accept or reject) message. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeConfirmationV02", propOrder = {
    "id",
    "nbCnt",
    "refs",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "undrlygFinInstrm",
    "stiptns",
    "confPties",
    "sttlmParams",
    "stgSttlmInstr",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "clrDtls",
    "sttlmAmt",
    "othrAmts",
    "othrPrics",
    "othrBizPties",
    "twoLegTxDtls",
    "rgltryStiptns",
    "splmtryData"
})
public class SecuritiesTradeConfirmationV02 {

    @XmlElement(name = "Id", required = true)
    protected TransactiontIdentification4 id;
    @XmlElement(name = "NbCnt")
    protected NumberCount1Choice nbCnt;
    @XmlElement(name = "Refs")
    protected List<Linkages15> refs;
    @XmlElement(name = "TradDtls", required = true)
    protected Order14 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes44 finInstrmAttrbts;
    @XmlElement(name = "UndrlygFinInstrm")
    protected List<UnderlyingFinancialInstrument2> undrlygFinInstrm;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations2 stiptns;
    @XmlElement(name = "ConfPties", required = true)
    protected List<ConfirmationParties2> confPties;
    @XmlElement(name = "SttlmParams")
    protected SettlementDetails43 sttlmParams;
    @XmlElement(name = "StgSttlmInstr")
    protected StandingSettlementInstruction9 stgSttlmInstr;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties23 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties23 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties18 cshPties;
    @XmlElement(name = "ClrDtls")
    protected Clearing3 clrDtls;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection28 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected List<OtherAmounts16> othrAmts;
    @XmlElement(name = "OthrPrics")
    protected List<OtherPrices1> othrPrics;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties18 othrBizPties;
    @XmlElement(name = "TwoLegTxDtls")
    protected TwoLegTransactionDetails1 twoLegTxDtls;
    @XmlElement(name = "RgltryStiptns")
    protected RegulatoryStipulations1 rgltryStiptns;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public TransactiontIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactiontIdentification4 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setId(TransactiontIdentification4 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nbCnt property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount1Choice }
     *     
     */
    public NumberCount1Choice getNbCnt() {
        return nbCnt;
    }

    /**
     * Sets the value of the nbCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount1Choice }
     *     
     */
    public SecuritiesTradeConfirmationV02 setNbCnt(NumberCount1Choice value) {
        this.nbCnt = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages15 }
     * 
     * 
     */
    public List<Linkages15> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Linkages15>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the tradDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order14 }
     *     
     */
    public Order14 getTradDtls() {
        return tradDtls;
    }

    /**
     * Sets the value of the tradDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order14 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setTradDtls(Order14 value) {
        this.tradDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes44 }
     *     
     */
    public FinancialInstrumentAttributes44 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes44 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setFinInstrmAttrbts(FinancialInstrumentAttributes44 value) {
        this.finInstrmAttrbts = value;
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
     * {@link UnderlyingFinancialInstrument2 }
     * 
     * 
     */
    public List<UnderlyingFinancialInstrument2> getUndrlygFinInstrm() {
        if (undrlygFinInstrm == null) {
            undrlygFinInstrm = new ArrayList<UnderlyingFinancialInstrument2>();
        }
        return this.undrlygFinInstrm;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations2 }
     *     
     */
    public FinancialInstrumentStipulations2 getStiptns() {
        return stiptns;
    }

    /**
     * Sets the value of the stiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations2 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setStiptns(FinancialInstrumentStipulations2 value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the confPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationParties2 }
     * 
     * 
     */
    public List<ConfirmationParties2> getConfPties() {
        if (confPties == null) {
            confPties = new ArrayList<ConfirmationParties2>();
        }
        return this.confPties;
    }

    /**
     * Gets the value of the sttlmParams property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails43 }
     *     
     */
    public SettlementDetails43 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Sets the value of the sttlmParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails43 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setSttlmParams(SettlementDetails43 value) {
        this.sttlmParams = value;
        return this;
    }

    /**
     * Gets the value of the stgSttlmInstr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction9 }
     *     
     */
    public StandingSettlementInstruction9 getStgSttlmInstr() {
        return stgSttlmInstr;
    }

    /**
     * Sets the value of the stgSttlmInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction9 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setStgSttlmInstr(StandingSettlementInstruction9 value) {
        this.stgSttlmInstr = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties23 }
     *     
     */
    public SettlementParties23 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties23 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setDlvrgSttlmPties(SettlementParties23 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties23 }
     *     
     */
    public SettlementParties23 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties23 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setRcvgSttlmPties(SettlementParties23 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties18 }
     *     
     */
    public CashParties18 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties18 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setCshPties(CashParties18 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the clrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Clearing3 }
     *     
     */
    public Clearing3 getClrDtls() {
        return clrDtls;
    }

    /**
     * Sets the value of the clrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing3 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setClrDtls(Clearing3 value) {
        this.clrDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection28 }
     *     
     */
    public AmountAndDirection28 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection28 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setSttlmAmt(AmountAndDirection28 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts16 }
     * 
     * 
     */
    public List<OtherAmounts16> getOthrAmts() {
        if (othrAmts == null) {
            othrAmts = new ArrayList<OtherAmounts16>();
        }
        return this.othrAmts;
    }

    /**
     * Gets the value of the othrPrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherPrices1 }
     * 
     * 
     */
    public List<OtherPrices1> getOthrPrics() {
        if (othrPrics == null) {
            othrPrics = new ArrayList<OtherPrices1>();
        }
        return this.othrPrics;
    }

    /**
     * Gets the value of the othrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties18 }
     *     
     */
    public OtherParties18 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Sets the value of the othrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties18 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setOthrBizPties(OtherParties18 value) {
        this.othrBizPties = value;
        return this;
    }

    /**
     * Gets the value of the twoLegTxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TwoLegTransactionDetails1 }
     *     
     */
    public TwoLegTransactionDetails1 getTwoLegTxDtls() {
        return twoLegTxDtls;
    }

    /**
     * Sets the value of the twoLegTxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoLegTransactionDetails1 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setTwoLegTxDtls(TwoLegTransactionDetails1 value) {
        this.twoLegTxDtls = value;
        return this;
    }

    /**
     * Gets the value of the rgltryStiptns property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryStipulations1 }
     *     
     */
    public RegulatoryStipulations1 getRgltryStiptns() {
        return rgltryStiptns;
    }

    /**
     * Sets the value of the rgltryStiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryStipulations1 }
     *     
     */
    public SecuritiesTradeConfirmationV02 setRgltryStiptns(RegulatoryStipulations1 value) {
        this.rgltryStiptns = value;
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
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public SecuritiesTradeConfirmationV02 addRefs(Linkages15 refs) {
        getRefs().add(refs);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrm list.
     * @see #getUndrlygFinInstrm()
     * 
     */
    public SecuritiesTradeConfirmationV02 addUndrlygFinInstrm(UnderlyingFinancialInstrument2 undrlygFinInstrm) {
        getUndrlygFinInstrm().add(undrlygFinInstrm);
        return this;
    }

    /**
     * Adds a new item to the confPties list.
     * @see #getConfPties()
     * 
     */
    public SecuritiesTradeConfirmationV02 addConfPties(ConfirmationParties2 confPties) {
        getConfPties().add(confPties);
        return this;
    }

    /**
     * Adds a new item to the othrAmts list.
     * @see #getOthrAmts()
     * 
     */
    public SecuritiesTradeConfirmationV02 addOthrAmts(OtherAmounts16 othrAmts) {
        getOthrAmts().add(othrAmts);
        return this;
    }

    /**
     * Adds a new item to the othrPrics list.
     * @see #getOthrPrics()
     * 
     */
    public SecuritiesTradeConfirmationV02 addOthrPrics(OtherPrices1 othrPrics) {
        getOthrPrics().add(othrPrics);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTradeConfirmationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
