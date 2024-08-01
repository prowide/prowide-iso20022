
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
 * Compares information related to both sides of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionMatchingCriteria7", propOrder = {
    "rptTrckgNb",
    "unqTxIdr",
    "prrUnqTxIdr",
    "sbsqntPosUnqTxIdr",
    "dlta",
    "tradConf",
    "tradClrOblgtn",
    "tradClrSts",
    "mstrAgrmtTp",
    "mstrAgrmtVrsn",
    "intraGrp",
    "pstTradRskRdctn",
    "derivEvt",
    "pltfmIdr",
    "exctnTmStmp",
    "fctvDt",
    "xprtnDt",
    "earlyTermntnDt",
    "sttlmDt",
    "dlvryTp",
    "txPric",
    "pricSchdlUadjstdFctvDt",
    "pricSchdlUadjstdEndDt",
    "txSchdlPric",
    "packgPric",
    "ntnlAmtFrstLeg",
    "ntnlAmtFrstLegUadjstdFctvDt",
    "ntnlAmtFrstLegUadjstdEndDt",
    "ntnlAmtFrstLegSchdlAmt",
    "ntnlQtyFrstLeg",
    "ntnlQtyFrstLegUadjstdFctvDt",
    "ntnlQtyFrstLegUadjstdEndDt",
    "ntnlQtyFrstLegSchdlQty",
    "ntnlAmtScndLeg",
    "ntnlAmtScndLegUadjstdFctvDt",
    "ntnlAmtScndLegUadjstdEndDt",
    "ntnlAmtScndLegSchdlAmt",
    "ntnlQtyScndLeg",
    "ntnlQtyScndLegUadjstdFctvDt",
    "ntnlQtyScndLegUadjstdEndDt",
    "ntnlQtyScndLegSchdlQty",
    "othrPmt",
    "intrstFxdRateFrstLeg",
    "intrstFxdRateFrstLegDayCnt",
    "intrstFxdRateFrstLegPmtFrqcyUnit",
    "intrstFxdRateFrstLegPmtFrqcyVal",
    "intrstFltgRateFrstLegId",
    "intrstFltgRateFrstLegCd",
    "intrstFltgRateFrstLegNm",
    "intrstFltgRateFrstLegDayCnt",
    "intrstFltgRateFrstLegPmtFrqcyUnit",
    "intrstFltgRateFrstLegPmtFrqcyVal",
    "intrstFltgRateFrstLegRefPrdUnit",
    "intrstFltgRateFrstLegRefPrdVal",
    "intrstFltgRateFrstLegRstFrqcyUnit",
    "intrstFltgRateFrstLegRstFrqcyVal",
    "intrstFltgRateFrstLegSprd",
    "intrstRateFxdScndLeg",
    "intrstFxdRateScndLegDayCnt",
    "intrstFxdRateScndLegPmtFrqcyUnit",
    "intrstFxdRateScndLegPmtFrqcyVal",
    "intrstFltgRateScndLegId",
    "intrstFltgRateScndLegCd",
    "intrstFltgRateScndLegNm",
    "intrstFltgRateScndLegDayCnt",
    "intrstFltgRateScndLegPmtFrqcyUnit",
    "intrstFltgRateScndLegPmtFrqcyVal",
    "intrstFltgRateScndLegRefPrdUnit",
    "intrstFltgRateScndLegRefPrdVal",
    "intrstFltgRateScndLegRstFrqcyUnit",
    "intrstFltgRateScndLegRstFrqcyVal",
    "intrstFltgRateScndLegSprd",
    "packgSprd",
    "ccyXchgRate",
    "ccyFwdXchgRate",
    "ccyXchgRateBsis",
    "cmmdty",
    "nrgyDlvryPtOrZone",
    "nrgyIntrCnnctnPt",
    "nrgyLdTp",
    "dlvryAttr",
    "optnTp",
    "optnExrcStyle",
    "optnStrkPric",
    "optnStrkPricSchdlUadjstdFctvDt",
    "optnStrkPricSchdlUadjstdEndDt",
    "optnStrkPricSchdlAmt",
    "optnPrmAmt",
    "optnPrmPmtDt",
    "optnMtrtyDtOfUndrlyg",
    "cdtSnrty",
    "cdtRefPty",
    "cdtSrs",
    "cdtVrsn",
    "cdtIndxFctr",
    "cdtTrch",
    "lvl"
})
public class TransactionMatchingCriteria7 {

    @XmlElement(name = "RptTrckgNb")
    protected CompareText2 rptTrckgNb;
    @XmlElement(name = "UnqTxIdr")
    protected CompareUniqueTransactionIdentifier2 unqTxIdr;
    @XmlElement(name = "PrrUnqTxIdr")
    protected CompareUniqueTransactionIdentifier2 prrUnqTxIdr;
    @XmlElement(name = "SbsqntPosUnqTxIdr")
    protected CompareUniqueTransactionIdentifier2 sbsqntPosUnqTxIdr;
    @XmlElement(name = "Dlta")
    protected CompareLongFraction19DecimalNumber1 dlta;
    @XmlElement(name = "TradConf")
    protected CompareTradeConfirmation2 tradConf;
    @XmlElement(name = "TradClrOblgtn")
    protected CompareTradeClearingObligation1 tradClrOblgtn;
    @XmlElement(name = "TradClrSts")
    protected CompareTradeClearingStatus3 tradClrSts;
    @XmlElement(name = "MstrAgrmtTp")
    protected CompareMasterAgreementType1 mstrAgrmtTp;
    @XmlElement(name = "MstrAgrmtVrsn")
    protected CompareMax50Text1 mstrAgrmtVrsn;
    @XmlElement(name = "IntraGrp")
    protected CompareTrueFalseIndicator3 intraGrp;
    @XmlElement(name = "PstTradRskRdctn")
    protected ComparePostTradeRiskReduction2 pstTradRskRdctn;
    @XmlElement(name = "DerivEvt")
    protected CompareDerivativeEvent1 derivEvt;
    @XmlElement(name = "PltfmIdr")
    protected CompareMICIdentifier3 pltfmIdr;
    @XmlElement(name = "ExctnTmStmp")
    protected CompareDateTime3 exctnTmStmp;
    @XmlElement(name = "FctvDt")
    protected CompareDate3 fctvDt;
    @XmlElement(name = "XprtnDt")
    protected CompareDate3 xprtnDt;
    @XmlElement(name = "EarlyTermntnDt")
    protected CompareDate3 earlyTermntnDt;
    @XmlElement(name = "SttlmDt")
    protected List<CompareDate3> sttlmDt;
    @XmlElement(name = "DlvryTp")
    protected CompareDeliveryType1 dlvryTp;
    @XmlElement(name = "TxPric")
    protected CompareUnitPrice5 txPric;
    @XmlElement(name = "PricSchdlUadjstdFctvDt")
    protected List<CompareDate3> pricSchdlUadjstdFctvDt;
    @XmlElement(name = "PricSchdlUadjstdEndDt")
    protected List<CompareDate3> pricSchdlUadjstdEndDt;
    @XmlElement(name = "TxSchdlPric")
    protected List<CompareUnitPrice5> txSchdlPric;
    @XmlElement(name = "PackgPric")
    protected CompareUnitPrice5 packgPric;
    @XmlElement(name = "NtnlAmtFrstLeg")
    protected CompareAmountAndDirection3 ntnlAmtFrstLeg;
    @XmlElement(name = "NtnlAmtFrstLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlAmtFrstLegUadjstdFctvDt;
    @XmlElement(name = "NtnlAmtFrstLegUadjstdEndDt")
    protected List<CompareDate3> ntnlAmtFrstLegUadjstdEndDt;
    @XmlElement(name = "NtnlAmtFrstLegSchdlAmt")
    protected List<CompareAmountAndDirection3> ntnlAmtFrstLegSchdlAmt;
    @XmlElement(name = "NtnlQtyFrstLeg")
    protected CompareLongFraction19DecimalNumber1 ntnlQtyFrstLeg;
    @XmlElement(name = "NtnlQtyFrstLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlQtyFrstLegUadjstdFctvDt;
    @XmlElement(name = "NtnlQtyFrstLegUadjstdEndDt")
    protected List<CompareDate3> ntnlQtyFrstLegUadjstdEndDt;
    @XmlElement(name = "NtnlQtyFrstLegSchdlQty")
    protected List<CompareLongFraction19DecimalNumber1> ntnlQtyFrstLegSchdlQty;
    @XmlElement(name = "NtnlAmtScndLeg")
    protected CompareAmountAndDirection3 ntnlAmtScndLeg;
    @XmlElement(name = "NtnlAmtScndLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlAmtScndLegUadjstdFctvDt;
    @XmlElement(name = "NtnlAmtScndLegUadjstdEndDt")
    protected List<CompareDate3> ntnlAmtScndLegUadjstdEndDt;
    @XmlElement(name = "NtnlAmtScndLegSchdlAmt")
    protected List<CompareAmountAndDirection3> ntnlAmtScndLegSchdlAmt;
    @XmlElement(name = "NtnlQtyScndLeg")
    protected CompareLongFraction19DecimalNumber1 ntnlQtyScndLeg;
    @XmlElement(name = "NtnlQtyScndLegUadjstdFctvDt")
    protected List<CompareDate3> ntnlQtyScndLegUadjstdFctvDt;
    @XmlElement(name = "NtnlQtyScndLegUadjstdEndDt")
    protected List<CompareDate3> ntnlQtyScndLegUadjstdEndDt;
    @XmlElement(name = "NtnlQtyScndLegSchdlQty")
    protected List<CompareLongFraction19DecimalNumber1> ntnlQtyScndLegSchdlQty;
    @XmlElement(name = "OthrPmt")
    protected List<CompareOtherPayment1> othrPmt;
    @XmlElement(name = "IntrstFxdRateFrstLeg")
    protected CompareUnitPrice7 intrstFxdRateFrstLeg;
    @XmlElement(name = "IntrstFxdRateFrstLegDayCnt")
    protected CompareDayCount1 intrstFxdRateFrstLegDayCnt;
    @XmlElement(name = "IntrstFxdRateFrstLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFxdRateFrstLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFxdRateFrstLegPmtFrqcyVal")
    protected CompareNumber5 intrstFxdRateFrstLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateFrstLegId")
    protected CompareISINIdentifier4 intrstFltgRateFrstLegId;
    @XmlElement(name = "IntrstFltgRateFrstLegCd")
    protected CompareBenchmarkCode1 intrstFltgRateFrstLegCd;
    @XmlElement(name = "IntrstFltgRateFrstLegNm")
    protected CompareMax350Text1 intrstFltgRateFrstLegNm;
    @XmlElement(name = "IntrstFltgRateFrstLegDayCnt")
    protected CompareDayCount1 intrstFltgRateFrstLegDayCnt;
    @XmlElement(name = "IntrstFltgRateFrstLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateFrstLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateFrstLegPmtFrqcyVal")
    protected CompareNumber5 intrstFltgRateFrstLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateFrstLegRefPrdUnit")
    protected CompareFrequencyUnit1 intrstFltgRateFrstLegRefPrdUnit;
    @XmlElement(name = "IntrstFltgRateFrstLegRefPrdVal")
    protected CompareNumber5 intrstFltgRateFrstLegRefPrdVal;
    @XmlElement(name = "IntrstFltgRateFrstLegRstFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateFrstLegRstFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateFrstLegRstFrqcyVal")
    protected CompareNumber5 intrstFltgRateFrstLegRstFrqcyVal;
    @XmlElement(name = "IntrstFltgRateFrstLegSprd")
    protected CompareUnitPrice8 intrstFltgRateFrstLegSprd;
    @XmlElement(name = "IntrstRateFxdScndLeg")
    protected CompareUnitPrice7 intrstRateFxdScndLeg;
    @XmlElement(name = "IntrstFxdRateScndLegDayCnt")
    protected CompareDayCount1 intrstFxdRateScndLegDayCnt;
    @XmlElement(name = "IntrstFxdRateScndLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFxdRateScndLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFxdRateScndLegPmtFrqcyVal")
    protected CompareNumber5 intrstFxdRateScndLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateScndLegId")
    protected CompareISINIdentifier4 intrstFltgRateScndLegId;
    @XmlElement(name = "IntrstFltgRateScndLegCd")
    protected CompareBenchmarkCode1 intrstFltgRateScndLegCd;
    @XmlElement(name = "IntrstFltgRateScndLegNm")
    protected CompareMax350Text1 intrstFltgRateScndLegNm;
    @XmlElement(name = "IntrstFltgRateScndLegDayCnt")
    protected CompareDayCount1 intrstFltgRateScndLegDayCnt;
    @XmlElement(name = "IntrstFltgRateScndLegPmtFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateScndLegPmtFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateScndLegPmtFrqcyVal")
    protected CompareNumber5 intrstFltgRateScndLegPmtFrqcyVal;
    @XmlElement(name = "IntrstFltgRateScndLegRefPrdUnit")
    protected CompareFrequencyUnit1 intrstFltgRateScndLegRefPrdUnit;
    @XmlElement(name = "IntrstFltgRateScndLegRefPrdVal")
    protected CompareNumber5 intrstFltgRateScndLegRefPrdVal;
    @XmlElement(name = "IntrstFltgRateScndLegRstFrqcyUnit")
    protected CompareFrequencyUnit1 intrstFltgRateScndLegRstFrqcyUnit;
    @XmlElement(name = "IntrstFltgRateScndLegRstFrqcyVal")
    protected CompareNumber5 intrstFltgRateScndLegRstFrqcyVal;
    @XmlElement(name = "IntrstFltgRateScndLegSprd")
    protected CompareUnitPrice8 intrstFltgRateScndLegSprd;
    @XmlElement(name = "PackgSprd")
    protected CompareUnitPrice8 packgSprd;
    @XmlElement(name = "CcyXchgRate")
    protected CompareExchangeRate1 ccyXchgRate;
    @XmlElement(name = "CcyFwdXchgRate")
    protected CompareExchangeRate1 ccyFwdXchgRate;
    @XmlElement(name = "CcyXchgRateBsis")
    protected CompareExchangeRateBasis1 ccyXchgRateBsis;
    @XmlElement(name = "Cmmdty")
    protected CompareCommodityAssetClass4 cmmdty;
    @XmlElement(name = "NrgyDlvryPtOrZone")
    protected List<CompareDeliveryInterconnectionPoint1> nrgyDlvryPtOrZone;
    @XmlElement(name = "NrgyIntrCnnctnPt")
    protected CompareDeliveryInterconnectionPoint1 nrgyIntrCnnctnPt;
    @XmlElement(name = "NrgyLdTp")
    protected CompareEnergyLoadType1 nrgyLdTp;
    @XmlElement(name = "DlvryAttr")
    protected List<CompareEnergyDeliveryAttribute1> dlvryAttr;
    @XmlElement(name = "OptnTp")
    protected CompareOptionType1 optnTp;
    @XmlElement(name = "OptnExrcStyle")
    protected List<CompareOptionStyle1> optnExrcStyle;
    @XmlElement(name = "OptnStrkPric")
    protected CompareUnitPrice4 optnStrkPric;
    @XmlElement(name = "OptnStrkPricSchdlUadjstdFctvDt")
    protected List<CompareDate3> optnStrkPricSchdlUadjstdFctvDt;
    @XmlElement(name = "OptnStrkPricSchdlUadjstdEndDt")
    protected List<CompareDate3> optnStrkPricSchdlUadjstdEndDt;
    @XmlElement(name = "OptnStrkPricSchdlAmt")
    protected List<CompareUnitPrice4> optnStrkPricSchdlAmt;
    @XmlElement(name = "OptnPrmAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount4 optnPrmAmt;
    @XmlElement(name = "OptnPrmPmtDt")
    protected CompareDate3 optnPrmPmtDt;
    @XmlElement(name = "OptnMtrtyDtOfUndrlyg")
    protected CompareDate3 optnMtrtyDtOfUndrlyg;
    @XmlElement(name = "CdtSnrty")
    protected CompareSeniorityType1 cdtSnrty;
    @XmlElement(name = "CdtRefPty")
    protected CompareReferenceParty1 cdtRefPty;
    @XmlElement(name = "CdtSrs")
    protected CompareNumber7 cdtSrs;
    @XmlElement(name = "CdtVrsn")
    protected CompareNumber7 cdtVrsn;
    @XmlElement(name = "CdtIndxFctr")
    protected ComparePercentageRate3 cdtIndxFctr;
    @XmlElement(name = "CdtTrch")
    protected CompareTrancheIndicator1 cdtTrch;
    @XmlElement(name = "Lvl")
    protected CompareReportingLevelType2 lvl;

    /**
     * Gets the value of the rptTrckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText2 }
     *     
     */
    public CompareText2 getRptTrckgNb() {
        return rptTrckgNb;
    }

    /**
     * Sets the value of the rptTrckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText2 }
     *     
     */
    public TransactionMatchingCriteria7 setRptTrckgNb(CompareText2 value) {
        this.rptTrckgNb = value;
        return this;
    }

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public CompareUniqueTransactionIdentifier2 getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public TransactionMatchingCriteria7 setUnqTxIdr(CompareUniqueTransactionIdentifier2 value) {
        this.unqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the prrUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public CompareUniqueTransactionIdentifier2 getPrrUnqTxIdr() {
        return prrUnqTxIdr;
    }

    /**
     * Sets the value of the prrUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public TransactionMatchingCriteria7 setPrrUnqTxIdr(CompareUniqueTransactionIdentifier2 value) {
        this.prrUnqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the sbsqntPosUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public CompareUniqueTransactionIdentifier2 getSbsqntPosUnqTxIdr() {
        return sbsqntPosUnqTxIdr;
    }

    /**
     * Sets the value of the sbsqntPosUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueTransactionIdentifier2 }
     *     
     */
    public TransactionMatchingCriteria7 setSbsqntPosUnqTxIdr(CompareUniqueTransactionIdentifier2 value) {
        this.sbsqntPosUnqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the dlta property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getDlta() {
        return dlta;
    }

    /**
     * Sets the value of the dlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public TransactionMatchingCriteria7 setDlta(CompareLongFraction19DecimalNumber1 value) {
        this.dlta = value;
        return this;
    }

    /**
     * Gets the value of the tradConf property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTradeConfirmation2 }
     *     
     */
    public CompareTradeConfirmation2 getTradConf() {
        return tradConf;
    }

    /**
     * Sets the value of the tradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTradeConfirmation2 }
     *     
     */
    public TransactionMatchingCriteria7 setTradConf(CompareTradeConfirmation2 value) {
        this.tradConf = value;
        return this;
    }

    /**
     * Gets the value of the tradClrOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTradeClearingObligation1 }
     *     
     */
    public CompareTradeClearingObligation1 getTradClrOblgtn() {
        return tradClrOblgtn;
    }

    /**
     * Sets the value of the tradClrOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTradeClearingObligation1 }
     *     
     */
    public TransactionMatchingCriteria7 setTradClrOblgtn(CompareTradeClearingObligation1 value) {
        this.tradClrOblgtn = value;
        return this;
    }

    /**
     * Gets the value of the tradClrSts property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTradeClearingStatus3 }
     *     
     */
    public CompareTradeClearingStatus3 getTradClrSts() {
        return tradClrSts;
    }

    /**
     * Sets the value of the tradClrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTradeClearingStatus3 }
     *     
     */
    public TransactionMatchingCriteria7 setTradClrSts(CompareTradeClearingStatus3 value) {
        this.tradClrSts = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMasterAgreementType1 }
     *     
     */
    public CompareMasterAgreementType1 getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMasterAgreementType1 }
     *     
     */
    public TransactionMatchingCriteria7 setMstrAgrmtTp(CompareMasterAgreementType1 value) {
        this.mstrAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMax50Text1 }
     *     
     */
    public CompareMax50Text1 getMstrAgrmtVrsn() {
        return mstrAgrmtVrsn;
    }

    /**
     * Sets the value of the mstrAgrmtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMax50Text1 }
     *     
     */
    public TransactionMatchingCriteria7 setMstrAgrmtVrsn(CompareMax50Text1 value) {
        this.mstrAgrmtVrsn = value;
        return this;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public TransactionMatchingCriteria7 setIntraGrp(CompareTrueFalseIndicator3 value) {
        this.intraGrp = value;
        return this;
    }

    /**
     * Gets the value of the pstTradRskRdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePostTradeRiskReduction2 }
     *     
     */
    public ComparePostTradeRiskReduction2 getPstTradRskRdctn() {
        return pstTradRskRdctn;
    }

    /**
     * Sets the value of the pstTradRskRdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePostTradeRiskReduction2 }
     *     
     */
    public TransactionMatchingCriteria7 setPstTradRskRdctn(ComparePostTradeRiskReduction2 value) {
        this.pstTradRskRdctn = value;
        return this;
    }

    /**
     * Gets the value of the derivEvt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDerivativeEvent1 }
     *     
     */
    public CompareDerivativeEvent1 getDerivEvt() {
        return derivEvt;
    }

    /**
     * Sets the value of the derivEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDerivativeEvent1 }
     *     
     */
    public TransactionMatchingCriteria7 setDerivEvt(CompareDerivativeEvent1 value) {
        this.derivEvt = value;
        return this;
    }

    /**
     * Gets the value of the pltfmIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public CompareMICIdentifier3 getPltfmIdr() {
        return pltfmIdr;
    }

    /**
     * Sets the value of the pltfmIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public TransactionMatchingCriteria7 setPltfmIdr(CompareMICIdentifier3 value) {
        this.pltfmIdr = value;
        return this;
    }

    /**
     * Gets the value of the exctnTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime3 }
     *     
     */
    public CompareDateTime3 getExctnTmStmp() {
        return exctnTmStmp;
    }

    /**
     * Sets the value of the exctnTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime3 }
     *     
     */
    public TransactionMatchingCriteria7 setExctnTmStmp(CompareDateTime3 value) {
        this.exctnTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public TransactionMatchingCriteria7 setFctvDt(CompareDate3 value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public TransactionMatchingCriteria7 setXprtnDt(CompareDate3 value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the earlyTermntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getEarlyTermntnDt() {
        return earlyTermntnDt;
    }

    /**
     * Sets the value of the earlyTermntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public TransactionMatchingCriteria7 setEarlyTermntnDt(CompareDate3 value) {
        this.earlyTermntnDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the sttlmDt property.
     */
    public List<CompareDate3> getSttlmDt() {
        if (sttlmDt == null) {
            sttlmDt = new ArrayList<>();
        }
        return this.sttlmDt;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryType1 }
     *     
     */
    public CompareDeliveryType1 getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryType1 }
     *     
     */
    public TransactionMatchingCriteria7 setDlvryTp(CompareDeliveryType1 value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the txPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public CompareUnitPrice5 getTxPric() {
        return txPric;
    }

    /**
     * Sets the value of the txPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public TransactionMatchingCriteria7 setTxPric(CompareUnitPrice5 value) {
        this.txPric = value;
        return this;
    }

    /**
     * Gets the value of the pricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricSchdlUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the pricSchdlUadjstdFctvDt property.
     */
    public List<CompareDate3> getPricSchdlUadjstdFctvDt() {
        if (pricSchdlUadjstdFctvDt == null) {
            pricSchdlUadjstdFctvDt = new ArrayList<>();
        }
        return this.pricSchdlUadjstdFctvDt;
    }

    /**
     * Gets the value of the pricSchdlUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricSchdlUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricSchdlUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the pricSchdlUadjstdEndDt property.
     */
    public List<CompareDate3> getPricSchdlUadjstdEndDt() {
        if (pricSchdlUadjstdEndDt == null) {
            pricSchdlUadjstdEndDt = new ArrayList<>();
        }
        return this.pricSchdlUadjstdEndDt;
    }

    /**
     * Gets the value of the txSchdlPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSchdlPric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSchdlPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareUnitPrice5 }
     * 
     * 
     * @return
     *     The value of the txSchdlPric property.
     */
    public List<CompareUnitPrice5> getTxSchdlPric() {
        if (txSchdlPric == null) {
            txSchdlPric = new ArrayList<>();
        }
        return this.txSchdlPric;
    }

    /**
     * Gets the value of the packgPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public CompareUnitPrice5 getPackgPric() {
        return packgPric;
    }

    /**
     * Sets the value of the packgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice5 }
     *     
     */
    public TransactionMatchingCriteria7 setPackgPric(CompareUnitPrice5 value) {
        this.packgPric = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmtFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getNtnlAmtFrstLeg() {
        return ntnlAmtFrstLeg;
    }

    /**
     * Sets the value of the ntnlAmtFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public TransactionMatchingCriteria7 setNtnlAmtFrstLeg(CompareAmountAndDirection3 value) {
        this.ntnlAmtFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmtFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtFrstLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtFrstLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlAmtFrstLegUadjstdFctvDt() {
        if (ntnlAmtFrstLegUadjstdFctvDt == null) {
            ntnlAmtFrstLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlAmtFrstLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlAmtFrstLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtFrstLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtFrstLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtFrstLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlAmtFrstLegUadjstdEndDt() {
        if (ntnlAmtFrstLegUadjstdEndDt == null) {
            ntnlAmtFrstLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlAmtFrstLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlAmtFrstLegSchdlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtFrstLegSchdlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtFrstLegSchdlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareAmountAndDirection3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtFrstLegSchdlAmt property.
     */
    public List<CompareAmountAndDirection3> getNtnlAmtFrstLegSchdlAmt() {
        if (ntnlAmtFrstLegSchdlAmt == null) {
            ntnlAmtFrstLegSchdlAmt = new ArrayList<>();
        }
        return this.ntnlAmtFrstLegSchdlAmt;
    }

    /**
     * Gets the value of the ntnlQtyFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getNtnlQtyFrstLeg() {
        return ntnlQtyFrstLeg;
    }

    /**
     * Sets the value of the ntnlQtyFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public TransactionMatchingCriteria7 setNtnlQtyFrstLeg(CompareLongFraction19DecimalNumber1 value) {
        this.ntnlQtyFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the ntnlQtyFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyFrstLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyFrstLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyFrstLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlQtyFrstLegUadjstdFctvDt() {
        if (ntnlQtyFrstLegUadjstdFctvDt == null) {
            ntnlQtyFrstLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlQtyFrstLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlQtyFrstLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyFrstLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyFrstLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyFrstLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlQtyFrstLegUadjstdEndDt() {
        if (ntnlQtyFrstLegUadjstdEndDt == null) {
            ntnlQtyFrstLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlQtyFrstLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlQtyFrstLegSchdlQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyFrstLegSchdlQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyFrstLegSchdlQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareLongFraction19DecimalNumber1 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyFrstLegSchdlQty property.
     */
    public List<CompareLongFraction19DecimalNumber1> getNtnlQtyFrstLegSchdlQty() {
        if (ntnlQtyFrstLegSchdlQty == null) {
            ntnlQtyFrstLegSchdlQty = new ArrayList<>();
        }
        return this.ntnlQtyFrstLegSchdlQty;
    }

    /**
     * Gets the value of the ntnlAmtScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getNtnlAmtScndLeg() {
        return ntnlAmtScndLeg;
    }

    /**
     * Sets the value of the ntnlAmtScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public TransactionMatchingCriteria7 setNtnlAmtScndLeg(CompareAmountAndDirection3 value) {
        this.ntnlAmtScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the ntnlAmtScndLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtScndLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtScndLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtScndLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlAmtScndLegUadjstdFctvDt() {
        if (ntnlAmtScndLegUadjstdFctvDt == null) {
            ntnlAmtScndLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlAmtScndLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlAmtScndLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtScndLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtScndLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtScndLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlAmtScndLegUadjstdEndDt() {
        if (ntnlAmtScndLegUadjstdEndDt == null) {
            ntnlAmtScndLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlAmtScndLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlAmtScndLegSchdlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlAmtScndLegSchdlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlAmtScndLegSchdlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareAmountAndDirection3 }
     * 
     * 
     * @return
     *     The value of the ntnlAmtScndLegSchdlAmt property.
     */
    public List<CompareAmountAndDirection3> getNtnlAmtScndLegSchdlAmt() {
        if (ntnlAmtScndLegSchdlAmt == null) {
            ntnlAmtScndLegSchdlAmt = new ArrayList<>();
        }
        return this.ntnlAmtScndLegSchdlAmt;
    }

    /**
     * Gets the value of the ntnlQtyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getNtnlQtyScndLeg() {
        return ntnlQtyScndLeg;
    }

    /**
     * Sets the value of the ntnlQtyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public TransactionMatchingCriteria7 setNtnlQtyScndLeg(CompareLongFraction19DecimalNumber1 value) {
        this.ntnlQtyScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the ntnlQtyScndLegUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyScndLegUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyScndLegUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyScndLegUadjstdFctvDt property.
     */
    public List<CompareDate3> getNtnlQtyScndLegUadjstdFctvDt() {
        if (ntnlQtyScndLegUadjstdFctvDt == null) {
            ntnlQtyScndLegUadjstdFctvDt = new ArrayList<>();
        }
        return this.ntnlQtyScndLegUadjstdFctvDt;
    }

    /**
     * Gets the value of the ntnlQtyScndLegUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyScndLegUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyScndLegUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyScndLegUadjstdEndDt property.
     */
    public List<CompareDate3> getNtnlQtyScndLegUadjstdEndDt() {
        if (ntnlQtyScndLegUadjstdEndDt == null) {
            ntnlQtyScndLegUadjstdEndDt = new ArrayList<>();
        }
        return this.ntnlQtyScndLegUadjstdEndDt;
    }

    /**
     * Gets the value of the ntnlQtyScndLegSchdlQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntnlQtyScndLegSchdlQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtnlQtyScndLegSchdlQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareLongFraction19DecimalNumber1 }
     * 
     * 
     * @return
     *     The value of the ntnlQtyScndLegSchdlQty property.
     */
    public List<CompareLongFraction19DecimalNumber1> getNtnlQtyScndLegSchdlQty() {
        if (ntnlQtyScndLegSchdlQty == null) {
            ntnlQtyScndLegSchdlQty = new ArrayList<>();
        }
        return this.ntnlQtyScndLegSchdlQty;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareOtherPayment1 }
     * 
     * 
     * @return
     *     The value of the othrPmt property.
     */
    public List<CompareOtherPayment1> getOthrPmt() {
        if (othrPmt == null) {
            othrPmt = new ArrayList<>();
        }
        return this.othrPmt;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public CompareUnitPrice7 getIntrstFxdRateFrstLeg() {
        return intrstFxdRateFrstLeg;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateFrstLeg(CompareUnitPrice7 value) {
        this.intrstFxdRateFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFxdRateFrstLegDayCnt() {
        return intrstFxdRateFrstLegDayCnt;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateFrstLegDayCnt(CompareDayCount1 value) {
        this.intrstFxdRateFrstLegDayCnt = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFxdRateFrstLegPmtFrqcyUnit() {
        return intrstFxdRateFrstLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateFrstLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFxdRateFrstLegPmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxdRateFrstLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFxdRateFrstLegPmtFrqcyVal() {
        return intrstFxdRateFrstLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFxdRateFrstLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateFrstLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFxdRateFrstLegPmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public CompareISINIdentifier4 getIntrstFltgRateFrstLegId() {
        return intrstFltgRateFrstLegId;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegId(CompareISINIdentifier4 value) {
        this.intrstFltgRateFrstLegId = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegCd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public CompareBenchmarkCode1 getIntrstFltgRateFrstLegCd() {
        return intrstFltgRateFrstLegCd;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegCd(CompareBenchmarkCode1 value) {
        this.intrstFltgRateFrstLegCd = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegNm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public CompareMax350Text1 getIntrstFltgRateFrstLegNm() {
        return intrstFltgRateFrstLegNm;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegNm(CompareMax350Text1 value) {
        this.intrstFltgRateFrstLegNm = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFltgRateFrstLegDayCnt() {
        return intrstFltgRateFrstLegDayCnt;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegDayCnt(CompareDayCount1 value) {
        this.intrstFltgRateFrstLegDayCnt = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateFrstLegPmtFrqcyUnit() {
        return intrstFltgRateFrstLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateFrstLegPmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateFrstLegPmtFrqcyVal() {
        return intrstFltgRateFrstLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateFrstLegPmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRefPrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateFrstLegRefPrdUnit() {
        return intrstFltgRateFrstLegRefPrdUnit;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRefPrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegRefPrdUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateFrstLegRefPrdUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRefPrdVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateFrstLegRefPrdVal() {
        return intrstFltgRateFrstLegRefPrdVal;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRefPrdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegRefPrdVal(CompareNumber5 value) {
        this.intrstFltgRateFrstLegRefPrdVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateFrstLegRstFrqcyUnit() {
        return intrstFltgRateFrstLegRstFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegRstFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateFrstLegRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateFrstLegRstFrqcyVal() {
        return intrstFltgRateFrstLegRstFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegRstFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateFrstLegRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateFrstLegSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public CompareUnitPrice8 getIntrstFltgRateFrstLegSprd() {
        return intrstFltgRateFrstLegSprd;
    }

    /**
     * Sets the value of the intrstFltgRateFrstLegSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateFrstLegSprd(CompareUnitPrice8 value) {
        this.intrstFltgRateFrstLegSprd = value;
        return this;
    }

    /**
     * Gets the value of the intrstRateFxdScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public CompareUnitPrice7 getIntrstRateFxdScndLeg() {
        return intrstRateFxdScndLeg;
    }

    /**
     * Sets the value of the intrstRateFxdScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice7 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstRateFxdScndLeg(CompareUnitPrice7 value) {
        this.intrstRateFxdScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxdRateScndLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFxdRateScndLegDayCnt() {
        return intrstFxdRateScndLegDayCnt;
    }

    /**
     * Sets the value of the intrstFxdRateScndLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateScndLegDayCnt(CompareDayCount1 value) {
        this.intrstFxdRateScndLegDayCnt = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxdRateScndLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFxdRateScndLegPmtFrqcyUnit() {
        return intrstFxdRateScndLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFxdRateScndLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateScndLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFxdRateScndLegPmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFxdRateScndLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFxdRateScndLegPmtFrqcyVal() {
        return intrstFxdRateScndLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFxdRateScndLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFxdRateScndLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFxdRateScndLegPmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public CompareISINIdentifier4 getIntrstFltgRateScndLegId() {
        return intrstFltgRateScndLegId;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegId(CompareISINIdentifier4 value) {
        this.intrstFltgRateScndLegId = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegCd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public CompareBenchmarkCode1 getIntrstFltgRateScndLegCd() {
        return intrstFltgRateScndLegCd;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCode1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegCd(CompareBenchmarkCode1 value) {
        this.intrstFltgRateScndLegCd = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegNm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public CompareMax350Text1 getIntrstFltgRateScndLegNm() {
        return intrstFltgRateScndLegNm;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMax350Text1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegNm(CompareMax350Text1 value) {
        this.intrstFltgRateScndLegNm = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegDayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDayCount1 }
     *     
     */
    public CompareDayCount1 getIntrstFltgRateScndLegDayCnt() {
        return intrstFltgRateScndLegDayCnt;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegDayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDayCount1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegDayCnt(CompareDayCount1 value) {
        this.intrstFltgRateScndLegDayCnt = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegPmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateScndLegPmtFrqcyUnit() {
        return intrstFltgRateScndLegPmtFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegPmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegPmtFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateScndLegPmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegPmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateScndLegPmtFrqcyVal() {
        return intrstFltgRateScndLegPmtFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegPmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegPmtFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateScndLegPmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRefPrdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateScndLegRefPrdUnit() {
        return intrstFltgRateScndLegRefPrdUnit;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRefPrdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegRefPrdUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateScndLegRefPrdUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRefPrdVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateScndLegRefPrdVal() {
        return intrstFltgRateScndLegRefPrdVal;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRefPrdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegRefPrdVal(CompareNumber5 value) {
        this.intrstFltgRateScndLegRefPrdVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public CompareFrequencyUnit1 getIntrstFltgRateScndLegRstFrqcyUnit() {
        return intrstFltgRateScndLegRstFrqcyUnit;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFrequencyUnit1 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegRstFrqcyUnit(CompareFrequencyUnit1 value) {
        this.intrstFltgRateScndLegRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getIntrstFltgRateScndLegRstFrqcyVal() {
        return intrstFltgRateScndLegRstFrqcyVal;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegRstFrqcyVal(CompareNumber5 value) {
        this.intrstFltgRateScndLegRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstFltgRateScndLegSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public CompareUnitPrice8 getIntrstFltgRateScndLegSprd() {
        return intrstFltgRateScndLegSprd;
    }

    /**
     * Sets the value of the intrstFltgRateScndLegSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public TransactionMatchingCriteria7 setIntrstFltgRateScndLegSprd(CompareUnitPrice8 value) {
        this.intrstFltgRateScndLegSprd = value;
        return this;
    }

    /**
     * Gets the value of the packgSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public CompareUnitPrice8 getPackgSprd() {
        return packgSprd;
    }

    /**
     * Sets the value of the packgSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice8 }
     *     
     */
    public TransactionMatchingCriteria7 setPackgSprd(CompareUnitPrice8 value) {
        this.packgSprd = value;
        return this;
    }

    /**
     * Gets the value of the ccyXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public CompareExchangeRate1 getCcyXchgRate() {
        return ccyXchgRate;
    }

    /**
     * Sets the value of the ccyXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public TransactionMatchingCriteria7 setCcyXchgRate(CompareExchangeRate1 value) {
        this.ccyXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the ccyFwdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public CompareExchangeRate1 getCcyFwdXchgRate() {
        return ccyFwdXchgRate;
    }

    /**
     * Sets the value of the ccyFwdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExchangeRate1 }
     *     
     */
    public TransactionMatchingCriteria7 setCcyFwdXchgRate(CompareExchangeRate1 value) {
        this.ccyFwdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the ccyXchgRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExchangeRateBasis1 }
     *     
     */
    public CompareExchangeRateBasis1 getCcyXchgRateBsis() {
        return ccyXchgRateBsis;
    }

    /**
     * Sets the value of the ccyXchgRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExchangeRateBasis1 }
     *     
     */
    public TransactionMatchingCriteria7 setCcyXchgRateBsis(CompareExchangeRateBasis1 value) {
        this.ccyXchgRateBsis = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass4 }
     *     
     */
    public CompareCommodityAssetClass4 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass4 }
     *     
     */
    public TransactionMatchingCriteria7 setCmmdty(CompareCommodityAssetClass4 value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the nrgyDlvryPtOrZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrgyDlvryPtOrZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrgyDlvryPtOrZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDeliveryInterconnectionPoint1 }
     * 
     * 
     * @return
     *     The value of the nrgyDlvryPtOrZone property.
     */
    public List<CompareDeliveryInterconnectionPoint1> getNrgyDlvryPtOrZone() {
        if (nrgyDlvryPtOrZone == null) {
            nrgyDlvryPtOrZone = new ArrayList<>();
        }
        return this.nrgyDlvryPtOrZone;
    }

    /**
     * Gets the value of the nrgyIntrCnnctnPt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryInterconnectionPoint1 }
     *     
     */
    public CompareDeliveryInterconnectionPoint1 getNrgyIntrCnnctnPt() {
        return nrgyIntrCnnctnPt;
    }

    /**
     * Sets the value of the nrgyIntrCnnctnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryInterconnectionPoint1 }
     *     
     */
    public TransactionMatchingCriteria7 setNrgyIntrCnnctnPt(CompareDeliveryInterconnectionPoint1 value) {
        this.nrgyIntrCnnctnPt = value;
        return this;
    }

    /**
     * Gets the value of the nrgyLdTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareEnergyLoadType1 }
     *     
     */
    public CompareEnergyLoadType1 getNrgyLdTp() {
        return nrgyLdTp;
    }

    /**
     * Sets the value of the nrgyLdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareEnergyLoadType1 }
     *     
     */
    public TransactionMatchingCriteria7 setNrgyLdTp(CompareEnergyLoadType1 value) {
        this.nrgyLdTp = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareEnergyDeliveryAttribute1 }
     * 
     * 
     * @return
     *     The value of the dlvryAttr property.
     */
    public List<CompareEnergyDeliveryAttribute1> getDlvryAttr() {
        if (dlvryAttr == null) {
            dlvryAttr = new ArrayList<>();
        }
        return this.dlvryAttr;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOptionType1 }
     *     
     */
    public CompareOptionType1 getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOptionType1 }
     *     
     */
    public TransactionMatchingCriteria7 setOptnTp(CompareOptionType1 value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the optnExrcStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnExrcStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnExrcStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareOptionStyle1 }
     * 
     * 
     * @return
     *     The value of the optnExrcStyle property.
     */
    public List<CompareOptionStyle1> getOptnExrcStyle() {
        if (optnExrcStyle == null) {
            optnExrcStyle = new ArrayList<>();
        }
        return this.optnExrcStyle;
    }

    /**
     * Gets the value of the optnStrkPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice4 }
     *     
     */
    public CompareUnitPrice4 getOptnStrkPric() {
        return optnStrkPric;
    }

    /**
     * Sets the value of the optnStrkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice4 }
     *     
     */
    public TransactionMatchingCriteria7 setOptnStrkPric(CompareUnitPrice4 value) {
        this.optnStrkPric = value;
        return this;
    }

    /**
     * Gets the value of the optnStrkPricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnStrkPricSchdlUadjstdFctvDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnStrkPricSchdlUadjstdFctvDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the optnStrkPricSchdlUadjstdFctvDt property.
     */
    public List<CompareDate3> getOptnStrkPricSchdlUadjstdFctvDt() {
        if (optnStrkPricSchdlUadjstdFctvDt == null) {
            optnStrkPricSchdlUadjstdFctvDt = new ArrayList<>();
        }
        return this.optnStrkPricSchdlUadjstdFctvDt;
    }

    /**
     * Gets the value of the optnStrkPricSchdlUadjstdEndDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnStrkPricSchdlUadjstdEndDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnStrkPricSchdlUadjstdEndDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the optnStrkPricSchdlUadjstdEndDt property.
     */
    public List<CompareDate3> getOptnStrkPricSchdlUadjstdEndDt() {
        if (optnStrkPricSchdlUadjstdEndDt == null) {
            optnStrkPricSchdlUadjstdEndDt = new ArrayList<>();
        }
        return this.optnStrkPricSchdlUadjstdEndDt;
    }

    /**
     * Gets the value of the optnStrkPricSchdlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnStrkPricSchdlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnStrkPricSchdlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareUnitPrice4 }
     * 
     * 
     * @return
     *     The value of the optnStrkPricSchdlAmt property.
     */
    public List<CompareUnitPrice4> getOptnStrkPricSchdlAmt() {
        if (optnStrkPricSchdlAmt == null) {
            optnStrkPricSchdlAmt = new ArrayList<>();
        }
        return this.optnStrkPricSchdlAmt;
    }

    /**
     * Gets the value of the optnPrmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount4 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount4 getOptnPrmAmt() {
        return optnPrmAmt;
    }

    /**
     * Sets the value of the optnPrmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount4 }
     *     
     */
    public TransactionMatchingCriteria7 setOptnPrmAmt(CompareActiveOrHistoricCurrencyAndAmount4 value) {
        this.optnPrmAmt = value;
        return this;
    }

    /**
     * Gets the value of the optnPrmPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getOptnPrmPmtDt() {
        return optnPrmPmtDt;
    }

    /**
     * Sets the value of the optnPrmPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public TransactionMatchingCriteria7 setOptnPrmPmtDt(CompareDate3 value) {
        this.optnPrmPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the optnMtrtyDtOfUndrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getOptnMtrtyDtOfUndrlyg() {
        return optnMtrtyDtOfUndrlyg;
    }

    /**
     * Sets the value of the optnMtrtyDtOfUndrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public TransactionMatchingCriteria7 setOptnMtrtyDtOfUndrlyg(CompareDate3 value) {
        this.optnMtrtyDtOfUndrlyg = value;
        return this;
    }

    /**
     * Gets the value of the cdtSnrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSeniorityType1 }
     *     
     */
    public CompareSeniorityType1 getCdtSnrty() {
        return cdtSnrty;
    }

    /**
     * Sets the value of the cdtSnrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSeniorityType1 }
     *     
     */
    public TransactionMatchingCriteria7 setCdtSnrty(CompareSeniorityType1 value) {
        this.cdtSnrty = value;
        return this;
    }

    /**
     * Gets the value of the cdtRefPty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReferenceParty1 }
     *     
     */
    public CompareReferenceParty1 getCdtRefPty() {
        return cdtRefPty;
    }

    /**
     * Sets the value of the cdtRefPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReferenceParty1 }
     *     
     */
    public TransactionMatchingCriteria7 setCdtRefPty(CompareReferenceParty1 value) {
        this.cdtRefPty = value;
        return this;
    }

    /**
     * Gets the value of the cdtSrs property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber7 }
     *     
     */
    public CompareNumber7 getCdtSrs() {
        return cdtSrs;
    }

    /**
     * Sets the value of the cdtSrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber7 }
     *     
     */
    public TransactionMatchingCriteria7 setCdtSrs(CompareNumber7 value) {
        this.cdtSrs = value;
        return this;
    }

    /**
     * Gets the value of the cdtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber7 }
     *     
     */
    public CompareNumber7 getCdtVrsn() {
        return cdtVrsn;
    }

    /**
     * Sets the value of the cdtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber7 }
     *     
     */
    public TransactionMatchingCriteria7 setCdtVrsn(CompareNumber7 value) {
        this.cdtVrsn = value;
        return this;
    }

    /**
     * Gets the value of the cdtIndxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getCdtIndxFctr() {
        return cdtIndxFctr;
    }

    /**
     * Sets the value of the cdtIndxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public TransactionMatchingCriteria7 setCdtIndxFctr(ComparePercentageRate3 value) {
        this.cdtIndxFctr = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrch property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrancheIndicator1 }
     *     
     */
    public CompareTrancheIndicator1 getCdtTrch() {
        return cdtTrch;
    }

    /**
     * Sets the value of the cdtTrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrancheIndicator1 }
     *     
     */
    public TransactionMatchingCriteria7 setCdtTrch(CompareTrancheIndicator1 value) {
        this.cdtTrch = value;
        return this;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReportingLevelType2 }
     *     
     */
    public CompareReportingLevelType2 getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReportingLevelType2 }
     *     
     */
    public TransactionMatchingCriteria7 setLvl(CompareReportingLevelType2 value) {
        this.lvl = value;
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
     * Adds a new item to the sttlmDt list.
     * @see #getSttlmDt()
     * 
     */
    public TransactionMatchingCriteria7 addSttlmDt(CompareDate3 sttlmDt) {
        getSttlmDt().add(sttlmDt);
        return this;
    }

    /**
     * Adds a new item to the pricSchdlUadjstdFctvDt list.
     * @see #getPricSchdlUadjstdFctvDt()
     * 
     */
    public TransactionMatchingCriteria7 addPricSchdlUadjstdFctvDt(CompareDate3 pricSchdlUadjstdFctvDt) {
        getPricSchdlUadjstdFctvDt().add(pricSchdlUadjstdFctvDt);
        return this;
    }

    /**
     * Adds a new item to the pricSchdlUadjstdEndDt list.
     * @see #getPricSchdlUadjstdEndDt()
     * 
     */
    public TransactionMatchingCriteria7 addPricSchdlUadjstdEndDt(CompareDate3 pricSchdlUadjstdEndDt) {
        getPricSchdlUadjstdEndDt().add(pricSchdlUadjstdEndDt);
        return this;
    }

    /**
     * Adds a new item to the txSchdlPric list.
     * @see #getTxSchdlPric()
     * 
     */
    public TransactionMatchingCriteria7 addTxSchdlPric(CompareUnitPrice5 txSchdlPric) {
        getTxSchdlPric().add(txSchdlPric);
        return this;
    }

    /**
     * Adds a new item to the ntnlAmtFrstLegUadjstdFctvDt list.
     * @see #getNtnlAmtFrstLegUadjstdFctvDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlAmtFrstLegUadjstdFctvDt(CompareDate3 ntnlAmtFrstLegUadjstdFctvDt) {
        getNtnlAmtFrstLegUadjstdFctvDt().add(ntnlAmtFrstLegUadjstdFctvDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlAmtFrstLegUadjstdEndDt list.
     * @see #getNtnlAmtFrstLegUadjstdEndDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlAmtFrstLegUadjstdEndDt(CompareDate3 ntnlAmtFrstLegUadjstdEndDt) {
        getNtnlAmtFrstLegUadjstdEndDt().add(ntnlAmtFrstLegUadjstdEndDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlAmtFrstLegSchdlAmt list.
     * @see #getNtnlAmtFrstLegSchdlAmt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlAmtFrstLegSchdlAmt(CompareAmountAndDirection3 ntnlAmtFrstLegSchdlAmt) {
        getNtnlAmtFrstLegSchdlAmt().add(ntnlAmtFrstLegSchdlAmt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQtyFrstLegUadjstdFctvDt list.
     * @see #getNtnlQtyFrstLegUadjstdFctvDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlQtyFrstLegUadjstdFctvDt(CompareDate3 ntnlQtyFrstLegUadjstdFctvDt) {
        getNtnlQtyFrstLegUadjstdFctvDt().add(ntnlQtyFrstLegUadjstdFctvDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQtyFrstLegUadjstdEndDt list.
     * @see #getNtnlQtyFrstLegUadjstdEndDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlQtyFrstLegUadjstdEndDt(CompareDate3 ntnlQtyFrstLegUadjstdEndDt) {
        getNtnlQtyFrstLegUadjstdEndDt().add(ntnlQtyFrstLegUadjstdEndDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQtyFrstLegSchdlQty list.
     * @see #getNtnlQtyFrstLegSchdlQty()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlQtyFrstLegSchdlQty(CompareLongFraction19DecimalNumber1 ntnlQtyFrstLegSchdlQty) {
        getNtnlQtyFrstLegSchdlQty().add(ntnlQtyFrstLegSchdlQty);
        return this;
    }

    /**
     * Adds a new item to the ntnlAmtScndLegUadjstdFctvDt list.
     * @see #getNtnlAmtScndLegUadjstdFctvDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlAmtScndLegUadjstdFctvDt(CompareDate3 ntnlAmtScndLegUadjstdFctvDt) {
        getNtnlAmtScndLegUadjstdFctvDt().add(ntnlAmtScndLegUadjstdFctvDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlAmtScndLegUadjstdEndDt list.
     * @see #getNtnlAmtScndLegUadjstdEndDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlAmtScndLegUadjstdEndDt(CompareDate3 ntnlAmtScndLegUadjstdEndDt) {
        getNtnlAmtScndLegUadjstdEndDt().add(ntnlAmtScndLegUadjstdEndDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlAmtScndLegSchdlAmt list.
     * @see #getNtnlAmtScndLegSchdlAmt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlAmtScndLegSchdlAmt(CompareAmountAndDirection3 ntnlAmtScndLegSchdlAmt) {
        getNtnlAmtScndLegSchdlAmt().add(ntnlAmtScndLegSchdlAmt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQtyScndLegUadjstdFctvDt list.
     * @see #getNtnlQtyScndLegUadjstdFctvDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlQtyScndLegUadjstdFctvDt(CompareDate3 ntnlQtyScndLegUadjstdFctvDt) {
        getNtnlQtyScndLegUadjstdFctvDt().add(ntnlQtyScndLegUadjstdFctvDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQtyScndLegUadjstdEndDt list.
     * @see #getNtnlQtyScndLegUadjstdEndDt()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlQtyScndLegUadjstdEndDt(CompareDate3 ntnlQtyScndLegUadjstdEndDt) {
        getNtnlQtyScndLegUadjstdEndDt().add(ntnlQtyScndLegUadjstdEndDt);
        return this;
    }

    /**
     * Adds a new item to the ntnlQtyScndLegSchdlQty list.
     * @see #getNtnlQtyScndLegSchdlQty()
     * 
     */
    public TransactionMatchingCriteria7 addNtnlQtyScndLegSchdlQty(CompareLongFraction19DecimalNumber1 ntnlQtyScndLegSchdlQty) {
        getNtnlQtyScndLegSchdlQty().add(ntnlQtyScndLegSchdlQty);
        return this;
    }

    /**
     * Adds a new item to the othrPmt list.
     * @see #getOthrPmt()
     * 
     */
    public TransactionMatchingCriteria7 addOthrPmt(CompareOtherPayment1 othrPmt) {
        getOthrPmt().add(othrPmt);
        return this;
    }

    /**
     * Adds a new item to the nrgyDlvryPtOrZone list.
     * @see #getNrgyDlvryPtOrZone()
     * 
     */
    public TransactionMatchingCriteria7 addNrgyDlvryPtOrZone(CompareDeliveryInterconnectionPoint1 nrgyDlvryPtOrZone) {
        getNrgyDlvryPtOrZone().add(nrgyDlvryPtOrZone);
        return this;
    }

    /**
     * Adds a new item to the dlvryAttr list.
     * @see #getDlvryAttr()
     * 
     */
    public TransactionMatchingCriteria7 addDlvryAttr(CompareEnergyDeliveryAttribute1 dlvryAttr) {
        getDlvryAttr().add(dlvryAttr);
        return this;
    }

    /**
     * Adds a new item to the optnExrcStyle list.
     * @see #getOptnExrcStyle()
     * 
     */
    public TransactionMatchingCriteria7 addOptnExrcStyle(CompareOptionStyle1 optnExrcStyle) {
        getOptnExrcStyle().add(optnExrcStyle);
        return this;
    }

    /**
     * Adds a new item to the optnStrkPricSchdlUadjstdFctvDt list.
     * @see #getOptnStrkPricSchdlUadjstdFctvDt()
     * 
     */
    public TransactionMatchingCriteria7 addOptnStrkPricSchdlUadjstdFctvDt(CompareDate3 optnStrkPricSchdlUadjstdFctvDt) {
        getOptnStrkPricSchdlUadjstdFctvDt().add(optnStrkPricSchdlUadjstdFctvDt);
        return this;
    }

    /**
     * Adds a new item to the optnStrkPricSchdlUadjstdEndDt list.
     * @see #getOptnStrkPricSchdlUadjstdEndDt()
     * 
     */
    public TransactionMatchingCriteria7 addOptnStrkPricSchdlUadjstdEndDt(CompareDate3 optnStrkPricSchdlUadjstdEndDt) {
        getOptnStrkPricSchdlUadjstdEndDt().add(optnStrkPricSchdlUadjstdEndDt);
        return this;
    }

    /**
     * Adds a new item to the optnStrkPricSchdlAmt list.
     * @see #getOptnStrkPricSchdlAmt()
     * 
     */
    public TransactionMatchingCriteria7 addOptnStrkPricSchdlAmt(CompareUnitPrice4 optnStrkPricSchdlAmt) {
        getOptnStrkPricSchdlAmt().add(optnStrkPricSchdlAmt);
        return this;
    }

}
