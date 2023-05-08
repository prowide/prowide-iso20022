
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Execution of a redemption order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionExecution6", propOrder = {
    "ordrRef",
    "clntRef",
    "dealRef",
    "ordrTp",
    "finInstrmDtls",
    "subAcctForHldg",
    "unitsNb",
    "rndg",
    "netAmt",
    "hldgsRedRate",
    "grssAmt",
    "tradDtTm",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "prtlyExctdInd",
    "dealgPricDtls",
    "inftvPricDtls",
    "bestExctn",
    "cumDvddInd",
    "intrmPrftAmt",
    "fxDtls",
    "incmPref",
    "grp1Or2Units",
    "chrgGnlDtls",
    "stffClntBrkdwn",
    "comssnGnlDtls",
    "taxGnlDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "cshSttlmDtls",
    "nonStdSttlmInf",
    "prtlSttlmOfUnits",
    "prtlSttlmOfCsh",
    "prtlRedWhldgAmt",
    "finAdvc",
    "ngtdTrad",
    "lateRpt",
    "rltdPtyDtls",
    "equlstn"
})
public class RedemptionExecution6 {

    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrTp")
    protected List<FundOrderType3> ordrTp;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument10 finInstrmDtls;
    @XmlElement(name = "SubAcctForHldg")
    protected SubAccount1 subAcctForHldg;
    @XmlElement(name = "UnitsNb", required = true)
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "HldgsRedRate")
    protected BigDecimal hldgsRedRate;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "SttlmAmt", required = true)
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
    @XmlElement(name = "PrtlyExctdInd")
    protected boolean prtlyExctdInd;
    @XmlElement(name = "DealgPricDtls", required = true)
    protected UnitPrice10 dealgPricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice10> inftvPricDtls;
    @XmlElement(name = "BestExctn")
    @XmlSchemaType(name = "string")
    protected BestExecution1Code bestExctn;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss1Choice intrmPrftAmt;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms7> fxDtls;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnitCode grp1Or2Units;
    @XmlElement(name = "ChrgGnlDtls")
    protected TotalCharges3 chrgGnlDtls;
    @XmlElement(name = "StffClntBrkdwn")
    protected List<InvestmentFundsOrderBreakdown1> stffClntBrkdwn;
    @XmlElement(name = "ComssnGnlDtls")
    protected TotalCommissions3 comssnGnlDtls;
    @XmlElement(name = "TaxGnlDtls")
    protected TotalTaxes3 taxGnlDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters4 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction22 cshSttlmDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "PrtlSttlmOfUnits")
    protected BigDecimal prtlSttlmOfUnits;
    @XmlElement(name = "PrtlSttlmOfCsh")
    protected BigDecimal prtlSttlmOfCsh;
    @XmlElement(name = "PrtlRedWhldgAmt")
    protected CurrencyAndAmount prtlRedWhldgAmt;
    @XmlElement(name = "FinAdvc")
    @XmlSchemaType(name = "string")
    protected FinancialAdvice1Code finAdvc;
    @XmlElement(name = "NgtdTrad")
    @XmlSchemaType(name = "string")
    protected NegotiatedTrade1Code ngtdTrad;
    @XmlElement(name = "LateRpt")
    @XmlSchemaType(name = "string")
    protected LateReport1Code lateRpt;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary9> rltdPtyDtls;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundOrderType3 }
     * 
     * 
     * @return
     *     The value of the ordrTp property.
     */
    public List<FundOrderType3> getOrdrTp() {
        if (ordrTp == null) {
            ordrTp = new ArrayList<>();
        }
        return this.ordrTp;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public FinancialInstrument10 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public RedemptionExecution6 setFinInstrmDtls(FinancialInstrument10 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the subAcctForHldg property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount1 }
     *     
     */
    public SubAccount1 getSubAcctForHldg() {
        return subAcctForHldg;
    }

    /**
     * Sets the value of the subAcctForHldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount1 }
     *     
     */
    public RedemptionExecution6 setSubAcctForHldg(SubAccount1 value) {
        this.subAcctForHldg = value;
        return this;
    }

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public RedemptionExecution6 setUnitsNb(FinancialInstrumentQuantity1 value) {
        this.unitsNb = value;
        return this;
    }

    /**
     * Gets the value of the rndg property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RoundingDirection2Code getRndg() {
        return rndg;
    }

    /**
     * Sets the value of the rndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RedemptionExecution6 setRndg(RoundingDirection2Code value) {
        this.rndg = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RedemptionExecution6 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the hldgsRedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsRedRate() {
        return hldgsRedRate;
    }

    /**
     * Sets the value of the hldgsRedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RedemptionExecution6 setHldgsRedRate(BigDecimal value) {
        this.hldgsRedRate = value;
        return this;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RedemptionExecution6 setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
        return this;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RedemptionExecution6 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RedemptionExecution6 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setCshSttlmDt(Calendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public RedemptionExecution6 setSttlmMtd(DeliveryReceiptType2Code value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the prtlyExctdInd property.
     * 
     */
    public boolean isPrtlyExctdInd() {
        return prtlyExctdInd;
    }

    /**
     * Sets the value of the prtlyExctdInd property.
     * 
     */
    public RedemptionExecution6 setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
        return this;
    }

    /**
     * Gets the value of the dealgPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice10 }
     *     
     */
    public UnitPrice10 getDealgPricDtls() {
        return dealgPricDtls;
    }

    /**
     * Sets the value of the dealgPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice10 }
     *     
     */
    public RedemptionExecution6 setDealgPricDtls(UnitPrice10 value) {
        this.dealgPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the inftvPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inftvPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInftvPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice10 }
     * 
     * 
     * @return
     *     The value of the inftvPricDtls property.
     */
    public List<UnitPrice10> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<>();
        }
        return this.inftvPricDtls;
    }

    /**
     * Gets the value of the bestExctn property.
     * 
     * @return
     *     possible object is
     *     {@link BestExecution1Code }
     *     
     */
    public BestExecution1Code getBestExctn() {
        return bestExctn;
    }

    /**
     * Sets the value of the bestExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestExecution1Code }
     *     
     */
    public RedemptionExecution6 setBestExctn(BestExecution1Code value) {
        this.bestExctn = value;
        return this;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public RedemptionExecution6 setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmPrftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLoss1Choice }
     *     
     */
    public ProfitAndLoss1Choice getIntrmPrftAmt() {
        return intrmPrftAmt;
    }

    /**
     * Sets the value of the intrmPrftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLoss1Choice }
     *     
     */
    public RedemptionExecution6 setIntrmPrftAmt(ProfitAndLoss1Choice value) {
        this.intrmPrftAmt = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms7 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms7> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public RedemptionExecution6 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnitCode }
     *     
     */
    public UKTaxGroupUnitCode getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnitCode }
     *     
     */
    public RedemptionExecution6 setGrp1Or2Units(UKTaxGroupUnitCode value) {
        this.grp1Or2Units = value;
        return this;
    }

    /**
     * Gets the value of the chrgGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges3 }
     *     
     */
    public TotalCharges3 getChrgGnlDtls() {
        return chrgGnlDtls;
    }

    /**
     * Sets the value of the chrgGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges3 }
     *     
     */
    public RedemptionExecution6 setChrgGnlDtls(TotalCharges3 value) {
        this.chrgGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the stffClntBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stffClntBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStffClntBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundsOrderBreakdown1 }
     * 
     * 
     * @return
     *     The value of the stffClntBrkdwn property.
     */
    public List<InvestmentFundsOrderBreakdown1> getStffClntBrkdwn() {
        if (stffClntBrkdwn == null) {
            stffClntBrkdwn = new ArrayList<>();
        }
        return this.stffClntBrkdwn;
    }

    /**
     * Gets the value of the comssnGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCommissions3 }
     *     
     */
    public TotalCommissions3 getComssnGnlDtls() {
        return comssnGnlDtls;
    }

    /**
     * Sets the value of the comssnGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCommissions3 }
     *     
     */
    public RedemptionExecution6 setComssnGnlDtls(TotalCommissions3 value) {
        this.comssnGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the taxGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaxes3 }
     *     
     */
    public TotalTaxes3 getTaxGnlDtls() {
        return taxGnlDtls;
    }

    /**
     * Sets the value of the taxGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaxes3 }
     *     
     */
    public RedemptionExecution6 setTaxGnlDtls(TotalTaxes3 value) {
        this.taxGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters4 }
     *     
     */
    public FundSettlementParameters4 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters4 }
     *     
     */
    public RedemptionExecution6 setSttlmAndCtdyDtls(FundSettlementParameters4 value) {
        this.sttlmAndCtdyDtls = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryInd property.
     * 
     */
    public boolean isPhysDlvryInd() {
        return physDlvryInd;
    }

    /**
     * Sets the value of the physDlvryInd property.
     * 
     */
    public RedemptionExecution6 setPhysDlvryInd(boolean value) {
        this.physDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public DeliveryParameters3 getPhysDlvryDtls() {
        return physDlvryDtls;
    }

    /**
     * Sets the value of the physDlvryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public RedemptionExecution6 setPhysDlvryDtls(DeliveryParameters3 value) {
        this.physDlvryDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction22 }
     *     
     */
    public PaymentTransaction22 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction22 }
     *     
     */
    public RedemptionExecution6 setCshSttlmDtls(PaymentTransaction22 value) {
        this.cshSttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionExecution6 setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlmOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlSttlmOfUnits() {
        return prtlSttlmOfUnits;
    }

    /**
     * Sets the value of the prtlSttlmOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RedemptionExecution6 setPrtlSttlmOfUnits(BigDecimal value) {
        this.prtlSttlmOfUnits = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlmOfCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlSttlmOfCsh() {
        return prtlSttlmOfCsh;
    }

    /**
     * Sets the value of the prtlSttlmOfCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RedemptionExecution6 setPrtlSttlmOfCsh(BigDecimal value) {
        this.prtlSttlmOfCsh = value;
        return this;
    }

    /**
     * Gets the value of the prtlRedWhldgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPrtlRedWhldgAmt() {
        return prtlRedWhldgAmt;
    }

    /**
     * Sets the value of the prtlRedWhldgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public RedemptionExecution6 setPrtlRedWhldgAmt(CurrencyAndAmount value) {
        this.prtlRedWhldgAmt = value;
        return this;
    }

    /**
     * Gets the value of the finAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public FinancialAdvice1Code getFinAdvc() {
        return finAdvc;
    }

    /**
     * Sets the value of the finAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public RedemptionExecution6 setFinAdvc(FinancialAdvice1Code value) {
        this.finAdvc = value;
        return this;
    }

    /**
     * Gets the value of the ngtdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public NegotiatedTrade1Code getNgtdTrad() {
        return ngtdTrad;
    }

    /**
     * Sets the value of the ngtdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public RedemptionExecution6 setNgtdTrad(NegotiatedTrade1Code value) {
        this.ngtdTrad = value;
        return this;
    }

    /**
     * Gets the value of the lateRpt property.
     * 
     * @return
     *     possible object is
     *     {@link LateReport1Code }
     *     
     */
    public LateReport1Code getLateRpt() {
        return lateRpt;
    }

    /**
     * Sets the value of the lateRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateReport1Code }
     *     
     */
    public RedemptionExecution6 setLateRpt(LateReport1Code value) {
        this.lateRpt = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary9 }
     * 
     * 
     * @return
     *     The value of the rltdPtyDtls property.
     */
    public List<Intermediary9> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<>();
        }
        return this.rltdPtyDtls;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Equalisation1 }
     *     
     */
    public Equalisation1 getEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equalisation1 }
     *     
     */
    public RedemptionExecution6 setEqulstn(Equalisation1 value) {
        this.equlstn = value;
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
     * Adds a new item to the ordrTp list.
     * @see #getOrdrTp()
     * 
     */
    public RedemptionExecution6 addOrdrTp(FundOrderType3 ordrTp) {
        getOrdrTp().add(ordrTp);
        return this;
    }

    /**
     * Adds a new item to the inftvPricDtls list.
     * @see #getInftvPricDtls()
     * 
     */
    public RedemptionExecution6 addInftvPricDtls(UnitPrice10 inftvPricDtls) {
        getInftvPricDtls().add(inftvPricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public RedemptionExecution6 addFXDtls(ForeignExchangeTerms7 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the stffClntBrkdwn list.
     * @see #getStffClntBrkdwn()
     * 
     */
    public RedemptionExecution6 addStffClntBrkdwn(InvestmentFundsOrderBreakdown1 stffClntBrkdwn) {
        getStffClntBrkdwn().add(stffClntBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public RedemptionExecution6 addRltdPtyDtls(Intermediary9 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

}
