
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "SubscriptionExecution4", propOrder = {
    "ordrRef",
    "dealRef",
    "ordrTp",
    "finInstrmDtls",
    "unitsNb",
    "rndg",
    "netAmt",
    "grssAmt",
    "tradDtTm",
    "pricDtls",
    "prtlyExctdInd",
    "cumDvddInd",
    "intrmPrftAmt",
    "fxDtls",
    "incmPref",
    "lttrInttRef",
    "acmltnRghtRef",
    "chrgGnlDtls",
    "comssnGnlDtls",
    "taxGnlDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "rfnd",
    "sbcptIntrst",
    "cshSttlmDtls"
})
public class SubscriptionExecution4 {

    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrTp")
    protected List<FundOrderType1> ordrTp;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument6 finInstrmDtls;
    @XmlElement(name = "UnitsNb", required = true)
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "NetAmt", required = true)
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "PricDtls", required = true)
    protected UnitPrice5 pricDtls;
    @XmlElement(name = "PrtlyExctdInd")
    protected boolean prtlyExctdInd;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss1Choice intrmPrftAmt;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms4> fxDtls;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "LttrInttRef")
    protected String lttrInttRef;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "ChrgGnlDtls")
    protected TotalCharges2 chrgGnlDtls;
    @XmlElement(name = "ComssnGnlDtls")
    protected TotalCommissions2 comssnGnlDtls;
    @XmlElement(name = "TaxGnlDtls")
    protected TotalTaxes2 taxGnlDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters3 sttlmAndCtdyDtls;
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
    protected PaymentTransaction13 cshSttlmDtls;

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
    public SubscriptionExecution4 setOrdrRef(String value) {
        this.ordrRef = value;
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
    public SubscriptionExecution4 setDealRef(String value) {
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
     * {@link FundOrderType1 }
     * 
     * 
     */
    public List<FundOrderType1> getOrdrTp() {
        if (ordrTp == null) {
            ordrTp = new ArrayList<FundOrderType1>();
        }
        return this.ordrTp;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public FinancialInstrument6 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public SubscriptionExecution4 setFinInstrmDtls(FinancialInstrument6 value) {
        this.finInstrmDtls = value;
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
    public SubscriptionExecution4 setUnitsNb(FinancialInstrumentQuantity1 value) {
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
    public SubscriptionExecution4 setRndg(RoundingDirection2Code value) {
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
    public SubscriptionExecution4 setNetAmt(ActiveCurrencyAndAmount value) {
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
    public SubscriptionExecution4 setGrssAmt(ActiveCurrencyAndAmount value) {
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
    public SubscriptionExecution4 setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice5 }
     *     
     */
    public UnitPrice5 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice5 }
     *     
     */
    public SubscriptionExecution4 setPricDtls(UnitPrice5 value) {
        this.pricDtls = value;
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
    public SubscriptionExecution4 setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
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
    public SubscriptionExecution4 setCumDvddInd(boolean value) {
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
    public SubscriptionExecution4 setIntrmPrftAmt(ProfitAndLoss1Choice value) {
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
     * {@link ForeignExchangeTerms4 }
     * 
     * 
     */
    public List<ForeignExchangeTerms4> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms4>();
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
    public SubscriptionExecution4 setIncmPref(IncomePreference1Code value) {
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
    public SubscriptionExecution4 setLttrInttRef(String value) {
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
    public SubscriptionExecution4 setAcmltnRghtRef(String value) {
        this.acmltnRghtRef = value;
        return this;
    }

    /**
     * Gets the value of the chrgGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges2 }
     *     
     */
    public TotalCharges2 getChrgGnlDtls() {
        return chrgGnlDtls;
    }

    /**
     * Sets the value of the chrgGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges2 }
     *     
     */
    public SubscriptionExecution4 setChrgGnlDtls(TotalCharges2 value) {
        this.chrgGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the comssnGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCommissions2 }
     *     
     */
    public TotalCommissions2 getComssnGnlDtls() {
        return comssnGnlDtls;
    }

    /**
     * Sets the value of the comssnGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCommissions2 }
     *     
     */
    public SubscriptionExecution4 setComssnGnlDtls(TotalCommissions2 value) {
        this.comssnGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the taxGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaxes2 }
     *     
     */
    public TotalTaxes2 getTaxGnlDtls() {
        return taxGnlDtls;
    }

    /**
     * Sets the value of the taxGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaxes2 }
     *     
     */
    public SubscriptionExecution4 setTaxGnlDtls(TotalTaxes2 value) {
        this.taxGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters3 }
     *     
     */
    public FundSettlementParameters3 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters3 }
     *     
     */
    public SubscriptionExecution4 setSttlmAndCtdyDtls(FundSettlementParameters3 value) {
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
    public SubscriptionExecution4 setPhysDlvryInd(boolean value) {
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
    public SubscriptionExecution4 setPhysDlvryDtls(DeliveryParameters3 value) {
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
    public SubscriptionExecution4 setReqdSttlmCcy(String value) {
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
    public SubscriptionExecution4 setReqdNAVCcy(String value) {
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
    public SubscriptionExecution4 setRfnd(ActiveCurrencyAndAmount value) {
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
    public SubscriptionExecution4 setSbcptIntrst(ActiveCurrencyAndAmount value) {
        this.sbcptIntrst = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction13 }
     *     
     */
    public PaymentTransaction13 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction13 }
     *     
     */
    public SubscriptionExecution4 setCshSttlmDtls(PaymentTransaction13 value) {
        this.cshSttlmDtls = value;
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
    public SubscriptionExecution4 addOrdrTp(FundOrderType1 ordrTp) {
        getOrdrTp().add(ordrTp);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public SubscriptionExecution4 addFXDtls(ForeignExchangeTerms4 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

}
