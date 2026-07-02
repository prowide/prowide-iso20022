
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
@XmlType(name = "LoanMatchingCriteria6", propOrder = {
    "unqTradIdr",
    "termntnDt",
    "ctrctTp",
    "clrSts",
    "clrDtTm",
    "ccp",
    "tradgVn",
    "mstrAgrmtTp",
    "exctgDtTm",
    "startDt",
    "endDt",
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
    "adjstdRate",
    "adjstmntRateDt",
    "lndgFee",
    "outsdngLn",
    "shrtMktVal",
    "lvlTp",
    "unitOfMeasr"
})
public class LoanMatchingCriteria6 {

    @XmlElement(name = "UnqTradIdr")
    protected CompareText1 unqTradIdr;
    @XmlElement(name = "TermntnDt")
    protected CompareDate2 termntnDt;
    @XmlElement(name = "CtrctTp")
    protected CompareExposureType2 ctrctTp;
    @XmlElement(name = "ClrSts")
    protected CompareClearingStatus2 clrSts;
    @XmlElement(name = "ClrDtTm")
    protected CompareDateTime2 clrDtTm;
    @XmlElement(name = "CCP")
    protected CompareOrganisationIdentification1 ccp;
    @XmlElement(name = "TradgVn")
    protected CompareMICIdentifier2 tradgVn;
    @XmlElement(name = "MstrAgrmtTp")
    protected CompareAgreementType1 mstrAgrmtTp;
    @XmlElement(name = "ExctgDtTm")
    protected CompareDateTime2 exctgDtTm;
    @XmlElement(name = "StartDt")
    protected CompareDate2 startDt;
    @XmlElement(name = "EndDt")
    protected CompareDate2 endDt;
    @XmlElement(name = "MinNtcePrd")
    protected CompareNumber3 minNtcePrd;
    @XmlElement(name = "EarlstCallBckDt")
    protected CompareDate2 earlstCallBckDt;
    @XmlElement(name = "GnlColl")
    protected CompareSpecialCollateral2 gnlColl;
    @XmlElement(name = "DlvryByVal")
    protected CompareTrueFalseIndicator2 dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    protected CompareDeliveryMethod2 collDlvryMtd;
    @XmlElement(name = "OpnTerm")
    protected CompareTrueFalseIndicator2 opnTerm;
    @XmlElement(name = "TermntnOptn")
    protected CompareTerminationOption2 termntnOptn;
    @XmlElement(name = "FxdIntrstRate")
    protected ComparePercentageRate2 fxdIntrstRate;
    @XmlElement(name = "DayCntBsis")
    protected CompareInterestComputationMethod2 dayCntBsis;
    @XmlElement(name = "FltgIntrstRefRate")
    protected CompareBenchmarkCurveName2 fltgIntrstRefRate;
    @XmlElement(name = "FltgIntrstRateTermUnit")
    protected CompareRateBasis2 fltgIntrstRateTermUnit;
    @XmlElement(name = "FltgIntrstRateTermVal")
    protected CompareNumber3 fltgIntrstRateTermVal;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyUnit")
    protected CompareRateBasis2 fltgIntrstRatePmtFrqcyUnit;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyVal")
    protected CompareNumber3 fltgIntrstRatePmtFrqcyVal;
    @XmlElement(name = "FltgIntrstRateRstFrqcyUnit")
    protected CompareRateBasis2 fltgIntrstRateRstFrqcyUnit;
    @XmlElement(name = "FltgIntrstRateRstFrqcyVal")
    protected CompareNumber2 fltgIntrstRateRstFrqcyVal;
    @XmlElement(name = "IntrstRateBsisPtSprd")
    protected CompareNumber2 intrstRateBsisPtSprd;
    @XmlElement(name = "MrgnLnAmt")
    protected CompareAmountAndDirection1 mrgnLnAmt;
    @XmlElement(name = "PrncplAmtStartDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount2 prncplAmtStartDtAmt;
    @XmlElement(name = "PrncplAmtMtrtyDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount2 prncplAmtMtrtyDtAmt;
    @XmlElement(name = "AsstTp")
    protected SecurityCommodity4 asstTp;
    @XmlElement(name = "LnVal")
    protected CompareActiveOrHistoricCurrencyAndAmount2 lnVal;
    @XmlElement(name = "FxdRbtRefRate")
    protected ComparePercentageRate2 fxdRbtRefRate;
    @XmlElement(name = "FltgRbtRefRate")
    protected CompareBenchmarkCurveName2 fltgRbtRefRate;
    @XmlElement(name = "FltgRbtRateTermUnit")
    protected CompareRateBasis2 fltgRbtRateTermUnit;
    @XmlElement(name = "FltgRbtRateTermVal")
    protected CompareNumber2 fltgRbtRateTermVal;
    @XmlElement(name = "FltgRbtRatePmtFrqcyUnit")
    protected CompareRateBasis2 fltgRbtRatePmtFrqcyUnit;
    @XmlElement(name = "FltgRbtRatePmtFrqcyVal")
    protected CompareNumber2 fltgRbtRatePmtFrqcyVal;
    @XmlElement(name = "FltgRbtRateRstFrqcyUnit")
    protected CompareRateBasis2 fltgRbtRateRstFrqcyUnit;
    @XmlElement(name = "FltgRbtRateRstFrqcyVal")
    protected CompareNumber2 fltgRbtRateRstFrqcyVal;
    @XmlElement(name = "RbtRateBsisPtSprd")
    protected CompareNumber2 rbtRateBsisPtSprd;
    @XmlElement(name = "AdjstdRate")
    protected ComparePercentageRate2 adjstdRate;
    @XmlElement(name = "AdjstmntRateDt")
    protected CompareDate2 adjstmntRateDt;
    @XmlElement(name = "LndgFee")
    protected ComparePercentageRate2 lndgFee;
    @XmlElement(name = "OutsdngLn")
    protected CompareActiveOrHistoricCurrencyAndAmount2 outsdngLn;
    @XmlElement(name = "ShrtMktVal")
    protected CompareActiveOrHistoricCurrencyAndAmount2 shrtMktVal;
    @XmlElement(name = "LvlTp")
    protected CompareReportingLevelType2 lvlTp;
    @XmlElement(name = "UnitOfMeasr")
    protected CompareUnitOfMeasure2 unitOfMeasr;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText1 }
     *     
     */
    public CompareText1 getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText1 }
     *     
     */
    public LoanMatchingCriteria6 setUnqTradIdr(CompareText1 value) {
        this.unqTradIdr = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public LoanMatchingCriteria6 setTermntnDt(CompareDate2 value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExposureType2 }
     *     
     */
    public CompareExposureType2 getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExposureType2 }
     *     
     */
    public LoanMatchingCriteria6 setCtrctTp(CompareExposureType2 value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link CompareClearingStatus2 }
     *     
     */
    public CompareClearingStatus2 getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareClearingStatus2 }
     *     
     */
    public LoanMatchingCriteria6 setClrSts(CompareClearingStatus2 value) {
        this.clrSts = value;
        return this;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime2 }
     *     
     */
    public CompareDateTime2 getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime2 }
     *     
     */
    public LoanMatchingCriteria6 setClrDtTm(CompareDateTime2 value) {
        this.clrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public CompareOrganisationIdentification1 getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification1 }
     *     
     */
    public LoanMatchingCriteria6 setCCP(CompareOrganisationIdentification1 value) {
        this.ccp = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMICIdentifier2 }
     *     
     */
    public CompareMICIdentifier2 getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMICIdentifier2 }
     *     
     */
    public LoanMatchingCriteria6 setTradgVn(CompareMICIdentifier2 value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAgreementType1 }
     *     
     */
    public CompareAgreementType1 getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAgreementType1 }
     *     
     */
    public LoanMatchingCriteria6 setMstrAgrmtTp(CompareAgreementType1 value) {
        this.mstrAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the exctgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime2 }
     *     
     */
    public CompareDateTime2 getExctgDtTm() {
        return exctgDtTm;
    }

    /**
     * Sets the value of the exctgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime2 }
     *     
     */
    public LoanMatchingCriteria6 setExctgDtTm(CompareDateTime2 value) {
        this.exctgDtTm = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public LoanMatchingCriteria6 setStartDt(CompareDate2 value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public LoanMatchingCriteria6 setEndDt(CompareDate2 value) {
        this.endDt = value;
        return this;
    }

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber3 }
     *     
     */
    public CompareNumber3 getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber3 }
     *     
     */
    public LoanMatchingCriteria6 setMinNtcePrd(CompareNumber3 value) {
        this.minNtcePrd = value;
        return this;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public LoanMatchingCriteria6 setEarlstCallBckDt(CompareDate2 value) {
        this.earlstCallBckDt = value;
        return this;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSpecialCollateral2 }
     *     
     */
    public CompareSpecialCollateral2 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSpecialCollateral2 }
     *     
     */
    public LoanMatchingCriteria6 setGnlColl(CompareSpecialCollateral2 value) {
        this.gnlColl = value;
        return this;
    }

    /**
     * Gets the value of the dlvryByVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CompareTrueFalseIndicator2 getDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public LoanMatchingCriteria6 setDlvryByVal(CompareTrueFalseIndicator2 value) {
        this.dlvryByVal = value;
        return this;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryMethod2 }
     *     
     */
    public CompareDeliveryMethod2 getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryMethod2 }
     *     
     */
    public LoanMatchingCriteria6 setCollDlvryMtd(CompareDeliveryMethod2 value) {
        this.collDlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the opnTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CompareTrueFalseIndicator2 getOpnTerm() {
        return opnTerm;
    }

    /**
     * Sets the value of the opnTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public LoanMatchingCriteria6 setOpnTerm(CompareTrueFalseIndicator2 value) {
        this.opnTerm = value;
        return this;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTerminationOption2 }
     *     
     */
    public CompareTerminationOption2 getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTerminationOption2 }
     *     
     */
    public LoanMatchingCriteria6 setTermntnOptn(CompareTerminationOption2 value) {
        this.termntnOptn = value;
        return this;
    }

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public ComparePercentageRate2 getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public LoanMatchingCriteria6 setFxdIntrstRate(ComparePercentageRate2 value) {
        this.fxdIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareInterestComputationMethod2 }
     *     
     */
    public CompareInterestComputationMethod2 getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareInterestComputationMethod2 }
     *     
     */
    public LoanMatchingCriteria6 setDayCntBsis(CompareInterestComputationMethod2 value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName2 }
     *     
     */
    public CompareBenchmarkCurveName2 getFltgIntrstRefRate() {
        return fltgIntrstRefRate;
    }

    /**
     * Sets the value of the fltgIntrstRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRefRate(CompareBenchmarkCurveName2 value) {
        this.fltgIntrstRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public CompareRateBasis2 getFltgIntrstRateTermUnit() {
        return fltgIntrstRateTermUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRateTermUnit(CompareRateBasis2 value) {
        this.fltgIntrstRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber3 }
     *     
     */
    public CompareNumber3 getFltgIntrstRateTermVal() {
        return fltgIntrstRateTermVal;
    }

    /**
     * Sets the value of the fltgIntrstRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber3 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRateTermVal(CompareNumber3 value) {
        this.fltgIntrstRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public CompareRateBasis2 getFltgIntrstRatePmtFrqcyUnit() {
        return fltgIntrstRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRatePmtFrqcyUnit(CompareRateBasis2 value) {
        this.fltgIntrstRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber3 }
     *     
     */
    public CompareNumber3 getFltgIntrstRatePmtFrqcyVal() {
        return fltgIntrstRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber3 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRatePmtFrqcyVal(CompareNumber3 value) {
        this.fltgIntrstRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public CompareRateBasis2 getFltgIntrstRateRstFrqcyUnit() {
        return fltgIntrstRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRateRstFrqcyUnit(CompareRateBasis2 value) {
        this.fltgIntrstRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getFltgIntrstRateRstFrqcyVal() {
        return fltgIntrstRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgIntrstRateRstFrqcyVal(CompareNumber2 value) {
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
    public LoanMatchingCriteria6 setIntrstRateBsisPtSprd(CompareNumber2 value) {
        this.intrstRateBsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public CompareAmountAndDirection1 getMrgnLnAmt() {
        return mrgnLnAmt;
    }

    /**
     * Sets the value of the mrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection1 }
     *     
     */
    public LoanMatchingCriteria6 setMrgnLnAmt(CompareAmountAndDirection1 value) {
        this.mrgnLnAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmtStartDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getPrncplAmtStartDtAmt() {
        return prncplAmtStartDtAmt;
    }

    /**
     * Sets the value of the prncplAmtStartDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public LoanMatchingCriteria6 setPrncplAmtStartDtAmt(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.prncplAmtStartDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getPrncplAmtMtrtyDtAmt() {
        return prncplAmtMtrtyDtAmt;
    }

    /**
     * Sets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public LoanMatchingCriteria6 setPrncplAmtMtrtyDtAmt(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.prncplAmtMtrtyDtAmt = value;
        return this;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodity4 }
     *     
     */
    public SecurityCommodity4 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodity4 }
     *     
     */
    public LoanMatchingCriteria6 setAsstTp(SecurityCommodity4 value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public LoanMatchingCriteria6 setLnVal(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.lnVal = value;
        return this;
    }

    /**
     * Gets the value of the fxdRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public ComparePercentageRate2 getFxdRbtRefRate() {
        return fxdRbtRefRate;
    }

    /**
     * Sets the value of the fxdRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public LoanMatchingCriteria6 setFxdRbtRefRate(ComparePercentageRate2 value) {
        this.fxdRbtRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName2 }
     *     
     */
    public CompareBenchmarkCurveName2 getFltgRbtRefRate() {
        return fltgRbtRefRate;
    }

    /**
     * Sets the value of the fltgRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRefRate(CompareBenchmarkCurveName2 value) {
        this.fltgRbtRefRate = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public CompareRateBasis2 getFltgRbtRateTermUnit() {
        return fltgRbtRateTermUnit;
    }

    /**
     * Sets the value of the fltgRbtRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRateTermUnit(CompareRateBasis2 value) {
        this.fltgRbtRateTermUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getFltgRbtRateTermVal() {
        return fltgRbtRateTermVal;
    }

    /**
     * Sets the value of the fltgRbtRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRateTermVal(CompareNumber2 value) {
        this.fltgRbtRateTermVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public CompareRateBasis2 getFltgRbtRatePmtFrqcyUnit() {
        return fltgRbtRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRatePmtFrqcyUnit(CompareRateBasis2 value) {
        this.fltgRbtRatePmtFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getFltgRbtRatePmtFrqcyVal() {
        return fltgRbtRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRatePmtFrqcyVal(CompareNumber2 value) {
        this.fltgRbtRatePmtFrqcyVal = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public CompareRateBasis2 getFltgRbtRateRstFrqcyUnit() {
        return fltgRbtRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRateRstFrqcyUnit(CompareRateBasis2 value) {
        this.fltgRbtRateRstFrqcyUnit = value;
        return this;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber2 }
     *     
     */
    public CompareNumber2 getFltgRbtRateRstFrqcyVal() {
        return fltgRbtRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber2 }
     *     
     */
    public LoanMatchingCriteria6 setFltgRbtRateRstFrqcyVal(CompareNumber2 value) {
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
    public LoanMatchingCriteria6 setRbtRateBsisPtSprd(CompareNumber2 value) {
        this.rbtRateBsisPtSprd = value;
        return this;
    }

    /**
     * Gets the value of the adjstdRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public ComparePercentageRate2 getAdjstdRate() {
        return adjstdRate;
    }

    /**
     * Sets the value of the adjstdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public LoanMatchingCriteria6 setAdjstdRate(ComparePercentageRate2 value) {
        this.adjstdRate = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntRateDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getAdjstmntRateDt() {
        return adjstmntRateDt;
    }

    /**
     * Sets the value of the adjstmntRateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public LoanMatchingCriteria6 setAdjstmntRateDt(CompareDate2 value) {
        this.adjstmntRateDt = value;
        return this;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public ComparePercentageRate2 getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate2 }
     *     
     */
    public LoanMatchingCriteria6 setLndgFee(ComparePercentageRate2 value) {
        this.lndgFee = value;
        return this;
    }

    /**
     * Gets the value of the outsdngLn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getOutsdngLn() {
        return outsdngLn;
    }

    /**
     * Sets the value of the outsdngLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public LoanMatchingCriteria6 setOutsdngLn(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.outsdngLn = value;
        return this;
    }

    /**
     * Gets the value of the shrtMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount2 getShrtMktVal() {
        return shrtMktVal;
    }

    /**
     * Sets the value of the shrtMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount2 }
     *     
     */
    public LoanMatchingCriteria6 setShrtMktVal(CompareActiveOrHistoricCurrencyAndAmount2 value) {
        this.shrtMktVal = value;
        return this;
    }

    /**
     * Gets the value of the lvlTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReportingLevelType2 }
     *     
     */
    public CompareReportingLevelType2 getLvlTp() {
        return lvlTp;
    }

    /**
     * Sets the value of the lvlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReportingLevelType2 }
     *     
     */
    public LoanMatchingCriteria6 setLvlTp(CompareReportingLevelType2 value) {
        this.lvlTp = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure2 }
     *     
     */
    public CompareUnitOfMeasure2 getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure2 }
     *     
     */
    public LoanMatchingCriteria6 setUnitOfMeasr(CompareUnitOfMeasure2 value) {
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

}
