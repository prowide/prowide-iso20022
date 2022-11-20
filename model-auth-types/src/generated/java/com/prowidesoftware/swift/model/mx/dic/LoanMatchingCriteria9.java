
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
 * Compares information related to both sides of a loan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanMatchingCriteria9", propOrder = {
    "unqTradIdr",
    "termntnDt",
    "ctrctTp",
    "clrSts",
    "clrDtTm",
    "ccp",
    "tradgVn",
    "mstrAgrmtTp",
    "exctnDtTm",
    "valDt",
    "mtrtyDt",
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
    "bsisPtSprd",
    "mrgnLnAttr",
    "prncplAmtValDtAmt",
    "prncplAmtMtrtyDtAmt",
    "asstTp",
    "lnVal",
    "fxdRbtRefRate",
    "fltgRbtRefRate",
    "fltgRbtRateTermUnit",
    "fltgRbtRateTermVal",
    "fltgRbtRatePmtFrqcyUnit",
    "fltgRbtRatePmtFrqcyVal",
    "fltgRbtRateRstFrqcyUnit",
    "fltgRbtRateRstFrqcyVal",
    "rbtRateBsisPtSprd",
    "fltgRateAdjstmnt",
    "fltgRateAdjstmntDt",
    "lndgFee",
    "outsdngMrgnLnAmt",
    "shrtMktValAmt",
    "lvlTp",
    "unitOfMeasr"
})
public class LoanMatchingCriteria9 {

    @XmlElement(name = "UnqTradIdr")
    protected CompareText2 unqTradIdr;
    @XmlElement(name = "TermntnDt")
    protected CompareDate3 termntnDt;
    @XmlElement(name = "CtrctTp")
    protected CompareExposureType3 ctrctTp;
    @XmlElement(name = "ClrSts")
    protected CompareClearingStatus3 clrSts;
    @XmlElement(name = "ClrDtTm")
    protected CompareDateTime3 clrDtTm;
    @XmlElement(name = "CCP")
    protected CompareOrganisationIdentification6 ccp;
    @XmlElement(name = "TradgVn")
    protected CompareMICIdentifier3 tradgVn;
    @XmlElement(name = "MstrAgrmtTp")
    protected CompareAgreementType2 mstrAgrmtTp;
    @XmlElement(name = "ExctnDtTm")
    protected CompareDateTime3 exctnDtTm;
    @XmlElement(name = "ValDt")
    protected CompareDate3 valDt;
    @XmlElement(name = "MtrtyDt")
    protected CompareDate3 mtrtyDt;
    @XmlElement(name = "MinNtcePrd")
    protected CompareNumber5 minNtcePrd;
    @XmlElement(name = "EarlstCallBckDt")
    protected CompareDate3 earlstCallBckDt;
    @XmlElement(name = "GnlColl")
    protected CompareSpecialCollateral3 gnlColl;
    @XmlElement(name = "DlvryByVal")
    protected CompareTrueFalseIndicator3 dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    protected CompareDeliveryMethod3 collDlvryMtd;
    @XmlElement(name = "OpnTerm")
    protected CompareTrueFalseIndicator3 opnTerm;
    @XmlElement(name = "TermntnOptn")
    protected CompareTerminationOption3 termntnOptn;
    @XmlElement(name = "FxdIntrstRate")
    protected ComparePercentageRate3 fxdIntrstRate;
    @XmlElement(name = "DayCntBsis")
    protected CompareInterestComputationMethod3 dayCntBsis;
    @XmlElement(name = "FltgIntrstRefRate")
    protected CompareBenchmarkCurveName3 fltgIntrstRefRate;
    @XmlElement(name = "FltgIntrstRateTermUnit")
    protected CompareRateBasis3 fltgIntrstRateTermUnit;
    @XmlElement(name = "FltgIntrstRateTermVal")
    protected CompareNumber5 fltgIntrstRateTermVal;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRatePmtFrqcyUnit;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyVal")
    protected CompareNumber5 fltgIntrstRatePmtFrqcyVal;
    @XmlElement(name = "FltgIntrstRateRstFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRateRstFrqcyUnit;
    @XmlElement(name = "FltgIntrstRateRstFrqcyVal")
    protected CompareNumber6 fltgIntrstRateRstFrqcyVal;
    @XmlElement(name = "BsisPtSprd")
    protected CompareDecimalNumber3 bsisPtSprd;
    @XmlElement(name = "MrgnLnAttr")
    protected List<CompareInterestRate1> mrgnLnAttr;
    @XmlElement(name = "PrncplAmtValDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 prncplAmtValDtAmt;
    @XmlElement(name = "PrncplAmtMtrtyDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 prncplAmtMtrtyDtAmt;
    @XmlElement(name = "AsstTp")
    protected SecurityCommodity7Choice asstTp;
    @XmlElement(name = "LnVal")
    protected CompareActiveOrHistoricCurrencyAndAmount3 lnVal;
    @XmlElement(name = "FxdRbtRefRate")
    protected ComparePercentageRate3 fxdRbtRefRate;
    @XmlElement(name = "FltgRbtRefRate")
    protected CompareBenchmarkCurveName3 fltgRbtRefRate;
    @XmlElement(name = "FltgRbtRateTermUnit")
    protected CompareRateBasis3 fltgRbtRateTermUnit;
    @XmlElement(name = "FltgRbtRateTermVal")
    protected CompareNumber6 fltgRbtRateTermVal;
    @XmlElement(name = "FltgRbtRatePmtFrqcyUnit")
    protected CompareRateBasis3 fltgRbtRatePmtFrqcyUnit;
    @XmlElement(name = "FltgRbtRatePmtFrqcyVal")
    protected CompareNumber6 fltgRbtRatePmtFrqcyVal;
    @XmlElement(name = "FltgRbtRateRstFrqcyUnit")
    protected CompareRateBasis3 fltgRbtRateRstFrqcyUnit;
    @XmlElement(name = "FltgRbtRateRstFrqcyVal")
    protected CompareNumber6 fltgRbtRateRstFrqcyVal;
    @XmlElement(name = "RbtRateBsisPtSprd")
    protected CompareDecimalNumber3 rbtRateBsisPtSprd;
    @XmlElement(name = "FltgRateAdjstmnt")
    protected List<ComparePercentageRate3> fltgRateAdjstmnt;
    @XmlElement(name = "FltgRateAdjstmntDt")
    protected List<CompareDate3> fltgRateAdjstmntDt;
    @XmlElement(name = "LndgFee")
    protected ComparePercentageRate3 lndgFee;
    @XmlElement(name = "OutsdngMrgnLnAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 outsdngMrgnLnAmt;
    @XmlElement(name = "ShrtMktValAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 shrtMktValAmt;
    @XmlElement(name = "LvlTp")
    protected CompareReportingLevelType3 lvlTp;
    @XmlElement(name = "UnitOfMeasr")
    protected CompareUnitOfMeasure3 unitOfMeasr;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText2 }
     *     
     */
    public CompareText2 getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText2 }
     *     
     */
    public LoanMatchingCriteria9 setUnqTradIdr(CompareText2 value) {
        this.unqTradIdr = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public LoanMatchingCriteria9 setTermntnDt(CompareDate3 value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExposureType3 }
     *     
     */
    public CompareExposureType3 getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExposureType3 }
     *     
     */
    public LoanMatchingCriteria9 setCtrctTp(CompareExposureType3 value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link CompareClearingStatus3 }
     *     
     */
    public CompareClearingStatus3 getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareClearingStatus3 }
     *     
     */
    public LoanMatchingCriteria9 setClrSts(CompareClearingStatus3 value) {
        this.clrSts = value;
        return this;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime3 }
     *     
     */
    public CompareDateTime3 getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime3 }
     *     
     */
    public LoanMatchingCriteria9 setClrDtTm(CompareDateTime3 value) {
        this.clrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CompareOrganisationIdentification6 getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public LoanMatchingCriteria9 setCCP(CompareOrganisationIdentification6 value) {
        this.ccp = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public CompareMICIdentifier3 getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public LoanMatchingCriteria9 setTradgVn(CompareMICIdentifier3 value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAgreementType2 }
     *     
     */
    public CompareAgreementType2 getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAgreementType2 }
     *     
     */
    public LoanMatchingCriteria9 setMstrAgrmtTp(CompareAgreementType2 value) {
        this.mstrAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime3 }
     *     
     */
    public CompareDateTime3 getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime3 }
     *     
     */
    public LoanMatchingCriteria9 setExctnDtTm(CompareDateTime3 value) {
        this.exctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public LoanMatchingCriteria9 setValDt(CompareDate3 value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public LoanMatchingCriteria9 setMtrtyDt(CompareDate3 value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public LoanMatchingCriteria9 setMinNtcePrd(CompareNumber5 value) {
        this.minNtcePrd = value;
        return this;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public LoanMatchingCriteria9 setEarlstCallBckDt(CompareDate3 value) {
        this.earlstCallBckDt = value;
        return this;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSpecialCollateral3 }
     *     
     */
    public CompareSpecialCollateral3 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSpecialCollateral3 }
     *     
     */
    public LoanMatchingCriteria9 setGnlColl(CompareSpecialCollateral3 value) {
        this.gnlColl = value;
        return this;
    }

    /**
     * Gets the value of the dlvryByVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public LoanMatchingCriteria9 setDlvryByVal(CompareTrueFalseIndicator3 value) {
        this.dlvryByVal = value;
        return this;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryMethod3 }
     *     
     */
    public CompareDeliveryMethod3 getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryMethod3 }
     *     
     */
    public LoanMatchingCriteria9 setCollDlvryMtd(CompareDeliveryMethod3 value) {
        this.collDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the opnTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getOpnTerm() {
        return opnTerm;
    }

    /**
     * Sets the value of the opnTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public LoanMatchingCriteria9 setOpnTerm(CompareTrueFalseIndicator3 value) {
        this.opnTerm = value;
        return this;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTerminationOption3 }
     *     
     */
    public CompareTerminationOption3 getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTerminationOption3 }
     *     
     */
    public LoanMatchingCriteria9 setTermntnOptn(CompareTerminationOption3 value) {
        this.termntnOptn = value;
        return this;
    }

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public LoanMatchingCriteria9 setFxdIntrstRate(ComparePercentageRate3 value) {
        this.fxdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public CompareInterestComputationMethod3 getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public LoanMatchingCriteria9 setDayCntBsis(CompareInterestComputationMethod3 value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareBenchmarkCurveName3 getFltgIntrstRefRate() {
        return fltgIntrstRefRate;
    }

    /**
     * Sets the value of the fltgIntrstRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRefRate(CompareBenchmarkCurveName3 value) {
        this.fltgIntrstRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateTermUnit() {
        return fltgIntrstRateTermUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRateTermUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRateTermVal() {
        return fltgIntrstRateTermVal;
    }

    /**
     * Sets the value of the fltgIntrstRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRateTermVal(CompareNumber5 value) {
        this.fltgIntrstRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRatePmtFrqcyUnit() {
        return fltgIntrstRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRatePmtFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRatePmtFrqcyVal() {
        return fltgIntrstRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRatePmtFrqcyVal(CompareNumber5 value) {
        this.fltgIntrstRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateRstFrqcyUnit() {
        return fltgIntrstRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRateRstFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgIntrstRateRstFrqcyVal() {
        return fltgIntrstRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public LoanMatchingCriteria9 setFltgIntrstRateRstFrqcyVal(CompareNumber6 value) {
        this.fltgIntrstRateRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public LoanMatchingCriteria9 setBsisPtSprd(CompareDecimalNumber3 value) {
        this.bsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLnAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrgnLnAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnLnAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareInterestRate1 }
     * 
     * 
     */
    public List<CompareInterestRate1> getMrgnLnAttr() {
        if (mrgnLnAttr == null) {
            mrgnLnAttr = new ArrayList<CompareInterestRate1>();
        }
        return this.mrgnLnAttr;
    }

    /**
     * Gets the value of the prncplAmtValDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getPrncplAmtValDtAmt() {
        return prncplAmtValDtAmt;
    }

    /**
     * Sets the value of the prncplAmtValDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public LoanMatchingCriteria9 setPrncplAmtValDtAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.prncplAmtValDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getPrncplAmtMtrtyDtAmt() {
        return prncplAmtMtrtyDtAmt;
    }

    /**
     * Sets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public LoanMatchingCriteria9 setPrncplAmtMtrtyDtAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.prncplAmtMtrtyDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodity7Choice }
     *     
     */
    public SecurityCommodity7Choice getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodity7Choice }
     *     
     */
    public LoanMatchingCriteria9 setAsstTp(SecurityCommodity7Choice value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public LoanMatchingCriteria9 setLnVal(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.lnVal = value;
        return this;
    }

    /**
     * Gets the value of the fxdRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getFxdRbtRefRate() {
        return fxdRbtRefRate;
    }

    /**
     * Sets the value of the fxdRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public LoanMatchingCriteria9 setFxdRbtRefRate(ComparePercentageRate3 value) {
        this.fxdRbtRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareBenchmarkCurveName3 getFltgRbtRefRate() {
        return fltgRbtRefRate;
    }

    /**
     * Sets the value of the fltgRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRefRate(CompareBenchmarkCurveName3 value) {
        this.fltgRbtRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgRbtRateTermUnit() {
        return fltgRbtRateTermUnit;
    }

    /**
     * Sets the value of the fltgRbtRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRateTermUnit(CompareRateBasis3 value) {
        this.fltgRbtRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgRbtRateTermVal() {
        return fltgRbtRateTermVal;
    }

    /**
     * Sets the value of the fltgRbtRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRateTermVal(CompareNumber6 value) {
        this.fltgRbtRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgRbtRatePmtFrqcyUnit() {
        return fltgRbtRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRatePmtFrqcyUnit(CompareRateBasis3 value) {
        this.fltgRbtRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgRbtRatePmtFrqcyVal() {
        return fltgRbtRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRatePmtFrqcyVal(CompareNumber6 value) {
        this.fltgRbtRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgRbtRateRstFrqcyUnit() {
        return fltgRbtRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRateRstFrqcyUnit(CompareRateBasis3 value) {
        this.fltgRbtRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgRbtRateRstFrqcyVal() {
        return fltgRbtRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public LoanMatchingCriteria9 setFltgRbtRateRstFrqcyVal(CompareNumber6 value) {
        this.fltgRbtRateRstFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the rbtRateBsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getRbtRateBsisPtSprd() {
        return rbtRateBsisPtSprd;
    }

    /**
     * Sets the value of the rbtRateBsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public LoanMatchingCriteria9 setRbtRateBsisPtSprd(CompareDecimalNumber3 value) {
        this.rbtRateBsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the fltgRateAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fltgRateAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFltgRateAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparePercentageRate3 }
     * 
     * 
     */
    public List<ComparePercentageRate3> getFltgRateAdjstmnt() {
        if (fltgRateAdjstmnt == null) {
            fltgRateAdjstmnt = new ArrayList<ComparePercentageRate3>();
        }
        return this.fltgRateAdjstmnt;
    }

    /**
     * Gets the value of the fltgRateAdjstmntDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fltgRateAdjstmntDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFltgRateAdjstmntDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     */
    public List<CompareDate3> getFltgRateAdjstmntDt() {
        if (fltgRateAdjstmntDt == null) {
            fltgRateAdjstmntDt = new ArrayList<CompareDate3>();
        }
        return this.fltgRateAdjstmntDt;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public LoanMatchingCriteria9 setLndgFee(ComparePercentageRate3 value) {
        this.lndgFee = value;
        return this;
    }

    /**
     * Gets the value of the outsdngMrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getOutsdngMrgnLnAmt() {
        return outsdngMrgnLnAmt;
    }

    /**
     * Sets the value of the outsdngMrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public LoanMatchingCriteria9 setOutsdngMrgnLnAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.outsdngMrgnLnAmt = value;
        return this;
    }

    /**
     * Gets the value of the shrtMktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getShrtMktValAmt() {
        return shrtMktValAmt;
    }

    /**
     * Sets the value of the shrtMktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public LoanMatchingCriteria9 setShrtMktValAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.shrtMktValAmt = value;
        return this;
    }

    /**
     * Gets the value of the lvlTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReportingLevelType3 }
     *     
     */
    public CompareReportingLevelType3 getLvlTp() {
        return lvlTp;
    }

    /**
     * Sets the value of the lvlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReportingLevelType3 }
     *     
     */
    public LoanMatchingCriteria9 setLvlTp(CompareReportingLevelType3 value) {
        this.lvlTp = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public CompareUnitOfMeasure3 getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public LoanMatchingCriteria9 setUnitOfMeasr(CompareUnitOfMeasure3 value) {
        this.unitOfMeasr = value;
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
     * Adds a new item to the mrgnLnAttr list.
     * @see #getMrgnLnAttr()
     * 
     */
    public LoanMatchingCriteria9 addMrgnLnAttr(CompareInterestRate1 mrgnLnAttr) {
        getMrgnLnAttr().add(mrgnLnAttr);
        return this;
    }

    /**
     * Adds a new item to the fltgRateAdjstmnt list.
     * @see #getFltgRateAdjstmnt()
     * 
     */
    public LoanMatchingCriteria9 addFltgRateAdjstmnt(ComparePercentageRate3 fltgRateAdjstmnt) {
        getFltgRateAdjstmnt().add(fltgRateAdjstmnt);
        return this;
    }

    /**
     * Adds a new item to the fltgRateAdjstmntDt list.
     * @see #getFltgRateAdjstmntDt()
     * 
     */
    public LoanMatchingCriteria9 addFltgRateAdjstmntDt(CompareDate3 fltgRateAdjstmntDt) {
        getFltgRateAdjstmntDt().add(fltgRateAdjstmntDt);
        return this;
    }

}
