
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Compares information related to both sides of a loan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanMatchingCriteria3", propOrder = {
    "dt",
    "ctrctTp",
    "clrSts",
    "clrDtTm",
    "ccp",
    "tradgVn",
    "mstrAgrmtTp",
    "exctgDtTm",
    "startDt",
    "endDt",
    "evtDt",
    "minNtcePrd",
    "earlstCallBckDt",
    "gnlColl",
    "dlvryByVal",
    "collDlvryMtd",
    "opnTerm",
    "termntnOptn",
    "fxdIntrstRate",
    "dayCntBsis",
    "fltgIntrstRefRate",
    "fltgIntrstRateTermUnit",
    "fltgIntrstRateTermVal",
    "fltgIntrstRatePmtFrqcyUnit",
    "fltgIntrstRatePmtFrqcyVal",
    "fltgIntrstRateRstFrqcyUnit",
    "fltgIntrstRateRstFrqcyVal",
    "intrstRateBsisPtSprd",
    "mrgnLnAmt",
    "prncplAmtStartDtAmt",
    "prncplAmtMtrtyDtAmt",
    "asstTp",
    "sctyId",
    "sctyClssfctn",
    "cmmdtyClssfctn",
    "qty",
    "nmnlVal",
    "cmmdtyQtyUnitOfMeasr",
    "unitPric",
    "sctyQlty",
    "sctyMtrty",
    "sctyIssrLEI",
    "sctyIssrCtryJursdctn",
    "sctyTp",
    "lnVal",
    "mktVal",
    "fxdRbtRefRate",
    "fltgRbtRefRate",
    "fltgRbtRateTermUnit",
    "fltgRbtRateTermVal",
    "fltgRbtRatePmtFrqcyUnit",
    "fltgRbtRatePmtFrqcyVal",
    "fltgRbtRateRstFrqcyUnit",
    "fltgRbtRateRstFrqcyVal",
    "rbtRateBsisPtSprd",
    "lndgFee",
    "exclsvArrgmnt",
    "outsdngLn",
    "shrtMktVal",
    "lvlTp"
})
public class LoanMatchingCriteria3 {

    @XmlElement(name = "Dt")
    protected CompareDate1 dt;
    @XmlElement(name = "CtrctTp")
    protected CompareExposureType1 ctrctTp;
    @XmlElement(name = "ClrSts")
    protected CompareClearingStatus1 clrSts;
    @XmlElement(name = "ClrDtTm")
    protected CompareDateTime1 clrDtTm;
    @XmlElement(name = "CCP")
    protected CompareLEIIdentifier1 ccp;
    @XmlElement(name = "TradgVn")
    protected CompareMICIdentifier1 tradgVn;
    @XmlElement(name = "MstrAgrmtTp")
    protected CompareAssetType1 mstrAgrmtTp;
    @XmlElement(name = "ExctgDtTm")
    protected CompareDateTime1 exctgDtTm;
    @XmlElement(name = "StartDt")
    protected CompareDate1 startDt;
    @XmlElement(name = "EndDt")
    protected CompareDate1 endDt;
    @XmlElement(name = "EvtDt")
    protected CompareDate1 evtDt;
    @XmlElement(name = "MinNtcePrd")
    protected CompareNumber1 minNtcePrd;
    @XmlElement(name = "EarlstCallBckDt")
    protected CompareDate1 earlstCallBckDt;
    @XmlElement(name = "GnlColl")
    protected CompareSpecialCollateral1 gnlColl;
    @XmlElement(name = "DlvryByVal")
    protected CompareTrueFalseIndicator1 dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    protected CompareDeliveryMethod1 collDlvryMtd;
    @XmlElement(name = "OpnTerm")
    protected CompareTrueFalseIndicator1 opnTerm;
    @XmlElement(name = "TermntnOptn")
    protected CompareTerminationOption1 termntnOptn;
    @XmlElement(name = "FxdIntrstRate")
    protected ComparePercentageRate1 fxdIntrstRate;
    @XmlElement(name = "DayCntBsis")
    protected CompareNumber2 dayCntBsis;
    @XmlElement(name = "FltgIntrstRefRate")
    protected CompareBenchmarkCurveName1 fltgIntrstRefRate;
    @XmlElement(name = "FltgIntrstRateTermUnit")
    protected CompareRateBasis1 fltgIntrstRateTermUnit;
    @XmlElement(name = "FltgIntrstRateTermVal")
    protected CompareNumber1 fltgIntrstRateTermVal;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyUnit")
    protected CompareRateBasis1 fltgIntrstRatePmtFrqcyUnit;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyVal")
    protected CompareNumber1 fltgIntrstRatePmtFrqcyVal;
    @XmlElement(name = "FltgIntrstRateRstFrqcyUnit")
    protected CompareRateBasis1 fltgIntrstRateRstFrqcyUnit;
    @XmlElement(name = "FltgIntrstRateRstFrqcyVal")
    protected CompareNumber1 fltgIntrstRateRstFrqcyVal;
    @XmlElement(name = "IntrstRateBsisPtSprd")
    protected CompareNumber2 intrstRateBsisPtSprd;
    @XmlElement(name = "MrgnLnAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount1 mrgnLnAmt;
    @XmlElement(name = "PrncplAmtStartDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount1 prncplAmtStartDtAmt;
    @XmlElement(name = "PrncplAmtMtrtyDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount1 prncplAmtMtrtyDtAmt;
    @XmlElement(name = "AsstTp")
    protected CompareAssetType1 asstTp;
    @XmlElement(name = "SctyId")
    protected CompareISINIdentifier1 sctyId;
    @XmlElement(name = "SctyClssfctn")
    protected CompareCFIIdentifier1 sctyClssfctn;
    @XmlElement(name = "CmmdtyClssfctn")
    protected CompareCommodityAssetClass1 cmmdtyClssfctn;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber1 qty;
    @XmlElement(name = "NmnlVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 nmnlVal;
    @XmlElement(name = "CmmdtyQtyUnitOfMeasr")
    protected CompareUnitOfMeasure1 cmmdtyQtyUnitOfMeasr;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice1 unitPric;
    @XmlElement(name = "SctyQlty")
    protected CompareCollateralQualityType1 sctyQlty;
    @XmlElement(name = "SctyMtrty")
    protected CompareDate1 sctyMtrty;
    @XmlElement(name = "SctyIssrLEI")
    protected CompareLEIIdentifier1 sctyIssrLEI;
    @XmlElement(name = "SctyIssrCtryJursdctn")
    protected CompareCountryCode1 sctyIssrCtryJursdctn;
    @XmlElement(name = "SctyTp")
    protected CompareSecuritiesLendingType1 sctyTp;
    @XmlElement(name = "LnVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 lnVal;
    @XmlElement(name = "MktVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 mktVal;
    @XmlElement(name = "FxdRbtRefRate")
    protected ComparePercentageRate1 fxdRbtRefRate;
    @XmlElement(name = "FltgRbtRefRate")
    protected CompareBenchmarkCurveName1 fltgRbtRefRate;
    @XmlElement(name = "FltgRbtRateTermUnit")
    protected CompareRateBasis1 fltgRbtRateTermUnit;
    @XmlElement(name = "FltgRbtRateTermVal")
    protected CompareNumber1 fltgRbtRateTermVal;
    @XmlElement(name = "FltgRbtRatePmtFrqcyUnit")
    protected CompareRateBasis1 fltgRbtRatePmtFrqcyUnit;
    @XmlElement(name = "FltgRbtRatePmtFrqcyVal")
    protected CompareNumber1 fltgRbtRatePmtFrqcyVal;
    @XmlElement(name = "FltgRbtRateRstFrqcyUnit")
    protected CompareRateBasis1 fltgRbtRateRstFrqcyUnit;
    @XmlElement(name = "FltgRbtRateRstFrqcyVal")
    protected CompareNumber1 fltgRbtRateRstFrqcyVal;
    @XmlElement(name = "RbtRateBsisPtSprd")
    protected CompareNumber2 rbtRateBsisPtSprd;
    @XmlElement(name = "LndgFee")
    protected ComparePercentageRate1 lndgFee;
    @XmlElement(name = "ExclsvArrgmnt")
    protected CompareTrueFalseIndicator1 exclsvArrgmnt;
    @XmlElement(name = "OutsdngLn")
    protected CompareActiveOrHistoricCurrencyAndAmount1 outsdngLn;
    @XmlElement(name = "ShrtMktVal")
    protected CompareActiveOrHistoricCurrencyAndAmount1 shrtMktVal;
    @XmlElement(name = "LvlTp")
    protected CompareReportingLevelType1 lvlTp;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public LoanMatchingCriteria3 setDt(CompareDate1 value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExposureType1 }
     *     
     */
    public CompareExposureType1 getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExposureType1 }
     *     
     */
    public LoanMatchingCriteria3 setCtrctTp(CompareExposureType1 value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link CompareClearingStatus1 }
     *     
     */
    public CompareClearingStatus1 getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareClearingStatus1 }
     *     
     */
    public LoanMatchingCriteria3 setClrSts(CompareClearingStatus1 value) {
        this.clrSts = value;
        return this;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime1 }
     *     
     */
    public CompareDateTime1 getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime1 }
     *     
     */
    public LoanMatchingCriteria3 setClrDtTm(CompareDateTime1 value) {
        this.clrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLEIIdentifier1 }
     *     
     */
    public CompareLEIIdentifier1 getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLEIIdentifier1 }
     *     
     */
    public LoanMatchingCriteria3 setCCP(CompareLEIIdentifier1 value) {
        this.ccp = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMICIdentifier1 }
     *     
     */
    public CompareMICIdentifier1 getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMICIdentifier1 }
     *     
     */
    public LoanMatchingCriteria3 setTradgVn(CompareMICIdentifier1 value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAssetType1 }
     *     
     */
    public CompareAssetType1 getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAssetType1 }
     *     
     */
    public LoanMatchingCriteria3 setMstrAgrmtTp(CompareAssetType1 value) {
        this.mstrAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the exctgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime1 }
     *     
     */
    public CompareDateTime1 getExctgDtTm() {
        return exctgDtTm;
    }

    /**
     * Sets the value of the exctgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime1 }
     *     
     */
    public LoanMatchingCriteria3 setExctgDtTm(CompareDateTime1 value) {
        this.exctgDtTm = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public LoanMatchingCriteria3 setStartDt(CompareDate1 value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public LoanMatchingCriteria3 setEndDt(CompareDate1 value) {
        this.endDt = value;
        return this;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public LoanMatchingCriteria3 setEvtDt(CompareDate1 value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setMinNtcePrd(CompareNumber1 value) {
        this.minNtcePrd = value;
        return this;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public LoanMatchingCriteria3 setEarlstCallBckDt(CompareDate1 value) {
        this.earlstCallBckDt = value;
        return this;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSpecialCollateral1 }
     *     
     */
    public CompareSpecialCollateral1 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSpecialCollateral1 }
     *     
     */
    public LoanMatchingCriteria3 setGnlColl(CompareSpecialCollateral1 value) {
        this.gnlColl = value;
        return this;
    }

    /**
     * Gets the value of the dlvryByVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CompareTrueFalseIndicator1 getDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public LoanMatchingCriteria3 setDlvryByVal(CompareTrueFalseIndicator1 value) {
        this.dlvryByVal = value;
        return this;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryMethod1 }
     *     
     */
    public CompareDeliveryMethod1 getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryMethod1 }
     *     
     */
    public LoanMatchingCriteria3 setCollDlvryMtd(CompareDeliveryMethod1 value) {
        this.collDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the opnTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CompareTrueFalseIndicator1 getOpnTerm() {
        return opnTerm;
    }

    /**
     * Sets the value of the opnTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public LoanMatchingCriteria3 setOpnTerm(CompareTrueFalseIndicator1 value) {
        this.opnTerm = value;
        return this;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTerminationOption1 }
     *     
     */
    public CompareTerminationOption1 getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTerminationOption1 }
     *     
     */
    public LoanMatchingCriteria3 setTermntnOptn(CompareTerminationOption1 value) {
        this.termntnOptn = value;
        return this;
    }

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public ComparePercentageRate1 getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public LoanMatchingCriteria3 setFxdIntrstRate(ComparePercentageRate1 value) {
        this.fxdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria3 setDayCntBsis(CompareNumber2 value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName1 }
     *     
     */
    public CompareBenchmarkCurveName1 getFltgIntrstRefRate() {
        return fltgIntrstRefRate;
    }

    /**
     * Sets the value of the fltgIntrstRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRefRate(CompareBenchmarkCurveName1 value) {
        this.fltgIntrstRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public CompareRateBasis1 getFltgIntrstRateTermUnit() {
        return fltgIntrstRateTermUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRateTermUnit(CompareRateBasis1 value) {
        this.fltgIntrstRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getFltgIntrstRateTermVal() {
        return fltgIntrstRateTermVal;
    }

    /**
     * Sets the value of the fltgIntrstRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRateTermVal(CompareNumber1 value) {
        this.fltgIntrstRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public CompareRateBasis1 getFltgIntrstRatePmtFrqcyUnit() {
        return fltgIntrstRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRatePmtFrqcyUnit(CompareRateBasis1 value) {
        this.fltgIntrstRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getFltgIntrstRatePmtFrqcyVal() {
        return fltgIntrstRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRatePmtFrqcyVal(CompareNumber1 value) {
        this.fltgIntrstRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public CompareRateBasis1 getFltgIntrstRateRstFrqcyUnit() {
        return fltgIntrstRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRateRstFrqcyUnit(CompareRateBasis1 value) {
        this.fltgIntrstRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getFltgIntrstRateRstFrqcyVal() {
        return fltgIntrstRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgIntrstRateRstFrqcyVal(CompareNumber1 value) {
        this.fltgIntrstRateRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the intrstRateBsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getIntrstRateBsisPtSprd() {
        return intrstRateBsisPtSprd;
    }

    /**
     * Sets the value of the intrstRateBsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria3 setIntrstRateBsisPtSprd(CompareNumber2 value) {
        this.intrstRateBsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getMrgnLnAmt() {
        return mrgnLnAmt;
    }

    /**
     * Sets the value of the mrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setMrgnLnAmt(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.mrgnLnAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmtStartDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getPrncplAmtStartDtAmt() {
        return prncplAmtStartDtAmt;
    }

    /**
     * Sets the value of the prncplAmtStartDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setPrncplAmtStartDtAmt(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.prncplAmtStartDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getPrncplAmtMtrtyDtAmt() {
        return prncplAmtMtrtyDtAmt;
    }

    /**
     * Sets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setPrncplAmtMtrtyDtAmt(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.prncplAmtMtrtyDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAssetType1 }
     *     
     */
    public CompareAssetType1 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAssetType1 }
     *     
     */
    public LoanMatchingCriteria3 setAsstTp(CompareAssetType1 value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier1 }
     *     
     */
    public CompareISINIdentifier1 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyId(CompareISINIdentifier1 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the sctyClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier1 }
     *     
     */
    public CompareCFIIdentifier1 getSctyClssfctn() {
        return sctyClssfctn;
    }

    /**
     * Sets the value of the sctyClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyClssfctn(CompareCFIIdentifier1 value) {
        this.sctyClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the cmmdtyClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass1 }
     *     
     */
    public CompareCommodityAssetClass1 getCmmdtyClssfctn() {
        return cmmdtyClssfctn;
    }

    /**
     * Sets the value of the cmmdtyClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass1 }
     *     
     */
    public LoanMatchingCriteria3 setCmmdtyClssfctn(CompareCommodityAssetClass1 value) {
        this.cmmdtyClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber1 }
     *     
     */
    public CompareDecimalNumber1 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setQty(CompareDecimalNumber1 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the nmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Sets the value of the nmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setNmnlVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.nmnlVal = value;
        return this;
    }

    /**
     * Gets the value of the cmmdtyQtyUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure1 }
     *     
     */
    public CompareUnitOfMeasure1 getCmmdtyQtyUnitOfMeasr() {
        return cmmdtyQtyUnitOfMeasr;
    }

    /**
     * Sets the value of the cmmdtyQtyUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure1 }
     *     
     */
    public LoanMatchingCriteria3 setCmmdtyQtyUnitOfMeasr(CompareUnitOfMeasure1 value) {
        this.cmmdtyQtyUnitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice1 }
     *     
     */
    public CompareUnitPrice1 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice1 }
     *     
     */
    public LoanMatchingCriteria3 setUnitPric(CompareUnitPrice1 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the sctyQlty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCollateralQualityType1 }
     *     
     */
    public CompareCollateralQualityType1 getSctyQlty() {
        return sctyQlty;
    }

    /**
     * Sets the value of the sctyQlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCollateralQualityType1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyQlty(CompareCollateralQualityType1 value) {
        this.sctyQlty = value;
        return this;
    }

    /**
     * Gets the value of the sctyMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate1 }
     *     
     */
    public CompareDate1 getSctyMtrty() {
        return sctyMtrty;
    }

    /**
     * Sets the value of the sctyMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyMtrty(CompareDate1 value) {
        this.sctyMtrty = value;
        return this;
    }

    /**
     * Gets the value of the sctyIssrLEI property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLEIIdentifier1 }
     *     
     */
    public CompareLEIIdentifier1 getSctyIssrLEI() {
        return sctyIssrLEI;
    }

    /**
     * Sets the value of the sctyIssrLEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLEIIdentifier1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyIssrLEI(CompareLEIIdentifier1 value) {
        this.sctyIssrLEI = value;
        return this;
    }

    /**
     * Gets the value of the sctyIssrCtryJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCountryCode1 }
     *     
     */
    public CompareCountryCode1 getSctyIssrCtryJursdctn() {
        return sctyIssrCtryJursdctn;
    }

    /**
     * Sets the value of the sctyIssrCtryJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCountryCode1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyIssrCtryJursdctn(CompareCountryCode1 value) {
        this.sctyIssrCtryJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSecuritiesLendingType1 }
     *     
     */
    public CompareSecuritiesLendingType1 getSctyTp() {
        return sctyTp;
    }

    /**
     * Sets the value of the sctyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSecuritiesLendingType1 }
     *     
     */
    public LoanMatchingCriteria3 setSctyTp(CompareSecuritiesLendingType1 value) {
        this.sctyTp = value;
        return this;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setLnVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.lnVal = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setMktVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the fxdRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public ComparePercentageRate1 getFxdRbtRefRate() {
        return fxdRbtRefRate;
    }

    /**
     * Sets the value of the fxdRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public LoanMatchingCriteria3 setFxdRbtRefRate(ComparePercentageRate1 value) {
        this.fxdRbtRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName1 }
     *     
     */
    public CompareBenchmarkCurveName1 getFltgRbtRefRate() {
        return fltgRbtRefRate;
    }

    /**
     * Sets the value of the fltgRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRefRate(CompareBenchmarkCurveName1 value) {
        this.fltgRbtRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public CompareRateBasis1 getFltgRbtRateTermUnit() {
        return fltgRbtRateTermUnit;
    }

    /**
     * Sets the value of the fltgRbtRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRateTermUnit(CompareRateBasis1 value) {
        this.fltgRbtRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getFltgRbtRateTermVal() {
        return fltgRbtRateTermVal;
    }

    /**
     * Sets the value of the fltgRbtRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRateTermVal(CompareNumber1 value) {
        this.fltgRbtRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public CompareRateBasis1 getFltgRbtRatePmtFrqcyUnit() {
        return fltgRbtRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRatePmtFrqcyUnit(CompareRateBasis1 value) {
        this.fltgRbtRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getFltgRbtRatePmtFrqcyVal() {
        return fltgRbtRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRatePmtFrqcyVal(CompareNumber1 value) {
        this.fltgRbtRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public CompareRateBasis1 getFltgRbtRateRstFrqcyUnit() {
        return fltgRbtRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRateRstFrqcyUnit(CompareRateBasis1 value) {
        this.fltgRbtRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber1 }
     *     
     */
    public CompareNumber1 getFltgRbtRateRstFrqcyVal() {
        return fltgRbtRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber1 }
     *     
     */
    public LoanMatchingCriteria3 setFltgRbtRateRstFrqcyVal(CompareNumber1 value) {
        this.fltgRbtRateRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the rbtRateBsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getRbtRateBsisPtSprd() {
        return rbtRateBsisPtSprd;
    }

    /**
     * Sets the value of the rbtRateBsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria3 setRbtRateBsisPtSprd(CompareNumber2 value) {
        this.rbtRateBsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public ComparePercentageRate1 getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate1 }
     *     
     */
    public LoanMatchingCriteria3 setLndgFee(ComparePercentageRate1 value) {
        this.lndgFee = value;
        return this;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public CompareTrueFalseIndicator1 getExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator1 }
     *     
     */
    public LoanMatchingCriteria3 setExclsvArrgmnt(CompareTrueFalseIndicator1 value) {
        this.exclsvArrgmnt = value;
        return this;
    }

    /**
     * Gets the value of the outsdngLn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getOutsdngLn() {
        return outsdngLn;
    }

    /**
     * Sets the value of the outsdngLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setOutsdngLn(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.outsdngLn = value;
        return this;
    }

    /**
     * Gets the value of the shrtMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount1 getShrtMktVal() {
        return shrtMktVal;
    }

    /**
     * Sets the value of the shrtMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount1 }
     *     
     */
    public LoanMatchingCriteria3 setShrtMktVal(CompareActiveOrHistoricCurrencyAndAmount1 value) {
        this.shrtMktVal = value;
        return this;
    }

    /**
     * Gets the value of the lvlTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReportingLevelType1 }
     *     
     */
    public CompareReportingLevelType1 getLvlTp() {
        return lvlTp;
    }

    /**
     * Sets the value of the lvlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReportingLevelType1 }
     *     
     */
    public LoanMatchingCriteria3 setLvlTp(CompareReportingLevelType1 value) {
        this.lvlTp = value;
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
