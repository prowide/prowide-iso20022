
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
@XmlType(name = "RedemptionExecution16", propOrder = {
    "ordrRef",
    "clntRef",
    "dealRef",
    "ordrTp",
    "bnfcryDtls",
    "unitsNb",
    "rndg",
    "netAmt",
    "invstmtAcctDtls",
    "hldgsRedRate",
    "grssAmt",
    "tradDtTm",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "dealgPricDtls",
    "inftvPricDtls",
    "prtlyExctdInd",
    "bestExctn",
    "cumDvddInd",
    "intrmPrftAmt",
    "fxDtls",
    "incmPref",
    "grp1Or2Units",
    "txOvrhd",
    "inftvTaxDtls",
    "stffClntBrkdwn",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "cshSttlmDtls",
    "nonStdSttlmInf",
    "prtlSttlmOfUnits",
    "prtlSttlmOfCsh",
    "prtlRedWhldgAmt",
    "finAdvc",
    "ngtdTrad",
    "lateRpt",
    "rltdPtyDtls",
    "equlstn",
    "cstmrCndctClssfctn",
    "txChanlTp",
    "sgntrTp",
    "ordrWvrDtls",
    "gtgOrHldBckDtls"
})
public class RedemptionExecution16 {

    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrTp")
    protected List<FundOrderType4Choice> ordrTp;
    @XmlElement(name = "BnfcryDtls")
    protected List<IndividualPerson32> bnfcryDtls;
    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount58 invstmtAcctDtls;
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
    protected LocalDate cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
    @XmlElement(name = "DealgPricDtls", required = true)
    protected UnitPrice22 dealgPricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice22> inftvPricDtls;
    @XmlElement(name = "PrtlyExctdInd")
    protected boolean prtlyExctdInd;
    @XmlElement(name = "BestExctn")
    @XmlSchemaType(name = "string")
    protected BestExecution1Code bestExctn;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss2Choice intrmPrftAmt;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms33> fxDtls;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnit1Code grp1Or2Units;
    @XmlElement(name = "TxOvrhd")
    protected TotalFeesAndTaxes40 txOvrhd;
    @XmlElement(name = "InftvTaxDtls")
    protected InformativeTax1 inftvTaxDtls;
    @XmlElement(name = "StffClntBrkdwn")
    protected List<InvestmentFundsOrderBreakdown2> stffClntBrkdwn;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters11 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction72 cshSttlmDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "PrtlSttlmOfUnits")
    protected BigDecimal prtlSttlmOfUnits;
    @XmlElement(name = "PrtlSttlmOfCsh")
    protected BigDecimal prtlSttlmOfCsh;
    @XmlElement(name = "PrtlRedWhldgAmt")
    protected ActiveCurrencyAndAmount prtlRedWhldgAmt;
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
    protected List<Intermediary39> rltdPtyDtls;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;
    @XmlElement(name = "CstmrCndctClssfctn")
    protected CustomerConductClassification1Choice cstmrCndctClssfctn;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "SgntrTp")
    protected SignatureType1Choice sgntrTp;
    @XmlElement(name = "OrdrWvrDtls")
    protected OrderWaiver1 ordrWvrDtls;
    @XmlElement(name = "GtgOrHldBckDtls")
    protected HoldBackInformation2 gtgOrHldBckDtls;

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
    public RedemptionExecution16 setOrdrRef(String value) {
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
    public RedemptionExecution16 setClntRef(String value) {
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
    public RedemptionExecution16 setDealRef(String value) {
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
     * {@link FundOrderType4Choice }
     * 
     * 
     * @return
     *     The value of the ordrTp property.
     */
    public List<FundOrderType4Choice> getOrdrTp() {
        if (ordrTp == null) {
            ordrTp = new ArrayList<>();
        }
        return this.ordrTp;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson32 }
     * 
     * 
     * @return
     *     The value of the bnfcryDtls property.
     */
    public List<IndividualPerson32> getBnfcryDtls() {
        if (bnfcryDtls == null) {
            bnfcryDtls = new ArrayList<>();
        }
        return this.bnfcryDtls;
    }

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RedemptionExecution16 setUnitsNb(BigDecimal value) {
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
    public RedemptionExecution16 setRndg(RoundingDirection2Code value) {
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
    public RedemptionExecution16 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public RedemptionExecution16 setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
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
    public RedemptionExecution16 setHldgsRedRate(BigDecimal value) {
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
    public RedemptionExecution16 setGrssAmt(ActiveCurrencyAndAmount value) {
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
    public RedemptionExecution16 setTradDtTm(DateAndDateTimeChoice value) {
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
    public RedemptionExecution16 setSttlmAmt(ActiveCurrencyAndAmount value) {
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
    public LocalDate getCshSttlmDt() {
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
    public RedemptionExecution16 setCshSttlmDt(LocalDate value) {
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
    public RedemptionExecution16 setSttlmMtd(DeliveryReceiptType2Code value) {
        this.sttlmMtd = value;
        return this;
    }

    /**
     * Gets the value of the dealgPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice22 }
     *     
     */
    public UnitPrice22 getDealgPricDtls() {
        return dealgPricDtls;
    }

    /**
     * Sets the value of the dealgPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice22 }
     *     
     */
    public RedemptionExecution16 setDealgPricDtls(UnitPrice22 value) {
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
     * {@link UnitPrice22 }
     * 
     * 
     * @return
     *     The value of the inftvPricDtls property.
     */
    public List<UnitPrice22> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<>();
        }
        return this.inftvPricDtls;
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
    public RedemptionExecution16 setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
        return this;
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
    public RedemptionExecution16 setBestExctn(BestExecution1Code value) {
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
    public RedemptionExecution16 setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
        return this;
    }

    /**
     * Gets the value of the intrmPrftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public ProfitAndLoss2Choice getIntrmPrftAmt() {
        return intrmPrftAmt;
    }

    /**
     * Sets the value of the intrmPrftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public RedemptionExecution16 setIntrmPrftAmt(ProfitAndLoss2Choice value) {
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
     * {@link ForeignExchangeTerms33 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms33> getFXDtls() {
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
    public RedemptionExecution16 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public UKTaxGroupUnit1Code getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public RedemptionExecution16 setGrp1Or2Units(UKTaxGroupUnit1Code value) {
        this.grp1Or2Units = value;
        return this;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public TotalFeesAndTaxes40 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public RedemptionExecution16 setTxOvrhd(TotalFeesAndTaxes40 value) {
        this.txOvrhd = value;
        return this;
    }

    /**
     * Gets the value of the inftvTaxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InformativeTax1 }
     *     
     */
    public InformativeTax1 getInftvTaxDtls() {
        return inftvTaxDtls;
    }

    /**
     * Sets the value of the inftvTaxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformativeTax1 }
     *     
     */
    public RedemptionExecution16 setInftvTaxDtls(InformativeTax1 value) {
        this.inftvTaxDtls = value;
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
     * {@link InvestmentFundsOrderBreakdown2 }
     * 
     * 
     * @return
     *     The value of the stffClntBrkdwn property.
     */
    public List<InvestmentFundsOrderBreakdown2> getStffClntBrkdwn() {
        if (stffClntBrkdwn == null) {
            stffClntBrkdwn = new ArrayList<>();
        }
        return this.stffClntBrkdwn;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters11 }
     *     
     */
    public FundSettlementParameters11 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters11 }
     *     
     */
    public RedemptionExecution16 setSttlmAndCtdyDtls(FundSettlementParameters11 value) {
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
    public RedemptionExecution16 setPhysDlvryInd(boolean value) {
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
    public RedemptionExecution16 setPhysDlvryDtls(DeliveryParameters3 value) {
        this.physDlvryDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction72 }
     *     
     */
    public PaymentTransaction72 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction72 }
     *     
     */
    public RedemptionExecution16 setCshSttlmDtls(PaymentTransaction72 value) {
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
    public RedemptionExecution16 setNonStdSttlmInf(String value) {
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
    public RedemptionExecution16 setPrtlSttlmOfUnits(BigDecimal value) {
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
    public RedemptionExecution16 setPrtlSttlmOfCsh(BigDecimal value) {
        this.prtlSttlmOfCsh = value;
        return this;
    }

    /**
     * Gets the value of the prtlRedWhldgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrtlRedWhldgAmt() {
        return prtlRedWhldgAmt;
    }

    /**
     * Sets the value of the prtlRedWhldgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RedemptionExecution16 setPrtlRedWhldgAmt(ActiveCurrencyAndAmount value) {
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
    public RedemptionExecution16 setFinAdvc(FinancialAdvice1Code value) {
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
    public RedemptionExecution16 setNgtdTrad(NegotiatedTrade1Code value) {
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
    public RedemptionExecution16 setLateRpt(LateReport1Code value) {
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
     * {@link Intermediary39 }
     * 
     * 
     * @return
     *     The value of the rltdPtyDtls property.
     */
    public List<Intermediary39> getRltdPtyDtls() {
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
    public RedemptionExecution16 setEqulstn(Equalisation1 value) {
        this.equlstn = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCndctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public CustomerConductClassification1Choice getCstmrCndctClssfctn() {
        return cstmrCndctClssfctn;
    }

    /**
     * Sets the value of the cstmrCndctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public RedemptionExecution16 setCstmrCndctClssfctn(CustomerConductClassification1Choice value) {
        this.cstmrCndctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the txChanlTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public TransactionChannelType1Choice getTxChanlTp() {
        return txChanlTp;
    }

    /**
     * Sets the value of the txChanlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public RedemptionExecution16 setTxChanlTp(TransactionChannelType1Choice value) {
        this.txChanlTp = value;
        return this;
    }

    /**
     * Gets the value of the sgntrTp property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType1Choice }
     *     
     */
    public SignatureType1Choice getSgntrTp() {
        return sgntrTp;
    }

    /**
     * Sets the value of the sgntrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType1Choice }
     *     
     */
    public RedemptionExecution16 setSgntrTp(SignatureType1Choice value) {
        this.sgntrTp = value;
        return this;
    }

    /**
     * Gets the value of the ordrWvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderWaiver1 }
     *     
     */
    public OrderWaiver1 getOrdrWvrDtls() {
        return ordrWvrDtls;
    }

    /**
     * Sets the value of the ordrWvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderWaiver1 }
     *     
     */
    public RedemptionExecution16 setOrdrWvrDtls(OrderWaiver1 value) {
        this.ordrWvrDtls = value;
        return this;
    }

    /**
     * Gets the value of the gtgOrHldBckDtls property.
     * 
     * @return
     *     possible object is
     *     {@link HoldBackInformation2 }
     *     
     */
    public HoldBackInformation2 getGtgOrHldBckDtls() {
        return gtgOrHldBckDtls;
    }

    /**
     * Sets the value of the gtgOrHldBckDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldBackInformation2 }
     *     
     */
    public RedemptionExecution16 setGtgOrHldBckDtls(HoldBackInformation2 value) {
        this.gtgOrHldBckDtls = value;
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
    public RedemptionExecution16 addOrdrTp(FundOrderType4Choice ordrTp) {
        getOrdrTp().add(ordrTp);
        return this;
    }

    /**
     * Adds a new item to the bnfcryDtls list.
     * @see #getBnfcryDtls()
     * 
     */
    public RedemptionExecution16 addBnfcryDtls(IndividualPerson32 bnfcryDtls) {
        getBnfcryDtls().add(bnfcryDtls);
        return this;
    }

    /**
     * Adds a new item to the inftvPricDtls list.
     * @see #getInftvPricDtls()
     * 
     */
    public RedemptionExecution16 addInftvPricDtls(UnitPrice22 inftvPricDtls) {
        getInftvPricDtls().add(inftvPricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public RedemptionExecution16 addFXDtls(ForeignExchangeTerms33 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the stffClntBrkdwn list.
     * @see #getStffClntBrkdwn()
     * 
     */
    public RedemptionExecution16 addStffClntBrkdwn(InvestmentFundsOrderBreakdown2 stffClntBrkdwn) {
        getStffClntBrkdwn().add(stffClntBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public RedemptionExecution16 addRltdPtyDtls(Intermediary39 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

}
