
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Execution of a subscription order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionExecution13", propOrder = {
    "ordrRef",
    "clntRef",
    "dealRef",
    "ordrTp",
    "finInstrmDtls",
    "subAcctForHldg",
    "unitsNb",
    "rndg",
    "netAmt",
    "grssAmt",
    "tradDtTm",
    "dealgPricDtls",
    "inftvPricDtls",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "prtlyExctdInd",
    "bestExctn",
    "cumDvddInd",
    "intrmPrftAmt",
    "fxDtls",
    "incmPref",
    "lttrInttRef",
    "acmltnRghtRef",
    "txOvrhd",
    "inftvTaxDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "rfnd",
    "sbcptIntrst",
    "cshSttlmDtls",
    "nonStdSttlmInf",
    "prtlSttlmOfUnits",
    "prtlSttlmOfCsh",
    "stffClntBrkdwn",
    "finAdvc",
    "ngtdTrad",
    "lateRpt",
    "rltdPtyDtls",
    "equlstn",
    "srcOfCsh",
    "cstmrCndctClssfctn",
    "txChanlTp",
    "sgntrTp",
    "ordrWvrDtls"
})
public class SubscriptionExecution13 {

    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrTp")
    protected List<FundOrderType4Choice> ordrTp;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument57 finInstrmDtls;
    @XmlElement(name = "SubAcctForHldg")
    protected SubAccount6 subAcctForHldg;
    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "DealgPricDtls", required = true)
    protected UnitPrice22 dealgPricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice22> inftvPricDtls;
    @XmlElement(name = "SttlmAmt", required = true)
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
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
    @XmlElement(name = "LttrInttRef")
    protected String lttrInttRef;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "TxOvrhd")
    protected TotalFeesAndTaxes40 txOvrhd;
    @XmlElement(name = "InftvTaxDtls")
    protected InformativeTax1 inftvTaxDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters12 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "Rfnd")
    protected ActiveCurrencyAndAmount rfnd;
    @XmlElement(name = "SbcptIntrst")
    protected ActiveCurrencyAndAmount sbcptIntrst;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction70 cshSttlmDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "PrtlSttlmOfUnits")
    protected BigDecimal prtlSttlmOfUnits;
    @XmlElement(name = "PrtlSttlmOfCsh")
    protected BigDecimal prtlSttlmOfCsh;
    @XmlElement(name = "StffClntBrkdwn")
    protected List<InvestmentFundsOrderBreakdown2> stffClntBrkdwn;
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
    @XmlElement(name = "SrcOfCsh")
    protected List<SourceOfCash1Choice> srcOfCsh;
    @XmlElement(name = "CstmrCndctClssfctn")
    protected CustomerConductClassification1Choice cstmrCndctClssfctn;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "SgntrTp")
    protected SignatureType1Choice sgntrTp;
    @XmlElement(name = "OrdrWvrDtls")
    protected OrderWaiver1 ordrWvrDtls;

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
    public SubscriptionExecution13 setOrdrRef(String value) {
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
    public SubscriptionExecution13 setClntRef(String value) {
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
    public SubscriptionExecution13 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrTp property.
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
     */
    public List<FundOrderType4Choice> getOrdrTp() {
        if (ordrTp == null) {
            ordrTp = new ArrayList<FundOrderType4Choice>();
        }
        return this.ordrTp;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public SubscriptionExecution13 setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the subAcctForHldg property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount6 }
     *     
     */
    public SubAccount6 getSubAcctForHldg() {
        return subAcctForHldg;
    }

    /**
     * Sets the value of the subAcctForHldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount6 }
     *     
     */
    public SubscriptionExecution13 setSubAcctForHldg(SubAccount6 value) {
        this.subAcctForHldg = value;
        return this;
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
    public SubscriptionExecution13 setUnitsNb(BigDecimal value) {
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
    public SubscriptionExecution13 setRndg(RoundingDirection2Code value) {
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
    public SubscriptionExecution13 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
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
    public SubscriptionExecution13 setGrssAmt(ActiveCurrencyAndAmount value) {
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
    public SubscriptionExecution13 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
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
    public SubscriptionExecution13 setDealgPricDtls(UnitPrice22 value) {
        this.dealgPricDtls = value;
        return this;
    }

    /**
     * Gets the value of the inftvPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inftvPricDtls property.
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
     */
    public List<UnitPrice22> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<UnitPrice22>();
        }
        return this.inftvPricDtls;
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
    public SubscriptionExecution13 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SubscriptionExecution13 setCshSttlmDt(XMLGregorianCalendar value) {
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
    public SubscriptionExecution13 setSttlmMtd(DeliveryReceiptType2Code value) {
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
    public SubscriptionExecution13 setPrtlyExctdInd(boolean value) {
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
    public SubscriptionExecution13 setBestExctn(BestExecution1Code value) {
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
    public SubscriptionExecution13 setCumDvddInd(boolean value) {
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
    public SubscriptionExecution13 setIntrmPrftAmt(ProfitAndLoss2Choice value) {
        this.intrmPrftAmt = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDtls property.
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
     */
    public List<ForeignExchangeTerms33> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms33>();
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
    public SubscriptionExecution13 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the lttrInttRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrInttRef() {
        return lttrInttRef;
    }

    /**
     * Sets the value of the lttrInttRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution13 setLttrInttRef(String value) {
        this.lttrInttRef = value;
        return this;
    }

    /**
     * Gets the value of the acmltnRghtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcmltnRghtRef() {
        return acmltnRghtRef;
    }

    /**
     * Sets the value of the acmltnRghtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionExecution13 setAcmltnRghtRef(String value) {
        this.acmltnRghtRef = value;
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
    public SubscriptionExecution13 setTxOvrhd(TotalFeesAndTaxes40 value) {
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
    public SubscriptionExecution13 setInftvTaxDtls(InformativeTax1 value) {
        this.inftvTaxDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public FundSettlementParameters12 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public SubscriptionExecution13 setSttlmAndCtdyDtls(FundSettlementParameters12 value) {
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
    public SubscriptionExecution13 setPhysDlvryInd(boolean value) {
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
    public SubscriptionExecution13 setPhysDlvryDtls(DeliveryParameters3 value) {
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
    public SubscriptionExecution13 setReqdSttlmCcy(String value) {
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
    public SubscriptionExecution13 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the rfnd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRfnd() {
        return rfnd;
    }

    /**
     * Sets the value of the rfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionExecution13 setRfnd(ActiveCurrencyAndAmount value) {
        this.rfnd = value;
        return this;
    }

    /**
     * Gets the value of the sbcptIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSbcptIntrst() {
        return sbcptIntrst;
    }

    /**
     * Sets the value of the sbcptIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SubscriptionExecution13 setSbcptIntrst(ActiveCurrencyAndAmount value) {
        this.sbcptIntrst = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction70 }
     *     
     */
    public PaymentTransaction70 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction70 }
     *     
     */
    public SubscriptionExecution13 setCshSttlmDtls(PaymentTransaction70 value) {
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
    public SubscriptionExecution13 setNonStdSttlmInf(String value) {
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
    public SubscriptionExecution13 setPrtlSttlmOfUnits(BigDecimal value) {
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
    public SubscriptionExecution13 setPrtlSttlmOfCsh(BigDecimal value) {
        this.prtlSttlmOfCsh = value;
        return this;
    }

    /**
     * Gets the value of the stffClntBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stffClntBrkdwn property.
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
     */
    public List<InvestmentFundsOrderBreakdown2> getStffClntBrkdwn() {
        if (stffClntBrkdwn == null) {
            stffClntBrkdwn = new ArrayList<InvestmentFundsOrderBreakdown2>();
        }
        return this.stffClntBrkdwn;
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
    public SubscriptionExecution13 setFinAdvc(FinancialAdvice1Code value) {
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
    public SubscriptionExecution13 setNgtdTrad(NegotiatedTrade1Code value) {
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
    public SubscriptionExecution13 setLateRpt(LateReport1Code value) {
        this.lateRpt = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPtyDtls property.
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
     */
    public List<Intermediary39> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<Intermediary39>();
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
    public SubscriptionExecution13 setEqulstn(Equalisation1 value) {
        this.equlstn = value;
        return this;
    }

    /**
     * Gets the value of the srcOfCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srcOfCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcOfCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceOfCash1Choice }
     * 
     * 
     */
    public List<SourceOfCash1Choice> getSrcOfCsh() {
        if (srcOfCsh == null) {
            srcOfCsh = new ArrayList<SourceOfCash1Choice>();
        }
        return this.srcOfCsh;
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
    public SubscriptionExecution13 setCstmrCndctClssfctn(CustomerConductClassification1Choice value) {
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
    public SubscriptionExecution13 setTxChanlTp(TransactionChannelType1Choice value) {
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
    public SubscriptionExecution13 setSgntrTp(SignatureType1Choice value) {
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
    public SubscriptionExecution13 setOrdrWvrDtls(OrderWaiver1 value) {
        this.ordrWvrDtls = value;
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
    public SubscriptionExecution13 addOrdrTp(FundOrderType4Choice ordrTp) {
        getOrdrTp().add(ordrTp);
        return this;
    }

    /**
     * Adds a new item to the inftvPricDtls list.
     * @see #getInftvPricDtls()
     * 
     */
    public SubscriptionExecution13 addInftvPricDtls(UnitPrice22 inftvPricDtls) {
        getInftvPricDtls().add(inftvPricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public SubscriptionExecution13 addFXDtls(ForeignExchangeTerms33 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the stffClntBrkdwn list.
     * @see #getStffClntBrkdwn()
     * 
     */
    public SubscriptionExecution13 addStffClntBrkdwn(InvestmentFundsOrderBreakdown2 stffClntBrkdwn) {
        getStffClntBrkdwn().add(stffClntBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public SubscriptionExecution13 addRltdPtyDtls(Intermediary39 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

    /**
     * Adds a new item to the srcOfCsh list.
     * @see #getSrcOfCsh()
     * 
     */
    public SubscriptionExecution13 addSrcOfCsh(SourceOfCash1Choice srcOfCsh) {
        getSrcOfCsh().add(srcOfCsh);
        return this;
    }

}
